package com.sma.smartv3.p610ui.sport.course.model;

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
    private final MutableLiveData<ArrayList<CustomLatLng>> markLiveData = new MutableLiveData<>();

    @aa1
    private final ArrayList<CustomLatLng> customLatLng = new ArrayList<>();

    @aa1
    public final ArrayList<CustomLatLng> getCustomLatLng() {
        return this.customLatLng;
    }

    public final void getIntiLocationList(@aa1 ArrayList<CustomLatLng> locationList, int i) {
        Intrinsics.X0O(locationList, "locationList");
        if (this.customLatLng.isEmpty()) {
            this.customLatLng.addAll(cp5.m1619I1(locationList, 0.0f, i, 2, null));
            LogUtils.m11130i("customLatLng.size = " + this.customLatLng.size());
        }
    }

    public final void getMarkList(@aa1 ArrayList<CustomLatLng> locationList, int i) {
        Intrinsics.X0O(locationList, "locationList");
        LogUtils.m11130i("customLatLng.size2 = " + this.customLatLng.size());
        if (!this.customLatLng.isEmpty()) {
            this.markLiveData.postValue(this.customLatLng);
            return;
        }
        this.customLatLng.addAll(cp5.m1619I1(locationList, 0.0f, i, 2, null));
        this.markLiveData.postValue(this.customLatLng);
    }

    @aa1
    public final MutableLiveData<ArrayList<CustomLatLng>> getMarkLiveData() {
        return this.markLiveData;
    }
}
