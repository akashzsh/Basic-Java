public class methover {
    public static void main(String[] args){
        display obj1 = new display();
        obj1.add(5,6);
        obj1.add(3,4,7);
        obj1.add(4.5,6.7);
    }
}
class display{
    public void add(int a,int b){
        int z = a+b;
        System.out.println("Addition is " + z);
    }
    public void add(int a,int b, int c){
        int w = a+b+c;
        System.out.println("Addition is " + w);
    }
    public void add(double a,double b){
        double r = a+b;
        System.out.println("Addition is " + r);
    }
} 