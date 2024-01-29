public class Marge_Sort 
{
    public static int[] merge(int[] arr,int left,int mid,int right)
    {
        
        int[] list=new int[left+right+1];
        int i=left,j=mid,k=left;

        while(i<mid && j<=right)
        {
            if(arr[i]<=arr[j])
            {
                list[k++]=arr[i++];
                
            }
            else
            {
                list[k++]=arr[j++];
            }
        }

        if(i<mid){
        while(i<mid)
        {
            list[k++]=arr[i++];
        }
        }
        else
        {
        while(j<=right)
        {
            list[k++]=arr[j++];
        }
        }  


        return list;
    }

    public static int[] divide(int[] arr,int low,int high)
    {
        // int[] list3=new int[arr.length];

        if(low<high)
        {
            int mid=(low+high)/2;
            divide(arr, low, mid);
            divide(arr, mid+1, high);

            arr=merge(arr,low,mid,high);
           
        }
        return arr;


    }



    public static void main(String[] args) 
    {
        int n=5;
        int[] arr={5,10,2,8,1};
       arr= divide(arr, 0, n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
