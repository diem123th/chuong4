public class Student extends Person{
    public String program;
    int year;
    double fee;
   public Student(String name, String address,String program,int year,double fee){
       super(name, address);
    }
    String getProgram(){
       return program;
    }
    void setProgram(String program){
       this.program=program;
    }
    int getYear(){
       return year;
    }
    void  setYear(int year){
       this.year=year;
    }
    double getFee(){
       return fee;
    }
    void setFee(double fee){
       this.fee=fee;
    }
    public String toString() {
        return "Student[Person[name="+",address="+"],program="+",year="+",fee="+"]";
    }
}
