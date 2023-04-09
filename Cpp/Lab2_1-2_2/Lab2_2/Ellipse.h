#ifndef LAB2_1_ELLIPSE_H
#define LAB2_1_ELLIPSE_H

#include "Circle.h"

class Ellipse : public Circle {
protected:
    double majorAxis;
    double focus1x, focus1y, focus2x, focus2y;
    double eccentricity;
private:
    bool isVertical;
public:
    Ellipse(double x, double y, double co_vertexDistance, double vertexDistance);
    double area();
    double getMinorAxis(){ return this->minorAxis; }
    double getMajorAxis(){ return this->majorAxis; }
    double getFocus1X(){ return this->focus1x; }
    double getFocus1Y(){ return this->focus1y; }
    double getFocus2X(){ return this->focus2x; }
    double getFocus2Y(){ return this->focus2y; }
    double getEccentricity(){ return this->eccentricity; }
    double getDistanceToFoci();
    bool getDirection(){ return this->isVertical; }
};

#endif //LAB2_1_ELLIPSE_H
