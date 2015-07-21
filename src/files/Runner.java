package files;
import java.io.*;
import java.util.*;

public class Runner 
{
    public static void main(String[] args) 
    {
        File myFolder = new File("files/");
        File[] files = myFolder.listFiles();
        
        Arrays.sort(files);
        
        File output = new File("output.txt");
        FileWriter writer;
        
        try
        {
            writer = new FileWriter(output);
            for (File i: files) 
            {
                writer.write(i + " - " + i.length() + "\r\n");
            }
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error in opening output file.");
        }
    }
}
