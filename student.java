public class Student {

    private String privateName;
    private String lastName;
    private  int id;

    public Student(String fName, String lName, int ID){
        privateName = fName;
        lastName = lName;
        id = ID;
    }

    public Student(Student other){

        this.privateName = other.privateName;
        this.lastName = other.lastName;
        this.id = other.id;


    }

    public String toString(){

        return (privateName + " " + lastName + "\nID: " + id);
    }

    public String getPrivateName(){return this.privateName;}

    public String getLastName(){return this.lastName;}

    public int getId(){return this.id;}

    public void setPrivateName(String privateName){this.privateName = privateName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void Id (int Id){this.id = Id;}



}
