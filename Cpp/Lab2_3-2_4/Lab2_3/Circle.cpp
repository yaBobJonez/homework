#include <stdexcept>
#include <cmath>
#include "Circle.h"

Circle::Circle(double radius) : radius(std::abs(radius)) {
    if(radius == 0) throw std::invalid_argument("Коло не може бути точкою!");
}

double Circle::area() {
    return M_PI * (this->radius * this->radius);
}

double Circle::perimeter() {
    return 2 * M_PI * this->radius;
}

double Circle::getRadius() {
    return this->radius;
}
