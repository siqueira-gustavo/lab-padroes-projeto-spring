package builder;

public class BurgerBuilder {
  public Integer size;
  public Boolean bread = false;
  public Boolean cheese = false;
  public Boolean sauce = false;
  public Boolean pepperoni = false;
  public Boolean onion = false;
  public Boolean lettuce = false;
  public Boolean tomato = false;
  public Boolean pickle = false;
  
  public BurgerBuilder(Integer size) {
    this.size = size;
  }

  public BurgerBuilder addBread() {
    this.bread = true;
    return this;
  }

  public BurgerBuilder addCheese() {
    this.cheese = true;
    return this;
  }

  public BurgerBuilder addSauce() {
    this.sauce = true;
    return this;
  }

  public BurgerBuilder addPepperoni() {
    this.pepperoni = true;
    return this;
  }

  public BurgerBuilder addOnion() {
    this.onion = true;
    return this;
  }

  public BurgerBuilder addLettuce() {
    this.lettuce = true;
    return this;
  }

  public BurgerBuilder addTomato() {
    this.tomato = true;
    return this;
  }

  public Integer getSize() {
    return size;
  }

  public Boolean getBread() {
    return bread;
  }

  public Boolean getCheese() {
    return cheese;
  }

  public Boolean getSauce() {
    return sauce;
  }

  public Boolean getPepperoni() {
    return pepperoni;
  }

  public Boolean getOnion() {
    return onion;
  }

  public Boolean getLettuce() {
    return lettuce;
  }

  public Boolean getTomato() {
    return tomato;
  }

  public Boolean getPickle() {
    return pickle;
  }

  public BurgerBuilder addPickle() {
    this.pickle = true;
    return this;
  }

  public Burger build() {
    return new Burger(this);
  }

  public Object getBurger() {
    return null;
  }

}