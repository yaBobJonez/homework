#ifndef LAB2_1_LETTERSTRING_H
#define LAB2_1_LETTERSTRING_H

#include "String.h"

class LetterString : public String {
public:
    LetterString(std::string s);
    void rsh();
    std::string getString();
};

#endif //LAB2_1_LETTERSTRING_H
