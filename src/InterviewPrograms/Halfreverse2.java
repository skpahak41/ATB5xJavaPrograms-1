package src.InterviewPrograms;

import javax.lang.model.util.Elements;

public class Halfreverse2 {
   public static void main(String[] args) {
      String origin = "My name is Shivam";
      System.out.println(origin);

      String [] words = origin.split("");

      words [1] =new StringBuilder(words [1]).reverse().toString();
      words [3]= new StringBuilder(words[3]).reverse().toString();

      String modified = String.join(" ",words);
      System.out.println(modified);


   }

   }

