import java.util.Scanner;
public class Ex8 {
    static void Ex8_1 () {
        Scanner sc =new Scanner(System.in);
        System.out.print("input a string s: ");
        String s= sc.nextLine();
        System.out.print("input a char c: ");
        char c =sc.next().charAt(0);
        boolean appear=false;
        System.out.println("length of the string is "+s.length());
        for (int i=0; i<s.length();i++) {
            if(s.charAt(i)==c) {
                System.out.println(i);
                appear=true;
                break;
            }
        }
        if(!appear){
            System.out.println(-1);
        }
    }
    static void Ex8_2 () {
        Scanner sc= new Scanner(System.in);
        System.out.print("input a string s: ");
        String s=sc.nextLine();
        int count=0;
        for (int i=0; i<s.length();i++) {
            if (Character.isUpperCase(s.charAt(i))){ 
                count++;
            }
        }
        System.out.println(count);
    }
    static void Ex8_3() {
        Scanner sc=new Scanner(System.in);
        System.out.print("input a string s: ");
        String s=sc.nextLine();
        for (int i=s.length()-1;i>-1;i--) {
            System.out.print(s.charAt(i));
        }
    }
    public static void main (String [] args) {
        Scanner sc =new Scanner(System.in);
        //Ex8_1();
        //Ex8_2();
        Ex8_3();
       // System.out.println("hello world.");
    }
}