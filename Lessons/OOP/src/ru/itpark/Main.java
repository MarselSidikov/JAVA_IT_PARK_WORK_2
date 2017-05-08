package ru.itpark;

public class Main {

    public static void main(String[] args) {
        // создали объект типа Student
	    Student marsel = new Student();
	    marsel.name = "Marsel";
	    marsel.groupNumber = 9515;
        marsel.russianLanguageMark = 5;
        marsel.mathMark = 4;
        marsel.physicsMark = 5;

	    Student rinata = new Student();
	    rinata.name = "Rinata";
	    rinata.groupNumber = 723112;
	    rinata.russianLanguageMark = 4;
	    rinata.mathMark = 5;
	    rinata.physicsMark = 5;

	    marsel = rinata;
        rinata.name = "Best girl ever";
	    //marsel.name = "BARMAN";

        System.out.println(marsel.name);

        // marsel и rinata - это ссылки
        // это объектные переменные не равно объект
        // объектная_перемення.член_класса - обращение к значению объекта
        // в поле, указанном после точки
    }
}
