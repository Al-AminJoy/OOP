package oop;

public class OOP {

    public static void main(String[] args) {
      
      String name="Al-Amin";
      int id=201700268;
      int sec=02;
      //Declare and initialize student class
      StudentClass student=new StudentClass();
      //direct access classes variables and methods
     /* student.name=name;
      student.id=id;
      student.sec=sec;
      student.show();
      */
     //Using Perameterized Methd
    // student.showInfo(name, id, sec);
    
    //Method Using Constructor
     StudentClass student2=new StudentClass(name,id,sec);
     student2.showUsingConstruct();
     //Get Returned Value From Method
     
    int value=student2.returnValue();
     System.out.println("Result : "+value);
    }
    
}
