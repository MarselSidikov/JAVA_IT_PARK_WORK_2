package ru.itpark.sockets;

public class ServerStart {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();
        server.start(6666);
    }
}
