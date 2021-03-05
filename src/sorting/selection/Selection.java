package sorting.selection;

public class Selection {
    public static void selectionSort(int[] list)
    {
        int min ;
        int temp;
        for (int i = 0; i < list.length; i++) {
            //find the minimum of the sublist
            min = i;    //reset min value,it's very important.
            for (int j = i; j < list.length; j++) {
                if(list[j] < list[min])
                    min = j;
            }
            //swap with the first element of the sublist.
            temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
    }
}
