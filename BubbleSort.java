// This program is for Bubble Sorting Algorithm
class BubbleSort {
    // Function to sort array using Bubble sort 
    void sort(int ar[])
    {
        int n = ar.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                if(ar[j]<ar[j-1])
                {
                    int temp=ar[j-1];
                    ar[j-1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }

    // A function to print array of size n 
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // main method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        BubbleSort ob = new BubbleSort();
        ob.sort(arr);
        printArray(arr);
    }
}