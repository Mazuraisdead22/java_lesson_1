package lesson_1;

public class Team extends Main {
    private String name;
    private int age;
    private String color;

    public Team(String name, int age, String color){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void teamInfo(){
        System.out.println(" Имя: " + name + " Возраст: " + age + " Цвет формы участника: " + color);

    }

}
