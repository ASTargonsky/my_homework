package hw_oop.figures.common;

import hw_oop.figures.Point;

public interface IFigure {

    double calculateSquare(Point... points);

    boolean areSquaresEqual(Figure figure);
}
