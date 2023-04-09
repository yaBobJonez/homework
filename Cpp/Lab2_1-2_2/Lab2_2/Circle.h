#ifndef LAB2_1_CIRCLE_H
#define LAB2_1_CIRCLE_H

#include "Point.h"

class Circle : public Point {
protected:
    double radius;
    double minorAxis = radius;
public:
    Circle(double x, double y, double radius);
    double area(); //non-virtual
    double getX(){ return this->x; }
    double getY(){ return this->y; }
    double getRadius(){ return this->radius; }
};

#endif //LAB2_1_CIRCLE_H
