import java.util.ArrayList;
/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void hearTheAnimal(Animal animal)
  {
    animal.speak();
  }
  public static void main(String[] args)
  { 
    Animal elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    Animal tiger = new Tiger("meat", true, 17.0);
    Animal giraffe = new Giraffe("leaves", false,25.0);
    Animal gorilla = new Gorilla();
    Animal hippo = new Hippo("Grass", true, 45.0);
    Animal penguin = new Penguin();
    Animal owl1 = new Owl();
    Animal owl2 = new Owl("mice,insects", true, 4.0);
    
    hearTheAnimal(elephant);
    hearTheAnimal(tiger);
    hearTheAnimal(giraffe);
    hearTheAnimal(gorilla);
    hearTheAnimal(hippo);
    hearTheAnimal(penguin);
    hearTheAnimal(owl1);
    hearTheAnimal(owl2);


    // ArrayList<Animal> Zoo = new ArrayList<Animal>();
    // Zoo.add(new Elephant("leaves, grasses, roots", false, 60.0));
    // Zoo.add(new Tiger("meat", true, 17.0));
    // Zoo.add(new Giraffe("leaves", false,25.0));
    // Zoo.add(new Gorilla());
    // Zoo.add(new Giraffe("leaves", false,25.0));
    // Zoo.add(new Hippo("Grass", true, 45.0));
    // Zoo.add(new Penguin());
    // Zoo.add(new Owl());
    // Zoo.add(new Owl("mice,insects", true, 4.0));

    // for (Animal animal : Zoo)
    // {
    //   animal.speak();
    // }

    // Activity 4.9.3
    // Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    // elephant.trumpet();
    // elephant.eat();
    // elephant.isNocturnal();

    // Tiger tiger = new Tiger("meat", true, 17.0);
    // tiger.swim();
    // tiger.huntAlone();
    // tiger.growl();
    // tiger.isNocturnal();

    // Gorilla gorilla = new Gorilla();
    // gorilla.eat();

    // Giraffe giraffe = new Giraffe("leaves", false,25.0);
    // giraffe.eat();
    
    // Hippo hippo = new Hippo("Grass", true, 45.0);
    // hippo.eat();

    // Penguin penguin = new Penguin();
    // penguin.fish();

    // Owl owl = new Owl();
    // owl.hunt();

    // Owl owl2 = new Owl("mice,insects", true, 4.0);
    // owl2.eat();

    // Elephant elephantNoArgs = new Elephant();
    // Tiger tigerNoArgs = new Tiger();
  }
}