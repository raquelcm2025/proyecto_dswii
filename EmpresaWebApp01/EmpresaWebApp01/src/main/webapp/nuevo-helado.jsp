<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Nuevo Helado</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>Agregar Nuevo Helado</h1>

    <!-- Formulario para agregar un nuevo helado -->
    <form action="NuevoHeladoServlet" method="POST">
        <fieldset>
            <legend>Detalles del Helado</legend>
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" required><br><br>
            
            <label for="sabor">Sabor:</label>
            <input type="text" id="sabor" name="sabor" required><br><br>
            
            <label for="precio">Precio:</label>
            <input type="number" id="precio" name="precio" step="0.01" required><br><br>
            
            <label for="stock">Stock:</label>
            <input type="number" id="stock" name="stock" required><br><br>
            
            <label for="categoria">Categoría ID:</label>
            <input type="number" id="categoria" name="categoria" required><br><br>

            <input type="submit" value="Agregar Helado">
        </fieldset>
    </form>

    <hr>
    <a href="helados.jsp">Ver lista de helados</a>
</body>
</html>
