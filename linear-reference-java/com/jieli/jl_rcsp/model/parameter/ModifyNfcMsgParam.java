package com.jieli.jl_rcsp.model.parameter;

import android.text.TextUtils;
import com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes17.dex */
public class ModifyNfcMsgParam extends NFCOperationCmd.ModifyMsgParam {
    private final String nickName;
    private final long updateTime;

    public ModifyNfcMsgParam(int r3, short r4, long r5, String r7) {
        super(r3, r4, getMask(r5, r7), getMaskData(r5, r7));
        this.updateTime = r5;
        this.nickName = new String(RcspUtil.getData(r7, 24));
    }

    private static int getMask(long r2, String r4) {
        if (r2 <= 0) goto L5;
        int r3 = 1;
    L7:
        if (TextUtils.isEmpty(r4) == false) goto L9;
        return r3;
    L9:
        return r3 | 2;
    L5:
        r3 = 0;
        goto L7
    }

    private static byte[] getMaskData(long r4, String r6) {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        if (r4 <= 0) goto L8;
        r0.write(CHexConver.intToBigBytes(RcspUtil.time2Int(r4)));     // Catch: Exception -> L5
    L5:
        e = move-exception;
        e.printStackTrace();
    L13:
        return r0.toByteArray();
    L8:
        if (TextUtils.isEmpty(r6) == true) goto L13;
        byte[] r5 = new byte[24];     // Catch: Exception -> L5
        System.arraycopy(r6.getBytes(), 0, r5, 0, r6.getBytes().length);     // Catch: Exception -> L5
        JL_Log.i("ModifyNfcMsgParam", "getMaskData", "modify name : " + r6 + ", data = " + CHexConver.byte2HexStr(r5));     // Catch: Exception -> L5
        r0.write(r5);     // Catch: Exception -> L5
        goto L13
    }

    public String getNickName() {
        return this.nickName;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }
}
