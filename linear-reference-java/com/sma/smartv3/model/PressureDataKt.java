package com.sma.smartv3.model;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iz3;
import com.ironsource.C2985d4;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PressureDataKt {
    public static final int PRESSURE_LEVEL_RANGE_0 = 0;
    public static final int PRESSURE_LEVEL_RANGE_1 = 25;
    public static final int PRESSURE_LEVEL_RANGE_2 = 50;
    public static final int PRESSURE_LEVEL_RANGE_3 = 75;
    public static final int PRESSURE_LEVEL_RANGE_4 = 100;

    @aa1
    public static final int[] getBarColors(@aa1 Context r4, int r5) {
        Intrinsics.X0O(r4, "context");
        if (r5 >= 25) goto L7;
        return new int[]{ContextCompat.getColor(r4, R.color.level_color_low), ContextCompat.getColor(r4, R.color.level_color_low)};
    L7:
        if (r5 >= 50) goto L11;
        return new int[]{ContextCompat.getColor(r4, R.color.level_color_standard), ContextCompat.getColor(r4, R.color.level_color_standard)};
    L11:
        if (r5 >= 75) goto L15;
        return new int[]{ContextCompat.getColor(r4, R.color.level_color_high), ContextCompat.getColor(r4, R.color.level_color_high)};
    L15:
        return new int[]{ContextCompat.getColor(r4, R.color.level_color_severely_high), ContextCompat.getColor(r4, R.color.level_color_severely_high)};
    }

    public static final void setPressureSbv(@aa1 Context r14, @aa1 SegmentedBarView r15) {
        Intrinsics.X0O(r14, "context");
        Intrinsics.X0O(r15, "sbv");
        ArrayList r0 = new ArrayList();
        int r1 = 0;
        List r2 = CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, 25, 50, 75, 100});
        String[] r3 = r14.getResources().getStringArray(R.array.level_range_4_2_pressure);
        Intrinsics.O10IXXX0X(r3, "getStringArray(...)");
        int[] r16 = r14.getResources().getIntArray(R.array.level_color_4_2);
        Intrinsics.O10IXXX0X(r16, "getIntArray(...)");
        int r4 = r3.length;
    L4:
        if (r1 >= r4) goto L13;
        int r6 = ((Number) r2.get(r1)).intValue();
        int r7 = r1 + 1;
        int r8 = ((Number) r2.get(r7)).intValue();
        iz3 r9 = new iz3(r6, r8, r3[r1], r16[r1]).X1ii("");
        if (r1 != 0) goto L9;
        r9.X1ii(String.valueOf(r6));
    L12:
        Intrinsics.XXI(r9);
        r0.add(r9);
        r1 = r7;
        goto L4
    L9:
        if (r1 != (r3.length - 1)) goto L11;
        r9.X1ii(String.valueOf(r8));
        goto L12
    L11:
        r9.X1ii(r6 + C2985d4.j.c + r8);
        goto L12
    L13:
        r15.setShowDescriptionText(true);
        r15.setSegments(r0);
        r15.setDescriptionTextColor(gk4.iO(r15.getContext(), R.color.text_color));
        r15.setDescriptionTopTextColor(gk4.iO(r15.getContext(), R.color.text_color));
    }

    public static final void setPressureSbvValue(@aa1 SegmentedBarView r2, float r3) {
        Intrinsics.X0O(r2, "sbv");
        if (r3 <= 100.0f) goto L5;
        r3 = 100.0f;
    L5:
        r2.setValue(Float.valueOf(r3));
    }
}
