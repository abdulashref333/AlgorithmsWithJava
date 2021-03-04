package sorting.Insertion;

public class Insertion {
    public static int[] insertionSort(int list[]){
        int currentElement ;
        //loop over all list elements ..

        for(int i=1; i<list.length ; i++){
            currentElement = list[i];

            int j = i-1 ;
            while( j>0 && list[j] > currentElement){
                //here we swap every element less than the current value till find any place holding value less than -
                // the current value.
                list[j+1] = list[j];
                j--;
            }

            if(currentElement > list[j]){
                //here we insert the current value in it's right place.
                list[j+1] = currentElement;
            }else{
                //this swaping between the first two elements.
                list[j+1] = list[j];
                list[j] = currentElement;
            }
        }
        return list;
    }

}
