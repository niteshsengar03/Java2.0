import java.util.Arrays;

 class Main {
    static int x =9;
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(sum());
        sum();
        System.out.println(greet());
        System.out.println(ans(4,3));
        greet2("nitesh");
        int a =3;
        int b =4;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
        int [] arr = {1,2,3};
        change(arr);
        // after calling the fun value will be change from actual array
        System.out.println(Arrays.toString(arr));
       
        // Scopping 
        System.out.println(x);
        int x =10;    
        System.out.println(x);
    }
    // return integer
    static int sum(){
        System.out.println("Hello from Sum");
        return 1;
    }
    // return String
    static String greet(){
        return "Hello good moring";
    }
    static int ans(int a,int b){
        return a+b;
    }
    static void greet2(String a){
        System.out.println("Hello Mr "+a);
    }
    static void swap(int a,int b){
        int temp = a;
        a =b;
        b=temp;
        System.out.println(a+" "+b);

    }
    //There is no concept of pass by refrence in java
    // for primitvie datatype when you pass them in function
    // only value is passed and not the actual value can be change
    // like in swap function actual a and b is not changed

    //for objects and complex data type 
    // pass by value of that refrence variable

    // if you change via that variable original value is changed

    static void change(int []nums){
        nums[0] = 99;
    }
   
}