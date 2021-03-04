package sorting.Merge;

public class Merg {
    public static void mergeSort(int[] list){
        if(list.length>1){
            
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);
            
            int[] secondtHalf = new int[list.length - list.length / 2];
            System.arraycopy(list, list.length/2 , secondtHalf, 0, list.length - list.length / 2);
            mergeSort(secondtHalf);

            merg(firstHalf, secondtHalf, list);
        }
    }
    public static void merg(int[] rightList, int[] leftList, int[] temp){
        int right = 0;
        int left = 0;
        int temEle = 0;

        while (right<rightList.length && left < leftList.length) {
            if(rightList[right] < leftList[left])
                temp[temEle++] = rightList[right++];
            else
                temp[temEle++] = leftList[left++];
        }

        while(right<rightList.length)
            temp[temEle++] = rightList[right++];

        while(left<leftList.length)
            temp[temEle++] = leftList[left++];
    }
}
