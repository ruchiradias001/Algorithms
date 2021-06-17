public class Main
{
    public static void main(String args[])
    {
        int[] array = {29,89,14,52,26,83};

        MergeSort obj = new MergeSort(array);
        obj.displayArray();

        // Best sorting algorithm
        // very fast but take more space
        // space    -> O(n)
        // time     -> O(n logn)
    }
}
