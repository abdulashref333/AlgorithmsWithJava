package sorting.selection;

import sorting.Merge.Merg;

public class TestSelectionSort {
    public static void main(String[] args){
        int[] list = {0,-1,1,-2,4};
        Selection.selectionSort(list);

        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
    }

}
