import org.junit.rules.Stopwatch;

import java.util.*;

public class UnionIntersectOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 11};
        int[] arr2 = {11, 5, 6, 7, 8, 9, 10};
        doUnion(arr1, arr2);
        System.out.println();
        Intersect(arr1, arr2);
    }
    static void doUnion(int[] arr1, int[] arr2) {
//        ArrayList<Integer> union = new ArrayList<>();
//        for (int i : arr1) {
//            union.add(i);
//        }
//        for (int j : arr2) {
//            if (!union.contains(j)) {
//                union.add(j);
//            }
//        }
//        for (int i : union) {
//            System.out.print(i + " ");
//        }
        Set<Integer> set = new HashSet<>();
        for (int i : arr1){
            set.add(i);
        }
        for (int i : arr2){
            set.add(i);
        }
        System.out.println(set);
    }
    static void Intersect(int[] arr1, int[] arr2) {
        long start = System.nanoTime();
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    System.out.print(k + " ");
                }
            }
        }
        long end = System.nanoTime();
        System.out.println();
        System.out.println(end-start);

//        long start = System.nanoTime();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//
//        for (int i :arr1){
//            list1.add(i);
//        }
//        for (int i :arr2){
//            list2.add(i);
//        }
//        for (int i:list1){
//            if (list2.contains(i)){
//                System.out.print(i+" ");
//            }
//        }
//        long end = System.nanoTime();
//        System.out.println();
//        System.out.println(end-start);
    }
}
