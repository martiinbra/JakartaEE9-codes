package org.mmartinez.apiservlet.webapp.headers.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJdbc {
    static private String url = "jdbc:mysql://localhost:3306/java_curso?serverTimeZone=America/Lima";
    //componentes-> jdbc:: la bd (mysql) el host (localhost) el puerto (3306) el nombre de la bd (java_curso)
    //parametro de la zona horaria(servertimezone)
    static private String username = "root";
    static private String password = "sasa";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
