import java.io.*;
import java.util.*;
class BitStuffingr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String data,data1="",data2="",msg,flag="01111110";
        int i=0,j,k,l,count=0;
        char ch;
        System.out.print("Enter the received data:");
        data=sc.nextLine();
        l=data.length();
        while(i!=l)
        {
            count=0;
            k=i;
            ch=data.charAt(k);
            while(ch=='1')
            {
                count++;
                k++;
                if(k<l)
                {
                    ch=data.charAt(k);
                }
            }
            if(count==5)
            {
                data1=data.substring(0,k);
                data2=data.substring(k+1,l);
                break;
            }
            i++;
        }
        msg=data1+data2;
        System.out.print("The original data received is:"+msg);
    }
}