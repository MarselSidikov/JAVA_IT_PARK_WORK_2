package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    HouseBook b1 = HouseBook.getHouseBook();
	    b1.writeLodger("Lodger1");
	    b1.writeLodger("Lodger2");
	    b1.writeOwner("rustem", 25, 35);
    }
}
