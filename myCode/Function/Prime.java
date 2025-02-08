import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
          int  num = sc.nextInt();
          if(num==0)
            return;
            System.out.println(isPrime(num));
        }
       
    }
    static boolean isPrime(int num){
        if(num<=1)
            return false;
        for(int i =2;i<=num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
