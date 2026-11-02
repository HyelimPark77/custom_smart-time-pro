package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleGirlCareMonthly.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGirlCareMonthly.kt\ncom/szabh/smable3/entity/BleGirlCareMonthly\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,33:1\n11571#2:34\n11906#2,3:35\n*S KotlinDebug\n*F\n+ 1 BleGirlCareMonthly.kt\ncom/szabh/smable3/entity/BleGirlCareMonthly\n*L\n15#1:34\n15#1:35,3\n*E\n"})
public final class BleGirlCareMonthly extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int DEFAULT = 0;
    public static final int EASY_PREGNANCY = 4;
    public static final int MENSTRUATING = 2;
    public static final int MENSTRUATION_END = 3;
    public static final int MENSTRUATION_START = 1;
    public static final int OVULATION_DATE = 5;

    @aa1
    private List<Integer> mList;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleGirlCareMonthly() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleGirlCareMonthly copy$default(BleGirlCareMonthly r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mList;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final List<Integer> component1() {
        return this.mList;
    }

    @aa1
    public final BleGirlCareMonthly copy(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "mList");
        return new BleGirlCareMonthly(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        if (getMBytes() == null) goto L10;
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        ArrayList r1 = new ArrayList(r0.length);
        int r2 = r0.length;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L7;
        r1.add(Integer.valueOf(r0[r3]));
        r3 = r3 + 1;
        goto L5
    L7:
        this.mList = r1;
        return;
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleGirlCareMonthly) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mList, ((BleGirlCareMonthly) r4).mList) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final List<Integer> getMList() {
        return this.mList;
    }

    public int hashCode() {
        return this.mList.hashCode();
    }

    public final void setMList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    @aa1
    public String toString() {
        return "BleGirlCareMonthly(mSize=" + this.mList.size() + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGirlCareMonthly(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "mList");
        this.mList = r2;
    }

    public /* synthetic */ BleGirlCareMonthly(List r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = CollectionsKt__CollectionsKt.iI();
    L5:
        this(r1);
    }
}
