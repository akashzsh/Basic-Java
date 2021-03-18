import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        int n,t1=0,t2=1;
        Scanner in = new Scanner(System.in);
        System.out.println("FIBONACCI SERIES");
        System.out.println("Enter the number of terms you want to display in the series");
        n = in.nextInt();
        for(int i=1; i<=n; ++i){
            System.out.printf(t1 + " + ");
            int sum;
            sum=t1+t2;
            t1=t2;
            t2=sum;
        }
    }
}  