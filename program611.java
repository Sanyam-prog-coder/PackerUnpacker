// Unpacking Code

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.util.*;

class program611
{
    public static void main(String A[]) throws Exception
    {
        // Variable Creation

        int FileSize = 0;
        Scanner sobj = null;
        String FileName = null;
        File fpackobj = null;
        File fobj = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;
        String Header = null;

        String Tokens[] = null;
        byte bHeader[] = new byte[100];
        byte Buffer[] = null;


        sobj =  new Scanner(System.in);

        System.out.println("Enter The Name OF Packed File : ");

        FileName = sobj.nextLine();

        fpackobj = new File(FileName);

        if(! fpackobj.exists())     // false
        {
            System.out.println("Error : There Is no such Packed File");
            return;
        }

        fiobj = new FileInputStream(fpackobj);

        // Read The Header
        fiobj.read(bHeader, 0, 100);

        Header = new String(bHeader);

        System.out.println("Header : "+Header);

        Header = Header.trim();

        Tokens = Header.split(" ");

        System.out.println("File Name : "+Tokens[0]);
        System.out.println("File Name : "+Tokens[1]);
     
        fobj = new File(Tokens[0]);

        fobj.createNewFile();

        foobj = new FileOutputStream(fobj);

        FileSize = Integer.parseInt(Tokens[1]);

        Buffer = new byte[FileSize];

        fiobj.read(Buffer,0,FileSize);
        foobj.write(Buffer,0,FileSize);
    }
}