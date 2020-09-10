package SelektionOpgaver;

public class Selektion_1_1 {
    public static void main(String[] args) {
  int x=5;
  int y=8;
  int z=3;

        // opg A
        boolean x1 = x <= 5 && z != y;
        System.out.println(x1);

        // opg b

        boolean x2 = x == 5 || x == y && z == 2;
        System.out.println(x2);

        // opg c

        boolean x3 = x / y > z / x;
        System.out.println(x3);

        // opg d
        boolean x4 = !( x != y - z) == false;
        System.out.println(x4);

        // opg e
        boolean x5 = 2 * x != x || x == 0;
                System.out.println(x5);
        // opg f
        boolean x6 = ! true || ! false;
        System.out.println(x6);
    }
}
