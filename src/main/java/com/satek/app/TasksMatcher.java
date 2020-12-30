package com.satek.app;

import com.satek.constants.AppConstants;
import com.satek.tasks.LaunchWebsiteUsingChrome;
import com.satek.tasks.RemoteTask;

public class TasksMatcher {

    public static RemoteTask matchTask(String task){
        //implementation
        if(task.equalsIgnoreCase(AppConstants.LAUNCH_FACEBOOK)){
            return new LaunchWebsiteUsingChrome(AppConstants.facebook_url);
        }
        else if(task.equalsIgnoreCase(AppConstants.LAUNCH_YOUTUBE)){
            return new LaunchWebsiteUsingChrome(AppConstants.youtube_url);
        }
        else if(task.equalsIgnoreCase(AppConstants.SHUTDOWN_COMPUTER)){

        }
        else if(task.equalsIgnoreCase(AppConstants.RESTART_COMPUTER)){

        }
        return null;
    }
}
