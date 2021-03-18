import java.util.Vector;
public class vector{
    public static void main(String[] args){
        boolean result;
        Vector<String> friends = new Vector<>();
        friends.add("Akash");
        friends.add("Rishi");
        friends.add("Antony");
        System.out.println(friends);
        friends.add(3,"Tony");
        System.out.println(friends);
        Vector<String> set = new Vector<>();
        set.add("Leander");
        set.addAll(friends);
        System.out.println(set);
        set.remove(4);
        set.remove(3);
        set.remove(0);
        System.out.println(set);
        result=set.contains("Akash");
        System.out.println("Vector contains the word \"Akash\": " + result);
    }
} 