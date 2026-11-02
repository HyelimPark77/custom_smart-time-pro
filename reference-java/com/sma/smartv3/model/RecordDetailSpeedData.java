package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordDetailSpeedData {
    private float mFastestSpeed;

    @aa1
    private ArrayList<Integer> mPaceList = new ArrayList<>();

    public final float getMFastestSpeed() {
        return this.mFastestSpeed;
    }

    @aa1
    public final ArrayList<Integer> getMPaceList() {
        return this.mPaceList;
    }

    public final void setMFastestSpeed(float f) {
        this.mFastestSpeed = f;
    }

    public final void setMPaceList(@aa1 ArrayList<Integer> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.mPaceList = arrayList;
    }
}
