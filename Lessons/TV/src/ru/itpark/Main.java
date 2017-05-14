package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    Program program1 = new Program("Поле чудес", "Леонид Якубович");
	    Program program2 = new Program("Пусть говорят", "Андрей Малахов");
	    Program program3 = new Program("Модный приговор", "Какое то существо");

	    Channel channel = new Channel("Первый");
	    channel.addProgram(program1);
	    channel.addProgram(program2);
	    channel.addProgram(program3);

        Program program4 = new Program("Вести", "Киселев");
        Program program5 = new Program("Реклама", "Басков");
        Program program6 = new Program("Кривое зеркало", "Евгений Петросян");

        Channel channel2 = new Channel("Россия");
        channel2.addProgram(program4);
        channel2.addProgram(program5);
        channel2.addProgram(program6);

	    TV tv = new TV();
	    tv.setChannel(channel, 5);
	    tv.setChannel(channel2, 3);

        TvController controller = new TvController(tv);
        controller.on(98);
    }
}
