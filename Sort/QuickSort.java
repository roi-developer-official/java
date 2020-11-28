package Sort;

public class QuickSort {

    public void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array,int start, int end){

        if (start >= end)
            return;

        var boundary = partition(array,start,end);
        sort(array, start, boundary - 1);
        sort(array , boundary + 1, end);
    }

    private int partition(int[] array,int start, int end){
        var pivot = array[end];
        var boundery = start -1;
        for(var i = start; i <= end ; i++)
            if(array[i] <= pivot){
                boundery++;
                var temp = array[boundery];
                array[boundery] = array[i];
                array[i] = temp;
            }

         return boundery;
    }
   

}
