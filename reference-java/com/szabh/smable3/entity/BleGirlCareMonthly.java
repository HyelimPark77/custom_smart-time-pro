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
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT = 0;
    public static final int EASY_PREGNANCY = 4;
    public static final int MENSTRUATING = 2;
    public static final int MENSTRUATION_END = 3;
    public static final int MENSTRUATION_START = 1;
    public static final int OVULATION_DATE = 5;

    @aa1
    private List<Integer> mList;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleGirlCareMonthly() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleGirlCareMonthly copy$default(BleGirlCareMonthly bleGirlCareMonthly, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bleGirlCareMonthly.mList;
        }
        return bleGirlCareMonthly.copy(list);
    }

    @aa1
    public final List<Integer> component1() {
        return this.mList;
    }

    @aa1
    public final BleGirlCareMonthly copy(@aa1 List<Integer> mList) {
        Intrinsics.X0O(mList, "mList");
        return new BleGirlCareMonthly(mList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        if (getMBytes() != null) {
            byte[] mBytes = getMBytes();
            Intrinsics.XXI(mBytes);
            ArrayList arrayList = new ArrayList(mBytes.length);
            for (byte b : mBytes) {
                arrayList.add(Integer.valueOf(b));
            }
            this.mList = arrayList;
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleGirlCareMonthly) && Intrinsics.XOO0ii0(this.mList, ((BleGirlCareMonthly) obj).mList);
    }

    @aa1
    public final List<Integer> getMList() {
        return this.mList;
    }

    public int hashCode() {
        return this.mList.hashCode();
    }

    public final void setMList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    @aa1
    public String toString() {
        return "BleGirlCareMonthly(mSize=" + this.mList.size() + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGirlCareMonthly(@aa1 List<Integer> mList) {
        Intrinsics.X0O(mList, "mList");
        this.mList = mList;
    }

    public /* synthetic */ BleGirlCareMonthly(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list);
    }
}
