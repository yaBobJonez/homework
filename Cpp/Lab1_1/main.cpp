#include <iostream>
#include <string>
#include <limits>
#include <vector>
#include "LineSegment.h"

#define reverseAngle(angle) std::abs(90.0 - angle)

int main() {
    std::cout << "Використання програми:\nвведіть 4 цілих числа, наприклад <-2 1 3 -3>,\nабо <exit> щоб вийти." << std::endl;
    while(true){
        std::string cmd; int nums[4];
        std::cout << "> ";
        try{
            if((std::cin >> cmd).fail()) throw std::exception();
            if(cmd == "exit") break;
            else nums[0] = std::stoi(cmd);
            for(int i = 1; i < 4; i++) if((std::cin >> nums[i]).fail()) throw std::exception();
        } catch(std::exception&){
            std::cerr << "Будь ласка, введіть 4 числа." << std::endl;
            std::cin.clear(); std::cin.ignore(1000, '\n');
            continue;
        }
        auto obj = LineSegment(std::make_pair(nums[0], nums[1]), std::make_pair(nums[2], nums[3]));
        printf("(%d, %d) -> (%d, %d)\n", obj.begin.first, obj.begin.second, obj.end.first, obj.end.second);
        printf("Довжина: %.2f\n", obj.getLength());
        printf("Кут між OX: %.2f\n", reverseAngle(obj.getAngleRelToOY()));
    } return 0;
}
