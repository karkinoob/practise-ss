package java;

public class SeniorDeveloper extends Developer {
    private double salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;

public SeniorDeveloper(String platform,String interviewerName,double workingHour,double salary,int contractPeriod){
    super(platform, interviewerName, workingHour);
    this.salary = salary;
    this.joiningDate = "";
    this.staffRoomNumber = "";
    this.contractPeriod = contractPeriod;
    this.advanceSalary = 0.0;
    this.appointed = false;
    this.terminated = false;
}



public double getSalary(){
    return salary;

 }
 public String getJoiningDate(){
    return joiningDate;

 }
 public String getStaffRoomNumber(){
    return staffRoomNumber;

 }
 public double getContactPeriod(){
    return contractPeriod;

 }
 public double getAdvanceSalary(){
    return advanceSalary;

 }
 public boolean getAppointed(){
    return appointed;

 }
 public boolean getTerminated(){
    return terminated;

 }
 public void setSalary( double salary){
    this.salary = salary;

 }
 public void setContractPeriod( int contractPeriod){
    this.contractPeriod = contractPeriod;

}
public void hireDeveloper(String developername, String joiningDate, String staffRoomNumber, double advanceSalary){

    if(appointed == true){
       System.out.println("The developer name is appointed & the staff room no. is "+ staffRoomNumber);
    }
    else{
        super.setdeveloperName(developername);
        this.joiningDate=joiningDate;
        this.staffRoomNumber=staffRoomNumber;
        this.advanceSalary=advanceSalary;
        this.appointed=true;
        this.terminated=false;
     }
  }
  public void terminatedDeveloper(){
    if(terminated == true){
       System.out.println("The developer is already terminated");
    }
    else{
       super.setdeveloperName("");
       this.joiningDate="";
       this.advanceSalary=0.0;
       this.appointed=false;
       this.terminated=true;
    }
 }
 public void contractTerminate() {
    if (terminated == true) {
        System.out.println("Developer is terminated.");
    } else {
        super.setdeveloperName("");
        joiningDate = "";
        advanceSalary = 0.0;
        appointed = false;
        terminated = true;
    }
}
public void print(){
    System.out.println("Platform is " + super.getplatform());
    System.out.println(" interviewerName is " + super.getinterviewerName());
    System.out.println("salary is" +salary);
}
public void display(){
    super.display();


    if (appointed == true) {
        System.out.println("Termination status is " + terminated);
        System.out.println("Joining Date is " + joiningDate);
        System.out.println("Advance Salary is " + advanceSalary);
        System.out.println("Developer name is " + super.getinterviewerName());
    }
}
}