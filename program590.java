import java.io.*;
import java.nio.Buffer;
import java.util.*;

class program590
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of Folder : ");
        String FolderName = sobj.nextLine();

        System.out.println("Enter the name of Packed File : ");
        String PackName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File Packobj = new File(PackName);

            Packobj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(Packobj);

            FileInputStream fiobj = null;

            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of Files in the Folder are : "+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                System.out.println("File name : "+fArr[i].getName() + " File File : "+fArr[i].length()+ " bytes");
            
                if(fArr[i].getName().endsWith(".txt"))
                {
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }
                }
                fiobj.close();
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is No such Folder ");
        }
    }
}