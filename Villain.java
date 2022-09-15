public class Villain
  {
  private String name;
  private String evilpower;
  private String weakness;
  private double strength;
  private int health;

  public Villain()
  {
    name = " ";
    evilpower = " ";
    weakness = " ";
    strength = 0.0;
    health = 0;
  }

  public Villain(String n, String ep, String w, double s, int h)
  {
    name = n;
    evilpower = ep;
    weakness = w;
    strength = s;
    health = h;
  }
  //get and set methods for all of the instance variables
  public String getName()
  {
    return name;
  }
  public void setName(String n)
  {
    name = n;
  }
  public String getEvilPower()
  {
    return evilpower;
  }
  public void setEvilPower(String ep)
  {
    evilpower = ep;
  }
  public String getWeakness()
  {
    return weakness;
  }
  public void setWeakness(String w)
  {
    weakness = w;
  }
  public double getStrength()
  {
    return strength;
  }
  public void setStrength(double s)
  {
    strength = s;
  }
  public int getHealth()
  {
    return health;
  }
  public void setHealth(int h)
  {
    health = h;
  }

  //threaten and escape methods
    public String escape()
    {
      if (health<= 50)
      {
        return("You will never catch me!"); 
      }
      else
      {
        return("You will never defeat me! Come find me if you can!");
      }
    }
    
    public String threaten()
    {
      if (health <= 50)
      {
        return("I may be weak but come at me!");
      }
      else
      {
        return("Im coming for you! You better run while you can!");
      }
    }
     



  //increase and decrease health methods
  public void decreaseHealth(int h)
  {
    health = health - h;
  } 
  public void increaseHealth(int h)
  {
    health = health + h;
  }  

    
}
