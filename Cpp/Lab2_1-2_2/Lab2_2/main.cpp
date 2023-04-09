#include <string>
#include <cmath>
#include "../Commons.h"
#include "Circle.h"
#include "Ellipse.h"

void graph(Circle c){
    println("      *****      ");
    println("  **         **  ");
     printf("*         %.2f  *\n", c.getRadius());
    println("*       O-------*");
     printf("*  (%.2f;%.2f)  *\n", c.getX(), c.getY());
    println("  **         **  ");
    println("      *****      ");
     printf("Площа: %.2f\n", c.area());
}

void graph(Ellipse e){
    println("                   *******                   ");
    println("           *****      |      *****           ");
     printf("      ***             | %.2f        **       \n", e.getDirection()? e.getMajorAxis() : e.getMinorAxis());
     printf("  **          %.2f    |        %.2f      **  \n", e.getDistanceToFoci(), e.getDirection()? e.getMinorAxis() : e.getMajorAxis());
    println("*        o------------O============o========*");
     printf("  **(%.2f;%.2f)  (%.2f;%.2f)  (%.2f;%.2f)**  \n", e.getFocus2X(), e.getFocus2Y(), e.getX(), e.getY(), e.getFocus1X(), e.getFocus1Y());
    println("      ***                           ***      ");
    println("           *****             *****           ");
    println("                   *******                   ");
     printf("Площа: %.2f\n", e.area());
     printf("Ексцентриситет: %.2f\n", e.getEccentricity());
}

std::string usage = "Використання:\nc <x> <y> <r> - круг з центром у (x;y) і радіусом r\ne <x> <y> <b> <a> - еліпс з центром у (x;y) "
                    "довжиною малої піввісі b, великої піввісі a\nexit - вийти";

int main() {
    std::cout.precision(3);
    std::string input;
    Circle c = Circle(0,0,1);
    Ellipse e = Ellipse(0,0,1,1);
    println(usage);
    loop {
            inputlnOrQuit(input);
            auto parsed = split(input, " ");
            match(parsed[0]){
                fcase("c"){
                    if(parsed.size() != 4 || !isDouble(parsed[1]) || !isDouble(parsed[2]) || !isDouble(parsed[3]))
                        { printErr("Некоректний формат вводу!"); continue; }
                    try {
                        c = Circle(toDouble(parsed[1]), toDouble(parsed[2]), toDouble(parsed[3]));
                        graph(c);
                    } catch(std::exception){ printErr("Коло не може бути точкою!"); }
                }
                case("e"){
                    if(parsed.size() != 5 || !isDouble(parsed[1]) || !isDouble(parsed[2]) || !isDouble(parsed[3]) || !isDouble(parsed[4]))
                        { printErr("Некоректний формат вводу!"); continue; }
                    try {
                        e = Ellipse(toDouble(parsed[1]), toDouble(parsed[2]), toDouble(parsed[3]), toDouble(parsed[4]));
                        graph(e);
                    } catch(std::exception){ printErr("Еліпс не може бути відрізком!"); }
                }
                case(_) println(usage);
            }
    }
    return 0;
}
