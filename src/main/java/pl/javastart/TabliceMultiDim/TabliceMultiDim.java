package pl.javastart.TabliceMultiDim;


public class TabliceMultiDim {

    public static void main(String[] args) {
        double[][] tab = new double[3][];
        double[] tab0 = {1.0, 1.5, 2.0};
        double[] tab1 = {1.5, 2.0, 2.5};
        double[] tab2 = {2.0, 2.5, 3.0};

        tab[0] = tab0;
        tab[1] = tab1;
        tab[2] = tab2;

        double result = (tab[0][0]*tab[1][1]*tab[2][2]) + (tab[0][2]*tab[1][1]*tab[2][0]);
        System.out.println("Suma iloczynów przekątnych : " + result);

        result = (tab[0][1]+tab[1][1]+tab[2][1]) * (tab[1][0]+tab[1][1]+tab[1][2]);
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny : " + result);

        result = tab[0][0] + tab[0][1] + tab[0][2] + tab[1][0] + tab[1][2] + tab[2][0] + tab[2][1] + tab[2][2];
        System.out.println("Suma elementów znajdujących się przy krawędzi tablicy: " + result);
    }
}