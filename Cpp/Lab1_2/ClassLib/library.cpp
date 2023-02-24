#include "library.h"

#include <cmath>

namespace lib {
    Point::Point(int x, int y) : x(x), y(y){}

    LineSegment::LineSegment(Point begin, Point end) : begin(begin), end(end){}
    LineSegment::LineSegment(int x1, int y1, int x2, int y2) : LineSegment(Point(x1, y1), Point(x2, y2)){}
    LineSegment::LineSegment() : LineSegment(0, 0, 1, 0){}
    LineSegment::LineSegment(LineSegment &o) : LineSegment(o.begin, o.end){}
    LineSegment::~LineSegment(){}

    Point LineSegment::getBegin(){ return this->begin; }
    Point LineSegment::getEnd(){ return this->end; }

    void LineSegment::set(Point begin, Point end){
        this->begin = begin;
        this->end = end;
    }
    void LineSegment::set(int x1, int y1, int x2, int y2){
        this->begin = Point(x1, y1);
        this->end = Point(x2, y2);
    }
    void LineSegment::setBegin(Point begin){ this->begin = begin; }
    void LineSegment::setEnd(Point end){ this->end = end; }
    void LineSegment::setBegin(int x, int y){ this->begin = Point(x, y); }
    void LineSegment::setEnd(int x, int y){ this->end = Point(x, y); }

    double LineSegment::length(){
        return std::sqrt( std::pow(end.x - begin.x, 2) + std::pow(end.y - begin.y, 2) );
    }
    double LineSegment::getAngleRelToOY(){
        return std::atan2(std::abs(end.x - begin.x), std::abs(end.y - begin.y)) * (180/M_PI);
    }

    std::string LineSegment::toString(){
        return "("+std::to_string(begin.x)+", "+std::to_string(begin.y)+")\u2192("+std::to_string(end.x)+", "+std::to_string(end.y)+")";
    }
}
