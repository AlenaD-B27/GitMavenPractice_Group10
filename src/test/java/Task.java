import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task {
    public static void main(String[] args) {

        // homework: solve using Set
        // homework: solve using Map


        /*
Count words
    String str ="I am learning learning java java java programming";    //get & read individual word

    Output - I-1 am-1 learning-2 java-3 programming-1


 */

        // Adam's approach:

        String str = "I am learning learning java java java programming";

        String result = findFrequencyOfWord(str);


    }

    private static String findFrequencyOfWord(String str){
        String[] words = str.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(words));

        String dummie = "";

        for (String word : list){
            if (!dummie.contains(word)) {
                dummie += word + Collections.frequency(list, word);
            }
        }


       // System.out.println(list);

        return null;
    }






}
