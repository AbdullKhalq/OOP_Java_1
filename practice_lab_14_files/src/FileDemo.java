import java.io.File;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        try {
            File newFile = new File("newEmptyFolder");
            newFile.mkdir();

            File newTextFile = new File(newFile + "\\MyTextFile.txt");
            newTextFile.createNewFile();  // throws IOExpt.

            System.out.println("File exists? " + newTextFile.exists());
            System.out.println("Files is readable? " + newTextFile.canRead());
            System.out.println("File is writeable? " + newTextFile.canWrite());
            System.out.println("File absoulte path: " + newTextFile.getAbsolutePath());

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
