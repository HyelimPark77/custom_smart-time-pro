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
import com.sma.smartv3.model.ThirdPlatform;
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
    public static final C0558OXO1 I0iXXO = null;

    @aa1
    public static final BleInfo I1XOi1 = null;
    public static final int O10IXXX0X = 1;
    public static final int X0O = 1;
    public static final int X1ii = 17220;

    @aa1
    public static final String XXI = null;
    public int I0IIOi;
    public int IO;

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
    public boolean iO;

    /* JADX INFO: renamed from: com.sma.smartv3.dto.OXO1$OXO1, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nThirdPartyDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo$Companion\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,116:1\n90#2:117\n98#2,2:118\n*S KotlinDebug\n*F\n+ 1 ThirdPartyDeviceInfo.kt\ncom/sma/smartv3/dto/ThirdPartyDeviceInfo$Companion\n*L\n93#1:117\n98#1:118,2\n*E\n"})
    public static final class C0558OXO1 {
        public /* synthetic */ C0558OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void OIi0(C0558OXO1 r0, boolean r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = false;
        L5:
            r0.I0IIOi(r1);
        }

        public final void I0IIOi(boolean r4) {
            a01.OXO1.iO().remove(b01.I00 + '_' + OXO1.class.getName(), r4);
        }

        public final void IO() {
            I0IIOi(true);
            I01XX0.XIi00iiXO(I01XX0.iXi, null, 2, null);
        }

        public final boolean IiI10X() {
            OXO1 r0 = XIi00iiXO();
            if (r0 != null) goto L5;
        L7:
            return false;
        L5:
            if (r0.II1Xi0() != true) goto L7;
            return true;
        }

        @aa1
        public final String O00() {
            Gson r0 = new Gson();
            OXO1 r1 = XIi00iiXO();
            if (r1 == null) goto L6;
            BleInfo r2 = r1.XiOIO();
            if (r2 == null) goto L6;
        L7:
            String r3 = r0.toJson(r2);
            Intrinsics.O10IXXX0X(r3, "toJson(...)");
            return r3;
        L6:
            r2 = OXO1.XIi00iiXO();
            goto L7
        }

        @aa1
        public final String OXO1() {
            return OXO1.OXO1();
        }

        @tb1
        public final OXO1 XIi00iiXO() {
            SPUtils r0 = a01.OXO1.iO();
            return (OXO1) new Gson().fromJson(r0.getString(b01.I00 + '_' + OXO1.class.getName()), OXO1.class);
        }

        @aa1
        public final String XO0O10() {
            ChatAiMode.OXO1 r0 = ChatAiMode.Companion;
            OXO1 r1 = XIi00iiXO();
            if (r1 == null) goto L5;
            int r2 = r1.OII();
        L6:
            String r3 = r0.iO(Integer.valueOf(r2));
            if (r3 == null) goto L9;
            return r3;
        L9:
            return ChatAiMode.SPARK_CHAIN.getModelName();
        L5:
            r2 = 2;
            goto L6
        }

        public final boolean XOO0ii0() {
            if (XIi00iiXO() == null) goto L6;
            return true;
        L6:
            return false;
        }

        @aa1
        public final ChatAiMode iO() {
            ChatAiMode.OXO1 r0 = ChatAiMode.Companion;
            OXO1 r1 = XIi00iiXO();
            if (r1 == null) goto L5;
            int r2 = r1.OII();
        L6:
            ChatAiMode r3 = r0.OXO1(r2);
            if (r3 == null) goto L9;
            return r3;
        L9:
            return ChatAiMode.SPARK_CHAIN;
        L5:
            r2 = 2;
            goto L6
        }

        public C0558OXO1() {
        }
    }

    static {
        C0558OXO1 r0 = new C0558OXO1(null);
        I0iXXO = r0;
        OXO1 r1 = r0.XIi00iiXO();
        if (r1 == null) goto L8;
        String r2 = r1.XIi00iiXO;
        if (r2 == null) goto L8;
        String r3 = oe5.IXO0OOi(r2, CertificateUtil.DELIMITER, "", false, 4, null);
        if (r3 == null) goto L8;
    L9:
        XXI = r3;
        I1XOi1 = new BleInfo(null, "FakeBle", null, null, null, null, "", 0, 189, null);
        return;
    L8:
        r3 = "";
        goto L9
    }

    public OXO1() {
        String r1 = null;
        String r2 = null;
        boolean r3 = false;
        int r4 = 0;
        String r5 = null;
        String r6 = null;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public static /* synthetic */ void IXXOO(OXO1 r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        r0.iX(r1);
    }

    public static final /* synthetic */ String OXO1() {
        return XXI;
    }

    public static /* synthetic */ OXO1 X0O(OXO1 r0, String r1, String r2, boolean r3, int r4, String r5, String r6, int r7, int r8, int r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.OXO1;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.XIi00iiXO;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.iO;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r0.XO0O10;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r0.O00;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r0.IiI10X;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r0.XOO0ii0;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r0.I0IIOi;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r9 = r0.OIi0;
    L30:
        if ((r12 & 512) == 0) goto L33;
        r10 = r0.IO;
    L33:
        if ((r12 & 1024) == 0) goto L35;
        r11 = r0.OIX0iXi;
    L35:
        int r14 = r10;
        int r15 = r11;
        int r16 = r8;
        int r17 = r9;
        String r18 = r6;
        int r19 = r7;
        int r20 = r4;
        String r21 = r5;
        boolean r22 = r3;
        String r23 = r1;
        return r0.O10IXXX0X(r23, r2, r22, r20, r21, r18, r19, r16, r17, r14, r15);
    }

    public static final /* synthetic */ BleInfo XIi00iiXO() {
        return I1XOi1;
    }

    public final boolean I0IIOi() {
        return this.iO;
    }

    public final int I0iXXO() {
        return this.XOO0ii0;
    }

    @aa1
    public final String I1() {
        return this.OXO1;
    }

    @aa1
    public final String I1XOi1() {
        return this.IiI10X;
    }

    public final boolean II1Xi0() {
        if (this.I0IIOi == 1) goto L6;
        return false;
    L6:
        if (q62.OXO1.X0O(this.OXO1) == true) goto L8;
        return true;
    L8:
        if (this.OIi0 == 17220) goto L10;
    L14:
        return false;
    L10:
        if (this.IO != 1) goto L14;
        if (this.OIX0iXi != 1) goto L14;
        return true;
    }

    public final int IIX1OXO() {
        return this.IO;
    }

    @aa1
    public final String IO() {
        return this.O00;
    }

    public final int IiI10X() {
        return this.OIX0iXi;
    }

    public final int O00() {
        return this.IO;
    }

    @aa1
    public final OXO1 O10IXXX0X(@aa1 String r14, @aa1 String r15, boolean r16, int r17, @aa1 String r18, @aa1 String r19, int r20, int r21, int r22, int r23, int r24) {
        Intrinsics.X0O(r14, "name");
        Intrinsics.X0O(r15, "mac");
        Intrinsics.X0O(r18, "modelName");
        Intrinsics.X0O(r19, "activeCode");
        return new OXO1(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    public final void O1O(int r1) {
        this.IO = r1;
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
    public final String OX() {
        return this.O00;
    }

    public final int OiIIX101O() {
        return this.XOO0ii0;
    }

    public final int X01IiOiIi() {
        return this.I0IIOi;
    }

    public final void X0i1O(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.OXO1 = r2;
    }

    public final void X11iII1O1(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.XIi00iiXO = r2;
    }

    public final void X1IX(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.O00 = r2;
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
        return this.iO;
    }

    public final int XXI() {
        return this.I0IIOi;
    }

    public final void XXIIO1i11(int r1) {
        this.OIi0 = r1;
    }

    public final void XXX11i(int r1) {
        this.XO0O10 = r1;
    }

    @aa1
    public final BleInfo XiOIO() {
        String r3 = this.OXO1;
        String r7 = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(r7, "getAppVersionName(...)");
        SPUtils r1 = a01.OXO1.IiI10X();
        int r9 = 0;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        int r16 = 0;
        int r17 = 0;
        float r18 = 0.0f;
        float r19 = 0.0f;
        String r20 = null;
        String r21 = null;
        String r22 = null;
        String r23 = null;
        String r24 = null;
        String r25 = null;
        float r26 = 0.0f;
        float r27 = 0.0f;
        int r28 = 0;
        int r29 = 0;
        String r30 = null;
        String r31 = null;
        String r32 = null;
        String r33 = null;
        ThirdPlatform r34 = null;
        boolean r35 = false;
        Object r8 = new AppUser(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, 134217727, null);
        Object r2 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L7;
        r8 = r2;
    L7:
        return new BleInfo(((AppUser) r8).getIdentity(), r3, null, RequestBodyKt.PROJECT_ID, null, r7, oe5.IXO0OOi(this.XIi00iiXO, CertificateUtil.DELIMITER, "", false, 4, null), 0, 20, null);
    }

    @aa1
    public final String XiOIii1() {
        return this.XIi00iiXO;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OXO1) == true) goto L8;
        return false;
    L8:
        OXO1 r6 = (OXO1) r5;
        if (Intrinsics.XOO0ii0(this.OXO1, r6.OXO1) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.XIi00iiXO, r6.XIi00iiXO) == true) goto L15;
        return false;
    L15:
        if (this.iO == r6.iO) goto L18;
        return false;
    L18:
        if (this.XO0O10 == r6.XO0O10) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.O00, r6.O00) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.IiI10X, r6.IiI10X) == true) goto L27;
        return false;
    L27:
        if (this.XOO0ii0 == r6.XOO0ii0) goto L30;
        return false;
    L30:
        if (this.I0IIOi == r6.I0IIOi) goto L33;
        return false;
    L33:
        if (this.OIi0 == r6.OIi0) goto L36;
        return false;
    L36:
        if (this.IO == r6.IO) goto L39;
        return false;
    L39:
        if (this.OIX0iXi == r6.OIX0iXi) goto L41;
        return false;
    L41:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode()) * 31) + Boolean.hashCode(this.iO)) * 31) + Integer.hashCode(this.XO0O10)) * 31) + this.O00.hashCode()) * 31) + this.IiI10X.hashCode()) * 31) + Integer.hashCode(this.XOO0ii0)) * 31) + Integer.hashCode(this.I0IIOi)) * 31) + Integer.hashCode(this.OIi0)) * 31) + Integer.hashCode(this.IO)) * 31) + Integer.hashCode(this.OIX0iXi);
    }

    public final void i010I(@tb1 ThirdPartyDeviceData r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (Intrinsics.XOO0ii0(this, r3) == true) goto L12;
        this.XO0O10 = r3.getModelId();
        String r0 = r3.getAiServerName();
        if (r0 != null) goto L9;
        r0 = ChatAiMode.SPARK_CHAIN.getModelName();
    L9:
        this.O00 = r0;
        this.IiI10X = r3.getCode();
        this.I0IIOi = r3.getStatus();
        this.XOO0ii0 = r3.getDuration();
        i1O0OXO1O.OXO1.OXO1("NetTransfer:" + this);
        iX(true);
        return;
    }

    public final void iI(boolean r1) {
        this.iO = r1;
    }

    public final void iIXi1iiXI(int r1) {
        this.OIX0iXi = r1;
    }

    public final int iIiiO() {
        return this.OIi0;
    }

    @aa1
    public final HashMap<String, String> iO() {
        Gson r1 = new Gson();
        String r4 = this.OXO1;
        String r8 = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(r8, "getAppVersionName(...)");
        SPUtils r2 = a01.OXO1.IiI10X();
        int r10 = 0;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        int r17 = 0;
        int r18 = 0;
        float r19 = 0.0f;
        float r20 = 0.0f;
        String r21 = null;
        String r22 = null;
        String r23 = null;
        String r24 = null;
        String r25 = null;
        String r26 = null;
        float r27 = 0.0f;
        float r28 = 0.0f;
        int r29 = 0;
        int r30 = 0;
        String r31 = null;
        String r32 = null;
        String r33 = null;
        String r34 = null;
        ThirdPlatform r35 = null;
        boolean r36 = false;
        Object r9 = new AppUser(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, 134217727, null);
        Object r3 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r9 = r3;
    L6:
        String r5 = r1.toJson(new BleInfo(((AppUser) r9).getIdentity(), r4, "", RequestBodyKt.PROJECT_ID, "", r8, this.XIi00iiXO, 0));
        HashMap<String, String> r6 = new HashMap();
        r6.put("language", Utils.getApp().getResources().getConfiguration().locale.getLanguage());
        r6.put("BleInfo", r5);
        return r6;
    }

    public final void iOO1ii1(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.IiI10X = r2;
    }

    public final int iOOX010X() {
        return this.OIX0iXi;
    }

    public final void iX(boolean r4) {
        a01.OXO1.iO().put(b01.I00 + '_' + OXO1.class.getName(), new Gson().toJson(this), r4);
    }

    public final void iX1O1(int r1) {
        this.XOO0ii0 = r1;
    }

    public final void iXiX011(int r1) {
        this.I0IIOi = r1;
    }

    @aa1
    public String toString() {
        return "ThirdPartyDeviceInfo(name=" + this.OXO1 + ", mac=" + this.XIi00iiXO + ", connected=" + this.iO + ", modelId=" + this.XO0O10 + ", modelName=" + this.O00 + ", activeCode=" + this.IiI10X + ", duration=" + this.XOO0ii0 + ", state=" + this.I0IIOi + ", cid=" + this.OIi0 + ", bid=" + this.IO + ", pid=" + this.OIX0iXi + I000IiI1O.iO.iO;
    }

    public OXO1(@aa1 String r2, @aa1 String r3, boolean r4, int r5, @aa1 String r6, @aa1 String r7, int r8, int r9, int r10, int r11, int r12) {
        Intrinsics.X0O(r2, "name");
        Intrinsics.X0O(r3, "mac");
        Intrinsics.X0O(r6, "modelName");
        Intrinsics.X0O(r7, "activeCode");
        this.OXO1 = r2;
        this.XIi00iiXO = r3;
        this.iO = r4;
        this.XO0O10 = r5;
        this.O00 = r6;
        this.IiI10X = r7;
        this.XOO0ii0 = r8;
        this.I0IIOi = r9;
        this.OIi0 = r10;
        this.IO = r11;
        this.OIX0iXi = r12;
    }

    public /* synthetic */ OXO1(String r3, String r4, boolean r5, int r6, String r7, String r8, int r9, int r10, int r11, int r12, int r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r14 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r14 & 4) == 0) goto L12;
        r5 = false;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r6 = 3;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r7 = ChatAiMode.SPARK_CHAIN.getModelName();
    L18:
        if ((r14 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r14 & 64) == 0) goto L24;
        r9 = 0;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r10 = 0;
    L27:
        if ((r14 & 256) == 0) goto L30;
        r11 = 0;
    L30:
        if ((r14 & 512) == 0) goto L33;
        r12 = 0;
    L33:
        if ((r14 & 1024) == 0) goto L36;
        int r16 = 0;
    L35:
        int r17 = r12;
        int r18 = r11;
        int r19 = r10;
        int r110 = r9;
        String r20 = r8;
        String r21 = r7;
        int r22 = r6;
        boolean r23 = r5;
        this(r3, r4, r23, r22, r21, r20, r110, r19, r18, r17, r16);
        return;
    L36:
        r16 = r13;
        goto L35
    }
}
