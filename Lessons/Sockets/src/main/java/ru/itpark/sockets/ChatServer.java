package ru.itpark.sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

// класс, который инкапсулирует логику сервер-сокета
// то есть сокета, который может принимать подключения
// от клиентов
public class ChatServer {

    // список обработчиков клиентов
    private List<ClientHandler> clients = new ArrayList<ClientHandler>();

    public void start(int port) {
        try {
            // описали сервер-сокет
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                new ClientHandler(serverSocket.accept()).start();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
    // обработчик конкретного клиента
    class ClientHandler extends Thread {
        private Socket clientSocket;
        private BufferedReader in;

        public ClientHandler(Socket socket) {
            System.out.println("Новый клиент");
            // создали клиентский сокет, подключились к нему
            this.clientSocket = socket;
            // добавили текущего клиента в список всех клиентов
            clients.add(this);
        }

        public void run() {
            try {
                // получили входной поток от клиента
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                // размещаем сообщение от клиента
                String inputLine = in.readLine();
                while (inputLine != null) {
                    if (!inputLine.equals(".")) {
                        // бежим по списку всех клиентов
                        for (int i = 0; i < clients.size(); i++) {
                            // получим текущего обработчика клиента
                            ClientHandler handler = clients.get(i);
                            // получили его socket-коннект
                            Socket socketOfCurrentClient = handler.clientSocket;
                            PrintWriter out =
                                    new PrintWriter(socketOfCurrentClient.getOutputStream(), true);
                            out.println(inputLine);
                        }
                    }  else {
                        break;
                    }
                }
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }


    }
}
