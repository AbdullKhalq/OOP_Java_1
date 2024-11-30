import java.io.FileReader;

public class FileReaderMain {
    public static void main(String[] args) throws Exception {
        try {
            // Throws FileNotFoundExpt. 
            FileReader fileReader = new FileReader("newEmptyFolder\\MyTextFile.txt");
            
            int charc;
            while ((charc = fileReader.read()) != -1) {
                // Shows ASCII values as letters by casting to char
                System.out.print((char)charc);
            }

            fileReader.close(); // close reading stream
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
