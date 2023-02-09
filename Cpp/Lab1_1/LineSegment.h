#ifndef LAB1_1_LINESEGMENT_H
#define LAB1_1_LINESEGMENT_H

#include <utility>

class LineSegment {
public:
    std::pair<int, int> begin, end;
    LineSegment(std::pair<int, int> begin, std::pair<int, int> end);
    double getLength();
    double getAngleRelToOY();
};

#endif //LAB1_1_LINESEGMENT_H
