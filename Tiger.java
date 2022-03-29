/*
 * Activity 4.9.2
 */
public class Tiger extends Feline 
{
    public Tiger()
    {
    }
    public Tiger (String foods, boolean nocturnal, double aveLifeSpan)
    {
        super(foods, nocturnal, aveLifeSpan);
    }
    public void huntInAPack()
    {
        System.out.println("The tiger hunts in a pack");
    }
    public void swim()
    {
        System.out.println("The tiger swims");
    }
    public void huntAlone()
    {
        System.out.println("The tiger hunts alone");
    }
}
