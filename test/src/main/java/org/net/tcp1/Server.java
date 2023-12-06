package org.net.tcp1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 1、
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        while (true) {
            try {
                String s = dataInputStream.readUTF();
                System.out.println(s+":" + accept.getRemoteSocketAddress());
            } catch (IOException e) {
                break;
            }
        }
        inputStream.close();
        accept.close();

    }
}
