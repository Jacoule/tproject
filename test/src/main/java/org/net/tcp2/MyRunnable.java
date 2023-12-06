package org.net.tcp2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class MyRunnable implements Runnable{
    private Socket socket;

    public MyRunnable(Socket accept){
        this.socket=accept;
    }

    @Override
    public void run() {



        try {
            InputStream inputStream = this.socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
                try {
                    while (true) {
                        String s = dataInputStream.readUTF();
                        System.out.println(this.socket.getRemoteSocketAddress()+"发送了："+s);
                    }
                } catch (Exception e) {
                    System.out.println(this.socket.getRemoteSocketAddress()+"下线了 ");
                    inputStream.close();
                    dataInputStream.close();
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
