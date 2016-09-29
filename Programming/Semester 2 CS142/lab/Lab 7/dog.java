import java.util.Random;

public class dog
{
    private Random ran = new Random();
    private String breed;
    private String colour;
    private String owner;
    private boolean chases;
    
    public dog()
    {
        this.breed = ("labradoodle");
        this.colour = ("black");
        this.owner =("Bob");
        this.chases = true;
    }
    
    public String getColour()
    {
        return this.colour;
    }
    
    public void setColour(String newColour)
    {
        this.colour = newColour;   
    }
    
    public String getBreed()
    {
        return this.breed;
    }
    
    public void setBreed(String newBreed)
    {
        this.breed = newBreed;   
    }
    
    public String getOwner()
    {
        return this.owner;
    }
    
    public void setOwner(String newOwner)
    {
        this.owner = newOwner;   
    }
    
    public boolean getChases()
    {
        return this.chases;
    }
    
    public void setChases(boolean newChases)
    {
        this.chases = newChases;   
    }
    
    public boolean getBarks()
    {
        boolean dogBarks = false;
        int ownerEnters = ran.nextInt(2);
        
        if(ownerEnters == 0)
        {
            System.out.println("The " +this.breed +" can't find his owner.");
            dogBarks = false;
        }
        else if(ownerEnters == 1)
        {
            System.out.println(owner +" just walked into the room.");
            dogBarks = true;
        }
        return dogBarks;
    }
}