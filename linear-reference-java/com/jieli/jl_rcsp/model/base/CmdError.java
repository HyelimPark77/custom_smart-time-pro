package com.jieli.jl_rcsp.model.base;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.ud5;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class CmdError {
    private static final String KEY_CMD = "cmd";
    private static final String KEY_CODE = "code";
    private static final String KEY_DESC = "desc";
    private static final String KEY_SUB_CODE = "sub_code";
    private static final String KEY_SUB_DESC = "sub_desc";
    private final int cmdId;
    private final int code;
    private String desc;
    private final int subCode;
    private String subDesc;

    public CmdError(int r2, int r3) {
        this(r2, r3, 0);
    }

    public static CmdError parseCmdError(String r7) {
        if (TextUtils.isEmpty(r7) == false) goto L22;
        return null;
    L22:
        JSONObject r5 = new JSONObject(r7);     // Catch: JSONException -> L19
        if (r5.has(KEY_CMD) == true) goto L8;
    L18:
        return null;
    L8:
        if (r5.has("code") == false) goto L18;
        if (r5.has(KEY_SUB_CODE) == false) goto L18;
        CmdError r8 = new CmdError(r5.getInt(KEY_CMD), r5.getInt("code"), r5.getInt(KEY_SUB_CODE));     // Catch: JSONException -> L19
        if (r5.has("desc") == false) goto L15;
        r8.setDesc(r5.getString("desc"));     // Catch: JSONException -> L19
    L15:
        if (r5.has(KEY_SUB_DESC) == false) goto L17;
        r8.setSubDesc(r5.getString(KEY_SUB_DESC));     // Catch: JSONException -> L19
    L17:
        return r8;
    L19:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public int getCmdId() {
        return this.cmdId;
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getSubCode() {
        return this.subCode;
    }

    public String getSubDesc() {
        return this.subDesc;
    }

    public void setDesc(String r1) {
        this.desc = r1;
    }

    public void setSubDesc(String r1) {
        this.subDesc = r1;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("{");
        r0.append("\"");
        r0.append(KEY_CMD);
        r0.append("\":");
        r0.append(this.cmdId);
        r0.append(", \"");
        r0.append("code");
        r0.append("\":");
        r0.append(this.code);
        if (TextUtils.isEmpty(this.desc) == true) goto L5;
        r0.append(", \"");
        r0.append("desc");
        r0.append("\":\"");
        r0.append(this.desc);
        r0.append("\"");
    L5:
        r0.append(", \"");
        r0.append(KEY_SUB_CODE);
        r0.append("\":");
        r0.append(this.subCode);
        if (TextUtils.isEmpty(this.subDesc) == true) goto L8;
        r0.append(", \"");
        r0.append(KEY_SUB_DESC);
        r0.append("\":\"");
        r0.append(this.subDesc);
        r0.append("\"");
    L8:
        r0.append(ud5.I0iXXO);
        return r0.toString();
    }

    public CmdError(int r1, int r2, int r3) {
        this.cmdId = r1;
        this.code = r2;
        this.subCode = r3;
    }
}
