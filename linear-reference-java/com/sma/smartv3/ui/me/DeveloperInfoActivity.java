package com.sma.smartv3.ui.me;

import android.R;
import android.os.Bundle;
import com.android.mltcode.paycertificationapi.I0iI000XX;
import com.android.mltcode.paycertificationapi.I1XI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.dc;
import com.android.mltcode.paycertificationapi.ii00;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tv6;
import com.android.mltcode.paycertificationapi.ug6;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.google.gson.Gson;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.WeatherInitializer;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleGoMoreSettings;
import com.szabh.smable3.entity.BleSedentarinessSettings;
import com.szabh.smable3.entity.BleWeatherForecast;
import com.szabh.smable3.entity.BleWeatherRealtime;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperInfoActivity.kt\ncom/sma/smartv3/ui/me/DeveloperInfoActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,75:1\n18#2,2:76\n15#2:78\n*S KotlinDebug\n*F\n+ 1 DeveloperInfoActivity.kt\ncom/sma/smartv3/ui/me/DeveloperInfoActivity\n*L\n30#1:76,2\n30#1:78\n*E\n"})
public final class DeveloperInfoActivity extends BaseListActivity<dc> {

    @aa1
    private final Lazy mDeviceInfo$delegate;
    private boolean mIsOpenRunTimeLog;

    @aa1
    private final Lazy mMtkOtaMeta$delegate;

    @aa1
    private final Lazy mNotificationListener$delegate;

    @aa1
    private final BleSedentarinessSettings mSedentarinessSettings;

    @aa1
    private final String mWeather;

    @aa1
    private final String mWeatherForecast;

    @aa1
    private final String mWeatherRealtime;

    @aa1
    private final tv6 mWeatherStatus;

    public DeveloperInfoActivity() {
        this.mNotificationListener$delegate = LazyKt__LazyJVMKt.iO(new ii00(this));
        a01 r0 = a01.OXO1;
        Object r1 = new Gson().fromJson(r0.XIi00iiXO().getString(tv6.class.getName()), tv6.class);
        if (r1 != null) goto L5;
        r1 = tv6.class.newInstance();
    L5:
        tv6 r2 = (tv6) r1;
        this.mWeatherStatus = r2;
        BleCache r3 = BleCache.INSTANCE;
        String r8 = String.valueOf(BaseBleCache.getObject$default(r3, BleKey.WEATHER_REALTIME, BleWeatherRealtime.class, null, 4, null));
        this.mWeatherRealtime = r8;
        String r4 = String.valueOf(BaseBleCache.getObject$default(r3, BleKey.WEATHER_FORECAST, BleWeatherForecast.class, null, 4, null));
        this.mWeatherForecast = r4;
        this.mWeather = r2 + "\n\n" + r8 + "\n\n" + r4;
        this.mDeviceInfo$delegate = LazyKt__LazyJVMKt.iO(new I1XI0());
        this.mMtkOtaMeta$delegate = LazyKt__LazyJVMKt.iO(new I0iI000XX());
        this.mIsOpenRunTimeLog = r0.IiI10X().getBoolean(b01.iOO1ii1, false);
        this.mSedentarinessSettings = (BleSedentarinessSettings) BaseBleCache.getObjectNotNull$default(r3, BleKey.SEDENTARINESS, BleSedentarinessSettings.class, null, null, 12, null);
    }

    public static /* synthetic */ String I0iXXO(DeveloperInfoActivity r0) {
        return mNotificationListener_delegate$lambda$0(r0);
    }

    public static /* synthetic */ String OIX0iXi() {
        return mMtkOtaMeta_delegate$lambda$0();
    }

    public static /* synthetic */ String XXI() {
        return mDeviceInfo_delegate$lambda$0();
    }

    private final String getMDeviceInfo() {
        return (String) getValue();
    }

    private final String getMMtkOtaMeta() {
        return (String) getValue();
    }

    private final String getMNotificationListener() {
        return (String) getValue();
    }

    private static final String mDeviceInfo_delegate$lambda$0() {
        return String.valueOf(BleCache.INSTANCE.getMDeviceInfo());
    }

    private static final String mMtkOtaMeta_delegate$lambda$0() {
        return BleCache.INSTANCE.getMtkOtaMeta();
    }

    private static final String mNotificationListener_delegate$lambda$0(DeveloperInfoActivity r3) {
        MyNotificationListenerService.OXO1 r0 = MyNotificationListenerService.O001I;
        return "isEnabled=" + r0.O00(r3.getMContext()) + ", isRunning=" + r0.IiI10X();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (dc) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<dc> initList() {
        q62 r1 = q62.OXO1;
        return CollectionsKt__CollectionsKt.Ii1iii0(new dc[]{new dc("Support Devices", String.valueOf(r1.i0iIXiI())), new dc("NotificationListenerService", getMNotificationListener()), new dc(WeatherInitializer.I1, this.mWeather), new dc("BleDeviceInfo", getMDeviceInfo()), new dc("MtkOtaMeta", getMMtkOtaMeta()), new dc("OnlineDeviceConfigInfo", String.valueOf(r1.O1i0())), new dc("gomore", ((BleGoMoreSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.GOMORE_SET, BleGoMoreSettings.class, null, null, 12, null)).toString())});
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.simple_list_item_2;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_developer_info;
    }

    public void initItem(@aa1 ug6 r3, @aa1 dc r4, int r5) {
        Intrinsics.X0O(r3, "holder");
        Intrinsics.X0O(r4, MapController.ITEM_LAYER_TAG);
        r3.OII(R.id.text1, (r5 + 1) + ". " + r4.IiI10X());
        r3.OII(R.id.text2, r4.O00());
    }
}
