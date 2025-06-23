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
    static void Ex6_1 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        for (int i = -n; i <=n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void Ex6_2 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num a: ");
        int a = sc.nextInt();
        System.out.print("input num b: ");
        int b = sc.nextInt();
        int sum=0;
        for (int i = a; i <=b; i++) {
            sum=sum + i;
        }
        System.out.println(sum);
    }
    static void Ex6_3 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        int sum=0;
        for (int i = 0;i<=n; i++) {
            if(i%2!=0) {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    static void Ex6_4 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num a: ");
        int a = sc.nextInt();
        System.out.print("input num b: ");
        int b = sc.nextInt();
        for (int i = a; i <=b; i++) {
            if (i%3==0) {
                System.out.print(i+" ");
            }
        }
    }
    static void Ex6_5 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        int fac=1;
        for (int i=n; i>0;i --) {
            fac=fac*i;
        }
        System.out.println(fac);
    }
    static void Ex6_6 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        for (int i =1;i<=n;i++) {
            if (n%i==0) {
                System.out.print(i+" ");
            }
        }
    }
    static void Ex6_7 () {
        for (int i = 0;i <=24; i++) {
            System.out.print(i+" ");
            if (i%5==4) {
                System.out.println();
            }
        }
    }
    static void Ex6_8 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        int count=0;
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                count++;
            }
        }
        System.out.println(count);
    }
    static void Ex6_9 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num a: ");
        int a = sc.nextInt();
        System.out.print("input num b: ");
        int b = sc.nextInt();
        int result=1;
        for (int i=0;i<b;i++) {
            result=result*a;
        }
        System.out.println(result);
    }
    static void Ex6_10 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num a: ");
        int a = sc.nextInt();
        System.out.print("input num b: ");
        int b = sc.nextInt();
        for (int i=a;i<=b;i++) {
            if (i%3==0&&i%5==0) {
                System.out.println(i+" ");
            }
        }
    }
    static void Ex6_11 () {
        System.out.println("all numbers from 1 to 1000 that end in 0.");
        for (int i=1;i<=1000;i++) {
            if (i%10==0){
                System.out.println(i+" ");
            }
        }
    }
    static void Ex7_1 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++) {
            System.out.print("input integers: ");
            arr[i]= sc.nextInt();
        }
        int sum =arr[0] +arr[n-1];
        System.out.println("sum of the first and last element in array is "+sum);
    }
    static void Ex7_2 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++) {
            System.out.print("input integers: ");
            arr[i]= sc.nextInt();
        }
        boolean even=false;
        for (int i=0;i<n;i++) {
            if (arr[i]%2==0) {
                System.out.println("even number: "+arr[i]);
                even=true;
            }
        }
        if (even==false) {
            System.out.println("nothing.");
        }
    }
    static void Ex7_3 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int j=0;j<n;j++) {
            System.out.print("input integers: ");
            arr[j]= sc.nextInt();
        }
        System.out.print("input num k: ");
        int k = sc.nextInt();
        int count=0;
        for (int i=0;i<n;i++) {
            if(arr[i]==k){
                count++;
            }
        }
        System.out.println(count);
    }
    static void Ex7_4 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum=0;
        for (int i=0;i<n;i++) {
            System.out.print("input integers: ");
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            if (arr[i]%2!=0&&arr[i]>0) {
                sum=sum+arr[i];
            }
        }
        System.out.println("sum of all positive numbers is "+sum);
    }
    static void Ex7_5 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++) {
            System.out.print("input integers: ");
            arr[i]= sc.nextInt();
        }
        boolean Inrange=false;
        for (int i=0;i<n;i++) {
            if (arr[i]>=0&&arr[i]<=10) {
                System.out.println(arr[i]);
                Inrange=true;
            }
        }
        if (!Inrange) {
            System.out.println("no output.");
        }
    }
    static void Ex7_6 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++) {
            System.out.print("input integers: ");
            arr[i]= sc.nextInt();
        }
        for (int i=1;i<n;i++) {
            int tmp = arr[i];
            int j;
            for (j=i;j>0&&tmp<arr[j-1];j--) {
                arr[j]=arr[j-1];
            }arr[j]=tmp;
        }
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void Ex7_7 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("input row r: ");
        int r = sc.nextInt();
        System.out.print("input col c: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.print("arr["+i+"]"+"["+j+"]"+":"+" ");
                arr[i][j]=sc.nextInt();
            }
        }
        int sum =0;
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                if (arr[i][j]%5==0) {
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("sum of all numbers that are divisible by 5 is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ex5_1();
        //Ex5_2();
        //Ex5_3();
        //Ex6_1();
        //x6_2();
        //Ex6_3();
        //Ex6_4();
        //Ex6_5();
        //Ex6_6();
        //Ex6_7();
        //Ex6_8();
        //Ex6_9();
        //Ex6_10();
        //Ex6_11();
        //Ex7_1();
        //Ex7_2();
        //Ex7_3();
        //Ex7_4();
        //Ex7_5();
        //Ex7_6();
        Ex7_7();
        //Prac5_4();
    }
}