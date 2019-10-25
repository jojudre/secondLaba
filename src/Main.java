public class Main {

    public static void main(String[] args) {

        Rational r1 = new Rational( 8 , 10);
        int a = 5;
        Rational r2 = new Rational(2, 3);
        System.out.println(r2.toFloat());
        Rational r3 = r1.plus(r2);
        RationalList arr = new RationalList();
        arr.add(r1);
        arr.add(r2);
        arr.add(4,7);
        arr.add(1, 2);
        arr.add(13, 5);
        arr.println();

        int k = arr.countGreaterThan(r2);
        System.out.println(k);

        Rational maxR = arr.findMax();
        maxR.println();

        RationalList arr2 = new RationalList();
        arr2.add(9, -3); arr2.add(5, 6);  arr2.add(1, 5);

        Polinom p1 = new Polinom(arr);
        p1.println();
        Polinom p2 = new Polinom(arr2);
        p2.println();
        Polinom p3 = p1.plus(p2);
        p3.println();
    }

}
