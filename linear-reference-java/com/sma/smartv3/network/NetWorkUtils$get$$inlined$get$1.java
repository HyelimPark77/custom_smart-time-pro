package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.ironsource.Ne;
import com.sma.androidnetworklib.model.Response;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$get$2\n*L\n1#1,511:1\n*E\n"})
public final class NetWorkUtils$get$$inlined$get$1<T> implements ParsedRequestListener<Response<T>> {
    final /* synthetic */ O1XIiIO $callback;

    public NetWorkUtils$get$$inlined$get$1(O1XIiIO r1) {
        this.$callback = r1;
    }

    @Override // com.androidnetworking.interfaces.ParsedRequestListener
    public void onError(ANError r4) {
        StringBuilder r0 = new StringBuilder();
        r0.append("errorCode:");
        Integer r1 = null;
        if (r4 == null) goto L5;
        Integer r2 = Integer.valueOf(r4.getErrorCode());
    L6:
        r0.append(r2);
        r0.append(", errorBody:");
        if (r4 == null) goto L9;
        String r3 = r4.getErrorBody();
    L10:
        r0.append(r3);
        LogUtils.d(new Object[]{r0.toString()});
        if (r4 == null) goto L15;
        Response r5 = (Response) r4.getErrorAsObject(Response.class);
        if (r5 == null) goto L15;
        r1 = Integer.valueOf(r5.getCode());
    L17:
        handleError(String.valueOf(r1));
        return;
    L15:
        if (r4 == null) goto L17;
        r1 = Integer.valueOf(r4.getErrorCode());
        goto L17
    L9:
        r3 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }

    @Override // com.androidnetworking.interfaces.ParsedRequestListener
    public /* bridge */ /* synthetic */ void onResponse(Object r1) {
        onResponse((Response) r1);
    }

    public void onResponse(Response<T> r2) {
        Intrinsics.X0O(r2, Ne.n);
        handleResponse(r2);
    }
}
