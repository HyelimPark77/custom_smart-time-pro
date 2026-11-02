package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iz3;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodGlucose2DataKt {

    @aa1
    private static final List<iz3> bloodGlucoseSegments = CollectionsKt__CollectionsKt.Ii1iii0(new iz3(30.0f, 61.0f, Utils.getApp().getResources().getColor(R.color.bg_level_color_normal)), new iz3(61.0f, 69.0f, Utils.getApp().getResources().getColor(R.color.bg_level_color_prediabetes)), new iz3(69.0f, 90.0f, Utils.getApp().getResources().getColor(R.color.bg_level_color_diabetes)));

    public static final float getBloodGlucoseBarValue(float f, float f2) {
        return f - f2;
    }

    public static /* synthetic */ float getBloodGlucoseBarValue$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = BloodGlucoseLevel.START.getMValue();
        }
        return getBloodGlucoseBarValue(f, f2);
    }

    @aa1
    public static final List<iz3> getBloodGlucoseSegments() {
        return bloodGlucoseSegments;
    }
}
