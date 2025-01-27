import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Тауар: " + name + ", категория:" + category + ", цена:" + price;
    }
}

public class ShopManager {
    private static List<Product> productList = new ArrayList<>();

    public static void addProduct(String name, String category, double price) {
        productList.add(new Product(name, category, price));
        System.out.println("Тауар косылды: " + name);
    }

    public static void updateProductPrice(String name, double newPrice) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.setPrice(newPrice);
                System.out.println("Багасы жанартылды: " + product);
                return;
            }
        }
        System.out.println("Тауар табылмады: ");
    }    

    public static void viewAllProducts() {
        if (productList.isEmpty()) {
            System.out.println("Тызымде тауарлар жок.");
            return;
        }
        System.out.println("Барлык тауарлыр:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void searchyCategory(String category) {
        System.out.println("Санат бойынша ыздеу натижесы (" + category + ")");
        boolean found = false;
        for (Product product : productList) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Бул санатта тауарлар табылмады.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nМазыр:");
            System.out.println("1. Тауар косу");
            System.out.println("2. Баганы озгерту");
            System.out.println("3. Барлык тауарларды кору");
            System.out.println("4. Санат бойынша ыздеу");
            System.out.println("5. Шыгу");
            System.out.println("Танаданыз: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Тауар атауы: ");
                    String name = scanner.nextLine();
                    System.out.print("Санаты: ");
                    String category = scanner.nextLine();
                    System.out.print("Багасы: ");
                    double price = scanner.nextDouble();
                    addProduct(name, category, price);
                    break;
                case 2:
                    System.out.print("Багасын згертетын тауар атауы: ");
                    String productName = scanner.nextLine();
                    System.out.print("Жана багасы: ");
                    double newPrice = scanner.nextDouble();
                    updateProductPrice(productName, newPrice);
                    break;
                case 3:
                    viewAllProducts();
                    break;
                case 4:
                    System.out.print("Санатты танданыз: ");
                    String searchCategory = scanner.nextLine();
                    searchyCategory(searchCategory);
                    break;
                case 5:
                    System.out.println("Багдарлама аякталды.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Дұрыс тандау енгізіңіз.");            
            }
        }
    }
}