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
    public static final Companion Companion = new Companion(null);

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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final AppUser getAppUser() {
            SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
            Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
            if (objFromJson != null) {
                appUser = objFromJson;
            }
            return (AppUser) appUser;
        }

        private Companion() {
        }
    }

    public AppUser() {
        this(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
    }

    public static /* synthetic */ AppUser copy$default(AppUser appUser, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, float f, float f2, String str7, String str8, String str9, String str10, String str11, String str12, float f3, float f4, int i4, int i5, String str13, String str14, String str15, String str16, ThirdPlatform thirdPlatform, boolean z, int i6, Object obj) {
        boolean z2;
        ThirdPlatform thirdPlatform2;
        int i7 = (i6 & 1) != 0 ? appUser.projectId : i;
        String str17 = (i6 & 2) != 0 ? appUser.phone : str;
        String str18 = (i6 & 4) != 0 ? appUser.email : str2;
        String str19 = (i6 & 8) != 0 ? appUser.receivePhone : str3;
        String str20 = (i6 & 16) != 0 ? appUser.nickname : str4;
        String str21 = (i6 & 32) != 0 ? appUser.avatarUrl : str5;
        String str22 = (i6 & 64) != 0 ? appUser.birthday : str6;
        int i8 = (i6 & 128) != 0 ? appUser.gender : i2;
        int i9 = (i6 & 256) != 0 ? appUser.unit : i3;
        float f5 = (i6 & 512) != 0 ? appUser.height : f;
        float f6 = (i6 & 1024) != 0 ? appUser.weight : f2;
        String str23 = (i6 & 2048) != 0 ? appUser.identity : str7;
        String str24 = (i6 & 4096) != 0 ? appUser.token : str8;
        String str25 = (i6 & 8192) != 0 ? appUser.extraInfo : str9;
        int i10 = i7;
        String str26 = (i6 & 16384) != 0 ? appUser.dbUrl : str10;
        String str27 = (i6 & 32768) != 0 ? appUser.country : str11;
        String str28 = (i6 & 65536) != 0 ? appUser.city : str12;
        float f7 = (i6 & 131072) != 0 ? appUser.longitude : f3;
        float f8 = (i6 & 262144) != 0 ? appUser.latitude : f4;
        int i11 = (i6 & 524288) != 0 ? appUser.server : i4;
        int i12 = (i6 & 1048576) != 0 ? appUser.phoneOs : i5;
        String str29 = (i6 & 2097152) != 0 ? appUser.osVersion : str13;
        String str30 = (i6 & 4194304) != 0 ? appUser.phoneModel : str14;
        String str31 = (i6 & 8388608) != 0 ? appUser.phoneIdentity : str15;
        String str32 = (i6 & 16777216) != 0 ? appUser.settings : str16;
        ThirdPlatform thirdPlatform3 = (i6 & 33554432) != 0 ? appUser.thirdPlatform : thirdPlatform;
        if ((i6 & 67108864) != 0) {
            thirdPlatform2 = thirdPlatform3;
            z2 = appUser.passwordStatus;
        } else {
            z2 = z;
            thirdPlatform2 = thirdPlatform3;
        }
        return appUser.copy(i10, str17, str18, str19, str20, str21, str22, i8, i9, f5, f6, str23, str24, str25, str26, str27, str28, f7, f8, i11, i12, str29, str30, str31, str32, thirdPlatform2, z2);
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
    public final AppUser copy(int i, @aa1 String phone, @aa1 String email, @aa1 String receivePhone, @aa1 String nickname, @aa1 String avatarUrl, @aa1 String birthday, int i2, int i3, float f, float f2, @aa1 String identity, @aa1 String token, @aa1 String extraInfo, @aa1 String dbUrl, @aa1 String country, @aa1 String city, float f3, float f4, int i4, int i5, @aa1 String osVersion, @aa1 String phoneModel, @aa1 String phoneIdentity, @aa1 String settings, @tb1 ThirdPlatform thirdPlatform, boolean z) {
        Intrinsics.X0O(phone, "phone");
        Intrinsics.X0O(email, "email");
        Intrinsics.X0O(receivePhone, "receivePhone");
        Intrinsics.X0O(nickname, "nickname");
        Intrinsics.X0O(avatarUrl, "avatarUrl");
        Intrinsics.X0O(birthday, "birthday");
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(extraInfo, "extraInfo");
        Intrinsics.X0O(dbUrl, "dbUrl");
        Intrinsics.X0O(country, "country");
        Intrinsics.X0O(city, "city");
        Intrinsics.X0O(osVersion, "osVersion");
        Intrinsics.X0O(phoneModel, "phoneModel");
        Intrinsics.X0O(phoneIdentity, "phoneIdentity");
        Intrinsics.X0O(settings, "settings");
        return new AppUser(i, phone, email, receivePhone, nickname, avatarUrl, birthday, i2, i3, f, f2, identity, token, extraInfo, dbUrl, country, city, f3, f4, i4, i5, osVersion, phoneModel, phoneIdentity, settings, thirdPlatform, z);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppUser)) {
            return false;
        }
        AppUser appUser = (AppUser) obj;
        return this.projectId == appUser.projectId && Intrinsics.XOO0ii0(this.phone, appUser.phone) && Intrinsics.XOO0ii0(this.email, appUser.email) && Intrinsics.XOO0ii0(this.receivePhone, appUser.receivePhone) && Intrinsics.XOO0ii0(this.nickname, appUser.nickname) && Intrinsics.XOO0ii0(this.avatarUrl, appUser.avatarUrl) && Intrinsics.XOO0ii0(this.birthday, appUser.birthday) && this.gender == appUser.gender && this.unit == appUser.unit && Float.compare(this.height, appUser.height) == 0 && Float.compare(this.weight, appUser.weight) == 0 && Intrinsics.XOO0ii0(this.identity, appUser.identity) && Intrinsics.XOO0ii0(this.token, appUser.token) && Intrinsics.XOO0ii0(this.extraInfo, appUser.extraInfo) && Intrinsics.XOO0ii0(this.dbUrl, appUser.dbUrl) && Intrinsics.XOO0ii0(this.country, appUser.country) && Intrinsics.XOO0ii0(this.city, appUser.city) && Float.compare(this.longitude, appUser.longitude) == 0 && Float.compare(this.latitude, appUser.latitude) == 0 && this.server == appUser.server && this.phoneOs == appUser.phoneOs && Intrinsics.XOO0ii0(this.osVersion, appUser.osVersion) && Intrinsics.XOO0ii0(this.phoneModel, appUser.phoneModel) && Intrinsics.XOO0ii0(this.phoneIdentity, appUser.phoneIdentity) && Intrinsics.XOO0ii0(this.settings, appUser.settings) && Intrinsics.XOO0ii0(this.thirdPlatform, appUser.thirdPlatform) && this.passwordStatus == appUser.passwordStatus;
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
        return new BleUserProfile(this.unit, this.gender, O0X11OiO.OXO1(this.birthday), this.height, this.weight, 0, 32, null);
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
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.projectId) * 31) + this.phone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.receivePhone.hashCode()) * 31) + this.nickname.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.birthday.hashCode()) * 31) + Integer.hashCode(this.gender)) * 31) + Integer.hashCode(this.unit)) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.weight)) * 31) + this.identity.hashCode()) * 31) + this.token.hashCode()) * 31) + this.extraInfo.hashCode()) * 31) + this.dbUrl.hashCode()) * 31) + this.country.hashCode()) * 31) + this.city.hashCode()) * 31) + Float.hashCode(this.longitude)) * 31) + Float.hashCode(this.latitude)) * 31) + Integer.hashCode(this.server)) * 31) + Integer.hashCode(this.phoneOs)) * 31) + this.osVersion.hashCode()) * 31) + this.phoneModel.hashCode()) * 31) + this.phoneIdentity.hashCode()) * 31) + this.settings.hashCode()) * 31;
        ThirdPlatform thirdPlatform = this.thirdPlatform;
        return ((iHashCode + (thirdPlatform == null ? 0 : thirdPlatform.hashCode())) * 31) + Boolean.hashCode(this.passwordStatus);
    }

    public final boolean isLogin() {
        return a01.OXO1.IiI10X().getBoolean(b01.O001I, true) && this.identity.length() > 0;
    }

    public final boolean isThirdPlatform() {
        return this.thirdPlatform != null;
    }

    @aa1
    public final String noAreaCodePhone() {
        String str = this.phone;
        List listI1I = StringsKt__StringsKt.i1I(str, new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, null);
        return listI1I.size() == 2 ? (String) listI1I.get(1) : str;
    }

    public final void saveUser2Sp() {
        a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(this));
    }

    public final void setAvatarUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.avatarUrl = str;
    }

    public final void setBirthday(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.birthday = str;
    }

    public final void setCity(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.city = str;
    }

    public final void setCountry(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.country = str;
    }

    public final void setDbUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.dbUrl = str;
    }

    public final void setEmail(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.email = str;
    }

    public final void setExtraInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.extraInfo = str;
    }

    public final void setGender(int i) {
        this.gender = i;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setIdentity(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.identity = str;
    }

    public final void setLatitude(float f) {
        this.latitude = f;
    }

    public final void setLongitude(float f) {
        this.longitude = f;
    }

    public final void setNickname(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.nickname = str;
    }

    public final void setOsVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.osVersion = str;
    }

    public final void setPasswordStatus(boolean z) {
        this.passwordStatus = z;
    }

    public final void setPhone(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.phone = str;
    }

    public final void setPhoneIdentity(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.phoneIdentity = str;
    }

    public final void setPhoneModel(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.phoneModel = str;
    }

    public final void setPhoneOs(int i) {
        this.phoneOs = i;
    }

    public final void setProjectId(int i) {
        this.projectId = i;
    }

    public final void setReceivePhone(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.receivePhone = str;
    }

    public final void setServer(int i) {
        this.server = i;
    }

    public final void setSettings(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.settings = str;
    }

    public final void setThirdPlatform(@tb1 ThirdPlatform thirdPlatform) {
        this.thirdPlatform = thirdPlatform;
    }

    public final void setToken(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.token = str;
    }

    public final void setUnit(int i) {
        this.unit = i;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    @aa1
    public String toString() {
        return "AppUser(projectId=" + this.projectId + ", phone=" + this.phone + ", email=" + this.email + ", receivePhone=" + this.receivePhone + ", nickname=" + this.nickname + ", avatarUrl=" + this.avatarUrl + ", birthday=" + this.birthday + ", gender=" + this.gender + ", unit=" + this.unit + ", height=" + this.height + ", weight=" + this.weight + ", identity=" + this.identity + ", token=" + this.token + ", extraInfo=" + this.extraInfo + ", dbUrl=" + this.dbUrl + ", country=" + this.country + ", city=" + this.city + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", server=" + this.server + ", phoneOs=" + this.phoneOs + ", osVersion=" + this.osVersion + ", phoneModel=" + this.phoneModel + ", phoneIdentity=" + this.phoneIdentity + ", settings=" + this.settings + ", thirdPlatform=" + this.thirdPlatform + ", passwordStatus=" + this.passwordStatus + I000IiI1O.C2156iO.f1007iO;
    }

    public AppUser(int i, @aa1 String phone, @aa1 String email, @aa1 String receivePhone, @aa1 String nickname, @aa1 String avatarUrl, @aa1 String birthday, int i2, int i3, float f, float f2, @aa1 String identity, @aa1 String token, @aa1 String extraInfo, @aa1 String dbUrl, @aa1 String country, @aa1 String city, float f3, float f4, int i4, int i5, @aa1 String osVersion, @aa1 String phoneModel, @aa1 String phoneIdentity, @aa1 String settings, @tb1 ThirdPlatform thirdPlatform, boolean z) {
        Intrinsics.X0O(phone, "phone");
        Intrinsics.X0O(email, "email");
        Intrinsics.X0O(receivePhone, "receivePhone");
        Intrinsics.X0O(nickname, "nickname");
        Intrinsics.X0O(avatarUrl, "avatarUrl");
        Intrinsics.X0O(birthday, "birthday");
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(extraInfo, "extraInfo");
        Intrinsics.X0O(dbUrl, "dbUrl");
        Intrinsics.X0O(country, "country");
        Intrinsics.X0O(city, "city");
        Intrinsics.X0O(osVersion, "osVersion");
        Intrinsics.X0O(phoneModel, "phoneModel");
        Intrinsics.X0O(phoneIdentity, "phoneIdentity");
        Intrinsics.X0O(settings, "settings");
        this.projectId = i;
        this.phone = phone;
        this.email = email;
        this.receivePhone = receivePhone;
        this.nickname = nickname;
        this.avatarUrl = avatarUrl;
        this.birthday = birthday;
        this.gender = i2;
        this.unit = i3;
        this.height = f;
        this.weight = f2;
        this.identity = identity;
        this.token = token;
        this.extraInfo = extraInfo;
        this.dbUrl = dbUrl;
        this.country = country;
        this.city = city;
        this.longitude = f3;
        this.latitude = f4;
        this.server = i4;
        this.phoneOs = i5;
        this.osVersion = osVersion;
        this.phoneModel = phoneModel;
        this.phoneIdentity = phoneIdentity;
        this.settings = settings;
        this.thirdPlatform = thirdPlatform;
        this.passwordStatus = z;
    }

    public /* synthetic */ AppUser(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, float f, float f2, String str7, String str8, String str9, String str10, String str11, String str12, float f3, float f4, int i4, int i5, String str13, String str14, String str15, String str16, ThirdPlatform thirdPlatform, boolean z, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? "" : str4, (i6 & 32) != 0 ? "" : str5, (i6 & 64) != 0 ? "01/01/2000" : str6, (i6 & 128) != 0 ? 0 : i2, (i6 & 256) != 0 ? !i72.OXO1.iOIIiI1() ? 1 : 0 : i3, (i6 & 512) != 0 ? 0.0f : f, (i6 & 1024) != 0 ? 0.0f : f2, (i6 & 2048) != 0 ? "" : str7, (i6 & 4096) != 0 ? "" : str8, (i6 & 8192) != 0 ? "" : str9, (i6 & 16384) != 0 ? "" : str10, (i6 & 32768) != 0 ? "" : str11, (i6 & 65536) != 0 ? "" : str12, (i6 & 131072) != 0 ? 0.0f : f3, (i6 & 262144) != 0 ? 0.0f : f4, (i6 & 524288) != 0 ? 0 : i4, (i6 & 1048576) != 0 ? 0 : i5, (i6 & 2097152) != 0 ? "" : str13, (i6 & 4194304) != 0 ? "" : str14, (i6 & 8388608) != 0 ? "" : str15, (i6 & 16777216) == 0 ? str16 : "", (i6 & 33554432) != 0 ? null : thirdPlatform, (i6 & 67108864) != 0 ? false : z);
    }
}
