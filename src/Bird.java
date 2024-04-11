public class Bird extends Animal implements Flyable{
    public String Makesound(){
        return "Bird chirps";
    }
    public String getinfo(){
        return "Yellow, faithful, small";
    }
    public void fly(){
        System.out.println("fly swiftly");
    }
}
