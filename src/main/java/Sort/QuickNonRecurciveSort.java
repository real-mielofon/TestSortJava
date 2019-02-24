package Sort;


import java.util.Stack;

class Pair<K, V> {

    private final K element0;
    private final V element1;

    public static <K, V> Pair<K, V> createPair(K element0, V element1) {
        return new Pair<K, V>(element0, element1);
    }

    public Pair(K element0, V element1) {
        this.element0 = element0;
        this.element1 = element1;
    }


    public K fst() {
        return element0;
    }

    public V snd() {
        return element1;
    }

}

public class QuickNonRecurciveSort extends QuickSort {

    public QuickNonRecurciveSort(Integer[] arr) {
        super(arr);
    }

    @Override
    public void Sort() {
        Stack<Pair<Integer, Integer>> pairs = new Stack<Pair<Integer, Integer>>();

        pairs.push(new Pair(0, arr.length-1));

        while (pairs.size()>0) {
            Pair<Integer, Integer> pair = pairs.pop();
            int k = SortBetweenReturn(pair.fst(), pair.snd());
            if (pair.fst() < k-1) pairs.push(new Pair(pair.fst(), k-1));
            if (k+1 < pair.snd()) pairs.push(new Pair(k+1, pair.snd()));
        }

    }
}
