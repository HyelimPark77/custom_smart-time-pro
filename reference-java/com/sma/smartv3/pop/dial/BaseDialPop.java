package com.sma.smartv3.pop.dial;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I0OIO1i;
import com.android.mltcode.paycertificationapi.II01IOiX;
import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.sma.smartv3.model.ResourcesIdInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class BaseDialPop extends I0OIO1i {

    @aa1
    public final LinearLayoutManager I0IIOi;

    @aa1
    public final CommonAdapter<ResourcesIdInfo> OIi0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDialPop(@aa1 Activity activity, @aa1 List<ResourcesIdInfo> colors, @aa1 II01IOiX<Integer> callback) {
        super(activity);
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(colors, "colors");
        Intrinsics.X0O(callback, "callback");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        linearLayoutManager.setOrientation(0);
        this.I0IIOi = linearLayoutManager;
        this.OIi0 = new BaseDialPop$adapter$1(activity, colors, callback);
    }

    @aa1
    public final CommonAdapter<ResourcesIdInfo> OiIIX101O() {
        return this.OIi0;
    }

    @aa1
    public final LinearLayoutManager XiOIii1() {
        return this.I0IIOi;
    }
}
