#include "library.h"

#include <cmath>
#include <sstream>

namespace lib {
    std::string toString(double val){ std::ostringstream oss; oss.precision(2); oss<<std::fixed<<val; return oss.str(); };

    Point::Point(double x, double y) : x(x), y(y){}

    LineSegment::LineSegment(Point begin, Point end) : begin(begin), end(end){}
    LineSegment::LineSegment(double x1, double y1, double x2, double y2) : LineSegment(Point(x1, y1), Point(x2, y2)){}
    LineSegment::LineSegment() : LineSegment(0, 0, 1, 0){}
    LineSegment::LineSegment(LineSegment &o) : LineSegment(o.begin, o.end){}
    LineSegment::~LineSegment(){}

    Point LineSegment::getBegin(){ return this->begin; }
    Point LineSegment::getEnd(){ return this->end; }

    void LineSegment::set(Point begin, Point end){
        this->begin = begin;
        this->end = end;
    }
    void LineSegment::set(double x1, double y1, double x2, double y2){
        this->begin = Point(x1, y1);
        this->end = Point(x2, y2);
    }
    void LineSegment::setBegin(Point begin){ this->begin = begin; }
    void LineSegment::setEnd(Point end){ this->end = end; }
    void LineSegment::setBegin(double x, double y){ this->begin = Point(x, y); }
    void LineSegment::setEnd(double x, double y){ this->end = Point(x, y); }

    double LineSegment::length(){
        return std::sqrt( std::pow(end.x - begin.x, 2) + std::pow(end.y - begin.y, 2) );
    }
    double LineSegment::getAngleRelToOY(){
        return std::atan2(std::abs(end.x - begin.x), std::abs(end.y - begin.y)) * (180/M_PI);
    }

    std::string LineSegment::toString(){
        return "("+::lib::toString(begin.x)+", "+::lib::toString(begin.y)+")\u2192("+::lib::toString(end.x)+", "+::lib::toString(end.y)+")";
    }

    LineSegment LineSegment::operator--(int){
        LineSegment copy = *this;
        this->set(this->getBegin()-Point(1,1), this->getEnd()-Point(1,1));
        return copy;
    }
    bool LineSegment::operator!(){
        return this->length() != 0.0;
    }
    LineSegment operator*(LineSegment lhv, double rhv){
        return {lhv.getBegin() * rhv, lhv.getEnd() * rhv};
    }
    LineSegment operator*(double rhv, LineSegment lhv){ return lhv * rhv; }
    LineSegment operator+(LineSegment lhv, LineSegment rhv){
        return {lhv.getBegin(), lhv.getEnd() + rhv.length()};
    }
    bool operator<(LineSegment lhv, LineSegment rhv){
        return lhv.length() < rhv.length();
    }
}
