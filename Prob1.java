import java.io.IOException;
import java.util.ArrayList;
//import java.math.*;
import java.util.Scanner;

class Result 
{

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    // System.out.println("Size of your array: "+n);
    // System.out.println("N0. of plus "+arrp);
    // System.out.println("No. of minus "+arrm);
    // System.out.println("No. of zeros "+arrz);
    //System.out.println("=====ratio of array====");
    //full array is displayed here
    //System.out.println(arr);
    
   public void plusMinus(ArrayList<Integer> arr,int n) 
   {
       double arrp=0.0d,arrm=0.0d,arrz=0.d,rp,rm,rz;
       
       for(int ele : arr)
       {
           if(ele<0)
           {
               arrm=arrm+1;
            }
            else if(ele>0)
           {
               arrp=arrp+1;
            }
           else
           {
               arrz=arrz+1;
            }
        }
        
        //calculating ratios 
        rp=arrp/n;
        rm=arrm/n;
        rz=arrz/n;
        
        
        System.out.printf("\n"+"%.6f",rp);
        System.err.printf("\n"+"%.6f",rm);
        System.err.printf("\n"+"%.6f",rz);
     }

}

public class Prob1 {
    public static void main(String[] args) throws IOException {
        
        Result res = new Result();
        Scanner scan = new Scanner(System.in);
  
        ArrayList<Integer> arr = new ArrayList<Integer>();
    
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int n = scan.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS: ");
        for(int i=0;i<=n-1;i++)
        {  
            arr.add(scan.nextInt());
        }
        res.plusMinus(arr,n);
       
        scan.close();
    }
}
