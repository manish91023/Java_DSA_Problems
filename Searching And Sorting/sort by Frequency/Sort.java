import java.util.*;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
        sortAndPrintByFrequency(arr);
    }

    public static void sortAndPrintByFrequency(int[] arr) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list of entries
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());

        // Step 3: Sort the list
        entries.sort((e1, e2) -> {
            if (e1.getValue().equals(e2.getValue())) {
                return e1.getKey().compareTo(e2.getKey());
            } else {
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        // Step 4: Print the elements
        for (Map.Entry<Integer, Integer> entry : entries) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}