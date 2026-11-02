package com.sma.smartv3.dto;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.BleInfo;
import com.sma.smartv3.network.RequestBodyKt;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nThirdPartyDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,116:1\n19#2:117\n15#2:118\n86#2,2:119\n19#2:121\n15#2:122\n*S KotlinDebug\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo\n*L\n55#1:117\n55#1:118\n66#1:119,2\n84#1:121\n84#1:122\n*E\n"})
public final class OXO1 {

    @aa1
    public static final C22040OXO1 I0iXXO;

    @aa1
    public static final BleInfo I1XOi1;
    public static final int O10IXXX0X = 1;
    public static final int X0O = 1;
    public static final int X1ii = 17220;

    @aa1
    public static final String XXI;
    public int I0IIOi;

    /* JADX INFO: renamed from: IO */
    public int f51202IO;

    @aa1
    public String IiI10X;

    @aa1
    public String O00;
    public int OIX0iXi;
    public int OIi0;

    @aa1
    public String OXO1;

    @aa1
    public String XIi00iiXO;
    public int XO0O10;
    public int XOO0ii0;

    /* JADX INFO: renamed from: iO */
    public boolean f51203iO;

    /* JADX INFO: renamed from: com.sma.smartv3.dto.OXO1$OXO1 */
    @SourceDebugExtension({"SMAP\nThirdPartyDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo$Companion\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,116:1\n90#2:117\n98#2,2:118\n*S KotlinDebug\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo$Companion\n*L\n93#1:117\n98#1:118,2\n*E\n"})
    public static final class C22040OXO1 {
        public /* synthetic */ C22040OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void OIi0(C22040OXO1 c22040oxo1, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            c22040oxo1.I0IIOi(z);
        }

        public final void I0IIOi(boolean z) {
            a01.OXO1.m1440iO().remove(b01.I00 + '_' + OXO1.class.getName(), z);
        }

        /* JADX INFO: renamed from: IO */
        public final void m38209IO() {
            I0IIOi(true);
            I01XX0.XIi00iiXO(I01XX0.iXi, null, 2, null);
        }

        public final boolean IiI10X() {
            OXO1 oxo1XIi00iiXO = XIi00iiXO();
            return oxo1XIi00iiXO != null && oxo1XIi00iiXO.II1Xi0();
        }

        @aa1
        public final String O00() {
            BleInfo bleInfoXiOIO;
            Gson gson = new Gson();
            OXO1 oxo1XIi00iiXO = XIi00iiXO();
            if (oxo1XIi00iiXO == null || (bleInfoXiOIO = oxo1XIi00iiXO.XiOIO()) == null) {
                bleInfoXiOIO = OXO1.I1XOi1;
            }
            String json = gson.toJson(bleInfoXiOIO);
            Intrinsics.O10IXXX0X(json, "toJson(...)");
            return json;
        }

        @aa1
        public final String OXO1() {
            return OXO1.XXI;
        }

        @tb1
        public final OXO1 XIi00iiXO() {
            SPUtils sPUtilsM1440iO = a01.OXO1.m1440iO();
            return (OXO1) new Gson().fromJson(sPUtilsM1440iO.getString(b01.I00 + '_' + OXO1.class.getName()), OXO1.class);
        }

        @aa1
        public final String XO0O10() {
            ChatAiMode.OXO1 oxo1 = ChatAiMode.Companion;
            OXO1 oxo1XIi00iiXO = XIi00iiXO();
            String strM38202iO = oxo1.m38202iO(Integer.valueOf(oxo1XIi00iiXO != null ? oxo1XIi00iiXO.OII() : 2));
            return strM38202iO == null ? ChatAiMode.SPARK_CHAIN.getModelName() : strM38202iO;
        }

        public final boolean XOO0ii0() {
            return XIi00iiXO() != null;
        }

        @aa1
        /* JADX INFO: renamed from: iO */
        public final ChatAiMode m38210iO() {
            ChatAiMode.OXO1 oxo1 = ChatAiMode.Companion;
            OXO1 oxo1XIi00iiXO = XIi00iiXO();
            ChatAiMode chatAiModeOXO1 = oxo1.OXO1(oxo1XIi00iiXO != null ? oxo1XIi00iiXO.OII() : 2);
            return chatAiModeOXO1 == null ? ChatAiMode.SPARK_CHAIN : chatAiModeOXO1;
        }

        public C22040OXO1() {
        }
    }

    static {
        String strIXO0OOi;
        String str;
        C22040OXO1 c22040oxo1 = new C22040OXO1(null);
        I0iXXO = c22040oxo1;
        OXO1 oxo1XIi00iiXO = c22040oxo1.XIi00iiXO();
        if (oxo1XIi00iiXO == null || (str = oxo1XIi00iiXO.XIi00iiXO) == null || (strIXO0OOi = oe5.IXO0OOi(str, CertificateUtil.DELIMITER, "", false, 4, null)) == null) {
            strIXO0OOi = "";
        }
        XXI = strIXO0OOi;
        I1XOi1 = new BleInfo(null, "FakeBle", null, null, null, null, "", 0, 189, null);
    }

    public OXO1() {
        this(null, null, false, 0, null, null, 0, 0, 0, 0, 0, 2047, null);
    }

    public static /* synthetic */ void IXXOO(OXO1 oxo1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        oxo1.m38208iX(z);
    }

    public static /* synthetic */ OXO1 X0O(OXO1 oxo1, String str, String str2, boolean z, int i, String str3, String str4, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = oxo1.OXO1;
        }
        if ((i7 & 2) != 0) {
            str2 = oxo1.XIi00iiXO;
        }
        if ((i7 & 4) != 0) {
            z = oxo1.f51203iO;
        }
        if ((i7 & 8) != 0) {
            i = oxo1.XO0O10;
        }
        if ((i7 & 16) != 0) {
            str3 = oxo1.O00;
        }
        if ((i7 & 32) != 0) {
            str4 = oxo1.IiI10X;
        }
        if ((i7 & 64) != 0) {
            i2 = oxo1.XOO0ii0;
        }
        if ((i7 & 128) != 0) {
            i3 = oxo1.I0IIOi;
        }
        if ((i7 & 256) != 0) {
            i4 = oxo1.OIi0;
        }
        if ((i7 & 512) != 0) {
            i5 = oxo1.f51202IO;
        }
        if ((i7 & 1024) != 0) {
            i6 = oxo1.OIX0iXi;
        }
        int i8 = i5;
        int i9 = i6;
        int i10 = i3;
        int i11 = i4;
        String str5 = str4;
        int i12 = i2;
        String str6 = str3;
        boolean z2 = z;
        return oxo1.O10IXXX0X(str, str2, z2, i, str6, str5, i12, i10, i11, i8, i9);
    }

    public final boolean I0IIOi() {
        return this.f51203iO;
    }

    public final int I0iXXO() {
        return this.XOO0ii0;
    }

    @aa1
    /* JADX INFO: renamed from: I1 */
    public final String m38203I1() {
        return this.OXO1;
    }

    @aa1
    public final String I1XOi1() {
        return this.IiI10X;
    }

    public final boolean II1Xi0() {
        if (this.I0IIOi != 1) {
            return false;
        }
        if (q62.OXO1.X0O(this.OXO1)) {
            return this.OIi0 == 17220 && this.f51202IO == 1 && this.OIX0iXi == 1;
        }
        return true;
    }

    public final int IIX1OXO() {
        return this.f51202IO;
    }

    @aa1
    /* JADX INFO: renamed from: IO */
    public final String m38204IO() {
        return this.O00;
    }

    public final int IiI10X() {
        return this.OIX0iXi;
    }

    public final int O00() {
        return this.f51202IO;
    }

    @aa1
    public final OXO1 O10IXXX0X(@aa1 String name, @aa1 String mac, boolean z, int i, @aa1 String modelName, @aa1 String activeCode, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(mac, "mac");
        Intrinsics.X0O(modelName, "modelName");
        Intrinsics.X0O(activeCode, "activeCode");
        return new OXO1(name, mac, z, i, modelName, activeCode, i2, i3, i4, i5, i6);
    }

    public final void O1O(int i) {
        this.f51202IO = i;
    }

    public final int OII() {
        return this.XO0O10;
    }

    @aa1
    public final String OIX0iXi() {
        return this.IiI10X;
    }

    public final int OIi0() {
        return this.XO0O10;
    }

    @aa1
    /* JADX INFO: renamed from: OX */
    public final String m38205OX() {
        return this.O00;
    }

    public final int OiIIX101O() {
        return this.XOO0ii0;
    }

    public final int X01IiOiIi() {
        return this.I0IIOi;
    }

    public final void X0i1O(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.OXO1 = str;
    }

    public final void X11iII1O1(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.XIi00iiXO = str;
    }

    public final void X1IX(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.O00 = str;
    }

    public final int X1ii() {
        return this.OIi0;
    }

    @aa1
    public final String XO0O10() {
        return this.OXO1;
    }

    @aa1
    public final String XOO0ii0() {
        return this.XIi00iiXO;
    }

    public final boolean XX0() {
        return this.f51203iO;
    }

    public final int XXI() {
        return this.I0IIOi;
    }

    public final void XXIIO1i11(int i) {
        this.OIi0 = i;
    }

    public final void XXX11i(int i) {
        this.XO0O10 = i;
    }

    @aa1
    public final BleInfo XiOIO() {
        String str = this.OXO1;
        String appVersionName = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(appVersionName, "getAppVersionName(...)");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        return new BleInfo(((AppUser) appUser).getIdentity(), str, null, RequestBodyKt.PROJECT_ID, null, appVersionName, oe5.IXO0OOi(this.XIi00iiXO, CertificateUtil.DELIMITER, "", false, 4, null), 0, 20, null);
    }

    @aa1
    public final String XiOIii1() {
        return this.XIi00iiXO;
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OXO1)) {
            return false;
        }
        OXO1 oxo1 = (OXO1) obj;
        return Intrinsics.XOO0ii0(this.OXO1, oxo1.OXO1) && Intrinsics.XOO0ii0(this.XIi00iiXO, oxo1.XIi00iiXO) && this.f51203iO == oxo1.f51203iO && this.XO0O10 == oxo1.XO0O10 && Intrinsics.XOO0ii0(this.O00, oxo1.O00) && Intrinsics.XOO0ii0(this.IiI10X, oxo1.IiI10X) && this.XOO0ii0 == oxo1.XOO0ii0 && this.I0IIOi == oxo1.I0IIOi && this.OIi0 == oxo1.OIi0 && this.f51202IO == oxo1.f51202IO && this.OIX0iXi == oxo1.OIX0iXi;
    }

    public int hashCode() {
        return (((((((((((((((((((this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode()) * 31) + Boolean.hashCode(this.f51203iO)) * 31) + Integer.hashCode(this.XO0O10)) * 31) + this.O00.hashCode()) * 31) + this.IiI10X.hashCode()) * 31) + Integer.hashCode(this.XOO0ii0)) * 31) + Integer.hashCode(this.I0IIOi)) * 31) + Integer.hashCode(this.OIi0)) * 31) + Integer.hashCode(this.f51202IO)) * 31) + Integer.hashCode(this.OIX0iXi);
    }

    public final void i010I(@tb1 ThirdPartyDeviceData thirdPartyDeviceData) {
        if (thirdPartyDeviceData == null || Intrinsics.XOO0ii0(this, thirdPartyDeviceData)) {
            return;
        }
        this.XO0O10 = thirdPartyDeviceData.getModelId();
        String aiServerName = thirdPartyDeviceData.getAiServerName();
        if (aiServerName == null) {
            aiServerName = ChatAiMode.SPARK_CHAIN.getModelName();
        }
        this.O00 = aiServerName;
        this.IiI10X = thirdPartyDeviceData.getCode();
        this.I0IIOi = thirdPartyDeviceData.getStatus();
        this.XOO0ii0 = thirdPartyDeviceData.getDuration();
        i1O0OXO1O.OXO1.OXO1("NetTransfer:" + this);
        m38208iX(true);
    }

    /* JADX INFO: renamed from: iI */
    public final void m38206iI(boolean z) {
        this.f51203iO = z;
    }

    public final void iIXi1iiXI(int i) {
        this.OIX0iXi = i;
    }

    public final int iIiiO() {
        return this.OIi0;
    }

    @aa1
    /* JADX INFO: renamed from: iO */
    public final HashMap<String, String> m38207iO() {
        Gson gson = new Gson();
        String str = this.OXO1;
        String appVersionName = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(appVersionName, "getAppVersionName(...)");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        String json = gson.toJson(new BleInfo(((AppUser) appUser).getIdentity(), str, "", RequestBodyKt.PROJECT_ID, "", appVersionName, this.XIi00iiXO, 0));
        HashMap<String, String> map = new HashMap<>();
        map.put("language", Utils.getApp().getResources().getConfiguration().locale.getLanguage());
        map.put("BleInfo", json);
        return map;
    }

    public final void iOO1ii1(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.IiI10X = str;
    }

    public final int iOOX010X() {
        return this.OIX0iXi;
    }

    /* JADX INFO: renamed from: iX */
    public final void m38208iX(boolean z) {
        a01.OXO1.m1440iO().put(b01.I00 + '_' + OXO1.class.getName(), new Gson().toJson(this), z);
    }

    public final void iX1O1(int i) {
        this.XOO0ii0 = i;
    }

    public final void iXiX011(int i) {
        this.I0IIOi = i;
    }

    @aa1
    public String toString() {
        return "ThirdPartyDeviceInfo(name=" + this.OXO1 + ", mac=" + this.XIi00iiXO + ", connected=" + this.f51203iO + ", modelId=" + this.XO0O10 + ", modelName=" + this.O00 + ", activeCode=" + this.IiI10X + ", duration=" + this.XOO0ii0 + ", state=" + this.I0IIOi + ", cid=" + this.OIi0 + ", bid=" + this.f51202IO + ", pid=" + this.OIX0iXi + I000IiI1O.C2156iO.f1007iO;
    }

    public OXO1(@aa1 String name, @aa1 String mac, boolean z, int i, @aa1 String modelName, @aa1 String activeCode, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(mac, "mac");
        Intrinsics.X0O(modelName, "modelName");
        Intrinsics.X0O(activeCode, "activeCode");
        this.OXO1 = name;
        this.XIi00iiXO = mac;
        this.f51203iO = z;
        this.XO0O10 = i;
        this.O00 = modelName;
        this.IiI10X = activeCode;
        this.XOO0ii0 = i2;
        this.I0IIOi = i3;
        this.OIi0 = i4;
        this.f51202IO = i5;
        this.OIX0iXi = i6;
    }

    public /* synthetic */ OXO1(String str, String str2, boolean z, int i, String str3, String str4, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? false : z, (i7 & 8) != 0 ? 3 : i, (i7 & 16) != 0 ? ChatAiMode.SPARK_CHAIN.getModelName() : str3, (i7 & 32) != 0 ? "" : str4, (i7 & 64) != 0 ? 0 : i2, (i7 & 128) != 0 ? 0 : i3, (i7 & 256) != 0 ? 0 : i4, (i7 & 512) != 0 ? 0 : i5, (i7 & 1024) != 0 ? 0 : i6);
    }
}
