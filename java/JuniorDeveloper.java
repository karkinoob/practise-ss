package java;

public class JuniorDeveloper extends Developer{
    private double salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;

    public JuniorDeveloper(String platform, String interviewername, String developername, double workingHour, double salary, String appointedDate, String terminationDate,String appointedBy){
      super(platform, interviewername, workingHour);
        this.salary = salary;
        this. appointedDate = "";
        this.evaluationPeriod = "";
        this.terminationDate = terminationDate;
        this.specialization = "";
        this.appointedBy =appointedBy;
        this.joined = false;

    }
    public double getSalary(){
        return salary;


     }
     public String getAppointedDate(){
        return appointedDate;

     }
     public String getEvualationDate(){
        return evaluationPeriod;

     }
     public String getTerminationDate(){
        return terminationDate;

     }
     public String getSpecialization(){
      return specialization;

   }
   public String getAppointedBy(){
      return appointedBy;

   }
   public boolean getJoined(){
      return joined;

   }
   public void setSalary(double salary) {
      if (joined == false) {
          this.salary = salary;
      } else {
          System.out.println("Not possible to change the salary.");
      }
  }

  // Method for appoint developer

  public void appointDeveloper(String developerName, String appointedDate, String terminationDate,
          String specialization) {
      if (joined == false) {
          super.setdeveloperName(developerName);
          joined = true;

      } else {
          System.out.println("Developer is already appointed in " + appointedDate);
      }
      this.terminationDate = terminationDate;
      this.specialization = specialization;
      this.appointedDate = appointedDate;
  }



  public void display() {
      super.display();

      if (joined == true) {
          System.out.println("Appointed Date is " + appointedDate);
          System.out.println("Developer name is " + super.getdeveloperName());
          System.out.println("Evalutaion period is " + evaluationPeriod);
          System.out.println("Termination date is " + terminationDate);
          System.out.println("Salary is " + salary);
          System.out.println("Developer specialization is" + specialization);
          System.out.println("Appointed by " + appointedBy);
      }
  }
}