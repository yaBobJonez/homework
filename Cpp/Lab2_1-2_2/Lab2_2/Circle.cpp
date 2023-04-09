#include <stdexcept>
#include <cmath>
#include "Circle.h"

Circle::Circle(double x, double y, double radius) : Point(x, y), radius(std::abs(radius)) {
    if(radius == 0.0) throw std::invalid_argument("Коло не може бути точкою");
}

double Circle::area() {
    return M_PI * (this->radius*this->radius);
}
