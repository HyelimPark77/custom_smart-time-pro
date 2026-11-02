package com.sma.smartv3.ui.sport;

import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.Iii0iXIO;
import com.android.mltcode.paycertificationapi.O1iII10OO;
import com.android.mltcode.paycertificationapi.OXOI0i0X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ms;
import com.android.mltcode.paycertificationapi.ns;
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
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseGpsSportFragment extends BaseSportFragment {
    private boolean isInChinaMainland;

    @aa1
    private final Lazy mBMapView$delegate;
    private BaiduMap mBaiDuMap;

    @aa1
    private final Lazy mGMapView$delegate;
    private GoogleMap mGoogleMap;

    @tb1
    private ms mLocationClient;

    public static final class OXO1 implements IO0OI {
        public final /* synthetic */ BaseGpsSportFragment OXO1;

        public OXO1(BaseGpsSportFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(CustomLocation r7) {
            Intrinsics.X0O(r7, "location");
            GoogleMap r1 = null;
            BaiduMap r2 = null;
            if (BaseGpsSportFragment.access$isInChinaMainland$p(this.OXO1) == false) goto L20;
            BaiduMap r0 = BaseGpsSportFragment.access$getMBaiDuMap$p(this.OXO1);
            if (r0 != null) goto L7;
            Intrinsics.XXO("mBaiDuMap");
        L8:
            r2.setMapStatus(MapStatusUpdateFactory.newLatLng(new LatLng(r7.XO0O10(), r7.IiI10X())));
        L18:
            BaseGpsSportFragment.access$stopLocationClient(this.OXO1);
            return;
        L7:
            r2 = r0;
            goto L8
        L20:
            GoogleMap r3 = BaseGpsSportFragment.access$getMGoogleMap$p(this.OXO1);     // Catch: Exception -> L12
            if (r3 != null) goto L14;
            Intrinsics.XXO("mGoogleMap");     // Catch: Exception -> L12
        L15:
            r1.moveCamera(CameraUpdateFactory.newLatLng(new com.google.android.gms.maps.model.LatLng(r7.XO0O10(), r7.IiI10X())));     // Catch: Exception -> L12
            goto L18
        L14:
            r1 = r3;
        L12:
            e = move-exception;
            e.printStackTrace();
            goto L18
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(String r2) {
            Intrinsics.X0O(r2, "message");
        }
    }

    public BaseGpsSportFragment() {
        this.mGMapView$delegate = LazyKt__LazyJVMKt.iO(new Iii0iXIO(this));
        this.mBMapView$delegate = LazyKt__LazyJVMKt.iO(new OXOI0i0X(this));
        this.isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
    }

    public static /* synthetic */ TextureMapView OiIIX101O(BaseGpsSportFragment r0) {
        return mBMapView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XX0(CustomGoogleMapView r0, BaseGpsSportFragment r1, GoogleMap r2) {
        onLocationWhere$lambda$1$0(r0, r1, r2);
    }

    public static final /* synthetic */ BaiduMap access$getMBaiDuMap$p(BaseGpsSportFragment r0) {
        return r0.mBaiDuMap;
    }

    public static final /* synthetic */ GoogleMap access$getMGoogleMap$p(BaseGpsSportFragment r0) {
        return r0.mGoogleMap;
    }

    public static final /* synthetic */ boolean access$isInChinaMainland$p(BaseGpsSportFragment r0) {
        return r0.isInChinaMainland;
    }

    public static final /* synthetic */ void access$stopLocationClient(BaseGpsSportFragment r0) {
        r0.stopLocationClient();
    }

    private final TextureMapView getMBMapView() {
        return (TextureMapView) getValue();
    }

    private final CustomGoogleMapView getMGMapView() {
        return (CustomGoogleMapView) getValue();
    }

    public static /* synthetic */ CustomGoogleMapView iIiiO(BaseGpsSportFragment r0) {
        return mGMapView_delegate$lambda$0(r0);
    }

    private static final TextureMapView mBMapView_delegate$lambda$0(BaseGpsSportFragment r1) {
        return (TextureMapView) r1.getMView().findViewById(R.id.bMapView);
    }

    private static final CustomGoogleMapView mGMapView_delegate$lambda$0(BaseGpsSportFragment r1) {
        return (CustomGoogleMapView) r1.getMView().findViewById(R.id.gMapView);
    }

    private static final void onLocationWhere$lambda$1$0(CustomGoogleMapView r1, BaseGpsSportFragment r2, GoogleMap r3) {
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

    @Override // com.sma.smartv3.ui.sport.BaseSportFragment, com.android.mltcode.paycertificationapi.k5
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
    public final void onLocationWhere(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        if (BleConnector.INSTANCE.isBound() == false) goto L18;
        LogUtils.v(new Object[]{"onLocationWhere"});
        boolean r5 = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
        this.isInChinaMainland = r5;
        if (r5 == false) goto L7;
        getMBMapView().setVisibility(0);
        getMBMapView().showZoomControls(false);
        getMBMapView().showScaleControl(false);
        getMBMapView().setLogoPosition(LogoPosition.logoPostionRightTop);
        BaiduMap r6 = getMBMapView().getMap();
        r6.setCompassEnable(false);
        r6.getUiSettings().setAllGesturesEnabled(false);
        Intrinsics.O10IXXX0X(r6, "apply(...)");
        this.mBaiDuMap = r6;
    L12:
        ms r7 = ns.XIi00iiXO(new OXO1(this), false, 2, null);
        this.mLocationClient = r7;
        if (r7 == null) goto L19;
        r7.IiI10X(R.string.show_map_and_phone_get_location_desc, false);
        return;
    L19:
        return;
    L7:
        final CustomGoogleMapView r8 = getMGMapView();
        r8.setVisibility(0);
        r8.onCreate(null);     // Catch: Exception -> L10
        r8.getMapAsync(new O1iII10OO(r8, this));     // Catch: Exception -> L10
    L10:
        e = move-exception;
        e.printStackTrace();
        goto L12
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
