package com.sma.smartv3.p610ui.status;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
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
import com.sma.smartv3.p610ui.status.GoogleMapSportRecordFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nGoogleMapSportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/GoogleMapSportRecordFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,156:1\n19#2:157\n15#2:158\n*S KotlinDebug\n*F\n+ 1 GoogleMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/GoogleMapSportRecordFragment\n*L\n33#1:157\n33#1:158\n*E\n"})
public final class GoogleMapSportRecordFragment extends BaseFragment {

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final Lazy mMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiXOOiII1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GoogleMapSportRecordFragment.mMapView_delegate$lambda$0(this.f3787IO);
        }
    });
    private GoogleMap map;
    private NestedScrollView view;

    public static final class OXO1 implements OnMapReadyCallback {
        public OXO1() {
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public void onMapReady(GoogleMap googleMap) {
            Intrinsics.X0O(googleMap, "googleMap");
            MapsInitializer.initialize(GoogleMapSportRecordFragment.this.getMActivity());
            GoogleMapSportRecordFragment.this.map = googleMap;
            GoogleMapSportRecordFragment googleMapSportRecordFragment = GoogleMapSportRecordFragment.this;
            Serializable mArg3 = googleMapSportRecordFragment.getMArg3();
            Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.model.CustomLatLng>");
            googleMapSportRecordFragment.showMapContent((ArrayList) mArg3);
        }
    }

    public static final class XIi00iiXO implements CustomGoogleMapView.OXO1 {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.view.CustomGoogleMapView.OXO1
        public void OXO1(MotionEvent motionEvent) {
            Intrinsics.X0O(motionEvent, "motionEvent");
            NestedScrollView nestedScrollView = null;
            if (motionEvent.getAction() == 1) {
                NestedScrollView nestedScrollView2 = GoogleMapSportRecordFragment.this.view;
                if (nestedScrollView2 == null) {
                    Intrinsics.XXO("view");
                } else {
                    nestedScrollView = nestedScrollView2;
                }
                nestedScrollView.requestDisallowInterceptTouchEvent(false);
                return;
            }
            NestedScrollView nestedScrollView3 = GoogleMapSportRecordFragment.this.view;
            if (nestedScrollView3 == null) {
                Intrinsics.XXO("view");
            } else {
                nestedScrollView = nestedScrollView3;
            }
            nestedScrollView.requestDisallowInterceptTouchEvent(true);
        }
    }

    public GoogleMapSportRecordFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    private final CustomGoogleMapView getMMapView() {
        return (CustomGoogleMapView) this.mMapView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomGoogleMapView mMapView_delegate$lambda$0(GoogleMapSportRecordFragment googleMapSportRecordFragment) {
        return (CustomGoogleMapView) googleMapSportRecordFragment.getMView().findViewById(R.id.mapView);
    }

    private final void setCustomerMakerIcon(GoogleMap googleMap, LatLng latLng, Bitmap bitmap) {
        MarkerOptions markerOptionsPosition = new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(bitmap)).zIndex(9.0f).position(latLng);
        Intrinsics.O10IXXX0X(markerOptionsPosition, "position(...)");
        googleMap.addMarker(markerOptionsPosition);
    }

    private final void setTextMakers(GoogleMap googleMap, ArrayList<CustomLatLng> arrayList) {
        Context context = getContext();
        Intrinsics.XXI(context);
        zo5 zo5Var = new zo5(context, R.layout.map_markers_text);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            LatLng latLng = new LatLng(arrayList.get(i).getLatitude(), arrayList.get(i).getLongitude());
            i++;
            setCustomerMakerIcon(googleMap, latLng, zo5Var.XIi00iiXO(String.valueOf(i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMapContent(ArrayList<CustomLatLng> arrayList) {
        GoogleMap googleMap = this.map;
        if (googleMap == null) {
            Intrinsics.XXO("map");
            googleMap = null;
        }
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(X0IO1OOi.XIi00iiXO(arrayList), e40.XIi00iiXO(arrayList) - 1.0f));
        PolylineOptions polylineOptions = new PolylineOptions();
        Iterator<CustomLatLng> it = arrayList.iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        while (it.hasNext()) {
            CustomLatLng next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            CustomLatLng customLatLng = next;
            polylineOptions.add(new LatLng(customLatLng.getLatitude(), customLatLng.getLongitude()));
        }
        polylineOptions.width(12.0f);
        polylineOptions.color(ContextCompat.getColor(getMActivity(), R.color.map_track_color));
        googleMap.addPolyline(polylineOptions);
        googleMap.addMarker(new MarkerOptions().position(new LatLng(((CustomLatLng) CollectionsKt___CollectionsKt.IIII0iI(arrayList)).getLatitude(), ((CustomLatLng) CollectionsKt___CollectionsKt.IIII0iI(arrayList)).getLongitude())).icon(BitmapDescriptorFactory.fromResource(R.drawable.sport_start)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(((CustomLatLng) CollectionsKt___CollectionsKt.Xi1XO00(arrayList)).getLatitude(), ((CustomLatLng) CollectionsKt___CollectionsKt.Xi1XO00(arrayList)).getLongitude())).icon(BitmapDescriptorFactory.fromResource(R.drawable.sport_end)));
        getMMapView().setOnMapTouchListener(new XIi00iiXO());
    }

    @aa1
    public final GoogleMap getGoogleMap() {
        GoogleMap googleMap = this.map;
        if (googleMap != null) {
            return googleMap;
        }
        Intrinsics.XXO("map");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        CustomGoogleMapView mMapView = getMMapView();
        mMapView.onCreate(null);
        mMapView.getMapAsync(new OXO1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
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

    public final void setOnMapTouchListener(@aa1 NestedScrollView nestedScrollView) {
        Intrinsics.X0O(nestedScrollView, "nestedScrollView");
        this.view = nestedScrollView;
    }
}
