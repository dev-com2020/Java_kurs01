import java.io.File;

public class Plik {
    public static void main(String[] args)
    {
        // create an abstract pathname (File object)
        File f = new File("program1.txt");

        // create the destination file object
        File dest = new File("program_nowy.txt");

        // check if the file can be renamed
        // to the abstract path name
        if (f.renameTo(dest)) {

            // display that the file is renamed
            // to the abstract path name
            System.out.println("File is renamed");
        }
        else {
            // display that the file cannot be renamed
            // to the abstract path name
            System.out.println("File cannot be renamed");
        }
    }
}
