class excep{
    public static void main(String[] args){
        int num1, num2, result;
        num1=12;
        num2=0;
        try{
            result=num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide a number by zero");
        }
        finally{
            System.out.println("This is the finally block");
        }
        System.out.println("End of try-catch-finally");
    }
} 