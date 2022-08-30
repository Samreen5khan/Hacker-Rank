import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

class Result{
    public void solution(ArrayList<Integer> arr)
    {
        System.out.println(arr);
    }

}

public class Prob2{
    public static void main(String[] args) throws IOException
    {
        Result res = new Result();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.println("ENTER ARRAY: ");
        for(int i=0;i<5;i++)
        {
            arr.add(scan.nextInt());
        }
        res.solution(arr);
        
        scan.close();
    }
}
