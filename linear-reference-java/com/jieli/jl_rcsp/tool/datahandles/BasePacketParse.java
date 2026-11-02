package com.jieli.jl_rcsp.tool.datahandles;

import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class BasePacketParse {
    public final String a;
    public final ByteArrayOutputStream b;
    public final byte[] c;

    public BasePacketParse() {
        this.a = BasePacketParse.class.getSimpleName();
        this.b = new ByteArrayOutputStream();
        this.c = new byte[]{-2, -36, -70};
    }

    public final byte[] a(byte[] r6) {
        int r0 = r6.length;
        byte[] r1 = this.b.toByteArray();
        int r2 = r1.length;
        if (r2 <= 0) goto L7;
        byte[] r3 = new byte[r2 + r0];
        System.arraycopy(r1, 0, r3, 0, r2);
        System.arraycopy(r6, 0, r3, r2, r0);
        this.b.reset();
        return r3;
    L7:
        return (byte[]) r6.clone();
    }

    public final BasePacket b(byte[] r11) {
        if (r11 == null) goto L14;
        int r1 = 4;
        if (r11.length < 4) goto L16;
        byte[] r2 = CHexConver.getBooleanArrayBig(r11[0]);
        int r4 = CHexConver.byteToInt(r11[1]);
        int r6 = CHexConver.bytesToInt(r11, 2, 2);
        BasePacket r7 = new BasePacket();
        int r8 = CHexConver.byteToInt(r2[7]);
        int r3 = CHexConver.byteToInt(r2[6]);
        r7.setType(r8);
        r7.setHasResponse(r3);
        r7.setOpCode(r4);
        r7.setParamLen(r6);
        if (r6 <= 0) goto L13;
        if (r8 != 0) goto L9;
        r7.setStatus(CHexConver.byteToInt(r11[4]));
        r1 = 5;
    L9:
        r7.setOpCodeSn(CHexConver.byteToInt(r11[r1]));
        int r5 = r1 + 1;
        if (r4 != 1) goto L12;
        r7.setXmOpCode(CHexConver.byteToInt(r11[r5]));
        r5 = r1 + 2;
    L12:
        int r9 = r6 - (r5 - 4);
        byte[] r10 = new byte[r9];
        System.arraycopy(r11, r5, r10, 0, r9);
        r7.setParamData(r10);
        JL_Log.d(this.a, "parsePacketData", RcspUtil.formatString("packet type : %d, opCode : %d(0x%X), sn :%d", new Object[]{Integer.valueOf(r7.getType()), Integer.valueOf(r7.getOpCode()), Integer.valueOf(r7.getOpCode()), Integer.valueOf(r7.getOpCodeSn())}));
    L13:
        return r7;
    L16:
        return null;
    L14:
        return null;
    }

    public ArrayList<BasePacket> findPacketData(int r10, byte[] r11) {
        if (r10 == 0) goto L18;
        if (r11 != null) goto L5;
        return null;
    L5:
        if (r11.length == 0) goto L25;
        ArrayList<BasePacket> r0 = new ArrayList();
        byte[] r12 = a(r11);
        int r1 = r12.length;
        JL_Log.d(this.a, "findPacketData", "protocol mtu : " + r10);
        int r3 = 0;
    L8:
        if (r3 >= r1) goto L17;
        int r4 = a(r12, r3, r10);
        if (r4 < this.c.length) goto L11;
        int r5 = CHexConver.bytesToInt(r12, r4 + 2, 2);
        JL_Log.d(this.a, "findPacketData", "prefixIndex = " + r4 + ", paramLen = " + r5);
        int r6 = r5 + 4;
        byte[] r7 = new byte[r6];
        System.arraycopy(r12, r4, r7, 0, r6);
        BasePacket r8 = b(r7);
        if (r8 == null) goto L16;
        r0.add(r8);
    L16:
        r3 = ((r4 + 4) + r5) + 1;
        goto L8
    L11:
        JL_Log.i(this.a, "findPacketData", "No header data found.");
        return r0;
    L17:
        return r0;
    L25:
        return null;
    L18:
        return null;
    }

    public void release() {
        this.b.reset();
    }

    public final int a(byte[] r10, int r11, int r12) {
        int r0 = r10.length;
    L4:
        if (r11 >= r0) goto L30;
        if (r10[r11] != (-2)) goto L29;
        int r2 = r0 - r11;
        byte[] r3 = this.c;
        if (r2 < r3.length) goto L9;
        int r4 = r3.length;
        byte[] r5 = new byte[r4];
        System.arraycopy(r10, r11, r5, 0, r4);
        if (Arrays.equals(r5, this.c) == false) goto L29;
        byte[] r6 = this.c;
        if (r2 <= (r6.length + 4)) goto L15;
        int r7 = r6.length + r11;
        byte[] r8 = new byte[2];
        System.arraycopy(r10, r7 + 2, r8, 0, 2);
        int r9 = CHexConver.bytesToInt(r8[0], r8[1]);
        if (r9 <= (r12 - 8)) goto L22;
        JL_Log.w(this.a, "findValidRcspHeadIndex", RcspUtil.formatString("data length[%d] over MAX_RECEIVE_MTU[%d], cast away", new Object[]{Integer.valueOf(r9), Integer.valueOf(r12)}));
    L20:
        r11 = r7 - 1;
        goto L29
    L22:
        if (r2 <= ((this.c.length + 4) + r9)) goto L23;
        if (r10[(r7 + 4) + r9] != (-17)) goto L20;
        return r7;
    L23:
        b(r10, r11, r2);
        return -1;
    L15:
        b(r10, r11, r2);
        return -1;
    L9:
        b(r10, r11, r2);
        return -1;
    L29:
        r11 = r11 + 1;
        goto L4
    L30:
        return -1;
    }

    public final void b(byte[] r2, int r3, int r4) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (r2.length <= 0) goto L17;
        if (r3 < 0) goto L18;
        if (r4 <= 0) goto L19;
        int r5 = r4 + r3;
        if (r5 > r2.length) goto L20;
        this.b.write(Arrays.copyOfRange(r2, r3, r5));     // Catch: Exception -> L11
        return;
    L11:
        e = move-exception;
        e.printStackTrace();
        return;
    L20:
        return;
    L19:
        return;
    L18:
        return;
    }
}
