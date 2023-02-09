#include "LineSegment.h"
#include <math.h>

LineSegment::LineSegment(std::pair<int, int> begin, std::pair<int, int> end) : begin(begin), end(end) {}

double LineSegment::getLength() {
    return std::sqrt( std::pow(end.first - begin.first, 2) + std::pow(end.second - begin.second, 2) );
}

double LineSegment::getAngleRelToOY() {
    double hor = std::abs(end.first - begin.first);
    double ver = std::abs(end.second - begin.second);
    return std::atan2(hor, ver) * (180/M_PI);
}
