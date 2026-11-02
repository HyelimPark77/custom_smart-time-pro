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
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ AccountPoints copy$default(AccountPoints accountPoints, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = accountPoints.userId;
        }
        if ((i4 & 2) != 0) {
            i2 = accountPoints.points;
        }
        if ((i4 & 4) != 0) {
            i3 = accountPoints.getPointFlag;
        }
        return accountPoints.copy(i, i2, i3);
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
    public final AccountPoints copy(int i, int i2, int i3) {
        return new AccountPoints(i, i2, i3);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPoints)) {
            return false;
        }
        AccountPoints accountPoints = (AccountPoints) obj;
        return this.userId == accountPoints.userId && this.points == accountPoints.points && this.getPointFlag == accountPoints.getPointFlag;
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

    public final void setGetPointFlag(int i) {
        this.getPointFlag = i;
    }

    public final void setPoints(int i) {
        this.points = i;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    @aa1
    public String toString() {
        return "AccountPoints(userId=" + this.userId + ", points=" + this.points + ", getPointFlag=" + this.getPointFlag + I000IiI1O.C2156iO.f1007iO;
    }

    public AccountPoints(int i, int i2, int i3) {
        this.userId = i;
        this.points = i2;
        this.getPointFlag = i3;
    }

    public /* synthetic */ AccountPoints(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
