import java.util.Scanner;
public class RemainEx {
    static void Ex5_1 () {
        System.out.println("hello world");
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex5_1();
        Prac5_4();
    }
}