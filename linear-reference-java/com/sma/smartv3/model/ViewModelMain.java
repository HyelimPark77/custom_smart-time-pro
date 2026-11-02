package com.sma.smartv3.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewModelMain extends ViewModel {

    @aa1
    public static final ViewModelMain INSTANCE = null;

    @aa1
    private static MutableLiveData<Boolean> isReSetList;

    @aa1
    private static MutableLiveData<Boolean> isShowSuspenWindow;

    static {
        INSTANCE = new ViewModelMain();
        isShowSuspenWindow = new MutableLiveData();
        isReSetList = new MutableLiveData();
    }

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

    public final void setReSetList(@aa1 MutableLiveData<Boolean> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        isReSetList = r2;
    }

    public final void setShowSuspenWindow(@aa1 MutableLiveData<Boolean> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        isShowSuspenWindow = r2;
    }
}
