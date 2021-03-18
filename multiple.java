public class multiple{
    public static void main(String[] args){
        classy d1 = new classy();
        d1.show();
    }
}
interface p1{
    default void show(){
        System.out.println("I'm Akash from Bombay");
    }
}
interface p2{
    default void show(){
        System.out.println("I like cricket");
    }
}
class classy implements p1,p2{
    public void show(){
        p1.super.show();
        p2.super.show();
    }
} 