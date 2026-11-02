package com.sma.smartv3.model;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ResourcesIdInfoKt {
    @aa1
    public static final List<ResourcesIdInfo> getWatchFaceElementColors(@aa1 Context r13) {
        Intrinsics.X0O(r13, "context");
        return CollectionsKt__CollectionsKt.iIiiO(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.shape_circle_0, r13.getResources().getColor(R.color.dial_customize_control_0), true), new ResourcesIdInfo(R.drawable.shape_circle_1, r13.getResources().getColor(R.color.dial_customize_control_1), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_2, r13.getResources().getColor(R.color.dial_customize_control_2), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_3, r13.getResources().getColor(R.color.dial_customize_control_3), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_4, r13.getResources().getColor(R.color.dial_customize_control_4), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_5, r13.getResources().getColor(R.color.dial_customize_control_5), false, 4, null), new ResourcesIdInfo(R.drawable.shape_circle_6, r13.getResources().getColor(R.color.dial_customize_control_6), false, 4, null)});
    }

    @aa1
    public static final List<ResourcesIdInfo> getWatchFaceElementDigitalTimes() {
        return CollectionsKt__CollectionsKt.iIiiO(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.digital_time_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_5, 0, false, 6, null), new ResourcesIdInfo(R.drawable.digital_time_6, 0, false, 6, null)});
    }

    @aa1
    public static final List<ResourcesIdInfo> getWatchFaceElementPointers(@aa1 BleDeviceInfo r11) {
        Intrinsics.X0O(r11, "deviceInfo");
        if (Intrinsics.XOO0ii0(r11.getMPlatform(), "B9") == false) goto L7;
        return CollectionsKt__CollectionsKt.iIiiO(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.dial_customize_point_1_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_1_5, 0, false, 6, null)});
    L7:
        return CollectionsKt__CollectionsKt.iIiiO(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.dial_customize_point_2_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_3, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_4, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_point_2_5, 0, false, 6, null)});
    }

    @aa1
    public static final List<ResourcesIdInfo> getWatchFaceElementScales(@aa1 BleDeviceInfo r10, boolean r11) {
        Intrinsics.X0O(r10, "deviceInfo");
        if (r11 == false) goto L7;
        return CollectionsKt__CollectionsKt.iIiiO(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.dial_customize_scale_2_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_2, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_2_3, 0, false, 6, null)});
    L7:
        if (Intrinsics.XOO0ii0(r10.getMPlatform(), "B9") == false) goto L11;
        return CollectionsKt__CollectionsKt.iIiiO(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.dial_customize_scale_172_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_172_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_172_2, 0, false, 6, null)});
    L11:
        return CollectionsKt__CollectionsKt.iIiiO(new ResourcesIdInfo[]{new ResourcesIdInfo(R.drawable.dial_customize_scale_10_0, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_10_1, 0, false, 6, null), new ResourcesIdInfo(R.drawable.dial_customize_scale_10_2, 0, false, 6, null)});
    }
}
