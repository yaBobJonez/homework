#include <iostream>

#include "Arguments.h"
#include "library.h"
using lib::LineSegment;
using lib::toString;

int main() {
    std::cout.precision(3);
    LineSegment line1, line2, line3;
    std::cout << "Використання:\nвводьте координати точок відрізків через кому, наприклад: <1.2, 2.8, 3, 4.1>\n"
                 "або <exit> для виходу із програми." << std::endl;
    std::string input1, num, input2, action;
    while(getline(std::cin, input1) && input1 != "exit"){
        Arguments args1(input1, ",");
        if(args1.length() != 4 || !args1.areDoubles()){
            std::cerr << "Некоректний формат вводу!" << std::endl;
            continue;
        } double arr1[4];
        args1.toDoubles(arr1);
        line1.set(arr1[0], arr1[1], arr1[2], arr1[3]);
        std::cout << "Оберіть дію:\n0) Все одразу\n1) Перемножити на число\n2) Додати інший відрізок\n3) Порівняти з іншим відрізком\n"
                     "4) Декрементувати (зсув)\n5) Перевірити на точку\nexit) Вийти" << std::endl;
        if(getline(std::cin, action) && action == "exit") break;
        if(action.length() != 1 || action[0] < '0' || action[0] > '5'){
            std::cerr << "Некоректний формат вводу!" << std::endl;
            continue;
        } int a = std::stoi(action);
        double n = 1; double arr2[4];
        if(a<= 1){
            std::cout << "Введіть число: ";
            getline(std::cin, num);
            if(num == "exit") break;
            Arguments numArg(num, " ");
            if(numArg.length() != 1 || !numArg.isDouble(0)){
                std::cerr << "Некоректний формат вводу!" << std::endl;
                continue;
            } n = numArg.toDouble(0);
        } if(a== 0 || a== 2 || a== 3){
            if(getline(std::cin, input2) && input2 == "exit") break;
            Arguments args2(input2, ",");
            if(args2.length() != 4 || !args2.areDoubles()){
                std::cerr << "Некоректний формат вводу!" << std::endl;
                continue;
            } args2.toDoubles(arr2);
            line2.set(arr2[0], arr2[1], arr2[2], arr2[3]);
        } if(a== 0 || a== 1){
            std::cout << line1.toString() <<" \u00D7 "<<toString(n) <<" => "<< (line1 * n).toString() << std::endl;
        } if(a== 0 || a== 2){
            std::cout << line1.toString() <<" + "<< line2.toString() <<" => "<< (line1 + line2).toString() << std::endl;
        } if(a== 0 || a== 3){
            std::cout << line1.toString() <<" < "<< line2.toString() <<" ? "<< (line1 < line2? "Так":"Ні") << std::endl;
        } if(a== 0 || a== 4){
            std::cout << "Відрізок_3 = "<< line1.toString() <<"-- :" << std::endl;
            line3 = line1--;
            std::cout << "Відрізок 1: " << line1.toString() << std::endl;
            std::cout << "Відрізок 3: " << line3.toString() << std::endl;
        } if(a== 0 || a== 5){
            std::cout << line1.toString() <<" є точкою? "<< (!line1? "Ні":"Так") << std::endl;
        }
    }
    return 0;
}
