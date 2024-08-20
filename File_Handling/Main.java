package File_Handling;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import  java.io.InputStreamReader;
import java.io.Writer;

import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

//        try (InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("Enter some Letters:");
//            int letters = isr.read();
//            while(isr.ready()) {
//
//                System.out.println((char) letters);
//                letters = isr.read();
//
//            }
//            isr.close();
//            System.out.println();
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//
//        try (FileReader fr = new FileReader("C:\\Users\\ASUS\\Desktop\\WebD\\Basic\\notes.txt")){
//            int letters = fr.read();
//            while(fr.ready()) {
//
//                System.out.println((char) letters);
//                letters = fr.read();
//
//            }
//            fr.close();
//            System.out.println();
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//       }


        // byte to char stream and then reading char stream
//
//        try (BufferedReader br = new BufferedReader( new InputStreamReader(System.in))) { // reading what you are typing
//            System.out.println("You typed : " + br.readLine());
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//

        try (BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\ASUS\\Desktop\\WebD\\Basic\\notes.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());  // reading the file
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // OUTPUT
        OutputStream os = System.out;
        //os.write(😇); // range is exceeded

        System.out.println();

//        try (OutputStreamWriter osw = new OutputStreamWriter(System.out) ) {
//            osw.write("hello world");
//            osw.write(97);  // prints 'a'
//            osw.write(10);  // new line
//            osw.write('A');
//            osw.write("\n");
//            char[] arr = "hello world".toCharArray();
//            osw.write(arr);
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        try (FileWriter fw = new FileWriter("C:\\Users\\ASUS\\Desktop\\WebD\\Basic\\notes.txt", true) ) {
//            fw.write("  this should be appended");
//
//
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\Desktop\\WebD\\Basic\\notes.txt"))) {
            bw.write("  this should be appended");


        }catch (IOException e) {
            System.out.println(e.getMessage());
        }










    }
}
