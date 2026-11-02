package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class BleIPCSupport extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 26;
    private int mSupportAlipay;
    private int mSupportHttpProtocolVersion;
    private int mSupportLiveVideo;
    private int mSupportOrientation;
    private int mSupportP2P;
    private int mSupportVideoCalls;
    private int mSupportWeChatCall;

    @aa1
    private List<? extends AIImageResolution> mSupportedAIImageResolution;

    @aa1
    private List<? extends VideoResolution> mSupportedVideoResolution;

    @aa1
    private List<? extends VideoResolution> mSupportedVideoResolution2;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    public static final enum VideoResolution extends Enum<VideoResolution> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ VideoResolution[] $VALUES = null;

        @aa1
        public static final Companion Companion = null;
        public static final VideoResolution VR_100WP25 = null;
        public static final VideoResolution VR_100WP30 = null;
        public static final VideoResolution VR_1300WP20 = null;
        public static final VideoResolution VR_1300WP30 = null;
        public static final VideoResolution VR_1440X1920 = null;
        public static final VideoResolution VR_1600X1200 = null;
        public static final VideoResolution VR_1600X1200_60 = null;
        public static final VideoResolution VR_1920X1080 = null;
        public static final VideoResolution VR_200WP20 = null;
        public static final VideoResolution VR_200WP30 = null;
        public static final VideoResolution VR_2560X1440 = null;
        public static final VideoResolution VR_2592X1944 = null;
        public static final VideoResolution VR_400WP30 = null;
        public static final VideoResolution VR_500WP20 = null;
        public static final VideoResolution VR_500WP30 = null;
        public static final VideoResolution VR_800WP20 = null;
        public static final VideoResolution VR_800WP30 = null;

        @aa1
        private final String label;
        private final boolean portrait;
        private final int value;

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,281:1\n774#2:282\n865#2,2:283\n774#2:290\n865#2,2:291\n1#3:285\n11571#4:286\n11906#4,3:287\n*S KotlinDebug\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion\n*L\n137#1:282\n137#1:283,2\n147#1:290\n147#1:291,2\n147#1:286\n147#1:287,3\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            @aa1
            public final List<VideoResolution> fromBytes(@aa1 byte[] r6) {
                Intrinsics.X0O(r6, "bytes");
                ArrayList r0 = new ArrayList(r6.length);
                int r1 = r6.length;
                int r2 = 0;
            L3:
                if (r2 >= r1) goto L5;
                byte r3 = r6[r2];
                r0.add(VideoResolution.Companion.of(r3));
                r2 = r2 + 1;
                goto L3
            L5:
                ArrayList r7 = new ArrayList();
                Iterator r4 = r0.iterator();
            L7:
                if (r4.hasNext() == false) goto L11;
                Object r5 = r4.next();
                if (((VideoResolution) r5).getValue() == 0) goto L7;
                r7.add(r5);
                goto L7
            L11:
                return r7;
            }

            @aa1
            public final List<VideoResolution> fromMask(long r8) {
                i1O0OXO1O.OXO1.OXO1("fromMask mask=" + r8);
                EnumEntries<VideoResolution> r0 = VideoResolution.getEntries();
                ArrayList r1 = new ArrayList();
                Iterator<VideoResolution> r2 = r0.iterator();
            L4:
                if (r2.hasNext() == false) goto L10;
                VideoResolution r3 = r2.next();
                VideoResolution r4 = r3;
                if (r4.getValue() >= 64) goto L4;
                if (((1 << r4.getValue()) & r8) == 0) goto L4;
                r1.add(r3);
                goto L4
            L10:
                return r1;
            }

            @aa1
            public final VideoResolution of(int r4) {
                Iterator<VideoResolution> r0 = VideoResolution.getEntries().iterator();
            L4:
                if (r0.hasNext() == false) goto L8;
                VideoResolution r1 = r0.next();
                if (r1.getValue() != r4) goto L4;
            L9:
                VideoResolution r2 = r1;
                if (r2 == null) goto L12;
                return r2;
            L12:
                return VideoResolution.VR_100WP25;
            L8:
                r1 = null;
                goto L9
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ VideoResolution[] $values() {
            return new VideoResolution[]{VR_100WP25, VR_100WP30, VR_200WP20, VR_200WP30, VR_500WP20, VR_500WP30, VR_800WP20, VR_800WP30, VR_1300WP20, VR_1300WP30, VR_400WP30, VR_1920X1080, VR_2560X1440, VR_1440X1920, VR_1600X1200, VR_2592X1944, VR_1600X1200_60};
        }

        static {
            String r1 = "VR_100WP25";
            int r2 = 0;
            int r3 = 0;
            String r4 = "720P/25 FPS";
            boolean r5 = false;
            VR_100WP25 = new VideoResolution(r1, r2, r3, r4, r5, 4, null);
            String r6 = "VR_100WP30";
            int r7 = 1;
            int r8 = 1;
            String r9 = "720P/30 FPS";
            boolean r10 = false;
            VR_100WP30 = new VideoResolution(r6, r7, r8, r9, r10, 4, null);
            String r11 = "VR_200WP20";
            int r12 = 2;
            int r13 = 2;
            String r14 = "1080P/20 FPS";
            boolean r15 = false;
            VR_200WP20 = new VideoResolution(r11, r12, r13, r14, r15, 4, null);
            String r16 = "VR_200WP30";
            int r17 = 3;
            int r18 = 3;
            String r19 = "1080P/30 FPS";
            boolean r20 = false;
            VR_200WP30 = new VideoResolution(r16, r17, r18, r19, r20, 4, null);
            String r21 = "VR_500WP20";
            int r22 = 4;
            int r23 = 4;
            String r24 = "2K/20 FPS";
            boolean r25 = false;
            VR_500WP20 = new VideoResolution(r21, r22, r23, r24, r25, 4, null);
            String r26 = "VR_500WP30";
            int r27 = 5;
            int r28 = 5;
            String r29 = "2K/30 FPS";
            boolean r110 = false;
            VR_500WP30 = new VideoResolution(r26, r27, r28, r29, r110, 4, null);
            String r30 = "VR_800WP20";
            int r31 = 6;
            int r32 = 6;
            String r111 = "4K/20 FPS";
            boolean r112 = false;
            VR_800WP20 = new VideoResolution(r30, r31, r32, r111, r112, 4, null);
            String r33 = "VR_800WP30";
            int r34 = 7;
            int r113 = 7;
            String r114 = "4K/30 FPS";
            boolean r115 = false;
            VR_800WP30 = new VideoResolution(r33, r34, r113, r114, r115, 4, null);
            String r35 = "VR_1300WP20";
            int r116 = 8;
            int r117 = 8;
            String r118 = "4K/20 FPS";
            boolean r119 = false;
            VR_1300WP20 = new VideoResolution(r35, r116, r117, r118, r119, 4, null);
            String r36 = "VR_1300WP30";
            int r37 = 9;
            int r38 = 9;
            String r39 = "4K/30 FPS";
            boolean r40 = false;
            VR_1300WP30 = new VideoResolution(r36, r37, r38, r39, r40, 4, null);
            String r41 = "VR_400WP30";
            int r42 = 10;
            int r43 = 10;
            String r44 = "2K/30 FPS";
            boolean r45 = false;
            VR_400WP30 = new VideoResolution(r41, r42, r43, r44, r45, 4, null);
            String r46 = "VR_1920X1080";
            int r47 = 11;
            int r48 = 64;
            String r49 = "1920x1080 30fps 16:9";
            boolean r50 = false;
            VR_1920X1080 = new VideoResolution(r46, r47, r48, r49, r50, 4, null);
            String r51 = "VR_2560X1440";
            int r52 = 12;
            int r53 = 65;
            String r54 = "2560x1440 30fps 16:9";
            boolean r55 = false;
            VR_2560X1440 = new VideoResolution(r51, r52, r53, r54, r55, 4, null);
            VR_1440X1920 = new VideoResolution("VR_1440X1920", 13, 66, "1440x1920 30fps 3:4", true);
            String r56 = "VR_1600X1200";
            int r57 = 14;
            int r58 = 67;
            String r59 = "1600x1200 30fps 4:3";
            boolean r120 = false;
            VR_1600X1200 = new VideoResolution(r56, r57, r58, r59, r120, 4, null);
            String r60 = "VR_2592X1944";
            int r61 = 15;
            int r62 = 68;
            String r121 = "2592X1944 30fps 4:3";
            boolean r122 = false;
            VR_2592X1944 = new VideoResolution(r60, r61, r62, r121, r122, 4, null);
            String r63 = "VR_1600X1200_60";
            int r64 = 16;
            int r123 = 69;
            String r124 = "1600X1200 60fps 4:3";
            boolean r125 = false;
            VR_1600X1200_60 = new VideoResolution(r63, r64, r123, r124, r125, 4, null);
            VideoResolution[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
            Companion = new Companion(null);
        }

        private VideoResolution(String r1, int r2, int r3, String r4, boolean r5) {
            super(r1, r2);
            this.value = r3;
            this.label = r4;
            this.portrait = r5;
        }

        @aa1
        public static EnumEntries<VideoResolution> getEntries() {
            return $ENTRIES;
        }

        public static VideoResolution valueOf(String r1) {
            return (VideoResolution) Enum.valueOf(VideoResolution.class, r1);
        }

        public static VideoResolution[] values() {
            return (VideoResolution[]) $VALUES.clone();
        }

        @aa1
        public final String getLabel() {
            return this.label;
        }

        public final boolean getPortrait() {
            return this.portrait;
        }

        public final int getValue() {
            return this.value;
        }

        public /* synthetic */ VideoResolution(String r7, int r8, int r9, String r10, boolean r11, int r12, DefaultConstructorMarker r13) {
            if ((r12 & 4) == 0) goto L5;
            r11 = false;
        L5:
            this(r7, r8, r9, r10, r11);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleIPCSupport() {
        int r1 = 0;
        int r2 = 0;
        List r3 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        List r7 = null;
        int r8 = 0;
        int r9 = 0;
        List r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleIPCSupport copy$default(BleIPCSupport r0, int r1, int r2, List r3, int r4, int r5, int r6, List r7, int r8, int r9, List r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mSupportP2P;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mSupportOrientation;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.mSupportedVideoResolution;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.mSupportVideoCalls;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.mSupportWeChatCall;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.mSupportLiveVideo;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.mSupportedAIImageResolution;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.mSupportAlipay;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.mSupportHttpProtocolVersion;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.mSupportedVideoResolution2;
    L32:
        int r13 = r9;
        List r14 = r10;
        List r15 = r7;
        int r16 = r8;
        int r17 = r5;
        int r18 = r6;
        List r19 = r3;
        int r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
    }

    @Deprecated(message = "后续弃用")
    public static /* synthetic */ void getMSupportedVideoResolution$annotations() {
    }

    public final int component1() {
        return this.mSupportP2P;
    }

    @aa1
    public final List<VideoResolution> component10() {
        return this.mSupportedVideoResolution2;
    }

    public final int component2() {
        return this.mSupportOrientation;
    }

    @aa1
    public final List<VideoResolution> component3() {
        return this.mSupportedVideoResolution;
    }

    public final int component4() {
        return this.mSupportVideoCalls;
    }

    public final int component5() {
        return this.mSupportWeChatCall;
    }

    public final int component6() {
        return this.mSupportLiveVideo;
    }

    @aa1
    public final List<AIImageResolution> component7() {
        return this.mSupportedAIImageResolution;
    }

    public final int component8() {
        return this.mSupportAlipay;
    }

    public final int component9() {
        return this.mSupportHttpProtocolVersion;
    }

    @aa1
    public final BleIPCSupport copy(int r13, int r14, @aa1 List<? extends VideoResolution> r15, int r16, int r17, int r18, @aa1 List<? extends AIImageResolution> r19, int r20, int r21, @aa1 List<? extends VideoResolution> r22) {
        Intrinsics.X0O(r15, "mSupportedVideoResolution");
        Intrinsics.X0O(r19, "mSupportedAIImageResolution");
        Intrinsics.X0O(r22, "mSupportedVideoResolution2");
        return new BleIPCSupport(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mSupportP2P = readUInt8();
        this.mSupportOrientation = readUInt8();
        VideoResolution.Companion r0 = VideoResolution.Companion;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mSupportedVideoResolution = r0.fromMask(readInt64(r1));
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        readUInt16(r1);
        this.mSupportVideoCalls = readUInt8();
        this.mSupportWeChatCall = readUInt8();
        this.mSupportLiveVideo = readUInt8();
        this.mSupportedAIImageResolution = AIImageResolution.Companion.fromMask(readUInt8());
        this.mSupportAlipay = readUInt8();
        this.mSupportHttpProtocolVersion = readUInt8();
        this.mSupportedVideoResolution2 = r0.fromBytes(readBytes(8));
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleIPCSupport) == true) goto L8;
        return false;
    L8:
        BleIPCSupport r6 = (BleIPCSupport) r5;
        if (this.mSupportP2P == r6.mSupportP2P) goto L12;
        return false;
    L12:
        if (this.mSupportOrientation == r6.mSupportOrientation) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mSupportedVideoResolution, r6.mSupportedVideoResolution) == true) goto L18;
        return false;
    L18:
        if (this.mSupportVideoCalls == r6.mSupportVideoCalls) goto L21;
        return false;
    L21:
        if (this.mSupportWeChatCall == r6.mSupportWeChatCall) goto L24;
        return false;
    L24:
        if (this.mSupportLiveVideo == r6.mSupportLiveVideo) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mSupportedAIImageResolution, r6.mSupportedAIImageResolution) == true) goto L30;
        return false;
    L30:
        if (this.mSupportAlipay == r6.mSupportAlipay) goto L33;
        return false;
    L33:
        if (this.mSupportHttpProtocolVersion == r6.mSupportHttpProtocolVersion) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mSupportedVideoResolution2, r6.mSupportedVideoResolution2) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final int getMSupportAlipay() {
        return this.mSupportAlipay;
    }

    public final int getMSupportHttpProtocolVersion() {
        return this.mSupportHttpProtocolVersion;
    }

    public final int getMSupportLiveVideo() {
        return this.mSupportLiveVideo;
    }

    public final int getMSupportOrientation() {
        return this.mSupportOrientation;
    }

    public final int getMSupportP2P() {
        return this.mSupportP2P;
    }

    public final int getMSupportVideoCalls() {
        return this.mSupportVideoCalls;
    }

    public final int getMSupportWeChatCall() {
        return this.mSupportWeChatCall;
    }

    @aa1
    public final List<AIImageResolution> getMSupportedAIImageResolution() {
        return this.mSupportedAIImageResolution;
    }

    @aa1
    public final List<VideoResolution> getMSupportedVideoResolution() {
        return this.mSupportedVideoResolution;
    }

    @aa1
    public final List<VideoResolution> getMSupportedVideoResolution2() {
        return this.mSupportedVideoResolution2;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.mSupportP2P) * 31) + Integer.hashCode(this.mSupportOrientation)) * 31) + this.mSupportedVideoResolution.hashCode()) * 31) + Integer.hashCode(this.mSupportVideoCalls)) * 31) + Integer.hashCode(this.mSupportWeChatCall)) * 31) + Integer.hashCode(this.mSupportLiveVideo)) * 31) + this.mSupportedAIImageResolution.hashCode()) * 31) + Integer.hashCode(this.mSupportAlipay)) * 31) + Integer.hashCode(this.mSupportHttpProtocolVersion)) * 31) + this.mSupportedVideoResolution2.hashCode();
    }

    public final void setMSupportAlipay(int r1) {
        this.mSupportAlipay = r1;
    }

    public final void setMSupportHttpProtocolVersion(int r1) {
        this.mSupportHttpProtocolVersion = r1;
    }

    public final void setMSupportLiveVideo(int r1) {
        this.mSupportLiveVideo = r1;
    }

    public final void setMSupportOrientation(int r1) {
        this.mSupportOrientation = r1;
    }

    public final void setMSupportP2P(int r1) {
        this.mSupportP2P = r1;
    }

    public final void setMSupportVideoCalls(int r1) {
        this.mSupportVideoCalls = r1;
    }

    public final void setMSupportWeChatCall(int r1) {
        this.mSupportWeChatCall = r1;
    }

    public final void setMSupportedAIImageResolution(@aa1 List<? extends AIImageResolution> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSupportedAIImageResolution = r2;
    }

    public final void setMSupportedVideoResolution(@aa1 List<? extends VideoResolution> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSupportedVideoResolution = r2;
    }

    public final void setMSupportedVideoResolution2(@aa1 List<? extends VideoResolution> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSupportedVideoResolution2 = r2;
    }

    @aa1
    public String toString() {
        return "BleIPCSupport(mSupportP2P=" + this.mSupportP2P + ", mSupportOrientation=" + this.mSupportOrientation + ", mSupportedVideoResolution=" + this.mSupportedVideoResolution + ", mSupportVideoCalls=" + this.mSupportVideoCalls + ", mSupportWeChatCall=" + this.mSupportWeChatCall + ", mSupportLiveVideo=" + this.mSupportLiveVideo + ", mSupportedAIImageResolution=" + this.mSupportedAIImageResolution + ", mSupportAlipay=" + this.mSupportAlipay + ", mSupportHttpProtocolVersion=" + this.mSupportHttpProtocolVersion + ", mSupportedVideoResolution2=" + this.mSupportedVideoResolution2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleIPCSupport(int r2, int r3, @aa1 List<? extends VideoResolution> r4, int r5, int r6, int r7, @aa1 List<? extends AIImageResolution> r8, int r9, int r10, @aa1 List<? extends VideoResolution> r11) {
        Intrinsics.X0O(r4, "mSupportedVideoResolution");
        Intrinsics.X0O(r8, "mSupportedAIImageResolution");
        Intrinsics.X0O(r11, "mSupportedVideoResolution2");
        this.mSupportP2P = r2;
        this.mSupportOrientation = r3;
        this.mSupportedVideoResolution = r4;
        this.mSupportVideoCalls = r5;
        this.mSupportWeChatCall = r6;
        this.mSupportLiveVideo = r7;
        this.mSupportedAIImageResolution = r8;
        this.mSupportAlipay = r9;
        this.mSupportHttpProtocolVersion = r10;
        this.mSupportedVideoResolution2 = r11;
    }

    public /* synthetic */ BleIPCSupport(int r2, int r3, List r4, int r5, int r6, int r7, List r8, int r9, int r10, List r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = CollectionsKt__CollectionsKt.iI();
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = CollectionsKt__CollectionsKt.iI();
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = 0;
    L30:
        if ((r12 & 512) == 0) goto L32;
        r11 = CollectionsKt__CollectionsKt.iI();
    L32:
        List r14 = r11;
        int r15 = r10;
        int r16 = r9;
        List r17 = r8;
        int r18 = r7;
        int r19 = r6;
        int r20 = r5;
        List r21 = r4;
        this(r2, r3, r21, r20, r19, r18, r17, r16, r15, r14);
    }
}
