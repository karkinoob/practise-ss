package java;

public class Program {
    public static void main(String[] args){
        SeniorDeveloper suneel= new SeniorDeveloper("ios", "suneel", 8, 5000, 23);
        suneel.display();
        System.out.println();
        JuniorDeveloper manish = new JuniorDeveloper("ios", "suneel", "manish",9, 50000, 9/2, 3/23, "ram");
        manish.display();
        System.out.println();
    }
}
