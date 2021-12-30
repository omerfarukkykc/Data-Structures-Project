package VeriYapilari;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.Random;

public class Shorter {
	protected static int[] arr;
        private static Random random;
        protected float shorTime;
        protected float usedHeap;
        
           
	public Shorter (int[] arr) {
            this.arr = arr;
        }
        public Shorter (int i) {
            this.createRandomArray(i);
        }
        public Shorter () {
           
        }
	public void printArray () {
		for(int i = 0 ; i<this.arr.length;i++) {
			System.out.println(i+1 + "- "+this.arr[i] + " ");
		}
		System.out.println();
	}
        public float nanosToMillisFloat(long i){
            return (i) / 1000000.0f;
        }
        public static void createRandomArray(int i){
            random =new Random();
            arr = new int [i];
            for (int j = 0; j < arr.length; j++) {
               arr[j] = random.nextInt(10000000);
            }
        }
        public float getUsedHeap(){
            return this.usedHeap;
        }
        public float getShortTime(){
            return this.shorTime;
        }
        
}
