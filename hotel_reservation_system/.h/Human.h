#ifndef HUMAN_H
#define HUMAN_H
#include "Account.h"
#include "Services.h"
#include <string>
#include <iostream>
#include "Monster.h"
using namespace std ;
class Human : public Services
{
public:
    Human();
      void newReservation();
    void extendReservation() ;
    void additionalService() ;
    void cancelReservation() ;
void dis();


};

#endif // HUMAN_H
