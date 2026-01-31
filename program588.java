import java.io.*;
import java.security.Key;
import java.util.*;

class program588
{
    public static void main(String[] args) 
    {
        String str = "Hello";

        byte Arr[] = str.getBytes();

        byte Key = 0x11;

        System.out.println("Original data : "+str);
        
        // Encryption Process
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (byte)(Arr[i] ^ Key);
        }

        String output = new String(Arr);

        System.out.println("ENcrypted data : "+output);

        // Decryption Process
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (byte)(Arr[i] ^ Key);
        }

        String out = new String(Arr);

        System.out.println("Decrypted Data : "+out);
    }
}