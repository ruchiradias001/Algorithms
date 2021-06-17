public class Main
{
    public static void main(String args[])
    {
        int[] array = {29,89,14,52,26,83};

        BubbleSort obj = new BubbleSort(array);
        obj.displayArray();

        // bubble sort is slow
        // space    -> O(1)
        // time     -> O(n**2)
    }
}
