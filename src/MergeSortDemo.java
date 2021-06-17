public class MergeSortDemo
{
    private int[] array;

    public MergeSortDemo(int[] array)
    {
        this.array = array;
        mergeSort(0, array.length-1);
    }

    private void mergeSort(int front, int rear)
    {
        if (front < rear) {
            int middle = (front + rear)/2;
            mergeSort(front, middle);
            mergeSort((middle+1), rear);
            merge(front, rear);
        }
    }

    private void merge(int leftStart, int rightEnd)
    {
        System.out.println("front -> " + leftStart+" | rear -> " + rightEnd);

        int tempLength = rightEnd-leftStart + 1;

        int[] temp = new int[tempLength];
        int index = 0;

        for (int i=leftStart; i<=rightEnd; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int leftEnd = (leftStart + rightEnd)/2;
        int rightStart = leftEnd + 1;

        int left = leftStart;
        int right = rightStart;

        while (index < tempLength){
            if (left <= leftEnd && right <= rightEnd) {
                if (array[left] <= array[right]) {
                    temp[index++] = array[left++];
                } else {
                    temp[index++] = array[right++];
                }
            }
            else if (left <= leftEnd){
                temp[index++] = array[left++];
            }
            else {
                temp[index++] = array[right++];
            }
        }
        System.arraycopy(temp, 0, array, leftStart, index);

        for (int i=leftStart; i<=rightEnd; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public void displayArray()
    {
        System.out.print("Array -> ");
        for (int item : array)
        {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
