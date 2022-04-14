/*
 * Activity 4.9.2
 */
public class Elephant extends Animal
{
    public Elephant()
    {
    }
    
    public Elephant(String foods, boolean nocturnal, double aveLifeSpan)
    {
        super(foods, nocturnal, aveLifeSpan);
        System.out.println("An Elephant has arrived!");
    }

    public void trumpet()
    {
        System.out.println("The elephant makes a trumpet noise");
    }
    public void forage()
    {
        System.out.println("The elephant looks for food");
    }
    public void speak()
    {
        trumpet();
    }
    }
