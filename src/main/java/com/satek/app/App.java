package com.satek.app;
import com.satek.threads.TaskThread;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            int port = 8090;
            int counter = 0;
            ServerSocket serverSocket =  new ServerSocket(port);
            while(true){
                counter++;
                Socket socket = serverSocket.accept();
                TaskThread taskThread = new TaskThread(socket,counter); //send  the request to a separate thread
                taskThread.start();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
