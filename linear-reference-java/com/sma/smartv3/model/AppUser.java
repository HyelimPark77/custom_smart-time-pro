package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SPUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.sma.smartv3.network.SetReceivePhone;
import com.szabh.smable3.entity.BleUserProfile;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAppUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUser.kt\ncom/sma/smartv3/model/AppUser\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,107:1\n11#2,2:108\n*S KotlinDebug\n*F\n+ 1 AppUser.kt\ncom/sma/smartv3/model/AppUser\n*L\n42#1:108,2\n*E\n"})
public final class AppUser extends JsonFieldContainer {

    @aa1
    public static final Companion Companion = null;

    @aa1
    private String avatarUrl;

    @aa1
    private String birthday;

    @aa1
    private String city;

    @aa1
    private String country;

    @aa1
    private String dbUrl;

    @aa1
    private String email;

    @aa1
    private String extraInfo;
    private int gender;
    private float height;

    @aa1
    private String identity;
    private float latitude;
    private float longitude;

    @aa1
    private String nickname;

    @aa1
    private String osVersion;
    private boolean passwordStatus;

    @aa1
    private String phone;

    @aa1
    private String phoneIdentity;

    @aa1
    private String phoneModel;
    private int phoneOs;
    private int projectId;

    @aa1
    private String receivePhone;
    private int server;

    @aa1
    private String settings;

    @tb1
    private ThirdPlatform thirdPlatform;

    @aa1
    private String token;
    private int unit;
    private float weight;

    @SourceDebugExtension({"SMAP\nAppUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUser.kt\ncom/sma/smartv3/model/AppUser$Companion\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,107:1\n19#2:108\n15#2:109\n*S KotlinDebug\n*F\n+ 1 AppUser.kt\ncom/sma/smartv3/model/AppUser$Companion\n*L\n47#1:108\n47#1:109\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final AppUser getAppUser() {
            SPUtils r0 = a01.OXO1.IiI10X();
            int r2 = 0;
            String r3 = null;
            String r4 = null;
            String r5 = null;
            String r6 = null;
            String r7 = null;
            String r8 = null;
            int r9 = 0;
            int r10 = 0;
            float r11 = 0.0f;
            float r12 = 0.0f;
            String r13 = null;
            String r14 = null;
            String r15 = null;
            String r16 = null;
            String r17 = null;
            String r18 = null;
            float r19 = 0.0f;
            float r20 = 0.0f;
            int r21 = 0;
            int r22 = 0;
            String r23 = null;
            String r24 = null;
            String r25 = null;
            String r26 = null;
            ThirdPlatform r27 = null;
            boolean r28 = false;
            Object r1 = new AppUser(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, 134217727, null);
            Object r29 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
            if (r29 == null) goto L7;
            r1 = r29;
        L7:
            return (AppUser) r1;
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AppUser() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        int r8 = 0;
        int r9 = 0;
        float r10 = 0.0f;
        float r11 = 0.0f;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        float r18 = 0.0f;
        float r19 = 0.0f;
        int r20 = 0;
        int r21 = 0;
        String r22 = null;
        String r23 = null;
        String r24 = null;
        String r25 = null;
        ThirdPlatform r26 = null;
        boolean r27 = false;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, 134217727, null);
    }

    public static /* synthetic */ AppUser copy$default(AppUser r17, int r18, String r19, String r20, String r21, String r22, String r23, String r24, int r25, int r26, float r27, float r28, String r29, String r30, String r31, String r32, String r33, String r34, float r35, float r36, int r37, int r38, String r39, String r40, String r41, String r42, ThirdPlatform r43, boolean r44, int r45, Object r46) {
        if ((r45 & 1) == 0) goto L5;
        int r2 = r17.projectId;
    L7:
        if ((r45 & 2) == 0) goto L9;
        String r3 = r17.phone;
    L11:
        if ((r45 & 4) == 0) goto L13;
        String r4 = r17.email;
    L15:
        if ((r45 & 8) == 0) goto L17;
        String r5 = r17.receivePhone;
    L19:
        if ((r45 & 16) == 0) goto L21;
        String r6 = r17.nickname;
    L23:
        if ((r45 & 32) == 0) goto L25;
        String r7 = r17.avatarUrl;
    L27:
        if ((r45 & 64) == 0) goto L29;
        String r8 = r17.birthday;
    L31:
        if ((r45 & 128) == 0) goto L33;
        int r9 = r17.gender;
    L35:
        if ((r45 & 256) == 0) goto L37;
        int r10 = r17.unit;
    L39:
        if ((r45 & 512) == 0) goto L41;
        float r11 = r17.height;
    L43:
        if ((r45 & 1024) == 0) goto L45;
        float r12 = r17.weight;
    L47:
        if ((r45 & 2048) == 0) goto L49;
        String r13 = r17.identity;
    L51:
        if ((r45 & 4096) == 0) goto L53;
        String r14 = r17.token;
    L55:
        if ((r45 & 8192) == 0) goto L57;
        String r15 = r17.extraInfo;
    L58:
        int r110 = r2;
        if ((r45 & 16384) == 0) goto L61;
        String r16 = r17.dbUrl;
    L63:
        if ((r45 & 32768) == 0) goto L65;
        String r1 = r17.country;
    L66:
        String r111 = r1;
        if ((r45 & 65536) == 0) goto L69;
        String r47 = r17.city;
    L70:
        String r210 = r47;
        if ((r45 & 131072) == 0) goto L73;
        float r48 = r17.longitude;
    L74:
        float r211 = r48;
        if ((r45 & 262144) == 0) goto L77;
        float r49 = r17.latitude;
    L78:
        float r212 = r49;
        if ((r45 & 524288) == 0) goto L81;
        int r50 = r17.server;
    L82:
        int r213 = r50;
        if ((r45 & 1048576) == 0) goto L85;
        int r51 = r17.phoneOs;
    L86:
        int r214 = r51;
        if ((r45 & 2097152) == 0) goto L89;
        String r52 = r17.osVersion;
    L90:
        String r215 = r52;
        if ((r45 & 4194304) == 0) goto L93;
        String r53 = r17.phoneModel;
    L94:
        String r216 = r53;
        if ((r45 & 8388608) == 0) goto L97;
        String r54 = r17.phoneIdentity;
    L98:
        String r217 = r54;
        if ((r45 & 16777216) == 0) goto L101;
        String r55 = r17.settings;
    L102:
        String r218 = r55;
        if ((r45 & 33554432) == 0) goto L105;
        ThirdPlatform r56 = r17.thirdPlatform;
    L107:
        if ((r45 & 67108864) == 0) goto L110;
        ThirdPlatform r219 = r56;
        ThirdPlatform r410 = r219;
        boolean r411 = r17.passwordStatus;
    L112:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r211, r212, r213, r214, r215, r216, r217, r218, r410, r411);
    L110:
        r411 = r44;
        r410 = r56;
        goto L112
    L105:
        r56 = r43;
        goto L107
    L101:
        r55 = r42;
        goto L102
    L97:
        r54 = r41;
        goto L98
    L93:
        r53 = r40;
        goto L94
    L89:
        r52 = r39;
        goto L90
    L85:
        r51 = r38;
        goto L86
    L81:
        r50 = r37;
        goto L82
    L77:
        r49 = r36;
        goto L78
    L73:
        r48 = r35;
        goto L74
    L69:
        r47 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final int component1() {
        return this.projectId;
    }

    public final float component10() {
        return this.height;
    }

    public final float component11() {
        return this.weight;
    }

    @aa1
    public final String component12() {
        return this.identity;
    }

    @aa1
    public final String component13() {
        return this.token;
    }

    @aa1
    public final String component14() {
        return this.extraInfo;
    }

    @aa1
    public final String component15() {
        return this.dbUrl;
    }

    @aa1
    public final String component16() {
        return this.country;
    }

    @aa1
    public final String component17() {
        return this.city;
    }

    public final float component18() {
        return this.longitude;
    }

    public final float component19() {
        return this.latitude;
    }

    @aa1
    public final String component2() {
        return this.phone;
    }

    public final int component20() {
        return this.server;
    }

    public final int component21() {
        return this.phoneOs;
    }

    @aa1
    public final String component22() {
        return this.osVersion;
    }

    @aa1
    public final String component23() {
        return this.phoneModel;
    }

    @aa1
    public final String component24() {
        return this.phoneIdentity;
    }

    @aa1
    public final String component25() {
        return this.settings;
    }

    @tb1
    public final ThirdPlatform component26() {
        return this.thirdPlatform;
    }

    public final boolean component27() {
        return this.passwordStatus;
    }

    @aa1
    public final String component3() {
        return this.email;
    }

    @aa1
    public final String component4() {
        return this.receivePhone;
    }

    @aa1
    public final String component5() {
        return this.nickname;
    }

    @aa1
    public final String component6() {
        return this.avatarUrl;
    }

    @aa1
    public final String component7() {
        return this.birthday;
    }

    public final int component8() {
        return this.gender;
    }

    public final int component9() {
        return this.unit;
    }

    @aa1
    public final AppUser copy(int r30, @aa1 String r31, @aa1 String r32, @aa1 String r33, @aa1 String r34, @aa1 String r35, @aa1 String r36, int r37, int r38, float r39, float r40, @aa1 String r41, @aa1 String r42, @aa1 String r43, @aa1 String r44, @aa1 String r45, @aa1 String r46, float r47, float r48, int r49, int r50, @aa1 String r51, @aa1 String r52, @aa1 String r53, @aa1 String r54, @tb1 ThirdPlatform r55, boolean r56) {
        Intrinsics.X0O(r31, "phone");
        Intrinsics.X0O(r32, "email");
        Intrinsics.X0O(r33, SetReceivePhone.RECEIVE_PHONE);
        Intrinsics.X0O(r34, "nickname");
        Intrinsics.X0O(r35, "avatarUrl");
        Intrinsics.X0O(r36, "birthday");
        Intrinsics.X0O(r41, "identity");
        Intrinsics.X0O(r42, "token");
        Intrinsics.X0O(r43, "extraInfo");
        Intrinsics.X0O(r44, "dbUrl");
        Intrinsics.X0O(r45, "country");
        Intrinsics.X0O(r46, "city");
        Intrinsics.X0O(r51, "osVersion");
        Intrinsics.X0O(r52, "phoneModel");
        Intrinsics.X0O(r53, "phoneIdentity");
        Intrinsics.X0O(r54, "settings");
        return new AppUser(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AppUser) == true) goto L8;
        return false;
    L8:
        AppUser r6 = (AppUser) r5;
        if (this.projectId == r6.projectId) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.phone, r6.phone) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.email, r6.email) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.receivePhone, r6.receivePhone) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.nickname, r6.nickname) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.avatarUrl, r6.avatarUrl) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.birthday, r6.birthday) == true) goto L30;
        return false;
    L30:
        if (this.gender == r6.gender) goto L33;
        return false;
    L33:
        if (this.unit == r6.unit) goto L36;
        return false;
    L36:
        if (Float.compare(this.height, r6.height) == 0) goto L39;
        return false;
    L39:
        if (Float.compare(this.weight, r6.weight) == 0) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.identity, r6.identity) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.token, r6.token) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.extraInfo, r6.extraInfo) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.dbUrl, r6.dbUrl) == true) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.country, r6.country) == true) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.city, r6.city) == true) goto L60;
        return false;
    L60:
        if (Float.compare(this.longitude, r6.longitude) == 0) goto L63;
        return false;
    L63:
        if (Float.compare(this.latitude, r6.latitude) == 0) goto L66;
        return false;
    L66:
        if (this.server == r6.server) goto L69;
        return false;
    L69:
        if (this.phoneOs == r6.phoneOs) goto L72;
        return false;
    L72:
        if (Intrinsics.XOO0ii0(this.osVersion, r6.osVersion) == true) goto L75;
        return false;
    L75:
        if (Intrinsics.XOO0ii0(this.phoneModel, r6.phoneModel) == true) goto L78;
        return false;
    L78:
        if (Intrinsics.XOO0ii0(this.phoneIdentity, r6.phoneIdentity) == true) goto L81;
        return false;
    L81:
        if (Intrinsics.XOO0ii0(this.settings, r6.settings) == true) goto L84;
        return false;
    L84:
        if (Intrinsics.XOO0ii0(this.thirdPlatform, r6.thirdPlatform) == true) goto L87;
        return false;
    L87:
        if (this.passwordStatus == r6.passwordStatus) goto L89;
        return false;
    L89:
        return true;
    }

    @aa1
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @aa1
    public final String getBirthday() {
        return this.birthday;
    }

    @aa1
    public final BleUserProfile getBleUserProfile() {
        int r1 = this.unit;
        int r2 = this.gender;
        float r4 = this.height;
        float r5 = this.weight;
        int r6 = 0;
        return new BleUserProfile(r1, r2, O0X11OiO.OXO1(this.birthday), r4, r5, r6, 32, null);
    }

    @aa1
    public final String getCity() {
        return this.city;
    }

    @aa1
    public final String getCountry() {
        return this.country;
    }

    @aa1
    public final String getDbUrl() {
        return this.dbUrl;
    }

    @aa1
    public final String getEmail() {
        return this.email;
    }

    @aa1
    public final String getExtraInfo() {
        return this.extraInfo;
    }

    public final int getGender() {
        return this.gender;
    }

    public final float getHeight() {
        return this.height;
    }

    @aa1
    public final String getIdentity() {
        return this.identity;
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }

    @aa1
    public final String getNickname() {
        return this.nickname;
    }

    @aa1
    public final String getOsVersion() {
        return this.osVersion;
    }

    public final boolean getPasswordStatus() {
        return this.passwordStatus;
    }

    @aa1
    public final String getPhone() {
        return this.phone;
    }

    @aa1
    public final String getPhoneIdentity() {
        return this.phoneIdentity;
    }

    @aa1
    public final String getPhoneModel() {
        return this.phoneModel;
    }

    public final int getPhoneOs() {
        return this.phoneOs;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    @aa1
    public final String getReceivePhone() {
        return this.receivePhone;
    }

    public final int getServer() {
        return this.server;
    }

    @aa1
    public final String getSettings() {
        return this.settings;
    }

    @tb1
    public final ThirdPlatform getThirdPlatform() {
        return this.thirdPlatform;
    }

    @aa1
    public final String getToken() {
        return this.token;
    }

    public final int getUnit() {
        return this.unit;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int r0 = ((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.projectId) * 31) + this.phone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.receivePhone.hashCode()) * 31) + this.nickname.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.birthday.hashCode()) * 31) + Integer.hashCode(this.gender)) * 31) + Integer.hashCode(this.unit)) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.weight)) * 31) + this.identity.hashCode()) * 31) + this.token.hashCode()) * 31) + this.extraInfo.hashCode()) * 31) + this.dbUrl.hashCode()) * 31) + this.country.hashCode()) * 31) + this.city.hashCode()) * 31) + Float.hashCode(this.longitude)) * 31) + Float.hashCode(this.latitude)) * 31) + Integer.hashCode(this.server)) * 31) + Integer.hashCode(this.phoneOs)) * 31) + this.osVersion.hashCode()) * 31) + this.phoneModel.hashCode()) * 31) + this.phoneIdentity.hashCode()) * 31) + this.settings.hashCode()) * 31;
        ThirdPlatform r1 = this.thirdPlatform;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return ((r0 + r2) * 31) + Boolean.hashCode(this.passwordStatus);
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final boolean isLogin() {
        if (a01.OXO1.IiI10X().getBoolean(b01.O001I, true) == true) goto L5;
        return false;
    L5:
        if (this.identity.length() <= 0) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean isThirdPlatform() {
        if (this.thirdPlatform == null) goto L6;
        return true;
    L6:
        return false;
    }

    @aa1
    public final String noAreaCodePhone() {
        String r0 = this.phone;
        List r1 = StringsKt__StringsKt.i1I(r0, new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, null);
        if (r1.size() == 2) goto L5;
        return r0;
    L5:
        return (String) r1.get(1);
    }

    public final void saveUser2Sp() {
        a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(this));
    }

    public final void setAvatarUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.avatarUrl = r2;
    }

    public final void setBirthday(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.birthday = r2;
    }

    public final void setCity(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.city = r2;
    }

    public final void setCountry(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.country = r2;
    }

    public final void setDbUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dbUrl = r2;
    }

    public final void setEmail(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.email = r2;
    }

    public final void setExtraInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.extraInfo = r2;
    }

    public final void setGender(int r1) {
        this.gender = r1;
    }

    public final void setHeight(float r1) {
        this.height = r1;
    }

    public final void setIdentity(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.identity = r2;
    }

    public final void setLatitude(float r1) {
        this.latitude = r1;
    }

    public final void setLongitude(float r1) {
        this.longitude = r1;
    }

    public final void setNickname(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.nickname = r2;
    }

    public final void setOsVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.osVersion = r2;
    }

    public final void setPasswordStatus(boolean r1) {
        this.passwordStatus = r1;
    }

    public final void setPhone(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.phone = r2;
    }

    public final void setPhoneIdentity(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.phoneIdentity = r2;
    }

    public final void setPhoneModel(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.phoneModel = r2;
    }

    public final void setPhoneOs(int r1) {
        this.phoneOs = r1;
    }

    public final void setProjectId(int r1) {
        this.projectId = r1;
    }

    public final void setReceivePhone(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.receivePhone = r2;
    }

    public final void setServer(int r1) {
        this.server = r1;
    }

    public final void setSettings(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.settings = r2;
    }

    public final void setThirdPlatform(@tb1 ThirdPlatform r1) {
        this.thirdPlatform = r1;
    }

    public final void setToken(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.token = r2;
    }

    public final void setUnit(int r1) {
        this.unit = r1;
    }

    public final void setWeight(float r1) {
        this.weight = r1;
    }

    @aa1
    public String toString() {
        return "AppUser(projectId=" + this.projectId + ", phone=" + this.phone + ", email=" + this.email + ", receivePhone=" + this.receivePhone + ", nickname=" + this.nickname + ", avatarUrl=" + this.avatarUrl + ", birthday=" + this.birthday + ", gender=" + this.gender + ", unit=" + this.unit + ", height=" + this.height + ", weight=" + this.weight + ", identity=" + this.identity + ", token=" + this.token + ", extraInfo=" + this.extraInfo + ", dbUrl=" + this.dbUrl + ", country=" + this.country + ", city=" + this.city + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", server=" + this.server + ", phoneOs=" + this.phoneOs + ", osVersion=" + this.osVersion + ", phoneModel=" + this.phoneModel + ", phoneIdentity=" + this.phoneIdentity + ", settings=" + this.settings + ", thirdPlatform=" + this.thirdPlatform + ", passwordStatus=" + this.passwordStatus + I000IiI1O.iO.iO;
    }

    public AppUser(int r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, int r24, int r25, float r26, float r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, @aa1 String r31, @aa1 String r32, @aa1 String r33, float r34, float r35, int r36, int r37, @aa1 String r38, @aa1 String r39, @aa1 String r40, @aa1 String r41, @tb1 ThirdPlatform r42, boolean r43) {
        Intrinsics.X0O(r18, "phone");
        Intrinsics.X0O(r19, "email");
        Intrinsics.X0O(r20, SetReceivePhone.RECEIVE_PHONE);
        Intrinsics.X0O(r21, "nickname");
        Intrinsics.X0O(r22, "avatarUrl");
        Intrinsics.X0O(r23, "birthday");
        Intrinsics.X0O(r28, "identity");
        Intrinsics.X0O(r29, "token");
        Intrinsics.X0O(r30, "extraInfo");
        Intrinsics.X0O(r31, "dbUrl");
        Intrinsics.X0O(r32, "country");
        Intrinsics.X0O(r33, "city");
        Intrinsics.X0O(r38, "osVersion");
        Intrinsics.X0O(r39, "phoneModel");
        Intrinsics.X0O(r40, "phoneIdentity");
        Intrinsics.X0O(r41, "settings");
        this.projectId = r17;
        this.phone = r18;
        this.email = r19;
        this.receivePhone = r20;
        this.nickname = r21;
        this.avatarUrl = r22;
        this.birthday = r23;
        this.gender = r24;
        this.unit = r25;
        this.height = r26;
        this.weight = r27;
        this.identity = r28;
        this.token = r29;
        this.extraInfo = r30;
        this.dbUrl = r31;
        this.country = r32;
        this.city = r33;
        this.longitude = r34;
        this.latitude = r35;
        this.server = r36;
        this.phoneOs = r37;
        this.osVersion = r38;
        this.phoneModel = r39;
        this.phoneIdentity = r40;
        this.settings = r41;
        this.thirdPlatform = r42;
        this.passwordStatus = r43;
    }

    public /* synthetic */ AppUser(int r29, String r30, String r31, String r32, String r33, String r34, String r35, int r36, int r37, float r38, float r39, String r40, String r41, String r42, String r43, String r44, String r45, float r46, float r47, int r48, int r49, String r50, String r51, String r52, String r53, ThirdPlatform r54, boolean r55, int r56, DefaultConstructorMarker r57) {
        if ((r56 & 1) == 0) goto L5;
        int r1 = 0;
    L6:
        String r4 = "";
        if ((r56 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r56 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r56 & 8) == 0) goto L17;
        String r6 = "";
    L19:
        if ((r56 & 16) == 0) goto L21;
        String r7 = "";
    L23:
        if ((r56 & 32) == 0) goto L25;
        String r8 = "";
    L27:
        if ((r56 & 64) == 0) goto L29;
        String r9 = "01/01/2000";
    L31:
        if ((r56 & 128) == 0) goto L33;
        int r10 = 0;
    L35:
        if ((r56 & 256) == 0) goto L37;
        int r11 = !i72.OXO1.iOIIiI1() ? 1 : 0;
    L39:
        if ((r56 & 512) == 0) goto L41;
        float r12 = 0.0f;
    L43:
        if ((r56 & 1024) == 0) goto L45;
        float r14 = 0.0f;
    L47:
        if ((r56 & 2048) == 0) goto L49;
        String r15 = "";
    L51:
        if ((r56 & 4096) == 0) goto L53;
        String r2 = "";
    L55:
        if ((r56 & 8192) == 0) goto L57;
        String r13 = "";
    L58:
        int r16 = r1;
        if ((r56 & 16384) == 0) goto L61;
        String r17 = "";
    L63:
        if ((r56 & 32768) == 0) goto L65;
        String r18 = "";
    L67:
        if ((r56 & 65536) == 0) goto L69;
        String r19 = "";
    L71:
        if ((r56 & 131072) == 0) goto L73;
        float r110 = 0.0f;
    L75:
        if ((r56 & 262144) == 0) goto L77;
        float r20 = 0.0f;
    L79:
        if ((r56 & 524288) == 0) goto L81;
        int r21 = 0;
    L83:
        if ((r56 & 1048576) == 0) goto L85;
        int r22 = 0;
    L87:
        if ((r56 & 2097152) == 0) goto L89;
        String r23 = "";
    L91:
        if ((r56 & 4194304) == 0) goto L93;
        String r24 = "";
    L95:
        if ((r56 & 8388608) == 0) goto L97;
        String r25 = "";
    L99:
        if ((r56 & 16777216) != 0) goto L103;
        r4 = r53;
    L103:
        if ((r56 & 33554432) == 0) goto L105;
        ThirdPlatform r26 = null;
    L107:
        if ((r56 & 67108864) == 0) goto L110;
        boolean r58 = false;
    L111:
        this(r16, r3, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r2, r13, r17, r18, r19, r110, r20, r21, r22, r23, r24, r25, r4, r26, r58);
        return;
    L110:
        r58 = r55;
        goto L111
    L105:
        r26 = r54;
        goto L107
    L97:
        r25 = r52;
        goto L99
    L93:
        r24 = r51;
        goto L95
    L89:
        r23 = r50;
        goto L91
    L85:
        r22 = r49;
        goto L87
    L81:
        r21 = r48;
        goto L83
    L77:
        r20 = r47;
        goto L79
    L73:
        r110 = r46;
        goto L75
    L69:
        r19 = r45;
        goto L71
    L65:
        r18 = r44;
        goto L67
    L61:
        r17 = r43;
        goto L63
    L57:
        r13 = r42;
        goto L58
    L53:
        r2 = r41;
        goto L55
    L49:
        r15 = r40;
        goto L51
    L45:
        r14 = r39;
        goto L47
    L41:
        r12 = r38;
        goto L43
    L37:
        r11 = r37;
        goto L39
    L33:
        r10 = r36;
        goto L35
    L29:
        r9 = r35;
        goto L31
    L25:
        r8 = r34;
        goto L27
    L21:
        r7 = r33;
        goto L23
    L17:
        r6 = r32;
        goto L19
    L13:
        r5 = r31;
        goto L15
    L9:
        r3 = r30;
        goto L11
    L5:
        r1 = r29;
        goto L6
    }
}
