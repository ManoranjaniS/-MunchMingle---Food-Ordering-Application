package Projects;

import java.util.*;

public class Maindishes {

    // Maps to store menu and prices by id
    public static Map<Integer, String> menu = new HashMap<>();
    public static Map<Integer, Integer> prices = new HashMap<>();

    // Category-wise mapping (category name -> list of menu item IDs)
    public static Map<String, List<Integer>> categories = new LinkedHashMap<>();

    static {
        // Categories with IDs
        categories.put("South Indian", Arrays.asList(1, 3, 4, 5, 6, 36, 37, 38, 39, 40, 41, 42, 43, 44));
        categories.put("North Indian", Arrays.asList(2, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80));
        categories.put("Juices & Beverages", Arrays.asList(45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 61, 62, 63, 64, 65));
        categories.put("Desserts", Arrays.asList(56, 57, 58, 59, 60));
        categories.put("Kerala", Arrays.asList(81, 82, 83, 84, 85, 86, 87, 88, 89, 90));
        categories.put("Telugu", Arrays.asList(91, 92, 93, 94, 95));
        categories.put("Karnataka", Arrays.asList(96, 97, 98, 99, 100));
        categories.put("Rice & Fried Rice", Arrays.asList(7, 8, 9, 10));
        categories.put("Momos & Snacks", Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21));
        categories.put("Pizza & Pasta", Arrays.asList(22, 23, 24, 25, 26));
        categories.put("Gravies & Curries", Arrays.asList(27, 28, 29, 30, 31));
        categories.put("Soups", Arrays.asList(32, 33, 34, 35));
        categories.put("Chicken & Egg Specials", Arrays.asList(66, 67, 68, 69, 70));
    }

    static {
        // Fill menu and prices

        // South Indian
        menu.put(1, "South Indian Meal");            prices.put(1, 150);
        menu.put(3, "Curd Rice");                    prices.put(3, 40);
        menu.put(4, "Lemon Rice");                   prices.put(4, 40);
        menu.put(5, "Tomato Rice");                  prices.put(5, 45);
        menu.put(6, "Sambar Rice");                  prices.put(6, 50);
        menu.put(36, "Idly (3 pieces)");             prices.put(36, 25);
        menu.put(37, "Dosa");                        prices.put(37, 15);
        menu.put(38, "Set Dosa");                    prices.put(38, 35);
        menu.put(39, "Masala Dosa");                 prices.put(39, 45);
        menu.put(40, "Pongal");                      prices.put(40, 40);
        menu.put(41, "Chapathi");                    prices.put(41, 30);
        menu.put(42, "Parotta");                     prices.put(42, 8);
        menu.put(43, "Poori Masala");                prices.put(43, 40);
        menu.put(44, "Omelette");                    prices.put(44, 25);

        // North Indian
        menu.put(2, "North Indian Meal");            prices.put(2, 170);
        menu.put(71, "Chole Bhature");               prices.put(71, 80);
        menu.put(72, "Rajma Chawal");                prices.put(72, 70);
        menu.put(73, "Aloo Paratha with Curd");      prices.put(73, 60);
        menu.put(74, "Paneer Tikka");                prices.put(74, 100);
        menu.put(75, "Butter Naan");                 prices.put(75, 25);
        menu.put(76, "Kadai Paneer");                prices.put(76, 90);
        menu.put(77, "Dal Makhani");                 prices.put(77, 85);
        menu.put(78, "Lassi (Sweet)");               prices.put(78, 35);
        menu.put(79, "Lassi (Salted)");              prices.put(79, 30);
        menu.put(80, "Tandoori Roti");               prices.put(80, 20);

        // Juices & Beverages
        menu.put(45, "Orange Juice");                prices.put(45, 35);
        menu.put(46, "Apple Juice");                 prices.put(46, 40);
        menu.put(47, "Mango Juice");                 prices.put(47, 40);
        menu.put(48, "Watermelon Juice");            prices.put(48, 30);
        menu.put(49, "Pineapple Juice");             prices.put(49, 35);
        menu.put(50, "Grape Juice");                 prices.put(50, 30);
        menu.put(51, "Chocolate Milkshake");         prices.put(51, 55);
        menu.put(52, "Strawberry Milkshake");        prices.put(52, 55);
        menu.put(53, "Vanilla Milkshake");           prices.put(53, 50);
        menu.put(54, "Oreo Milkshake");              prices.put(54, 65);
        menu.put(55, "Banana Milkshake");            prices.put(55, 45);
        menu.put(61, "Masala Tea");                  prices.put(61, 20);
        menu.put(62, "Filter Coffee");               prices.put(62, 25);
        menu.put(63, "Green Tea");                   prices.put(63, 30);
        menu.put(64, "Black Coffee");                prices.put(64, 30);
        menu.put(65, "Hot Chocolate");               prices.put(65, 40);

        // Desserts
        menu.put(56, "Chocolate Cake");              prices.put(56, 65);
        menu.put(57, "Ice Cream (2 scoops)");        prices.put(57, 50);
        menu.put(58, "Gulab Jamun");                 prices.put(58, 40);
        menu.put(59, "Rasgulla");                    prices.put(59, 45);
        menu.put(60, "Brownie with Ice Cream");      prices.put(60, 90);

        // Kerala
        menu.put(81, "Appam with Stew");             prices.put(81, 60);
        menu.put(82, "Kerala Parotta with Curry");   prices.put(82, 70);
        menu.put(83, "Avial");                        prices.put(83, 55);
        menu.put(84, "Puttu and Kadala Curry");      prices.put(84, 60);
        menu.put(85, "Fish Moilee");                  prices.put(85, 120);
        menu.put(86, "Idiyappam with Egg Curry");    prices.put(86, 75);
        menu.put(87, "Banana Chips");                 prices.put(87, 30);
        menu.put(88, "Payasam");                      prices.put(88, 45);
        menu.put(89, "Thalassery Biryani");           prices.put(89, 130);
        menu.put(90, "Ela Ada (Sweet)");              prices.put(90, 35);

        // Telugu
        menu.put(91, "Pulihora (Tamarind Rice)");    prices.put(91, 45);
        menu.put(92, "Gongura Chicken");             prices.put(92, 110);
        menu.put(93, "Andhra Chicken Curry");        prices.put(93, 115);
        menu.put(94, "Pesarattu with Upma");         prices.put(94, 55);
        menu.put(95, "Mirchi Bajji");                 prices.put(95, 30);

        // Karnataka
        menu.put(96, "Bisi Bele Bath");               prices.put(96, 60);
        menu.put(97, "Ragi Mudde with Sambar");       prices.put(97, 70);
        menu.put(98, "Neer Dosa");                    prices.put(98, 40);
        menu.put(99, "Mysore Masala Dosa");           prices.put(99, 50);
        menu.put(100, "Kesari Bath");                  prices.put(100, 35);

        // Rice & Fried Rice Varieties
        menu.put(7, "Egg Fried Rice");                prices.put(7, 70);
        menu.put(8, "Veg Fried Rice");                prices.put(8, 65);
        menu.put(9, "Chicken Fried Rice");            prices.put(9, 85);
        menu.put(10, "Mushroom Fried Rice");          prices.put(10, 80);

        // Momos & Snacks
        menu.put(11, "Veg Momos");                     prices.put(11, 60);
        menu.put(12, "Chicken Momos");                 prices.put(12, 80);
        menu.put(13, "Paneer Momos");                  prices.put(13, 70);
        menu.put(14, "Cheese Momos");                  prices.put(14, 75);
        menu.put(15, "Veg Sandwich");                  prices.put(15, 40);
        menu.put(16, "Grilled Cheese Sandwich");      prices.put(16, 50);
        menu.put(17, "French Fries");                  prices.put(17, 60);
        menu.put(18, "Samosa (2 pieces)");             prices.put(18, 30);
        menu.put(19, "Spring Roll");                   prices.put(19, 45);
        menu.put(20, "Paneer Tikka Roll");             prices.put(20, 90);
        menu.put(21, "Chicken Tikka Roll");            prices.put(21, 110);

        // Pizza & Pasta
        menu.put(22, "Margherita Pizza");              prices.put(22, 150);
        menu.put(23, "Farmhouse Pizza");                prices.put(23, 180);
        menu.put(24, "Veg Pasta");                      prices.put(24, 120);
        menu.put(25, "Chicken Pasta");                  prices.put(25, 150);
        menu.put(26, "Garlic Bread");                   prices.put(26, 80);

        // Gravies & Curries
        menu.put(27, "Paneer Butter Masala");           prices.put(27, 120);
        menu.put(28, "Dal Tadka");                       prices.put(28, 90);
        menu.put(29, "Butter Chicken");                  prices.put(29, 150);
        menu.put(30, "Mutton Curry");                    prices.put(30, 180);
        menu.put(31, "Veg Korma");                       prices.put(31, 110);

        // Soups
        menu.put(32, "Tomato Soup");                     prices.put(32, 50);
        menu.put(33, "Chicken Soup");                    prices.put(33, 70);
        menu.put(34, "Mushroom Soup");                   prices.put(34, 60);
        menu.put(35, "Veg Clear Soup");                   prices.put(35, 55);

        // Chicken & Egg Specials
        menu.put(66, "Chicken 65");                      prices.put(66, 110);
        menu.put(67, "Egg Curry");                       prices.put(67, 90);
        menu.put(68, "Chicken Biryani");                 prices.put(68, 140);
        menu.put(69, "Egg Fried Rice");                   prices.put(69, 70);
        menu.put(70, "Chicken Manchurian");               prices.put(70, 130);
    }

    // Display entire menu
    public static void displayMenu() {
        System.out.println("\nComplete Menu:");
        List<Integer> sortedKeys = new ArrayList<>(menu.keySet());
        Collections.sort(sortedKeys);
        for (Integer id : sortedKeys) {
            System.out.println(id + ") " + menu.get(id) + " - ₹" + prices.get(id));
        }
    }

    // Display menu items by category
    public static void displayMenuByCategory(String category) {
        System.out.println("\nCategory: " + category);
        List<Integer> items = categories.get(category);
        if (items != null) {
            for (int id : items) {
                System.out.println(id + ") " + menu.get(id) + " - ₹" + prices.get(id));
            }
        } else {
            System.out.println("Category not found!");
        }
    }

    // Display all categories and their menu items
    public static void displayAllCategories() {
        for (String category : categories.keySet()) {
            displayMenuByCategory(category);
        }
    }

    // Get item name by id
    public static String getItemName(int id) {
        return menu.get(id);
    }

    // Get item price by id
    public static Integer getItemPrice(int id) {
        return prices.get(id);
    }

    // Take order input from user, return map of itemId -> quantity
    public static Map<Integer, Integer> takeOrder(Scanner scanner) {
        Map<Integer, Integer> order = new HashMap<>();

        System.out.println("\nEnter the item IDs you want to order. Enter 0 to finish ordering.");

        while (true) {
            System.out.print("Enter item ID (0 to finish): ");
            int itemId = scanner.nextInt();

            if (itemId == 0) break;

            if (!menu.containsKey(itemId)) {
                System.out.println("Invalid item ID. Please try again.");
                continue;
            }

            System.out.print("Enter quantity for " + menu.get(itemId) + ": ");
            int quantity = scanner.nextInt();

            if (quantity <= 0) {
                System.out.println("Quantity must be positive. Please try again.");
                continue;
            }

            order.put(itemId, order.getOrDefault(itemId, 0) + quantity);
            System.out.println(quantity + " x " + menu.get(itemId) + " added to order.");
        }

        return order;
    }

    // Generate and print bill from order map
    public static void generateBill(Map<Integer, Integer> order) {
        System.out.println("\n----- BILL -----");
        int total = 0;
        for (Map.Entry<Integer, Integer> entry : order.entrySet()) {
            int id = entry.getKey();
            int qty = entry.getValue();
            int price = prices.get(id);
            int cost = price * qty;
            System.out.printf("%-25s x %2d = ₹%d\n", menu.get(id), qty, cost);
            total += cost;
        }
        System.out.println("----------------");
        System.out.println("TOTAL: ₹" + total);
        System.out.println("----------------");
    }

    // Example main to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Food Ordering System!");

        // Show menu by categories
        displayAllCategories();

        // Take order
        Map<Integer, Integer> order = takeOrder(scanner);

        if (order.isEmpty()) {
            System.out.println("No items ordered.");
        } else {
            // Generate bill
            generateBill(order);
        }

        scanner.close();
    }
}
