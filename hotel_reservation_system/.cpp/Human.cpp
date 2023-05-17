#include "Human.h"
#include "Monster.h"
#include "Services.h"
#include <string>
#include <iostream>
#define roomCost 500
#define spa 100
#define dryCleaning 70
using namespace std ;

Human::Human()
{
}

int numberOfAvailbleRooms1=5;
int totalCost1=0;
int numberOfBookedRooms1;
void Human::newReservation()
{
    cout<<"please enter number of rooms you will book"<<endl;
    int y;
    cin>>numberOfBookedRooms1;
    if(numberOfBookedRooms1>numberOfAvailbleRooms1)
    {
        cout<<"sorry there is no enough rooms"<<endl;;
    }
    else if (numberOfBookedRooms1<numberOfAvailbleRooms1||numberOfBookedRooms1==numberOfAvailbleRooms1)
    {
        cout<<"please enter number of nights you will stay"<<endl;;
        cin>>y;
        totalCost1=(numberOfBookedRooms1*roomCost)*y;
        numberOfAvailbleRooms1-=numberOfBookedRooms1;
        cout<<"the total cost of your reservation is  "<<totalCost1<<endl;
    }
}
void Human::extendReservation()
{
    cout<<"please enter the number of extra nights"<<endl;
    int x;
    cin>>x;
    int y=(numberOfBookedRooms1*roomCost)*x;
    cout<<"the total cost of the new extra nights is  "<<y<<endl;
}
void Human::additionalService()
{
    cout<<"you can choose any additional service from the below Services"<<endl;
    cout<<"press 1 Dry Cleaning for 70$\npress 2 for Spa for 100$"<<endl;
    int input;
    cin>>input;
    switch(input)
    {
    case 1:
        totalCost1+=dryCleaning;
        cout<<"your total cost is "<<totalCost1<<endl;
        break;
    case 2 :
        totalCost1 +=spa;
        cout<<"your total cost is "<<totalCost1<<endl;

        break;
    default:
        cout<<"invalid input"<<endl;
    }
}
void Human::cancelReservation() {
cout<<"Would you like to cancel your whole reservation ? \npress 'Y' for yes 'N' for no"<<endl;
char z;
cin>>z;
switch(z){
case 'y':
case 'Y':
    numberOfAvailbleRooms1+=numberOfBookedRooms1;
    numberOfBookedRooms1=0;
    totalCost1=0;
    break;
case 'N':
case'n':
    break;


}


}





void Human::dis()
{ cout<<"*****************"<<endl;
    cout<<totalCost1<<"\t"<<numberOfAvailbleRooms1<<"\t"<<numberOfBookedRooms1<<endl;


}
