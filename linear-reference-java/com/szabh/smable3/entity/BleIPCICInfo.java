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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    private int mAntiShakeSensorManufacturer;
    private int mAntiShakeSensorModel;
    private int mCameraManufacturer;
    private int mCameraModel;
    private int mManufacturer;
    private int mModel;
    private int mMotherboardModel;

    public static final enum AntiShakeSensorManufacturer extends Enum<AntiShakeSensorManufacturer> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ AntiShakeSensorManufacturer[] $VALUES = null;

        @aa1
        public static final Companion Companion = null;
        public static final AntiShakeSensorManufacturer ST = null;
        public static final AntiShakeSensorManufacturer UNKNOWN = null;
        private final int value;

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            @aa1
            public final AntiShakeSensorManufacturer of(int r4) {
                Iterator<AntiShakeSensorManufacturer> r0 = AntiShakeSensorManufacturer.getEntries().iterator();
            L4:
                if (r0.hasNext() == false) goto L8;
                AntiShakeSensorManufacturer r1 = r0.next();
                if (r1.getValue() != r4) goto L4;
            L9:
                AntiShakeSensorManufacturer r2 = r1;
                if (r2 == null) goto L12;
                return r2;
            L12:
                return AntiShakeSensorManufacturer.UNKNOWN;
            L8:
                r1 = null;
                goto L9
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ AntiShakeSensorManufacturer[] $values() {
            return new AntiShakeSensorManufacturer[]{UNKNOWN, ST};
        }

        static {
            UNKNOWN = new AntiShakeSensorManufacturer("UNKNOWN", 0, 0);
            ST = new AntiShakeSensorManufacturer("ST", 1, 1);
            AntiShakeSensorManufacturer[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
            Companion = new Companion(null);
        }

        private AntiShakeSensorManufacturer(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<AntiShakeSensorManufacturer> getEntries() {
            return $ENTRIES;
        }

        public static AntiShakeSensorManufacturer valueOf(String r1) {
            return (AntiShakeSensorManufacturer) Enum.valueOf(AntiShakeSensorManufacturer.class, r1);
        }

        public static AntiShakeSensorManufacturer[] values() {
            return (AntiShakeSensorManufacturer[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder r0 = new StringBuilder();
            StringCompanionObject r1 = StringCompanionObject.OXO1;
            String r2 = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(r2, "format(...)");
            r0.append(r2);
            r0.append(name());
            return r0.toString();
        }
    }

    public static final enum AntiShakeSensorModel extends Enum<AntiShakeSensorModel> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ AntiShakeSensorModel[] $VALUES = null;

        @aa1
        public static final Companion Companion = null;
        public static final AntiShakeSensorModel LIS2DOC = null;
        public static final AntiShakeSensorModel UNKNOWN = null;
        private final int value;

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorModel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            @aa1
            public final AntiShakeSensorModel of(int r4) {
                Iterator<AntiShakeSensorModel> r0 = AntiShakeSensorModel.getEntries().iterator();
            L4:
                if (r0.hasNext() == false) goto L8;
                AntiShakeSensorModel r1 = r0.next();
                if (r1.getValue() != r4) goto L4;
            L9:
                AntiShakeSensorModel r2 = r1;
                if (r2 == null) goto L12;
                return r2;
            L12:
                return AntiShakeSensorModel.UNKNOWN;
            L8:
                r1 = null;
                goto L9
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ AntiShakeSensorModel[] $values() {
            return new AntiShakeSensorModel[]{UNKNOWN, LIS2DOC};
        }

        static {
            UNKNOWN = new AntiShakeSensorModel("UNKNOWN", 0, 0);
            LIS2DOC = new AntiShakeSensorModel("LIS2DOC", 1, 1);
            AntiShakeSensorModel[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
            Companion = new Companion(null);
        }

        private AntiShakeSensorModel(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<AntiShakeSensorModel> getEntries() {
            return $ENTRIES;
        }

        public static AntiShakeSensorModel valueOf(String r1) {
            return (AntiShakeSensorModel) Enum.valueOf(AntiShakeSensorModel.class, r1);
        }

        public static AntiShakeSensorModel[] values() {
            return (AntiShakeSensorModel[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder r0 = new StringBuilder();
            StringCompanionObject r1 = StringCompanionObject.OXO1;
            String r2 = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(r2, "format(...)");
            r0.append(r2);
            r0.append(name());
            return r0.toString();
        }
    }

    public static final enum CameraManufacturer extends Enum<CameraManufacturer> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ CameraManufacturer[] $VALUES = null;

        @aa1
        public static final Companion Companion = null;
        public static final CameraManufacturer OV = null;
        public static final CameraManufacturer UNKNOWN = null;

        /* JADX INFO: renamed from: 格科微, reason: contains not printable characters */
        public static final CameraManufacturer f3257 = null;
        private final int value;

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            @aa1
            public final CameraManufacturer of(int r4) {
                Iterator<CameraManufacturer> r0 = CameraManufacturer.getEntries().iterator();
            L4:
                if (r0.hasNext() == false) goto L8;
                CameraManufacturer r1 = r0.next();
                if (r1.getValue() != r4) goto L4;
            L9:
                CameraManufacturer r2 = r1;
                if (r2 == null) goto L12;
                return r2;
            L12:
                return CameraManufacturer.UNKNOWN;
            L8:
                r1 = null;
                goto L9
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ CameraManufacturer[] $values() {
            return new CameraManufacturer[]{UNKNOWN, f3257, OV};
        }

        static {
            UNKNOWN = new CameraManufacturer("UNKNOWN", 0, 0);
            f3257 = new CameraManufacturer("格科微", 1, 1);
            OV = new CameraManufacturer("OV", 2, 2);
            CameraManufacturer[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
            Companion = new Companion(null);
        }

        private CameraManufacturer(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<CameraManufacturer> getEntries() {
            return $ENTRIES;
        }

        public static CameraManufacturer valueOf(String r1) {
            return (CameraManufacturer) Enum.valueOf(CameraManufacturer.class, r1);
        }

        public static CameraManufacturer[] values() {
            return (CameraManufacturer[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder r0 = new StringBuilder();
            StringCompanionObject r1 = StringCompanionObject.OXO1;
            String r2 = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(r2, "format(...)");
            r0.append(r2);
            r0.append(name());
            return r0.toString();
        }
    }

    public static final enum CameraModel extends Enum<CameraModel> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ CameraModel[] $VALUES = null;

        @aa1
        public static final Companion Companion = null;
        public static final CameraModel GC05A2 = null;
        public static final CameraModel GC08A8 = null;
        public static final CameraModel GC1029 = null;
        public static final CameraModel OV5670 = null;
        public static final CameraModel UNKNOWN = null;
        private final int value;

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$CameraModel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            @aa1
            public final CameraModel of(int r4) {
                Iterator<CameraModel> r0 = CameraModel.getEntries().iterator();
            L4:
                if (r0.hasNext() == false) goto L8;
                CameraModel r1 = r0.next();
                if (r1.getValue() != r4) goto L4;
            L9:
                CameraModel r2 = r1;
                if (r2 == null) goto L12;
                return r2;
            L12:
                return CameraModel.UNKNOWN;
            L8:
                r1 = null;
                goto L9
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ CameraModel[] $values() {
            return new CameraModel[]{UNKNOWN, GC05A2, GC08A8, OV5670, GC1029};
        }

        static {
            UNKNOWN = new CameraModel("UNKNOWN", 0, 0);
            GC05A2 = new CameraModel("GC05A2", 1, 1);
            GC08A8 = new CameraModel("GC08A8", 2, 2);
            OV5670 = new CameraModel("OV5670", 3, 3);
            GC1029 = new CameraModel("GC1029", 4, 4);
            CameraModel[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
            Companion = new Companion(null);
        }

        private CameraModel(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<CameraModel> getEntries() {
            return $ENTRIES;
        }

        public static CameraModel valueOf(String r1) {
            return (CameraModel) Enum.valueOf(CameraModel.class, r1);
        }

        public static CameraModel[] values() {
            return (CameraModel[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder r0 = new StringBuilder();
            StringCompanionObject r1 = StringCompanionObject.OXO1;
            String r2 = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(r2, "format(...)");
            r0.append(r2);
            r0.append(name());
            return r0.toString();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    public static final enum Manufacturer extends Enum<Manufacturer> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ Manufacturer[] $VALUES = null;

        @aa1
        public static final Companion Companion = null;
        public static final Manufacturer UNKNOWN = null;

        /* JADX INFO: renamed from: 全志, reason: contains not printable characters */
        public static final Manufacturer f3258 = null;

        /* JADX INFO: renamed from: 君正, reason: contains not printable characters */
        public static final Manufacturer f3259 = null;

        /* JADX INFO: renamed from: 国科微, reason: contains not printable characters */
        public static final Manufacturer f3260 = null;

        /* JADX INFO: renamed from: 杰里, reason: contains not printable characters */
        public static final Manufacturer f3261 = null;
        private final int value;

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$Manufacturer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            @aa1
            public final Manufacturer of(int r4) {
                Iterator<Manufacturer> r0 = Manufacturer.getEntries().iterator();
            L4:
                if (r0.hasNext() == false) goto L8;
                Manufacturer r1 = r0.next();
                if (r1.getValue() != r4) goto L4;
            L9:
                Manufacturer r2 = r1;
                if (r2 == null) goto L12;
                return r2;
            L12:
                return Manufacturer.UNKNOWN;
            L8:
                r1 = null;
                goto L9
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Manufacturer[] $values() {
            return new Manufacturer[]{UNKNOWN, f3260, f3261, f3259, f3258};
        }

        static {
            UNKNOWN = new Manufacturer("UNKNOWN", 0, 0);
            f3260 = new Manufacturer("国科微", 1, 1);
            f3261 = new Manufacturer("杰里", 2, 2);
            f3259 = new Manufacturer("君正", 3, 3);
            f3258 = new Manufacturer("全志", 4, 4);
            Manufacturer[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
            Companion = new Companion(null);
        }

        private Manufacturer(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<Manufacturer> getEntries() {
            return $ENTRIES;
        }

        public static Manufacturer valueOf(String r1) {
            return (Manufacturer) Enum.valueOf(Manufacturer.class, r1);
        }

        public static Manufacturer[] values() {
            return (Manufacturer[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder r0 = new StringBuilder();
            StringCompanionObject r1 = StringCompanionObject.OXO1;
            String r2 = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(r2, "format(...)");
            r0.append(r2);
            r0.append(name());
            return r0.toString();
        }
    }

    public static final enum Model extends Enum<Model> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ Model[] $VALUES = null;

        @aa1
        public static final Companion Companion = null;
        public static final Model GK7202V330 = null;
        public static final Model JL7925C = null;
        public static final Model T32 = null;
        public static final Model UNKNOWN = null;
        private final int value;

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCICInfo$Model$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            @aa1
            public final Model of(int r4) {
                Iterator<Model> r0 = Model.getEntries().iterator();
            L4:
                if (r0.hasNext() == false) goto L8;
                Model r1 = r0.next();
                if (r1.getValue() != r4) goto L4;
            L9:
                Model r2 = r1;
                if (r2 == null) goto L12;
                return r2;
            L12:
                return Model.UNKNOWN;
            L8:
                r1 = null;
                goto L9
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Model[] $values() {
            return new Model[]{UNKNOWN, GK7202V330, JL7925C, T32};
        }

        static {
            UNKNOWN = new Model("UNKNOWN", 0, 0);
            GK7202V330 = new Model("GK7202V330", 1, 1);
            JL7925C = new Model("JL7925C", 2, 2);
            T32 = new Model("T32", 3, 3);
            Model[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
            Companion = new Companion(null);
        }

        private Model(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<Model> getEntries() {
            return $ENTRIES;
        }

        public static Model valueOf(String r1) {
            return (Model) Enum.valueOf(Model.class, r1);
        }

        public static Model[] values() {
            return (Model[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @aa1
        public String toString() {
            StringBuilder r0 = new StringBuilder();
            StringCompanionObject r1 = StringCompanionObject.OXO1;
            String r2 = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.value)}, 1));
            Intrinsics.O10IXXX0X(r2, "format(...)");
            r0.append(r2);
            r0.append(name());
            return r0.toString();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleIPCICInfo() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleIPCICInfo copy$default(BleIPCICInfo r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mManufacturer;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mModel;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mMotherboardModel;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mCameraManufacturer;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mCameraModel;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mAntiShakeSensorManufacturer;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mAntiShakeSensorModel;
    L23:
        int r10 = r6;
        int r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
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
    public final BleIPCICInfo copy(int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        return new BleIPCICInfo(r9, r10, r11, r12, r13, r14, r15);
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleIPCICInfo) == true) goto L8;
        return false;
    L8:
        BleIPCICInfo r6 = (BleIPCICInfo) r5;
        if (this.mManufacturer == r6.mManufacturer) goto L12;
        return false;
    L12:
        if (this.mModel == r6.mModel) goto L15;
        return false;
    L15:
        if (this.mMotherboardModel == r6.mMotherboardModel) goto L18;
        return false;
    L18:
        if (this.mCameraManufacturer == r6.mCameraManufacturer) goto L21;
        return false;
    L21:
        if (this.mCameraModel == r6.mCameraModel) goto L24;
        return false;
    L24:
        if (this.mAntiShakeSensorManufacturer == r6.mAntiShakeSensorManufacturer) goto L27;
        return false;
    L27:
        if (this.mAntiShakeSensorModel == r6.mAntiShakeSensorModel) goto L29;
        return false;
    L29:
        return true;
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

    public final void setMAntiShakeSensorManufacturer(int r1) {
        this.mAntiShakeSensorManufacturer = r1;
    }

    public final void setMAntiShakeSensorModel(int r1) {
        this.mAntiShakeSensorModel = r1;
    }

    public final void setMCameraManufacturer(int r1) {
        this.mCameraManufacturer = r1;
    }

    public final void setMCameraModel(int r1) {
        this.mCameraModel = r1;
    }

    public final void setMManufacturer(int r1) {
        this.mManufacturer = r1;
    }

    public final void setMModel(int r1) {
        this.mModel = r1;
    }

    public final void setMMotherboardModel(int r1) {
        this.mMotherboardModel = r1;
    }

    @aa1
    public String toString() {
        return "BleIPCICInfo(mManufacturer=" + this.mManufacturer + ", mModel=" + this.mModel + ", mMotherboardModel=" + this.mMotherboardModel + ", mCameraManufacturer=" + this.mCameraManufacturer + ", mCameraModel=" + this.mCameraModel + ", mAntiShakeSensorManufacturer=" + this.mAntiShakeSensorManufacturer + ", mAntiShakeSensorModel=" + this.mAntiShakeSensorModel + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleIPCICInfo(int r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        this.mManufacturer = r1;
        this.mModel = r2;
        this.mMotherboardModel = r3;
        this.mCameraManufacturer = r4;
        this.mCameraModel = r5;
        this.mAntiShakeSensorManufacturer = r6;
        this.mAntiShakeSensorModel = r7;
    }

    public /* synthetic */ BleIPCICInfo(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L24;
        int r11 = 0;
    L23:
        int r12 = r7;
        int r13 = r6;
        int r14 = r5;
        int r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
        return;
    L24:
        r11 = r8;
        goto L23
    }
}
