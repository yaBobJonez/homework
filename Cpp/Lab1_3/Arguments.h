#include <string>
#include <stdexcept>

class Arguments {
private:
    std::string* args = nullptr;
    std::size_t size = 0;
    void push_back(std::string s){
        auto buf = new std::string[size+1];
        for(std::size_t i = 0; i < size; i++) buf[i] = args[i];
        if(args != nullptr) delete[] args;
        buf[size++] = s;
        args = buf;
    }
public:
    Arguments(std::string s, std::string delim){
        std::size_t pos = 0;
        std::string token;
        while((pos = s.find(delim)) != std::string::npos){
            push_back(s.substr(0, pos));
            s.erase(0, pos + delim.length());
        } push_back(s);
    }
    bool isDouble(std::size_t i){
        try{ std::stod(args[i]); }
        catch(std::invalid_argument&){ return false; }
        return true;
    } double toDouble(std::size_t i){ return std::stod(args[i]); }
    bool areDoubles(){
        for(std::size_t i = 0; i < size; i++)
            if(!isDouble(i)) return false;
        return true;
    } void toDoubles(double* arr){ for(std::size_t i = 0; i < size; i++) arr[i] = this->toDouble(i); }
    std::string operator[](std::size_t i){
        return args[i];
    }
    std::size_t length(){
        return size;
    }
};
