#ifndef LAB2_3_2_4_CIRCLE_H
#define LAB2_3_2_4_CIRCLE_H

#include "Shape.h"

class Circle : public Shape {
private:
    double radius;
public:
    Circle(double radius);
    double getRadius();
    double area() override;
    double perimeter() override;
};

#endif //LAB2_3_2_4_CIRCLE_H
