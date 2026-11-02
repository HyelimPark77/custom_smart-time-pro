package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMUser extends JsonFieldContainer {

    @aa1
    public static final Companion Companion = null;
    private int age;

    @aa1
    private String appUserId;

    @aa1
    private String device_id;
    private boolean family_history;

    @aa1
    private BGEMGender gender;

    @aa1
    private String glicemiaUserId;
    private int height;
    private boolean high_cholesterol;
    private int weight;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BGEMUser of(@aa1 AppUser r14) {
            Intrinsics.X0O(r14, "appUser");
            int r4 = WeightMeasureDataKt.getAgeByBirth(r14.getBirthday());
            if (r14.getGender() != 1) goto L6;
            BGEMGender r0 = BGEMGender.M;
        L5:
            BGEMGender r5 = r0;
            String r2 = null;
            String r3 = null;
            String r8 = null;
            boolean r10 = false;
            return new BGEMUser(r2, r3, r4, r5, (int) r14.getWeight(), (int) r14.getHeight(), r8, a01.OXO1.IiI10X().getBoolean(b01.I11X11OX, false), r10, 67, null);
        L6:
            r0 = BGEMGender.F;
            goto L5
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BGEMUser() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        BGEMGender r4 = null;
        int r5 = 0;
        int r6 = 0;
        String r7 = null;
        boolean r8 = false;
        boolean r9 = false;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ BGEMUser copy$default(BGEMUser r0, String r1, String r2, int r3, BGEMGender r4, int r5, int r6, String r7, boolean r8, boolean r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.appUserId;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.glicemiaUserId;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.age;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.gender;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.weight;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.height;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.device_id;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.family_history;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.high_cholesterol;
    L29:
        boolean r12 = r8;
        boolean r13 = r9;
        int r14 = r6;
        String r15 = r7;
        BGEMGender r16 = r4;
        int r17 = r5;
        int r18 = r3;
        String r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    @aa1
    public final String component1() {
        return this.appUserId;
    }

    @aa1
    public final String component2() {
        return this.glicemiaUserId;
    }

    public final int component3() {
        return this.age;
    }

    @aa1
    public final BGEMGender component4() {
        return this.gender;
    }

    public final int component5() {
        return this.weight;
    }

    public final int component6() {
        return this.height;
    }

    @aa1
    public final String component7() {
        return this.device_id;
    }

    public final boolean component8() {
        return this.family_history;
    }

    public final boolean component9() {
        return this.high_cholesterol;
    }

    @aa1
    public final BGEMUser copy(@aa1 String r12, @aa1 String r13, int r14, @aa1 BGEMGender r15, int r16, int r17, @aa1 String r18, boolean r19, boolean r20) {
        Intrinsics.X0O(r12, "appUserId");
        Intrinsics.X0O(r13, "glicemiaUserId");
        Intrinsics.X0O(r15, "gender");
        Intrinsics.X0O(r18, "device_id");
        return new BGEMUser(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BGEMUser) == true) goto L8;
        return false;
    L8:
        BGEMUser r6 = (BGEMUser) r5;
        if (Intrinsics.XOO0ii0(this.appUserId, r6.appUserId) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.glicemiaUserId, r6.glicemiaUserId) == true) goto L15;
        return false;
    L15:
        if (this.age == r6.age) goto L18;
        return false;
    L18:
        if (this.gender == r6.gender) goto L21;
        return false;
    L21:
        if (this.weight == r6.weight) goto L24;
        return false;
    L24:
        if (this.height == r6.height) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.device_id, r6.device_id) == true) goto L30;
        return false;
    L30:
        if (this.family_history == r6.family_history) goto L33;
        return false;
    L33:
        if (this.high_cholesterol == r6.high_cholesterol) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getAge() {
        return this.age;
    }

    @aa1
    public final String getAppUserId() {
        return this.appUserId;
    }

    @aa1
    public final String getDevice_id() {
        return this.device_id;
    }

    public final boolean getFamily_history() {
        return this.family_history;
    }

    @aa1
    public final BGEMGender getGender() {
        return this.gender;
    }

    @aa1
    public final String getGlicemiaUserId() {
        return this.glicemiaUserId;
    }

    public final int getHeight() {
        return this.height;
    }

    public final boolean getHigh_cholesterol() {
        return this.high_cholesterol;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((((((((((this.appUserId.hashCode() * 31) + this.glicemiaUserId.hashCode()) * 31) + Integer.hashCode(this.age)) * 31) + this.gender.hashCode()) * 31) + Integer.hashCode(this.weight)) * 31) + Integer.hashCode(this.height)) * 31) + this.device_id.hashCode()) * 31) + Boolean.hashCode(this.family_history)) * 31) + Boolean.hashCode(this.high_cholesterol);
    }

    public final void setAge(int r1) {
        this.age = r1;
    }

    public final void setAppUserId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.appUserId = r2;
    }

    public final void setDevice_id(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.device_id = r2;
    }

    public final void setFamily_history(boolean r1) {
        this.family_history = r1;
    }

    public final void setGender(@aa1 BGEMGender r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.gender = r2;
    }

    public final void setGlicemiaUserId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.glicemiaUserId = r2;
    }

    public final void setHeight(int r1) {
        this.height = r1;
    }

    public final void setHigh_cholesterol(boolean r1) {
        this.high_cholesterol = r1;
    }

    public final void setWeight(int r1) {
        this.weight = r1;
    }

    @aa1
    public String toString() {
        return "BGEMUser(appUserId=" + this.appUserId + ", glicemiaUserId=" + this.glicemiaUserId + ", age=" + this.age + ", gender=" + this.gender + ", weight=" + this.weight + ", height=" + this.height + ", device_id=" + this.device_id + ", family_history=" + this.family_history + ", high_cholesterol=" + this.high_cholesterol + I000IiI1O.iO.iO;
    }

    public BGEMUser(@aa1 String r2, @aa1 String r3, int r4, @aa1 BGEMGender r5, int r6, int r7, @aa1 String r8, boolean r9, boolean r10) {
        Intrinsics.X0O(r2, "appUserId");
        Intrinsics.X0O(r3, "glicemiaUserId");
        Intrinsics.X0O(r5, "gender");
        Intrinsics.X0O(r8, "device_id");
        this.appUserId = r2;
        this.glicemiaUserId = r3;
        this.age = r4;
        this.gender = r5;
        this.weight = r6;
        this.height = r7;
        this.device_id = r8;
        this.family_history = r9;
        this.high_cholesterol = r10;
    }

    public /* synthetic */ BGEMUser(String r3, String r4, int r5, BGEMGender r6, int r7, int r8, String r9, boolean r10, boolean r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = BGEMGender.M;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = false;
    L27:
        if ((r12 & 256) == 0) goto L30;
        boolean r14 = false;
    L29:
        boolean r15 = r10;
        String r16 = r9;
        int r17 = r8;
        int r18 = r7;
        BGEMGender r19 = r6;
        int r20 = r5;
        this(r3, r4, r20, r19, r18, r17, r16, r15, r14);
        return;
    L30:
        r14 = r11;
        goto L29
    }
}
