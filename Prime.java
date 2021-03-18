import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        int i,j,n;
        System.out.println("Enter a number to check whether it's prime");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if(n==2){
            System.out.println("Even Prime number");
        }
        else{
            primecheck(n);
        }
        in.close();
    }
    public static void primecheck(int n){
        int flag=0;
        if(n<2){
            flag=0;
        }
        else{
            for(int i=2;i<=n/2;++i){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime number");
        }
    }   
} 