package File_Handling;

import java.io.*;

public class MainFile {
    public static void main(String[] args) {

        // create
        try {
            File fo = new File("C:\\Users\\ASUS\\Desktop\\WebD\\Basic\\new-file.txt");
            fo.createNewFile();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // write in file
        try {
            FileWriter fw = new FileWriter("C:\\Users\\ASUS\\Desktop\\WebD\\Basic\\new-file.txt");

            fw.write("सत्यमेवेश्वरो लोके सत्यं पद्माश्रिता सदा।\n" +
                    "सत्यमूलानि सर्वाणि सत्यान्नास्ति परं पदम्।।  - Valmiki Ramayan 2.109.13");
            fw.close();
        }catch(IOException e){
                System.out.println(e.getMessage());
        }


        // read the file

        try (BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\ASUS\\Desktop\\WebD\\Basic\\new-file.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());  // reading the file
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // delete a file
        try {
            File fo = new File("C:\\Users\\ASUS\\Desktop\\WebD\\Basic\\random.txt");
            fo.createNewFile();
            if (fo.delete()) {
                System.out.println(fo.getName());
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
