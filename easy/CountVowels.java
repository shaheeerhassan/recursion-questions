package easy;

//Count Vowels: Count the number of vowels in a string using recursion.
public class CountVowels {

    public static int countVowel(String s) {
        return countVowel(s.toLowerCase(), 0, 0);
    }

    private static int countVowel(String s, int index, int count) {
        if (index==s.length()) return count;

        switch(s.charAt(index)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return countVowel(s, index+1, count+1);
            default : return countVowel(s, index+1, count);
        }
    }
}
