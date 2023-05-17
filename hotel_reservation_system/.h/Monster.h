#ifndef MONSTER_H
#define MONSTER_H
#include "Services.h"
#include <string>
#include <iostream>
using namespace std ;

class Monster: public Services
{
public:
    Monster();

    void newReservation();
    void extendReservation() ;
    void additionalService() ;
    void cancelReservation() ;
void dis();


};

#endif // MONSTER_H
