class Main 
{
  public static void main(String[] args)
  {
    SuperHero s1 = new SuperHero("SuperMan", "Lazers", "Joker", 99.9, 'S', true, 100);
    //decrease health method:  v1.decreaseHealth(50);
    //increase health method:  v1.increaseHealth(50);
    System.out.println("The SuperHero: ");
    System.out.println("Name: " + s1.getName());
    System.out.println("Super Power: " + s1.getSuperPower());
    System.out.println("Weakness: " + s1.getWeakness());
    System.out.println("Strength: " + s1.getStrength());
    System.out.println("Can Fly: " + s1.getCanFly());
    System.out.println("Cape Letter: " + s1.getCapeLetter());
    System.out.println("Health: " + s1.getHealth());
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("The Villian: ");
    Villain v1 = new Villain("Trickster", "Manipulation", "Jokers", 10.5, 45);
    //decrease health method:  v1.decreaseHealth(50);
    //increase health method:  v1.increaseHealth(50);
    System.out.println("Name: " + v1.getName());
    System.out.println("Evil Power: " + v1.getEvilPower());
    System.out.println("Weakness: " + v1.getWeakness());
    System.out.println("Strength: " + v1.getStrength());
    System.out.println("Health: " + v1.getHealth());
  }
}