package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class AccountPoints extends JsonFieldContainer implements Serializable {
    private int getPointFlag;
    private int points;
    private int userId;

    public AccountPoints() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ AccountPoints copy$default(AccountPoints r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.userId;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.points;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.getPointFlag;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.userId;
    }

    public final int component2() {
        return this.points;
    }

    public final int component3() {
        return this.getPointFlag;
    }

    @aa1
    public final AccountPoints copy(int r2, int r3, int r4) {
        return new AccountPoints(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AccountPoints) == true) goto L8;
        return false;
    L8:
        AccountPoints r6 = (AccountPoints) r5;
        if (this.userId == r6.userId) goto L12;
        return false;
    L12:
        if (this.points == r6.points) goto L15;
        return false;
    L15:
        if (this.getPointFlag == r6.getPointFlag) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getGetPointFlag() {
        return this.getPointFlag;
    }

    public final int getPoints() {
        return this.points;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.userId) * 31) + Integer.hashCode(this.points)) * 31) + Integer.hashCode(this.getPointFlag);
    }

    public final void setGetPointFlag(int r1) {
        this.getPointFlag = r1;
    }

    public final void setPoints(int r1) {
        this.points = r1;
    }

    public final void setUserId(int r1) {
        this.userId = r1;
    }

    @aa1
    public String toString() {
        return "AccountPoints(userId=" + this.userId + ", points=" + this.points + ", getPointFlag=" + this.getPointFlag + I000IiI1O.iO.iO;
    }

    public AccountPoints(int r1, int r2, int r3) {
        this.userId = r1;
        this.points = r2;
        this.getPointFlag = r3;
    }

    public /* synthetic */ AccountPoints(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
