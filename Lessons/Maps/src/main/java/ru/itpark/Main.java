package ru.itpark;

import java.util.HashMap;

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
        map.show();
        map.put('O', "Octavia");
        System.out.println("--------------");
        map.show();
        String camry = map.get('O');
        System.out.println(camry);
    }
}
