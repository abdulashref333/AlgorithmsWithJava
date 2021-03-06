package sorting.quick;

public class TestQuickSort {
    public static void main(String[] args)
    {
        Integer[] list = {5,3,-1,4,55,12,33};
        Quick<Integer> q = new Quick<Integer>(list);
        list = q.sort(); //-1 3 4 5 12 33 55
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
