import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader {
    ArrayList<String> text = new ArrayList();

    BufferedReader br;

    public void reader(){
        try {
            br = new BufferedReader(new FileReader("nevim.txt"));
            while (br.ready()) {
                String[] line = br.readLine().split(";");
                this.text.add(line[0]);
                this.text.add(line[1]);
            }
            System.out.println(text.get(0));
            System.out.println(text.get(1));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




