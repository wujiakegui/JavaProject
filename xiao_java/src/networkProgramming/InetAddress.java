package networkProgramming;

import java.net.UnknownHostException;

/*
 *   20200528
 *   xiao
 * */
public class InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        // 学习之中
        java.net.InetAddress localhost = java.net.InetAddress.getLocalHost();     // 获得本机IP地址对象
        System.out.println(localhost.getHostAddress());         // 获取本机 IP地址
        System.out.println(localhost.getHostName());            // 获得ip地址对应的主机名

        java.net.InetAddress baidu = java.net.InetAddress.getByName("www.baidu.com");  // 获得任意主机的IP地址对象
        System.out.println(baidu.getHostAddress());                  // 获得
        System.out.println(baidu.getHostName());

    }
}

