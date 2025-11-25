import java.util.HashSet;
import java.util.Arrays;
public class DictionaryStatistic {
    private String[] words;
    private int dictionarySize; // Количество слов 
    private int polindrom; // Количество слов полиндромов
    private int maxWordLength = -999; // маскимальная длина слова в словаре
    private int minWordLength = 999; // минимальная длина слова в словаре
    private char[] alphabet; // буквы алфавита
    private int[] frequency; //частота букв в словаре (в кадой ячейке хранит частоту букв, а индрес - это позиция буквы в alpabet)

    public DictionaryStatistic(String[] words, HashSet<Character> alphabet, int dictionarySize) {
        this.words = words;
        this.alphabet = convertHashSetToCharArray(alphabet);
        this.dictionarySize = dictionarySize;
    }

    for(int i = 0; i < dictionarySize; i++)
    {
        if (isPolindrom(words[i])) polindrom ++;

        
    }
    private char[] convertHashSetToCharArray(HashSet<Character> set) {
        char[] array = new char[set.size()];
        int index = 0;
        for (Character c : set) {
            array[index++] = c;
        }
        Arrays.sort(array);
        return array;
    }

    private boolean isPolindrom(String word){
        int left = 0;
        int right = word.length() - 1;
        while (left < right)
        {
            if (word.charAt(left) != word.charAt(right)) return false;  
            left++;
            right++;
        } 
        return true;

    }

    // получить случайное слово из словаря
    public String getRandomWord() {
       return " ";
    }

    public void printSymbolsStat() {
    
    }

}