import java.util.Scanner;
public class Table{
    public static void main(String[] args){      
        int i,n;
        Scanner in = new Scanner(System.in);
        System.out.println("Display table of ?");
        n = in.nextInt();
        for(i=1;i<=10;++i){
            System.out.println(n + " X " + i + " = " + (n*i));
        }
    }
} 