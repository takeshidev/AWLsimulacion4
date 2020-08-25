<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simulacion 4 - TK</title>
<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
		integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
		crossorigin="anonymous">
		<link rel="stylesheet" href="<c:url value="/resources/css/estilo.css"></c:url>">
</head>
<body>
<div class="contenido">
	<h1 class="text-center">Simulación 4</h1>
	<h2 class="text-center">Reserva de Horas Médicas</h2>
	
	<p><a href="${pageContext.request.contextPath}/">Listado</a> | Reserva

	<table class="table table-hover table-sm">			
				<tr>
					<td>Nombre paciente:</td>
					<td><input type="text" name="nombre" value="${reserva.getNombre()}"></td>
				</tr>
				<tr>
					<td>Apellido paciente:</td>
					<td><input type="text" name="apellido" value="${reserva.getApellido()}"></td>
				</tr>
				<tr>
					<td>RUT paciente:</td>
					<td><input type="text" name="rut" value="${reserva.getRutpaciente()}"></td>
				</tr>
				<tr>
					<td>Especialidad:</td>
				<td>
					<select name="especialidad"	id="esp">
						<c:forEach items="${especialdiades}" var="e">
							<c:choose>
								<c:when test="${e.getDescripcion() == reserva.getDescripcion()}">
							       <option value="${e.getIdespecialidad()}" selected ><c:out value="${e.getDescripcion()}" /></option>
							    </c:when>
								<c:otherwise>
	        						    <option value="${e.getIdespecialidad()}"><c:out
										value="${e.getDescripcion()}" /></option>
								</c:otherwise>
							</c:choose>	
						</c:forEach>
				</select></td>
			</tr>
				<tr>
					<td>Doctor(a):</td>
					<td><input type="text" name="doctor" value="${reserva.getNombred()} ${reserva.getApellidod()}"></td>
				</tr>
				<tr>
					<td>Fecha:</td>
					<td><input type="date" name="fecha"  value="${reserva.getFecha()}"></td>
				</tr>
				<tr>
					<td>Hora:</td>
					<td><input type="time" name="hora" value="${reserva.getHoradesde()}"></td>
				</tr>
				<tr>
					<td></td>
					<td><hr>
					Limpiar | Reservar
					</td>
				</tr>

	</table>
</div>
</body>
</html>