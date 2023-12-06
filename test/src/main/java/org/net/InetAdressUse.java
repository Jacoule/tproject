package org.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAdressUse {
    public static void main(String[] args) throws Exception {
        // 获取 本机的ip地址
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress.getHostName()+" : "+inetAddress.getHostAddress());

        //获取指定域名的IP
        InetAddress inetAddress1 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress1.getHostName()+" : " +inetAddress1.getHostAddress());

        // ping www.baidu.com
        System.out.println(inetAddress1.isReachable(6000));



    }
}
