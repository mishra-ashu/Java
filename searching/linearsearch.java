package searching;

import java.util.*;
class linear_search
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      int size;
      System.out.println("enter the size of array\n");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the value in array\n");
      for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }    
      int search_number;
      int p=0,q=0;
      System.out.print("enter the number to search:");
      search_number=sc.nextInt();
      for(int i=0;i<size;i++)
      {
        if(a[i]==search_number)
        {
            p=1;
            q=i+1;
            break;
        }
      }
      if(p==1)
      {
       System.out.println("number is present at position:"+q);
      }
      else
      {
        System.out.println("number is  not present\n");
      }
   }
}