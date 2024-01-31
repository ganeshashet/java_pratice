package test;

import java.util.*;

public class sce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Create a list to store the combinations
        List<List<Integer>> combinations = new ArrayList<>();

        // Recursive function to find all combinations of 1 and 2 that add up to n
        findCombinations(combinations, new ArrayList<>(), 0, n);

        // Print the combinations
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    private static void findCombinations(List<List<Integer>> combinations, List<Integer> combination, int currentSum, int n) {
        // If the current sum is equal to n, we have found a valid combination
        if (currentSum == n) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        // Add 1 to the current sum and add it to the combination
        combination.add(1);
        findCombinations(combinations, combination, currentSum + 1, n);

        // Remove 1 from the current sum and do not add it to the combination
        combination.remove(combination.size() - 1);
        findCombinations(combinations, combination, currentSum, n);
    }
}
