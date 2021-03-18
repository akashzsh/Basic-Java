import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        int r,n,i,ans=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether it's an armstrong number");
        n=in.nextInt();
        i = n;
        while(n>0){
            r = n%10;
            ans += Math.pow(r,3);
            n = n/10;
        }
        if(i==ans){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
} 