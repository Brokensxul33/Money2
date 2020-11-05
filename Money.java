/* Title: Money
 * Date: 11/04/2020
 * Author: Luis Flores Cardoza
 */

package lab13;

public class Money {
	private int dollars;
    private int cents;
   

    public Money()
    {
    	dollars = 0;
    	cents = 0;
    }

    public Money(int dollars, int cents)
    {
        this.dollars = dollars + cents / 100;
        this.cents = cents % 100;
    }





    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public Money add(Money m)
    {
    	  int dollars = this.dollars + m.dollars;
          int cents = this.cents + m.cents;
          return new Money(dollars,cents);
          
   
    }

    public Money subtract(Money m)
    {
    	int c1 = this.dollars * 100 + this.cents;
        int c2 = m.dollars * 100 + m.cents;
        int diff = c1 - c2;
        if(diff >= 0) 
           return new Money(diff / 100, diff % 100);
        
        else
           return null;
    }
    	


    public String toString()
    {
    	return String.format("$%1$d.%2$d",dollars,cents);
   
    }
    public int compareTo(Money m) {
    	int c1 = this.dollars * 100 + this.cents;
        int c2 = m.dollars * 100 + m.cents;
        if(c1 == c2) {
        	return 0;
        }else if(c2 < c1) {
        	return -1;
        }else {
        	return 1;
        }
  
    	
    }
//    public Money getMax(Money[] moneyObjects){ 
//        Money maxValue = moneyObjects[0]; 
//        for(int i=1;i < moneyObjects.length;i++){ 
//          if(moneyObjects[i] > maxValue){ 
//             maxValue = moneyObjects[i]; 
//          } 
//        } 
//        return maxValue; 
//    }

	public boolean equals(Money m) {
    	return(this.dollars == m.dollars) && (this.cents == m.cents);
    	
    	
    }
}
    	   



		
