import java.util.Arrays;
import java.util.Scanner;

    public class Main {
        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
      /*  int[] myIntArray = new int[10];
        //myIntArray[2] = 1;
      for (int i = 0; i < myIntArray.length; i++){
          myIntArray[i] = i * 10;
      }
       for (int i = 0; i<myIntArray.length; i++){
           System.out.println("Element " + i + "value is " + myIntArray[i]);
      printArray(myIntArray);
       }
*/
            int[] myInteger = getInteger(5);
            int[] sorT = sortArray(myInteger);
            printArray(sorT);
            for (int i =0;i<myInteger.length;i++){
                System.out.println("Element " + i + "typed values is " + myInteger[i]);

            }
            System.out.println("the average " + average(myInteger));

        }
        public static int[] getInteger(int number){
            System.out.println("enter " + number + " integer values .\r");
            int[] values = new int[number];

            for (int i = 0;i<values.length;i++){
                values[i] = scanner.nextInt();
            }
            return values;

        }
        public static double average(int[] array){
            int sum = 0;
            for (int i = 0; i<array.length;i++){
                sum+=array[i];
            }
            return  (double)sum /(double)array.length;
        }
        public static void printArray(int[] array){
            for (int i = 0; i<array.length;i++){
                System.out.println("Element " + i + " contents " +array[i]);
            }
        }
        public static int[] sortArray(int[] sort){
            int[] sortedArray = Arrays.copyOf(sort, sort.length);
           // int[] sortedArray = new int[sort.length];
            //for (int i =0; i<sortedArray.length; i++){
              //  sortedArray[i]=sort[i];

            boolean flag = true;
            int temp;
            while (flag){
                flag = false;
                //element 0 = 50 then 160
                //element 1 = 160 then 50
                //element 2 = 40  then 40
                for (int i = 0; i<sortedArray.length-1;i++){
                    if (sortedArray[i]<sortedArray[i+1]){
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[i+1];
                        sortedArray[i+1] = temp;
                        flag = true;
                    }
                }
            }
            return sortedArray;
        }
   /* public static void printArray(int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.println("Element " + i + "value is " + array[i]);
        }
    }*/
    }


