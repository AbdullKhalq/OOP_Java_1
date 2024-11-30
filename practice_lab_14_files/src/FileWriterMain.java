import java.io.FileWriter;

public class FileWriterMain {
    public static void main(String[] args) throws Exception {
        try {
            FileWriter fileWriter = new FileWriter("newEmptyFolder\\Output.txt");
            fileWriter.write("Hello Earth!");
            System.out.println("File saved!");

            fileWriter.close(); // closes writing stream
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
