public class Dolphin extends Animal {
    // Private properties
    private String color;
    private int swimmingSpeed;

    // Default constructor calling the parent
    public Dolphin() {
        super("Dolphin");
    }

    // Public Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // Implementing the abstract method from the Eat interface
    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin has finished eating.");
    }
}