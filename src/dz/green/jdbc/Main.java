
// IMPORTANT: Add the Oracle-JDBC driver  "ojdbc7.jar" to the project


package dz.green.jdbc;

import dz.green.model.Admin;

import java.sql.*;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
        
        // conx JDBC
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "GreenDz";   // Put your oracle user
        String password = "your_password";  // Put your oracle password

        // insert in table Admins


        try (Connection connection = DriverManager.getConnection(url, user, password)){

            //Admin data
            Admin a = new Admin(1,"Adil","Chekati","adil.chekati@univ-constantine2.dz", LocalDate.of(1985, 5, 15),"M2STIC24", "0774182454","all");
            //Admin persistence
            AdminDAO adminDAO = new AdminDAO(connection);
            adminDAO.create(a);
            System.out.println("Données insérées avec succés.");

        }  catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getErrorCode() + " - " + e.getMessage());
            e.printStackTrace();
        }
    }
}

	


