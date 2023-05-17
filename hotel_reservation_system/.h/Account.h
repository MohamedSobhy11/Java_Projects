#ifndef ACCOUNT_H
#define ACCOUNT_H
#include <string>
#include <iostream>
using namespace std ;

class Account
{
public:
    Account();
  // Account(string userName);
    int createAccount();
    void setUsername (string u);
    string getUsername ();

    void setId (int x);
    int getId ();
    int generateId();
    int  getType();
    void setType(int x);
    int findType (int id);
void desplay();

        private:
    string user_name;
    int id;
    int type;


};

#endif // ACCOUNT_H
