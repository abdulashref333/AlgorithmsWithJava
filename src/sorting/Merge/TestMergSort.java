package sorting.Merge;

import sorting.Insertion.Insertion;

public class TestMergSort {
    public static void main(String[] args){

        int[] list = {-1,1,-2,4,0};
        Merg.mergeSort(list);

        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
    }
}
