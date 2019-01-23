package net.ukr.ksm;

class TestAnnotetion {

    @Test(a = 2.5, b = 6.0)
    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
