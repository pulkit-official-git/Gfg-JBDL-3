package sorterBatch3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    private List<Integer> arrToSort;
    private ExecutorService ex;
    public MergeSort(List<Integer> arrToSort, ExecutorService ex) {
        this.arrToSort = arrToSort;
        this.ex = ex;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrToSort.size() <= 1) {
            return arrToSort;
        }

        int mid = arrToSort.size() / 2;
        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();
        for(int i = 0; i < mid; i++) {
            leftArr.add(arrToSort.get(i));
        }
        for(int i = mid; i < arrToSort.size(); i++) {
            rightArr.add(arrToSort.get(i));
        }
        MergeSort task1 = new MergeSort(leftArr,ex);
        MergeSort task2 = new MergeSort(rightArr,ex);
//        ExecutorService ex3 = Exe
        Future<List<Integer>> future1 = ex.submit(task1);
        Future<List<Integer>> future2 = ex.submit(task2);
        leftArr = future1.get();
        rightArr = future2.get();
        List<Integer>result = new ArrayList<>();
        int i=0,j=0;
        while(i < leftArr.size() && j < rightArr.size()) {
            if(leftArr.get(i) < rightArr.get(j)) {
                result.add(leftArr.get(i));
                i++;
            }
            else{
                result.add(rightArr.get(j));
                j++;
            }
        }
        while(i<leftArr.size()){
            result.add(leftArr.get(i));
            i++;
        }
        while(j<rightArr.size()){
            result.add(rightArr.get(j));
            j++;
        }
        return result;
    }
}
