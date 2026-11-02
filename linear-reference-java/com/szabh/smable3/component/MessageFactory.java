package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.OOOi0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ao0;
import com.android.mltcode.paycertificationapi.gj0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.ai.speech.realtime.Util;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.iflytek.sparkchain.utils.constants.ErrorCode;
import com.realsil.sdk.dfu.image.constants.SubBinId;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageFactory {

    @aa1
    private static final int[] CRC16_TABLE = null;
    public static final int HEADER_NACK = 32;
    public static final int HEADER_REPLY = 16;
    private static final int HEADER_VERSION = 1;

    @aa1
    public static final MessageFactory INSTANCE = null;
    public static final int LENGTH_BEFORE_CMD = 6;
    private static final int LENGTH_BEFORE_CRC = 4;
    public static final int LENGTH_BEFORE_DATA = 9;
    public static final int LENGTH_BEFORE_LENGTH = 2;
    private static final int LENGTH_COMMAND = 1;
    private static final int LENGTH_CRC = 2;
    private static final int LENGTH_HEADER = 1;
    private static final int LENGTH_KEY = 1;
    private static final int LENGTH_KEY_FLAG = 1;
    private static final int LENGTH_MAGIC = 1;
    public static final int LENGTH_PAYLOAD_LENGTH = 2;
    private static final byte MAGIC = -85;

    @aa1
    private static final String TAG = "MessageFactory";

    static {
        INSTANCE = new MessageFactory();
        CRC16_TABLE = new int[]{0, 49345, 49537, 320, 49921, gj0.OIi0, 640, 49729, 50689, 1728, 1920, 51009, 1280, 50625, 50305, 1088, 52225, 3264, 3456, 52545, 3840, 53185, 52865, OOOi0.X0O1XO, SubBinId.Bbpro.FACTORY_IAMGE, 51905, 52097, 2880, 51457, OOOi0.I11iXOO, 2176, 51265, 55297, 6336, 6528, 55617, 6912, 56257, 55937, 6720, 7680, 57025, 57217, 8000, 56577, 7616, 7296, 56385, Util.BYTES_PER_FRAME, 54465, 54657, 5440, 55041, 6080, 5760, 54849, 53761, 4800, 4992, 54081, 4352, 53697, 53377, 4160, 61441, 12480, 12672, 61761, 13056, 62401, 62081, 12864, 13824, 63169, 63361, 14144, 62721, 13760, 13440, 62529, 15360, 64705, 64897, 15680, 65281, 16320, 16000, 65089, 64001, 15040, 15232, 64321, 14592, 63937, 63617, 14400, 10240, 59585, 59777, 10560, 60161, ErrorCode.MSP_ERROR_AUTH_NO_LICENSE, 10880, 59969, 60929, 11968, 12160, 61249, 11520, 60865, 60545, 11328, 58369, 9408, 9600, 58689, 9984, 59329, 59009, 9792, 8704, 58049, 58241, 9024, 57601, 8640, 8320, 57409, 40961, 24768, 24960, 41281, 25344, 41921, 41601, 25152, 26112, 42689, 42881, 26432, 42241, 26048, 25728, 42049, 27648, 44225, 44417, 27968, 44801, 28608, 28288, 44609, 43521, 27328, 27520, 43841, 26880, 43457, 43137, 26688, 30720, 47297, 47489, 31040, 47873, 31680, 31360, 47681, 48641, 32448, 32640, 48961, 32000, 48577, 48257, 31808, 46081, 29888, 30080, 46401, 30464, 47041, 46721, 30272, 29184, 45761, 45953, 29504, 45313, 29120, 28800, 45121, 20480, 37057, 37249, 20800, 37633, 21440, 21120, 37441, 38401, 22208, 22400, 38721, 21760, 38337, 38017, 21568, 39937, 23744, 23936, 40257, 24320, 40897, 40577, 24128, 23040, 39617, 39809, 23360, 39169, 22976, 22656, 38977, 34817, 18624, 18816, 35137, 19200, 35777, 35457, 19008, 19968, 36545, 36737, 20288, 36097, 19904, 19584, 35905, 17408, 33985, 34177, 17728, 34561, 18368, 18048, 34369, 33281, 17088, 17280, 33601, 16640, 33217, 32897, 16448};
    }

    private MessageFactory() {
    }

    public static /* synthetic */ CharSequence OXO1(byte r0) {
        return toHex$lambda$0(r0);
    }

    private final int calculateCrc16(byte[] r4, int r5) {
        int r0 = r4.length;
        int r1 = 0;
    L3:
        if (r5 >= r0) goto L5;
        r1 = queryCrc16(r1, r4[r5]);
        r5 = r5 + 1;
        goto L3
    L5:
        return r1;
    }

    public static /* synthetic */ byte[] create$default(MessageFactory r0, int r1, BleKey r2, BleKeyFlag r3, byte[] r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = BleKeyFlag.UPDATE;
    L6:
        if ((r5 & 8) == 0) goto L9;
        r4 = null;
    L9:
        return r0.create(r1, r2, r3, r4);
    }

    private final int queryCrc16(int r3, byte r4) {
        int r0 = r3 >>> 8;
        return CRC16_TABLE[(r3 ^ r4) & 255] ^ r0;
    }

    private static final CharSequence toHex$lambda$0(byte r1) {
        String r2 = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(r1)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        return r2;
    }

    @aa1
    public final byte[] create(int r5, @aa1 BleKey r6, @aa1 BleKeyFlag r7, @tb1 byte[] r8) {
        Intrinsics.X0O(r6, "bleKey");
        Intrinsics.X0O(r7, "keyFlag");
        if (r8 == null) goto L5;
        int r1 = r8.length;
    L6:
        ByteBuffer r2 = ByteBuffer.allocate(r1 + 9);
        r2.put(MAGIC);
        r2.put((byte) (r5 | 1));
        r2.putShort((short) (r1 + 3));
        r2.putShort(0);
        r2.put(r6.getMCommandRawValue());
        r2.put(r6.getMKeyRawValue());
        r2.put((byte) r7.getMBleKeyFlag());
        if (r8 == null) goto L9;
        r2.put(r8);
    L9:
        byte[] r9 = r2.array();
        Intrinsics.XXI(r9);
        int r10 = calculateCrc16(r9, 6);
        r9[4] = (byte) (r10 >> 8);
        r9[5] = (byte) r10;
        return r9;
    L5:
        r1 = 0;
        goto L6
    }

    public final boolean isReply(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "bytes");
        if ((r2[1] & 16) <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isValid(@aa1 byte[] r10) {
        Intrinsics.X0O(r10, "bytes");
        if (r10.length >= 9) goto L7;
        i1O0OXO1O.OXO1.XOO0ii0("MessageFactory isValid -> size is not enough");
        return false;
    L7:
        if ((r10[1] & 32) <= 0) goto L10;
        i1O0OXO1O.OXO1.XOO0ii0("MessageFactory isValid -> is nack");
        return false;
    L10:
        int r1 = calculateCrc16(r10, 6);
        int r11 = ByteArrayExtKt.getInt$default(r10, 4, 2, null, 4, null);
        if (r1 == r11) goto L13;
        i1O0OXO1O r3 = i1O0OXO1O.OXO1;
        StringBuilder r4 = new StringBuilder();
        r4.append("MessageFactory isValid -> crc is wrong, crcShouldBe=");
        StringCompanionObject r5 = StringCompanionObject.OXO1;
        String r6 = String.format("0x%04X", Arrays.copyOf(new Object[]{Integer.valueOf(r1)}, 1));
        Intrinsics.O10IXXX0X(r6, "format(...)");
        r4.append(r6);
        r4.append(", crcReceived=");
        String r7 = String.format("0x%04X", Arrays.copyOf(new Object[]{Integer.valueOf(r11)}, 1));
        Intrinsics.O10IXXX0X(r7, "format(...)");
        r4.append(r7);
        r3.XOO0ii0(r4.toString());
    L13:
        if (r1 != r11) goto L15;
        return true;
    L15:
        return false;
    }

    @aa1
    public final String toHex(@aa1 byte[] r11) {
        Intrinsics.X0O(r11, "<this>");
        return ArraysKt___ArraysKt.i0I(r11, "", null, null, 0, null, new ao0(), 30, null);
    }
}
