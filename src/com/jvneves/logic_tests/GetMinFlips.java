package com.jvneves.logic_tests;

public class GetMinFlips {
    public static void main(String[] args) {
        String[] testCases = {"", "0000", "111", "0101", "01010", "100110", "101011"};

        for (String testCase : testCases) {
            int flips = minFlips(testCase);
            System.out.println("Minimum flips required for '" +testCase+ "': "+flips);
        }
    }

    public static int minFlips(String string){
        int result = 0;
        for(int i = 0; i < string.length() - 1; i+=2){
            if(string.charAt(i) != string.charAt(i+1)){
                result++;
            }
        }
        return result;
    }
}
