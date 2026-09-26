package sorting;

import java.util.*;
class bubble_sort
{
 public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter the size of n: ");
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
    int t=0;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
    System.out.println("sorted array\n");
    for(int i=0;i<n;i++)
    {
     System.out.print(a[i]+" ");
    }
 }
} 