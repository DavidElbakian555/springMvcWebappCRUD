//package com.elbakian.webapp;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Main {
//    public static void main(String[] args) {
//        String url =  "jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Minsk&useSSL=false";
//        String username = "root";
//        String password = "12345";
//        System.out.println("Connecting...");
//
//        try (Connection connection = DriverManager.getConnection(url, username, password)) {
//            System.out.println("Connection successful!");
//        } catch (SQLException e) {
//            System.out.println("Connection failed!");
//            e.printStackTrace();
//        }
//    }
//}
