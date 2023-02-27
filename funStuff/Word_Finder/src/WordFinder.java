import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some letters");
        String letters = scanner.nextLine().toUpperCase();

        Map<Character,Integer> letterCountMap =getCharCountMap(letters);

        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Marko/Desktop/dictionaryENG.txt"));

        System.out.println("Valid words: ");
        for (String currentWord = reader.readLine(); currentWord != null; currentWord = reader.readLine()) {
            Map<Character,Integer> currentWordMap = getCharCountMap(currentWord);
            boolean canMakeCurrentWord=true;
            for(Character character: currentWordMap.keySet()){
                int currentWordCharCount = currentWordMap.get(character);
                int lettersCharCount = letterCountMap.containsKey(character)?
                                    letterCountMap.get(character) :0;

                if(currentWordCharCount>lettersCharCount){
                    canMakeCurrentWord=false;
                    break;
                }
            }
            if(canMakeCurrentWord){
                System.out.println(currentWord);
            }
        }
        scanner.close();
        reader.close();
    }

    private static Map<Character, Integer> getCharCountMap(String letters) {
        Map<Character,Integer> letterCountMap = new HashMap<>();
        for (int i = 0; i < letters.length(); i++) {
            char currentChar = letters.charAt(i);

            int count  = letterCountMap.containsKey(currentChar)?
                    letterCountMap.get(currentChar): 0;

            letterCountMap.put(currentChar,count+1);
        }
        return letterCountMap;
    }
}
