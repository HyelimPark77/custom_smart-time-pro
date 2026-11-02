package com.sma.androidnetworklib.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;

/* JADX INFO: loaded from: classes18.dex */
public final class Response<T> {
    private int code;

    @tb1
    private final T data;

    @aa1
    private final String mesg = "";

    @aa1
    private final String msg = "";

    @aa1
    private final String requestID = "";

    public final int getCode() {
        return this.code;
    }

    @tb1
    public final T getData() {
        return this.data;
    }

    @aa1
    public final String getMesg() {
        return this.mesg;
    }

    @aa1
    public final String getMsg() {
        return this.msg;
    }

    @aa1
    public final String getRequestID() {
        return this.requestID;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    @aa1
    public String toString() {
        return "Response(code=" + this.code + ", requestID='" + this.requestID + "', mesg='" + this.mesg + "', msg='" + this.msg + "', data=" + this.data + HexStringBuilder.COMMENT_END_CHAR;
    }
}
