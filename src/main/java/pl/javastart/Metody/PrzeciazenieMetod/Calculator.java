package pl.javastart.Metody.PrzeciazenieMetod;

public class Calculator {

    int add(int x, int y) {
        int result = x + y;
        System.out.print("suma" + result);
        return result;
    }


    int add(int x, int y, int z) {
        int result = add(x, y) + z;
        System.out.print("suma" + result);
        return result;
    }

    int add(int x, int y, int z, int a) {
        int result = add(x, y, z) + a;
        System.out.print("suma" + result);
        return result;
    }

    int substract(int x, int y) {
        int result = x - y;
        System.out.print("róznica" + result);
        return result;
    }


    int substract(int x, int y, int z) {
        int result = substract(x, y) - z;
        System.out.print("różnica" + result);
        return result;
    }

    int substract(int x, int y, int z, int a) {
        int result = substract(x, y, z) - a;
        System.out.print("różnica" + result);
        return result;
    }
}