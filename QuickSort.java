// This is Quick Sorting Algorithm
class QuickSort
{
    public static int partion(int ar[] , int low, int high)
    {
        int pivot =ar[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(ar[j]<pivot)
            {
                i++;
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
            }
        }
        i++;
        int temp =ar[i];
        ar[i]=pivot;
        ar[high]=temp;
        return i;
    }
    public static void quickSort(int ar[],int low,int high)
    {
        if(low<high)
        {
            int p_idx=partion(ar,low,high);
            quickSort(ar,low,p_idx-1);
            quickSort(ar,p_idx+1,high);
        }
    }
    //mainmethods
    public static void main(String[] args)
    {
        int ar[]={3,9,7,1,4,2,9,4,6};
        quickSort(ar,0,(ar.length)-1);
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}