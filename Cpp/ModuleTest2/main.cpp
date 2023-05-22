#include <iostream>
#include "Sections.h"

/*
 * Варіант 5
 * Створіть базовий клас. Lines: координати початку і кінця, конструктор з параметрами, метод розрахунку довжини лінії.
 * Визначте похідний клас. Sections: конструктор з параметрами, метод обчислення кута між відрізком і віссю ОY, метод виведення даних.
 * Завдання: оголосити об'єкт похідного класу; обчисліть довжину і кут з віссю ОY.
 */

int main() {
    std::cout.precision(3);
    try {
        Sections s1 = Sections({2, 2}, {2, 2});
    } catch(std::invalid_argument& e){
        std::cerr << e.what() << std::endl;
    }
    Sections s2 = Sections({2, 4}, {-5, 8.5});
    std::cout << s2 << std::endl;
    return 0;
}
