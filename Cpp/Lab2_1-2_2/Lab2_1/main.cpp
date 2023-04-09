#include "../Commons.h"
#include "LetterString.h"

std::string usage = "Використання:\nnew - новий рядок\nshow - вивести рядок\nlen - вивести довжину\nrsh - зсунути праворуч\nexit - вийти";

int main() {
    std::string input;
    println(usage);
    LetterString str = LetterString("");
    loop {
        inputlnOrQuit(input);
        match(input){
            fcase("new"){
                try{ str = LetterString(inputln()); }
                catch(std::exception){ printErr("Рядок містить не лише літери!"); }
            }
            case("show") println("Значення: "+str.getString());
            case("len") println("Довжина: "+std::to_string(str.length()));
            case("rsh") str.rsh();
            case(_) println(usage);
        }
    }
    return 0;
}
