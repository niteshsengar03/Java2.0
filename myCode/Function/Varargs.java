import java.util.Arrays;
// variable lenth arguments
class Varargs{
    public static void main(String[] args) {
        // when you don't how much values will be passed in function
        prvar(1,2,3);
        prvar(4,5,6,7,8,9);
        prstr("Nitesh","Neharika","sjshg");
        multiple(2,3,"Nik","hero");

    }
    // it will create a int array of all input
    static void prvar(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void prstr(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String...h){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(h));

    }
}
