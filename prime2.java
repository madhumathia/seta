import java.io.*;
class prime2
{
    public static void main(String args[])throws IOException
    {
    int count=0,i,num;
    DataInputStream dis = new DataInputStream(System.in);
    num =Integer.parseInt(dis.readLine());
    for(i=2;i<=num;i++)
    {
        if(num%i==0)
        count=count+1;
    }
    if(count==1)
    {
        System.out.println(" yes");
    }
    else
    System.out.println(" yes");
    }
}
