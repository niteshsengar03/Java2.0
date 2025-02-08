import java.util.*;
class Main{
    static int n;
    public static void main(String[]args){
        print("Nitesh");
    }
    private static void print(String s){
        if(n==4)
            return;
        System.out.println(s);
        n++;
        
        print(s);
    }
}