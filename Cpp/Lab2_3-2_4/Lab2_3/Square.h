#ifndef LAB2_3_2_4_SQUARE_H
#define LAB2_3_2_4_SQUARE_H

#include <utility>
#include "Shape.h"

typedef std::pair<double, double> Point;

class Square : public Shape {
private:
    /*
     *  2 ____ 3
     *   |    |
     *   |____|
     *  1      4
     */
    Point p1, p2, p3, p4;
    double side;
public:
    Square(Point p1, Point p2, Point p3, Point p4);
    Point getP1(){ return this->p1; }
    Point getP2(){ return this->p2; }
    Point getP3(){ return this->p3; }
    Point getP4(){ return this->p4; }
    double area() override;
    double perimeter() override;
};

#endif //LAB2_3_2_4_SQUARE_H
