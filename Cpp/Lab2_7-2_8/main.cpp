#include <iostream>
#include <vector>
#include "Expression.h"
#include "Exceptions.h"
#include "Commons.h"

std::string usage = "Використання:\nвводьте триплети чисел, значень a, b, c; завершуючи <EOF>\nexit - вийти";

int main() {
    std::vector<std::array<double, 3>> list;
    std::string input;
    println(usage);
    loop {
        list.clear();
        loop {
            input = inputln();
            if(input == "exit") return 0;
            if(input == "EOF") break;
            auto parsed = split(input, " ");
            if(parsed.size() != 3 || !isDouble(parsed[0]) || !isDouble(parsed[1]) || !isDouble(parsed[2]))
                { printErr("Недопустимі аргументи!"); break; }
            std::array<double, 3> data{};
            data[0] = toDouble(parsed[0]);
            data[1] = toDouble(parsed[1]);
            data[2] = toDouble(parsed[2]);
            list.push_back(data);
        }
        for(auto el : list){
            try {
                std::cout << Expression(el[0], el[1], el[2]).eval() << std::endl;
            } catch(LnNotGreaterThanZeroException& e){
                std::cerr << e.what() << std::endl;
            } catch(DivisionByZeroException& e){
                std::cerr << e.what() << std::endl;
            }
        }
    }
    return 0;
}
