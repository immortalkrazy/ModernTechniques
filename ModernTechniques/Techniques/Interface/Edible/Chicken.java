public class Chicken extends Animal implements Edible{
  @Override
  public String sound(){
    return "Chicken: CoCoCoooooooo";
  }
  public String howToEat(){
    return "Chicken: Fry it.........";
  }
}
