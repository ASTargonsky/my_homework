package hw_oop.figures.common;

public abstract class Figure implements IFigure {

    protected double square;
    protected int d1;
    protected int d2;
    protected int a;
    protected int b;
    protected int c;

    private double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getD1() {
        return d1;
    }

    public int getD2() {
        return d2;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public boolean areSquaresEqual(Figure figure) {
        if (getSquare() == figure.getSquare()) {
            System.out.println("Площади равны");
            return true;
        } else {
            System.out.println("Площади не равны");
            return false;
        }
    }

}
