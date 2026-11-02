package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.iflytek.sparkchain.core.SparkChain;
import com.iflytek.sparkchain.core.SparkChainConfig;
import com.sma.smartv3.model.DeviceConfigInfo;
import com.sma.smartv3.model.MacConfig;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class SparkLicenseManager {

    @aa1
    public AtomicBoolean I0IIOi;

    @aa1
    public final ry0<Boolean> IiI10X;

    @aa1
    public final String O00;

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public final String XIi00iiXO;

    @aa1
    public final String XO0O10;

    @aa1
    public final l94<Boolean> XOO0ii0;

    @aa1
    public final String iO;

    public SparkLicenseManager(@aa1 i00OIXiO r4) {
        Intrinsics.X0O(r4, "scope");
        this.OXO1 = r4;
        this.XIi00iiXO = "SparkChainLicenseManager";
        this.iO = "0b99355f";
        this.XO0O10 = "9221c3ac55d4516cff992a06d82c21d6";
        this.O00 = "ZTRhY2U2NzZhN2UyNWNmNGRlM2NmNjI3";
        ry0<Boolean> r5 = m94.XIi00iiXO(3, 0, null, 6, null);
        this.IiI10X = r5;
        this.XOO0ii0 = iX0XiO.I0iXXO(r5);
        this.I0IIOi = new AtomicBoolean(false);
    }

    public static final /* synthetic */ String OXO1(SparkLicenseManager r0) {
        return r0.XIi00iiXO;
    }

    public static final /* synthetic */ ry0 XIi00iiXO(SparkLicenseManager r0) {
        return r0.IiI10X;
    }

    public static final /* synthetic */ AtomicBoolean iO(SparkLicenseManager r0) {
        return r0.I0IIOi;
    }

    public final boolean IiI10X() {
        q62 r0 = q62.OXO1;
        if (r0.ii00OXXO() == false) goto L10;
        DeviceConfigInfo r1 = r0.O1i0();
        if (r1 == null) goto L9;
        MacConfig r2 = r1.getMacConfig();
        if (r2 == null) goto L9;
        String r3 = r2.getMac();
    L11:
        i1O0OXO1O r4 = i1O0OXO1O.OXO1;
        r4.OXO1(this.XIi00iiXO + " DeviceId:" + r3);
        SparkChainConfig r5 = SparkChainConfig.builder();
        r5.appID(this.iO);
        r5.apiKey(this.XO0O10);
        r5.apiSecret(this.O00);
        r5.uid(r3);
        r5.logLevel(0);
        r5.logPath(uz0.iO(sz0.OXO1, "AI_SPARK_CHAIN_" + O0X11OiO.O00().format(new Date()) + ".txt").getAbsolutePath());
        int r6 = SparkChain.getInst().init(Utils.getApp(), r5);
        if (r6 == 0) goto L14;
        ToastUtils.showLong(R.string.spark_exist_fail);
    L14:
        r4.OXO1(this.XIi00iiXO + " InitStatus:" + r6);
        if (r6 != 0) goto L18;
        return true;
    L18:
        return false;
    L9:
        r3 = null;
        goto L11
    L10:
        r3 = oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null);
        goto L11
    }

    @aa1
    public final l94<Boolean> O00() {
        return this.XOO0ii0;
    }

    @aa1
    public final XiOIO XO0O10() {
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new SparkLicenseManager$currentDeviceHasLicense$1(this, null), 2, null);
    }
}
