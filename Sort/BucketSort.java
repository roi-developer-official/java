package Sort;
import java.util.ArrayList;
import java.util.List;

public class BucketSort {

    public void sort(int[] array,int numberOfBuckets){
        List<Integer> x = new ArrayList<>();
        List<List<Integer>> buckets = new ArrayList<>();

        for(var item : array)
           buckets.get(item / numberOfBuckets).add(item);
        
        


    }

    
}
