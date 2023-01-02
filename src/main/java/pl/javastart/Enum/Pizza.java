package pl.javastart.Enum;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@NoArgsConstructor
public enum Pizza {
    MARGARITHA(true,true,false,false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTIO(true, true, false,true);

    private  boolean tomatoSauce;
    private  boolean cheese;

    private  boolean ham ;
    private  boolean muschrooms;

    Pizza(boolean tomatoSauce, boolean cheese, boolean muschrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.muschrooms = muschrooms;
        this.ham = ham;
    }

    @Override
    public String toString() {

        return "Pizza{" +
                "tomatoSauce=" + tomatoSauce +
                ", cheese=" + cheese +
                ", ham=" + ham +
                ", muschrooms=" + muschrooms +
                '}';
    }
}
