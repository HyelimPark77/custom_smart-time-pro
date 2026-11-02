package com.sma.smartv3.model;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iz3;
import com.ironsource.C12616d4;
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
    public static final int[] getBarColors(@aa1 Context context, int i) {
        Intrinsics.X0O(context, "context");
        if (i < 25) {
            return new int[]{ContextCompat.getColor(context, R.color.level_color_low), ContextCompat.getColor(context, R.color.level_color_low)};
        }
        if (i < 50) {
            return new int[]{ContextCompat.getColor(context, R.color.level_color_standard), ContextCompat.getColor(context, R.color.level_color_standard)};
        }
        return i < 75 ? new int[]{ContextCompat.getColor(context, R.color.level_color_high), ContextCompat.getColor(context, R.color.level_color_high)} : new int[]{ContextCompat.getColor(context, R.color.level_color_severely_high), ContextCompat.getColor(context, R.color.level_color_severely_high)};
    }

    public static final void setPressureSbv(@aa1 Context context, @aa1 SegmentedBarView sbv) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(sbv, "sbv");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        List listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(0, 25, 50, 75, 100);
        String[] stringArray = context.getResources().getStringArray(R.array.level_range_4_2_pressure);
        Intrinsics.O10IXXX0X(stringArray, "getStringArray(...)");
        int[] intArray = context.getResources().getIntArray(R.array.level_color_4_2);
        Intrinsics.O10IXXX0X(intArray, "getIntArray(...)");
        int length = stringArray.length;
        while (i < length) {
            int iIntValue = ((Number) listIXiX011.get(i)).intValue();
            int i2 = i + 1;
            int iIntValue2 = ((Number) listIXiX011.get(i2)).intValue();
            iz3 iz3VarX1ii = new iz3(iIntValue, iIntValue2, stringArray[i], intArray[i]).X1ii("");
            if (i == 0) {
                iz3VarX1ii.X1ii(String.valueOf(iIntValue));
            } else if (i == stringArray.length - 1) {
                iz3VarX1ii.X1ii(String.valueOf(iIntValue2));
            } else {
                iz3VarX1ii.X1ii(iIntValue + C12616d4.j.f34438c + iIntValue2);
            }
            Intrinsics.XXI(iz3VarX1ii);
            arrayList.add(iz3VarX1ii);
            i = i2;
        }
        sbv.setShowDescriptionText(true);
        sbv.setSegments(arrayList);
        sbv.setDescriptionTextColor(gk4.m1859iO(sbv.getContext(), R.color.text_color));
        sbv.setDescriptionTopTextColor(gk4.m1859iO(sbv.getContext(), R.color.text_color));
    }

    public static final void setPressureSbvValue(@aa1 SegmentedBarView sbv, float f) {
        Intrinsics.X0O(sbv, "sbv");
        if (f > 100.0f) {
            f = 100.0f;
        }
        sbv.setValue(Float.valueOf(f));
    }
}
