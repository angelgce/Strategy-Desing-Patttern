import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

    private static List<Actions> list = new ArrayList<Actions>();

    public static void main(String[] args) {

        Actions actions = null;
        System.out.println("Hello what type of object you want to create");
        System.out.println("1: Car\n2: Motorcicle\n3: Airplane\n4: exit\n");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        while (option != 4) {
            switch (option) {
                case 1:
                    // scanning information
                    scanner = new Scanner(System.in);
                    String name = getData(scanner, "Car name ");
                    String model = getData(scanner, "Car model ");
                    int doors = getNumber(scanner, "Car doors ");
                    // ----| creating the object | ----
                    actions = new Car(name, model, doors);
                    list.add(actions);
                    System.out.println("---> Object saved");
                    break;
                case 2:
                    // scanning information
                    scanner = new Scanner(System.in);
                    String name2 = getData(scanner, "Motorcycle name ");
                    String model2 = getData(scanner, "Motorcycle model ");
                    String color = getData(scanner, "Motorcycle color ");
                    // ----| creating the object | ----
                    actions = new Motorcycle(name2, model2, color);
                    list.add(actions);
                    System.out.println("---> Object saved");
                    break;
                case 3:
                    // scanning information
                    scanner = new Scanner(System.in);
                    String name3 = getData(scanner, "Airplane name: ");
                    String model3 = getData(scanner, "Airplane model: ");
                    int engine = getNumber(scanner, "Airplane engines: ");
                    // ----| creating the object | ----
                    actions = new Airplane(name3, model3, engine);
                    list.add(actions);
                    System.out.println("---> Object saved");
                    break;
            }

            // what should i do?
            System.out.println("\n\nHello what type of object you want to create");
            System.out.println("1: Car\n2: Motorcicle\n3: Airplane\n4: exit\n");
            scanner = new Scanner(System.in);
            option = scanner.nextInt();
        }
        scanner.close();
        System.out.println("\nWe have " + list.size() + " Objects ");
        list.forEach(item -> System.out.println(item.toString()));

    }

    private static String getData(Scanner scanner, String msg) {
        System.out.println(msg);
        return scanner.nextLine();

    }

    private static int getNumber(Scanner scanner, String msg) {
        System.out.println(msg);
        return scanner.nextInt();

    }

}