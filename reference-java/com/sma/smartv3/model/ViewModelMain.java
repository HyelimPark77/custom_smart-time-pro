package com.sma.smartv3.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewModelMain extends ViewModel {

    @aa1
    public static final ViewModelMain INSTANCE = new ViewModelMain();

    @aa1
    private static MutableLiveData<Boolean> isShowSuspenWindow = new MutableLiveData<>();

    @aa1
    private static MutableLiveData<Boolean> isReSetList = new MutableLiveData<>();

    private ViewModelMain() {
    }

    @aa1
    public final MutableLiveData<Boolean> isReSetList() {
        return isReSetList;
    }

    @aa1
    public final MutableLiveData<Boolean> isShowSuspenWindow() {
        return isShowSuspenWindow;
    }

    public final void setReSetList(@aa1 MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.X0O(mutableLiveData, "<set-?>");
        isReSetList = mutableLiveData;
    }

    public final void setShowSuspenWindow(@aa1 MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.X0O(mutableLiveData, "<set-?>");
        isShowSuspenWindow = mutableLiveData;
    }
}
