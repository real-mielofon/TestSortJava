package Sort;

public class BubbleSort extends Sort {

    public BubbleSort(Integer[] arr) {
        super(arr);
    }

    @Override
    public void Sort() {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ( this.compare(i, j) > 0) {
                    this.Swap(i, j);
                }
            }
        }
    }
}
