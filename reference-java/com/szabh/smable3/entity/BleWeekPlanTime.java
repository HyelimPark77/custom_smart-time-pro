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
@SourceDebugExtension({"SMAP\nBleAICoachPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleWeekPlanTime\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,337:1\n37#2,2:338\n37#2,2:340\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleWeekPlanTime\n*L\n231#1:338,2\n253#1:340,2\n*E\n"})
public final class BleWeekPlanTime extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;

    @aa1
    private Integer[] mList;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final BleWeekPlanTime ofPlanTime(@aa1 List<Integer> list) {
            Intrinsics.X0O(list, "list");
            return new BleWeekPlanTime(list, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleWeekPlanTime() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleWeekPlanTime copy$default(BleWeekPlanTime bleWeekPlanTime, Integer[] numArr, int i, Object obj) {
        if ((i & 1) != 0) {
            numArr = bleWeekPlanTime.mList;
        }
        return bleWeekPlanTime.copy(numArr);
    }

    @aa1
    public final Integer[] component1() {
        return this.mList;
    }

    @aa1
    public final BleWeekPlanTime copy(@aa1 Integer[] mList) {
        Intrinsics.X0O(mList, "mList");
        return new BleWeekPlanTime(mList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 32; i++) {
            arrayList.add(Integer.valueOf(readIntN(1)));
        }
        O1OOiOO1i.I11X11OX(arrayList);
        this.mList = (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        for (int i = 31; -1 < i; i--) {
            Integer[] numArr = this.mList;
            if (i < numArr.length) {
                writeIntN(numArr[i].intValue(), 1);
            } else {
                writeIntN(0, 1);
            }
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleWeekPlanTime) && Intrinsics.XOO0ii0(this.mList, ((BleWeekPlanTime) obj).mList);
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

    public final void setMList(@aa1 Integer[] numArr) {
        Intrinsics.X0O(numArr, "<set-?>");
        this.mList = numArr;
    }

    @aa1
    public String toString() {
        return "BleWeekPlanTime(mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public /* synthetic */ BleWeekPlanTime(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<Integer>) list);
    }

    public BleWeekPlanTime(@aa1 Integer[] mList) {
        Intrinsics.X0O(mList, "mList");
        this.mList = mList;
    }

    public /* synthetic */ BleWeekPlanTime(Integer[] numArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Integer[0] : numArr);
    }

    private BleWeekPlanTime(List<Integer> list) {
        this((Integer[]) list.toArray(new Integer[0]));
    }
}
