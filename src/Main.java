public class Main
{
    public static void main(String args[])
    {
        int[] array = {29,89,14,52,26,83};

        QuickSort obj = new QuickSort(array);
        obj.displayArray();

        // Quick sort is good sorting algorithm.
        // time -> avg O(n logn)
        //      -> worst O(n**2)
    }
}
