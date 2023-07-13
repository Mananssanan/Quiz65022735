class Student {
    Integer ID;
    String Name;
    Integer addmissionYear;
    Integer GPA;
}

class Stu extends Student {
    private Integer ID;
    private Integer GPA;
    public Stu(Integer ID,String Name,Integer addmissionYear,Integer GPA){
        this.ID = ID;
        this.Name = Name;
        this.addmissionYear = addmissionYear;
        this.GPA = GPA;
    }
    public void GPAchange(Integer GPA){
        this.GPA = GPA;
    }
    public void showDetails(){
        System.out.println("ID: "+this.ID);
        System.out.println("Name: "+this.Name);
        System.out.println("addmissionYear: "+this.addmissionYear);
        System.out.println("GPA: "+this.GPA);
    }
}
class Lab{
    public static void main(String[] args){
        Stu S1 = new Stu (80,"Baifern",9,3);
        S1.showDetails();
        S1.Name = "OSPA";
        S1.GPAchange(3);
        S1.showDetails();
}
}