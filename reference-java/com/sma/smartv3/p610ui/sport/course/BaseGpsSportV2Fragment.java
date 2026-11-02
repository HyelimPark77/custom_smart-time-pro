package com.sma.smartv3.p610ui.sport.course;

import com.android.mltcode.paycertificationapi.C2702ms;
import com.android.mltcode.paycertificationapi.C2743ns;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.LogoPosition;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.Overlay;
import com.baidu.mapapi.map.TextureMapView;
import com.baidu.mapapi.model.LatLng;
import com.blankj.utilcode.util.LogUtils;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.p610ui.sport.course.BaseGpsSportV2Fragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseGpsSportV2Fragment extends BaseSportV2Fragment {
    private BaiduMap mBaiDuMap;

    @tb1
    private Overlay mBaiduCreateIcon;

    @tb1
    private Marker mGoogleCreateIcon;
    private GoogleMap mGoogleMap;

    @tb1
    private C2702ms mLocationClient;

    @aa1
    private final Lazy mGMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseGpsSportV2Fragment.mGMapView_delegate$lambda$0(this.f4688IO);
        }
    });

    @aa1
    private final Lazy mBMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiXOIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseGpsSportV2Fragment.mBMapView_delegate$lambda$0(this.f8643IO);
        }
    });
    private boolean isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
    private final float mapZoomDefault = 18.0f;
    private int curIcon = R.drawable.icon_sport_map_start;

    public static final class OXO1 implements IO0OI {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(CustomLocation location) {
            Intrinsics.X0O(location, "location");
            BaseGpsSportV2Fragment.this.moveCameraMap(location);
            BaseGpsSportV2Fragment.this.stopLocationClient();
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(String message) {
            Intrinsics.X0O(message, "message");
        }
    }

    private final Overlay createBaiduIcon(int i, LatLng latLng, boolean z) {
        BaiduMap baiduMap = this.mBaiDuMap;
        if (baiduMap == null) {
            Intrinsics.XXO("mBaiDuMap");
            baiduMap = null;
        }
        MarkerOptions markerOptionsZIndex = new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.fromResource(i)).draggable(false).flat(true).zIndex(9);
        if (z) {
            markerOptionsZIndex.anchor(0.5f, 0.5f);
        }
        Overlay overlayAddOverlay = baiduMap.addOverlay(markerOptionsZIndex);
        Intrinsics.O10IXXX0X(overlayAddOverlay, "addOverlay(...)");
        return overlayAddOverlay;
    }

    public static /* synthetic */ Overlay createBaiduIcon$default(BaseGpsSportV2Fragment baseGpsSportV2Fragment, int i, LatLng latLng, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBaiduIcon");
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return baseGpsSportV2Fragment.createBaiduIcon(i, latLng, z);
    }

    private final TextureMapView getMBMapView() {
        return (TextureMapView) this.mBMapView$delegate.getValue();
    }

    private final CustomGoogleMapView getMGMapView() {
        return (CustomGoogleMapView) this.mGMapView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureMapView mBMapView_delegate$lambda$0(BaseGpsSportV2Fragment baseGpsSportV2Fragment) {
        return (TextureMapView) baseGpsSportV2Fragment.getMView().findViewById(R.id.bMapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomGoogleMapView mGMapView_delegate$lambda$0(BaseGpsSportV2Fragment baseGpsSportV2Fragment) {
        return (CustomGoogleMapView) baseGpsSportV2Fragment.getMView().findViewById(R.id.gMapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveCameraMap(CustomLocation customLocation) {
        GoogleMap googleMap = null;
        BaiduMap baiduMap = null;
        if (this.isInChinaMainland) {
            Overlay overlay = this.mBaiduCreateIcon;
            if (overlay != null) {
                overlay.remove();
            }
            this.mBaiduCreateIcon = createBaiduIcon(this.curIcon, new LatLng(customLocation.XO0O10(), customLocation.IiI10X()), true);
            BaiduMap baiduMap2 = this.mBaiDuMap;
            if (baiduMap2 == null) {
                Intrinsics.XXO("mBaiDuMap");
            } else {
                baiduMap = baiduMap2;
            }
            baiduMap.setMapStatus(MapStatusUpdateFactory.newLatLngZoom(new LatLng(customLocation.XO0O10(), customLocation.IiI10X()), this.mapZoomDefault));
            return;
        }
        try {
            GoogleMap googleMap2 = this.mGoogleMap;
            if (googleMap2 == null) {
                Intrinsics.XXO("mGoogleMap");
            } else {
                googleMap = googleMap2;
            }
            com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(customLocation.XO0O10(), customLocation.IiI10X());
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, this.mapZoomDefault));
            Marker marker = this.mGoogleCreateIcon;
            if (marker != null) {
                marker.remove();
            }
            this.mGoogleCreateIcon = googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(latLng).anchor(0.5f, 0.5f).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(this.curIcon)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLocationWhere$lambda$1$0(CustomGoogleMapView customGoogleMapView, BaseGpsSportV2Fragment baseGpsSportV2Fragment, GoogleMap googleMap) {
        Intrinsics.X0O(googleMap, "googleMap");
        MapsInitializer.initialize(customGoogleMapView.getContext());
        baseGpsSportV2Fragment.mGoogleMap = googleMap;
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

    @Override // com.sma.smartv3.p610ui.sport.course.BaseSportV2Fragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
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
        this.isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
        CustomLocation customLocationXXIIO1i11 = UtilsKt.XXIIO1i11();
        boolean z = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getMActivity()) == 0;
        if (this.isInChinaMainland) {
            getMBMapView().setVisibility(0);
            getMBMapView().showZoomControls(false);
            getMBMapView().showScaleControl(false);
            getMBMapView().setLogoPosition(LogoPosition.logoPostionRightTop);
            BaiduMap map = getMBMapView().getMap();
            map.setCompassEnable(false);
            map.getUiSettings().setAllGesturesEnabled(false);
            Intrinsics.O10IXXX0X(map, "apply(...)");
            this.mBaiDuMap = map;
        } else if (z) {
            try {
                final CustomGoogleMapView mGMapView = getMGMapView();
                mGMapView.setVisibility(0);
                mGMapView.onCreate(null);
                mGMapView.getMapAsync(new OnMapReadyCallback() { // from class: com.android.mltcode.paycertificationapi.iiiIO100i
                    @Override // com.google.android.gms.maps.OnMapReadyCallback
                    public final void onMapReady(GoogleMap googleMap) {
                        BaseGpsSportV2Fragment.onLocationWhere$lambda$1$0(mGMapView, this, googleMap);
                    }
                });
            } catch (Exception unused) {
            }
        }
        if (BleConnector.INSTANCE.isBound()) {
            LogUtils.m11131v("onLocationWhere");
            if (customLocationXXIIO1i11.XO0O10() != 0.0d || customLocationXXIIO1i11.IiI10X() != 0.0d) {
                moveCameraMap(customLocationXXIIO1i11);
                return;
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
