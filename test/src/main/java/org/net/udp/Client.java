package org.net.udp;

import java.net.*;

public class Client {
    // UDP 实现一发一收
    public static void main(String[] args) throws Exception {
        // 1、创建客户端对象，发韭菜出去的人
        DatagramSocket datagramSocket = new DatagramSocket();
        // 2、创建数据包对象 封装要发出去的出去的数据
        /*
        public DatagramPacket(byte buf[], int offset, int length,
                          InetAddress address, int port)
        */

        DatagramPacket datagramPacket = null;
        while (true) {
            byte[] bytes = "你好我是谁？".getBytes();
            datagramPacket = new DatagramPacket(
                    bytes, bytes.length, InetAddress.getLocalHost(), 6666);


            // 3、发送数据
            datagramSocket.send(datagramPacket);
        }
        // 4、释放资源

    }
}
