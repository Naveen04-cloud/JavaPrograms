public class NoOfWordsInSentence {
    public static void main(String[] args) {
        String sentance = " Naveen Vikas Hari Kumar ranjith Naveen ";
        String sentance2 = sentance.trim();
        int wordcount = 1;

        for (int i = 0; i < sentance2.length() - 1; i++) {
            if(sentance2.charAt(i)==' '){
                wordcount++;
            }
        }
        System.out.println("total words =" + wordcount);
    }
}
