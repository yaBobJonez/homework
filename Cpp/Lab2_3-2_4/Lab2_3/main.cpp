#include "../Commons.h"
#include "Circle.h"
#include "Square.h"

void graph(Circle* c, double area, double perimeter){
    println("      *****      ");
    println("  **         **  ");
     printf("*         %5.2f *\n", c->getRadius());
    println("*       O-------*");
     printf("*   %7.2f     *\n", area);
    println("  **         **  ");
    println("      *****      ");
     printf("Периметр: %.2f\n", perimeter);
}

void graph(Square* s, double area, double perimeter){
     printf("%.1f;%.1f               %.1f;%.1f\n", s->getP2().first, s->getP2().second, s->getP3().first, s->getP3().second);
    println("       ┍━━━━━━━━━━━━┑");
    println("       ┃            ┃");
     printf("       ┃  %7.2f   ┃\n", area);
    println("       ┃            ┃");
    println("       ┕━━━━━━━━━━━━┙");
    printf("%.1f;%.1f               %.1f;%.1f\n", s->getP1().first, s->getP1().second, s->getP4().first, s->getP4().second);
    printf("Периметр: %.2f\n", perimeter);
}

void graph(Shape* sh){
    double area = sh->area();
    double perimeter = sh->perimeter();
    if(Circle* c = dynamic_cast<Circle*>(sh)) graph(c, area, perimeter);
    else graph(static_cast<Square*>(sh), area, perimeter);
}

std::string usage = "Використання:\nc <r> - круг з радіусом r\ns <x1>,<y1> <x2>,<y2> <x3>,<y3> <x4>,<y4> - квадрат за "
                    "заданими точками\nexit - вийти";

int main() {
    std::cout.precision(3);
    std::string input;
    Shape* sh;
    println(usage);
    loop {
        inputlnOrQuit(input);
        auto parsed = split(input, " ");
        match(parsed[0]){
            fcase("c"){
                if(parsed.size() != 2 || !isDouble(parsed[1])){ printErr("Некоректний формат вводу!"); continue; }
                try {
                    sh = new Circle(toDouble(parsed[1]));
                    graph(sh);
                    delete sh;
                } catch(std::exception&){ printErr("Коло не може бути точкою!"); }
            }
            case("s"){
                if(parsed.size() != 5){ printErr("Некоректний формат вводу!"); continue; }
                try {
                    auto getArg = [](std::string pair){
                        auto parsedArg = split(pair, ",");
                        if(parsedArg.size() != 2 || !isDouble(parsedArg[0]) || !isDouble(parsedArg[1]))
                            throw std::invalid_argument("Недопустимі аргументи!");
                        return std::pair<double, double>{toDouble(parsedArg[0]), toDouble(parsedArg[1])};
                    };
                    sh = new Square(getArg(parsed[1]), getArg(parsed[2]), getArg(parsed[3]), getArg(parsed[4]));
                    graph(sh);
                    delete sh;
                } catch(std::exception& e){ printErr(e.what()); }
            }
            case(_) println(usage);
        }
    }
    return 0;
}
