import java.util.StringTokenizer;
import java.util.*;
class sort
{
    String s;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string\n");
        
        s=sc.nextLine();
        sc.close();

    }
    void asort()
    {
        int p=0;
      StringTokenizer st=new StringTokenizer(s,".!?");
      int c=st.countTokens();
      String words[]=new String[c];
      while(st.hasMoreTokens())
         {
        words[p]=st.nextToken();
        p++;
    
         }
         String t;
        for(int i=0;i<c-1;i++)
           {
           for(int j=0;j<c-i-1;j++)
            {
             if(words[j].length()>words[j+1].length())
              {
                t=words[j];
                words[j]=words[j+1];
                words[j+1]=t;
              }
            }
        }
      System.out.println("sorted array\n");
      for(int i=0;i<c;i++)
      {
       System.out.print(words[i]+" ");
       }
       System.out.println();
    
    }
    
    public static void main(String[] args) 
    {
     sort obj=new sort();
     obj.input();
     obj.asort();    
    }
}