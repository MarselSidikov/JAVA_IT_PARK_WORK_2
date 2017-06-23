package ru.itpark.sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetServer {
    // объект-сокет для сервера
    private ServerSocket serverSocket;
    // объект-сокет для клиента
    private Socket clientSocket;

    // выходной поток - на клиента
    private PrintWriter out;
    // входной поток - с клиента
    private BufferedReader in;

    public void startServer(int port) {
        try {
            // создали сокет сервер
            serverSocket = new ServerSocket(port);
            // ожидаем подключения клиента
            // данный метод не вернет подключения, пока его нет - он его ожидает
            clientSocket = serverSocket.accept();
            System.out.println("Клиент подключен");
            // получили поток для записи от клиента (пишем клиенту)
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String messageFromClient = in.readLine();

            out.println("Сам ты " + messageFromClient + ", слиент");
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
