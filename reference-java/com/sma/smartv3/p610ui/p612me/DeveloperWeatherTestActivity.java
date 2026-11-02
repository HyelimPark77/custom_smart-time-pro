package com.sma.smartv3.p610ui.p612me;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.TextureMapView;
import com.baidu.mapapi.model.LatLng;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.initializer.WeatherInitializer;
import com.sma.smartv3.p610ui.p612me.DeveloperWeatherTestActivity;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final class DeveloperWeatherTestActivity extends BaseActivity {

    @aa1
    private final Lazy mMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O11iOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperWeatherTestActivity.mMapView_delegate$lambda$0(this.f2693IO);
        }
    });

    @aa1
    private final Lazy mMap$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X00iIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperWeatherTestActivity.mMap_delegate$lambda$0(this.f3895IO);
        }
    });

    private final BaiduMap getMMap() {
        return (BaiduMap) this.mMap$delegate.getValue();
    }

    private final TextureMapView getMMapView() {
        return (TextureMapView) this.mMapView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(LatLng latLng) {
        ToastUtils.showLong(latLng.toString(), new Object[0]);
        BleCache bleCache = BleCache.INSTANCE;
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME2, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST2, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_REALTIME3, null, 2, null);
        BaseBleCache.remove$default(bleCache, BleKey.WEATHER_FORECAST3, null, 2, null);
        WeatherInitializer weatherInitializer = WeatherInitializer.f51281IO;
        WeatherInitializer.I1XOi1(weatherInitializer, latLng.longitude, latLng.latitude, 0.0d, 4, null);
        weatherInitializer.O10IXXX0X(latLng.longitude, latLng.latitude);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureMapView mMapView_delegate$lambda$0(DeveloperWeatherTestActivity developerWeatherTestActivity) {
        return (TextureMapView) developerWeatherTestActivity.findViewById(R.id.mapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaiduMap mMap_delegate$lambda$0(DeveloperWeatherTestActivity developerWeatherTestActivity) {
        return developerWeatherTestActivity.getMMapView().getMap();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getMMap().setOnMapLongClickListener(new BaiduMap.OnMapLongClickListener() { // from class: com.android.mltcode.paycertificationapi.II00iOX0
            @Override // com.baidu.mapapi.map.BaiduMap.OnMapLongClickListener
            public final void onMapLongClick(LatLng latLng) {
                DeveloperWeatherTestActivity.initView$lambda$0(latLng);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_developer_weater_test;
    }
}
