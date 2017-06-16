package ru.itpark.sockets;

import java.util.Scanner;

public class StartClient {
    public static void main(String[] args) {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        while (true) {
            client.sendMessage(message);
            message = scanner.next();
        }
    }
}
