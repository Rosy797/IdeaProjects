package com.demoget1.demoget1.model;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Employee {

  int  id;

   String firstName;
   String lastName;
    public  int getid() {

        return id;
    }

    public void setId(int id) {
      this. id = id;
    }

    public  String getfirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
      this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Employee [Id=" + id + ", FirstName=" + firstName+ " , Lastname=" + lastName +"]";
    }

}
