/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Stephen
 */
public class Pilot
{
    private String firstName;
    private String surname;
    private String rank;
    private int age;
    private boolean isAvailable;
    
    public Pilot()
    {
    
    }
    
    public Pilot(String firstName, String surname, String rank, int age, boolean isAvailable)
    {
        this.firstName   = firstName;
        this.surname     = surname;
        this.rank        = rank;
        this.age         = age;
        this.isAvailable = isAvailable;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getRank()
    {
        return rank;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isIsAvailable()
    {
        return isAvailable;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setIsAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }

    /**
    *Returns details of the aircraft as a string
    */
    @Override
    public String toString()
    {
        return "Pilot{" + "firstName=" + firstName + ", surname=" + surname + ", rank=" + rank + ", age=" + age + ", isAvailable=" + isAvailable + '}';
    }
    
    
}
