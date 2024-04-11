
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnimalManager manager = new AnimalManager();

        // Create Animal instances
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        // Display animal details
        manager.displayAnimalDetails(dog);
        manager.displayAnimalDetails(cat);
        manager.displayAnimalDetails(bird);

    }
}