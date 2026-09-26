
import java.util.*;
class matrix{
    

int a[][]=new int [10][10];
int s;

matrix(int s1)
{
    s=s1;
    for(int i=0;i<s1;i++)
    {
        for(int j=0;j<s1;j++)
        {
            a[i][j]=0;

        }

    }
}

void input()
{
    Scanner sc =new Scanner(System.in);
    System.out.println("enter elemnt of aaray:");
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
            a[i][j]=sc.nextInt();
        }
        System.out.println("");
    }
}
void rotation()
{

    for(int i=0;i<s;i++)
    {
        for(int j=s-1;j>=0;j--)
        {
            System.out.print(a[j][i]+" ");
        }
        System.out.println("");
        }
 }
void display1()
{
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
            System.out.print(a[i][j] +" ");
        }
        System.out.println("");
    }
}
void transpose()
{
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
            System.out.print(a[j][i]+"  ");
        }
        System.out.println("");
    }
}
void symmerty()
{
    int p=0;
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
            if(a[i][j]!=a[j][i])
            {
                p=1;
                break;
            }
        }
    }
    if(p!=1)
        System.out.println("symmertic array\n");
    else
        System.out.println("not symmertic array\n");
}
void sum_of_diagonal()
{
    int leftdiagonal=0;
    int rightdiagonal=0;
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
            leftdiagonal=leftdiagonal+a[i][i];
        }
    }
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
            if((i+j)==s-1)
            {
                rightdiagonal=rightdiagonal+a[i][j];
            }
        }  
    }
    System.out.println("sum of left diagonal="+ leftdiagonal);
    System.out.println("sum of right diagonal="+ rightdiagonal);
}
void maximun_min_no_array()
{
    int min=a[0][0];
    int max=a[0][0];
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
          if(a[i][j]<min)
            min=a[i][j];
          else 
          max=a[i][j];
        }
    }
    System.out.println("maximum number="+max);
    System.out.println("minimum number="+min);
}
void boundary_element()
{
     for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
            if(i==0||i==(s-1)||j==0||j==(s-1))
                System.out.print(a[i][j]+" ");
            else 
                System.out.print("  ");
        }
        System.out.println(" ");
    }
}
void inner_element()
{
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
            if(i==0||i==(s-1)||j==0||j==(s-1))
                System.out.print(" * ");
            else 
                System.out.print(a[i][j]+"  ");
        }
        System.out.println(" ");
    }
}

public static void main(String Args[])
{
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.println("enter the array size: ");
    size=sc.nextInt();
    matrix r=new matrix(size);
    r.input();
    System.out.println("originalarray\n");
    r.display1();
    System.out.println("rotation array\n");
    r.rotation();
    System.out.println("transpose of 2D array\n");
    r.transpose();
    System.out.println("symmertic aaray or not");
    r.symmerty();
    System.out.println("addition diagonal element\n");
    r.sum_of_diagonal();
    System.out.println("maximun and minimum number in array\n");
    r.maximun_min_no_array();
    System.out.println("bounday element\n");
    r.boundary_element();
    System.out.println("inner element\n");
    r.inner_element();
}
}
