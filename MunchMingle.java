package Projects;

import java.util.Map;
import java.util.Scanner;

public class MunchMingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to MunchMingle!");
        System.out.print("Do you have an account? (yes/no): ");
        String haveAccount = sc.nextLine().trim().toLowerCase();

        boolean loggedIn = false;

        if (haveAccount.equals("yes")) {
            loggedIn = LoginRegister.login(sc);
        } else if (haveAccount.equals("no")) {
            LoginRegister.register(sc);
            System.out.println("Please login to continue.");
            loggedIn = LoginRegister.login(sc);
        } else {
            System.out.println("Invalid input. Exiting.");
            sc.close();
            return;
        }

        if (loggedIn) {
            // Display the menu
            Maindishes.displayAllCategories();

            // Take order from user
            Map<Integer, Integer> order = Maindishes.takeOrder(sc);

            // If user ordered something, generate bill
            if (!order.isEmpty()) {
                Maindishes.generateBill(order);
            } else {
                System.out.println("No items ordered.");
            }
        } else {
            System.out.println("Login failed. Exiting.");
        }

        sc.close();
    }
}
