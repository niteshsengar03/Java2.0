import java.util.Arrays;

class Student{
    int rol;
    String Name;

    Student(int rola,String Name){
        rol = rola;
        this.Name = Name;
    }
    Student(){
        this (23,"niteshhhh");
    }
}
public class  Main{
    public static void main (String[]args){
        Student nitesh = new Student(10, "nitesh");
        Student ne = new Student(5, "neharika");
        Student a = new Student();
        System.out.println(nitesh.rol);
        System.out.println(ne.Name);
        System.out.println(a.Name);
        int[]arr = new int [2];
        int [] arr2=arr;
        arr[0]=5;
        arr2[1]=9;
        System.out.println(Arrays.toString(arr2));
        Integer sdf = 3;
        Integer nuemm = 3;
        System.out.println(sdf.toString());
    }
}