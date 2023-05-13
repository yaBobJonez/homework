#ifndef LAB2_5_2_7_SQUARE_H
#define LAB2_5_2_7_SQUARE_H

#include "Point.h"

template<typename T>
class Square {
protected:
    /*
     *  2 _______ 3
     *    | DI  |   - Diagonal intersection
     *  1 |_____| 4
     */
    Point<T> p1, p2, p3, p4, pDI;
    T sideLength;
public:
    Square(Point<T> p1, Point<T> p3);
    T getSideLength(){ return this->sideLength; }
    Point<T> getDiagIntersect(){ return this->pDI; }
    T getPerimeter();
    T getArea();
    T setThis(Point<T> p1, Point<T> p3);
    Point<T> getP1(){ return this->p1; }
    Point<T> getP2(){ return this->p2; }
    Point<T> getP3(){ return this->p3; }
    Point<T> getP4(){ return this->p4; }
};

#endif //LAB2_5_2_7_SQUARE_H
