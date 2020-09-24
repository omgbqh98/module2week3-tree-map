import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SapXepMang {
    public static class ArraySorting {

        public static void main(String... moeTavern) {
            int[] moesPints = new int[] {9, 8, 7, 6, 1};
            Arrays.sort(moesPints);
            Arrays.stream(moesPints).forEach(System.out::print);


//            Simpson[] simpsons = new Simpson[]{new Simpson("Lisa"), new Simpson("Homer")};
//
//            Arrays.sort(simpsons);
//            Arrays.stream(simpsons).forEach(System.out::println);
        }


        public static class TreeMapExample {

            public static void main(String... barney) {
                Map<SimpsonCharacter, String> simpsonsCharacters = new TreeMap<>();
                simpsonsCharacters.put(new SimpsonCharacter("ewew"), "shotgun");
                simpsonsCharacters.put(new SimpsonCharacter("Lenny"), "Carl");
                simpsonsCharacters.put(new SimpsonCharacter("Homer"), "television");
                simpsonsCharacters.put(new SimpsonCharacter("Barney"), "beer");

                System.out.println(simpsonsCharacters);
            }
        }
    }
}
