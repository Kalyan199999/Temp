/*
 * for every call the pivot element get its place correctly
 * Best case Time Complixity=O(n*logn)
 * Worst Case Time Complixity=O(n^2)-->already sorted
 * pivot is middle pivot=arr[(low+high)/2]
 * pivot can be reandom b/w low to high
 */


public class Quick_Sort 
{
    public static int partion(int low,int high,int []arr)
    {
        int pivot=arr[low];
        int i=low,j=high;
        int temp=-1;

        while(i<j)
        {
            while(arr[i]<=pivot)
            {
                i++;
            }

            while(arr[j]>pivot)
            {
                j--;
            }

            if(i<j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;

        return j; //return the position of pivot element
    }

    public static int[] quick_sort(int low,int high,int arr[])
    {
        if(low<high) //if list contains 2 elements
        {
            int pivot=partion(low, high, arr);
            quick_sort(low, pivot-1, arr);
            quick_sort(pivot+1, high, arr);
        }

        return arr;
    }

    public static void main(String[] args) 
    {
        int n=5;
        int[] arr={5,3,1,7,8};
        arr=quick_sort(0,n-1,arr);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
