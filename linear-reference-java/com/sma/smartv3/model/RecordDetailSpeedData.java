package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordDetailSpeedData {
    private float mFastestSpeed;

    @aa1
    private ArrayList<Integer> mPaceList;

    public RecordDetailSpeedData() {
        this.mPaceList = new ArrayList();
    }

    public final float getMFastestSpeed() {
        return this.mFastestSpeed;
    }

    @aa1
    public final ArrayList<Integer> getMPaceList() {
        return this.mPaceList;
    }

    public final void setMFastestSpeed(float r1) {
        this.mFastestSpeed = r1;
    }

    public final void setMPaceList(@aa1 ArrayList<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPaceList = r2;
    }
}
