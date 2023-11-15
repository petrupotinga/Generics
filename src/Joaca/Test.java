package Joaca;

public class Test {
    public static void main(String[] args) {
        Team<Schoolar> schoolarTeam = new Team<>("Drakoni");
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 14);
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
//        shcoolarTeam.addNewParticipant(student1);

        Team<Student> studentTeam = new Team<>("Inainte");
        Student student1 = new Student("Nicolai", 20);
        Student student2 = new Student("Ksenia", 18);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Harnicii");
        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mihai", 33);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team<String>anotherTeam = new Team<>("Fantezia");
//        anotherTeam.addNewParticipant("Salut");

        Team<Schoolar> schoolarTeam2 = new Team<>("Desteptii");
        Schoolar schoolar3 = new Schoolar("Oleg", 12);
        Schoolar schoolar4 = new Schoolar("Elena", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
