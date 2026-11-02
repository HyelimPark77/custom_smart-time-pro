package com.sma.smartv3.p610ui.status.base;

import android.content.Context;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslAdapterItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StatusBaseItem<T> extends DslAdapterItem {

    @aa1
    private final Context mContext;

    public StatusBaseItem(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        this.mContext = context;
    }

    @aa1
    public final Context getMContext() {
        return this.mContext;
    }

    public abstract void update(T t);

    public abstract void updateOtherData();
}
