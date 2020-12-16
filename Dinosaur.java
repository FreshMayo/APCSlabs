//package Dinosaur1; //may not need this

public class Dinosaur
{
  private String type;
  private int age;
  
  private String gender;//might fix
  private int health;

  public Dinosaur()
  {
    this.type = "dino";
    this.age = 0;
    //write code that assign gender to the Dinosaur

    this.health = 10;
  }
//explicit constructor for 

  public Dinosaur(String t)
  {
    this.type = t; 
    this.age = 0;
    this.health = 10;
    
    if (((int)(Math.random()*2))+1 > 1 )
    { 
      this.gender = "male";
    }
    else 
    { 
      this.gender = "female";
    }
    
  }

//***************GETTER****************//
public String getType()
{
 return this.type;
  //outside the class but its okay to reveal the type
}
public int getHealth()
{
 return this.health;
 
}
public String getGender()
{
 return this.gender;
}
public int getAge()
{
  return this.age;
}

//***************SETTERS*************//
public void setType(String t) //allows to be tRex and then change its type
{
  this.type= t;
}
public void setHealth(int h)
{
  this.health = h;
}

public void setAge(int a)
{
  this.age = a;
}

public boolean equals(Dinosaur d)
{
int ageDiff = this.age - d.getAge();
 if (Math.abs(ageDiff)<10)
  { 
    int healthDiff = this.health - d.getHealth();
    if (Math.abs(healthDiff) < 10)
    { 
      if (this.type.equals(d.getType()))
      { 
        return true;
      }
    }
  } 
  return false;
}
public void ageUp()
{ 
  this.age = this.age+1;
  if(this.health>0)
  { 
    if (this.age<10)
      { 
        this.health = this.health+10;
      }
    else if (this.age<25)
      {
        this.health = this.health;
      }  
    else if (this.age<=30)  
      { 
        this.health = this.health-5;
      }  
    else
      { 
        this.health = this.health-10;
      }   
  }
}

  public void ranAge()
  { 
    this.age = 0;
    int rando =(int)(Math.random()*35);
    System.out.println(rando);
    for (int i = 0; i <= rando;i++)
      {  
        ageUp();
      }
  }


  public String toString()
  {

    String answer = this.type + " " + this.age + " " + this.health + " " + this.gender;
    return answer;
  }
  
}