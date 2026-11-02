package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XX01Oi;
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

    /* JADX INFO: renamed from: iO */
    @aa1
    public final String f54859iO;

    public SparkLicenseManager(@aa1 i00OIXiO scope) {
        Intrinsics.X0O(scope, "scope");
        this.OXO1 = scope;
        this.XIi00iiXO = "SparkChainLicenseManager";
        this.f54859iO = "0b99355f";
        this.XO0O10 = "9221c3ac55d4516cff992a06d82c21d6";
        this.O00 = "ZTRhY2U2NzZhN2UyNWNmNGRlM2NmNjI3";
        ry0<Boolean> ry0VarXIi00iiXO = m94.XIi00iiXO(3, 0, null, 6, null);
        this.IiI10X = ry0VarXIi00iiXO;
        this.XOO0ii0 = iX0XiO.I0iXXO(ry0VarXIi00iiXO);
        this.I0IIOi = new AtomicBoolean(false);
    }

    public final boolean IiI10X() {
        String strIXO0OOi;
        MacConfig macConfig;
        q62 q62Var = q62.OXO1;
        if (q62Var.ii00OXXO()) {
            DeviceConfigInfo deviceConfigInfoO1i0 = q62Var.O1i0();
            strIXO0OOi = (deviceConfigInfoO1i0 == null || (macConfig = deviceConfigInfoO1i0.getMacConfig()) == null) ? null : macConfig.getMac();
        } else {
            strIXO0OOi = oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null);
        }
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1(this.XIi00iiXO + " DeviceId:" + strIXO0OOi);
        SparkChainConfig sparkChainConfigBuilder = SparkChainConfig.builder();
        sparkChainConfigBuilder.appID(this.f54859iO);
        sparkChainConfigBuilder.apiKey(this.XO0O10);
        sparkChainConfigBuilder.apiSecret(this.O00);
        sparkChainConfigBuilder.uid(strIXO0OOi);
        sparkChainConfigBuilder.logLevel(0);
        sparkChainConfigBuilder.logPath(uz0.m3192iO(sz0.OXO1, "AI_SPARK_CHAIN_" + O0X11OiO.O00().format(new Date()) + ".txt").getAbsolutePath());
        int iInit = SparkChain.getInst().init(Utils.getApp(), sparkChainConfigBuilder);
        if (iInit != 0) {
            ToastUtils.showLong(R.string.spark_exist_fail);
        }
        i1o0oxo1o.OXO1(this.XIi00iiXO + " InitStatus:" + iInit);
        return iInit == 0;
    }

    @aa1
    public final l94<Boolean> O00() {
        return this.XOO0ii0;
    }

    @aa1
    public final XiOIO XO0O10() {
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new SparkLicenseManager$currentDeviceHasLicense$1(this, null), 2, null);
    }
}
