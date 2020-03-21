package com.example.laborlawdashboard.ui.deny;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DenyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DenyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Deny fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}