package sorting;

import java.util.*;
class selection_sort
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
       int min=0,p=0,j=0,t=0;
       for(int i=0;i<n;i++)
       {
        min=a[i];
        p=i;
        for(j=1+i;j<n;j++)
        {
            if(a[j]<min)
            {
                min=a[j];
                p=j;

            }
        }
        t=a[p];
        a[p]=a[i];
        a[i]=t;
       }
       for(int i=0;i<n;i++)
       {
        System.out.print(a[i]+" ");
       }
   }
}