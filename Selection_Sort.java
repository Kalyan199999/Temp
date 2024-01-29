
/*
 * selection sort repeatedly finds the min value from unsorted array and inserted into the
 * sorted array
 * 
 * Time complixity=O(n^2) =>for all best and worst cases
 * 
 */




import java.util.Scanner;

public class Selection_Sort
{
    public static int[] selection_sort(int n,int[] arr)
    {

        int min=-1;

        for(int i=0;i<n-1;i++)
        {
            min=i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }

            if(min!=i)
            {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }


        return arr;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of list:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        arr=selection_sort(n,arr);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}