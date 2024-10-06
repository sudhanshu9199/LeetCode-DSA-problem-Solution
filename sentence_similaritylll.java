public class sentence_similaritylll {

    // Alogirthm
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        int i = 0;
        int j = 0;
        while (i < words1.length && i < words2.length && words1[i].equals(words2[i])) {
            i++;
        }

        while (j < words1.length - i && j < words2.length - i
                && words1[words1.length - 1 - j].equals(words2[words2.length - 1 - j])) {
            j++;
        }
        return i + j == Math.min(words1.length, words2.length);
    }

    public static void main(String[] args) {
        String sentence1 = "of";
        String sentence2 = "A lot of words";

        if(areSentencesSimilar(sentence1, sentence2)){
            System.out.print("The sentences are similar.");
        }
        else{
            System.out.print("The setence are not similar.");
        }
    }
}