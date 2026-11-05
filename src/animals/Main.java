package animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[9];

        animals[0] = new Mammal();
        animals[1] = new Bird("Kesha", 2, 0.4, "Green");
        animals[2] = new Fish("Nemo", "saltwater");
        animals[3] = new Dog("Rex", 5, 22.5, "Brown", "Labrador");
        animals[4] = new Dog("Bobik", "Husky");
        animals[5] = new Pigeon();
        animals[6] = new Pigeon("Gulya", "Carrier pigeon");
        animals[7] = new Blowfish("Puffy", 3, 1.2, "saltwater", true);
        animals[8] = new Blowfish();

        System.out.println("=== All animals ===");
        for (Animal a : animals) {
            System.out.println(a);
            a.eat();
            System.out.println("Voice: " + a.getVoice());
            System.out.println();
        }

        System.out.println("=== Specific methods ===");

        ((Mammal) animals[0]).nurseYoung();
        ((Bird) animals[1]).fly();
        ((Fish) animals[2]).swim();
        ((Dog) animals[3]).fetch();
        ((Dog) animals[4]).fetch();
        ((Pigeon) animals[6]).deliverMessage();
        ((Blowfish) animals[7]).inflate();

        ((Dog) animals[3]).nurseYoung();

        System.out.println("\n=== Setters ===");
        animals[4].setAge(2);
        animals[4].setWeight(18.0);
        ((Dog) animals[4]).setFurColor("White-grey");
        System.out.println(animals[4]);

        System.out.println("\n=== instanceof check ===");
        for (Animal a : animals) {
            if (a instanceof Bird) {
                ((Bird) a).fly();
            }
        }
    }
}
