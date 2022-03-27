package lesson_1;

import javax.xml.namespace.QName;

public class Course extends Main{
    private int length;
    private int barrier;

    public Course( int length, int barrier){
        this.length = length;
        this.barrier = barrier;
    }
    public void dolt(Team[] mans){
        System.out.println(" Общее расстояние : " + length + " Количество барьеров: " + barrier);
    }

}
