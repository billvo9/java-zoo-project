public class Tiger extends Animal {
    // Private properties
    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    // Default constructor calling the parent
    public Tiger() {
        super("Tiger");
    }

    // Public Getters and Setters
    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    // Implementing the abstract method from the Eat interface
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger has finished eating.");
    }
}