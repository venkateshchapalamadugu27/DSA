import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.OutputStreamWriter;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

//  InputStreamReader,FileReader,BufferedReader
public class FileHandling {
    public static void main(String[] args) {
//        read();
//          write();
        createAndWrite();
    }

   public static void read(){
//               ---------------------------------------------------------------------------Read----------------------------------------------------------------------------------------

//         InputStreamReader

         try(InputStreamReader isr=new InputStreamReader(System.in)){
             System.out.println("Enter the letters : ");
             int letters= isr.read();
             while(isr.ready()){
                 System.out.println((char)letters);
                 letters=isr.read();
             }
         }catch(IOException e){
             System.out.println(e.getMessage());
         }

//         FileReader

        try(FileReader fr=new FileReader("U:\\JAVA\\StringBuffer_BigInteger_FileHandling\\src\\fileReader.txt")){
            int letters= fr.read();
            while(fr.ready()){
                System.out.println((char)letters);
                letters=fr.read();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

//         BufferedStream  using Byte Stream

        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You typed : "+ br.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

//         BufferedReader using Character stream

        try(BufferedReader br=new BufferedReader(new FileReader("U:\\JAVA\\StringBuffer_BigInteger_FileHandling\\src\\fileReader.txt"))){
            while(br.ready()){
                System.out.println("This file contains :- "+ br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }


     static void write(){
        //          ------------------------------------------------------------------Write-----------------------------------------------------------------------------------------------

        OutputStream os=System.out;

        // OutputStreamWriter
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("Hello");
            osw.write(97);
            osw.write("\n");
            osw.write("A");
            char[] arr="Venkatesh".toCharArray();
            osw.write("\n");
            osw.write(arr);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

//         FileWriter
           try(FileWriter fw=new FileWriter("U:\\JAVA\\StringBuffer_BigInteger_FileHandling\\src\\fileReader.txt",true)){
               fw.write(" is my main mobile.");
           }catch(IOException e){
               System.out.println(e.getMessage());
           }

           // BufferedWriter

        try(BufferedWriter bw=new BufferedWriter(new FileWriter("U:\\JAVA\\StringBuffer_BigInteger_FileHandling\\src\\fileReader.txt"))){
            bw.write("buffered write edit");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    static void createAndWrite() {

//        create

//        try{
//            File f=new File("new-file.txt");
//            f.createNewFile();
//
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }

//        write

//        try{
//           FileWriter fw=new FileWriter("new-file.txt") ;
//           fw.write("kerosene..........");
//           fw.close();
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }

//        reading

//        try(BufferedReader br=new BufferedReader(new FileReader("new-file.txt"))){
//            System.out.println(br.readLine());
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//    }

//        delete

        try {
            File f = new File("random.txt");
            f.createNewFile();
            if (f.delete()) {
                System.out.println(f.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
