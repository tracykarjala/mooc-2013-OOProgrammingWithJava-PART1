public class StringUtils {

    public static boolean included(String word, String included) {
        return word.trim().toUpperCase().contains(included.trim().toUpperCase());
    }


}
