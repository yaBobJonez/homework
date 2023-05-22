#include "Lines.h"

#include <cmath>

Lines::Lines(std::pair<double, double> begin, std::pair<double, double> end)
        : begin(begin), end(end){
    if(begin.first == end.first && begin.second == end.second)
        throw std::invalid_argument("Лінія не може бути задана точкою.");
}

double Lines::getLength(){
    return std::sqrt(std::pow(end.first - begin.first, 2) + std::pow(end.second - begin.second, 2));
}
