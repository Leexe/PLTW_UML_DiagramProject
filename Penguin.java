/*
 * Activity 4.9.2
 */
public class Penguin extends Animal
{
    public Penguin()
    {
    }
    public Penguin (String foods, boolean nocturnal, double aveLifeSpan)
    {
        super(foods, nocturnal, aveLifeSpan);
    }
    public void fish()
    {
        System.out.println("The Penguin fishes for its food");
    }
    public void squeak()
    {
        System.out.println("The Penguin squeaks");
    }
    public void speak()
    {
        squeak();
    }

}