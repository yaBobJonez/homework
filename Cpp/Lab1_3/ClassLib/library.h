#ifndef CLASSLIB_H
#define CLASSLIB_H

#include <string>

namespace lib {
    std::string toString(double val);

    struct Point {
        double x, y;
        Point(double x, double y);
        Point operator-(Point const& offset){ return Point(this->x-offset.x, this->y-offset.y); }
        Point operator*(double scale){ return Point(this->x*scale, this->y*scale); }
        Point operator+(double size){ return Point(this->x+size, this->y+size); }
    };

    class LineSegment {
    private:
        Point begin, end;
    public:
        LineSegment(Point begin, Point end);
        LineSegment(double x1, double y1, double x2, double y2);
        LineSegment();
        LineSegment(LineSegment &o);
        ~LineSegment();
        Point getBegin();
        Point getEnd();
        void set(Point begin, Point end);
        void set(double x1, double y1, double x2, double y2);
        void setBegin(Point begin);
        void setBegin(double x, double y);
        void setEnd(Point end);
        void setEnd(double x, double y);
        double length();
        double getAngleRelToOY();
        std::string toString();
        LineSegment operator--(int);
        bool operator!();
    };

    LineSegment operator*(LineSegment lhv, double rhv);
    LineSegment operator*(double lhv, LineSegment rhv);
    LineSegment operator+(LineSegment lhv, LineSegment rhv);
    bool operator<(LineSegment lhv, LineSegment rhv);
}

#endif //CLASSLIB_H
