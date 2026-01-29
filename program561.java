import java.io.*;
import java.util.*;

class program561
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Name of File : ");
        FileName = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName);
        
        sobj.close();    
    }    
}
