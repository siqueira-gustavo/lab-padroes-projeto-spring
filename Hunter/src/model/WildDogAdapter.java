package model;

import adapter.Lion;

public class WildDogAdapter implements Lion {
  private WildDog wildDog;
  
  public WildDogAdapter(WildDog wildDog) {
    this.wildDog = wildDog;
  }
  
  public void roar() {
    wildDog.bark();
  }
}
