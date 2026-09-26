package searching;

import java.util.*;

class binary_search 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      int size;
      System.out.println("enter the size of array\n");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the value in array in aceneding\n");
      for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }    
      int t=0;
    for(int i=0;i<size-1;i++)
    {
        for(int j=0;j<size-i-1;j++)
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
    for(int i=0;i<size;i++)
    {
     System.out.print(a[i]+" ");
    }
     System.out.println("");
    int chno,q=0;
    //int left=0,right=a[size-1],mid=0,q=0;
    System.out.print("enter the number  to sesrch:");
    chno=sc.nextInt();
    for(int i=0;i<size;i++)
    {
        int left=0,right=size-1,mid=0;
        while(left<=right)
        {
          mid=left+((right-left)/2);
          if(a[mid]==chno)
          {
            q++;
            break;
          }
          else if(a[mid]<chno)
          {
           left=mid+1;
          }
          else 
          {
            right=mid-1;
          }
        }
    }
    
       if(q!=0)
    {
        System.out.println("number is present\n");
    }
    else
    {
        System.out.println("number is not present\n");
    }
  
}
}