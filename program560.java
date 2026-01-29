import java.io.*;
import java.util.*;

class program560
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
            fobj.delete();
            System.out.println("File Gets Deleted");
        }
        else
        {
            System.out.println("There is no such file in Current Diarectory");
        }
        
        sobj.close();    
    }    
}
