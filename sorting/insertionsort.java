package sorting;

import java.util.*;
class insertion_sort
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter the size of array :");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the number in array\n");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("original array\n");
        for(int i=0;i<n;i++)
       {
        System.out.print(a[i]+ " ");
       }
       System.out.println("");
       int j,p;
       for(int i=1;i<n;i++)
       {
        j=i-1;
        p=a[i];
        while(j>=0&&p<a[j])
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=p;
       }
       System.out.println("sorted array\n");
       for(int i=0;i<n;i++)
           {
            System.out.print(a[i]+" ");
           }
    }
}
    

