package com.jieli.jl_bt_ota.model;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.ud5;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ErrorMsg {
    private static final String KEY_CODE = "code";
    private static final String KEY_DESC = "desc";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_SUB_CODE = "sub_code";
    private final int code;
    private final String codeDesc;
    private final int subCode;
    private String subMessage;

    public ErrorMsg(int r1, String r2, int r3, String r4) {
        this.code = r1;
        this.codeDesc = r2;
        this.subCode = r3;
        this.subMessage = r4;
    }

    public static ErrorMsg parseJson(String r6) {
        if (TextUtils.isEmpty(r6) == false) goto L23;
        return null;
    L23:
        JSONObject r4 = new JSONObject(r6);     // Catch: JSONException -> L12
        if (r4.has("code") == true) goto L8;
    L22:
        return null;
    L8:
        if (r4.has(KEY_SUB_CODE) == false) goto L22;
        if (r4.has("desc") == false) goto L14;
        String r7 = r4.getString("desc");     // Catch: JSONException -> L12
    L16:
        if (r4.has("message") == false) goto L18;
        String r0 = r4.getString("message");     // Catch: JSONException -> L12
    L19:
        return new ErrorMsg(r4.getInt("code"), r7, r4.getInt(KEY_SUB_CODE), r0);
    L18:
        r0 = null;
        goto L19
    L14:
        r7 = null;
    L12:
        e = move-exception;
        e.printStackTrace();
        goto L22
    }

    private String toJsonString() {
        StringBuilder r0 = new StringBuilder("{");
        r0.append("\"");
        r0.append("code");
        r0.append("\":");
        r0.append(this.code);
        if (TextUtils.isEmpty(this.codeDesc) == true) goto L5;
        r0.append(", \"");
        r0.append("desc");
        r0.append("\":\"");
        r0.append(this.codeDesc);
        r0.append("\"");
    L5:
        r0.append(", \"");
        r0.append(KEY_SUB_CODE);
        r0.append("\":");
        r0.append(this.subCode);
        if (TextUtils.isEmpty(this.subMessage) == true) goto L8;
        r0.append(", \"");
        r0.append("message");
        r0.append("\":\"");
        r0.append(this.subMessage);
        r0.append("\"");
    L8:
        r0.append(ud5.I0iXXO);
        return r0.toString();
    }

    public Integer getCode() {
        return Integer.valueOf(this.code);
    }

    public String getCodeDesc() {
        return this.codeDesc;
    }

    public int getSubCode() {
        return this.subCode;
    }

    public String getSubMessage() {
        return this.subMessage;
    }

    public void setSubMessage(String r1) {
        this.subMessage = r1;
    }

    public String toString() {
        return toJsonString();
    }
}
