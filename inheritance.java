import javax.management.monitor.Monitor;
import java.lang.management.MonitorInfo;

class student{
    void show(){
        System.out.println("show marks ");
    }
}
class teacher extends student{
    void showmarks(){
        System.out.println("get marks");
    }
}

// hierarchical inheritance
class employee{
    String name;
    String address;
    float salary;
    String jobtittle;
    public employee(String name,String address,float salary,String jobtittle){
        this.name = name;
        this.address = address;
        this.salary  =salary;
        this.jobtittle = jobtittle;
    }
    public double calbonus(){
        return salary * 0.10;
    }
    public void getreport(){
        System.out.println(jobtittle + " " + name + "'s performance report: Satisfactory");
    }
}

class manager extends employee{
    public manager(String name,String address,float salary,String jobtittle){
        super(name, address, salary, jobtittle);
    }
    public double calbonus(){
        return salary * 0.20;
    }
    public void getreport(){
        System.out.println("manager" + " "+ name + "is managing new project");
    }
}

class developer extends employee{
    public developer(String name,String address,float salary,String jobtittle){
        super(name, address, salary, jobtittle);
    }
    public double calbonus(){
        return salary * 0.15;
    }
    public void devlopsoftware(){
        System.out.println("developer" + " "+ name + "is developing software");
    }
}

class programmer extends employee{
    public programmer(String name,String address,float salary,String jobtittle){
        super(name, address, salary, jobtittle);
    }
    public double calbonus(){
        return salary * 0.25;
    }
    public void programming(){
        System.out.println("programmer" + " "+ name + " is programming ");
    }
}

// single level inheritance
class Employee{
    void work(){
        System.out.println("working....");
    }
}
class Manager extends Employee{
    void attendMeeting(){
        System.out.println("attending meeting.......");
    }
}

// multi-level inheritance
class person{
    void displayname(){
        System.out.println("diplaying name.....");
    }
}
class Student1 extends person{
    void displayclass(){
        System.out.println("displaying class....");
    }
}
class monitor extends Student1{
    void checkdispline(){
        System.out.println("monitoring discipline");
    }
}

// single level
class device{
    void poweron(){
        System.out.println("power on....");
    }
}
class laptop extends device{
    void boot(){
        System.out.println("booting.....");
    }
}
class gaminglaptop extends laptop{
    void startgame(){
        System.out.println("starting game....");
    }
}

// single level
class book{
    void read(){
        System.out.println("reading....");
    }
}
class novel extends book{
    void storyline(){
        System.out.println("telling story....");
    }
}





public class inheritance {
    public static void main(String[] args) {
        teacher t = new teacher();
        t.showmarks();
        t.show();

        manager m  = new manager("rahul","xyz",156428.3f,"manager");
        developer d = new developer("kunal","abc road",560000.0f,"developer");
        programmer p  = new programmer("jai","xyz road",890000.0f,"programmer");
        System.out.println("manager bonus : " +  m.calbonus());
        m.getreport();
        System.out.println("developer bonus : " + d.calbonus());
        d.devlopsoftware();
        System.out.println("programmer bonus : " + p.calbonus());
        p.programming();

        // single level
        Manager m1 = new Manager();
        m1.attendMeeting();
        m1.work();

        // multi-level
        monitor M = new monitor();
        M.checkdispline();
        M.displayclass();
        M.displayname();

        // single-level
        gaminglaptop g = new gaminglaptop();
        g.startgame();
        g.boot();
        g.poweron();

        // single level
        novel n  =new novel();
        n.storyline();
        n.read();



    }
}
