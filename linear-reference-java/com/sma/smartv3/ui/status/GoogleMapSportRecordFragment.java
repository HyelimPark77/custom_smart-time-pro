package com.sma.smartv3.ui.status;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.OiXOOiII1;
import com.android.mltcode.paycertificationapi.X0IO1OOi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.e40;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.zo5;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.SPUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nGoogleMapSportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/GoogleMapSportRecordFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,156:1\n19#2:157\n15#2:158\n*S KotlinDebug\n*F\n+ 1 GoogleMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/GoogleMapSportRecordFragment\n*L\n33#1:157\n33#1:158\n*E\n"})
public final class GoogleMapSportRecordFragment extends BaseFragment {

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final Lazy mMapView$delegate;
    private GoogleMap map;
    private NestedScrollView view;

    public static final class OXO1 implements OnMapReadyCallback {
        public final /* synthetic */ GoogleMapSportRecordFragment OXO1;

        public OXO1(GoogleMapSportRecordFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public void onMapReady(GoogleMap r3) {
            Intrinsics.X0O(r3, "googleMap");
            MapsInitializer.initialize(GoogleMapSportRecordFragment.access$getMActivity(this.OXO1));
            GoogleMapSportRecordFragment.access$setMap$p(this.OXO1, r3);
            GoogleMapSportRecordFragment r4 = this.OXO1;
            Serializable r0 = r4.getMArg3();
            Intrinsics.X1ii(r0, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.model.CustomLatLng>");
            GoogleMapSportRecordFragment.access$showMapContent(r4, (ArrayList) r0);
        }
    }

    public static final class XIi00iiXO implements CustomGoogleMapView.OXO1 {
        public final /* synthetic */ GoogleMapSportRecordFragment OXO1;

        public XIi00iiXO(GoogleMapSportRecordFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.CustomGoogleMapView.OXO1
        public void OXO1(MotionEvent r4) {
            Intrinsics.X0O(r4, "motionEvent");
            NestedScrollView r0 = null;
            if (r4.getAction() != 1) goto L10;
            NestedScrollView r5 = GoogleMapSportRecordFragment.access$getView$p(this.OXO1);
            if (r5 != null) goto L7;
            Intrinsics.XXO("view");
        L8:
            r0.requestDisallowInterceptTouchEvent(false);
            return;
        L7:
            r0 = r5;
            goto L8
        L10:
            NestedScrollView r6 = GoogleMapSportRecordFragment.access$getView$p(this.OXO1);
            if (r6 != null) goto L13;
            Intrinsics.XXO("view");
        L14:
            r0.requestDisallowInterceptTouchEvent(true);
            return;
        L13:
            r0 = r6;
            goto L14
        }
    }

    public GoogleMapSportRecordFragment() {
        this.mMapView$delegate = LazyKt__LazyJVMKt.iO(new OiXOOiII1(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ CustomGoogleMapView XIi00iiXO(GoogleMapSportRecordFragment r0) {
        return mMapView_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ Activity access$getMActivity(GoogleMapSportRecordFragment r0) {
        return r0.getMActivity();
    }

    public static final /* synthetic */ NestedScrollView access$getView$p(GoogleMapSportRecordFragment r0) {
        return r0.view;
    }

    public static final /* synthetic */ void access$setMap$p(GoogleMapSportRecordFragment r0, GoogleMap r1) {
        r0.map = r1;
    }

    public static final /* synthetic */ void access$showMapContent(GoogleMapSportRecordFragment r0, ArrayList r1) {
        r0.showMapContent(r1);
    }

    private final CustomGoogleMapView getMMapView() {
        return (CustomGoogleMapView) getValue();
    }

    private static final CustomGoogleMapView mMapView_delegate$lambda$0(GoogleMapSportRecordFragment r1) {
        return (CustomGoogleMapView) r1.getMView().findViewById(R.id.mapView);
    }

    private final void setCustomerMakerIcon(GoogleMap r2, LatLng r3, Bitmap r4) {
        MarkerOptions r5 = new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(r4)).zIndex(9.0f).position(r3);
        Intrinsics.O10IXXX0X(r5, "position(...)");
        r2.addMarker(r5);
    }

    private final void setTextMakers(GoogleMap r9, ArrayList<CustomLatLng> r10) {
        Context r1 = getContext();
        Intrinsics.XXI(r1);
        zo5 r0 = new zo5(r1, R.layout.map_markers_text);
        int r2 = r10.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        LatLng r4 = new LatLng(r10.get(r3).getLatitude(), r10.get(r3).getLongitude());
        r3 = r3 + 1;
        setCustomerMakerIcon(r9, r4, r0.XIi00iiXO(String.valueOf(r3)));
        goto L3
    }

    private final void showMapContent(ArrayList<CustomLatLng> r10) {
        GoogleMap r0 = this.map;
        if (r0 != null) goto L5;
        Intrinsics.XXO("map");
        r0 = null;
    L5:
        r0.moveCamera(CameraUpdateFactory.newLatLngZoom(X0IO1OOi.XIi00iiXO(r10), e40.XIi00iiXO(r10) - 1.0f));
        PolylineOptions r1 = new PolylineOptions();
        Iterator<CustomLatLng> r2 = r10.iterator();
        Intrinsics.O10IXXX0X(r2, "iterator(...)");
    L7:
        if (r2.hasNext() == false) goto L9;
        CustomLatLng r3 = r2.next();
        Intrinsics.O10IXXX0X(r3, "next(...)");
        CustomLatLng r4 = r3;
        r1.add(new LatLng(r4.getLatitude(), r4.getLongitude()));
        goto L7
    L9:
        r1.width(12.0f);
        r1.color(ContextCompat.getColor(getMActivity(), R.color.map_track_color));
        r0.addPolyline(r1);
        r0.addMarker(new MarkerOptions().position(new LatLng(((CustomLatLng) CollectionsKt___CollectionsKt.IIII0iI(r10)).getLatitude(), ((CustomLatLng) CollectionsKt___CollectionsKt.IIII0iI(r10)).getLongitude())).icon(BitmapDescriptorFactory.fromResource(R.drawable.sport_start)));
        r0.addMarker(new MarkerOptions().position(new LatLng(((CustomLatLng) CollectionsKt___CollectionsKt.Xi1XO00(r10)).getLatitude(), ((CustomLatLng) CollectionsKt___CollectionsKt.Xi1XO00(r10)).getLongitude())).icon(BitmapDescriptorFactory.fromResource(R.drawable.sport_end)));
        getMMapView().setOnMapTouchListener(new XIi00iiXO(this));
    }

    @aa1
    public final GoogleMap getGoogleMap() {
        GoogleMap r0 = this.map;
        if (r0 != null) goto L6;
        Intrinsics.XXO("map");
        return null;
    L6:
        return r0;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        CustomGoogleMapView r0 = getMMapView();
        r0.onCreate(null);
        r0.getMapAsync(new OXO1(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_google_map_sport_record;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMMapView().onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getMMapView().onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getMMapView().onResume();
    }

    public final void setOnMapTouchListener(@aa1 NestedScrollView r2) {
        Intrinsics.X0O(r2, "nestedScrollView");
        this.view = r2;
    }
}
