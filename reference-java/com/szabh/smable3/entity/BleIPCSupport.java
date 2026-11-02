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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public enum VideoResolution {
        VR_100WP25(0, "720P/25 FPS", false, 4, null),
        VR_100WP30(1, "720P/30 FPS", false, 4, null),
        VR_200WP20(2, "1080P/20 FPS", false, 4, null),
        VR_200WP30(3, "1080P/30 FPS", false, 4, null),
        VR_500WP20(4, "2K/20 FPS", false, 4, null),
        VR_500WP30(5, "2K/30 FPS", false, 4, null),
        VR_800WP20(6, "4K/20 FPS", false, 4, null),
        VR_800WP30(7, "4K/30 FPS", false, 4, null),
        VR_1300WP20(8, "4K/20 FPS", false, 4, null),
        VR_1300WP30(9, "4K/30 FPS", false, 4, null),
        VR_400WP30(10, "2K/30 FPS", false, 4, null),
        VR_1920X1080(64, "1920x1080 30fps 16:9", false, 4, null),
        VR_2560X1440(65, "2560x1440 30fps 16:9", false, 4, null),
        VR_1440X1920(66, "1440x1920 30fps 3:4", true),
        VR_1600X1200(67, "1600x1200 30fps 4:3", false, 4, null),
        VR_2592X1944(68, "2592X1944 30fps 4:3", false, 4, null),
        VR_1600X1200_60(69, "1600X1200 60fps 4:3", false, 4, null);


        @aa1
        private final String label;
        private final boolean portrait;
        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static final Companion Companion = new Companion(null);

        @SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,281:1\n774#2:282\n865#2,2:283\n774#2:290\n865#2,2:291\n1#3:285\n11571#4:286\n11906#4,3:287\n*S KotlinDebug\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion\n*L\n137#1:282\n137#1:283,2\n147#1:290\n147#1:291,2\n147#1:286\n147#1:287,3\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @aa1
            public final List<VideoResolution> fromBytes(@aa1 byte[] bytes) {
                Intrinsics.X0O(bytes, "bytes");
                ArrayList arrayList = new ArrayList(bytes.length);
                for (byte b : bytes) {
                    arrayList.add(VideoResolution.Companion.m39003of(b));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((VideoResolution) obj).getValue() != 0) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }

            @aa1
            public final List<VideoResolution> fromMask(long j) {
                i1O0OXO1O.OXO1.OXO1("fromMask mask=" + j);
                EnumEntries<VideoResolution> entries = VideoResolution.getEntries();
                ArrayList arrayList = new ArrayList();
                for (VideoResolution videoResolution : entries) {
                    VideoResolution videoResolution2 = videoResolution;
                    if (videoResolution2.getValue() < 64 && ((1 << videoResolution2.getValue()) & j) != 0) {
                        arrayList.add(videoResolution);
                    }
                }
                return arrayList;
            }

            @aa1
            /* JADX INFO: renamed from: of */
            public final VideoResolution m39003of(int i) {
                VideoResolution next;
                Iterator<VideoResolution> it = VideoResolution.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.getValue() != i);
                VideoResolution videoResolution = next;
                return videoResolution == null ? VideoResolution.VR_100WP25 : videoResolution;
            }

            private Companion() {
            }
        }

        VideoResolution(int i, String str, boolean z) {
            this.value = i;
            this.label = str;
            this.portrait = z;
        }

        @aa1
        public static EnumEntries<VideoResolution> getEntries() {
            return $ENTRIES;
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

        /* synthetic */ VideoResolution(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? false : z);
        }
    }

    public BleIPCSupport() {
        this(0, 0, null, 0, 0, 0, null, 0, 0, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleIPCSupport copy$default(BleIPCSupport bleIPCSupport, int i, int i2, List list, int i3, int i4, int i5, List list2, int i6, int i7, List list3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = bleIPCSupport.mSupportP2P;
        }
        if ((i8 & 2) != 0) {
            i2 = bleIPCSupport.mSupportOrientation;
        }
        if ((i8 & 4) != 0) {
            list = bleIPCSupport.mSupportedVideoResolution;
        }
        if ((i8 & 8) != 0) {
            i3 = bleIPCSupport.mSupportVideoCalls;
        }
        if ((i8 & 16) != 0) {
            i4 = bleIPCSupport.mSupportWeChatCall;
        }
        if ((i8 & 32) != 0) {
            i5 = bleIPCSupport.mSupportLiveVideo;
        }
        if ((i8 & 64) != 0) {
            list2 = bleIPCSupport.mSupportedAIImageResolution;
        }
        if ((i8 & 128) != 0) {
            i6 = bleIPCSupport.mSupportAlipay;
        }
        if ((i8 & 256) != 0) {
            i7 = bleIPCSupport.mSupportHttpProtocolVersion;
        }
        if ((i8 & 512) != 0) {
            list3 = bleIPCSupport.mSupportedVideoResolution2;
        }
        int i9 = i7;
        List list4 = list3;
        List list5 = list2;
        int i10 = i6;
        int i11 = i4;
        int i12 = i5;
        return bleIPCSupport.copy(i, i2, list, i3, i11, i12, list5, i10, i9, list4);
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
    public final BleIPCSupport copy(int i, int i2, @aa1 List<? extends VideoResolution> mSupportedVideoResolution, int i3, int i4, int i5, @aa1 List<? extends AIImageResolution> mSupportedAIImageResolution, int i6, int i7, @aa1 List<? extends VideoResolution> mSupportedVideoResolution2) {
        Intrinsics.X0O(mSupportedVideoResolution, "mSupportedVideoResolution");
        Intrinsics.X0O(mSupportedAIImageResolution, "mSupportedAIImageResolution");
        Intrinsics.X0O(mSupportedVideoResolution2, "mSupportedVideoResolution2");
        return new BleIPCSupport(i, i2, mSupportedVideoResolution, i3, i4, i5, mSupportedAIImageResolution, i6, i7, mSupportedVideoResolution2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mSupportP2P = readUInt8();
        this.mSupportOrientation = readUInt8();
        VideoResolution.Companion companion = VideoResolution.Companion;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mSupportedVideoResolution = companion.fromMask(readInt64(LITTLE_ENDIAN));
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        readUInt16(LITTLE_ENDIAN);
        this.mSupportVideoCalls = readUInt8();
        this.mSupportWeChatCall = readUInt8();
        this.mSupportLiveVideo = readUInt8();
        this.mSupportedAIImageResolution = AIImageResolution.Companion.fromMask(readUInt8());
        this.mSupportAlipay = readUInt8();
        this.mSupportHttpProtocolVersion = readUInt8();
        this.mSupportedVideoResolution2 = companion.fromBytes(readBytes(8));
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleIPCSupport)) {
            return false;
        }
        BleIPCSupport bleIPCSupport = (BleIPCSupport) obj;
        return this.mSupportP2P == bleIPCSupport.mSupportP2P && this.mSupportOrientation == bleIPCSupport.mSupportOrientation && Intrinsics.XOO0ii0(this.mSupportedVideoResolution, bleIPCSupport.mSupportedVideoResolution) && this.mSupportVideoCalls == bleIPCSupport.mSupportVideoCalls && this.mSupportWeChatCall == bleIPCSupport.mSupportWeChatCall && this.mSupportLiveVideo == bleIPCSupport.mSupportLiveVideo && Intrinsics.XOO0ii0(this.mSupportedAIImageResolution, bleIPCSupport.mSupportedAIImageResolution) && this.mSupportAlipay == bleIPCSupport.mSupportAlipay && this.mSupportHttpProtocolVersion == bleIPCSupport.mSupportHttpProtocolVersion && Intrinsics.XOO0ii0(this.mSupportedVideoResolution2, bleIPCSupport.mSupportedVideoResolution2);
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

    public final void setMSupportAlipay(int i) {
        this.mSupportAlipay = i;
    }

    public final void setMSupportHttpProtocolVersion(int i) {
        this.mSupportHttpProtocolVersion = i;
    }

    public final void setMSupportLiveVideo(int i) {
        this.mSupportLiveVideo = i;
    }

    public final void setMSupportOrientation(int i) {
        this.mSupportOrientation = i;
    }

    public final void setMSupportP2P(int i) {
        this.mSupportP2P = i;
    }

    public final void setMSupportVideoCalls(int i) {
        this.mSupportVideoCalls = i;
    }

    public final void setMSupportWeChatCall(int i) {
        this.mSupportWeChatCall = i;
    }

    public final void setMSupportedAIImageResolution(@aa1 List<? extends AIImageResolution> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mSupportedAIImageResolution = list;
    }

    public final void setMSupportedVideoResolution(@aa1 List<? extends VideoResolution> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mSupportedVideoResolution = list;
    }

    public final void setMSupportedVideoResolution2(@aa1 List<? extends VideoResolution> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mSupportedVideoResolution2 = list;
    }

    @aa1
    public String toString() {
        return "BleIPCSupport(mSupportP2P=" + this.mSupportP2P + ", mSupportOrientation=" + this.mSupportOrientation + ", mSupportedVideoResolution=" + this.mSupportedVideoResolution + ", mSupportVideoCalls=" + this.mSupportVideoCalls + ", mSupportWeChatCall=" + this.mSupportWeChatCall + ", mSupportLiveVideo=" + this.mSupportLiveVideo + ", mSupportedAIImageResolution=" + this.mSupportedAIImageResolution + ", mSupportAlipay=" + this.mSupportAlipay + ", mSupportHttpProtocolVersion=" + this.mSupportHttpProtocolVersion + ", mSupportedVideoResolution2=" + this.mSupportedVideoResolution2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleIPCSupport(int i, int i2, @aa1 List<? extends VideoResolution> mSupportedVideoResolution, int i3, int i4, int i5, @aa1 List<? extends AIImageResolution> mSupportedAIImageResolution, int i6, int i7, @aa1 List<? extends VideoResolution> mSupportedVideoResolution2) {
        Intrinsics.X0O(mSupportedVideoResolution, "mSupportedVideoResolution");
        Intrinsics.X0O(mSupportedAIImageResolution, "mSupportedAIImageResolution");
        Intrinsics.X0O(mSupportedVideoResolution2, "mSupportedVideoResolution2");
        this.mSupportP2P = i;
        this.mSupportOrientation = i2;
        this.mSupportedVideoResolution = mSupportedVideoResolution;
        this.mSupportVideoCalls = i3;
        this.mSupportWeChatCall = i4;
        this.mSupportLiveVideo = i5;
        this.mSupportedAIImageResolution = mSupportedAIImageResolution;
        this.mSupportAlipay = i6;
        this.mSupportHttpProtocolVersion = i7;
        this.mSupportedVideoResolution2 = mSupportedVideoResolution2;
    }

    public /* synthetic */ BleIPCSupport(int i, int i2, List list, int i3, int i4, int i5, List list2, int i6, int i7, List list3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list2, (i8 & 128) != 0 ? 0 : i6, (i8 & 256) != 0 ? 0 : i7, (i8 & 512) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list3);
    }
}
