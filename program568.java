import java.io.*;
import java.util.*;

class program568
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of File : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File Name :"+fobj.getName());
            System.out.println("File Path :"+fobj.getAbsolutePath());
            System.out.println("File Size :"+fobj.length());
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}