import java.io.*;
import java.util.*;

class program571
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
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Arr[] = new byte[50];

            fiobj.read(Arr);

            System.out.println(Arr);
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}