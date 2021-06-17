public class DemoQS
{
    private int[] array;

    public DemoQS(int[] array)
    {
        this.array = array;
        quickSort(0, array.length-1);
    }

    private void quickSort(int left, int right)
    {
        if (left < right){
            int front = left;
            int rear = right;
            int middleItem = array[(left + right) / 2];

            displayPartition(front, rear);
            System.out.println("Middle item\t-> " + middleItem);

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

            displayPartition(front, rear);
            System.out.println("Left\t\t-> " + left);
            System.out.println();

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

    private void displayPartition(int front, int rear)
    {
        System.out.print("Partition\t-> ");
        for (int i=front; i<=rear; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
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
