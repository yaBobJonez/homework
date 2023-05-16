#include "Expression.h"

#include <cmath>
#include "Exceptions.h"

double Expression::eval() {
    if(a*b+2 <= 0) throw LnNotGreaterThanZeroException();
    if(c == 0) throw DivisionByZeroException("c");
    double numerator = std::log(a*b+2)*c;
    double denominator = 41-b/c+1;
    if(denominator == 0) throw DivisionByZeroException("41-b/c+1");
    return numerator / denominator;
}

std::ostream &operator<<(std::ostream &os, const Expression &expr) {
    return os << "ln("<<expr.a<<" * "<<expr.b<<" + 2) * "<<expr.c
        <<"\n-----------------------\n"
        <<"41 - "<<expr.b<<"/"<<expr.c<<" + 1";
}
