package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.sma.androidnetworklib.model.Response;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$upload$2\n*L\n1#1,511:1\n*E\n"})
public final class NetWorkUtils$upload$$inlined$upload$2<T> implements ParsedRequestListener<Response<T>> {
    final /* synthetic */ O1XIiIO $callback;

    public NetWorkUtils$upload$$inlined$upload$2(O1XIiIO o1XIiIO) {
        this.$callback = o1XIiIO;
    }

    @Override // com.androidnetworking.interfaces.ParsedRequestListener
    public void onError(ANError aNError) {
        this.$callback.handleError(String.valueOf(aNError));
    }

    @Override // com.androidnetworking.interfaces.ParsedRequestListener
    public void onResponse(Response<T> response) {
        Intrinsics.X0O(response, "response");
        this.$callback.handleResponse(response);
    }
}
