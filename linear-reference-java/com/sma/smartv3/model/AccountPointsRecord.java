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
    private int id;

    @aa1
    private String pointsChange;

    @aa1
    private String recordItem;

    public AccountPointsRecord() {
        int r1 = 0;
        int r2 = 0;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ AccountPointsRecord copy$default(AccountPointsRecord r0, int r1, int r2, String r3, String r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.accountId;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.recordItem;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.pointsChange;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.createdAt;
    L17:
        String r8 = r4;
        String r9 = r5;
        String r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.id;
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
    public final AccountPointsRecord copy(int r8, int r9, @aa1 String r10, @aa1 String r11, @aa1 String r12) {
        Intrinsics.X0O(r10, "recordItem");
        Intrinsics.X0O(r11, "pointsChange");
        Intrinsics.X0O(r12, "createdAt");
        return new AccountPointsRecord(r8, r9, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AccountPointsRecord) == true) goto L8;
        return false;
    L8:
        AccountPointsRecord r6 = (AccountPointsRecord) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (this.accountId == r6.accountId) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.recordItem, r6.recordItem) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.pointsChange, r6.pointsChange) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.createdAt, r6.createdAt) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    @aa1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.id;
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
        return (((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.accountId)) * 31) + this.recordItem.hashCode()) * 31) + this.pointsChange.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public final void setAccountId(int r1) {
        this.accountId = r1;
    }

    public final void setCreatedAt(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.createdAt = r2;
    }

    public final void setId(int r1) {
        this.id = r1;
    }

    public final void setPointsChange(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.pointsChange = r2;
    }

    public final void setRecordItem(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.recordItem = r2;
    }

    @aa1
    public String toString() {
        return "AccountPointsRecord(id=" + this.id + ", accountId=" + this.accountId + ", recordItem=" + this.recordItem + ", pointsChange=" + this.pointsChange + ", createdAt=" + this.createdAt + I000IiI1O.iO.iO;
    }

    public AccountPointsRecord(int r2, int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r4, "recordItem");
        Intrinsics.X0O(r5, "pointsChange");
        Intrinsics.X0O(r6, "createdAt");
        this.id = r2;
        this.accountId = r3;
        this.recordItem = r4;
        this.pointsChange = r5;
        this.createdAt = r6;
    }

    public /* synthetic */ AccountPointsRecord(int r2, int r3, String r4, String r5, String r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r9 = "";
    L17:
        String r10 = r5;
        String r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
