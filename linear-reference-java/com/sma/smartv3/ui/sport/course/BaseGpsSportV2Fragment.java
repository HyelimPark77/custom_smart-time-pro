package com.sma.smartv3.ui.sport.course;

import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.XO0i;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.iiXOIO;
import com.android.mltcode.paycertificationapi.iiiIO100i;
import com.android.mltcode.paycertificationapi.ms;
import com.android.mltcode.paycertificationapi.ns;
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
import com.google.android.gms.maps.model.Marker;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseGpsSportV2Fragment extends BaseSportV2Fragment {
    private int curIcon;
    private boolean isInChinaMainland;

    @aa1
    private final Lazy mBMapView$delegate;
    private BaiduMap mBaiDuMap;

    @tb1
    private Overlay mBaiduCreateIcon;

    @aa1
    private final Lazy mGMapView$delegate;

    @tb1
    private Marker mGoogleCreateIcon;
    private GoogleMap mGoogleMap;

    @tb1
    private ms mLocationClient;
    private final float mapZoomDefault;

    public static final class OXO1 implements IO0OI {
        public final /* synthetic */ BaseGpsSportV2Fragment OXO1;

        public OXO1(BaseGpsSportV2Fragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(CustomLocation r2) {
            Intrinsics.X0O(r2, "location");
            BaseGpsSportV2Fragment.access$moveCameraMap(this.OXO1, r2);
            BaseGpsSportV2Fragment.access$stopLocationClient(this.OXO1);
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(String r2) {
            Intrinsics.X0O(r2, "message");
        }
    }

    public BaseGpsSportV2Fragment() {
        this.mGMapView$delegate = LazyKt__LazyJVMKt.iO(new XO0i(this));
        this.mBMapView$delegate = LazyKt__LazyJVMKt.iO(new iiXOIO(this));
        this.isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
        this.mapZoomDefault = 18.0f;
        this.curIcon = R.drawable.icon_sport_map_start;
    }

    public static /* synthetic */ void I1(CustomGoogleMapView r0, BaseGpsSportV2Fragment r1, GoogleMap r2) {
        onLocationWhere$lambda$1$0(r0, r1, r2);
    }

    public static /* synthetic */ CustomGoogleMapView OX(BaseGpsSportV2Fragment r0) {
        return mGMapView_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$moveCameraMap(BaseGpsSportV2Fragment r0, CustomLocation r1) {
        r0.moveCameraMap(r1);
    }

    public static final /* synthetic */ void access$stopLocationClient(BaseGpsSportV2Fragment r0) {
        r0.stopLocationClient();
    }

    private final Overlay createBaiduIcon(int r3, LatLng r4, boolean r5) {
        BaiduMap r0 = this.mBaiDuMap;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mBaiDuMap");
        r0 = null;
    L5:
        MarkerOptions r6 = new MarkerOptions().position(r4).icon(BitmapDescriptorFactory.fromResource(r3)).draggable(false).flat(true).zIndex(9);
        if (r5 == false) goto L8;
        r6.anchor(0.5f, 0.5f);
    L8:
        Overlay r7 = r0.addOverlay(r6);
        Intrinsics.O10IXXX0X(r7, "addOverlay(...)");
        return r7;
    }

    public static /* synthetic */ Overlay createBaiduIcon$default(BaseGpsSportV2Fragment r0, int r1, LatLng r2, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = false;
    L7:
        return r0.createBaiduIcon(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBaiduIcon");
    }

    private final TextureMapView getMBMapView() {
        return (TextureMapView) getValue();
    }

    private final CustomGoogleMapView getMGMapView() {
        return (CustomGoogleMapView) getValue();
    }

    public static /* synthetic */ TextureMapView iOOX010X(BaseGpsSportV2Fragment r0) {
        return mBMapView_delegate$lambda$0(r0);
    }

    private static final TextureMapView mBMapView_delegate$lambda$0(BaseGpsSportV2Fragment r1) {
        return (TextureMapView) r1.getMView().findViewById(R.id.bMapView);
    }

    private static final CustomGoogleMapView mGMapView_delegate$lambda$0(BaseGpsSportV2Fragment r1) {
        return (CustomGoogleMapView) r1.getMView().findViewById(R.id.gMapView);
    }

    private final void moveCameraMap(CustomLocation r8) {
        GoogleMap r1 = null;
        BaiduMap r2 = null;
        if (this.isInChinaMainland == false) goto L26;
        Overlay r0 = this.mBaiduCreateIcon;
        if (r0 == null) goto L7;
        r0.remove();
    L7:
        this.mBaiduCreateIcon = createBaiduIcon(this.curIcon, new LatLng(r8.XO0O10(), r8.IiI10X()), true);
        BaiduMap r3 = this.mBaiDuMap;
        if (r3 != null) goto L10;
        Intrinsics.XXO("mBaiDuMap");
    L11:
        r2.setMapStatus(MapStatusUpdateFactory.newLatLngZoom(new LatLng(r8.XO0O10(), r8.IiI10X()), this.mapZoomDefault));
        return;
    L10:
        r2 = r3;
        goto L11
    L26:
        GoogleMap r4 = this.mGoogleMap;     // Catch: Exception -> L16
        if (r4 != null) goto L18;
        Intrinsics.XXO("mGoogleMap");     // Catch: Exception -> L16
    L19:
        com.google.android.gms.maps.model.LatLng r5 = new com.google.android.gms.maps.model.LatLng(r8.XO0O10(), r8.IiI10X());     // Catch: Exception -> L16
        r1.animateCamera(CameraUpdateFactory.newLatLngZoom(r5, this.mapZoomDefault));     // Catch: Exception -> L16
        Marker r9 = this.mGoogleCreateIcon;     // Catch: Exception -> L16
        if (r9 == null) goto L22;
        r9.remove();     // Catch: Exception -> L16
    L22:
        this.mGoogleCreateIcon = r1.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(r5).anchor(0.5f, 0.5f).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(this.curIcon)));     // Catch: Exception -> L16
        return;
    L18:
        r1 = r4;
    L16:
        e = move-exception;
        e.printStackTrace();
    }

    private static final void onLocationWhere$lambda$1$0(CustomGoogleMapView r1, BaseGpsSportV2Fragment r2, GoogleMap r3) {
        Intrinsics.X0O(r3, "googleMap");
        MapsInitializer.initialize(r1.getContext());
        r2.mGoogleMap = r3;
        if (r3 != null) goto L5;
        Intrinsics.XXO("mGoogleMap");
        r3 = null;
    L5:
        r3.getUiSettings().setAllGesturesEnabled(false);
    }

    private final void stopLocationClient() {
        ms r0 = this.mLocationClient;
        if (r0 == null) goto L6;
        r0.I0IIOi();
        return;
    }

    @Override // com.sma.smartv3.ui.sport.course.BaseSportV2Fragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        onLocationWhere(new Object());
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.isInChinaMainland == false) goto L9;
        getMBMapView().onDestroy();
        return;
    L9:
        getMGMapView().onDestroy();     // Catch: Exception -> L8
        return;
    }

    @sf5(tag = b01.XiOIO)
    public final void onLocationWhere(@aa1 Object r9) {
        Intrinsics.X0O(r9, "data");
        this.isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
        CustomLocation r10 = UtilsKt.XXIIO1i11();
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getMActivity()) != 0) goto L5;
        boolean r0 = true;
    L7:
        if (this.isInChinaMainland == false) goto L9;
        getMBMapView().setVisibility(0);
        getMBMapView().showZoomControls(false);
        getMBMapView().showScaleControl(false);
        getMBMapView().setLogoPosition(LogoPosition.logoPostionRightTop);
        BaiduMap r1 = getMBMapView().getMap();
        r1.setCompassEnable(false);
        r1.getUiSettings().setAllGesturesEnabled(false);
        Intrinsics.O10IXXX0X(r1, "apply(...)");
        this.mBaiDuMap = r1;
    L12:
        if (BleConnector.INSTANCE.isBound() == false) goto L25;
        LogUtils.v(new Object[]{"onLocationWhere"});
        if (r10.XO0O10() == 0.0d) goto L16;
    L20:
        moveCameraMap(r10);
        return;
    L16:
        if (r10.IiI10X() != 0.0d) goto L20;
        ms r11 = ns.XIi00iiXO(new OXO1(this), false, 2, null);
        this.mLocationClient = r11;
        if (r11 == null) goto L26;
        r11.IiI10X(R.string.show_map_and_phone_get_location_desc, false);
        return;
    L26:
        return;
    L25:
        return;
    L9:
        if (r0 == false) goto L12;
        final CustomGoogleMapView r2 = getMGMapView();     // Catch: Exception -> L22
        r2.setVisibility(0);     // Catch: Exception -> L22
        r2.onCreate(null);     // Catch: Exception -> L22
        r2.getMapAsync(new iiiIO100i(r2, this));     // Catch: Exception -> L22
        goto L12
    L5:
        r0 = false;
        goto L7
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.isInChinaMainland == false) goto L9;
        getMBMapView().onPause();
        return;
    L9:
        getMGMapView().onPause();     // Catch: Exception -> L8
        return;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isInChinaMainland == false) goto L9;
        getMBMapView().onResume();
        return;
    L9:
        getMGMapView().onResume();     // Catch: Exception -> L8
        return;
    }
}
