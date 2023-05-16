#ifndef LAB2_7_2_8_EXCEPTIONS_CPP
#define LAB2_7_2_8_EXCEPTIONS_CPP

#include <string>
#include <exception>

class LnNotGreaterThanZeroException : std::exception {
public:
    const char* what() {
        return "Натуральний логарифм менше або дорівнює нулю!";
    }
};

class DivisionByZeroException : std::exception {
protected:
    std::string message;
public:
    DivisionByZeroException(std::string message) : message(message){}
    const char* what(){
        return (new std::string("Знаменник \"" + message + "\" дорівнює нулю!"))->c_str();
    }
};

#endif //LAB2_7_2_8_EXCEPTIONS_CPP
