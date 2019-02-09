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
    int lastSwap = 0; //keeps track of the last swap that occurred 
    for(int i = array.length; i > 0; i--)
    {
      lastSwap = 0; //resets the number back to 0
      for(int j = 0; j < i-1; j++)
      {  
        if(array[j] > array[j+1])
        {
          int temp = array[j]; 
          array[j] = array[j+1];
          array[j+1] = temp; 
          lastSwap = j + 1; // this is where the last swap occurred
        }
      }
      i = lastSwap + 1; //i is set to where the last swap happened and it increases one to counter the i--
    }
  }
  
  public static void main(String[] args)
  {
    int[] data = new int[50];
    seed(data, 0,30);
    System.out.println(Arrays.toString(data));
    bubbleSort(data);
    System.out.println(Arrays.toString(data));
  }
}

