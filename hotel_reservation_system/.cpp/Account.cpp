#include "Account.h"
#include <iostream>
#include <string>
#include <algorithm>
#include <list>
using namespace std;


list<int>ids2= {1,2,3} ;//fused in generating id
int ids1[100]={1,2,3};//some ids for testing
list<string>userNames;
int types[100]={1,2,2};
int i=0; //used in array of ids1
int j=0;  //used in array of types
Account::Account()
{

}



int Account::createAccount()
{

    string x;
    cout<<"please enter your name \n";;
    cin>>x;
    Account::setUsername(x);
    cout<<"please enter your type \n ( 1 for human 2 for monster) \n";;
    int y;
    cin>>y;
    types[j]=y;
    j++;
    Account::setType(y);
    Account::generateId();
    return y;
}
void Account::setUsername(string s)
{
    user_name=s;
    userNames.push_back(s);
}

string Account::getUsername()
{
    return user_name;
}
int Account::getId()
{
    return id;
}
void Account::setId(int x)
{
    id=x;
}
int Account::generateId()
{
    ids2.push_back((ids2.back())+1);
    int x =ids2.back();
    cout<<"your Id is "<<x<<endl;
    ids1[i]=x;
    i++;

}
int Account::getType()
{
    return type;
}
void Account::setType(int x)
{
    type=x;
}

int Account::findType(int id)//this function checks if the given id belongs to human or monster
{
    int it=0;
    for(int i=0; i<100; i++)
    {
        if(ids1[i]==id)
        {
            it=i;
        return types[it];//it returns 1 if its human and 2 if its monster
        }

    }

}




