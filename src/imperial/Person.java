/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imperial;

/**
 *
 * @author Caesar
 */
public abstract class Person
{
    private Person mother, father;
    private String name;
    private int age,iq;
    
    public Person(String name)
    {
        this.name = name;
    }
    
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public void setIQ()
    {
        int parentsIQ = (mother.iq + father.iq) / 2;
        // unfinished
    }
    
    public void setMother(Person m)
    {
        mother = m;
    }
    
    public void setFather(Person f)
    {
        father = f;
    }
    
    public void setParents(Person m, Person f)
    {
        mother = m;
        father = f;
    }
}
