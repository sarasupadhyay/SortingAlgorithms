class Merge
{
    public static void conquer(int ar[], int si,int mid,int ei)
    {
        int merge[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid&& idx2<=ei)
        {
            if(ar[idx1]<=ar[idx2])
            {
                merge[x]=ar[idx1];
                x++;
                idx1++;
            }
            else
            {
                merge[x]=ar[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1<=mid)
        {
            merge[x]=ar[idx1];
            x++;
            idx1++;
        }
        while(idx2<=ei)
        {
            merge[x]=ar[idx2];
            x++;
            idx2++;
        }
        for(int i=0,j=si;i<merge.length;i++,j++)
            ar[j]=merge[i];
    }
    public static void divide(int ar[],int si, int ei)
    {
        if(si>=ei)
        return;
        int mid=si+(ei-si)/2;
        divide(ar,si,mid);
        divide(ar,mid+1,ei);
        conquer(ar,si,mid,ei);
    }
    public static void main(String args[])
    {
        int list[]={2,5,3,6,4,8,1};
        int len=list.length;
        divide(list,0,len-1);
        for(int i=0;i<len;i++)
        System.out.print(list[i]+" ");
        System.out.println();
    }
}