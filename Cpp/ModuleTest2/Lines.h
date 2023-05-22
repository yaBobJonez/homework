#ifndef MODULETEST2_LINES_H
#define MODULETEST2_LINES_H

#include <utility>
#include <stdexcept>

class Lines {
protected:
    std::pair<double, double> begin, end;
public:
    Lines(std::pair<double, double> begin, std::pair<double, double> end);
    double getLength();
};

#endif //MODULETEST2_LINES_H
