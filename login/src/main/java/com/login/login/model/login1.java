package com.login.login.model;

public class login1 {
    private int phoneno;
    private String name;
    private String email;
   login1(int phoneno,String name,String email)
    {
        this.phoneno=phoneno;
        this.name=name;
        this.email=email;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String toString()
    {
        return phoneno + "  " + name + " " + email;
    }
}

}
