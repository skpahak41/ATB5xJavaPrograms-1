package src.InterviewPrograms;

import java.util.HashMap;

public class FindDuplicateElements {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 3, 2, 5};
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : array) {

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);


        }
        System.out.println("Duplicates and their frequenies:");
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > 1) {
                System.out.println(key + ": " + freqMap.get(key));
            }
        }


    }
}
