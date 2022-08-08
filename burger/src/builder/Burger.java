package builder;

public class Burger {
  protected Integer size;
  protected Boolean bread = false;
  protected Boolean cheese = false;
  protected Boolean sauce = false;
  protected Boolean pepperoni = false;
  protected Boolean onion = false;
  protected Boolean lettuce = false;
  protected Boolean tomato = false;
  protected Boolean pickle = false;

  public Burger(BurgerBuilder builder) {
    this.size = builder.size;
    this.bread = builder.bread;
    this.cheese = builder.cheese;
    this.sauce = builder.sauce;
    this.pepperoni = builder.pepperoni;
    this.onion = builder.onion;
    this.lettuce = builder.lettuce;
    this.tomato = builder.tomato;
    this.pickle = builder.pickle;  
  }
  
}
