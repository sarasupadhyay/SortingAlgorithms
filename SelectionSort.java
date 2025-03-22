//This program consist of SelectionSort Algorithms
import java.util.Scanner;
class SelectionSort
{
    public static void selectionSort(int ar[])
    {
        int i,j,temp,least;
        int n=ar.length;
        for(i=0;i<n-1;i++)
        {
            least=i;
            for(j=i+1;j<n;j++)
            {
                if(ar[j]<ar[least])
                least=j;
            }
            if(least!=i)
            {
                temp=ar[least];
                ar[least]=ar[i];
                ar[i]=temp;
            }
        }
    }
    public static int[] enterArray()
    {
        Scanner sa=new Scanner(System.in);
        System.out.println("Enter the number of element of array");
        int num=sa.nextInt();
        int ar[]=new int[num];
        System.out.println("Enter the elment ");
        for(int i=0;i<num;i++)
        {
            System.out.println("ar["+i+"] : ");
            ar[i]=sa.nextInt();
        }
        return ar;
    }
    public static void showArray(int ar[])
    {
        System.out.println("The array is : ");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int ar[]=enterArray();
        System.out.println("Array before sort is : ");
        showArray(ar);
        selectionSort(ar);
        System.out.println("Array after sort is : ");
        showArray(ar); 
    }
}