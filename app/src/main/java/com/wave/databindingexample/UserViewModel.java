package com.wave.databindingexample;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {
    private User user;
    public MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();

    public UserViewModel() {
        user = new User("Monika Sharma", "251 Mansarovar Jaipur | India ", 0, "324K");
        userMutableLiveData.setValue(user);
    }

    public void onChangeUserName(String username) {
        user.setName(username);
        user.setFollowerCount(user.getFollowerCount() + 1);
        userMutableLiveData.setValue(user);
    }
}
