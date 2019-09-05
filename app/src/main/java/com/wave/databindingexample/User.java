package com.wave.databindingexample;

import android.arch.lifecycle.ViewModel;

/**
 * Created on : Mar 16, 2019
 * Author     : AndroidWave
 */
public class User {
    private String name;
    private String address;
    private int followerCount;
    private String followingCount;

    public User(String name, String address, int followerCount, String followingCount) {
        this.name = name;
        this.address = address;
        this.followerCount = followerCount;
        this.followingCount = followingCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public String getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(String followingCount) {
        this.followingCount = followingCount;
    }

}
