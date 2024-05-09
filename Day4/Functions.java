package Day4;

public class Functions {

    public void math1(){
        System.out.println("Hello From Method 1");
    }

//    parameter passing
    public void math2(int a,int b){
        System.out.println("Sum From Method 2 ="+(a+b));
    }

//    returning value

    public int math3(int a){
        return a+2;
    }

    public static void main(String[] args) {
        Functions fs=new Functions();
        fs.math1();
        fs.math2(2,6);
        int rs=fs.math3(3);
        System.out.println(rs);
    }

}
