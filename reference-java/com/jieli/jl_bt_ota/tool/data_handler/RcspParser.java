package com.jieli.jl_bt_ota.tool.data_handler;

import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class RcspParser {

    /* JADX INFO: renamed from: a */
    private final String f37723a = RcspParser.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private final ByteArrayOutputStream f37724b = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: c */
    private final byte[] f37725c = {-2, -36, -70};

    /* JADX INFO: renamed from: a */
    private byte[] m27207a(byte[] bArr) {
        int length = bArr.length;
        byte[] byteArray = this.f37724b.toByteArray();
        int length2 = byteArray.length;
        if (length2 <= 0) {
            return (byte[]) bArr.clone();
        }
        byte[] bArr2 = new byte[length2 + length];
        System.arraycopy(byteArray, 0, bArr2, 0, length2);
        System.arraycopy(bArr, 0, bArr2, length2, length);
        this.f37724b.reset();
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    private BasePacket m27208b(byte[] bArr) {
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
            JL_Log.m27232d(this.f37723a, "parsePacketData", CommonUtil.formatString("packet type : %d, opCode : %d, sn :%d", Integer.valueOf(basePacket.getType()), Integer.valueOf(basePacket.getOpCode()), Integer.valueOf(basePacket.getOpCodeSn())));
        }
        return basePacket;
    }

    public ArrayList<BasePacket> findPacketData(int i, byte[] bArr) {
        if (i == 0 || bArr == null || bArr.length == 0) {
            return null;
        }
        ArrayList<BasePacket> arrayList = new ArrayList<>();
        byte[] bArrM27207a = m27207a(bArr);
        int length = bArrM27207a.length;
        JL_Log.m27236i(this.f37723a, "findPacketData", "mtu = " + i);
        int i2 = 0;
        while (i2 < length) {
            int iM27206a = m27206a(bArrM27207a, i2, i);
            if (iM27206a < this.f37725c.length) {
                JL_Log.m27240w(this.f37723a, "findPacketData", "not find head data : ");
                return arrayList;
            }
            int iBytesToInt = CHexConver.bytesToInt(bArrM27207a, iM27206a + 2, 2);
            JL_Log.m27236i(this.f37723a, "findPacketData", "prefixIndex = " + iM27206a + ", paramLen = " + iBytesToInt);
            int i3 = iBytesToInt + 4;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArrM27207a, iM27206a, bArr2, 0, i3);
            BasePacket basePacketM27208b = m27208b(bArr2);
            if (basePacketM27208b != null) {
                arrayList.add(basePacketM27208b);
            }
            i2 = iM27206a + 4 + iBytesToInt + 1;
        }
        return arrayList;
    }

    public void release() {
        this.f37724b.reset();
    }

    /* JADX INFO: renamed from: a */
    private int m27206a(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        while (i < length) {
            if (bArr[i] == -2) {
                int i3 = length - i;
                byte[] bArr2 = this.f37725c;
                if (i3 < bArr2.length) {
                    m27209b(bArr, i, i3);
                    return -1;
                }
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArr, i, bArr3, 0, length2);
                if (Arrays.equals(bArr3, this.f37725c)) {
                    byte[] bArr4 = this.f37725c;
                    if (i3 <= bArr4.length + 4) {
                        m27209b(bArr, i, i3);
                        return -1;
                    }
                    int length3 = bArr4.length + i;
                    byte[] bArr5 = new byte[2];
                    System.arraycopy(bArr, length3 + 2, bArr5, 0, 2);
                    int iBytesToInt = CHexConver.bytesToInt(bArr5[0], bArr5[1]);
                    if (iBytesToInt > i2 - 8) {
                        JL_Log.m27234e(this.f37723a, "findPacketData", CommonUtil.formatString("data length[%d] over MAX_RECEIVE_MTU[%d], cast away", Integer.valueOf(iBytesToInt), Integer.valueOf(i2)));
                    } else {
                        if (i3 <= this.f37725c.length + 4 + iBytesToInt) {
                            m27209b(bArr, i, i3);
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
    private void m27209b(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || bArr.length <= 0 || i < 0 || i2 <= 0 || (i3 = i2 + i) > bArr.length) {
            return;
        }
        try {
            this.f37724b.write(Arrays.copyOfRange(bArr, i, i3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
