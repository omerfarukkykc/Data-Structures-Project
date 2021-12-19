package VeriYapilari;

public class HeapShort extends Shorter{
    int randArr[];
    public HeapShort(){
      
    }
    public void start()
    {
        this.randArr = arr.clone();
        long startTime = System.nanoTime();
        int n = randArr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(randArr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = randArr[0];
            randArr[0] = randArr[i];
            randArr[i] = temp;
            heapify(randArr, i, 0);
        }
        long endTime = System.nanoTime();
        this.shorTime = this.nanosToMillisFloat(endTime-startTime);
    }
    void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
        if (l < n && arr[l] < arr[largest])
            largest = l;
        if (r < n && arr[r] < arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
 
   
}
