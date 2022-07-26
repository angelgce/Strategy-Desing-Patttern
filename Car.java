public class Car implements Actions {

    private String name;
    private String model;
    private int doors;

    public Car(String name, String model, int doors) {
        this.name = name;
        this.model = model;
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println(name + " " + model + " is moving :: car has " + doors + " doors");

    }

    @Override
    public void stop() {
        System.out.println(name + " " + model + " stop completly");

    }

    @Override
    public String toString() {
        return "Car [doors=" + doors + ", model=" + model + ", name=" + name + "]";
    }

    
}
