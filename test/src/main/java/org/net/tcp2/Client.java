package org.net.tcp2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1、创建Socket对象，并同时与服务端程序连接
        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(),8888);
        // 2、从socket 通信管道中 获得一个字节输出流 用来发数据给服务端程序
        OutputStream outputStream = socket.getOutputStream();
        // 3、把低级的字节输出流 包装成数据输出流
        DataOutputStream dos = new DataOutputStream(outputStream);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入需要发送的数据");
            String s = scanner.next();
            if(s.equals("exit")){
                System.out.println("程序退出成功");
                break;
            }
            dos.writeUTF(s);
        }
        dos.close();
        socket.close();

    }
}
