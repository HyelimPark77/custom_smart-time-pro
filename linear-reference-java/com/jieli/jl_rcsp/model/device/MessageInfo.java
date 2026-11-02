package com.jieli.jl_rcsp.model.device;

import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class MessageInfo {
    public static final int LIMIT_PACKAGE = 240;
    public static final int LIMIT_PACKAGE_NAME = 31;
    public static final int LIMIT_TITLE = 36;
    public static final int LIMIT_TOTAL_LEN = 512;
    private final byte[] appPackageName;
    private final byte[] content;
    private final int flag;
    private final byte[] timestamp;
    private final byte[] title;

    public MessageInfo(String r2, int r3, String r4, String r5, long r6) {
        this.appPackageName = RcspUtil.getData(r2, 31);
        this.flag = r3;
        this.title = RcspUtil.getData(r4, 36);
        this.content = RcspUtil.getData(r5, 424);
        this.timestamp = CHexConver.intToBigBytes(RcspUtil.time2Int(r6));
    }

    public byte[] beanToData() {
        ByteArrayOutputStream r2 = new ByteArrayOutputStream();
        r2.write(RcspUtil.packLTVPacket2(0, this.timestamp));     // Catch: IOException -> L6
        r2.write(RcspUtil.packLTVPacket2(1, this.appPackageName));     // Catch: IOException -> L6
        r2.write(RcspUtil.packLTVPacket2(2, new byte[]{(byte) this.flag}));     // Catch: IOException -> L6
        byte[] r0 = this.title;     // Catch: IOException -> L6
        if (r0 == null) goto L8;
        r2.write(RcspUtil.packLTVPacket2(3, r0));     // Catch: IOException -> L6
    L8:
        byte[] r1 = this.content;     // Catch: IOException -> L6
        if (r1 == null) goto L14;
        r2.write(RcspUtil.packLTVPacket2(4, r1));     // Catch: IOException -> L6
    L14:
        return r2.toByteArray();
    L6:
        e = move-exception;
        e.printStackTrace();
        goto L14
    }

    public byte[] getAppPackageName() {
        return this.appPackageName;
    }

    public byte[] getContent() {
        return this.content;
    }

    public int getFlag() {
        return this.flag;
    }

    public byte[] getTimestamp() {
        return this.timestamp;
    }

    public byte[] getTitle() {
        return this.title;
    }
}
