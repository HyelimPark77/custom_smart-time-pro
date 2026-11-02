package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class UserMember extends JsonFieldContainer implements Serializable {
    private boolean getGameMemberFlag;
    private boolean getMemberFlag;
    private boolean getTrialMemberFlag;
    private long latestDateTime;
    private long latestGameMemberDateTime;
    private long serverDateTime;

    public UserMember() {
        this(false, 0L, 0L, false, 0L, false, 63, null);
    }

    public static /* synthetic */ UserMember copy$default(UserMember userMember, boolean z, long j, long j2, boolean z2, long j3, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userMember.getMemberFlag;
        }
        if ((i & 2) != 0) {
            j = userMember.latestDateTime;
        }
        if ((i & 4) != 0) {
            j2 = userMember.serverDateTime;
        }
        if ((i & 8) != 0) {
            z2 = userMember.getGameMemberFlag;
        }
        if ((i & 16) != 0) {
            j3 = userMember.latestGameMemberDateTime;
        }
        if ((i & 32) != 0) {
            z3 = userMember.getTrialMemberFlag;
        }
        boolean z4 = z2;
        long j4 = j2;
        return userMember.copy(z, j, j4, z4, j3, z3);
    }

    public final boolean component1() {
        return this.getMemberFlag;
    }

    public final long component2() {
        return this.latestDateTime;
    }

    public final long component3() {
        return this.serverDateTime;
    }

    public final boolean component4() {
        return this.getGameMemberFlag;
    }

    public final long component5() {
        return this.latestGameMemberDateTime;
    }

    public final boolean component6() {
        return this.getTrialMemberFlag;
    }

    @aa1
    public final UserMember copy(boolean z, long j, long j2, boolean z2, long j3, boolean z3) {
        return new UserMember(z, j, j2, z2, j3, z3);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMember)) {
            return false;
        }
        UserMember userMember = (UserMember) obj;
        return this.getMemberFlag == userMember.getMemberFlag && this.latestDateTime == userMember.latestDateTime && this.serverDateTime == userMember.serverDateTime && this.getGameMemberFlag == userMember.getGameMemberFlag && this.latestGameMemberDateTime == userMember.latestGameMemberDateTime && this.getTrialMemberFlag == userMember.getTrialMemberFlag;
    }

    public final boolean getGetGameMemberFlag() {
        return this.getGameMemberFlag;
    }

    public final boolean getGetMemberFlag() {
        return this.getMemberFlag;
    }

    public final boolean getGetTrialMemberFlag() {
        return this.getTrialMemberFlag;
    }

    public final long getLatestDateTime() {
        return this.latestDateTime;
    }

    public final long getLatestGameMemberDateTime() {
        return this.latestGameMemberDateTime;
    }

    public final long getServerDateTime() {
        return this.serverDateTime;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.getMemberFlag) * 31) + Long.hashCode(this.latestDateTime)) * 31) + Long.hashCode(this.serverDateTime)) * 31) + Boolean.hashCode(this.getGameMemberFlag)) * 31) + Long.hashCode(this.latestGameMemberDateTime)) * 31) + Boolean.hashCode(this.getTrialMemberFlag);
    }

    public final void setGetGameMemberFlag(boolean z) {
        this.getGameMemberFlag = z;
    }

    public final void setGetMemberFlag(boolean z) {
        this.getMemberFlag = z;
    }

    public final void setGetTrialMemberFlag(boolean z) {
        this.getTrialMemberFlag = z;
    }

    public final void setLatestDateTime(long j) {
        this.latestDateTime = j;
    }

    public final void setLatestGameMemberDateTime(long j) {
        this.latestGameMemberDateTime = j;
    }

    public final void setServerDateTime(long j) {
        this.serverDateTime = j;
    }

    @aa1
    public String toString() {
        return "UserMember(getMemberFlag=" + this.getMemberFlag + ", latestDateTime=" + this.latestDateTime + ", serverDateTime=" + this.serverDateTime + ", getGameMemberFlag=" + this.getGameMemberFlag + ", latestGameMemberDateTime=" + this.latestGameMemberDateTime + ", getTrialMemberFlag=" + this.getTrialMemberFlag + I000IiI1O.C2156iO.f1007iO;
    }

    public UserMember(boolean z, long j, long j2, boolean z2, long j3, boolean z3) {
        this.getMemberFlag = z;
        this.latestDateTime = j;
        this.serverDateTime = j2;
        this.getGameMemberFlag = z2;
        this.latestGameMemberDateTime = j3;
        this.getTrialMemberFlag = z3;
    }

    public /* synthetic */ UserMember(boolean z, long j, long j2, boolean z2, long j3, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? false : z3);
    }
}
