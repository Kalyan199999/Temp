/*
 *Bubble sort repedly swaps the corresponding elements and largest element get its position first
 *time complixity =O(n^2) --> in worst case
 * time complixity =O(n) --> in best case
 */


import java.util.Scanner;

public class Bubble_Sort 
{
    public static int[] bubble_sort(int n,int[] arr)
    {
        int flag=0; //indicates no swaping of elements is done
        int temp=-1;

        for(int i=0;i<n-1;i++)
        {
            flag=0;
            
            for(int j=0;j<n-1-i;j++)
            {
                
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1; //indicates swapping is done 

                }

            }

            if(flag==0)
            {
                //indicates that no swapping is done and elements are in the sorted order
                break;
            }

        }
        

        return arr;
    }


    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of a list:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("enter the elements of list:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        //before sorting
        System.out.println("Elements before SWAPPING");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        bubble_sort(n,arr);

        //after sorting
        System.out.println("Elements after SWAPPING");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        
    }
    
}
