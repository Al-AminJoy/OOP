package oop;

public class StudentClass {
  String name;
  int id,sec;
  StudentClass(){
   
}
StudentClass(String name,int id,int sec){
    this.name=name;
    this.id=id;
    this.sec=sec;
}
void showUsingConstruct(){
    System.out.println(name);
    System.out.println(id);
    System.out.println(sec);
}
void showInfo(String stdName,int stdId,int stdSec){
     System.out.println(stdName);
    System.out.println(stdId);
    System.out.println(stdSec);
}

void show(){
    System.out.println(name);
    System.out.println(id);
    System.out.println(sec);
}
int returnValue(){
    int result;
    result=id*sec;
    return result;
}
}
