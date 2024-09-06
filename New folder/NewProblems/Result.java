package NewProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> unmatchedSocks = new HashSet<>();
        int pairs = 0;
        
        for (int sock : ar) {
            if (unmatchedSocks.contains(sock)) {
                pairs++;  
                unmatchedSocks.remove(sock); // Remove the matched sock
            } else {
                unmatchedSocks.add(sock); // Add the unmatched sock
            }
        }
        
        return pairs;
    }
}
class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Number of socks
        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(scn.nextInt());
        }
        
        int result = Result.sockMerchant(n, ar);
        System.out.println(result);
        scn.close();
    }
}
