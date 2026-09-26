package JAVA;
import java.util.*;
public class spiral
{
    void spiralmatrix()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of matrix\n");
        int n,i,p=1;
        n=sc.nextInt();
        int a[][]=new int[n][n];
        while(p>0)
        {
            for(i=0;i<n;i++)
            {
              a[0][i]=p;
              p++;
            }
            for(i=1;i<n;i++)
            {
                a[i][n]=p;
                p++;
            }
            for(i=n-2;i>=0;i--)
            {
               a[n][i]=p;
               p++;

            }
            for(i=n-2;i>=0;i--)
            {
                a[i][0]=p;
                p++;
            }
        }
        for(i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);

            }
            System.out.println();
        }
    }
    void main()
    {
        spiral obj=new spiral();
        obj.spiralmatrix();
    }
}
    
