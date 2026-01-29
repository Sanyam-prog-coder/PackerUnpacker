import java.io.*;
import java.util.*;

class program559
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        File fobj = null;
        String FileName = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Name of File : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        bRet = fobj.exists();

        if(bRet == true)
        {
            System.out.println("File is Already Present in Current Directory");
        }
        else
        {
            bRet = fobj.createNewFile();

            if(bRet == true)
            {
                System.out.println("File Gets Created Succesfully");
            }
            else
            {
                System.out.println("Unable to create File");
            }
        }
        
        sobj.close();    
    }    
}
