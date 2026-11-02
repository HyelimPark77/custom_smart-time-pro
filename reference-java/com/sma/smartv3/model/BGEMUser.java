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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        /* JADX INFO: renamed from: of */
        public final BGEMUser m38251of(@aa1 AppUser appUser) {
            Intrinsics.X0O(appUser, "appUser");
            return new BGEMUser(null, null, WeightMeasureDataKt.getAgeByBirth(appUser.getBirthday()), appUser.getGender() == 1 ? BGEMGender.M : BGEMGender.F, (int) appUser.getWeight(), (int) appUser.getHeight(), null, a01.OXO1.IiI10X().getBoolean(b01.I11X11OX, false), false, 67, null);
        }

        private Companion() {
        }
    }

    public BGEMUser() {
        this(null, null, 0, null, 0, 0, null, false, false, 511, null);
    }

    public static /* synthetic */ BGEMUser copy$default(BGEMUser bGEMUser, String str, String str2, int i, BGEMGender bGEMGender, int i2, int i3, String str3, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = bGEMUser.appUserId;
        }
        if ((i4 & 2) != 0) {
            str2 = bGEMUser.glicemiaUserId;
        }
        if ((i4 & 4) != 0) {
            i = bGEMUser.age;
        }
        if ((i4 & 8) != 0) {
            bGEMGender = bGEMUser.gender;
        }
        if ((i4 & 16) != 0) {
            i2 = bGEMUser.weight;
        }
        if ((i4 & 32) != 0) {
            i3 = bGEMUser.height;
        }
        if ((i4 & 64) != 0) {
            str3 = bGEMUser.device_id;
        }
        if ((i4 & 128) != 0) {
            z = bGEMUser.family_history;
        }
        if ((i4 & 256) != 0) {
            z2 = bGEMUser.high_cholesterol;
        }
        boolean z3 = z;
        boolean z4 = z2;
        int i5 = i3;
        String str4 = str3;
        int i6 = i2;
        int i7 = i;
        return bGEMUser.copy(str, str2, i7, bGEMGender, i6, i5, str4, z3, z4);
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
    public final BGEMUser copy(@aa1 String appUserId, @aa1 String glicemiaUserId, int i, @aa1 BGEMGender gender, int i2, int i3, @aa1 String device_id, boolean z, boolean z2) {
        Intrinsics.X0O(appUserId, "appUserId");
        Intrinsics.X0O(glicemiaUserId, "glicemiaUserId");
        Intrinsics.X0O(gender, "gender");
        Intrinsics.X0O(device_id, "device_id");
        return new BGEMUser(appUserId, glicemiaUserId, i, gender, i2, i3, device_id, z, z2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BGEMUser)) {
            return false;
        }
        BGEMUser bGEMUser = (BGEMUser) obj;
        return Intrinsics.XOO0ii0(this.appUserId, bGEMUser.appUserId) && Intrinsics.XOO0ii0(this.glicemiaUserId, bGEMUser.glicemiaUserId) && this.age == bGEMUser.age && this.gender == bGEMUser.gender && this.weight == bGEMUser.weight && this.height == bGEMUser.height && Intrinsics.XOO0ii0(this.device_id, bGEMUser.device_id) && this.family_history == bGEMUser.family_history && this.high_cholesterol == bGEMUser.high_cholesterol;
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

    public final void setAge(int i) {
        this.age = i;
    }

    public final void setAppUserId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.appUserId = str;
    }

    public final void setDevice_id(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.device_id = str;
    }

    public final void setFamily_history(boolean z) {
        this.family_history = z;
    }

    public final void setGender(@aa1 BGEMGender bGEMGender) {
        Intrinsics.X0O(bGEMGender, "<set-?>");
        this.gender = bGEMGender;
    }

    public final void setGlicemiaUserId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.glicemiaUserId = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setHigh_cholesterol(boolean z) {
        this.high_cholesterol = z;
    }

    public final void setWeight(int i) {
        this.weight = i;
    }

    @aa1
    public String toString() {
        return "BGEMUser(appUserId=" + this.appUserId + ", glicemiaUserId=" + this.glicemiaUserId + ", age=" + this.age + ", gender=" + this.gender + ", weight=" + this.weight + ", height=" + this.height + ", device_id=" + this.device_id + ", family_history=" + this.family_history + ", high_cholesterol=" + this.high_cholesterol + I000IiI1O.C2156iO.f1007iO;
    }

    public BGEMUser(@aa1 String appUserId, @aa1 String glicemiaUserId, int i, @aa1 BGEMGender gender, int i2, int i3, @aa1 String device_id, boolean z, boolean z2) {
        Intrinsics.X0O(appUserId, "appUserId");
        Intrinsics.X0O(glicemiaUserId, "glicemiaUserId");
        Intrinsics.X0O(gender, "gender");
        Intrinsics.X0O(device_id, "device_id");
        this.appUserId = appUserId;
        this.glicemiaUserId = glicemiaUserId;
        this.age = i;
        this.gender = gender;
        this.weight = i2;
        this.height = i3;
        this.device_id = device_id;
        this.family_history = z;
        this.high_cholesterol = z2;
    }

    public /* synthetic */ BGEMUser(String str, String str2, int i, BGEMGender bGEMGender, int i2, int i3, String str3, boolean z, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? BGEMGender.M : bGEMGender, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? false : z2);
    }
}
