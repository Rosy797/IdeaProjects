public class Contact {
    private int phoneno;
    private String name;
    private String email;
    Contact(int phoneno, String name, String email)
    {
        this.phoneno=phoneno;
        this.name=name;
        this.email=email;

    }
    public int getPhoneno()
    {
        return phoneno;
    }
    public String getname()
    {
        return name;
    }
    public String getemail()
    {
        return email;
    }
    public String toString()
    {
        return phoneno+" "+name+" "+email;
    }
}
