public class Airplane implements Actions {

    private String name;
    private String model;
    private int engines;

    public Airplane(String name, String model, int engines) {
        this.name = name;
        this.model = model;
        this.engines = engines;
    }

    @Override
    public void move() {
        System.out.println(name + " " + model + " is moving :: motorcycle use " + engines + " engines");

    }

    @Override
    public void stop() {
        System.out.println(name + " " + model + " stop all its " + engines + " engines");

    }

    @Override
    public String toString() {
        return "Airplane [engines=" + engines + ", model=" + model + ", name=" + name + "]";
    }

    
    
}
