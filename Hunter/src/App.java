import model.Hunter;
import model.WildDog;
import model.WildDogAdapter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! This is an adapter pattern example.\n");

        WildDog wildDog = new WildDog();
        WildDogAdapter wildDogAdapter = new WildDogAdapter(wildDog);

        Hunter hunter = new Hunter();
        hunter.hunt(wildDogAdapter);
    }
}
