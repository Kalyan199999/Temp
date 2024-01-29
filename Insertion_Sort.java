/*
 * The array is divide into 2-parts sorted and unsorted arrays 
 * The element is taken from the unsortd list and compares in the sorted list and places int the sorted array
 * Time Complixity=O(n^2) =>worst and avg cases
 * Time Complixity=O(n) =>Best case
 */


import java.util.Scanner;

public class Insertion_Sort 
{
    public static int[] insertion_sort(int n,int[] arr)
    {
        int i=-1,j=-1,temp=0;

        for(i=1;i<n;i++)
        {
            temp=arr[i];

            j=i-1;

            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
            
        }

        return arr;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Eneter the size of list:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements:");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        arr=insertion_sort(n, arr);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
