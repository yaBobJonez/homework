cmake_minimum_required(VERSION 3.24)
project(ModuleTest2)

set(CMAKE_CXX_STANDARD 17)

add_executable(ModuleTest2 main.cpp Lines.cpp Lines.h Sections.cpp Sections.h)
