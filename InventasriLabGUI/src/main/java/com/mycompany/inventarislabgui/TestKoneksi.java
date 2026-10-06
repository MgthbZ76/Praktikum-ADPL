/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.inventarislabgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class TestKoneksi {
    public static void main(String[] args) {
        // Gunakan protokol jdbc:mysql bukan http://
        String url = "jdbc:mysql://localhost:3306/db_investaris_lab?sslMode=DISABLED&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "Admin123"; // Sesuaikan jika MySQL Anda tidak memakai password (kosongkan: "")
        
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Koneksi ke Database " + conn.getCatalog() + " Berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi ke Database gagal: " + e.getMessage());
        }
    }
}