#include <stdexcept>
#include <cmath>
#include "Ellipse.h"

double Ellipse::getDistanceToFoci() {
    return isVertical?
        std::sqrt(minorAxis*minorAxis - majorAxis*majorAxis)
        : std::sqrt(majorAxis*majorAxis - minorAxis*minorAxis);
}

Ellipse::Ellipse(double x, double y, double co_vertexDistance, double vertexDistance)
        : Circle(x, y, co_vertexDistance), majorAxis(std::abs(vertexDistance)), isVertical(std::abs(vertexDistance) < std::abs(co_vertexDistance)) {
    if(vertexDistance == 0.0) throw std::invalid_argument("Еліпс не може бути відрізком");
    double dtf = this->getDistanceToFoci();
    this->focus1x = isVertical? x : dtf+x;
    this->focus1y = isVertical? dtf+y : y;
    this->focus2x = isVertical? x : -dtf+x;
    this->focus2y = isVertical? -dtf+y : y;
    this->eccentricity = isVertical? (dtf/co_vertexDistance) : (dtf/vertexDistance);
}

double Ellipse::area() {
    return M_PI * this->majorAxis * this->minorAxis;
}
