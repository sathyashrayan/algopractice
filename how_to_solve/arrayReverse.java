import java.util.*;

//Algorithm 4.1
public class arrayReverse {

    public  static <T> int myArrayCount(T[] array){
        int count = 0;
        if(array == null)
         count = 0;

        for(T arr : array){
            if(arr != null)
              count++;
        }
        return count;

    }

    public static Integer[] reverseArray(Integer arr[]){
        Integer i, r, n,t;
        n =  myArrayCount(arr);
        r = n / 2;
        for(i=0 ; i < r ; i++){
            t = arr[i];
            System.out.println(n-i-1); 
            arr[i] = arr[n-i-1]; 
            arr[n-i-1] = t;
        }
        return arr;
    }
     public static void main(String[] args) {
        Integer [] arr = {2,4,6,8,10,12,14};                
        Integer result[]  = reverseArray(arr);
        System.out.println(Arrays.toString(result));
        
     }
     
}
// discord discussion link https://discord.com/channels/272761734820003841/1126047664098775140
/*
    public class arrayReverse {

        public static int[] swapV1(int arr[], int start, int end){                                           
               int t = arr[start];
               arr[start] = arr[end];
               arr[end] = t;       
               return arr;     
        }

        public static int[] swapV2(int arr[], int start, int end){                                           
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            return arr;
        }

        public static void main(String[] args) 
        { 
            int [] intArray = {4,6,8,3,5,7};
            //int resultV1[] = swapV1(intArray, 2, 5);
            int resultV2[] = swapV2(intArray, 1, 3);
            //System.out.println(Arrays.toString(resultV1)); //printing 4,6,7,3,5,8
            System.out.println(Arrays.toString(resultV2)); //printing  4, 3, 8, 6, 5, 7
        }

    }
*/
