#include "Monster.h"
#include "Services.h"
#include <string>
#include <iostream>
#define roomCost 200
#define spa 50
#define dryCleaning 30

using namespace std ;
Monster::Monster()
{

}
int numberOfAvailbleRooms=15;
int totalCost=0;
int numberOfBookedRooms;
void Monster::newReservation()
{
    cout<<"please enter number of rooms you will book"<<endl;
    int y;
    cin>>numberOfBookedRooms;
    if(numberOfBookedRooms>numberOfAvailbleRooms)
    {
        cout<<"sorry there is no enough rooms"<<endl;;
    }
    else
    {
        cout<<"please enter number of nights you will stay"<<endl;;
        cin>>y;
        totalCost=(numberOfBookedRooms*roomCost)*y;
        numberOfAvailbleRooms-=numberOfBookedRooms;
        cout<<"the total cost of your reservation is  "<<totalCost<<endl;
    }
}
void Monster::extendReservation()
{
    cout<<"please enter the number of extra nights"<<endl;
    int x;
    cin>>x;
    int y=(numberOfBookedRooms*roomCost)*x;
    cout<<"the total cost of the new extra nights is  "<<y<<endl;
}
void Monster::additionalService()
{
    cout<<"you can choose any additional service from the below Services"<<endl;
    cout<<"press 1 Dry Cleaning for 30$\npress 2 for Spa for 50$"<<endl;
    int input;
    cin>>input;
    switch(input)
    {
    case 1:
        totalCost+=dryCleaning;
        cout<<"your total cost is "<<totalCost<<endl;
        break;
    case 2 :
        totalCost +=spa;
        cout<<"your total cost is "<<totalCost<<endl;

        break;
    default:
        cout<<"invalid input"<<endl;
    }
}
void Monster::cancelReservation() {
cout<<"Would you like to cancel your whole reservation ? /npress 'Y' for yes 'N' for no"<<endl;
char z;
cin>>z;
switch(z){
case 'y':
case 'Y':
    numberOfAvailbleRooms+=numberOfBookedRooms;
    numberOfBookedRooms=0;
    totalCost=0;
    break;
case 'N':
case'n':
    break;


}


}





void Monster::dis()
{ cout<<"*****************"<<endl;
    cout<<totalCost<<"\t"<<numberOfAvailbleRooms<<"\t"<<numberOfBookedRooms<<endl;


}

