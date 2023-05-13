#include "Square.h"

#include <cmath>
#include <stdexcept>

template<typename T>
Square<T>::Square(Point<T> p1, Point<T> p3) : p1(p1), p3(p3) {
    if(!std::is_arithmetic<T>::value) throw std::domain_error("Тип точок не є чисельним типом!");
    this->setThis(p1, p3);
}

template<typename T>
T Square<T>::setThis(Point<T> p1, Point<T> p3) {
    if(p1.getX() == p3.getX() && p1.getY() == p3.getY()) throw std::invalid_argument("Квадрат не може бути точкою!");
    this->p1 = p1;
    this->p3 = p3;
    this->p2 = Point<T>( (p1.getX()+p3.getX()+p1.getY()-p3.getY()) / 2,
                         (p1.getY()+p3.getY()+p3.getX()-p1.getX()) / 2 );
    this->p4 = Point<T>( (p1.getX()+p3.getX()+p3.getY()-p1.getY()) / 2,
                         (p1.getY()+p3.getY()+p1.getX()-p3.getX()) / 2 );
    this->pDI = Point<T>( (p1.getX()+p3.getX())/2, (p1.getY()+p3.getY())/2 );
    this->sideLength = std::sqrt( std::pow(this->p2.getX()-p1.getX(), 2) + std::pow(this->p2.getY()-p1.getY(), 2) );
}

template<typename T>
T Square<T>::getPerimeter() {
    return this->sideLength * 4;
}

template<typename T>
T Square<T>::getArea() {
    return this->sideLength * this->sideLength;
}

template class Square<double>;
template class Square<float>;