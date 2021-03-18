class multilevel{
    public static void main(String[] args){
        notation n = new notation();
        n.tp1();
        n.tp2();
        n.d1();
        n.n1();
    }
} 
class scientist{
    public void tp1(){
        System.out.println("I am Newton");
    }
    public void tp2(){
        System.out.println("I am Leibnitz");
    }
}
class maths extends scientist{
    public void d1(){
        System.out.println("I'm the first to invent Calculus");
    }
} 
class notation extends maths{
    public void n1(){
        System.out.println("I invented the d/dx symbol");
    }
} 