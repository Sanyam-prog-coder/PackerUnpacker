import java.io.*;
import java.util.*;

class program570
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
            FileOutputStream foobj = new FileOutputStream(fobj);
            String str = "Jay Ganesh...";

            byte Arr[] = str.getBytes();

            System.out.println("Length of Arr is :"+Arr.length);
            foobj.write(Arr);
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}