package animals;

public class Fish extends Animal {
    private String waterType;

    public Fish() {
        super();
        this.waterType = "Unknown";
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, String waterType) {
        super(name);
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the fish eats plankton and small organisms.");
    }

    @Override
    public String getVoice() {
        return "... (fish are silent)";
    }

    public void swim() {
        System.out.println(getName() + " swims using its fins.");
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public String toString() {
        return super.toString() + ", waterType='" + waterType + "'}";
    }
}
