import java.util.Scanner;
public class DisplayPrime
{
    public static void main(String[] args)
    {
        int u;
        Scanner in = new Scanner(System.in);
        System.out.println("First ___ Prime numbers");
        u = in.nextInt();
        int i=2,j,k,count=0;
        do
        {
            k = prime(i);
            if(k==1)
            {
                System.out.println(i);
                count+=1;
            }
            i+=1;
        }while(count!=u);
    }
    public static int prime(int n)
    {       
        int flag=1,w=1;
        for(int j=2;j<=n/2;++j)
        {
            if(n%j==0)
            {
                w = 0;
                break;
            }
            else
            {
                w = 1;               
            }
        }
        return w;
    }
}        