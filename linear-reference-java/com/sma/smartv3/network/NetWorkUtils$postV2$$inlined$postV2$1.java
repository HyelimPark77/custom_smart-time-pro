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
@SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$postV2$1\n*L\n1#1,511:1\n*E\n"})
public final class NetWorkUtils$postV2$$inlined$postV2$1<T> implements ParsedRequestListener<Response<T>> {
    final /* synthetic */ O1XIiIO $callback;

    public NetWorkUtils$postV2$$inlined$postV2$1(O1XIiIO r1) {
        this.$callback = r1;
    }

    @Override // com.androidnetworking.interfaces.ParsedRequestListener
    public void onError(ANError r4) {
        if (r4 == null) goto L4;
        r4.printStackTrace();
    L4:
        StringBuilder r0 = new StringBuilder();
        r0.append("errorCode:");
        Integer r1 = null;
        if (r4 == null) goto L7;
        Integer r2 = Integer.valueOf(r4.getErrorCode());
    L8:
        r0.append(r2);
        r0.append(", errorBody:");
        if (r4 == null) goto L11;
        String r3 = r4.getErrorBody();
    L12:
        r0.append(r3);
        r0.append(", errorDetail:");
        if (r4 == null) goto L15;
        String r5 = r4.getErrorDetail();
    L16:
        r0.append(r5);
        r0.append(", exception:");
        if (r4 == null) goto L19;
        String r6 = r4.getLocalizedMessage();
    L20:
        r0.append(r6);
        LogUtils.d(new Object[]{r0.toString()});
        if (r4 == null) goto L25;
        Response r7 = (Response) r4.getErrorAsObject(Response.class);
        if (r7 == null) goto L25;
        r1 = Integer.valueOf(r7.getCode());
    L27:
        handleError(String.valueOf(r1));
        return;
    L25:
        if (r4 == null) goto L27;
        r1 = Integer.valueOf(r4.getErrorCode());
        goto L27
    L19:
        r6 = null;
        goto L20
    L15:
        r5 = null;
        goto L16
    L11:
        r3 = null;
        goto L12
    L7:
        r2 = null;
        goto L8
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
