package com.sma.smartv3.ui.sport.course.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.model.CustomLatLng;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportDetailViewModel extends ViewModel {

    @aa1
    private final ArrayList<CustomLatLng> customLatLng;

    @aa1
    private final MutableLiveData<ArrayList<CustomLatLng>> markLiveData;

    public SportDetailViewModel() {
        this.markLiveData = new MutableLiveData();
        this.customLatLng = new ArrayList();
    }

    @aa1
    public final ArrayList<CustomLatLng> getCustomLatLng() {
        return this.customLatLng;
    }

    public final void getIntiLocationList(@aa1 ArrayList<CustomLatLng> r4, int r5) {
        Intrinsics.X0O(r4, "locationList");
        if (this.customLatLng.isEmpty() == false) goto L6;
        this.customLatLng.addAll(cp5.I1(r4, 0.0f, r5, 2, null));
        LogUtils.i(new Object[]{"customLatLng.size = " + this.customLatLng.size()});
        return;
    }

    public final void getMarkList(@aa1 ArrayList<CustomLatLng> r4, int r5) {
        Intrinsics.X0O(r4, "locationList");
        LogUtils.i(new Object[]{"customLatLng.size2 = " + this.customLatLng.size()});
        if (this.customLatLng.isEmpty() == false) goto L6;
        this.customLatLng.addAll(cp5.I1(r4, 0.0f, r5, 2, null));
        postValue(this.customLatLng);
        return;
    L6:
        postValue(this.customLatLng);
    }

    @aa1
    public final MutableLiveData<ArrayList<CustomLatLng>> getMarkLiveData() {
        return this.markLiveData;
    }
}
