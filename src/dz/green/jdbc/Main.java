
// IMPORTANT: Add the Oracle-JDBC driver  "ojdbc7.jar" to the project


package dz.green.jdbc;

import dz.green.model.Admin;

import java.sql.*;

public class Main {
	public static void main(String[] args) {
        
        // conx JDBC
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "****";   // Put your oracle user
        String password = "****";  // Put your oracle password

        // inserst in table Clients


        try (Connection connection = DriverManager.getConnection(url, user, password){

            //data
            Admin admin = new Admin(1,"Adil","Chekati","adil.chekati@univ-constantine2.dz",1993-08-09,"M2STIC24", "0774182454","all");

            AdminDAO adminDAO = new AdminDAO(connection);
            adminDAO.create(admin);
            System.out.println("Données insérées avec succés.");

        }  catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getErrorCode() + " - " + e.getMessage());
            e.printStackTrace();
        }
    }
}

	


