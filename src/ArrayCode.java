import java.util.ArrayList;

public class ArrayCode {
    public static void main(String[] args) {
        ArrayCode arrayCode = new ArrayCode();
        arrayCode.addNumbersarray();
        arrayCode.addNumbersList();
        arrayCode.array();
    }

    public void addNumbersList() {
        //creating array list of type Integer
        ArrayList<Integer> num = new ArrayList();
        //adding values to arralist
        for (int i = 1; i <= 5; i++) {
            num.add(i);
        }
        System.out.println(num);

        //calculating sum of values in above arraylist
        int sum = 0;
        for (Integer i : num) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void addNumbersarray() {
        int[] num = {2, 3, 4, 5, 3};
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
    public void array(){
        ArrayList<Integer>  num=new ArrayList<>();
        for(int i=0;i<=5;i++){
            num.add(i);

        }

    }
}