/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengelolaanKRS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static final String url = "jdbc:mysql://localhost:3306/pengelolaankrs";
    private static final String user = "root";
    private static final String password = "";

    static {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("Success loading driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver: " + e.getMessage());
        }
    }

    public static Connection koneksiDB() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connection successful");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
        }
        return connection;
    }
}
