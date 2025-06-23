import java.util.Scanner;
public class RemainEx {
    static void Ex5_1 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input an integer: ");
        int num = sc.nextInt();
        if (num >=10 && num <= 100) {
            System.out.println(num + " is in the range [10,100].");
        } else {
            System.out.println(num + " is not in the range [10,100].");
        }
    }
    static void Prac5_4 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first person's name: ");
        String name1 = sc.nextLine();
        System.out.print("enter second person's name: ");
        String name2 = sc.nextLine();
        if (name1.equals(name2)) {
            System.out.println("two people have the same name");
        } else  {
            System.out.println("two people dont have the same name");
        }
    }
    static void Ex5_2 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num a: ");
        int a = sc.nextInt();
        System.out.print("input num b: ");
        int b = sc.nextInt();
        System.out.print("input num c: ");
        int c = sc.nextInt();
        if (a<=b && b<= c) {
            System.out.println("increasing.");
        } else if (a >=b && b>=c) {
            System.out.println("decreasing.");
        } else {
            System.out.println("neither increasing or decreasing.");
        }
    }
    static void Ex5_3 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num x: ");
        int x = sc.nextInt();
        System.out.print("input num y: ");
        int y = sc.nextInt();
        if (x>0&&y>0) {
            System.out.println("("+x+","+y+")"+ " lies in the first Quadrant");
        } else if (x<0 &&y>0) {
            System.out.println("("+","+y+")"+" lies in the second Quadrant");
        } else if (x<0 &&y<0) {
            System.out.println("("+","+y+")"+" lies in the third Quadrant");
        } else {
            System.out.println("("+x+","+y+")"+" lies in the fourth Quadrant");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ex5_1();
        //Ex5_2();
        Ex5_3();
        //Prac5_4();
    }
}