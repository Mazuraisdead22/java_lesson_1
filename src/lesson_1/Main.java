package lesson_1;

public class Main {

    public static void main(String[] args) {
        Team man1 = new Team("Hank", 34, "black");
        Team man2 = new Team("Sten", 29, "white");
        Team man3 = new Team("Tom", 28, "red");
        Team man4 = new Team("Albert", 30, "yellow");

        Team[] mans = {man1, man2, man3, man4};

        Course c = new Course(500, 6);

        man1.teamInfo();
        c.dolt(mans);
        man2.teamInfo();
        c.dolt(mans);
        man3.teamInfo();
        c.dolt(mans);
        man4.teamInfo();
        c.dolt(mans);

    }
}
