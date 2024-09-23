package Hashing;
import java.util.*;
class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int [] arr = new int[n];
            System.out.print("Enter "+n+" number of array: ");
            int MaxElement=-1;
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]>MaxElement)
                    MaxElement = arr[i];
            }
            int [] hasharr = new int[MaxElement+1];
            // precomputation
            for(int i =0;i<arr.length;i++){
                hasharr[arr[i]]++;
            }
            System.out.println("Enter how many time you want the qerry");
            int querry = sc.nextInt();
            while (querry>0) {
                int a = sc.nextInt();
                if(a<hasharr.length)
                    System.out.println(hasharr[a]);
                else
                    System.out.println("data is not present");
                querry--;
            }
        }
}