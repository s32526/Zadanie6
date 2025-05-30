public class MainAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal wolf = new Wolf();
        Animal lion = new Lion();

        dog.makeNoise();
        wolf.makeNoise();
        cat.makeNoise();
        lion.makeNoise();

        ((Canidae) dog).roam();
        ((Canidae) wolf).roam();
        ((Felidae) cat).roam();
        ((Felidae) lion).roam();
    }
}
