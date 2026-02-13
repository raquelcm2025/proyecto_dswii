package com.app.Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class BDConexion {
	//MÉTODOS STATIC PARA NO INSTANCIAR EN TODO MOMENTO ESTA CLASE
	public static Connection getConexion() throws Exception{
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String cadenaConexion =
			"jdbc:sqlserver://localhost:1433;databaseName=Helado2025;encrypt=false";
		String usuarioSQL = "sa";
		String passwordSQL = "sql";
		Class.forName(driver);
		return 
			DriverManager.getConnection(cadenaConexion, usuarioSQL, passwordSQL);
	}
}
