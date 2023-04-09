#ifndef LAB2_1_STRING_H
#define LAB2_1_STRING_H

#include <string>

class String {
protected:
    std::string value;
    std::wstring toWideString();
    void fromWideString(std::wstring v);
public:
    String(std::string value);
    std::size_t length();
};

#endif //LAB2_1_STRING_H
