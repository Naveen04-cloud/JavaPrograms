public class Childclass extends ParentClass{
    @Override
    public void add(int a, int b) {
        System.out.println("child parent");
        System.out.println(a+b);
        super.add(29,4);
    }
}