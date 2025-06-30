import java.util.Scanner;

public class EX8 {
   public EX8() {
   }

   static void Ex8_1() {
      Scanner var0 = new Scanner(System.in);
      System.out.print("input a string s: ");
      String var1 = var0.nextLine();
      System.out.print("input a char c: ");
      char var2 = var0.next().charAt(0);
      boolean var3 = false;
      System.out.println("length of the string is " + var1.length());

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         if (var1.charAt(var4) == var2) {
            System.out.println(var4);
            var3 = true;
            break;
         }
      }

      if (!var3) {
         System.out.println(-1);
      }

   }

   static void Ex8_2() {
      Scanner var0 = new Scanner(System.in);
      System.out.print("input a string s: ");
      String var1 = var0.nextLine();
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         if (Character.isUpperCase(var1.charAt(var3))) {
            ++var2;
         }
      }

      System.out.println(var2);
   }

   static void Ex8_3() {
      Scanner var0 = new Scanner(System.in);
      System.out.print("input a string s: ");
      String var1 = var0.nextLine();

      for(int var2 = var1.length() - 1; var2 > -1; --var2) {
         System.out.print(var1.charAt(var2));
      }

   }

   public static void main(String[] args) {
    Ex8_1();
    Ex8_2();
    Ex8_3();
   }
}