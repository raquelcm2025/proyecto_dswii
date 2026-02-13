CREATE PROCEDURE USP_ListarCategorias
AS
BEGIN
    SELECT id, nombre FROM categorias
END
GO

CREATE PROCEDURE USP_InsertarCategoria
    @nombre VARCHAR(50)
AS
BEGIN
    INSERT INTO categorias(nombre)
    VALUES(@nombre)
END
GO

CREATE PROCEDURE USP_ObtenerCategoriaPorID
    @id INT
AS
BEGIN
    SELECT id, nombre
    FROM categorias
    WHERE id = @id
END
GO

CREATE PROCEDURE USP_ActualizarCategoria
    @id INT,
    @nombre VARCHAR(50)
AS
BEGIN
    UPDATE categorias
    SET nombre = @nombre
    WHERE id = @id
END
GO

CREATE PROCEDURE USP_EliminarCategoria
    @id INT
AS
BEGIN
    DELETE FROM categorias
    WHERE id = @id
END
GO

CREATE PROCEDURE USP_ListarHelados
AS
BEGIN
    SELECT id, nombre, sabor, precio, stock, categoria_id
    FROM helados
END
GO

CREATE PROCEDURE USP_InsertarHelado
    @nombre VARCHAR(100),
    @sabor VARCHAR(100),
    @precio DECIMAL(8,2),
    @stock INT,
    @categoria_id INT
AS
BEGIN
    INSERT INTO helados(nombre, sabor, precio, stock, categoria_id)
    VALUES(@nombre, @sabor, @precio, @stock, @categoria_id)
END
GO

CREATE PROCEDURE USP_ObtenerHeladoPorID
    @id INT
AS
BEGIN
    SELECT id, nombre, sabor, precio, stock, categoria_id
    FROM helados
    WHERE id = @id
END
GO

CREATE PROCEDURE USP_ActualizarHelado
    @id INT,
    @nombre VARCHAR(100),
    @sabor VARCHAR(100),
    @precio DECIMAL(8,2),
    @stock INT,
    @categoria_id INT
AS
BEGIN
    UPDATE helados
    SET nombre = @nombre,
        sabor = @sabor,
        precio = @precio,
        stock = @stock,
        categoria_id = @categoria_id
    WHERE id = @id
END
GO

CREATE PROCEDURE USP_EliminarHelado
    @id INT
AS
BEGIN
    DELETE FROM helados
    WHERE id = @id
END
GO

CREATE PROCEDURE USP_ListarClientes
AS
BEGIN
    SELECT id, nombre, telefono FROM clientes
END
GO

CREATE PROCEDURE USP_InsertarCliente
    @nombre VARCHAR(100),
    @telefono VARCHAR(20)
AS
BEGIN
    INSERT INTO clientes(nombre, telefono)
    VALUES(@nombre, @telefono)
END
GO

CREATE PROCEDURE USP_ListarEmpleados
AS
BEGIN
    SELECT id, nombre, cargo, telefono FROM empleados
END
GO

EXEC USP_ListarHelados