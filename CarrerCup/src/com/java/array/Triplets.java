package com.java.array;

import java.util.HashMap;

public class Triplets {
	
	private static void printarri(int str[]) {
        for (int i = 0; i < str.length; i++)
            System.out.print("" + str[i] + " ");
        System.out.println("");
    }

    private static String arrKey(int str[]) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++)
            sb.append(str[i]);
        return sb.toString();
    }
    
//Unique triplets
    private static HashMap memo = new HashMap();
    private static int NO_VALUE = -1;
    public static void findTriplet(int a[], int idx, int k, int r[]) {
        if (memo.containsKey(arrKey(r))) return;

        if (r[2] >= 0) {
            memo.put(arrKey(r), r);
            printarri(r);
            return;
        }

        if (idx > a.length - 1) return;

        if (r[k] == NO_VALUE) {
            r[k] = a[idx];
            findTriplet(a, idx + 1, k + 1, r);
            r[k] = NO_VALUE;
            findTriplet(a, idx + 1, k, r);
        }
    }
    
    public static void main(String[] args) {
//      int a[] = {2,1,3,4,6,3,8,9,10,12,56};
      int a[] = {9, 8, 10, 7};
      int r[] = {NO_VALUE, NO_VALUE, NO_VALUE};
      findTriplet(a, 0, 0, r);
}

}
