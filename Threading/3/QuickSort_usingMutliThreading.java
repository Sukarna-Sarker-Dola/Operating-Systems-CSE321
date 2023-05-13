import java.util.*; 
import java.util.concurrent.*; 
public class QuickSort_usingMutliThreading extends RecursiveTask<Integer> { 
    int start;
    int end; 
    int[] array; 
    private int partion(int start, int end,int[] array) 
    { 
        int k = start;
        int l = end;
        int pivote = new Random().nextInt(l-k)+k; 
        int t = array[l]; 
        array[l] = array[pivote]; 
        array[pivote] = t; 
        l--;        
        int pivot = array[end]; 
        int i = (start-1); 
        for (int j=start; j<end; j++)
        {
            if (array[j] <= pivot)
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[end];
        array[end] = temp;
        return i+1;
    } 
     public QuickSort_usingMutliThreading (int startin,int endin,int[] arr) 
    { 
        this.array = arr; 
        this.start= startin; 
        this.end= endin; 
    } 
        @Override
    protected Integer compute() 
    { 
        if (start >= end) 
           return null; 
        int p = partion(start, end, array); 
        QuickSort_usingMutliThreading  left = new QuickSort_usingMutliThreading (start, p - 1, array); 
        QuickSort_usingMutliThreading  right = new QuickSort_usingMutliThreading (p + 1, end, array); 
        left.fork(); 
        right.compute(); 
        left.join(); 
        return null; 
    } 
    public static void main(String [] args) 
    {
        int n = 9;
        int[] arrayay = {6,90,30,70,13,1,80,35,67} ;
        ForkJoinPool pool = ForkJoinPool.commonPool(); 
        pool.invoke( new QuickSort_usingMutliThreading ( 0, n - 1,arrayay)); 
        for (int i = 0; i < n; i++) {
            System.out.print(arrayay[i] + " "); 
        }
    } 
}