
/**
 * This class finds the smallest integer input by the user.
 * @author (Marcus Graves) 
 */
import java.util.Scanner;
public class Smallest
{
    // instance variables 
    private int values;
    private int number;
    private int smallest;
    public void getValues()
    {
        System.out.print("Enter the number of integer values to compare: ");
        Scanner input = new Scanner(System.in);
        values = input.nextInt(); 
        for( int i=1; i<= values; i++)
        {
            System.out.printf( "Enter an integer for value %d: ", i);
            number =input.nextInt();
        
            if( i==1)
                smallest = number;
                else if(number < smallest)
                smallest = number;
       }
       System.out.printf( "The smallest integer is %d.", smallest );
    }
}
