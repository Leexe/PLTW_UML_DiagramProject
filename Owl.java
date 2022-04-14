/*
 * Activity 4.9.2
 */
public class Owl extends Animal
{
    public Owl()
    {
    }
    public Owl (String foods, boolean nocturnal, double aveLifeSpan)
    {
        super(foods, nocturnal, aveLifeSpan);
    }
    public void hunt()
    {
        System.out.println("The Owl hunts for its food.");
    }
    public void eat()
    {
        System.out.println("The Owl eats its food.");
    }
    public void hoot()
  {
    System.out.println("The owl hoots.");
  }
    public void speak()
  {
    hoot();
  }
}