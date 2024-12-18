package dz.green.jdbc;

import dz.green.model.Admin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AdminDAO{

    protected Connection connection = null;

    public AdminDAO(Connection connection){
        this.connection = connection;
    }



    public boolean create(Admin admin) throws SQLException {
        String query = "INSERT INTO admin (id, firstname, lastname, email, birthdate, password, phonenumber, permissions) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, admin.getId());
            pstmt.setString(2, admin.getFirstname());
            pstmt.setString(3, admin.getLastname());
            pstmt.setString(4, admin.getEmail());
            pstmt.setDate(5, java.sql.Date.valueOf(admin.getBirthdate())); // Convert LocalDate to java.sql.Date
            pstmt.setString(6, admin.getPassword());
            pstmt.setString(7, admin.getPhoneNumber());
            pstmt.setString(8, admin.getPermissions());

            pstmt.executeUpdate();
            System.out.println("Admin record created successfully!");
        }
        return true;
    }


    public boolean delete(Admin admin) throws SQLException {
        try {
            String sql = "DELETE FROM admin WHERE id_user = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, admin.getId());

                int rowsDeleted = statement.executeUpdate();
                return rowsDeleted > 0;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }}

        public boolean update(Admin admin) {
        try {
            String sql = "UPDATE agent SET firstname=?, lastname=?, email=?, birthdate=?, password=?, phonenumber=?" +
                    "WHERE id=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, admin.getId());
                statement.setString(2, admin.getFirstname());
                statement.setString(3, admin.getLastname());
                statement.setString(4, admin.getEmail());
                statement.setString(5, admin.getPassword());
                statement.setString(6, admin.getPhoneNumber());
                statement.setInt(7, admin.getId());
                int rowsUpdated = statement.executeUpdate();
                return rowsUpdated > 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Admin find(int id) throws SQLException {
        String query = "SELECT * FROM agent WHERE id = " + id;
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            if (resultSet.next()) {
                return extractAdminFromResultSet(resultSet);
            }
        }
        return null;
    }

    public List<Admin> findAll() throws SQLException {
        List<Admin> admins = new ArrayList<>();
        String query = "SELECT * FROM admin";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                admins.add(extractAdminFromResultSet(resultSet));
            }
        }
        return admins;
    }

    private Admin extractAdminFromResultSet(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String firstName = resultSet.getString("firstname");
        String lastName = resultSet.getString("lastname");
        String email = resultSet.getString("email");
        Date birthdate = resultSet.getDate("birthdate");
        String password = resultSet.getString("password");
        String phoneNumber = resultSet.getString("phonenumber");
        String permissions = resultSet.getString("permissions");

        return new Admin(id, firstName, lastName, email, birthdate.toLocalDate(),password, phoneNumber,permissions);
    }
}
