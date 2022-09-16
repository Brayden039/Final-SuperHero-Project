public class SuperHero
  {
  private String name;
  private String superpower;
  private String weakness;
  private double strength;
  private char capeLetter;
  private boolean canFly;

  private int health;

  public SuperHero()
  {
    name = " ";
    superpower = " ";
    weakness = " ";
    strength = 0.0;
    capeLetter = ' ';
    canFly = false;
    health = 0;
  }

  public SuperHero(String n, String sp, String w, double s, char c, boolean cf, int h)
  {
    name = n;
    superpower = sp;
    weakness = w;
    strength = s;
    capeLetter = c;
    canFly = cf;
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
  public String getSuperPower()
  {
    return superpower;
  }
  public void setSuperPower(String ep)
  {
    superpower = ep;
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
  public char getCapeLetter()
  {
    return capeLetter;
  }
  public void setCapeLetter(char c)
  {
    capeLetter = c;
  }
  public boolean getCanFly()
  {
    return canFly;
  }
  public void setCanFly(boolean cf)
  {
    canFly = cf;
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
      if (canFly == true)
      {
        return("Up, up, and away"); 
      }
      else
      {
        return("You will never outrun me!");
      }
    }
    
    public String giveWarning()
    {
      if (health <= 50)
      {
        return("I may be weak but come fight me!");
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
