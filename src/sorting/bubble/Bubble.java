package sorting.bubble;

public class Bubble {
    public static int[] bubbleSort(int[] list){
        int end = list.length;
        int temp;
        boolean needNextPass = true;
        while (end>=0 && needNextPass){
            //After the first pass, the last element becomes the largest in the array. After the
            //second pass, the second-to-last element becomes the second largest in the array. This process
            //is continued until all elements are sorted.
            needNextPass = false;
            for(int i = 0; i < end-1; i++){
                if(list[i+1] < list[i]){
                    //swap
                    temp = list[i+1];
                    list[i+1] = list[i];
                    list[i] = temp;
                    needNextPass = true;
                }
            }

            end--;
        }

        return list;
    }
}
