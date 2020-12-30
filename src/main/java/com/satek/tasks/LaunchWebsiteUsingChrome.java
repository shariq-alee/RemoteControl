package com.satek.tasks;

import java.io.IOException;

public class LaunchWebsiteUsingChrome implements RemoteTask{

    String websiteLink;
    public LaunchWebsiteUsingChrome(String websiteLink) {
        this.websiteLink = new String(websiteLink);
    }

    public void performTask() throws IOException {
        Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome " + websiteLink});
    }

}
