package org.net.udp;

import javax.net.ssl.SSLEngine;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {
        // 1、创建服务端
        DatagramSocket datagramSocket = new DatagramSocket(6666);

        // 2、创建一个数据包对象，用于接收数据
        byte[] bytes = new byte[1024 * 64]; // 64KB 一个数据包最多传输64KB 数据
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

        // 3、输出内容
        while (true) {
            datagramSocket.receive(packet);
            int len = packet.getLength();
            String s = new String(bytes, 0, len);
            System.out.println(s);

            System.out.println(packet.getAddress().getHostAddress() + " : " + packet.getPort());
        }
        // datagramSocket.close();
    }
}
