import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

    private static List<Actions> list = new ArrayList<Actions>();
    private static Scanner scanner;

    public static void main(String[] args) {

        Actions actions = null;
        scanner = new Scanner(System.in);
        int option = question();

        while (option != 4) {
            switch (option) {
                case 1:
                    scanner = new Scanner(System.in);
                    actions = new Car(getData("Car name "), getData("Car model "), getNumber("Car doors "));
                    break;
                case 2:
                    scanner = new Scanner(System.in);
                    actions = new Motorcycle(getData("Motorcycle name "),
                            getData("Motorcycle model "), getData("Motorcycle color "));
                    break;
                case 3:
                    scanner = new Scanner(System.in);
                    actions = new Airplane(getData("Airplane name: "), getData("Airplane model: "),
                            getNumber("Airplane engines: "));
                    break;
            }
            // saving data
            if (actions != null) {
                list.add(actions);
                System.out.println("---> Object saved");
            }

            // what should i do?
            option = question();
        }
        scanner.close();
        System.out.println("\nWe have " + list.size() + " Objects ");
        list.forEach(item -> System.out.println(item.toString()));

    }

    private static int question() {
        System.out.println("Hello what type of object you want to create");
        System.out.println("1: Car\n2: Motorcicle\n3: Airplane\n4: exit\n");
        int option = 0;
        try {
            option = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Input only numbers :: ");
            scanner = new Scanner(System.in);
        }
        return option;

    }

    private static String getData(String msg) {
        System.out.println(msg);
        return scanner.nextLine();

    }

    private static int getNumber(String msg) {
        System.out.println(msg);
        return scanner.nextInt();

    }

}