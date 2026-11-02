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

    /* JADX INFO: renamed from: a */
    public final String f38291a = BasePacketParse.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public final ByteArrayOutputStream f38292b = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: c */
    public final byte[] f38293c = {-2, -36, -70};

    /* JADX INFO: renamed from: a */
    public final byte[] m27786a(byte[] bArr) {
        int length = bArr.length;
        byte[] byteArray = this.f38292b.toByteArray();
        int length2 = byteArray.length;
        if (length2 <= 0) {
            return (byte[]) bArr.clone();
        }
        byte[] bArr2 = new byte[length2 + length];
        System.arraycopy(byteArray, 0, bArr2, 0, length2);
        System.arraycopy(bArr, 0, bArr2, length2, length);
        this.f38292b.reset();
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public final BasePacket m27787b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i = 4;
        if (bArr.length < 4) {
            return null;
        }
        byte[] booleanArrayBig = CHexConver.getBooleanArrayBig(bArr[0]);
        int iByteToInt = CHexConver.byteToInt(bArr[1]);
        int iBytesToInt = CHexConver.bytesToInt(bArr, 2, 2);
        BasePacket basePacket = new BasePacket();
        int iByteToInt2 = CHexConver.byteToInt(booleanArrayBig[7]);
        int iByteToInt3 = CHexConver.byteToInt(booleanArrayBig[6]);
        basePacket.setType(iByteToInt2);
        basePacket.setHasResponse(iByteToInt3);
        basePacket.setOpCode(iByteToInt);
        basePacket.setParamLen(iBytesToInt);
        if (iBytesToInt > 0) {
            if (iByteToInt2 == 0) {
                basePacket.setStatus(CHexConver.byteToInt(bArr[4]));
                i = 5;
            }
            basePacket.setOpCodeSn(CHexConver.byteToInt(bArr[i]));
            int i2 = i + 1;
            if (iByteToInt == 1) {
                basePacket.setXmOpCode(CHexConver.byteToInt(bArr[i2]));
                i2 = i + 2;
            }
            int i3 = iBytesToInt - (i2 - 4);
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            basePacket.setParamData(bArr2);
            JL_Log.m27877d(this.f38291a, "parsePacketData", RcspUtil.formatString("packet type : %d, opCode : %d(0x%X), sn :%d", Integer.valueOf(basePacket.getType()), Integer.valueOf(basePacket.getOpCode()), Integer.valueOf(basePacket.getOpCode()), Integer.valueOf(basePacket.getOpCodeSn())));
        }
        return basePacket;
    }

    public ArrayList<BasePacket> findPacketData(int i, byte[] bArr) {
        if (i == 0 || bArr == null || bArr.length == 0) {
            return null;
        }
        ArrayList<BasePacket> arrayList = new ArrayList<>();
        byte[] bArrM27786a = m27786a(bArr);
        int length = bArrM27786a.length;
        JL_Log.m27877d(this.f38291a, "findPacketData", "protocol mtu : " + i);
        int i2 = 0;
        while (i2 < length) {
            int iM27785a = m27785a(bArrM27786a, i2, i);
            if (iM27785a < this.f38293c.length) {
                JL_Log.m27883i(this.f38291a, "findPacketData", "No header data found.");
                return arrayList;
            }
            int iBytesToInt = CHexConver.bytesToInt(bArrM27786a, iM27785a + 2, 2);
            JL_Log.m27877d(this.f38291a, "findPacketData", "prefixIndex = " + iM27785a + ", paramLen = " + iBytesToInt);
            int i3 = iBytesToInt + 4;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArrM27786a, iM27785a, bArr2, 0, i3);
            BasePacket basePacketM27787b = m27787b(bArr2);
            if (basePacketM27787b != null) {
                arrayList.add(basePacketM27787b);
            }
            i2 = iM27785a + 4 + iBytesToInt + 1;
        }
        return arrayList;
    }

    public void release() {
        this.f38292b.reset();
    }

    /* JADX INFO: renamed from: a */
    public final int m27785a(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        while (i < length) {
            if (bArr[i] == -2) {
                int i3 = length - i;
                byte[] bArr2 = this.f38293c;
                if (i3 < bArr2.length) {
                    m27788b(bArr, i, i3);
                    return -1;
                }
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArr, i, bArr3, 0, length2);
                if (Arrays.equals(bArr3, this.f38293c)) {
                    byte[] bArr4 = this.f38293c;
                    if (i3 <= bArr4.length + 4) {
                        m27788b(bArr, i, i3);
                        return -1;
                    }
                    int length3 = bArr4.length + i;
                    byte[] bArr5 = new byte[2];
                    System.arraycopy(bArr, length3 + 2, bArr5, 0, 2);
                    int iBytesToInt = CHexConver.bytesToInt(bArr5[0], bArr5[1]);
                    if (iBytesToInt > i2 - 8) {
                        JL_Log.m27887w(this.f38291a, "findValidRcspHeadIndex", RcspUtil.formatString("data length[%d] over MAX_RECEIVE_MTU[%d], cast away", Integer.valueOf(iBytesToInt), Integer.valueOf(i2)));
                    } else {
                        if (i3 <= this.f38293c.length + 4 + iBytesToInt) {
                            m27788b(bArr, i, i3);
                            return -1;
                        }
                        if (bArr[length3 + 4 + iBytesToInt] == -17) {
                            return length3;
                        }
                    }
                    i = length3 - 1;
                } else {
                    continue;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m27788b(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || bArr.length <= 0 || i < 0 || i2 <= 0 || (i3 = i2 + i) > bArr.length) {
            return;
        }
        try {
            this.f38292b.write(Arrays.copyOfRange(bArr, i, i3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
