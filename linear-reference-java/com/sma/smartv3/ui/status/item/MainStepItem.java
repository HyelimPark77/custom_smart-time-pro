package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.s30;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.t30;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u30;
import com.android.mltcode.paycertificationapi.w85;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OXO1;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.CaloriesActivity;
import com.sma.smartv3.ui.status.DistanceActivity;
import com.sma.smartv3.ui.status.Weather2Activity;
import com.sma.smartv3.ui.status.WeatherActivity;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleWeather;
import com.szabh.smable3.entity.BleWeather2;
import com.szabh.smable3.entity.BleWeatherRealtime;
import com.szabh.smable3.entity.BleWeatherRealtime2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMainStepItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStepItem.kt\ncom/sma/smartv3/ui/status/item/MainStepItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,195:1\n19#2:196\n15#2:197\n*S KotlinDebug\n*F\n+ 1 MainStepItem.kt\ncom/sma/smartv3/ui/status/item/MainStepItem\n*L\n99#1:196\n99#1:197\n*E\n"})
public class MainStepItem extends BaseDslItem {

    @tb1
    private Activity activity;
    public PFMedium distanceUnit;
    private final boolean initEvent;
    private ImageView ivWeather;

    @aa1
    private final ActivityDao mActivityDao;
    public Context mContext;
    private DINCondBold tvCalorie;
    private DINCondBold tvDistance;
    public DINCondBold tvTemperature;
    public DINCondBold tvWeatherTime;
    public AppUser userProfile;

    public MainStepItem() {
        this.mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();
        this.initEvent = true;
    }

    public static /* synthetic */ void IiI10X(MainStepItem r0, View r1) {
        bindView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void O00(MainStepItem r0, View r1) {
        bindView$lambda$2(r0, r1);
    }

    public static /* synthetic */ void XOO0ii0(MainStepItem r0, View r1) {
        bindView$lambda$0(r0, r1);
    }

    private static final void bindView$lambda$0(MainStepItem r0, View r1) {
        r0.weatherDetailsEvent();
    }

    private static final void bindView$lambda$1(MainStepItem r2, View r3) {
        if (w85.OXO1.OXO1() == false) goto L6;
        ContextCompat.startActivity(r2.getMContext(), new Intent(r2.getMContext(), CaloriesActivity.class), new Bundle());
        return;
    }

    private static final void bindView$lambda$2(MainStepItem r2, View r3) {
        if (w85.OXO1.OXO1() == false) goto L6;
        ContextCompat.startActivity(r2.getMContext(), new Intent(r2.getMContext(), DistanceActivity.class), new Bundle());
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r4) {
        Intrinsics.X0O(r4, "itemHolder");
        View r0 = r4.v(R.id.tvCalorie);
        Intrinsics.XXI(r0);
        this.tvCalorie = (DINCondBold) r0;
        View r1 = r4.v(R.id.tvDistance);
        Intrinsics.XXI(r1);
        this.tvDistance = (DINCondBold) r1;
        View r2 = r4.v(R.id.ivWeather);
        Intrinsics.XXI(r2);
        this.ivWeather = (ImageView) r2;
        DINCondBold r3 = null;
        if (i72.OXO1.IiX1ii() == false) goto L8;
        ImageView r5 = this.ivWeather;
        if (r5 != null) goto L7;
        Intrinsics.XXO("ivWeather");
        r5 = null;
    L7:
        Object r6 = r5.getParent();
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type android.view.View");
        ((View) r6).setOnClickListener(new s30(this));
    L8:
        View r7 = r4.v(R.id.tvTemperature);
        Intrinsics.XXI(r7);
        setTvTemperature((DINCondBold) r7);
        View r8 = r4.v(R.id.tvWeatherTime);
        Intrinsics.XXI(r8);
        setTvWeatherTime((DINCondBold) r8);
        View r9 = r4.v(R.id.distanceUnit);
        Intrinsics.XXI(r9);
        setDistanceUnit((PFMedium) r9);
        DINCondBold r10 = this.tvCalorie;
        if (r10 != null) goto L11;
        Intrinsics.XXO("tvCalorie");
    L12:
        Context r11 = r3.getContext();
        Intrinsics.O10IXXX0X(r11, "getContext(...)");
        setMContext(r11);
        View r12 = r4.view(R.id.llCalories);
        if (r12 == null) goto L15;
        r12.setOnClickListener(new t30(this));
    L15:
        View r13 = r4.view(R.id.llDistance);
        if (r13 == null) goto L19;
        r13.setOnClickListener(new u30(this));
        return;
    L19:
        return;
    L11:
        r3 = r10;
        goto L12
    }

    @tb1
    public final Activity getActivity() {
        return this.activity;
    }

    @aa1
    public final PFMedium getDistanceUnit() {
        PFMedium r0 = this.distanceUnit;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("distanceUnit");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    @aa1
    public final DINCondBold getTvTemperature() {
        DINCondBold r0 = this.tvTemperature;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tvTemperature");
        return null;
    }

    @aa1
    public final DINCondBold getTvWeatherTime() {
        DINCondBold r0 = this.tvWeatherTime;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tvWeatherTime");
        return null;
    }

    @aa1
    public final AppUser getUserProfile() {
        AppUser r0 = this.userProfile;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("userProfile");
        return null;
    }

    @aa1
    public String getWeatherDateTimeString() {
        long r0 = System.currentTimeMillis();
        r0 = a01.OXO1.iO().getLong(b01.iIXi1iiXI, System.currentTimeMillis());     // Catch: Exception -> L6
    L4:
        String r1 = O0X11OiO.X1(false, 1, null).format(Long.valueOf(r0));
        Intrinsics.O10IXXX0X(r1, "format(...)");
        return r1;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r2 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L6;
        r1 = r2;
    L6:
        setUserProfile((AppUser) r1);
        updateActivity();
        updateWeather();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_step;
    }

    @sf5(tag = I01XX0.OXO1)
    public final void onActivityChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onActivityChanged"});
        updateActivity();
    }

    @sf5(tag = I01XX0.IiiXiI0I)
    public final void onUnitChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onUnitChange"});
        initView();
    }

    @sf5(tag = I01XX0.IO)
    public final void onWeatherRealtimeChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onWeatherRealtimeChanged"});
        updateWeather();
    }

    public final void setActivity(@tb1 Activity r1) {
        this.activity = r1;
    }

    public final void setDistanceUnit(@aa1 PFMedium r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.distanceUnit = r2;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }

    public final void setTvTemperature(@aa1 DINCondBold r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tvTemperature = r2;
    }

    public final void setTvWeatherTime(@aa1 DINCondBold r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tvWeatherTime = r2;
    }

    public final void setUserProfile(@aa1 AppUser r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.userProfile = r2;
    }

    public void updateActivity() {
        getDistanceUnit().setText(cp5.XX0(getUserProfile().getUnit()));
        long[] r1 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        Activity r2 = this.mActivityDao.getActivity(r1[0], r1[1]);
        if (r2 != null) goto L5;
        r2 = new Activity(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 1023, null);
    L5:
        this.activity = r2;
        DINCondBold r3 = this.tvCalorie;
        if (r3 != null) goto L8;
        Intrinsics.XXO("tvCalorie");
        r3 = null;
    L8:
        Activity r4 = this.activity;
        Intrinsics.XXI(r4);
        r3.setText(String.valueOf(r4.getMCalorie() / 10000));
        DINCondBold r5 = this.tvDistance;
        if (r5 != null) goto L11;
        Intrinsics.XXO("tvDistance");
        r5 = null;
    L11:
        Activity r6 = this.activity;
        Intrinsics.XXI(r6);
        r5.setText(cp5.IIX1OXO(r6.getMDistance() / 10000, getUserProfile().getUnit(), false, 4, null));
        if (q62.OXO1.O00OXOXO() == true) goto L14;
        return;
    L14:
        if (a01.OXO1.IiI10X().getBoolean(b01.IXI, true) == false) goto L18;
        OXO1 r7 = OXO1.XOO0ii0.OXO1();
        Activity r8 = this.activity;
        Intrinsics.XXI(r8);
        int r9 = r8.getMStep();
        Activity r10 = this.activity;
        Intrinsics.XXI(r10);
        OXO1.I1XOi1(r7, r9, r10.getMCalorie() / 10000, null, 4, null);
        return;
    }

    public void updateWeather() {
        q62 r0 = q62.OXO1;
        ImageView r3 = null;
        if (r0.iiX0i1IX() == false) goto L51;
        i72 r1 = i72.OXO1;
        if (r1.IX() == false) goto L51;
        ImageView r5 = this.ivWeather;
        if (r5 != null) goto L9;
        Intrinsics.XXO("ivWeather");
        r5 = null;
    L9:
        Object r6 = r5.getParent();
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type android.view.View");
        ((View) r6).setVisibility(0);
        if (r0.i0IX1() == false) goto L22;
        BleWeatherRealtime2 r2 = (BleWeatherRealtime2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME2, BleWeatherRealtime2.class, null, 4, null);
        if (r2 == null) goto L31;
        BleWeather2 r7 = r2.getMWeather();
        if (r7 == null) goto L16;
        int r8 = r7.getMWeatherCode();
    L17:
        BleWeather2 r4 = r2.getMWeather();
        if (r4 == null) goto L20;
        int r9 = r4.getMCurrentTemperature();
    L21:
        boolean r10 = true;
    L32:
        if (r10 == true) goto L39;
        ImageView r11 = this.ivWeather;
        if (r11 != null) goto L36;
        Intrinsics.XXO("ivWeather");
    L37:
        r3.setImageResource(R.drawable.ic_weather0);
        getTvTemperature().setVisibility(4);
        getTvWeatherTime().setVisibility(4);
        return;
    L36:
        r3 = r11;
        goto L37
    L39:
        ImageView r12 = this.ivWeather;
        if (r12 != null) goto L42;
        Intrinsics.XXO("ivWeather");
    L43:
        r3.setImageResource(UtilsKt.iOiXi11II(getMContext(), r8));
        DINCondBold r13 = getTvTemperature();
        if (cp5.II1Xi0(getUserProfile().getUnit()) != 1) goto L46;
        String r14 = getMContext().getString(R.string.d_fahrenheit_centigrade, new Object[]{Float.valueOf(cp5.I0iXXO(r9))});
    L47:
        r13.setText(r14);
        getTvTemperature().setVisibility(0);
        if (r1.IXiOXO() == false) goto L57;
        getTvWeatherTime().setText(getWeatherDateTimeString());
        getTvWeatherTime().setVisibility(0);
        return;
    L57:
        return;
    L46:
        r14 = getMContext().getString(R.string.d_degree_centigrade, new Object[]{Integer.valueOf(r9)});
        goto L47
    L42:
        r3 = r12;
    L20:
        r9 = 0;
        goto L21
    L16:
        r8 = 0;
    L31:
        r9 = 0;
        r8 = 0;
        r10 = false;
        goto L32
    L22:
        BleWeatherRealtime r15 = (BleWeatherRealtime) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME, BleWeatherRealtime.class, null, 4, null);
        if (r15 == null) goto L31;
        BleWeather r16 = r15.getMWeather();
        if (r16 == null) goto L27;
        r8 = r16.getMWeatherCode();
    L28:
        BleWeather r17 = r15.getMWeather();
        if (r17 == null) goto L20;
        r9 = r17.getMCurrentTemperature();
        goto L21
    L27:
        r8 = 0;
    L51:
        ImageView r18 = this.ivWeather;
        if (r18 != null) goto L54;
        Intrinsics.XXO("ivWeather");
    L55:
        Object r19 = r3.getParent();
        Intrinsics.X1ii(r19, "null cannot be cast to non-null type android.view.View");
        ((View) r19).setVisibility(8);
        return;
    L54:
        r3 = r18;
        goto L55
    }

    public final void weatherDetailsEvent() {
        if (q62.OXO1.i0IX1() == false) goto L11;
        if (((BleWeatherRealtime2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME2, BleWeatherRealtime2.class, null, 4, null)) == null) goto L8;
        ContextCompat.startActivity(getMContext(), new Intent(getMContext(), Weather2Activity.class), new Bundle());
        return;
    L8:
        ToastUtils.showLong(R.string.no_weather);
        return;
    L11:
        if (((BleWeatherRealtime) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME, BleWeatherRealtime.class, null, 4, null)) == null) goto L14;
        ContextCompat.startActivity(getMContext(), new Intent(getMContext(), WeatherActivity.class), new Bundle());
        return;
    L14:
        ToastUtils.showLong(R.string.no_weather);
    }
}
