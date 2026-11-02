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
        boolean r1 = false;
        long r2 = 0;
        long r4 = 0;
        boolean r6 = false;
        long r7 = 0;
        boolean r9 = false;
        this(r1, r2, r4, r6, r7, r9, 63, null);
    }

    public static /* synthetic */ UserMember copy$default(UserMember r0, boolean r1, long r2, long r4, boolean r6, long r7, boolean r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.getMemberFlag;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.latestDateTime;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = r0.serverDateTime;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = r0.getGameMemberFlag;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = r0.latestGameMemberDateTime;
    L18:
        if ((r10 & 32) == 0) goto L20;
        r9 = r0.getTrialMemberFlag;
    L20:
        boolean r12 = r9;
        boolean r8 = r6;
        long r13 = r4;
        long r5 = r2;
        boolean r3 = r1;
        return r0.copy(r3, r5, r13, r8, r7, r12);
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
    public final UserMember copy(boolean r11, long r12, long r14, boolean r16, long r17, boolean r19) {
        return new UserMember(r11, r12, r14, r16, r17, r19);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof UserMember) == true) goto L8;
        return false;
    L8:
        UserMember r9 = (UserMember) r8;
        if (this.getMemberFlag == r9.getMemberFlag) goto L12;
        return false;
    L12:
        if (this.latestDateTime == r9.latestDateTime) goto L15;
        return false;
    L15:
        if (this.serverDateTime == r9.serverDateTime) goto L18;
        return false;
    L18:
        if (this.getGameMemberFlag == r9.getGameMemberFlag) goto L21;
        return false;
    L21:
        if (this.latestGameMemberDateTime == r9.latestGameMemberDateTime) goto L24;
        return false;
    L24:
        if (this.getTrialMemberFlag == r9.getTrialMemberFlag) goto L26;
        return false;
    L26:
        return true;
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

    public final void setGetGameMemberFlag(boolean r1) {
        this.getGameMemberFlag = r1;
    }

    public final void setGetMemberFlag(boolean r1) {
        this.getMemberFlag = r1;
    }

    public final void setGetTrialMemberFlag(boolean r1) {
        this.getTrialMemberFlag = r1;
    }

    public final void setLatestDateTime(long r1) {
        this.latestDateTime = r1;
    }

    public final void setLatestGameMemberDateTime(long r1) {
        this.latestGameMemberDateTime = r1;
    }

    public final void setServerDateTime(long r1) {
        this.serverDateTime = r1;
    }

    @aa1
    public String toString() {
        return "UserMember(getMemberFlag=" + this.getMemberFlag + ", latestDateTime=" + this.latestDateTime + ", serverDateTime=" + this.serverDateTime + ", getGameMemberFlag=" + this.getGameMemberFlag + ", latestGameMemberDateTime=" + this.latestGameMemberDateTime + ", getTrialMemberFlag=" + this.getTrialMemberFlag + I000IiI1O.iO.iO;
    }

    public UserMember(boolean r1, long r2, long r4, boolean r6, long r7, boolean r9) {
        this.getMemberFlag = r1;
        this.latestDateTime = r2;
        this.serverDateTime = r4;
        this.getGameMemberFlag = r6;
        this.latestGameMemberDateTime = r7;
        this.getTrialMemberFlag = r9;
    }

    public /* synthetic */ UserMember(boolean r4, long r5, long r7, boolean r9, long r10, boolean r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r4 = true;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r5 = 0;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r7 = 0;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r9 = true;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r10 = 0;
    L18:
        if ((r13 & 32) == 0) goto L20;
        r12 = false;
    L20:
        long r11 = r10;
        long r8 = r7;
        long r6 = r5;
        boolean r15 = r4;
        this(r15, r6, r8, r9, r11, r12);
    }
}
