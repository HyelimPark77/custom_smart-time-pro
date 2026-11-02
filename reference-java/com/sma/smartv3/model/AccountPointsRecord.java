package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AccountPointsRecord extends JsonFieldContainer implements Serializable {
    private int accountId;

    @aa1
    private String createdAt;

    /* JADX INFO: renamed from: id */
    private int f51296id;

    @aa1
    private String pointsChange;

    @aa1
    private String recordItem;

    public AccountPointsRecord() {
        this(0, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ AccountPointsRecord copy$default(AccountPointsRecord accountPointsRecord, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = accountPointsRecord.f51296id;
        }
        if ((i3 & 2) != 0) {
            i2 = accountPointsRecord.accountId;
        }
        if ((i3 & 4) != 0) {
            str = accountPointsRecord.recordItem;
        }
        if ((i3 & 8) != 0) {
            str2 = accountPointsRecord.pointsChange;
        }
        if ((i3 & 16) != 0) {
            str3 = accountPointsRecord.createdAt;
        }
        String str4 = str3;
        String str5 = str;
        return accountPointsRecord.copy(i, i2, str5, str2, str4);
    }

    public final int component1() {
        return this.f51296id;
    }

    public final int component2() {
        return this.accountId;
    }

    @aa1
    public final String component3() {
        return this.recordItem;
    }

    @aa1
    public final String component4() {
        return this.pointsChange;
    }

    @aa1
    public final String component5() {
        return this.createdAt;
    }

    @aa1
    public final AccountPointsRecord copy(int i, int i2, @aa1 String recordItem, @aa1 String pointsChange, @aa1 String createdAt) {
        Intrinsics.X0O(recordItem, "recordItem");
        Intrinsics.X0O(pointsChange, "pointsChange");
        Intrinsics.X0O(createdAt, "createdAt");
        return new AccountPointsRecord(i, i2, recordItem, pointsChange, createdAt);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPointsRecord)) {
            return false;
        }
        AccountPointsRecord accountPointsRecord = (AccountPointsRecord) obj;
        return this.f51296id == accountPointsRecord.f51296id && this.accountId == accountPointsRecord.accountId && Intrinsics.XOO0ii0(this.recordItem, accountPointsRecord.recordItem) && Intrinsics.XOO0ii0(this.pointsChange, accountPointsRecord.pointsChange) && Intrinsics.XOO0ii0(this.createdAt, accountPointsRecord.createdAt);
    }

    public final int getAccountId() {
        return this.accountId;
    }

    @aa1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.f51296id;
    }

    @aa1
    public final String getPointsChange() {
        return this.pointsChange;
    }

    @aa1
    public final String getRecordItem() {
        return this.recordItem;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f51296id) * 31) + Integer.hashCode(this.accountId)) * 31) + this.recordItem.hashCode()) * 31) + this.pointsChange.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public final void setAccountId(int i) {
        this.accountId = i;
    }

    public final void setCreatedAt(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.createdAt = str;
    }

    public final void setId(int i) {
        this.f51296id = i;
    }

    public final void setPointsChange(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.pointsChange = str;
    }

    public final void setRecordItem(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.recordItem = str;
    }

    @aa1
    public String toString() {
        return "AccountPointsRecord(id=" + this.f51296id + ", accountId=" + this.accountId + ", recordItem=" + this.recordItem + ", pointsChange=" + this.pointsChange + ", createdAt=" + this.createdAt + I000IiI1O.C2156iO.f1007iO;
    }

    public AccountPointsRecord(int i, int i2, @aa1 String recordItem, @aa1 String pointsChange, @aa1 String createdAt) {
        Intrinsics.X0O(recordItem, "recordItem");
        Intrinsics.X0O(pointsChange, "pointsChange");
        Intrinsics.X0O(createdAt, "createdAt");
        this.f51296id = i;
        this.accountId = i2;
        this.recordItem = recordItem;
        this.pointsChange = pointsChange;
        this.createdAt = createdAt;
    }

    public /* synthetic */ AccountPointsRecord(int i, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3);
    }
}
