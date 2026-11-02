package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadServiceRequestBody {

    @aa1
    private List<DataBody> data;

    @tb1
    private String identity;

    public UploadServiceRequestBody(@tb1 String str, @aa1 List<DataBody> data) {
        Intrinsics.X0O(data, "data");
        this.identity = str;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadServiceRequestBody copy$default(UploadServiceRequestBody uploadServiceRequestBody, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadServiceRequestBody.identity;
        }
        if ((i & 2) != 0) {
            list = uploadServiceRequestBody.data;
        }
        return uploadServiceRequestBody.copy(str, list);
    }

    @tb1
    public final String component1() {
        return this.identity;
    }

    @aa1
    public final List<DataBody> component2() {
        return this.data;
    }

    @aa1
    public final UploadServiceRequestBody copy(@tb1 String str, @aa1 List<DataBody> data) {
        Intrinsics.X0O(data, "data");
        return new UploadServiceRequestBody(str, data);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadServiceRequestBody)) {
            return false;
        }
        UploadServiceRequestBody uploadServiceRequestBody = (UploadServiceRequestBody) obj;
        return Intrinsics.XOO0ii0(this.identity, uploadServiceRequestBody.identity) && Intrinsics.XOO0ii0(this.data, uploadServiceRequestBody.data);
    }

    @aa1
    public final List<DataBody> getData() {
        return this.data;
    }

    @tb1
    public final String getIdentity() {
        return this.identity;
    }

    public int hashCode() {
        String str = this.identity;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.data.hashCode();
    }

    public final void setData(@aa1 List<DataBody> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.data = list;
    }

    public final void setIdentity(@tb1 String str) {
        this.identity = str;
    }

    @aa1
    public String toString() {
        return "UploadServiceRequestBody(identity=" + this.identity + ", data=" + this.data + I000IiI1O.C2156iO.f1007iO;
    }
}
