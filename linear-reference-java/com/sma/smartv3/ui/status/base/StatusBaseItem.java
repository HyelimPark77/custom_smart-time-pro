package com.sma.smartv3.ui.status.base;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslAdapterItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StatusBaseItem<T> extends DslAdapterItem {

    @aa1
    private final Context mContext;

    public StatusBaseItem(@aa1 Context r2) {
        Intrinsics.X0O(r2, "context");
        this.mContext = r2;
    }

    @aa1
    public final Context getMContext() {
        return this.mContext;
    }

    public abstract void update(T r1);

    public abstract void updateOtherData();
}
