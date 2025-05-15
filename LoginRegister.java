package Projects;

import java.sql.*;
import java.util.Scanner;

public class LoginRegister {

    // Returns true if login successful, else false
    public static boolean login(Scanner sc) {
        System.out.print("Enter your username: ");
        String username = sc.nextLine().trim();

        System.out.print("Enter your password (8 characters): ");
        String password = sc.nextLine().trim();

        if (password.length() != 8) {
            System.out.println("Password must be exactly 8 characters.");
            return false;
        }

        try (Connection conn = DBconnection.connectDB()) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("Hey " + username + ", you have logged in successfully.");
                return true;
            } else {
                System.out.println("Login failed. Invalid credentials.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Registers a new user
    public static void register(Scanner sc) {
        System.out.print("Enter a username to register: ");
        String username = sc.nextLine().trim();

        System.out.print("Set your password (8 characters): ");
        String password = sc.nextLine().trim();

        if (password.length() != 8) {
            System.out.println("Password must be exactly 8 characters.");
            return;
        }

        try (Connection conn = DBconnection.connectDB()) {
            // Check if username already exists
            PreparedStatement checkStmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?");
            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                System.out.println("Username already exists. Try another.");
                return;
            }

            // Insert new user
            PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");
            insertStmt.setString(1, username);
            insertStmt.setString(2, password);
            insertStmt.executeUpdate();

            System.out.println("Welcome " + username + ", your account has been created.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
