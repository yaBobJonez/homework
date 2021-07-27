#include <iostream>
#include <ctime>

using namespace std;

int main(int argc, char const *argv[])
{
    time_t tempCalendar = time(0);
    tm* calendar = localtime(&tempCalendar);
    int currDay = calendar->tm_mday;
    int currMonth = calendar->tm_mon;
    int countDay = 1;
    tm tempTmStruct = {0, 0, 0, countDay, calendar->tm_mon, calendar->tm_year};
    time_t tempFirstDayInMonth = mktime(&tempTmStruct);
    calendar = localtime(&tempFirstDayInMonth);
    int weekday = calendar->tm_wday;
    cout << "   SUN   MON   TUE   WED   THU   FRI   SAT" << endl;
    for(int i = 0; i < weekday; i++) cout << "      ";
    do{
        int day = calendar->tm_mday;
        printf("%5d", day);
        if(day == currDay) cout << "*";
        else cout << " ";
        if(weekday == 6) cout << endl;
        countDay++;
        tempTmStruct = {0, 0, 0, countDay, calendar->tm_mon, calendar->tm_year};
        tempFirstDayInMonth = mktime(&tempTmStruct);
        calendar = localtime(&tempFirstDayInMonth);
        weekday = calendar->tm_wday;
    } while(calendar->tm_mon == currMonth);
    return 0;
}
