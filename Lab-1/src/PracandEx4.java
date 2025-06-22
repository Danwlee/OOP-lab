import java.util.Scanner;
public class PracandEx4 {
    static void prac2_1 (){
        System.out.println("Name: le Bao Dang.");
        System.out.println(" Date of birth: 2005");
    }
    static void prac2_2 () {
        System.out.println(313+ 122);
        System.out.println(37 +56);
        System.out.println("23 + 32 = "+(23+32));
    }
    static void prac2_3 () {
        System.out.println("90*25 = "+ (90*25));
    }
    static void prac3_1 () {
        int a=6,b=2;
        System.out.println("a + b = "+(a+b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        System.out.println("a - b = "+(a-b));
    }
    static void prac3_2 () {
        String name= "Alice";
        int dob= 2019;
        System.out.println("name : "+name);
        System.out.println("Date of birth : "+dob);
    }
    static void prac3_3 () {
        double length =7.5, width = 3.8;
        System.out.println("area = "+(length*width));
    }
    static void prac3_4 () {
        char c='a';
        System.out.println(c);
    }
    static void prac3_5 () {
        char d= 102 -2;
        System.out.println(d);
    }
    static void prac3_6 () {
        int a=230520165, b=245320908;
        System.out.println((long)a*b);
    }
    static void prac3_7 () {
        boolean b=true;
        System.out.println(b);
    }
    static void prac4_1 () {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name ");
        String Name=sc.nextLine();
        System.out.println();
        System.out.print("Enter your address ");
        String Address=sc.nextLine();
        System.out.println("Name: "+Name);
        System.out.println("Address: "+Address);
    }
    static void prac4_2 () {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length of rectangle: ");
        int length=sc.nextInt();
        System.out.print("enter width of rectangle: ");
        int width=sc.nextInt();
        System.out.println("Area: "+(length*width));
    }
    static void prac4_3 () {
        Scanner sc=new Scanner(System.in);
        System.out.print("input a char: ");
        char ch=sc.next().charAt(0);
        ch+=1;
        System.out.println("next char is "+ch);
    }
    static void prac4_4 () {
        Scanner sc=new Scanner(System.in);
        System.out.print("input num a: ");
        int a=sc.nextInt();
        System.out.println("input num b: ");
        int b=sc.nextInt();
        System.out.println("a+b = "+(a+b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a % b = "+(a/b));
    }
    static void prac4_5 () {
        Scanner sc=new Scanner(System.in);
        System.out.print("input num a: ");
        int a=sc.nextInt();
        System.out.print("input num b: ");
        int b=sc.nextInt();
        System.out.println(a>b);
    }
    static void ex4_1 () {
        Scanner sc=new Scanner(System.in);
        System.out.print("input ur name: ");
        String name=sc.nextLine();
        System.out.print("input ur age: ");
        int age=sc.nextInt();
        age+=15;
        System.out.println("In 15 years, age of "+name+" will be "+age);
    }
    static void ex4_2 () {
        Scanner sc=new Scanner(System.in);
        System.out.print("input num a: ");
        int a=sc.nextInt();
        System.out.print("input num b: ");
        int b=sc.nextInt();
        int temp;
        temp=b;
        b=a;
        a=temp;
        System.out.println("After swapping, a="+a+" b="+b);
    }
    static void ex4_3 () {
        Scanner sc=new Scanner(System.in);
        System.out.print("input radius r of a circle: ");
        double r=sc.nextDouble();
        double pi=3.14;
        System.out.println("Circumference: "+(pi*r*2));
    }
    static void prac5_1 () {
        Scanner sc=new Scanner(System.in);
        System.out.println("input a num: ");
        int num=sc.nextInt();
        if (num>0) {
            System.out.println("num is a positive integer");
        } else if (num<0) {
            System.out.println("num is a negative integer");
        }
        else {
            System.out.println("num is zero");
        }
    }
    static void prac5_2 () {
        Scanner sc=new Scanner(System.in);
        System.out.println("input num a: ");
        int a=sc.nextInt();
        System.out.println("input num b: ");
        int b=sc.nextInt();
        if (a>0&&b>0) {
            System.out.println("a is greater than 0 and b is greater than 0");
        } else {
            System.out.println("a is less than/equals 0 or b is less than/ equals 0");
        }
    }
    static void prac5_3 () {

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter your name");
        //String Name=sc.next();
        //System.out.println("hello "+Name);
        System.out.println("Hello World");
       /* prac2_1();
        prac2_2();
        prac2_3();
        prac3_1();
        prac3_2();
        prac3_3();
        prac3_4();
        prac3_5();
        prac3_6();
        prac3_7();
        prac4_1();
        prac4_2();
        prac4_3();
        prac4_4();
        prac4_5();*/
        ex4_1();
        ex4_2();
        ex4_3();
    }
}