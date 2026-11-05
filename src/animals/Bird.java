package animals;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the bird pecks at seeds and insects.");
    }

    @Override
    public String getVoice() {
        return "Tweet!";
    }

    public void fly() {
        System.out.println(getName() + " spreads its wings and flies.");
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return super.toString() + ", featherColor='" + featherColor + "'}";
    }
}
