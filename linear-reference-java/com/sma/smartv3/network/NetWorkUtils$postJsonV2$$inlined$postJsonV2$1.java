package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.ironsource.Ne;
import com.sma.androidnetworklib.model.Response;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$postJsonV2$1\n*L\n1#1,511:1\n*E\n"})
public final class NetWorkUtils$postJsonV2$$inlined$postJsonV2$1<T> implements ParsedRequestListener<Response<T>> {
    final /* synthetic */ O1XIiIO $callback;

    public NetWorkUtils$postJsonV2$$inlined$postJsonV2$1(O1XIiIO r1) {
        this.$callback = r1;
    }

    @Override // com.androidnetworking.interfaces.ParsedRequestListener
    public void onError(ANError r2) {
        handleError(String.valueOf(r2));
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
