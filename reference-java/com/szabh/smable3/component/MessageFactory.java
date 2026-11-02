package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.OOOi0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gj0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.p559ai.speech.realtime.Util;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.iflytek.sparkchain.utils.constants.ErrorCode;
import com.realsil.sdk.dfu.image.constants.SubBinId;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.MessageFactory;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageFactory {
    public static final int HEADER_NACK = 32;
    public static final int HEADER_REPLY = 16;
    private static final int HEADER_VERSION = 1;
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

    @aa1
    public static final MessageFactory INSTANCE = new MessageFactory();

    @aa1
    private static final int[] CRC16_TABLE = {0, 49345, 49537, 320, 49921, gj0.OIi0, 640, 49729, 50689, 1728, 1920, 51009, 1280, 50625, 50305, 1088, 52225, 3264, 3456, 52545, 3840, 53185, 52865, OOOi0.X0O1XO, SubBinId.Bbpro.FACTORY_IAMGE, 51905, 52097, 2880, 51457, OOOi0.I11iXOO, 2176, 51265, 55297, 6336, 6528, 55617, 6912, 56257, 55937, 6720, 7680, 57025, 57217, 8000, 56577, 7616, 7296, 56385, Util.BYTES_PER_FRAME, 54465, 54657, 5440, 55041, 6080, 5760, 54849, 53761, 4800, 4992, 54081, 4352, 53697, 53377, 4160, 61441, 12480, 12672, 61761, 13056, 62401, 62081, 12864, 13824, 63169, 63361, 14144, 62721, 13760, 13440, 62529, 15360, 64705, 64897, 15680, 65281, 16320, 16000, 65089, 64001, 15040, 15232, 64321, 14592, 63937, 63617, 14400, 10240, 59585, 59777, 10560, 60161, ErrorCode.MSP_ERROR_AUTH_NO_LICENSE, 10880, 59969, 60929, 11968, 12160, 61249, 11520, 60865, 60545, 11328, 58369, 9408, 9600, 58689, 9984, 59329, 59009, 9792, 8704, 58049, 58241, 9024, 57601, 8640, 8320, 57409, 40961, 24768, 24960, 41281, 25344, 41921, 41601, 25152, 26112, 42689, 42881, 26432, 42241, 26048, 25728, 42049, 27648, 44225, 44417, 27968, 44801, 28608, 28288, 44609, 43521, 27328, 27520, 43841, 26880, 43457, 43137, 26688, 30720, 47297, 47489, 31040, 47873, 31680, 31360, 47681, 48641, 32448, 32640, 48961, 32000, 48577, 48257, 31808, 46081, 29888, 30080, 46401, 30464, 47041, 46721, 30272, 29184, 45761, 45953, 29504, 45313, 29120, 28800, 45121, 20480, 37057, 37249, 20800, 37633, 21440, 21120, 37441, 38401, 22208, 22400, 38721, 21760, 38337, 38017, 21568, 39937, 23744, 23936, 40257, 24320, 40897, 40577, 24128, 23040, 39617, 39809, 23360, 39169, 22976, 22656, 38977, 34817, 18624, 18816, 35137, 19200, 35777, 35457, 19008, 19968, 36545, 36737, 20288, 36097, 19904, 19584, 35905, 17408, 33985, 34177, 17728, 34561, 18368, 18048, 34369, 33281, 17088, 17280, 33601, 16640, 33217, 32897, 16448};

    private MessageFactory() {
    }

    private final int calculateCrc16(byte[] bArr, int i) {
        int length = bArr.length;
        int iQueryCrc16 = 0;
        while (i < length) {
            iQueryCrc16 = queryCrc16(iQueryCrc16, bArr[i]);
            i++;
        }
        return iQueryCrc16;
    }

    public static /* synthetic */ byte[] create$default(MessageFactory messageFactory, int i, BleKey bleKey, BleKeyFlag bleKeyFlag, byte[] bArr, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            bleKeyFlag = BleKeyFlag.UPDATE;
        }
        if ((i2 & 8) != 0) {
            bArr = null;
        }
        return messageFactory.create(i, bleKey, bleKeyFlag, bArr);
    }

    private final int queryCrc16(int i, byte b) {
        return CRC16_TABLE[(i ^ b) & 255] ^ (i >>> 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toHex$lambda$0(byte b) {
        String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    @aa1
    public final byte[] create(int i, @aa1 BleKey bleKey, @aa1 BleKeyFlag keyFlag, @tb1 byte[] bArr) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(keyFlag, "keyFlag");
        int length = bArr != null ? bArr.length : 0;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 9);
        byteBufferAllocate.put(MAGIC);
        byteBufferAllocate.put((byte) (i | 1));
        byteBufferAllocate.putShort((short) (length + 3));
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(bleKey.getMCommandRawValue());
        byteBufferAllocate.put(bleKey.getMKeyRawValue());
        byteBufferAllocate.put((byte) keyFlag.getMBleKeyFlag());
        if (bArr != null) {
            byteBufferAllocate.put(bArr);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.XXI(bArrArray);
        int iCalculateCrc16 = calculateCrc16(bArrArray, 6);
        bArrArray[4] = (byte) (iCalculateCrc16 >> 8);
        bArrArray[5] = (byte) iCalculateCrc16;
        return bArrArray;
    }

    public final boolean isReply(@aa1 byte[] bytes) {
        Intrinsics.X0O(bytes, "bytes");
        return (bytes[1] & 16) > 0;
    }

    public final boolean isValid(@aa1 byte[] bytes) {
        Intrinsics.X0O(bytes, "bytes");
        if (bytes.length < 9) {
            i1O0OXO1O.OXO1.XOO0ii0("MessageFactory isValid -> size is not enough");
            return false;
        }
        if ((bytes[1] & 32) > 0) {
            i1O0OXO1O.OXO1.XOO0ii0("MessageFactory isValid -> is nack");
            return false;
        }
        int iCalculateCrc16 = calculateCrc16(bytes, 6);
        int int$default = ByteArrayExtKt.getInt$default(bytes, 4, 2, null, 4, null);
        if (iCalculateCrc16 != int$default) {
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            StringBuilder sb = new StringBuilder();
            sb.append("MessageFactory isValid -> crc is wrong, crcShouldBe=");
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("0x%04X", Arrays.copyOf(new Object[]{Integer.valueOf(iCalculateCrc16)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            sb.append(str);
            sb.append(", crcReceived=");
            String str2 = String.format("0x%04X", Arrays.copyOf(new Object[]{Integer.valueOf(int$default)}, 1));
            Intrinsics.O10IXXX0X(str2, "format(...)");
            sb.append(str2);
            i1o0oxo1o.XOO0ii0(sb.toString());
        }
        return iCalculateCrc16 == int$default;
    }

    @aa1
    public final String toHex(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<this>");
        return ArraysKt___ArraysKt.i0I(bArr, "", null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.ao0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MessageFactory.toHex$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, null);
    }
}
