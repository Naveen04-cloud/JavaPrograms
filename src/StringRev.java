public class StringRev {
    public static void main(String args[]) {
        String word = "Naveen", rstr = "", rstr2 = "";
        int a = word.length();
        System.out.println(a);
        char ch, ch2;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);//chartAt is used to count the index of the given string.
            rstr = ch + rstr; //neevaN
        }
        System.out.println("reverse string = " + rstr);
        System.out.println("orginal string =" + word);

        for (int i = word.length() - 1; i >= 0; i--) {
            ch2 = word.charAt(i);
            rstr2 = rstr2 + ch2; //neevaN
        }
        System.out.println("reverse string = " + rstr2);
        System.out.println("orginal string =" + word);

    }
}

