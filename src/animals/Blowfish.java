package animals;

public class Blowfish extends Fish {
    private boolean poisonous;

    public Blowfish() {
        super();
        this.poisonous = true;
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean poisonous) {
        super(name, age, weight, waterType);
        this.poisonous = poisonous;
    }

    public Blowfish(String name, boolean poisonous) {
        super(name, "saltwater");
        this.poisonous = poisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the blowfish crushes shellfish and crustaceans with its beak-like teeth.");
    }

    @Override
    public String getVoice() {
        return "Soft grinding of teeth";
    }

    public void inflate() {
        System.out.println(getName() + " inflates like a ball to scare off predators!");
    }

    public boolean isPoisonous() { return poisonous; }
    public void setPoisonous(boolean poisonous) { this.poisonous = poisonous; }

    @Override
    public String toString() {
        String base = super.toString();
        return base.substring(0, base.length() - 1) + ", poisonous=" + poisonous + "}";
    }
}
