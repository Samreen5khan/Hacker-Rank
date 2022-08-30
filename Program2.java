import java.util.Scanner;
import java.util.ArrayList;

class Result{
    public void solution(ArrayList<Integer> arr)
    {
        System.out.println(arr);
    }
}

public class Program2 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Result res = new Result();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.println("Enter 5 Elements: ");
        for(int i=0;i<5;i++)
        {
            arr.add(scan.nextInt());
        }
        res.solution(arr);
        scan.close();
    }
    
}
