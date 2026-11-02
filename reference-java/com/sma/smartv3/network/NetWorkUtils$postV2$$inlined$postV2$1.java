package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.sma.androidnetworklib.model.Response;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$postV2$1\n*L\n1#1,511:1\n*E\n"})
public final class NetWorkUtils$postV2$$inlined$postV2$1<T> implements ParsedRequestListener<Response<T>> {
    final /* synthetic */ O1XIiIO $callback;

    public NetWorkUtils$postV2$$inlined$postV2$1(O1XIiIO o1XIiIO) {
        this.$callback = o1XIiIO;
    }

    @Override // com.androidnetworking.interfaces.ParsedRequestListener
    public void onError(ANError aNError) {
        Response response;
        if (aNError != null) {
            aNError.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("errorCode:");
        Integer numValueOf = null;
        sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
        sb.append(", errorBody:");
        sb.append(aNError != null ? aNError.getErrorBody() : null);
        sb.append(", errorDetail:");
        sb.append(aNError != null ? aNError.getErrorDetail() : null);
        sb.append(", exception:");
        sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
        LogUtils.m11128d(sb.toString());
        if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
            numValueOf = Integer.valueOf(response.getCode());
        } else if (aNError != null) {
            numValueOf = Integer.valueOf(aNError.getErrorCode());
        }
        this.$callback.handleError(String.valueOf(numValueOf));
    }

    @Override // com.androidnetworking.interfaces.ParsedRequestListener
    public void onResponse(Response<T> response) {
        Intrinsics.X0O(response, "response");
        this.$callback.handleResponse(response);
    }
}
