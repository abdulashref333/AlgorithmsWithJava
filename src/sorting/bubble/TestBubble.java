package sorting.bubble;

public class TestBubble {
    public static void main(String[] args){
        int[] list = {-2,9,-4,11,-3};

        list = Bubble.bubbleSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
