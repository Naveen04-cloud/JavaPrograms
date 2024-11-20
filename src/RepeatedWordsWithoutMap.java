public class RepeatedWordsWithoutMap {
    public static void main(String[] args) {
        String Sent = "Big Big black bug bit a Big black dog on his Big black nose";
        int count;
        Sent = Sent.toLowerCase();
        String words[] = Sent.split(" ");
        System.out.println("Duplicate words are");

        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j]) && !words[i].equals("0")) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1)
                System.out.println(words[i] + " " + count);
        }


    }
}
