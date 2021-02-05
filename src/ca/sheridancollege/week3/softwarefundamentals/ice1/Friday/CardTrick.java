
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author John Ho - 991619682
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card c1 = new Card(); 
       c1.setSuit("Spades"); 
       c1.setValue(10);
        
       System.out.println(c1); 
       
       Card c2 = new Card(); 
       c2.setSuit("Hearts");
       c2.getValue(7); 
        
    }
    
}
