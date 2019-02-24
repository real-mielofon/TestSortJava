package Sort;

public class QuickSort extends Sort{

    public QuickSort(Integer[] arr) {
        super(arr);
    }

    protected int SortBetweenReturn(int begin, int end) {
        int i = begin, j = end;
        if (i >= j) {
            return begin; // Сортировать нечего
        }

        while( i < j) { // i = 0; j = n-1
            if (compare(i, j) > 0) {  //1
               Swap(i, j);            //3
               i++;                   //1
            }
            else {
                j--;                  //1
            }
        }
        return i;
    }

    protected void SortBetween(int begin, int end) {
        int i = SortBetweenReturn(begin, end);
        if (begin < i-1) {
            SortBetween(begin, i - 1);
        }
        if (i + 1 < end) {
            SortBetween(i + 1, end);
        }
    }

    void Sort() {
        SortBetween(0, arr.length-1);
    }
}
