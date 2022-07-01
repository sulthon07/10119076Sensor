package com.example.a10119076sensor.ui.Gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LokasiViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LokasiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}