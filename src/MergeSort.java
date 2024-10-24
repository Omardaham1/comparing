public class MergeSort {
  // Merge two subarrays L and M into array
  public static void merge(int[] array, int left, int middle, int right) {
      int n1 = middle - left + 1;
      int n2 = right - middle;

      int[] L = new int[n1];
      int[] M = new int[n2];

      // Fill the left and right subarrays
      for (int i = 0; i < n1; i++) {
          L[i] = array[left + i];
      }
      for (int i = 0; i < n2; i++) {
          M[i] = array[middle + 1 + i];
      }

      // Maintain current index of sub-arrays and main array
      int i = 0, j = 0, k = left;


      while (i < n1 && j < n2) {
          if (L[i] <= M[j]) {
              array[k] = L[i];
              i++;
          } else {
              array[k] = M[j];
              j++;
          }
          k++;
      }

     
      while (i < n1) {
          array[k] = L[i];
          i++;
          k++;
      }

      while (j < n2) {
          array[k] = M[j];
          j++;
          k++;
      }
  }

  public static void mergeSort(int[] array, int left, int right) {
      if (left < right) {
          // Find the middle point
          int middle = (left + right) / 2;

          // Recursively sort the first and second halves
          mergeSort(array, left, middle);
          mergeSort(array, middle + 1, right);

          // Merge the sorted halves
          merge(array, left, middle, right);
      }
  }
}
