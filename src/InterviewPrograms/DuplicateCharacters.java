package src.InterviewPrograms;
import java.util.HashMap;
public class DuplicateCharacters {
    public static void main(String[] args){

    String input = "Automation";
    HashMap<Character, Integer> charCount = new HashMap<>();
    for(char c :input.toCharArray()){

        charCount.put(c,charCount.getOrDefault(c,0)+1);
}

System.out.println("Duplicate characters:");
    for (char c:charCount.keySet()){
        if (charCount.get (c) > 1 ){
            System.out.println(c+":"+charCount.get(c));
        }

    }
}
}
