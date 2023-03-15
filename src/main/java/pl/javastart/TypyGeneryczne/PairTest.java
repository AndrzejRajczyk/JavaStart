package pl.javastart.TypyGeneryczne;

public class PairTest {
    public static void main(String[] args) {
        String s = "baba";
        String ss = "cola";
        String sss = "babacola";
        Float testFloat = Float.valueOf("1234.12");
        Pair<String, String> pair = new Pair(s,ss);
        Pair<String, String> pairA = new Pair(ss,s);
        Pair<String, String> pairAa = new Pair(sss,s);
        Pair<Float, String> pairAA = new Pair(testFloat, sss);

        pair.printPair(pair);
        pairA.printPair(pairA);
        pairAa.printPair(pairAa);
        pairAA.printPair(pairAA);


    }

}
