import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MaxWordCountInFile {
    static String path = "/Users/Home/javaTest.txt" ;

    public static void main(String[] args) {
        Map<String,Integer> wordMap = new HashMap<>();

        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine();

            while (currentLine != null){
                String[] words = currentLine.toLowerCase().split(" ");
                for (String word : words){
                    if (!word.isBlank()){
                        if (wordMap.containsKey(word)){
                            wordMap.put(word,wordMap.get(word)+1);
                        } else {
                            wordMap.put(word,1);
                        }
                    }
                }
                currentLine = reader.readLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        wordMap.forEach((k,v) -> System.out.println(k+" : "+v));
        System.out.println(wordMap.entrySet());
        Map<String,Integer> mapMap = new HashMap<>();

        wordMap
                .entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(),Collections.max(wordMap.values())))
                .forEach(e -> mapMap.put(e.getKey(),e.getValue()));

        System.out.println("---------------------------------------------------");
        System.out.println(mapMap.entrySet());
    }
}
