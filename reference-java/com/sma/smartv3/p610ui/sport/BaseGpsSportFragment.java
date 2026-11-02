package com.sma.smartv3.p610ui.sport;

import com.android.mltcode.paycertificationapi.C2702ms;
import com.android.mltcode.paycertificationapi.C2743ns;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.LogoPosition;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.TextureMapView;
import com.baidu.mapapi.model.LatLng;
import com.blankj.utilcode.util.LogUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.p610ui.sport.BaseGpsSportFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseGpsSportFragment extends BaseSportFragment {
    private BaiduMap mBaiDuMap;
    private GoogleMap mGoogleMap;

    @tb1
    private C2702ms mLocationClient;

    @aa1
    private final Lazy mGMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Iii0iXIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseGpsSportFragment.mGMapView_delegate$lambda$0(this.f2320IO);
        }
    });

    @aa1
    private final Lazy mBMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXOI0i0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseGpsSportFragment.mBMapView_delegate$lambda$0(this.f3496IO);
        }
    });
    private boolean isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);

    public static final class OXO1 implements IO0OI {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(CustomLocation location) {
            Intrinsics.X0O(location, "location");
            GoogleMap googleMap = null;
            BaiduMap baiduMap = null;
            if (BaseGpsSportFragment.this.isInChinaMainland) {
                BaiduMap baiduMap2 = BaseGpsSportFragment.this.mBaiDuMap;
                if (baiduMap2 == null) {
                    Intrinsics.XXO("mBaiDuMap");
                } else {
                    baiduMap = baiduMap2;
                }
                baiduMap.setMapStatus(MapStatusUpdateFactory.newLatLng(new LatLng(location.XO0O10(), location.IiI10X())));
            } else {
                try {
                    GoogleMap googleMap2 = BaseGpsSportFragment.this.mGoogleMap;
                    if (googleMap2 == null) {
                        Intrinsics.XXO("mGoogleMap");
                    } else {
                        googleMap = googleMap2;
                    }
                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(new com.google.android.gms.maps.model.LatLng(location.XO0O10(), location.IiI10X())));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            BaseGpsSportFragment.this.stopLocationClient();
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(String message) {
            Intrinsics.X0O(message, "message");
        }
    }

    private final TextureMapView getMBMapView() {
        return (TextureMapView) this.mBMapView$delegate.getValue();
    }

    private final CustomGoogleMapView getMGMapView() {
        return (CustomGoogleMapView) this.mGMapView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureMapView mBMapView_delegate$lambda$0(BaseGpsSportFragment baseGpsSportFragment) {
        return (TextureMapView) baseGpsSportFragment.getMView().findViewById(R.id.bMapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomGoogleMapView mGMapView_delegate$lambda$0(BaseGpsSportFragment baseGpsSportFragment) {
        return (CustomGoogleMapView) baseGpsSportFragment.getMView().findViewById(R.id.gMapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLocationWhere$lambda$1$0(CustomGoogleMapView customGoogleMapView, BaseGpsSportFragment baseGpsSportFragment, GoogleMap googleMap) {
        Intrinsics.X0O(googleMap, "googleMap");
        MapsInitializer.initialize(customGoogleMapView.getContext());
        baseGpsSportFragment.mGoogleMap = googleMap;
        if (googleMap == null) {
            Intrinsics.XXO("mGoogleMap");
            googleMap = null;
        }
        googleMap.getUiSettings().setAllGesturesEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLocationClient() {
        C2702ms c2702ms = this.mLocationClient;
        if (c2702ms != null) {
            c2702ms.I0IIOi();
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        onLocationWhere(new Object());
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.isInChinaMainland) {
            getMBMapView().onDestroy();
        } else {
            try {
                getMGMapView().onDestroy();
            } catch (Exception unused) {
            }
        }
    }

    @sf5(tag = b01.XiOIO)
    public final void onLocationWhere(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        if (BleConnector.INSTANCE.isBound()) {
            LogUtils.m11131v("onLocationWhere");
            boolean z = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
            this.isInChinaMainland = z;
            if (z) {
                getMBMapView().setVisibility(0);
                getMBMapView().showZoomControls(false);
                getMBMapView().showScaleControl(false);
                getMBMapView().setLogoPosition(LogoPosition.logoPostionRightTop);
                BaiduMap map = getMBMapView().getMap();
                map.setCompassEnable(false);
                map.getUiSettings().setAllGesturesEnabled(false);
                Intrinsics.O10IXXX0X(map, "apply(...)");
                this.mBaiDuMap = map;
            } else {
                final CustomGoogleMapView mGMapView = getMGMapView();
                mGMapView.setVisibility(0);
                try {
                    mGMapView.onCreate(null);
                    mGMapView.getMapAsync(new OnMapReadyCallback() { // from class: com.android.mltcode.paycertificationapi.O1iII10OO
                        @Override // com.google.android.gms.maps.OnMapReadyCallback
                        public final void onMapReady(GoogleMap googleMap) {
                            BaseGpsSportFragment.onLocationWhere$lambda$1$0(mGMapView, this, googleMap);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            C2702ms c2702msXIi00iiXO = C2743ns.XIi00iiXO(new OXO1(), false, 2, null);
            this.mLocationClient = c2702msXIi00iiXO;
            if (c2702msXIi00iiXO != null) {
                c2702msXIi00iiXO.IiI10X(R.string.show_map_and_phone_get_location_desc, false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.isInChinaMainland) {
            getMBMapView().onPause();
        } else {
            try {
                getMGMapView().onPause();
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isInChinaMainland) {
            getMBMapView().onResume();
        } else {
            try {
                getMGMapView().onResume();
            } catch (Exception unused) {
            }
        }
    }
}
