/*
 * Activity 4.9.2
 */
public class Feline extends Animal
{
    public Feline()
    {
    }
    public Feline (String foods, boolean nocturnal, double aveLifeSpan)
    {
        super(foods, nocturnal, aveLifeSpan);
    }
    public void growl()
    {
        System.out.println("The Feline Growls");
    }
}
