package VeriYapilari;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class main {

	public static void main(String[] args) throws IOException {        
                run(100);
                run(1000);
                run(50000);
                run(500000);
                run(10000000);
	}
        public static void run(int i){
            Shorter.createRandomArray(i);
            InsertionShort IS = new InsertionShort();
            HeapShort HS = new HeapShort();
            CountingShort CS = new CountingShort();
            
           
            
            System.err.println( i + " Adet Karışık Eleman için Sıralama Zamanı");
            
            System.gc();
            Runtime.getRuntime().gc();
            long start =  getUsedMemory();
            IS.start();
            System.out.println("[ Insertion Short = "+IS.getShortTime()+" MS ::: Used Memory ="+formatSize(getUsedMemory()-start)+" ]\t");
            
            System.gc();
            Runtime.getRuntime().gc();
            start =  getUsedMemory();
            HS.start();
            System.out.println("[ Heap Short = "+HS.getShortTime()+" MS ::: Used Memory ="+formatSize(getUsedMemory()-start)+" ]\t");
            
            System.gc();
            Runtime.getRuntime().gc();
            start =  getUsedMemory();
            CS.start();
            System.out.println("[ Counting Short = "+CS.shorTime+" MS ::: Used Memory ="+formatSize(getUsedMemory()-start)+" ]\t");
            
            
            
            CS.kucuktenbuyugeAta();
            
            
            System.err.println( i + " Adet Küçükten Büyüğe Eleman için Sıralama Zamanı");
            
            System.gc();
            Runtime.getRuntime().gc();
            start =  getUsedMemory();
            IS.start();
            System.out.println("[ Insertion Short = "+IS.getShortTime()+" MS ::: Used Memory ="+formatSize(getUsedMemory()-start)+" ]\t");
            
            System.gc();
            Runtime.getRuntime().gc();
            start =  getUsedMemory();
            HS.start();
            System.out.println("[ Heap Short = "+HS.getShortTime()+" MS ::: Used Memory ="+formatSize(getUsedMemory()-start)+" ]\t");
            
            System.gc();
            Runtime.getRuntime().gc();
            start =  getUsedMemory();
            CS.start();
            System.out.println("[ Counting Short = "+CS.shorTime+" MS ::: Used Memory ="+formatSize(getUsedMemory()-start)+" ]\t");
            
            
            
            CS.buyuktenkucugeAta();
            
            System.err.println( i + " Adet Büyükten Küçüğe Eleman için Sıralama Zamanı");
            
            System.gc();
            Runtime.getRuntime().gc();
            start =  getUsedMemory();
            IS.start();
            System.out.println("[ Insertion Short = "+IS.getShortTime()+" MS ::: Used Memory ="+formatSize(getUsedMemory()-start)+" ]\t");
            
            System.gc();
            Runtime.getRuntime().gc();
            start =  getUsedMemory();
            HS.start();
            System.out.println("[ Heap Short = "+HS.getShortTime()+" MS ::: Used Memory ="+formatSize(getUsedMemory()-start)+" ]\t");
            
            System.gc();
            Runtime.getRuntime().gc();
            start =  getUsedMemory();
            CS.start();
            System.out.println("[ Counting Short = "+CS.shorTime+" MS ::: Used Memory ="+formatSize(getUsedMemory()-start)+" ]\t");
            
            
            System.out.println("----------------------------------------------------------------------------");
        }
        public static long getUsedMemory(){
            return  Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        }
        public static long getUsedMemoryV2(){
            MemoryMXBean memBean = ManagementFactory.getMemoryMXBean() ;
            MemoryUsage heapMemoryUsage = memBean.getHeapMemoryUsage();
            return heapMemoryUsage.getUsed();
        }
        public static String formatSize(long v) {
            if (v < 1024) return v + " B";
            return String.format("%.2f %sB", (double)v / (1024), " K");
        }

}
