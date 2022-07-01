import java.io.FileWriter;
import java.io.IOException;

public class Zapis {

    public static void main(String[] args) throws IOException {


        String path = "zapis.txt";
        int number = 123456;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(path);
            fileWriter.write(Integer.toString(number));
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }
}
