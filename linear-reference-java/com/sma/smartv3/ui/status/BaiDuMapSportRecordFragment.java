package com.sma.smartv3.ui.status;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.I0X1ii;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.e40;
import com.android.mltcode.paycertificationapi.iI1iXIi;
import com.android.mltcode.paycertificationapi.iOXO11i1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.zo5;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.PolylineOptions;
import com.baidu.mapapi.map.TextOptions;
import com.baidu.mapapi.map.TextureMapView;
import com.baidu.mapapi.model.LatLng;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBaiDuMapSportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaiDuMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,221:1\n19#2:222\n15#2:223\n*S KotlinDebug\n*F\n+ 1 BaiDuMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment\n*L\n26#1:222\n26#1:223\n*E\n"})
public final class BaiDuMapSportRecordFragment extends BaseFragment {

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final Lazy mMapView$delegate;

    @tb1
    private NestedScrollView view;

    public BaiDuMapSportRecordFragment() {
        this.mMapView$delegate = LazyKt__LazyJVMKt.iO(new I0X1ii(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ void XIi00iiXO(BaiDuMapSportRecordFragment r0, MotionEvent r1) {
        showMapContent$lambda$2(r0, r1);
    }

    private final TextureMapView getMMapView() {
        return (TextureMapView) getValue();
    }

    public static /* synthetic */ TextureMapView iO(BaiDuMapSportRecordFragment r0) {
        return mMapView_delegate$lambda$0(r0);
    }

    private static final TextureMapView mMapView_delegate$lambda$0(BaiDuMapSportRecordFragment r1) {
        return (TextureMapView) r1.getMView().findViewById(R.id.mapView);
    }

    private final void setCustomerMakerIcon(BaiduMap r2, LatLng r3, Bitmap r4) {
        r2.addOverlay(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(r4)).zIndex(9).position(r3));
    }

    private final void setTextMakers(BaiduMap r9, ArrayList<CustomLatLng> r10) {
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

    public static /* synthetic */ void showMapContent$default(BaiDuMapSportRecordFragment r0, ArrayList r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        r0.showMapContent(r1, r2);
    }

    private static final void showMapContent$lambda$2(BaiDuMapSportRecordFragment r1, MotionEvent r2) {
        if (r2.getAction() != 1) goto L8;
        NestedScrollView r3 = r1.view;
        if (r3 == null) goto L12;
        r3.requestDisallowInterceptTouchEvent(false);
        return;
    L12:
        return;
    L8:
        NestedScrollView r4 = r1.view;
        if (r4 == null) goto L13;
        r4.requestDisallowInterceptTouchEvent(true);
        return;
    }

    @aa1
    public final BaiduMap getBaiDuMap() {
        BaiduMap r0 = getMMapView().getMap();
        Intrinsics.O10IXXX0X(r0, "getMap(...)");
        return r0;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        Serializable r0 = getMArg3();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.model.CustomLatLng>");
        showMapContent$default(this, (ArrayList) r0, false, 2, null);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_baidu_map_sport_record;
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

    public final void showMapContent(@aa1 ArrayList<CustomLatLng> r12, boolean r13) {
        Intrinsics.X0O(r12, "tmpLocationList");
        int r3 = 0;
        if (r13 == false) goto L15;
        BaiduMap r14 = getMMapView().getMap();
        r14.clear();
        if (r12.isEmpty() == false) goto L7;
        return;
    L7:
        if (r12.size() < 2) goto L30;
        r14.setMapStatus(iOXO11i1.XIi00iiXO(r12));
        r14.clear();
        ArrayList r2 = new ArrayList();
        int r4 = r12.size();
        int r5 = 0;
    L10:
        if (r5 >= r4) goto L12;
        r2.add(new LatLng(r12.get(r5).getLatitude(), r12.get(r5).getLongitude()));
        r5 = r5 + 1;
        goto L10
    L12:
        PolylineOptions r1 = new PolylineOptions().width(16).color(ContextCompat.getColor(getMActivity(), R.color.map_track_color)).points(r2);
        Intrinsics.O10IXXX0X(r1, "points(...)");
        r14.addOverlay(r1);
        int r0 = r12.size();
    L13:
        if (r3 >= r0) goto L32;
        TextOptions r6 = new TextOptions().text(String.valueOf(r3)).bgColor(-65536).fontSize(44).fontColor(ViewCompat.MEASURED_STATE_MASK).rotate(-30.0f).position(new LatLng(r12.get(r3).getLatitude(), r12.get(r3).getLongitude()));
        Intrinsics.O10IXXX0X(r6, "position(...)");
        r14.addOverlay(r6);
        r3 = r3 + 1;
        goto L13
    L32:
        return;
    L30:
        return;
    L15:
        TextureMapView r15 = getMMapView();
        r15.showZoomControls(false);
        r15.showScaleControl(false);
        BaiduMap r16 = getMMapView().getMap();
        r16.setCompassEnable(false);
        if (r12.isEmpty() == false) goto L18;
        return;
    L18:
        if (r12.size() < 2) goto L31;
        r16.setMapStatus(iOXO11i1.XIi00iiXO(r12));
        r16.setMapStatus(MapStatusUpdateFactory.newLatLngBounds(iOXO11i1.OXO1(r12), getMMapView().getWidth(), getMMapView().getHeight()));
        r16.setMapStatus(MapStatusUpdateFactory.zoomTo(e40.XIi00iiXO(r12)));
        r16.setOnMapTouchListener(new iI1iXIi(this));
        ArrayList r7 = new ArrayList();
        int r8 = r12.size();
    L21:
        if (r3 >= r8) goto L23;
        r7.add(new LatLng(r12.get(r3).getLatitude(), r12.get(r3).getLongitude()));
        r3 = r3 + 1;
        goto L21
    L23:
        PolylineOptions r9 = new PolylineOptions().width(12).color(ContextCompat.getColor(getMActivity(), R.color.map_track_color)).points(r7);
        Intrinsics.O10IXXX0X(r9, "points(...)");
        r16.addOverlay(r9);
        Intrinsics.XXI(r16);
        setCustomerMakerIcon(r16, new LatLng(((CustomLatLng) CollectionsKt___CollectionsKt.IIII0iI(r12)).getLatitude(), ((CustomLatLng) CollectionsKt___CollectionsKt.IIII0iI(r12)).getLongitude()), R.drawable.sport_start);
        setCustomerMakerIcon(r16, new LatLng(((CustomLatLng) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getLatitude(), ((CustomLatLng) CollectionsKt___CollectionsKt.Xi1XO00(r12)).getLongitude()), R.drawable.sport_end);
        return;
    }

    private final void setCustomerMakerIcon(BaiduMap r2, LatLng r3, int r4) {
        BitmapDescriptor r5 = BitmapDescriptorFactory.fromResource(r4);
        MarkerOptions r6 = new MarkerOptions().position(r3).icon(r5).draggable(false).flat(true).alpha(0.5f);
        Intrinsics.O10IXXX0X(r6, "alpha(...)");
        r2.addOverlay(r6);
    }
}
