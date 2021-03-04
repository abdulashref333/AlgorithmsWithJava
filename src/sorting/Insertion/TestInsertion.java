package sorting.Insertion;

public class TestInsertion {
    public static void main(String[] args){
        int[] list = {-1,1,-2,4};
        list = Insertion.insertionSort(list);
        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
    }
}
