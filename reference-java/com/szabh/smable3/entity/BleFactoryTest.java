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
    public static final Companion Companion = new Companion(null);
    public static final int STATUS_FAILED = 1;
    public static final int STATUS_SUCCESS = 0;

    @aa1
    private Object mResponse;

    @aa1
    private FactoryTestType mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FactoryTestType.values().length];
            try {
                iArr[FactoryTestType.ENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FactoryTestType.FIRMWARE_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FactoryTestType.UI_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FactoryTestType.GSENSOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FactoryTestType.TUYA_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FactoryTestType.KEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FactoryTestType.STEWING_RESULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FactoryTestType.HARDWARE_INFO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FactoryTestType.HR_LEAK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FactoryTestType.HR_BIO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleFactoryTest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleFactoryTest copy$default(BleFactoryTest bleFactoryTest, FactoryTestType factoryTestType, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            factoryTestType = bleFactoryTest.mType;
        }
        if ((i & 2) != 0) {
            obj = bleFactoryTest.mResponse;
        }
        return bleFactoryTest.copy(factoryTestType, obj);
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
    public final BleFactoryTest copy(@aa1 FactoryTestType mType, @aa1 Object mResponse) {
        Intrinsics.X0O(mType, "mType");
        Intrinsics.X0O(mResponse, "mResponse");
        return new BleFactoryTest(mType, mResponse);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() throws IllegalAccessException, InstantiationException {
        BleReadable bleReadable;
        Object objValueOf;
        super.decode();
        FactoryTestType factoryTestTypeM39004of = FactoryTestType.Companion.m39004of(readUInt8());
        this.mType = factoryTestTypeM39004of;
        switch (WhenMappings.$EnumSwitchMapping$0[factoryTestTypeM39004of.ordinal()]) {
            case 1:
                byte[] mBytes = getMBytes();
                Intrinsics.XXI(mBytes);
                int length = mBytes.length;
                Object objNewInstance = BleTestSupportData.class.newInstance();
                bleReadable = (BleReadable) objNewInstance;
                bleReadable.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(mBytes, 1, length));
                bleReadable.decode();
                Intrinsics.O10IXXX0X(objNewInstance, "also(...)");
                objValueOf = bleReadable;
                break;
            case 2:
            case 3:
                BleReadable bleReadable2 = (BleReadable) BleVersion.class.newInstance();
                bleReadable2.setMBytes(readBytes(3));
                bleReadable2.decode();
                Intrinsics.XXI(bleReadable2);
                objValueOf = bleReadable2;
                break;
            case 4:
                BleReadable bleReadable3 = (BleReadable) BleGsensorData.class.newInstance();
                bleReadable3.setMBytes(readBytes(7));
                bleReadable3.decode();
                Intrinsics.XXI(bleReadable3);
                objValueOf = bleReadable3;
                break;
            case 5:
                BleReadable bleReadable4 = (BleReadable) BleTuyaKey.class.newInstance();
                bleReadable4.setMBytes(readBytes(61));
                bleReadable4.decode();
                Intrinsics.XXI(bleReadable4);
                objValueOf = bleReadable4;
                break;
            case 6:
                BleReadable bleReadable5 = (BleReadable) BleTestKeyData.class.newInstance();
                bleReadable5.setMBytes(readBytes(2));
                bleReadable5.decode();
                Intrinsics.XXI(bleReadable5);
                objValueOf = bleReadable5;
                break;
            case 7:
                BleReadable bleReadable6 = (BleReadable) BleStewingData.class.newInstance();
                bleReadable6.setMBytes(readBytes(13));
                bleReadable6.decode();
                Intrinsics.XXI(bleReadable6);
                objValueOf = bleReadable6;
                break;
            case 8:
                byte[] mBytes2 = getMBytes();
                Intrinsics.XXI(mBytes2);
                int length2 = mBytes2.length;
                Object objNewInstance2 = BleHardwareInfo.class.newInstance();
                bleReadable = (BleReadable) objNewInstance2;
                bleReadable.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(mBytes2, 1, length2));
                bleReadable.decode();
                Intrinsics.O10IXXX0X(objNewInstance2, "also(...)");
                objValueOf = bleReadable;
                break;
            case 9:
                byte[] mBytes3 = getMBytes();
                Intrinsics.XXI(mBytes3);
                if (mBytes3.length <= 2) {
                    objValueOf = Integer.valueOf(readInt8());
                } else {
                    BleReadable bleReadable7 = (BleReadable) BleHrLeakData.class.newInstance();
                    bleReadable7.setMBytes(readBytes(4));
                    bleReadable7.decode();
                    Intrinsics.XXI(bleReadable7);
                    objValueOf = bleReadable7;
                }
                break;
            case 10:
                byte[] mBytes4 = getMBytes();
                Intrinsics.XXI(mBytes4);
                if (mBytes4.length <= 2) {
                    objValueOf = Integer.valueOf(readInt8());
                } else {
                    BleReadable bleReadable8 = (BleReadable) BleVcareCalcData.class.newInstance();
                    bleReadable8.setMBytes(readBytes(5));
                    bleReadable8.decode();
                    Intrinsics.XXI(bleReadable8);
                    objValueOf = bleReadable8;
                }
                break;
            default:
                objValueOf = Integer.valueOf(readUInt8());
                break;
        }
        this.mResponse = objValueOf;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType.getType());
        Object obj = this.mResponse;
        if (obj instanceof Integer) {
            Intrinsics.X1ii(obj, "null cannot be cast to non-null type kotlin.Int");
            writeInt8(((Integer) obj).intValue());
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleFactoryTest)) {
            return false;
        }
        BleFactoryTest bleFactoryTest = (BleFactoryTest) obj;
        return this.mType == bleFactoryTest.mType && Intrinsics.XOO0ii0(this.mResponse, bleFactoryTest.mResponse);
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

    public final void setMResponse(@aa1 Object obj) {
        Intrinsics.X0O(obj, "<set-?>");
        this.mResponse = obj;
    }

    public final void setMType(@aa1 FactoryTestType factoryTestType) {
        Intrinsics.X0O(factoryTestType, "<set-?>");
        this.mType = factoryTestType;
    }

    @aa1
    public String toString() {
        return "BleFactoryTest(mType=" + this.mType + ", mResponse=" + this.mResponse + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleFactoryTest(@aa1 FactoryTestType mType, @aa1 Object mResponse) {
        Intrinsics.X0O(mType, "mType");
        Intrinsics.X0O(mResponse, "mResponse");
        this.mType = mType;
        this.mResponse = mResponse;
    }

    public /* synthetic */ BleFactoryTest(FactoryTestType factoryTestType, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FactoryTestType.ENTER : factoryTestType, (i & 2) != 0 ? new Object() : obj);
    }
}
