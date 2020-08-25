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
	<h2 class="text-center">Lista Reservas</h2>

	<table class="table table-hover table-sm text-center">
		<thead class="thead-dark">
		<tr>
			<th>Paciente</th>
			<th>Doctor(a)</th>
			<th>Especialidad</th>
			<th>Fecha</th>
			<th>Hora</th>
			<th>Acción</th>
		</tr>
		</thead>		
		<tbody>
		<c:forEach items="${reservas}" var="r">
			<tr>
				<td>
					<c:out value="${r.getNombre()}" />
					<c:out value="${r.getApellido()}" />
					<br>
					<c:out value="${r.getRutpaciente()}" />
				</td>
				<td>
					<c:out value="${r.getNombred()}" />
					<c:out value="${r.getApellidod()}" />
				</td>
				<td>
					<c:out value="${r.getDescripcion()}" />
				</td>
				<td>
					<c:out value="${r.getFecha()}" />
				</td>
				<td>
					<c:out value="${r.getHoradesde().getHours()}" />:<c:out value="${r.getHoradesde().getMinutes()}" />
				</td>
				<td>
					<a href="detalle/${r.getIdagenda()}">editar</a>
					|
					borrar
					<c:out value="${r.getIdagenda()}" />
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	
</body>
</html>