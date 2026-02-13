CREATE DATABASE Helado2025;
GO

USE Helado2025;
GO

CREATE TABLE categorias (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE helados (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    sabor VARCHAR(100) NOT NULL,
    precio DECIMAL(8,2) NOT NULL,
    stock INT NOT NULL,
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);

CREATE TABLE clientes (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    telefono VARCHAR(20)
);

CREATE TABLE empleados (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    cargo VARCHAR(50),
    telefono VARCHAR(20)
);

CREATE TABLE ventas (
    id INT IDENTITY(1,1) PRIMARY KEY,
    fecha DATETIME,
    total DECIMAL(10,2),
    cliente_id INT,
    empleado_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id),
    FOREIGN KEY (empleado_id) REFERENCES empleados(id)
);

CREATE TABLE detalle_ventas (
    id INT IDENTITY(1,1) PRIMARY KEY,
    venta_id INT,
    helado_id INT,
    cantidad INT,
    precio_unitario DECIMAL(8,2),
    FOREIGN KEY (venta_id) REFERENCES ventas(id),
    FOREIGN KEY (helado_id) REFERENCES helados(id)
);