package Sort;

import java.util.Comparator;

public abstract class Sort implements Comparator<Integer> {
    protected final Integer[] arr;

    public Sort(){
        this.arr = new Integer[0];
    }
    public Sort(Integer[] arr) {
        this.arr = arr;
    }

    public int compare(Integer i, Integer j) {
        return arr[i]-arr[j];
    }

    public void Swap(int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    abstract void Sort() ;
}
