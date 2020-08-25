package cl.takeshi;

import java.net.URI;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import cl.takeshi.beans.Reserva;
import cl.takeshi.dao.DAOdoctores;
import cl.takeshi.dao.DAOespecialidades;
import cl.takeshi.dao.DAOreserva;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	DAOreserva reservaDAO;
	
	@Autowired
	DAOespecialidades especialidadesDAO;
	
	@Autowired
	DAOdoctores doctoresDAO;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView listadoReservas(HttpServletRequest request, ModelMap model) {
		System.out.println("lista reservas");
		
		List<Reserva> reservas = reservaDAO.listareservas();
		for (Reserva reserva : reservas) {
			//System.out.println(reserva.getHoradesde().getTime());
			//System.out.println(reserva.getHoradesde().toLocaleString());
			//System.out.println(reserva.getHoradesde().toString());
		
			Timestamp timestamp = (Timestamp) reserva.getHoradesde();
			java.util.Date date = timestamp;
			//System.out.println(date.getHours()+":"+date.getMinutes());		
		}
		model.addAttribute("reservas", reservaDAO.listareservas());	
		return new ModelAndView("lista", "model", model);
		
		}
	@RequestMapping(value="/detalle/{id}", method = RequestMethod.GET)
	public ModelAndView detalleReservas(@PathVariable int id,HttpServletRequest request, ModelMap model) {
		System.out.println("Detalle reserva: "+id);
		
		List<Reserva> reservas = reservaDAO.detalle(id);
		Reserva reserva = reservas.get(0);
		model.addAttribute("reserva", reserva);
		
		
		model.addAttribute("especialdiades", especialidadesDAO.listaespecialidades());
		model.addAttribute("doctores", doctoresDAO);
		
		
		
		return new ModelAndView("detalle", "model", model);
		
	}
	
	
	
	

}
