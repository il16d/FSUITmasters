import java.io.*;
public class FileWrite{

public static void main(String [] args){

String myFile = "filewrite.txt";

try{

FileWriter filewriter = new FileWriter(myFile);

BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
    bufferedWriter.write("Fourscore and seven years ago our fathers brought fourth,");
    bufferedWriter.newLine();
    bufferedWriter.write("on this continent, a new nation, conceived in liberty,");
    bufferedWriter.newLine();
    bufferedWriter.write("and decided to the proposition that all men are created equal.");
    bufferedWriter.close();
    


}
    catch(IOException ex)
    {
        System.out.println("Error writing to file " + myFile + "");
    }


}


}
