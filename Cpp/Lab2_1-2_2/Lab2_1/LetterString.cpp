#include "LetterString.h"

#include <regex>

LetterString::LetterString(std::string s) : String(s) {
    std::wregex anyButThese(L"[^a-zA-Zа-яА-Яіїґєёéèêęíìîáàâãąäóòôöúùûçćś]", std::regex_constants::icase);
    if(std::regex_search(this->toWideString(), anyButThese))
        throw std::invalid_argument("Рядок містить не лише літери");
}
void LetterString::rsh(){
    std::wstring v = this->toWideString();
    if(v==L"") return;
    wchar_t last = v[this->length()-1];
    v.pop_back(); v = last+v;
    this->fromWideString(v);
}
std::string LetterString::getString(){
    return this->value;
}
