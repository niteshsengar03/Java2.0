

public class FunctionOverlaoding {
    public static void main(String[] args) {
        System.out.println(fnti(2,3));
        System.out.println(fnti(2,3,5));
        
    }   
    static int fnti(int a,int b){
        return a+b;
    }
    static int fnti(int a,int b,int c){
        return a+b+c;
    }
    static void hell(int a){
        System.out.println("hello");
        System.out.println(a);
    }
}
