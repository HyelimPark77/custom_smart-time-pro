package com.sma.smartv3.p610ui.p612me;

import android.R;
import android.os.Bundle;
import com.android.mltcode.paycertificationapi.C2331dc;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tv6;
import com.android.mltcode.paycertificationapi.ug6;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.google.gson.Gson;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.WeatherInitializer;
import com.sma.smartv3.p610ui.p612me.DeveloperInfoActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperInfoActivity.kt\ncom/sma/smartv3/ui/me/DeveloperInfoActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,75:1\n18#2,2:76\n15#2:78\n*S KotlinDebug\n*F\n+ 1 DeveloperInfoActivity.kt\ncom/sma/smartv3/ui/me/DeveloperInfoActivity\n*L\n30#1:76,2\n30#1:78\n*E\n"})
public final class DeveloperInfoActivity extends BaseListActivity<C2331dc> {

    @aa1
    private final Lazy mDeviceInfo$delegate;
    private boolean mIsOpenRunTimeLog;

    @aa1
    private final Lazy mMtkOtaMeta$delegate;

    @aa1
    private final Lazy mNotificationListener$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperInfoActivity.mNotificationListener_delegate$lambda$0(this.f8513IO);
        }
    });

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
        a01 a01Var = a01.OXO1;
        Object objFromJson = new Gson().fromJson(a01Var.XIi00iiXO().getString(tv6.class.getName()), (Class<Object>) tv6.class);
        tv6 tv6Var = (tv6) (objFromJson == null ? tv6.class.newInstance() : objFromJson);
        this.mWeatherStatus = tv6Var;
        BleCache bleCache = BleCache.INSTANCE;
        String strValueOf = String.valueOf(BaseBleCache.getObject$default(bleCache, BleKey.WEATHER_REALTIME, BleWeatherRealtime.class, null, 4, null));
        this.mWeatherRealtime = strValueOf;
        String strValueOf2 = String.valueOf(BaseBleCache.getObject$default(bleCache, BleKey.WEATHER_FORECAST, BleWeatherForecast.class, null, 4, null));
        this.mWeatherForecast = strValueOf2;
        this.mWeather = tv6Var + "\n\n" + strValueOf + "\n\n" + strValueOf2;
        this.mDeviceInfo$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1XI0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DeveloperInfoActivity.mDeviceInfo_delegate$lambda$0();
            }
        });
        this.mMtkOtaMeta$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0iI000XX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DeveloperInfoActivity.mMtkOtaMeta_delegate$lambda$0();
            }
        });
        this.mIsOpenRunTimeLog = a01Var.IiI10X().getBoolean(b01.iOO1ii1, false);
        this.mSedentarinessSettings = (BleSedentarinessSettings) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.SEDENTARINESS, BleSedentarinessSettings.class, null, null, 12, null);
    }

    private final String getMDeviceInfo() {
        return (String) this.mDeviceInfo$delegate.getValue();
    }

    private final String getMMtkOtaMeta() {
        return (String) this.mMtkOtaMeta$delegate.getValue();
    }

    private final String getMNotificationListener() {
        return (String) this.mNotificationListener$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mDeviceInfo_delegate$lambda$0() {
        return String.valueOf(BleCache.INSTANCE.getMDeviceInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mMtkOtaMeta_delegate$lambda$0() {
        return BleCache.INSTANCE.getMtkOtaMeta();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mNotificationListener_delegate$lambda$0(DeveloperInfoActivity developerInfoActivity) {
        MyNotificationListenerService.OXO1 oxo1 = MyNotificationListenerService.O001I;
        return "isEnabled=" + oxo1.O00(developerInfoActivity.getMContext()) + ", isRunning=" + oxo1.IiI10X();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<C2331dc> initList() {
        q62 q62Var = q62.OXO1;
        return CollectionsKt__CollectionsKt.Ii1iii0(new C2331dc("Support Devices", String.valueOf(q62Var.i0iIXiI())), new C2331dc("NotificationListenerService", getMNotificationListener()), new C2331dc(WeatherInitializer.f51280I1, this.mWeather), new C2331dc("BleDeviceInfo", getMDeviceInfo()), new C2331dc("MtkOtaMeta", getMMtkOtaMeta()), new C2331dc("OnlineDeviceConfigInfo", String.valueOf(q62Var.O1i0())), new C2331dc("gomore", ((BleGoMoreSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.GOMORE_SET, BleGoMoreSettings.class, null, null, 12, null)).toString()));
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.simple_list_item_2;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_developer_info;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 C2331dc item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        holder.OII(R.id.text1, (i + 1) + ". " + item.IiI10X());
        holder.OII(R.id.text2, item.O00());
    }
}
