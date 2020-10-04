import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    private static final ReadFile instance = new ReadFile();

    private ReadFile(){

    }

    public static ReadFile getInstance(){
        return instance;
    }

    public List<String> readLines(String path) throws IOException {
        List<String> lines = new ArrayList<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text = bufferedReader.readLine();
        while(text != null && !text.isEmpty()){
            lines.add(text);
            text = bufferedReader.readLine();
        }
        return  lines;
    }
}
