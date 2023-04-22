#include "Square.h"

#include <cmath>
#include <stdexcept>

Square::Square(Point p1, Point p2, Point p3, Point p4) : p1(p1), p2(p2), p3(p3), p4(p4){
    auto dist = [](Point f, Point s){
        return std::sqrt(std::pow(s.first - f.first, 2) + std::pow(s.second - f.second, 2));
    };
    if( dist(p1, p3) != dist(p2, p4)
        || dist(p1, p2) != dist(p2, p3)
        || dist(p2, p3) != dist(p3, p4)
        || dist(p3, p4) != dist(p4, p1)
        || dist(p1, p2) == 0
        || dist(p1, p3) == 0) throw std::invalid_argument("Точки не утворюють квадрат!");
    this->side = dist(p1, p2);
}

double Square::area(){
    return std::pow(this->side, 2);
}

double Square::perimeter(){
    return this->side * 4;
}