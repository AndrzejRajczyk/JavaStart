package pl.javastart.TypyGeneryczne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pair <P,V>{
    private  P p ;
    private  V v;

    public Pair(P p, V v) {
        this.p = p;
        this.v = v;
    }

    void printPair (Pair pair){
        System.out.println(pair);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "p=" + p +
                ", v=" + v +
                '}';
    }
}
