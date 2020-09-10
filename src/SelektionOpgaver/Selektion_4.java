package SelektionOpgaver;

public class Selektion_4 {
    public static void main(String[] args) {
        int first = 70;
        int second = 867;
        int third = 3;

        if (first > second && first > third)
            System.out.println("first");
        else if (second > first && second > third)
            System.out.println("second");
        else
            System.out.println("third");
    }
}
