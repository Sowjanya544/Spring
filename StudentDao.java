package com.dxc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.dxc.model.Student;


public class StudentDao {

    private static final String INSERT_ONE_Student;

    private static final String SELECT_ALL_Student;


    private static final String USER_NAME;
    private static final String PASSWORD;
    private static final String URL;


    static {
        INSERT_ONE_STUDENT = "INSERT INTO student (name, sub, id) VALUES (?, ?, ?)";
        SELECT_ALL_STUDENT = "SELECT * FROM student";

        USER_NAME = "root";
        PASSWORD = "password";

        // URL = "jdbc:mysql://server-name or server-ip-address:port/database-name";
        URL = "jdbc:mysql://localhost:3307/dxc";
    }

    public StudentDao() {

    }

    public List<Student> findAll() throws SQLException{
        List<Student> student = null;
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(SELECT_ALL_STUDENT);
        student = new ArrayList();
        while (rs.next()) {
            student.add(new student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        rs.close();
        statement.close();
        connection.close();
        return student;
    }

    public int save(Student student) throws SQLException {
        System.out.println("Saving student: " + student);

        // Load the JDBC Driver
        // Automatically done for version 8 and above
        // DriverManager.registerDriver(Driver.class);
        // Class.forName("com.mysql.cj.jdbc.Driver");

        // Get a connection to the database
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

        PreparedStatement ps = connection.prepareStatement(INSERT_ONE_STUDENT);

        ps.setString(1, book.getName());
        ps.setString(2, book.getSub());
        ps.setString(3, book.getId());

        int rows = 0;
        rows = ps.executeUpdate();

        ps.close();
        connection.close();

        return rows;

    }

} 