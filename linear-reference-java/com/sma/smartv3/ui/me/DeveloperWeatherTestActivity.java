package com.sma.smartv3.ui.me;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.II00iOX0;
import com.android.mltcode.paycertificationapi.O11iOI;
import com.android.mltcode.paycertificationapi.X00iIX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.TextureMapView;
import com.baidu.mapapi.model.LatLng;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.initializer.WeatherInitializer;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes19.dex */
public final class DeveloperWeatherTestActivity extends BaseActivity {

    @aa1
    private final Lazy mMap$delegate;

    @aa1
    private final Lazy mMapView$delegate;

    public DeveloperWeatherTestActivity() {
        this.mMapView$delegate = LazyKt__LazyJVMKt.iO(new O11iOI(this));
        this.mMap$delegate = LazyKt__LazyJVMKt.iO(new X00iIX(this));
    }

    public static /* synthetic */ void I0iXXO(LatLng r0) {
        initView$lambda$0(r0);
    }

    public static /* synthetic */ BaiduMap OIX0iXi(DeveloperWeatherTestActivity r0) {
        return mMap_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextureMapView XXI(DeveloperWeatherTestActivity r0) {
        return mMapView_delegate$lambda$0(r0);
    }

    private final BaiduMap getMMap() {
        return (BaiduMap) getValue();
    }

    private final TextureMapView getMMapView() {
        return (TextureMapView) getValue();
    }

    private static final void initView$lambda$0(LatLng r13) {
        ToastUtils.showLong(r13.toString(), new Object[0]);
        BleCache r0 = BleCache.INSTANCE;
        BaseBleCache.remove$default(r0, BleKey.WEATHER_REALTIME, null, 2, null);
        BaseBleCache.remove$default(r0, BleKey.WEATHER_FORECAST, null, 2, null);
        BaseBleCache.remove$default(r0, BleKey.WEATHER_REALTIME2, null, 2, null);
        BaseBleCache.remove$default(r0, BleKey.WEATHER_FORECAST2, null, 2, null);
        BaseBleCache.remove$default(r0, BleKey.WEATHER_REALTIME3, null, 2, null);
        BaseBleCache.remove$default(r0, BleKey.WEATHER_FORECAST3, null, 2, null);
        WeatherInitializer r4 = WeatherInitializer.IO;
        WeatherInitializer.I1XOi1(r4, r13.longitude, r13.latitude, 0.0d, 4, null);
        r4.O10IXXX0X(r13.longitude, r13.latitude);
    }

    private static final TextureMapView mMapView_delegate$lambda$0(DeveloperWeatherTestActivity r1) {
        return (TextureMapView) r1.findViewById(R.id.mapView);
    }

    private static final BaiduMap mMap_delegate$lambda$0(DeveloperWeatherTestActivity r0) {
        return r0.getMMapView().getMap();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getMMap().setOnMapLongClickListener(new II00iOX0());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer_weater_test;
    }
}
