package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public void addWords(String... word) {
        words.addAll(List.of(word));
    }

    public List<String> findWordsOccursOnes(){
        List<String> result = new ArrayList<>();
        int[] occurrences = new int[words.size()];
        int counter = 1;
        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);
            if (currentWord.equals(words.get(i))) {
                occurrences[i] += 1;
            }
        }
        for (int j = 0; j < occurrences.length; j++) {
            if (occurrences[j] == 1) {
                result.add(words.get(j));
            }
        }
        return result;
    }

    public List<String> getWords() {
        return words;
    }
}