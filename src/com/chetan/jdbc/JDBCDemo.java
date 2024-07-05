package com.chetan.jdbc;
import java.sql.*;


public class JDBCDemo {
    public static void main(String args[])
            throws SQLException, ClassNotFoundException
    {

        // 1. Load the driver class
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company","root","Chetan@1999");

        String query = "insert into employee values(110, 'dummy','abc',2500000)";

        //String query = "select * from employee";

        // 2. Obtain a statement
        Statement st = con.createStatement();

        // 3. Execute the query
          int count = st.executeUpdate(query);

       // ResultSet resultSet = st.executeQuery(query);


//        while (resultSet.next()) {
//            // Process each row
//            int id = resultSet.getInt("empid");
//            String firstName = resultSet.getString("empFname");
//            String lastName = resultSet.getString("empLname");
//            String country = resultSet.getString("country");
//            System.out.println(id+" "+firstName+" "+lastName+" "+country);
//            // Process retrieved data
//        }

//        System.out.println(
//                "number of rows affected by this query= "
//                        + count);

        // Closing the connection as per the
        // requirement with connection is completed
        con.close();
    }
}
