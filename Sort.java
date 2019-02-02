import java.util.Arrays;

public class Sort {
  public static boolean isInOrder(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i+1] < array[i]) 
        return false;
    }
    return true;
  }
  
  public static void seed(int[] array, int min, int max) {
    for (int i = 0; i < array.length; i++) {
      array[i] = min + (int)(Math.random() * (max-min+1));
    }
  }
  
  public static void bubbleSort(int[] array)
  { 
    int count = 0; //keeps track of how many times a swap did not occur
    for(int i = array.length; i > 0; i--)
    {
      for(int j = 0; j < i - 1; j++)
      {  
        System.out.println(Arrays.toString(array));
        if(array[j] > array[j+1])
        {
          int temp = array[j]; 
          array[j] = array[j+1];
          array[j+1] = temp; 
          count = 0; //count is brought back to 0 as soon as a number was swapped
        }
        else
        {
          count++; //count increases if the numbers were not swapped
        }
        
      }
      if(count != 0) // if there were no swaps that occured in a row, the index can move forward to save time of relooping
      {
         i -= count; 
      }
    }
  }
  
  public static void main(String[] args)
  {
    int[] data = new int[10];
    seed(data, 0, 10);
    System.out.println(Arrays.toString(data));
    bubbleSort(data);
    System.out.println(Arrays.toString(data));
  }
}

