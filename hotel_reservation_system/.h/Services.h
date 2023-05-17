#ifndef SERVICES_H
#define SERVICES_H

#include "Account.h"
#include "Services.h"
class Services
{
public:
    Services();
    virtual void  newReservation()=0;
    void extendReservation();
     void additionalService() ;
     void cancelReservation() ;

};

#endif // SERVICES_H
