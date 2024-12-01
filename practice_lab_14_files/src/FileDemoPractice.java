import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class FileDemoPractice {
    public static void main(String[] args) {
        try {
            File newFile = new File("EmptyFolder");
            newFile.mkdir();

            FileWriter newWriter = new FileWriter(newFile + "\\TextFile.txt");
            newWriter.write("Hello Planet Mars!");
            newWriter.close();  // forgotten

            FileReader newReader = new FileReader(newFile + "\\TextFile.txt");
            int charc;
            while ((charc =newReader.read()) != -1) {
                System.out.print((char)charc);
            }
            newReader.close();  // forgotten

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}