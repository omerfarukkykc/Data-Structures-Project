
package VeriYapilari;

import java.util.Arrays;

public class CountingShort extends Shorter{
    int randArr[];
    public CountingShort(){
       
    }
    public void start()
    {
        this.randArr = arr.clone();
        long startTime = System.nanoTime();
        int max = Arrays.stream(randArr).max().getAsInt();
        int min = Arrays.stream(randArr).min().getAsInt();
        int j = max - min + 1;
        int cnt[] = new int[j];
        int out[] = new int[randArr.length];
        for (int i = 0; i < randArr.length; i++) {
            cnt[randArr[i] - min]++;
        }
 
        for (int i = 1; i < cnt.length; i++) {
            cnt[i] += cnt[i - 1];
        }
 
        for (int i = 0; i < randArr.length; i++) {
            out[cnt[randArr[i] - min] - 1] = randArr[i];
            cnt[randArr[i] - min]--;
        }
 
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = out[randArr.length-i-1];
        }
        long endTime = System.nanoTime();
        this.shorTime = this.nanosToMillisFloat(endTime-startTime);

    }
    public void kucuktenbuyugeAta(){
        this.start();
        arr = randArr;
    }
    public void buyuktenkucugeAta(){
        this.start();
        for(int i = 0 ; i < randArr.length; i++){
            arr[i] = randArr[randArr.length - (i+1)];
        }
    }
    
 
}
