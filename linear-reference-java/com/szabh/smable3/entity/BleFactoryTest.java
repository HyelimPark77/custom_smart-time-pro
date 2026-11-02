package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleFactoryTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleFactoryTest\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,353:1\n277#2,5:354\n277#2,5:379\n222#3,4:359\n222#3,4:363\n222#3,4:367\n222#3,4:371\n222#3,4:375\n222#3,4:384\n222#3,4:388\n*S KotlinDebug\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleFactoryTest\n*L\n29#1:354,5\n53#1:379,5\n33#1:359,4\n37#1:363,4\n41#1:367,4\n45#1:371,4\n49#1:375,4\n58#1:384,4\n66#1:388,4\n*E\n"})
public final class BleFactoryTest extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int STATUS_FAILED = 1;
    public static final int STATUS_SUCCESS = 0;

    @aa1
    private Object mResponse;

    @aa1
    private FactoryTestType mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[FactoryTestType.values().length];
            r0[FactoryTestType.ENTER.ordinal()] = 1;     // Catch: NoSuchFieldError -> L15
        L27:
            r0[FactoryTestType.FIRMWARE_VERSION.ordinal()] = 2;     // Catch: NoSuchFieldError -> L16
        L43:
            r0[FactoryTestType.UI_VERSION.ordinal()] = 3;     // Catch: NoSuchFieldError -> L17
        L31:
            r0[FactoryTestType.GSENSOR.ordinal()] = 4;     // Catch: NoSuchFieldError -> L18
        L35:
            r0[FactoryTestType.TUYA_INFO.ordinal()] = 5;     // Catch: NoSuchFieldError -> L19
        L25:
            r0[FactoryTestType.KEY.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L37:
            r0[FactoryTestType.STEWING_RESULT.ordinal()] = 7;     // Catch: NoSuchFieldError -> L21
        L39:
            r0[FactoryTestType.HARDWARE_INFO.ordinal()] = 8;     // Catch: NoSuchFieldError -> L22
        L29:
            r0[FactoryTestType.HR_LEAK.ordinal()] = 9;     // Catch: NoSuchFieldError -> L23
        L33:
            r0[FactoryTestType.HR_BIO.ordinal()] = 10;     // Catch: NoSuchFieldError -> L24
        L13:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleFactoryTest() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleFactoryTest copy$default(BleFactoryTest r0, FactoryTestType r1, Object r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mResponse;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final FactoryTestType component1() {
        return this.mType;
    }

    @aa1
    public final Object component2() {
        return this.mResponse;
    }

    @aa1
    public final BleFactoryTest copy(@aa1 FactoryTestType r2, @aa1 Object r3) {
        Intrinsics.X0O(r2, "mType");
        Intrinsics.X0O(r3, "mResponse");
        return new BleFactoryTest(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        FactoryTestType r0 = FactoryTestType.Companion.of(readUInt8());
        this.mType = r0;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L20;
            case 2: goto L19;
            case 3: goto L19;
            case 4: goto L18;
            case 5: goto L17;
            case 6: goto L16;
            case 7: goto L15;
            case 8: goto L13;
            case 9: goto L9;
            case 10: goto L5;
            default: goto L4;
        };
    L4:
        Object r1 = Integer.valueOf(readUInt8());
    L21:
        this.mResponse = r1;
        return;
    L5:
        byte[] r2 = getMBytes();
        Intrinsics.XXI(r2);
        if (r2.length <= 2) goto L8;
        BleReadable r3 = (BleReadable) BleVcareCalcData.class.newInstance();
        r3.setMBytes(readBytes(5));
        r3.decode();
        Intrinsics.XXI(r3);
        r1 = r3;
        goto L21
    L8:
        r1 = Integer.valueOf(readInt8());
        goto L21
    L9:
        byte[] r4 = getMBytes();
        Intrinsics.XXI(r4);
        if (r4.length <= 2) goto L12;
        BleReadable r5 = (BleReadable) BleHrLeakData.class.newInstance();
        r5.setMBytes(readBytes(4));
        r5.decode();
        Intrinsics.XXI(r5);
        r1 = r5;
        goto L21
    L12:
        r1 = Integer.valueOf(readInt8());
        goto L21
    L13:
        byte[] r6 = getMBytes();
        Intrinsics.XXI(r6);
        int r7 = r6.length;
        Object r8 = BleHardwareInfo.class.newInstance();
        BleReadable r9 = (BleReadable) r8;
        r9.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r6, 1, r7));
        r9.decode();
        Intrinsics.O10IXXX0X(r8, "also(...)");
    L14:
        r1 = r9;
        goto L21
    L15:
        BleReadable r10 = (BleReadable) BleStewingData.class.newInstance();
        r10.setMBytes(readBytes(13));
        r10.decode();
        Intrinsics.XXI(r10);
        r1 = r10;
        goto L21
    L16:
        BleReadable r11 = (BleReadable) BleTestKeyData.class.newInstance();
        r11.setMBytes(readBytes(2));
        r11.decode();
        Intrinsics.XXI(r11);
        r1 = r11;
        goto L21
    L17:
        BleReadable r12 = (BleReadable) BleTuyaKey.class.newInstance();
        r12.setMBytes(readBytes(61));
        r12.decode();
        Intrinsics.XXI(r12);
        r1 = r12;
        goto L21
    L18:
        BleReadable r13 = (BleReadable) BleGsensorData.class.newInstance();
        r13.setMBytes(readBytes(7));
        r13.decode();
        Intrinsics.XXI(r13);
        r1 = r13;
        goto L21
    L19:
        BleReadable r14 = (BleReadable) BleVersion.class.newInstance();
        r14.setMBytes(readBytes(3));
        r14.decode();
        Intrinsics.XXI(r14);
        r1 = r14;
        goto L21
    L20:
        byte[] r15 = getMBytes();
        Intrinsics.XXI(r15);
        int r16 = r15.length;
        Object r17 = BleTestSupportData.class.newInstance();
        r9 = (BleReadable) r17;
        r9.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r15, 1, r16));
        r9.decode();
        Intrinsics.O10IXXX0X(r17, "also(...)");
        goto L14
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType.getType());
        Object r0 = this.mResponse;
        if ((r0 instanceof Integer) == false) goto L6;
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type kotlin.Int");
        writeInt8(((Integer) r0).intValue());
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleFactoryTest) == true) goto L8;
        return false;
    L8:
        BleFactoryTest r6 = (BleFactoryTest) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mResponse, r6.mResponse) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 2;
    }

    @aa1
    public final Object getMResponse() {
        return this.mResponse;
    }

    @aa1
    public final FactoryTestType getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (this.mType.hashCode() * 31) + this.mResponse.hashCode();
    }

    public final void setMResponse(@aa1 Object r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mResponse = r2;
    }

    public final void setMType(@aa1 FactoryTestType r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mType = r2;
    }

    @aa1
    public String toString() {
        return "BleFactoryTest(mType=" + this.mType + ", mResponse=" + this.mResponse + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleFactoryTest(@aa1 FactoryTestType r2, @aa1 Object r3) {
        Intrinsics.X0O(r2, "mType");
        Intrinsics.X0O(r3, "mResponse");
        this.mType = r2;
        this.mResponse = r3;
    }

    public /* synthetic */ BleFactoryTest(FactoryTestType r1, Object r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = FactoryTestType.ENTER;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = new Object();
    L8:
        this(r1, r2);
    }
}
