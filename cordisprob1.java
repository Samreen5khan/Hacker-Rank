
import java.util.Scanner;
import java.util.ArrayList;

public class cordisprob1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<Double>();
        double x=0.0d;
        System.out.println("Enter a number: ");
        x = scan.nextInt();
        for(double i=1;i<=6;i++)
        {
            double ele = (double) Math.pow(x,i);
            arr.add(1/ele);      
            //decimal numbers in the array are stored but
            //how to add the series?

        }
        System.out.println(arr);
        double series=0.0d; 
        for(double sum: arr)
        {
            series=series+sum;
           // System.out.println(sum);
            //System.out.println(series);
        }
        System.out.printf("%.4f",series);
        // for( Double s:arr )
        // {
        //   s=s+s;
        // }
        // System.out.println("anwer ="+series
        scan.close();
    }
}
