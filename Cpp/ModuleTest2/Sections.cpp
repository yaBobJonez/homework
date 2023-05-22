#include "Sections.h"

#include <cmath>

Sections::Sections(std::pair<double, double> begin, std::pair<double, double> end) : Lines(begin, end){}

double Sections::getAngleRelToOY() {
    return std::atan2(
            std::abs(end.first - begin.first),
            std::abs(end.second - begin.second)
        ) * (180/M_PI);
}

std::ostream &operator<<(std::ostream &os, Sections o) {
    return os << "("<<o.begin.first<<";"<<o.begin.second<<")----"<<o.getLength()<<"----("<<o.end.first<<";"<<o.end.second<<")" << std::endl
        << "Кут до OY: " << std::abs(o.getAngleRelToOY())<<"\u00b0" << std::endl;
}
