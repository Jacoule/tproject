package org.net.tcp2;

import jdk.jshell.execution.Util;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
        );
        while (true){
            Socket accept = serverSocket.accept();
            System.out.println(accept.getRemoteSocketAddress()+"：" + "上线" );
            threadPoolExecutor.submit(new MyRunnable(accept));
        }


    }
}
