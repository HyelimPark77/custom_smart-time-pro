package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.iX0iOiXO0;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,920:1\n11#2,2:921\n15#2:923\n27#2,2:924\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1\n*L\n222#1:921,2\n223#1:923\n267#1:924,2\n*E\n"})
public final class DeviceInfoChecker$checkExtraPack$1 implements O1XIiIO<ExtraPackVersions> {
    public final /* synthetic */ boolean OXO1;
    public final /* synthetic */ Activity XIi00iiXO;

    public DeviceInfoChecker$checkExtraPack$1(boolean r1, Activity r2) {
        this.OXO1 = r1;
        this.XIi00iiXO = r2;
    }

    public static /* synthetic */ boolean OXO1(Activity r0, FirmwareVersion r1) {
        return iO(r0, r1);
    }

    public static final boolean iO(Activity r3, FirmwareVersion r4) {
        if (a01.OXO1.XIi00iiXO().getInt(b01.IIX1OXO, 0) < 50) goto L5;
        DeviceInfoChecker.OXO1.i010I(r3, r4);
        return true;
    L5:
        ToastUtils.showLong(R.string.firmware_upgrade_tip_toast);
        return true;
    }

    public void XIi00iiXO(ExtraPackVersions r7) {
        a01 r0 = a01.OXO1;
        r0.XIi00iiXO().put(ExtraPackVersions.class.getName(), new Gson().toJson(r7));
        final FirmwareVersion r1 = (FirmwareVersion) new Gson().fromJson(r0.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        DefaultConstructorMarker r2 = null;
        if (r1 != null) goto L32;
        if (r7 == null) goto L6;
        FirmwareVersion r3 = r7.getUiPackVersion();
    L7:
        if (r3 != null) goto L32;
        if (r7 == null) goto L10;
        FirmwareVersion r4 = r7.getLanguagePackVersion();
    L11:
        if (r4 != null) goto L32;
        if (r7 == null) goto L14;
        FirmwareVersion r5 = r7.getFontPackVersion();
    L15:
        if (r5 != null) goto L32;
        if (r7 == null) goto L18;
        FirmwareVersion r6 = r7.getGpsFirmwareVersion();
    L19:
        if (r6 != null) goto L32;
        if (r7 == null) goto L22;
        FirmwareVersion r8 = r7.getNetworkFirmwareVersion();
    L23:
        if (r8 != null) goto L32;
        if (this.OXO1 == false) goto L27;
    L30:
        ToastUtils.showLong(R.string.already_the_latest_version);
        return;
    L27:
        if (DeviceInfoChecker.OXO1.II1Xi0() == true) goto L30;
        return;
    L22:
        r8 = null;
        goto L23
    L18:
        r6 = null;
        goto L19
    L14:
        r5 = null;
        goto L15
    L10:
        r4 = null;
        goto L11
    L6:
        r3 = null;
    L32:
        go0 r9 = new go0(this.XIi00iiXO, 0, 2, r2);
        final Activity r10 = this.XIi00iiXO;
        r9.I0iXXO(false);
        r9.O1O(R.string.upgrade_reminder);
        r9.IXXOO(17);
        if (r7 == null) goto L35;
        FirmwareVersion r11 = r7.getGpsFirmwareVersion();
    L36:
        if (r11 == null) goto L38;
        go0.X11iII1O1(r9, null, null, 2, null);
        Integer r12 = Integer.valueOf(R.string.new_gps_firmware_version_remind);
    L39:
        r9.iX(r12);
        r9.X1IX(R.string.confirm, new iX0iOiXO0(r10, r1));
        r9.IIX1OXO();
        return;
    L38:
        go0.X11iII1O1(r9, Integer.valueOf(R.string.upgrade_later), null, 2, null);
        r12 = Integer.valueOf(R.string.new_version_remind);
        goto L39
    L35:
        r11 = null;
        goto L36
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(String r2) {
        Intrinsics.X0O(r2, "error");
        a01.OXO1.XIi00iiXO().remove(ExtraPackVersions.class.getName());
        if (this.OXO1 == false) goto L5;
    L8:
        ToastUtils.showLong(R.string.already_the_latest_version);
        return;
    L5:
        if (DeviceInfoChecker.OXO1.II1Xi0() == true) goto L8;
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public /* bridge */ /* synthetic */ void handleResponse(ExtraPackVersions r1) {
        XIi00iiXO(r1);
    }
}
