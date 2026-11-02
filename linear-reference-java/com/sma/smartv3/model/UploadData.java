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
    private String identity;

    public UploadData() {
        this.identity = "";
    }

    @tb1
    public final List<T> getData() {
        return this.data;
    }

    @aa1
    public final String getIdentity() {
        return this.identity;
    }

    public final void setData(@tb1 List<? extends T> r1) {
        this.data = r1;
    }

    public final void setIdentity(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.identity = r2;
    }
}
