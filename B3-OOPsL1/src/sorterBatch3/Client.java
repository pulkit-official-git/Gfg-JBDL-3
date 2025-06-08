package sorterBatch3;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrToSort = List.of(8,7,1,4,5,9,2,3);
        ExecutorService ex = Executors.newCachedThreadPool();
        MergeSort task = new MergeSort(arrToSort,ex);
        Future<List<Integer>> future = ex.submit(task);
        List<Integer>ans = future.get();
        System.out.println(ans);

    }
}
