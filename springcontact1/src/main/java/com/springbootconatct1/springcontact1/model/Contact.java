package com.springbootconatct1.springcontact1.model;

 import lombok.Getter;
        import lombok.Setter;

@Getter
@Setter
public class Contact {
    public static String name;
    public  static String phoneno;
    public static String emailid;


    public static String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static String  getPhoneno() {
        return phoneno;

    }
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    public static String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public Contact() {
        super();
        this.name = name;
        this.phoneno = phoneno;
        this.emailid = emailid;
    }
    @Override
    public String toString() {
        return "Contact [ name=" + name + ", phone=" + phoneno + ", email=" + emailid + "]";
    }




}

