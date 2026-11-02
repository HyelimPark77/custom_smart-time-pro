package com.sma.smartv3.p610ui.status;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.e40;
import com.android.mltcode.paycertificationapi.iOXO11i1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.zo5;
import com.baidu.mapapi.map.BaiduMap;
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
import com.sma.smartv3.p610ui.status.BaiDuMapSportRecordFragment;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBaiDuMapSportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaiDuMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,221:1\n19#2:222\n15#2:223\n*S KotlinDebug\n*F\n+ 1 BaiDuMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment\n*L\n26#1:222\n26#1:223\n*E\n"})
public final class BaiDuMapSportRecordFragment extends BaseFragment {

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final Lazy mMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0X1ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaiDuMapSportRecordFragment.mMapView_delegate$lambda$0(this.f1206IO);
        }
    });

    @tb1
    private NestedScrollView view;

    public BaiDuMapSportRecordFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    private final TextureMapView getMMapView() {
        return (TextureMapView) this.mMapView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureMapView mMapView_delegate$lambda$0(BaiDuMapSportRecordFragment baiDuMapSportRecordFragment) {
        return (TextureMapView) baiDuMapSportRecordFragment.getMView().findViewById(R.id.mapView);
    }

    private final void setCustomerMakerIcon(BaiduMap baiduMap, LatLng latLng, Bitmap bitmap) {
        baiduMap.addOverlay(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(bitmap)).zIndex(9).position(latLng));
    }

    private final void setTextMakers(BaiduMap baiduMap, ArrayList<CustomLatLng> arrayList) {
        Context context = getContext();
        Intrinsics.XXI(context);
        zo5 zo5Var = new zo5(context, R.layout.map_markers_text);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            LatLng latLng = new LatLng(arrayList.get(i).getLatitude(), arrayList.get(i).getLongitude());
            i++;
            setCustomerMakerIcon(baiduMap, latLng, zo5Var.XIi00iiXO(String.valueOf(i)));
        }
    }

    public static /* synthetic */ void showMapContent$default(BaiDuMapSportRecordFragment baiDuMapSportRecordFragment, ArrayList arrayList, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        baiDuMapSportRecordFragment.showMapContent(arrayList, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMapContent$lambda$2(BaiDuMapSportRecordFragment baiDuMapSportRecordFragment, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            NestedScrollView nestedScrollView = baiDuMapSportRecordFragment.view;
            if (nestedScrollView != null) {
                nestedScrollView.requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        NestedScrollView nestedScrollView2 = baiDuMapSportRecordFragment.view;
        if (nestedScrollView2 != null) {
            nestedScrollView2.requestDisallowInterceptTouchEvent(true);
        }
    }

    @aa1
    public final BaiduMap getBaiDuMap() {
        BaiduMap map = getMMapView().getMap();
        Intrinsics.O10IXXX0X(map, "getMap(...)");
        return map;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.model.CustomLatLng>");
        showMapContent$default(this, (ArrayList) mArg3, false, 2, null);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
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

    public final void setOnMapTouchListener(@aa1 NestedScrollView nestedScrollView) {
        Intrinsics.X0O(nestedScrollView, "nestedScrollView");
        this.view = nestedScrollView;
    }

    public final void showMapContent(@aa1 ArrayList<CustomLatLng> tmpLocationList, boolean z) {
        Intrinsics.X0O(tmpLocationList, "tmpLocationList");
        int i = 0;
        if (z) {
            BaiduMap map = getMMapView().getMap();
            map.clear();
            if (tmpLocationList.isEmpty() || tmpLocationList.size() < 2) {
                return;
            }
            map.setMapStatus(iOXO11i1.XIi00iiXO(tmpLocationList));
            map.clear();
            ArrayList arrayList = new ArrayList();
            int size = tmpLocationList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new LatLng(tmpLocationList.get(i2).getLatitude(), tmpLocationList.get(i2).getLongitude()));
            }
            PolylineOptions polylineOptionsPoints = new PolylineOptions().width(16).color(ContextCompat.getColor(getMActivity(), R.color.map_track_color)).points(arrayList);
            Intrinsics.O10IXXX0X(polylineOptionsPoints, "points(...)");
            map.addOverlay(polylineOptionsPoints);
            int size2 = tmpLocationList.size();
            while (i < size2) {
                TextOptions textOptionsPosition = new TextOptions().text(String.valueOf(i)).bgColor(-65536).fontSize(44).fontColor(ViewCompat.MEASURED_STATE_MASK).rotate(-30.0f).position(new LatLng(tmpLocationList.get(i).getLatitude(), tmpLocationList.get(i).getLongitude()));
                Intrinsics.O10IXXX0X(textOptionsPosition, "position(...)");
                map.addOverlay(textOptionsPosition);
                i++;
            }
            return;
        }
        TextureMapView mMapView = getMMapView();
        mMapView.showZoomControls(false);
        mMapView.showScaleControl(false);
        BaiduMap map2 = getMMapView().getMap();
        map2.setCompassEnable(false);
        if (tmpLocationList.isEmpty() || tmpLocationList.size() < 2) {
            return;
        }
        map2.setMapStatus(iOXO11i1.XIi00iiXO(tmpLocationList));
        map2.setMapStatus(MapStatusUpdateFactory.newLatLngBounds(iOXO11i1.OXO1(tmpLocationList), getMMapView().getWidth(), getMMapView().getHeight()));
        map2.setMapStatus(MapStatusUpdateFactory.zoomTo(e40.XIi00iiXO(tmpLocationList)));
        map2.setOnMapTouchListener(new BaiduMap.OnMapTouchListener() { // from class: com.android.mltcode.paycertificationapi.iI1iXIi
            @Override // com.baidu.mapapi.map.BaiduMap.OnMapTouchListener
            public final void onTouch(MotionEvent motionEvent) {
                BaiDuMapSportRecordFragment.showMapContent$lambda$2(this.OXO1, motionEvent);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        int size3 = tmpLocationList.size();
        while (i < size3) {
            arrayList2.add(new LatLng(tmpLocationList.get(i).getLatitude(), tmpLocationList.get(i).getLongitude()));
            i++;
        }
        PolylineOptions polylineOptionsPoints2 = new PolylineOptions().width(12).color(ContextCompat.getColor(getMActivity(), R.color.map_track_color)).points(arrayList2);
        Intrinsics.O10IXXX0X(polylineOptionsPoints2, "points(...)");
        map2.addOverlay(polylineOptionsPoints2);
        Intrinsics.XXI(map2);
        setCustomerMakerIcon(map2, new LatLng(((CustomLatLng) CollectionsKt___CollectionsKt.IIII0iI(tmpLocationList)).getLatitude(), ((CustomLatLng) CollectionsKt___CollectionsKt.IIII0iI(tmpLocationList)).getLongitude()), R.drawable.sport_start);
        setCustomerMakerIcon(map2, new LatLng(((CustomLatLng) CollectionsKt___CollectionsKt.Xi1XO00(tmpLocationList)).getLatitude(), ((CustomLatLng) CollectionsKt___CollectionsKt.Xi1XO00(tmpLocationList)).getLongitude()), R.drawable.sport_end);
    }

    private final void setCustomerMakerIcon(BaiduMap baiduMap, LatLng latLng, int i) {
        MarkerOptions markerOptionsAlpha = new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.fromResource(i)).draggable(false).flat(true).alpha(0.5f);
        Intrinsics.O10IXXX0X(markerOptionsAlpha, "alpha(...)");
        baiduMap.addOverlay(markerOptionsAlpha);
    }
}
