import builder.BurgerBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! This is an example of a builder pattern.\n");
        BurgerBuilder burger = new BurgerBuilder(12)
                .addBread()
                .addCheese()
                .addSauce()
                .addPepperoni()
                .addOnion();
                // .addLettuce()
                // .addTomato()
                // .addPickle();

        System.out.println("My Burger Order: \n"
                + "  size: \t" + burger.getSize() + " inch,\n"
                + "  bread: \t" + burger.getBread() + ",\n"
                + "  cheese: \t" + burger.getCheese() + ",\n"
                + "  sauce: \t" + burger.getSauce() + ",\n"
                + "  pepperoni: \t" + burger.getPepperoni() + ",\n"
                + "  onion: \t" + burger.getOnion() + ",\n"
                + "  lettuce: \t" + burger.getLettuce() + ",\n"
                + "  tomato: \t" + burger.getTomato() + ",\n"
                + "  pickle: \t" + burger.getPickle() + ",\n");
    }
}
