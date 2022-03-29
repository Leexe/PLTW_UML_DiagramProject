
/*
 * Activity 4.9.2
 */
public class Hooved extends Animal
{
  public Hooved()
  {
  }

  public Hooved (String foods, boolean nocturnal, double aveLifeSpan)
    {
        super(foods, nocturnal, aveLifeSpan);
    }
  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}