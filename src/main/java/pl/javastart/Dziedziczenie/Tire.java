package pl.javastart.Dziedziczenie;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tire extends Part{
   private int size;
   private int height;

   public Tire(String producerName, String model, int series, int size, int height) {
      super(producerName, model, series);
      this.size = size;
      this.height = height;
   }

}
