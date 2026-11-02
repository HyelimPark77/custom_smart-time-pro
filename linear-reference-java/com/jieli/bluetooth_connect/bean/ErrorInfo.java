package com.jieli.bluetooth_connect.bean;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.android.mltcode.paycertificationapi.ud5;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ErrorInfo {
    private int code;
    private BluetoothDevice device;
    private String message;

    public static class ErrorMsg {
        static final String KEY_CODE = "code";
        static final String KEY_DESC = "desc";
        static final String KEY_MESSAGE = "message";
        static final String KEY_SUB_CODE = "sub_code";
        private final int code;
        private final String desc;
        private final String message;
        private final int subCode;

        public ErrorMsg(int code) {
            this(code, ErrorInfo.getErrDesc(code), 0, null);
        }

        public static ErrorMsg parseJson(String string) {
            if (TextUtils.isEmpty(string) == false) goto L22;
            return null;
        L22:
            JSONObject r4 = new JSONObject(string);     // Catch: JSONException -> L12
            if (r4.has("code") == true) goto L8;
        L21:
            return null;
        L8:
            if (r4.has(KEY_SUB_CODE) == false) goto L21;
            String r7 = "";
            if (r4.has("desc") == false) goto L15;
            r7 = r4.getString("desc");     // Catch: JSONException -> L12
        L15:
            if (r4.has("message") == false) goto L17;
            String r0 = r4.getString("message");     // Catch: JSONException -> L12
        L18:
            return new ErrorMsg(r4.getInt("code"), r7, r4.getInt(KEY_SUB_CODE), r0);
        L17:
            r0 = null;
        L12:
            e = move-exception;
            e.printStackTrace();
            goto L21
        }

        public int getCode() {
            return this.code;
        }

        public String getDesc() {
            return this.desc;
        }

        public String getMessage() {
            return this.message;
        }

        public int getSubCode() {
            return this.subCode;
        }

        @NonNull
        public String toString() {
            StringBuilder r0 = new StringBuilder("{");
            r0.append("\"");
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
            if (TextUtils.isEmpty(this.message) == true) goto L8;
            r0.append(", \"");
            r0.append("message");
            r0.append("\":\"");
            r0.append(this.message);
            r0.append("\"");
        L8:
            r0.append(ud5.I0iXXO);
            return r0.toString();
        }

        public ErrorMsg(int code, int subCode, String message) {
            this(code, ErrorInfo.getErrDesc(code), subCode, message);
        }

        public ErrorMsg(int code, String desc, int subCode, String message) {
            this.code = code;
            this.subCode = subCode;
            this.desc = desc;
            this.message = message;
        }
    }

    public ErrorInfo() {
    }

    public static ErrorInfo buildError(int code) {
        return new ErrorInfo(code, new ErrorMsg(code).toString());
    }

    public static String getErrDesc(int code) {
        switch(code) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            case 10: goto L5;
            default: goto L3;
        };
    L3:
        return "";
    L5:
        return "The remote device is not connected.";
    L7:
        return "Timeout Exception.";
    L9:
        return "A scan error occurred.";
    L11:
        return "Operation in progress.";
    L13:
        return "Call reflection method exception.";
    L15:
        return "Bluetooth pairing/unpairing in progress.";
    L17:
        return "Bluetooth pairing/unpairing timeout.";
    L19:
        return "Bluetooth pairing/unpairing operation failed.";
    L21:
        return "Bluetooth is not on.";
    L23:
        return "Parameter Error.";
    L25:
        return "Success.";
    }

    public int getCode() {
        return this.code;
    }

    public BluetoothDevice getDevice() {
        return this.device;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDevice(BluetoothDevice device) {
        this.device = device;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "ErrorInfo{code=" + this.code + ", message='" + this.message + "', device=" + this.device + i0XO1.IO;
    }

    public ErrorInfo(int code, String message) {
        setCode(code);
        setMessage(message);
    }

    public static ErrorInfo buildError(int code, int subCode, String message) {
        return new ErrorInfo(code, new ErrorMsg(code, subCode, message).toString());
    }
}
