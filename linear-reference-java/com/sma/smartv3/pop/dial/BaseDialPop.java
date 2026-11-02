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

    public BaseDialPop(@aa1 Activity r3, @aa1 List<ResourcesIdInfo> r4, @aa1 II01IOiX<Integer> r5) {
        Intrinsics.X0O(r3, "activity");
        Intrinsics.X0O(r4, "colors");
        Intrinsics.X0O(r5, "callback");
        super(r3);
        LinearLayoutManager r0 = new LinearLayoutManager(r3);
        r0.setOrientation(0);
        this.I0IIOi = r0;
        this.OIi0 = new BaseDialPop$adapter$1(r3, r4, r5);
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
