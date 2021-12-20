package com.example.demoget.model;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Employee {

        private int Id;

        private String FirstName;
        private String LastName;

        public int getId() {
                return Id;
        }

        public void setId(String Id) {
                this.Id = id;
        }

        public String FirstName() {
                return FirstName;
        }

        public void setFirstName(String firstName) {
                this.FirstName = firstName;
        }
        public String LastName() {
                return LastName;
        }

        public void setLastName(String lastName) {
                this.LasttName =lastName;
        }

        @Override
        public String toString() {
                return "Employee [Id=" + Id + ", FirstName=" + FirstName+ " , Lastname=" + LastName]";
        }

}

