/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();
    elephant.eat();
    elephant.isNocturnal();

    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();
    tiger.growl();
    tiger.isNocturnal();

    Gorilla gorilla = new Gorilla();
    gorilla.eat();

    // Elephant elephantNoArgs = new Elephant();
    // Tiger tigerNoArgs = new Tiger();
  }
}