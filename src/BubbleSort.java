public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array)
    {
        this.array = array;
        bubbleSort();
    }

    private void bubbleSort()
    {
        boolean isSorted = false;

        while (!isSorted){
            isSorted = true;
            for (int i=0; i<array.length-1; i++){
                if (array[i] > array[i+1]){
                    swap(i, (i+1));
                    isSorted = false;
                }
            }
        }
    }

    private void swap(int left, int right)
    {
        int item = array[left];
        array[left] = array[right];
        array[right] = item;
    }

    public void displayArray()
    {
        System.out.print("Array -> ");
        for (int item : array){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
