#ifndef CLASSLIB_H
#define CLASSLIB_H

#include <string>

namespace lib {
    struct Point {
        int x, y;
        Point(int x, int y);
    };

    class LineSegment {
    private:
        Point begin, end;
    public:
        LineSegment(Point begin, Point end);
        LineSegment(int x1, int y1, int x2, int y2);
        LineSegment();
        LineSegment(LineSegment &o);
        ~LineSegment();
        Point getBegin();
        Point getEnd();
        void set(Point begin, Point end);
        void set(int x1, int y1, int x2, int y2);
        void setBegin(Point begin);
        void setBegin(int x, int y);
        void setEnd(Point end);
        void setEnd(int x, int y);
        double length();
        double getAngleRelToOY();
        std::string toString();
    };
}

#endif //CLASSLIB_H
