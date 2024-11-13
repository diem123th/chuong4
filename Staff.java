public class Staff extends Person{
    String school;
    double pay;
    Staff(String name,String address,String school,double pay){
        super(name, address);
        this.school=school;
        this.pay=pay;
    }
    String getSchool(){
        return school;
    }
    void setSchool(String school){
        this.school=school;
    }
    double getPay(){
        return pay;
    }
    void setPay(double pay){
        this.pay=pay;
    }
    public String toString() {
        return "Staff[Person[name="+",address="+"],school="+",pay="+"]";
    }
}
