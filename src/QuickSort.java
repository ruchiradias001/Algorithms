public class QuickSort
{
    private int[] array;

    public QuickSort(int[] array)
    {
        this.array = array;
        quickSort(0, array.length-1);
    }

    private void quickSort(int front, int rear)
    {
        if (front < rear){
            int left = front;
            int right = rear;
            int middleItem = array[(front + rear) / 2];
            while (left <= right) {
                while (array[left] < middleItem) {
                    left++;
                }
                while (array[right] > middleItem) {
                    right--;
                }
                if (left <= right) {
                    swap(left, right);
                    left++;
                    right--;
                }
            }
            quickSort(front, (left-1));
            quickSort(left, rear);
        }
    }

    private void swap(int left, int right)
    {
        int leftItem = array[left];
        array[left] = array[right];
        array[right] = leftItem;
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
