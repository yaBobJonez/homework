#ifndef LAB2_7_2_8_EXPRESSION_H
#define LAB2_7_2_8_EXPRESSION_H

#include <ostream>

class Expression {
protected:
    double a, b, c;
public:
    Expression(double a, double b, double c) : a(a), b(b), c(c){}
    Expression() : a(1), b(1), c(1){}
    void setA(double v){ this->a = v; }
    void setB(double v){ this->b = v; }
    void setC(double v){ this->c = v; }
    double eval();
    friend std::ostream& operator<<(std::ostream &os, const Expression &expr);
};

#endif //LAB2_7_2_8_EXPRESSION_H
