public class constructor{
    String name;
    int id;
    constructor(){
        System.out.println("STUDENT DETAILS");
    }
    constructor(int num, String first){
        this.name=first;
        this.id=num;
    }
    public void display(){   
        System.out.println("Roll no : " + id + "  Name : " + name);
    }
    public static void main(String[] args){
        constructor obj = new constructor();        
        constructor obj1 = new constructor(17,"Akash");
        constructor obj2 = new constructor(14,"Rishi");
        obj1.display();
        obj2.display();
    }
} 