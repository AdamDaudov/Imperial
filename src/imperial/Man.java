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
public class Man extends Person implements Male
{
    private int testosterone;
    
    public Man(String name)
    {
        super(name);
    }
    
    public Man(String name, int age)
    {
        super(name);
    }
    
    @Override
    public void testosterone()
    {
        
    }
}
