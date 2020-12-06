package com.example.anymouseweb;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MonitorPort {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true)
        {
            Socket socket = serverSocket.accept();
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            DataInputStream dis = new DataInputStream(bis);
            byte[] bytes = new byte[1]; // 一次读取一个byte
            String ret = "";
            while (dis.read(bytes) != -1)
            {
                ret += " ";
                if (dis.available() == 0)
                { // 一个请求
                    System.out.print(ret + ' ');

                }
            }

        }


    }
}
