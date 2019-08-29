/*
Write a Java program (in an object-oriented way) that prints out the 
following output
*********
********
*******
******
*****
****
***
**
*
*/
package printstars;

import java.util.Scanner;


public class Printstars {
    
    private int numberOfLines;
    
    public Printstars()
    {
        numberOfLines = 0;     /*number of lines are equal to the number of
                                   stars per line*/
    }
    public void setStarLines(int starNum)
    {
        this.numberOfLines = starNum;
        
    }
    public int starNumLines()
    {
       return numberOfLines;
    }
    public void printStars()
    {
        
        for(int i =1; i <=numberOfLines; i++) /*this for loop increment number
                                                lines */
        {
            for(int j =numberOfLines; j>=i; j--)   /*this one decrement number
                                                    of stars per line*/
                System.out.print("*");
            System.out.println();
        }
    
    
    }
    
    static Scanner  input  = new Scanner(System.in);
            
    public static void main(String[] args) {
       
        int numOfLines;
        
        System.out.println("Enter number of lines you want to print: ");
        numOfLines = input.nextInt();
        
        Printstars stars = new Printstars();
        
        stars.setStarLines(numOfLines);
        stars.printStars();
        
                
    }
    
}
