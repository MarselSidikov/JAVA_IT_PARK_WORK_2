package ru.itpark;


import java.io.FileOutputStream;

public class HouseBook {

    private static HouseBook instance;
    private FileOutputStream fileOutputStream;

    public static HouseBook getHouseBook() {
        return instance;
    }

    static {
        instance = new HouseBook("housebook.txt");
    }

    private HouseBook(String fileName) {
        try {
            this.fileOutputStream = new FileOutputStream(fileName);
        } catch (Exception e) {
            System.out.println("Проблема с файлом!");
        }
    }

    public void writeLodger(String name) {
        try {
            name = name + "\n";
            byte bytes[] = name.getBytes();
            fileOutputStream.write(bytes);
        } catch (Exception e) {
            System.err.print("Проблема!");
        }

    }

    public void writeOwner(String name, int number, int area) {
        try {
            String text = name + " " +String.valueOf(number) + " " + String.valueOf(area) + "\n";
            byte bytes[] = text.getBytes();
            fileOutputStream.write(bytes);
        } catch (Exception e){
            System.out.println("Проблема!");
        }
    }

}
