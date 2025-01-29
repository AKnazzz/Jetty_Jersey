package ru.hh.jetty;

import org.eclipse.jetty.server.Server;

public class Main {

    public static void main(String[] args) throws Exception {
        var server = new Server(8080);
        try{
            server.start();
            server.join(); //  для того, чтобы основной поток (в котором выполняется метод main) "присоединился" к потоку, на котором работает сервер. Это означает, что основной поток будет ждать, пока сервер не завершит свою работу.
        } finally {
            server.destroy();
        }
    }

}
