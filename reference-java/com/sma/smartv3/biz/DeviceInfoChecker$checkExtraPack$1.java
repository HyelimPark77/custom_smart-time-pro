package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker$checkExtraPack$1;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.pro.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,920:1\n11#2,2:921\n15#2:923\n27#2,2:924\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1\n*L\n222#1:921,2\n223#1:923\n267#1:924,2\n*E\n"})
public final class DeviceInfoChecker$checkExtraPack$1 implements O1XIiIO<ExtraPackVersions> {
    public final /* synthetic */ boolean OXO1;
    public final /* synthetic */ Activity XIi00iiXO;

    public DeviceInfoChecker$checkExtraPack$1(boolean z, Activity activity) {
        this.OXO1 = z;
        this.XIi00iiXO = activity;
    }

    /* JADX INFO: renamed from: iO */
    public static final boolean m38098iO(Activity activity, FirmwareVersion firmwareVersion) {
        if (a01.OXO1.XIi00iiXO().getInt(b01.IIX1OXO, 0) >= 50) {
            DeviceInfoChecker.OXO1.i010I(activity, firmwareVersion);
            return true;
        }
        ToastUtils.showLong(R.string.firmware_upgrade_tip_toast);
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
    public void handleResponse(ExtraPackVersions extraPackVersions) {
        Integer numValueOf;
        a01 a01Var = a01.OXO1;
        a01Var.XIi00iiXO().put(ExtraPackVersions.class.getName(), new Gson().toJson(extraPackVersions));
        final FirmwareVersion firmwareVersion = (FirmwareVersion) new Gson().fromJson(a01Var.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        if (firmwareVersion == null) {
            if ((extraPackVersions != null ? extraPackVersions.getUiPackVersion() : null) == null) {
                if ((extraPackVersions != null ? extraPackVersions.getLanguagePackVersion() : null) == null) {
                    if ((extraPackVersions != null ? extraPackVersions.getFontPackVersion() : null) == null) {
                        if ((extraPackVersions != null ? extraPackVersions.getGpsFirmwareVersion() : null) == null) {
                            if ((extraPackVersions != null ? extraPackVersions.getNetworkFirmwareVersion() : null) == null) {
                                if (this.OXO1 || DeviceInfoChecker.OXO1.II1Xi0()) {
                                    ToastUtils.showLong(R.string.already_the_latest_version);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        go0 go0Var = new go0(this.XIi00iiXO, 0, 2, null);
        final Activity activity = this.XIi00iiXO;
        go0Var.I0iXXO(false);
        go0Var.O1O(R.string.upgrade_reminder);
        go0Var.IXXOO(17);
        if ((extraPackVersions != null ? extraPackVersions.getGpsFirmwareVersion() : null) != null) {
            go0.X11iII1O1(go0Var, null, null, 2, null);
            numValueOf = Integer.valueOf(R.string.new_gps_firmware_version_remind);
        } else {
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.upgrade_later), null, 2, null);
            numValueOf = Integer.valueOf(R.string.new_version_remind);
        }
        go0Var.m1865iX(numValueOf);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.iX0iOiXO0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(DeviceInfoChecker$checkExtraPack$1.m38098iO(activity, firmwareVersion));
            }
        });
        go0Var.IIX1OXO();
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(String error) {
        Intrinsics.X0O(error, "error");
        a01.OXO1.XIi00iiXO().remove(ExtraPackVersions.class.getName());
        if (this.OXO1 || DeviceInfoChecker.OXO1.II1Xi0()) {
            ToastUtils.showLong(R.string.already_the_latest_version);
        }
    }
}
