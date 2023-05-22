#ifndef MODULETEST2_SECTIONS_H
#define MODULETEST2_SECTIONS_H

#include <ostream>
#include "Lines.h"

class Sections : Lines {
public:
    Sections(std::pair<double, double> begin, std::pair<double, double> end);
    double getAngleRelToOY();
    friend std::ostream &operator<<(std::ostream &os, Sections o);
};

#endif //MODULETEST2_SECTIONS_H
