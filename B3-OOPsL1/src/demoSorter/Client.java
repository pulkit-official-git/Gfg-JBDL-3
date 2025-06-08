package demoSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();
        List<Integer>list = List.of(5,4,7,8,1,3,9,8);
        MergeSort mergeSort = new MergeSort(list,ex);
        Future<List<Integer>> future = ex.submit(mergeSort);
        List<Integer>result = future.get();
        System.out.println(result);

    }
}
