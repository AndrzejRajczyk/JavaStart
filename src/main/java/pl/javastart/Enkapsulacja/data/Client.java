package pl.javastart.Enkapsulacja.data;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Client {

    String name;
    String lastName;
    int casch;

    public Client(String lastName, int casch) {
        this.lastName = lastName;
        this.casch = casch;
    }


}
