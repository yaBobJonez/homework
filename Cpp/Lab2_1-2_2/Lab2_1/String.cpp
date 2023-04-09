#include "String.h"

#include <locale>
#include <codecvt>

std::wstring String::toWideString(){
    return std::wstring_convert<std::codecvt_utf8<wchar_t>>().from_bytes(this->value);
}
void String::fromWideString(std::wstring v){
    this->value = std::wstring_convert<std::codecvt_utf8<wchar_t>>().to_bytes(v);
}

String::String(std::string value) : value(value){}
std::size_t String::length(){
    return this->toWideString().length();
}
