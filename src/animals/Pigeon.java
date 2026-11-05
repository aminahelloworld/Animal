package animals;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Rock dove";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "Grey");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the pigeon eats crumbs and grains in the city square.");
    }

    @Override
    public String getVoice() {
        return "Coo-coo!";
    }

    public void deliverMessage() {
        System.out.println(getName() + " carries a message to its home loft.");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        String base = super.toString();
        return base.substring(0, base.length() - 1) + ", species='" + species + "'}";
    }
}
