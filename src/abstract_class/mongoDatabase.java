/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_class;

/**
 *
 * @author emreduman
 */
public class mongoDatabase extends abstractDatabase {
    
     @Override
    void update(int a) 
    {
        System.out.println(a+" Mongo updated data");
    }

    @Override
    void get(int a)
    {
        System.out.println(a+" Mongo got data");

    }
    
}
