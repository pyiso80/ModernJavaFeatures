import static java.lang.System.out;

public class VarArgsExample {

        public static void main(String...args){
                out.println(join());
                out.println(join("apple"));
                out.println(join("apple", "orange"));
                out.println(join("apple", "orange", "banana", "papaya"));
        }

        static String join(String... words) {
                StringBuilder str = new StringBuilder();
                int len = words.length;
                if (len == 0) {
                        str.append("");
                } else if (len == 1) {
                        str.append(words[0]);
                } else if (len == 2) {
                        str.append(joinWithAnd(words[0], words[1]));
                } else {
                        for (int i = 0; i < len - 2; i++) {
                                str.append(words[i]).append(", ");
                        }
                        str.append(joinWithAnd(words[len - 2],
                                        words[len - 1]));
                }
                return str.toString();
        }

        static String joinWithAnd(String word1, String word2) {
                StringBuilder str = new StringBuilder();
                str.append(word1)
                                .append(" and ")
                                .append(word2);
                return str.toString();
        }
}
