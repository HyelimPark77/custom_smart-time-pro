package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleCoaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCoaching.kt\ncom/szabh/smable3/entity/BleCoaching\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n3093#2,5:51\n*S KotlinDebug\n*F\n+ 1 BleCoaching.kt\ncom/szabh/smable3/entity/BleCoaching\n*L\n24#1:51,5\n*E\n"})
public final class BleCoaching extends BleIdObject {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 21;
    public static final int LENGTH_FIXED = 19;
    public static final int LENGTH_TITLE = 15;
    public static final int MAX_LENGTH_DESCRIPTION = 128;

    @aa1
    private String mDescription;
    private int mRepeat;

    @aa1
    private List<BleCoachingSegment> mSegments;

    @aa1
    private String mTitle;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleCoaching() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        List r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleCoaching copy$default(BleCoaching r0, String r1, String r2, int r3, List r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mTitle;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mDescription;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mRepeat;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mSegments;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    private final int getMDescriptionLength() {
        byte[] r0 = this.mDescription.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return Math.min(r0.length, 128);
    }

    private final int getMSegmentsCount() {
        return this.mSegments.size();
    }

    @aa1
    public final String component1() {
        return this.mTitle;
    }

    @aa1
    public final String component2() {
        return this.mDescription;
    }

    public final int component3() {
        return this.mRepeat;
    }

    @aa1
    public final List<BleCoachingSegment> component4() {
        return this.mSegments;
    }

    @aa1
    public final BleCoaching copy(@aa1 String r2, @aa1 String r3, int r4, @aa1 List<BleCoachingSegment> r5) {
        Intrinsics.X0O(r2, "mTitle");
        Intrinsics.X0O(r3, "mDescription");
        Intrinsics.X0O(r5, "mSegments");
        return new BleCoaching(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(getMId());
        BleWritable.writeStringWithFix$default(this, this.mTitle, 15, null, 4, null);
        writeInt8(getMDescriptionLength());
        BleWritable.writeStringWithFix$default(this, this.mDescription, getMDescriptionLength(), null, 4, null);
        writeInt8(this.mRepeat);
        writeInt8(getMSegmentsCount());
        writeList(this.mSegments);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleCoaching) == true) goto L8;
        return false;
    L8:
        BleCoaching r6 = (BleCoaching) r5;
        if (Intrinsics.XOO0ii0(this.mTitle, r6.mTitle) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mDescription, r6.mDescription) == true) goto L15;
        return false;
    L15:
        if (this.mRepeat == r6.mRepeat) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mSegments, r6.mSegments) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getMDescription() {
        return this.mDescription;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        int r0 = getMDescriptionLength() + 19;
        Iterator<T> r1 = this.mSegments.iterator();
        int r2 = 0;
    L4:
        if (r1.hasNext() == false) goto L7;
        r2 = r2 + ((BleCoachingSegment) r1.next()).getMLengthToWrite();
        goto L4
    L7:
        return r0 + r2;
    }

    public final int getMRepeat() {
        return this.mRepeat;
    }

    @aa1
    public final List<BleCoachingSegment> getMSegments() {
        return this.mSegments;
    }

    @aa1
    public final String getMTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return (((((this.mTitle.hashCode() * 31) + this.mDescription.hashCode()) * 31) + Integer.hashCode(this.mRepeat)) * 31) + this.mSegments.hashCode();
    }

    public final void setMDescription(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDescription = r2;
    }

    public final void setMRepeat(int r1) {
        this.mRepeat = r1;
    }

    public final void setMSegments(@aa1 List<BleCoachingSegment> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSegments = r2;
    }

    public final void setMTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTitle = r2;
    }

    @aa1
    public String toString() {
        return "BleCoaching(mId=" + getMId() + ", mTitle='" + this.mTitle + "', mDescription='" + this.mDescription + "', mRepeat=" + this.mRepeat + ", mSegments=" + this.mSegments + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCoaching(@aa1 String r2, @aa1 String r3, int r4, @aa1 List<BleCoachingSegment> r5) {
        Intrinsics.X0O(r2, "mTitle");
        Intrinsics.X0O(r3, "mDescription");
        Intrinsics.X0O(r5, "mSegments");
        this.mTitle = r2;
        this.mDescription = r3;
        this.mRepeat = r4;
        this.mSegments = r5;
    }

    public /* synthetic */ BleCoaching(String r2, String r3, int r4, List r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 1;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = CollectionsKt__CollectionsKt.iI();
    L14:
        this(r2, r3, r4, r5);
    }
}
