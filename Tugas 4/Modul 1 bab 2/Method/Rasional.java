public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 1;
    }

    public Rasional(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        this.penyebut = (penyebut != 0) ? penyebut : 1;
    }

    public boolean isRasional() {
        return penyebut != 0;
    }

    public void sederhana() {
        int gcd = gcd(pembilang, penyebut);
        pembilang /= gcd;
        penyebut /= gcd;
    }

    private int gcd(int a, int b) {
        for (; b != 0;) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public double cast() {
        return (penyebut == 0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    public boolean moreThan(Rasional A) {
        return pembilang * A.penyebut > penyebut * A.pembilang;
    }

    public boolean lessThan(Rasional A) {
        return pembilang * A.penyebut < penyebut * A.pembilang;
    }

    public boolean equalTo(Rasional A) {
        return pembilang * A.penyebut == penyebut * A.pembilang;
    }

    public boolean lessThanOrEqualTo(Rasional A) {
        return pembilang * A.penyebut <= penyebut * A.pembilang;
    }

    public boolean moreThanOrEqualTo(Rasional A) {
        return pembilang * A.penyebut >= penyebut * A.pembilang;
    }

    public void negasi() {
        pembilang = -pembilang;
    }

    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
        this.sederhana();
    }

    public void add(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
        this.sederhana();
    }

    public void subtract(Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
        this.sederhana();
    }

    public void multiply(Rasional A) {
        pembilang *= A.pembilang;
        penyebut *= A.penyebut;
        this.sederhana();
    }

    public void divide(Rasional A) {
        pembilang *= A.penyebut;
        penyebut *= A.pembilang;
        this.sederhana();
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}
