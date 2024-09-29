// package Recursion.printNno.ofTimes;
import java.util.*;
class Main {
    public static void main(String[]args){
        print(4);
    }
    private static void print(int n){
        if(n==0)
            return;
            System.out.println(n);
        print(n-1);
        
        
    }
}
