package Sort;


import java.util.Arrays;

public class ArraySort extends Sort {

        public ArraySort(Integer[] arr) {
            super(arr);
        }

        @Override
        public void Sort() {
            Arrays.sort(arr);
        }
}
