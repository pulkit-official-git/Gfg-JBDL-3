package demoSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    private List<Integer> list;
    private ExecutorService ex;
    public MergeSort(List<Integer> list, ExecutorService ex) {
        this.list = list;
        this.ex = ex;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            left.add(list.get(i));
        }
        for (int i = mid; i < list.size(); i++) {
            right.add(list.get(i));
        }

        MergeSort task1 = new MergeSort(left, ex);
        MergeSort task2 = new MergeSort(right, ex);

        Future<List<Integer>> future1 = ex.submit(task1);
        Future<List<Integer>> future2 = ex.submit(task2);

        left = future1.get();
        right = future2.get();
        List<Integer> result = new ArrayList<>();
        int i=0,j=0;
        while(i<left.size() && j<right.size()) {
            if(left.get(i)<right.get(j)) {
                result.add(left.get(i));
                i++;
            }else {
                result.add(right.get(j));
                j++;
            }
        }
        while(i<left.size()) {
            result.add(left.get(i));
            i++;
        }
        while(j<right.size()) {
            result.add(right.get(j));
            j++;
        }
        return result;
    }
}
