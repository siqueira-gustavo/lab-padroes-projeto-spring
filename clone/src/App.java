import prototype.Sheep;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! This is an example of Prototype Pattern.\n");
        Sheep originalSheep = new Sheep("Molly", "Mountain Sheep");
        System.out.println("Original Sheep: "
                + originalSheep.getName()
                + ", "
                + originalSheep.getCategory());

        Sheep clonedSheep = originalSheep;
        clonedSheep.setName("Dolly");
        System.out.println("Cloned Sheep: "
                + clonedSheep.getName()
                + ", "
                + clonedSheep.getCategory());
    }
}
