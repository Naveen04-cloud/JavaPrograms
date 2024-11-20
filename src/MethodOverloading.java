import java.util.Scanner;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.add();
        System.out.println(methodOverloading.add(2, 3, 4));
        methodOverloading.add(1, 3);
//        addition.addUsingScanner();
    }

    public void add() {
        int a = 1, b = 2;
        System.out.println(a + b);
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void addUsingScanner() {
        System.out.println("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter a value: ");
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
