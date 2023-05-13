#include <string>
#include <iostream>
#include "Commons.h"
#include "Square.h"

std::string usage = "Використання:\nd <x1>,<y1> <x3>,<y3> - квадрат типу double\n"
                    "f <x1>,<y1> <x3>,<y3> - квадрат типу float\nexit - вийти";

template<typename T>
Point<T> getArg(std::string pair){
    auto parsedArg = split(pair, ",");
    if(parsedArg.size() != 2 || !isDouble(parsedArg[0]) || !isDouble(parsedArg[1]))
        throw std::invalid_argument("Недопустимі аргументи!");
    if(std::is_same<T, double>::value) return Point<T>(toDouble(parsedArg[0]), toDouble(parsedArg[1]));
    else if(std::is_same<T, float>::value) return Point<T>(toFloat(parsedArg[0]), toFloat(parsedArg[1]));
    else throw std::invalid_argument("Некоректний формат вводу!");
}

template<typename T>
void graph(Square<T> s){
     printf("%.1f;%.1f              %.1f;%.1f\n", s.getP2().getX(), s.getP2().getY(), s.getP3().getX(), s.getP3().getY());
    println("       ┍━━━━━━━━━━━━┑");
    println("       ┃            ┃");
     printf("       ┃%5.1f;%5.1f ┃ %.2f\n", s.getDiagIntersect().getX(), s.getDiagIntersect().getY(), s.getSideLength());
    println("       ┃            ┃");
    println("       ┕━━━━━━━━━━━━┙");
    printf("%.1f;%.1f              %.1f;%.1f\n", s.getP1().getX(), s.getP1().getY(), s.getP4().getX(), s.getP4().getY());
    printf("Периметр: %.2f\n", s.getPerimeter());
    printf("Площа: %.2f\n", s.getArea());
}

int main() {
    std::cout.precision(3);
    std::string input;
    Square<double> d(Point<double>(0,0), Point<double>(1,1));
    Square<float> f(Point<float>(0,0), Point<float>(1,1));
    println(usage);
    loop {
        inputlnOrQuit(input);
        auto parsed = split(input, " ");
        if(parsed.size() != 3){ printErr("Некоректний формат вводу!"); continue; }
        match(parsed[0]){
            fcase("d"){
                try {
                    d = Square(getArg<double>(parsed[1]), getArg<double>(parsed[2]));
                    graph(d);
                } catch(std::exception& e){ printErr(e.what()); }
            }
            case("f"){
                try {
                    f = Square(getArg<float>(parsed[1]), getArg<float>(parsed[2]));
                    graph(f);
                } catch(std::exception& e){ printErr(e.what()); }
            }
            case(_) println(usage);
        }
    }
    return 0;
}
