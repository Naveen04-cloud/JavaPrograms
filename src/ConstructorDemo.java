public class ConstructorDemo {
    int a, b;

    ConstructorDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        ConstructorDemo constructorDemo = new ConstructorDemo(5, 7);
        constructorDemo.add();
    }

    public void add() {
        System.out.println(a + b);
    }
}