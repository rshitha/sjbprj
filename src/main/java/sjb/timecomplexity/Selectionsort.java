package sjb.timecomplexity;

public class Selectionsort {
    public void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

          
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {29, 10, 14, 37, 13};
        Selectionsort sorter = new Selectionsort();
        sorter.selectionSort(data);

        System.out.print("Sorted array: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
