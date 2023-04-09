#ifndef LAB2_1_COMMONS_H
#define LAB2_1_COMMONS_H

#include <string>
#include <iostream>
#include <vector>

std::string _;
#define loop while(true)
#define inputlnOrQuit(var) var = inputln(); if(var=="exit") break;
#define match(v) _ = v;
#define fcase(v) if(_== v)
#define case(v) else if(_== v)
inline void println(std::string s){ std::cout << s << std::endl; }
inline void printErr(std::string s){ std::cerr << s << std::endl; }
inline void print(std::string s){ std::cout << s; }
std::string inputln(){ std::string v; std::getline(std::cin, v); return v; }
std::string inputln(std::string prompt){ print(prompt+": "); return inputln(); }
auto split(std::string string, std::string delim){
    std::string s(string); std::vector<std::string> v;
    std::size_t pos = 0; std::string token;
    while((pos = s.find(delim)) != std::string::npos){
        v.push_back(s.substr(0, pos));
        s.erase(0, pos + delim.length());
    } v.push_back(s);
    return v;
}
bool isDouble(std::string s){
    try{ std::stod(s); }
    catch(std::invalid_argument&){ return false; }
    return true;
} double toDouble(std::string s){ return std::stod(s); }

#endif //LAB2_1_COMMONS_H
