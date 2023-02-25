#include <iostream>
#include <ctime>

#include "Arguments.h"
#include "library.h"
using lib::LineSegment;

void program1(){
    LineSegment line = LineSegment(0, 0, 0, 0);
    std::cout << "Використання:\nвведіть координати точок відрізка через кому, наприклад: <1, 2, 3, 4>\nабо <exit> для виходу із програми." << std::endl;
    std::string input;
    while(getline(std::cin, input) && input != "exit"){
        Arguments args(input, ",");
        if(args.length() != 4 || !args.areInts()){
            std::cerr << "Некоректний формат вводу!" << std::endl;
            continue;
        } int arr[4];
        args.toInts(arr);
        if(arr[0] == arr[2] && arr[1] == arr[3]){
            std::cerr << "Точка не є відрізком, кінці не можуть збігатись!" << std::endl;
            continue;
        } line.set(arr[0], arr[1], arr[2], arr[3]);
        std::cout << line.toString() << std::endl;
        std::cout << "Довжина відрізка: " << line.length() << std::endl;
        std::cout << "Кут відносно OX: " << std::abs(90 - line.getAngleRelToOY()) << std::endl;
    }
}

void mirrorArray(LineSegment* arr){
    for(std::size_t i = 18; i > 9; i--) arr[i] = LineSegment(arr[18-i]);
}
void program2(){
    LineSegment lss[19];
    int i = -1;
    auto lambda = [&i](){
        i += 2; return lib::Point(i + std::time(0)%2, i + std::time(0)%3);
    };
    for(std::size_t i = 0; i < 9; i++) lss[i] = LineSegment(lambda(), lambda());
    mirrorArray(lss);
    lss[9] = LineSegment();
    for(LineSegment ls : lss) std::cout << ls.toString() << std::endl;
}

int main() {
    std::cout.precision(3);
    std::cout << "Вітаємо Вас," << std::endl;
    std::string input = "";
    while(input != "3"){
        std::cout << "Виберіть програму для запуску:\n1. Програма 1\n2. Програма 2\n3. Вихід\n> ";
        getline(std::cin, input);
        if(input == "1") program1();
        else if(input == "2") program2();
        else if(input == "3") break;
        else std::cerr << "Будь ласка, виберіть число.\n";
    } return 0;
}
