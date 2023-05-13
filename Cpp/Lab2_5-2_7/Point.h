#ifndef LAB2_5_2_7_POINT_H
#define LAB2_5_2_7_POINT_H

template<typename T>
class Point {
protected:
    T x, y;
public:
    Point(T x, T y) : x(x), y(y){}
    Point() : x(0), y(0){}
    T getX(){ return this->x; }
    T getY(){ return this->y; }
};

#endif //LAB2_5_2_7_POINT_H
