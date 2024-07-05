package com.chetan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Thread.*;

public class CreateNewDatabase {
    public static void main(String[] args)throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
                "root","Chetan@1999");

       // String query1="create database carShowroom";
        String query2="use carShowroom";
      //  String query3="create table cars(carId int,carBrand varchar(20), carName varchar(20))";
       // String query4="insert into cars values(123, \"TATA\",\"Punch\")," +
              //  "(456, \"Kia\",\"Sonet\"),(789,\"Mahindra\",\"Thar\")";


        
        String query4="insert into cars values(789,\"Toyata\",\"HHH\")";

        Statement statement=connection.createStatement();

//        statement.executeUpdate(query1);
//        try {
//            sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        statement.executeUpdate(query2);
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        statement.executeUpdate(query3);
//        try {
//            sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        statement.executeUpdate(query4);
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        connection.close();

    }
}
