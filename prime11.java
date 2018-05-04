import java.io.*;
class prime2
{
    public static void main(String args[])throws IOException
    {
    int count=0,i,flag,j;
    DataInputStream dis = new DataInputStream(System.in);
  int num =Integer.parseInt(dis.readLine());
  int num2=Integer.parseInt(dis.readLine());
    for(i=num+1;i<=num2;i++)
    {
     count =0;
     for(j=2;j<i;j++)
     {
         if(i%j==0)
         {
             count++;
             break;
         }
     }
     if(count==0)
     {
         System.out.println(i+" ");
     }
    }
    }
}


