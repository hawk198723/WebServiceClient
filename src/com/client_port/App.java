package com.client_port;

public class App {
    public static void main(String[] args) {
        HelloServiceService ss = new HelloServiceService();

        HelloService proxy = ss.getHelloServicePort();
        String ret = proxy.greeting("Jason\uD83D\uDE09",10);
        System.out.println(ret);
    }
}
