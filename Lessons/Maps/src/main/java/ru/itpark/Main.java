package ru.itpark;

public class Main {
    public static void main(String[] args) {
        Map<Character, String> map = new MapImpl<>();

        map.put('A', "Audi");
        map.put('B', "BMW");
        map.put('C', "Camry");
        map.put('D', "Datsun");
        map.put('E', "E-mobile");
        map.put('F', "Ford");
        map.put('G', "Grentwall");
        map.put('H', "Honda");
        map.put('I', "I-mobile");
        map.put('J', "Jentra");
        map.put('K', "Kamel");
        map.put('L', "Lada");
        map.put('M', "Mazda");
        map.put('N', "Nissan");
        map.put('O', "Opel");

        String camry = map.get('C');
    }
}
