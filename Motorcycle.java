public class Motorcycle implements Actions {

    private String name;
    private String model;
    private String color;

    public Motorcycle(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println(name + " " + model + " is moving :: the color of the motorcycle is " + color);

    }

    @Override
    public void stop() {
        System.out.println(name + " " + model + " stop");

    }

    @Override
    public String toString() {
        return "Motorcycle [color=" + color + ", model=" + model + ", name=" + name + "]";
    }

    

}
