public class AnimalManager {
    public void displayAnimalDetails(Animal animal){
        System.out.println("The animal "+ animal.Makesound());
        animal.Sleep();
        if (animal instanceof Flyable) {
            ((Flyable) animal).fly();
        }
        System.out.println(animal.getinfo());
    }
}
