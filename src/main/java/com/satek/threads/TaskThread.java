package com.satek.threads;

import com.satek.app.TasksMatcher;
import com.satek.tasks.RemoteTask;

import java.io.DataInputStream;
import java.net.Socket;

public class TaskThread extends Thread {

    Socket socket = null;
    int taskId = 0;
    public TaskThread(Socket socket, int counter){
        this.socket = socket;
        this.taskId = counter;
    }

    @Override
    public void run() {
        try{
            System.out.println("Processing task: "+ taskId);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String message = dataInputStream.readUTF();
            RemoteTask remoteTask = TasksMatcher.matchTask(message);
            if(remoteTask != null)
            remoteTask.performTask();

            System.out.println("Task: "+taskId+", completed successfully.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
