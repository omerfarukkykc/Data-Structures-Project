package VeriYapilari;

import java.lang.management.MemoryUsage;
import java.util.Arrays;

public class InsertionShort extends Shorter {
        int randArr[];
        
	public InsertionShort(int[] arr) {
		super(arr);
	}
        public InsertionShort(int i) {
		super(i);
	}
        public InsertionShort() {
           
	}
	public void start () {     
            this.randArr = arr.clone();
            long startTime =  System.nanoTime();
            for(int i = 1; i<randArr.length;i++) {
                    int bellek  = randArr[i];
                    int j = i-1;
                    while(j>=0 && this.randArr[j]<bellek) {
                            randArr[j+1] = randArr [j];
                            j--;
                    }
                    randArr[j+1] = bellek;
            }
            long endTime =  System.nanoTime();
            this.shorTime =  this.nanosToMillisFloat(endTime-startTime);
	}
}
