import java.util.Random;

public class Sort {

  private static <T extends Comparable> void swap(T[] array, int leftIndex, int rightIndex) {
    if (leftIndex != rightIndex) {
      T temp = array[leftIndex];
      array[leftIndex] = array [rightIndex];
      array[rightIndex] = temp;
    }
  }

  private static <T extends Comparable<? super T>> void bubbleSort (T[] array) {
    boolean swapped;
    do {
      swapped = true;
      for (int i = 1; i < array.length; i++) {
        if (array[i].compareTo(array[i-1]) < 0) {
          swap(array, i, i-1);
          swapped = false;
        }
      }
    } while (!swapped);
  }

  private static <T extends Comparable<? super T>> void insertionSort (T[] array) {

  }

  public static void main(String[] args)
  {
    int N = 20;

    Integer[] ints = new Integer[N];
    Random random = new Random();
    for (int i = 0; i < N; i++) {
      ints[i] = random.nextInt(100);
    }
    System.out.println("Unsorted array:");
    for (int val: ints) {
      System.out.print(val + " ");
    }
    System.out.println("\n");

    bubbleSort(ints);

    System.out.println("BubbleSort:");
    for (int val: ints) {
      System.out.print(val + " ");
    }

  }
}
