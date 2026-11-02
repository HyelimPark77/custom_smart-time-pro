package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BleIPCICInfo extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 16;
    private int mAntiShakeSensorManufacturer;
    private int mAntiShakeSensorModel;
    private int mCameraManufacturer;
    private int mCameraModel;
    private int mManufacturer;
    private int mModel;
    private int mMotherboardModel;

    public enum AntiShakeSensorManufacturer {
        UNKNOWN(0),
        ST(1);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static final Companion Companion = new Companion(null);

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @aa1
            /* JADX INFO: renamed from: of */
            public final AntiShakeSensorManufacturer m38997of(int i) {
                AntiShakeSensorManufacturer next;
                Iterator<AntiShakeSensorManufacturer> it = AntiShakeSensorManufacturer.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.getValue() != i);
                AntiShakeSensorManufacturer antiShakeSensorManufacturer = next;
                return antiShakeSensorManufacturer == null ? AntiShakeSensorManufacturer.UNKNOWN : antiShakeSensorManufacturer;
            }

            private Companion() {
            }
        }

        AntiShakeSensorManufacturer(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<AntiShakeSensorManufacturer> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder sb = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            sb.append(str);
            sb.append(name());
            return sb.toString();
        }
    }

    public enum AntiShakeSensorModel {
        UNKNOWN(0),
        LIS2DOC(1);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static final Companion Companion = new Companion(null);

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorModel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @aa1
            /* JADX INFO: renamed from: of */
            public final AntiShakeSensorModel m38998of(int i) {
                AntiShakeSensorModel next;
                Iterator<AntiShakeSensorModel> it = AntiShakeSensorModel.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.getValue() != i);
                AntiShakeSensorModel antiShakeSensorModel = next;
                return antiShakeSensorModel == null ? AntiShakeSensorModel.UNKNOWN : antiShakeSensorModel;
            }

            private Companion() {
            }
        }

        AntiShakeSensorModel(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<AntiShakeSensorModel> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder sb = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            sb.append(str);
            sb.append(name());
            return sb.toString();
        }
    }

    public enum CameraManufacturer {
        UNKNOWN(0),
        f63154(1),
        OV(2);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static final Companion Companion = new Companion(null);

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @aa1
            /* JADX INFO: renamed from: of */
            public final CameraManufacturer m38999of(int i) {
                CameraManufacturer next;
                Iterator<CameraManufacturer> it = CameraManufacturer.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.getValue() != i);
                CameraManufacturer cameraManufacturer = next;
                return cameraManufacturer == null ? CameraManufacturer.UNKNOWN : cameraManufacturer;
            }

            private Companion() {
            }
        }

        CameraManufacturer(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<CameraManufacturer> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder sb = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            sb.append(str);
            sb.append(name());
            return sb.toString();
        }
    }

    public enum CameraModel {
        UNKNOWN(0),
        GC05A2(1),
        GC08A8(2),
        OV5670(3),
        GC1029(4);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static final Companion Companion = new Companion(null);

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$CameraModel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @aa1
            /* JADX INFO: renamed from: of */
            public final CameraModel m39000of(int i) {
                CameraModel next;
                Iterator<CameraModel> it = CameraModel.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.getValue() != i);
                CameraModel cameraModel = next;
                return cameraModel == null ? CameraModel.UNKNOWN : cameraModel;
            }

            private Companion() {
            }
        }

        CameraModel(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<CameraModel> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder sb = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            sb.append(str);
            sb.append(name());
            return sb.toString();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public enum Manufacturer {
        UNKNOWN(0),
        f63155(1),
        f55342(2),
        f55341(3),
        f55340(4);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static final Companion Companion = new Companion(null);

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$Manufacturer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @aa1
            /* JADX INFO: renamed from: of */
            public final Manufacturer m39001of(int i) {
                Manufacturer next;
                Iterator<Manufacturer> it = Manufacturer.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.getValue() != i);
                Manufacturer manufacturer = next;
                return manufacturer == null ? Manufacturer.UNKNOWN : manufacturer;
            }

            private Companion() {
            }
        }

        Manufacturer(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<Manufacturer> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder sb = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            sb.append(str);
            sb.append(name());
            return sb.toString();
        }
    }

    public enum Model {
        UNKNOWN(0),
        GK7202V330(1),
        JL7925C(2),
        T32(3);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static final Companion Companion = new Companion(null);

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$Model$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @aa1
            /* JADX INFO: renamed from: of */
            public final Model m39002of(int i) {
                Model next;
                Iterator<Model> it = Model.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.getValue() != i);
                Model model = next;
                return model == null ? Model.UNKNOWN : model;
            }

            private Companion() {
            }
        }

        Model(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<Model> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder sb = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            sb.append(str);
            sb.append(name());
            return sb.toString();
        }
    }

    public BleIPCICInfo() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ BleIPCICInfo copy$default(BleIPCICInfo bleIPCICInfo, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = bleIPCICInfo.mManufacturer;
        }
        if ((i8 & 2) != 0) {
            i2 = bleIPCICInfo.mModel;
        }
        if ((i8 & 4) != 0) {
            i3 = bleIPCICInfo.mMotherboardModel;
        }
        if ((i8 & 8) != 0) {
            i4 = bleIPCICInfo.mCameraManufacturer;
        }
        if ((i8 & 16) != 0) {
            i5 = bleIPCICInfo.mCameraModel;
        }
        if ((i8 & 32) != 0) {
            i6 = bleIPCICInfo.mAntiShakeSensorManufacturer;
        }
        if ((i8 & 64) != 0) {
            i7 = bleIPCICInfo.mAntiShakeSensorModel;
        }
        int i9 = i6;
        int i10 = i7;
        int i11 = i5;
        int i12 = i3;
        return bleIPCICInfo.copy(i, i2, i12, i4, i11, i9, i10);
    }

    public final int component1() {
        return this.mManufacturer;
    }

    public final int component2() {
        return this.mModel;
    }

    public final int component3() {
        return this.mMotherboardModel;
    }

    public final int component4() {
        return this.mCameraManufacturer;
    }

    public final int component5() {
        return this.mCameraModel;
    }

    public final int component6() {
        return this.mAntiShakeSensorManufacturer;
    }

    public final int component7() {
        return this.mAntiShakeSensorModel;
    }

    @aa1
    public final BleIPCICInfo copy(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new BleIPCICInfo(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mManufacturer = readUInt8();
        this.mModel = readUInt8();
        this.mMotherboardModel = readUInt8();
        this.mCameraManufacturer = readUInt8();
        this.mCameraModel = readUInt8();
        this.mAntiShakeSensorManufacturer = readUInt8();
        this.mAntiShakeSensorModel = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleIPCICInfo)) {
            return false;
        }
        BleIPCICInfo bleIPCICInfo = (BleIPCICInfo) obj;
        return this.mManufacturer == bleIPCICInfo.mManufacturer && this.mModel == bleIPCICInfo.mModel && this.mMotherboardModel == bleIPCICInfo.mMotherboardModel && this.mCameraManufacturer == bleIPCICInfo.mCameraManufacturer && this.mCameraModel == bleIPCICInfo.mCameraModel && this.mAntiShakeSensorManufacturer == bleIPCICInfo.mAntiShakeSensorManufacturer && this.mAntiShakeSensorModel == bleIPCICInfo.mAntiShakeSensorModel;
    }

    public final int getMAntiShakeSensorManufacturer() {
        return this.mAntiShakeSensorManufacturer;
    }

    public final int getMAntiShakeSensorModel() {
        return this.mAntiShakeSensorModel;
    }

    public final int getMCameraManufacturer() {
        return this.mCameraManufacturer;
    }

    public final int getMCameraModel() {
        return this.mCameraModel;
    }

    public final int getMManufacturer() {
        return this.mManufacturer;
    }

    public final int getMModel() {
        return this.mModel;
    }

    public final int getMMotherboardModel() {
        return this.mMotherboardModel;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mManufacturer) * 31) + Integer.hashCode(this.mModel)) * 31) + Integer.hashCode(this.mMotherboardModel)) * 31) + Integer.hashCode(this.mCameraManufacturer)) * 31) + Integer.hashCode(this.mCameraModel)) * 31) + Integer.hashCode(this.mAntiShakeSensorManufacturer)) * 31) + Integer.hashCode(this.mAntiShakeSensorModel);
    }

    public final void setMAntiShakeSensorManufacturer(int i) {
        this.mAntiShakeSensorManufacturer = i;
    }

    public final void setMAntiShakeSensorModel(int i) {
        this.mAntiShakeSensorModel = i;
    }

    public final void setMCameraManufacturer(int i) {
        this.mCameraManufacturer = i;
    }

    public final void setMCameraModel(int i) {
        this.mCameraModel = i;
    }

    public final void setMManufacturer(int i) {
        this.mManufacturer = i;
    }

    public final void setMModel(int i) {
        this.mModel = i;
    }

    public final void setMMotherboardModel(int i) {
        this.mMotherboardModel = i;
    }

    @aa1
    public String toString() {
        return "BleIPCICInfo(mManufacturer=" + this.mManufacturer + ", mModel=" + this.mModel + ", mMotherboardModel=" + this.mMotherboardModel + ", mCameraManufacturer=" + this.mCameraManufacturer + ", mCameraModel=" + this.mCameraModel + ", mAntiShakeSensorManufacturer=" + this.mAntiShakeSensorManufacturer + ", mAntiShakeSensorModel=" + this.mAntiShakeSensorModel + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleIPCICInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mManufacturer = i;
        this.mModel = i2;
        this.mMotherboardModel = i3;
        this.mCameraManufacturer = i4;
        this.mCameraModel = i5;
        this.mAntiShakeSensorManufacturer = i6;
        this.mAntiShakeSensorModel = i7;
    }

    public /* synthetic */ BleIPCICInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }
}
