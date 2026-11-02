package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.O1OOiOO1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleWeekPlanTimeV2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,327:1\n37#2,2:328\n37#2,2:330\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleWeekPlanTimeV2\n*L\n291#1:328,2\n313#1:330,2\n*E\n"})
public final class BleWeekPlanTimeV2 extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;

    @aa1
    private Integer[] mList;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BleWeekPlanTimeV2 ofPlanTime(@aa1 List<Integer> r3) {
            Intrinsics.X0O(r3, "list");
            return new BleWeekPlanTimeV2(r3, null);
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleWeekPlanTimeV2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleWeekPlanTimeV2 copy$default(BleWeekPlanTimeV2 r0, Integer[] r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mList;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final Integer[] component1() {
        return this.mList;
    }

    @aa1
    public final BleWeekPlanTimeV2 copy(@aa1 Integer[] r2) {
        Intrinsics.X0O(r2, "mList");
        return new BleWeekPlanTimeV2(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ArrayList r0 = new ArrayList();
        int r2 = 0;
    L4:
        if (r2 >= 32) goto L6;
        r0.add(Integer.valueOf(readIntN(1)));
        r2 = r2 + 1;
        goto L4
    L6:
        O1OOiOO1i.I11X11OX(r0);
        this.mList = (Integer[]) r0.toArray(new Integer[0]);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = 31;
    L4:
        if ((-1) >= r0) goto L10;
        Integer[] r1 = this.mList;
        if (r0 >= r1.length) goto L8;
        writeIntN(r1[r0].intValue(), 1);
    L9:
        r0 = r0 - 1;
        goto L4
    L8:
        writeIntN(0, 1);
        goto L9
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleWeekPlanTimeV2) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mList, ((BleWeekPlanTimeV2) r4).mList) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 4;
    }

    @aa1
    public final Integer[] getMList() {
        return this.mList;
    }

    public int hashCode() {
        return Arrays.hashCode(this.mList);
    }

    public final void setMList(@aa1 Integer[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    @aa1
    public String toString() {
        return "BleWeekPlanTime(mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public /* synthetic */ BleWeekPlanTimeV2(List r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    public BleWeekPlanTimeV2(@aa1 Integer[] r2) {
        Intrinsics.X0O(r2, "mList");
        this.mList = r2;
    }

    public /* synthetic */ BleWeekPlanTimeV2(Integer[] r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new Integer[0];
    L5:
        this(r1);
    }

    private BleWeekPlanTimeV2(List<Integer> r2) {
        this((Integer[]) r2.toArray(new Integer[0]));
    }
}
