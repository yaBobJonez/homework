cmake_minimum_required(VERSION 3.24)
project(Lab2_1)

set(CMAKE_CXX_STANDARD 17)

add_executable(Lab2_1
        Lab2_1/main.cpp
        Commons.h
        Lab2_1/LetterString.cpp
        Lab2_1/String.cpp)

add_executable(Lab2_2
        Lab2_2/main.cpp
        Lab2_2/Point.h
        Lab2_2/Circle.cpp
        Lab2_2/Ellipse.cpp)
