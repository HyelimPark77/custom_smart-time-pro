package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadData<T> {

    @tb1
    private List<? extends T> data;

    @aa1
    private String identity = "";

    @tb1
    public final List<T> getData() {
        return this.data;
    }

    @aa1
    public final String getIdentity() {
        return this.identity;
    }

    public final void setData(@tb1 List<? extends T> list) {
        this.data = list;
    }

    public final void setIdentity(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.identity = str;
    }
}
