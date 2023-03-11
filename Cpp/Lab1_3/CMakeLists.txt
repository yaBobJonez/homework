cmake_minimum_required(VERSION 3.24)
project(Lab1_3)

set(CMAKE_CXX_STANDARD 17)

add_subdirectory(ClassLib)

include_directories(ClassLib)
add_executable(Lab1_3 main.cpp Arguments.h)
target_link_libraries(Lab1_3 ClassLib)
