package sorting.quick;

public class Quick<E>{
    E[] list ;
    public Quick(E[] list){
        this.list = list;
    }
    public E[] sort(){
//        this.list = list;
        quickSort(0, list.length-1);
        return list;
    }
    private void swap(int from, int to){
        E tmp = list[from];
        list[from] = list[to];
        list[to] = tmp;
    }
    private void quickSort(int from, int to) {
        if(from > to )
            return;

        E pivot = list[to];
        int count = from;
    // this loop for shift the elements that less than the pivot to left side and that largest to the right.
        for (int i = from; i < to; i++) {
            if((((Comparable<E>)list[i]).compareTo(pivot)) <= 0 ){
                swap(count, i);
                count++;
            }
        }
        swap(count, to);
        //do quick sort to the left side of the pivot
        quickSort(from, count-1);
        //do quick sort to the right side of the pivot
        quickSort(count+1, to);
    }
}
