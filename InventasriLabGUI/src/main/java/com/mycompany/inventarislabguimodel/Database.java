package com.mycompany.inventarislabguimodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/db_investaris_lab?sslMode=DISABLED&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Ubah jika MySQL Anda menggunakan password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}