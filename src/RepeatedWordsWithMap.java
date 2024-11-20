import java.util.HashMap;
import java.util.Map;

public class RepeatedWordsWithMap {
    public static void main(String[] args) {
        String setance ="java is great and jav is fun";
        String normalizedsent= setance.toLowerCase();
        String[] words= normalizedsent.split("\\w");
        Map<String,Integer> wordscountmap=new HashMap<>();
        for(String word:words){
            if (wordscountmap.containsKey(word)){
                wordscountmap.put(word,wordscountmap.get(word));
            }
            else {
                wordscountmap.put(word,1);

            }
        }
        System.out.println("duplicate words");
        for (Map.Entry<String,Integer> entry:wordscountmap.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey() );
            }
        }


    }
}
