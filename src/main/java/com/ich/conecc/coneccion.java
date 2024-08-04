package com.ich.conecc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class coneccion {
	private static final String URL = "jdbc:mariadb://localhost:3306/Colegio";
    private static final String USER = "root";
    private static final String PASSWORD = "Racumcity58688586";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
	

}
