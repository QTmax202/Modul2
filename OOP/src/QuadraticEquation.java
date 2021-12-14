public class QuadraticEquation {
    double A, B, C;

    public QuadraticEquation(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getDiscriminant() {
        return Math.pow(this.B, 2) - 4 * this.A * this.C;
    }

    public double getRoot1() {
        return (-this.B + Math.sqrt(getDiscriminant())) / (2 * this.A);
    }

    public double getRoot2() {
        return (-this.B - Math.sqrt(getDiscriminant())) / (2 * this.A);
    }
}
