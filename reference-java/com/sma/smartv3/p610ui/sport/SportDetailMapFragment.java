package com.sma.smartv3.p610ui.sport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X0IO1OOi;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.e40;
import com.android.mltcode.paycertificationapi.i01I1i1X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iOXO11i1;
import com.android.mltcode.paycertificationapi.mc0;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.zo5;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.HeatMap;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.Overlay;
import com.baidu.mapapi.map.Polyline;
import com.baidu.mapapi.map.PolylineDottedLineType;
import com.baidu.mapapi.map.PolylineOptions;
import com.baidu.mapapi.map.TextureMapView;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.DistanceUtil;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.StyleSpan;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.gson.Gson;
import com.google.maps.android.heatmaps.HeatmapTileProvider;
import com.iflytek.sparkchain.utils.constants.ErrorCode;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.model.LocationData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.SportDetailMapFragment;
import com.sma.smartv3.p610ui.sport.course.model.SportDetailViewModel;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CustomGoogleMapView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailMapFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1039:1\n19#2:1040\n15#2:1041\n1878#3,3:1042\n1878#3,3:1045\n1869#3,2:1048\n1869#3,2:1050\n1869#3,2:1052\n1563#3:1054\n1634#3,3:1055\n1869#3,2:1058\n1869#3,2:1060\n1869#3,2:1062\n*S KotlinDebug\n*F\n+ 1 SportDetailMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailMapFragment\n*L\n107#1:1040\n107#1:1041\n196#1:1042,3\n219#1:1045,3\n369#1:1048,2\n372#1:1050,2\n477#1:1052,2\n676#1:1054\n676#1:1055,3\n775#1:1058,2\n821#1:1060,2\n834#1:1062,2\n*E\n"})
public class SportDetailMapFragment extends BaseFragment {
    private boolean isGradient;
    private final boolean isInChinaMainland;
    private boolean isLocationEmpty;
    private boolean isShowLineMarker;
    private boolean isShowMap;
    protected BaiduMap mBaiDuMap;

    @tb1
    private Polyline mBaiduDottedLine;

    @tb1
    private HeatMap mBaiduHeatMap;

    @tb1
    private Polyline mBaiduLine;

    @tb1
    private Marker mBaiduLineEnd;

    @tb1
    private Marker mBaiduLineStart;

    @aa1
    private ArrayList<Integer> mColorList;
    private int mCurrentIcon;

    @aa1
    private ArrayList<CustomLatLng> mFinalOriginalLocationList;

    @tb1
    private TileOverlay mGoogleHeatMapOverlay;

    @tb1
    private HeatmapTileProvider mGoogleHeatMapProvider;

    @tb1
    private com.google.android.gms.maps.model.Polyline mGoogleLine;

    @tb1
    private com.google.android.gms.maps.model.Marker mGoogleLineEnd;

    @tb1
    private com.google.android.gms.maps.model.Marker mGoogleLineStart;
    protected GoogleMap mGoogleMap;

    @tb1
    private ArrayList<LatLng> mInitialPoints;

    @aa1
    private final Lazy mLocationDao$delegate;
    private int mMapLineColor;

    @aa1
    private ArrayList<CustomLatLng> mSmoothLocationList;
    private int mStartIcon;

    @aa1
    private TrackPlay mTrackPlay;
    public Workout mWorkout;
    private int speedRangeFast;
    private int speedRangeSlow;

    @tb1
    private SportDetailV2Activity sportDetailV2Activity;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final String TAG = "SportDetailMapFragment";

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.rootView_delegate$lambda$0(this.f11579IO);
        }
    });

    @aa1
    private final Lazy tvDateTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.tvDateTime_delegate$lambda$0(this.f6282IO);
        }
    });

    @aa1
    private final Lazy tvDuration$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ew4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.tvDuration_delegate$lambda$0(this.f6499IO);
        }
    });

    @aa1
    private final Lazy tvAvgBpmValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.tvAvgBpmValue_delegate$lambda$0(this.f6750IO);
        }
    });

    @aa1
    private final Lazy tvDistanceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.tvDistanceValue_delegate$lambda$0(this.f9289IO);
        }
    });

    @aa1
    private final Lazy tvDistanceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.tvDistanceUnit_delegate$lambda$0(this.f9530IO);
        }
    });

    @aa1
    private final Lazy tvCaloriesValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.tvCaloriesValue_delegate$lambda$0(this.f9796IO);
        }
    });

    @aa1
    private final Lazy btnMapHot$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.btnMapHot_delegate$lambda$0(this.f10020IO);
        }
    });

    @aa1
    private final Lazy btnMap3D$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ov4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.btnMap3D_delegate$lambda$0(this.f10232IO);
        }
    });

    @aa1
    private final Lazy btnMapMark$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.btnMapMark_delegate$lambda$0(this.f10446IO);
        }
    });

    @aa1
    private final Lazy btnDownloadGpx$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.btnDownloadGpx_delegate$lambda$0(this.f12461IO);
        }
    });

    @aa1
    private final Lazy btnTrackPlay$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.btnTrackPlay_delegate$lambda$0(this.f12701IO);
        }
    });

    @aa1
    private final Lazy mGMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.aw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.mGMapView_delegate$lambda$0(this.f5586IO);
        }
    });

    @aa1
    private ArrayList<com.google.android.gms.maps.model.Marker> mGoogleMarkers = new ArrayList<>();

    @aa1
    private final ArrayList<com.google.android.gms.maps.model.LatLng> mGooglePoints = new ArrayList<>();

    @aa1
    private final Lazy mBMapView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailMapFragment.mBMapView_delegate$lambda$0(this.f5836IO);
        }
    });

    @aa1
    private ArrayList<Marker> mBaiduMarkers = new ArrayList<>();

    @aa1
    private final ArrayList<LatLng> mBaiduPoints = new ArrayList<>();
    private boolean endMarkerAnchorCenter = true;

    @aa1
    private final ArrayList<Integer> mLineColors = new ArrayList<>();

    @aa1
    private final List<StyleSpan> mGoogleLineColors = new ArrayList();
    private int mBaiDuMapLineWidth = SizeUtils.dp2px(3.5f);

    @aa1
    private final ArrayList<LatLng> mBaiduDottedPoints = new ArrayList<>();

    public static final class OXO1 implements TrackPlay.OXO1 {
        public OXO1() {
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void OXO1(ArrayList<com.google.android.gms.maps.model.LatLng> points, float f) {
            Intrinsics.X0O(points, "points");
            if (points.size() > 1) {
                SportDetailMapFragment.this.addGoogleLine(points);
            }
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void XIi00iiXO() {
            SportDetailMapFragment.this.getBtnMapHot().setEnabled(true);
            SportDetailMapFragment.this.getBtnMapMark().setEnabled(true);
            SportDetailMapFragment.this.getMColorList().clear();
            SportDetailMapFragment.this.getMColorList().addAll(SportDetailMapFragment.this.getMLineColors());
            SportDetailMapFragment.this.addLine();
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void XO0O10(ArrayList<LatLng> points, float f, int i) {
            Intrinsics.X0O(points, "points");
            SportDetailMapFragment.this.getMColorList().add(Integer.valueOf(i));
            if (points.size() > 1) {
                SportDetailMapFragment.this.addBaiduLine(points);
            }
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        /* JADX INFO: renamed from: iO */
        public void mo38626iO(float f) {
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void onStart() {
            SportDetailMapFragment.this.getBtnMapHot().setEnabled(false);
            SportDetailMapFragment.this.getBtnMapMark().setEnabled(false);
            SportDetailMapFragment.this.getMColorList().clear();
        }
    }

    public static final class XIi00iiXO implements OnMapReadyCallback {
        public final /* synthetic */ ArrayList<CustomLatLng> XIi00iiXO;

        public XIi00iiXO(ArrayList<CustomLatLng> arrayList) {
            this.XIi00iiXO = arrayList;
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public void onMapReady(GoogleMap googleMap) {
            Intrinsics.X0O(googleMap, "googleMap");
            MapsInitializer.initialize(SportDetailMapFragment.this.getMActivity());
            SportDetailMapFragment.this.setMGoogleMap(googleMap);
            ArrayList<CustomLatLng> arrayList = this.XIi00iiXO;
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(X0IO1OOi.XIi00iiXO(arrayList), e40.XIi00iiXO(arrayList)));
            SportDetailMapFragment.this.addLine();
        }
    }

    public SportDetailMapFragment() {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mLocationDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cw4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailMapFragment.mLocationDao_delegate$lambda$0();
            }
        });
        this.isInChinaMainland = a01Var.OXO1().getBoolean(b01.XiOIO, false);
        this.mSmoothLocationList = new ArrayList<>();
        this.mFinalOriginalLocationList = new ArrayList<>();
        this.mStartIcon = R.drawable.icon_sport_map_start;
        this.mCurrentIcon = R.drawable.icon_sport_map_end;
        this.isShowLineMarker = true;
        this.mMapLineColor = R.color.map_track_color;
        this.mColorList = new ArrayList<>();
        this.mTrackPlay = new TrackPlay(new OXO1());
        this.isLocationEmpty = true;
    }

    private final void addBaiduDottedLine(ArrayList<LatLng> arrayList) {
        PolylineOptions polylineOptionsPoints = new PolylineOptions().width(this.mBaiDuMapLineWidth).color(ContextCompat.getColor(requireContext(), this.mMapLineColor)).dottedLine(true).dottedLineType(PolylineDottedLineType.DOTTED_LINE_CIRCLE).zIndex(2).points(arrayList);
        Intrinsics.O10IXXX0X(polylineOptionsPoints, "points(...)");
        Overlay overlayAddOverlay = getMBaiDuMap().addOverlay(polylineOptionsPoints);
        Intrinsics.X1ii(overlayAddOverlay, "null cannot be cast to non-null type com.baidu.mapapi.map.Polyline");
        this.mBaiduDottedLine = (Polyline) overlayAddOverlay;
    }

    private final void addBaiduMarkView(ArrayList<CustomLatLng> arrayList) {
        this.mBaiduMarkers.clear();
        Context contextRequireContext = requireContext();
        Intrinsics.O10IXXX0X(contextRequireContext, "requireContext(...)");
        zo5 zo5Var = new zo5(contextRequireContext, R.layout.map_markers_text);
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            CustomLatLng customLatLng = (CustomLatLng) obj;
            Overlay overlayAddOverlay = getMBaiDuMap().addOverlay(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(zo5Var.XIi00iiXO(String.valueOf(i2)))).zIndex(9).position(new LatLng(customLatLng.getLatitude(), customLatLng.getLongitude())));
            Intrinsics.X1ii(overlayAddOverlay, "null cannot be cast to non-null type com.baidu.mapapi.map.Marker");
            this.mBaiduMarkers.add((Marker) overlayAddOverlay);
            i = i2;
        }
    }

    private final void addGoogleMarkView(ArrayList<CustomLatLng> arrayList) {
        this.mGoogleMarkers.clear();
        Context contextRequireContext = requireContext();
        Intrinsics.O10IXXX0X(contextRequireContext, "requireContext(...)");
        zo5 zo5Var = new zo5(contextRequireContext, R.layout.map_markers_text);
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            CustomLatLng customLatLng = (CustomLatLng) obj;
            com.google.android.gms.maps.model.MarkerOptions markerOptionsPosition = new com.google.android.gms.maps.model.MarkerOptions().icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(zo5Var.XIi00iiXO(String.valueOf(i2)))).zIndex(9.0f).position(new com.google.android.gms.maps.model.LatLng(customLatLng.getLatitude(), customLatLng.getLongitude()));
            Intrinsics.O10IXXX0X(markerOptionsPosition, "position(...)");
            com.google.android.gms.maps.model.Marker markerAddMarker = getMGoogleMap().addMarker(markerOptionsPosition);
            Intrinsics.XXI(markerAddMarker);
            this.mGoogleMarkers.add(markerAddMarker);
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox btnDownloadGpx_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (CheckBox) sportDetailMapFragment.getMView().findViewById(R.id.downloadGpxIb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox btnMap3D_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (CheckBox) sportDetailMapFragment.getMView().findViewById(R.id.btn_map_3d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox btnMapHot_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (CheckBox) sportDetailMapFragment.getMView().findViewById(R.id.btn_map_hot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckBox btnMapMark_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (CheckBox) sportDetailMapFragment.getMView().findViewById(R.id.btn_map_mark);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnTrackPlay_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (Button) sportDetailMapFragment.getMView().findViewById(R.id.btn_track_play);
    }

    private final void calculateModeSpeed() {
        LogUtils.m11128d("calculateModeSpeed  mode = " + getMWorkout().getMMode());
        int mMode = getMWorkout().getMMode();
        if (mMode == 12) {
            o65 o65Var = o65.OXO1;
            this.speedRangeSlow = o65Var.XIi00iiXO(3600, 4000);
            this.speedRangeFast = o65Var.XIi00iiXO(3600, 7000);
            return;
        }
        if (mMode == 13) {
            o65 o65Var2 = o65.OXO1;
            this.speedRangeSlow = o65Var2.XIi00iiXO(3600, 3000);
            this.speedRangeFast = o65Var2.XIi00iiXO(3600, 5000);
            return;
        }
        if (mMode == 19) {
            o65 o65Var3 = o65.OXO1;
            this.speedRangeSlow = o65Var3.XIi00iiXO(3600, 10000);
            this.speedRangeFast = o65Var3.XIi00iiXO(3600, ErrorCode.MSP_ERROR_ISV_NO_USER);
            return;
        }
        if (mMode == 50) {
            o65 o65Var4 = o65.OXO1;
            this.speedRangeSlow = o65Var4.XIi00iiXO(3600, 3000);
            this.speedRangeFast = o65Var4.XIi00iiXO(3600, 6000);
            return;
        }
        switch (mMode) {
            case 7:
            case 8:
                o65 o65Var5 = o65.OXO1;
                this.speedRangeSlow = o65Var5.XIi00iiXO(3600, 8000);
                this.speedRangeFast = o65Var5.XIi00iiXO(3600, 10000);
                break;
            case 9:
                o65 o65Var6 = o65.OXO1;
                this.speedRangeSlow = o65Var6.XIi00iiXO(3600, 3000);
                this.speedRangeFast = o65Var6.XIi00iiXO(3600, 6000);
                break;
            case 10:
                o65 o65Var7 = o65.OXO1;
                this.speedRangeSlow = o65Var7.XIi00iiXO(3600, 15000);
                this.speedRangeFast = o65Var7.XIi00iiXO(3600, ErrorCode.ERROR_AIMIC_BASE);
                break;
        }
    }

    private final void calculateSpeedColor(int i, int i2, int i3, CustomLatLng customLatLng, ArrayList<CustomLatLng> arrayList) {
        int iSpeedColorV1 = (this.speedRangeSlow == 0 && this.speedRangeFast == 0) ? speedColorV1(i, i2, i3) : speedColorV2(i3);
        arrayList.add(customLatLng);
        Iterator<CustomLatLng> it = arrayList.iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        while (it.hasNext()) {
            CustomLatLng next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            this.mLineColors.add(Integer.valueOf(iSpeedColorV1));
            next.setColor(iSpeedColorV1);
        }
        arrayList.clear();
    }

    private final Overlay createBaiduIcon(int i, LatLng latLng, boolean z) {
        BaiduMap mBaiDuMap = getMBaiDuMap();
        MarkerOptions markerOptionsZIndex = new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.fromResource(i)).draggable(false).flat(true).zIndex(9);
        if (z && this.endMarkerAnchorCenter) {
            markerOptionsZIndex.anchor(0.5f, 0.5f);
        }
        Overlay overlayAddOverlay = mBaiDuMap.addOverlay(markerOptionsZIndex);
        Intrinsics.O10IXXX0X(overlayAddOverlay, "addOverlay(...)");
        return overlayAddOverlay;
    }

    public static /* synthetic */ Overlay createBaiduIcon$default(SportDetailMapFragment sportDetailMapFragment, int i, LatLng latLng, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBaiduIcon");
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return sportDetailMapFragment.createBaiduIcon(i, latLng, z);
    }

    private final CheckBox getBtnDownloadGpx() {
        return (CheckBox) this.btnDownloadGpx$delegate.getValue();
    }

    private final CheckBox getBtnMap3D() {
        return (CheckBox) this.btnMap3D$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CheckBox getBtnMapHot() {
        return (CheckBox) this.btnMapHot$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CheckBox getBtnMapMark() {
        return (CheckBox) this.btnMapMark$delegate.getValue();
    }

    private final void getGradientLineColors(ArrayList<CustomLatLng> arrayList) {
        int i;
        int i2;
        int i3;
        CustomLatLng customLatLng;
        ArrayList<CustomLatLng> arrayList2;
        SportDetailMapFragment sportDetailMapFragment = this;
        int i4 = 0;
        CustomLatLng customLatLng2 = new CustomLatLng(arrayList.get(0).getLatitude(), arrayList.get(0).getLongitude(), arrayList.get(0).getTime(), arrayList.get(0).getAltitude(), 0, 16, null);
        long time = customLatLng2.getTime();
        int i5 = sportDetailMapFragment.getMWorkout().getMDistance() > 1000 ? 300 : 20;
        ArrayList<CustomLatLng> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        int i6 = 0;
        long j = time;
        float fIIi1 = 0.0f;
        int i7 = 0;
        while (i6 < size) {
            CustomLatLng customLatLng3 = arrayList.get(i6);
            Intrinsics.O10IXXX0X(customLatLng3, "get(...)");
            CustomLatLng customLatLng4 = customLatLng3;
            if (customLatLng4.getLatitude() == customLatLng2.getLatitude() && customLatLng4.getLongitude() == customLatLng2.getLongitude()) {
                arrayList3.add(customLatLng4);
                arrayList2 = arrayList3;
                i = i5;
                i2 = i6;
            } else {
                int i8 = i6;
                long time2 = j;
                fIIi1 += mc0.iIi1(DistanceUtil.getDistance(new LatLng(customLatLng2.getLatitude(), customLatLng2.getLongitude()), new LatLng(customLatLng4.getLatitude(), customLatLng4.getLongitude())) * ((double) 100)) / 100.0f;
                i = i5;
                if (fIIi1 < i) {
                    i2 = i8;
                    if (i2 != arrayList.size() - 1) {
                        arrayList3.add(customLatLng4);
                        arrayList2 = arrayList3;
                        customLatLng = customLatLng4;
                    }
                    customLatLng2.setLatitude(customLatLng.getLatitude());
                    customLatLng2.setLongitude(customLatLng.getLongitude());
                    customLatLng2.setTime(customLatLng.getTime());
                    customLatLng2.setAltitude(customLatLng.getAltitude());
                    j = time2;
                } else {
                    i2 = i8;
                }
                long jAbs = Math.abs(customLatLng4.getTime() - time2) / ((long) 1000);
                int iXIi00iiXO = o65.OXO1.XIi00iiXO((int) jAbs, (int) fIIi1);
                int i9 = sportDetailMapFragment.speedRangeFast;
                int i10 = sportDetailMapFragment.speedRangeSlow;
                StringBuilder sb = new StringBuilder();
                ArrayList<CustomLatLng> arrayList4 = arrayList3;
                sb.append("getGradientLineColors distance = ");
                sb.append(fIIi1);
                sb.append("  intervalTime = ");
                sb.append(jAbs);
                sb.append("  secondSpeed = ");
                sb.append(iXIi00iiXO);
                sb.append("  speedRangeFast = ");
                sb.append(i9);
                sb.append("  , speedRangeSlow = ");
                sb.append(i10);
                LogUtils.m11128d(sb.toString());
                if (iXIi00iiXO < i7 || i7 == 0) {
                    i7 = iXIi00iiXO;
                }
                if (iXIi00iiXO > i4) {
                    i4 = iXIi00iiXO;
                    i3 = i4;
                } else {
                    i3 = iXIi00iiXO;
                }
                sportDetailMapFragment = this;
                customLatLng = customLatLng4;
                sportDetailMapFragment.calculateSpeedColor(i4, i7, i3, customLatLng, arrayList4);
                arrayList2 = arrayList4;
                time2 = customLatLng.getTime();
                fIIi1 = 0.0f;
                customLatLng2.setLatitude(customLatLng.getLatitude());
                customLatLng2.setLongitude(customLatLng.getLongitude());
                customLatLng2.setTime(customLatLng.getTime());
                customLatLng2.setAltitude(customLatLng.getAltitude());
                j = time2;
            }
            i6 = i2 + 1;
            i5 = i;
            arrayList3 = arrayList2;
        }
        ArrayList<CustomLatLng> arrayList5 = arrayList3;
        if (sportDetailMapFragment.isGradient && sportDetailMapFragment.mLineColors.size() == 0 && arrayList5.size() > 0) {
            for (CustomLatLng customLatLng5 : arrayList5) {
                sportDetailMapFragment.mLineColors.add(Integer.valueOf(ContextCompat.getColor(sportDetailMapFragment.requireContext(), R.color.sport_detail_bg_startColor)));
            }
        }
    }

    private final void getIntiLocationList() {
        SportDetailViewModel mSportViewModel;
        SportDetailV2Activity sportDetailV2Activity = this.sportDetailV2Activity;
        if (sportDetailV2Activity == null || (mSportViewModel = sportDetailV2Activity.getMSportViewModel()) == null) {
            return;
        }
        mSportViewModel.getIntiLocationList(this.mSmoothLocationList, this.userProfile.getUnit());
    }

    private final LocationDao getMLocationDao() {
        return (LocationDao) this.mLocationDao$delegate.getValue();
    }

    private final void getMarkersData() {
        SportDetailViewModel mSportViewModel;
        SportDetailV2Activity sportDetailV2Activity = this.sportDetailV2Activity;
        if (sportDetailV2Activity == null || (mSportViewModel = sportDetailV2Activity.getMSportViewModel()) == null) {
            return;
        }
        mSportViewModel.getMarkList(this.mSmoothLocationList, this.userProfile.getUnit());
    }

    private final void getSportDetailActivity() {
        if (getActivity() instanceof SportDetailV2Activity) {
            FragmentActivity activity = getActivity();
            Intrinsics.X1ii(activity, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2Activity");
            this.sportDetailV2Activity = (SportDetailV2Activity) activity;
        }
    }

    private final TextView getTvAvgBpmValue() {
        return (TextView) this.tvAvgBpmValue$delegate.getValue();
    }

    private final TextView getTvCaloriesValue() {
        return (TextView) this.tvCaloriesValue$delegate.getValue();
    }

    private final TextView getTvDistanceUnit() {
        return (TextView) this.tvDistanceUnit$delegate.getValue();
    }

    private final TextView getTvDistanceValue() {
        return (TextView) this.tvDistanceValue$delegate.getValue();
    }

    private final TextView getTvDuration() {
        return (TextView) this.tvDuration$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SportDetailMapFragment sportDetailMapFragment, CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        sportDetailMapFragment.showHot(z);
        if (z) {
            sportDetailMapFragment.removeLine();
        } else {
            sportDetailMapFragment.addLine();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(SportDetailMapFragment sportDetailMapFragment, CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        sportDetailMapFragment.show3d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(SportDetailMapFragment sportDetailMapFragment, CompoundButton buttonView, boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        sportDetailMapFragment.showMark(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(SportDetailMapFragment sportDetailMapFragment, View view) {
        if (sportDetailMapFragment.isMapInitialized()) {
            sportDetailMapFragment.playTrack();
            return;
        }
        i1O0OXO1O.OXO1.OXO1(sportDetailMapFragment.TAG + " isMapInitialized false");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureMapView mBMapView_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (TextureMapView) sportDetailMapFragment.getMView().findViewById(R.id.bMapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomGoogleMapView mGMapView_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (CustomGoogleMapView) sportDetailMapFragment.getMView().findViewById(R.id.gMapView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    private final void onConvertLocation(List<Location> list, boolean z) {
        this.mFinalOriginalLocationList = LocationData.INSTANCE.getFinalLocationList(list, this.isInChinaMainland, z);
        if (i72.OXO1.OX0()) {
            for (CustomLatLng customLatLng : this.mFinalOriginalLocationList) {
                this.mBaiduDottedPoints.add(new LatLng(customLatLng.getLatitude(), customLatLng.getLongitude()));
            }
        }
        this.mSmoothLocationList.addAll(LocationData.INSTANCE.getSmoothLocationListAlgorithm(this.mFinalOriginalLocationList, getMWorkout().getMMode()));
        getIntiLocationList();
        showMapContent(this.mSmoothLocationList, this.isInChinaMainland);
    }

    public static /* synthetic */ void onConvertLocation$default(SportDetailMapFragment sportDetailMapFragment, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConvertLocation");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        sportDetailMapFragment.onConvertLocation(list, z);
    }

    private final void removeLine() {
        if (this.isInChinaMainland) {
            Marker marker = this.mBaiduLineStart;
            if (marker != null) {
                marker.remove();
            }
            this.mBaiduLineStart = null;
            Polyline polyline = this.mBaiduLine;
            if (polyline != null) {
                polyline.remove();
            }
            this.mBaiduLine = null;
            Marker marker2 = this.mBaiduLineEnd;
            if (marker2 != null) {
                marker2.remove();
            }
            this.mBaiduLineEnd = null;
            return;
        }
        com.google.android.gms.maps.model.Marker marker3 = this.mGoogleLineStart;
        if (marker3 != null) {
            marker3.remove();
        }
        this.mGoogleLineStart = null;
        com.google.android.gms.maps.model.Polyline polyline2 = this.mGoogleLine;
        if (polyline2 != null) {
            polyline2.remove();
        }
        this.mGoogleLine = null;
        com.google.android.gms.maps.model.Marker marker4 = this.mGoogleLineEnd;
        if (marker4 != null) {
            marker4.remove();
        }
        this.mGoogleLineEnd = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout rootView_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (RelativeLayout) sportDetailMapFragment.getMView().findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void share$lambda$0(SportDetailMapFragment sportDetailMapFragment, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            sportDetailMapFragment.shareMapBitmap(bitmap, bitmap2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void share$lambda$1(SportDetailMapFragment sportDetailMapFragment, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            sportDetailMapFragment.shareMapBitmap(bitmap, bitmap2);
        }
    }

    private final void show3d(boolean z) {
        LogUtils.m11128d("show3d " + z);
        if (this.mGoogleMap == null && !this.isInChinaMainland) {
            ToastUtils.showShort("This feature cannot be used if Google services are not supported.", new Object[0]);
            return;
        }
        if (z) {
            if (this.isInChinaMainland) {
                getMBaiDuMap().setMapType(2);
                return;
            } else {
                getMGoogleMap().setMapType(2);
                return;
            }
        }
        if (this.isInChinaMainland) {
            getMBaiDuMap().setMapType(1);
        } else {
            getMGoogleMap().setMapType(1);
        }
    }

    private final void showBaiDuMap(ArrayList<CustomLatLng> arrayList) {
        getMBMapView().setVisibility(0);
        TextureMapView mBMapView = getMBMapView();
        mBMapView.showZoomControls(false);
        mBMapView.showScaleControl(false);
        BaiduMap map = getMBMapView().getMap();
        map.setCompassEnable(false);
        Intrinsics.O10IXXX0X(map, "apply(...)");
        setMBaiDuMap(map);
        getMBaiDuMap().setOnMapTouchListener(new BaiduMap.OnMapTouchListener() { // from class: com.android.mltcode.paycertificationapi.jv4
            @Override // com.baidu.mapapi.map.BaiduMap.OnMapTouchListener
            public final void onTouch(MotionEvent motionEvent) {
                SportDetailMapFragment.showBaiDuMap$lambda$2(this.OXO1, motionEvent);
            }
        });
        mapStatusBaiDuCenterPoint(arrayList);
        getMBaiDuMap().setMapStatus(MapStatusUpdateFactory.newLatLngBounds(iOXO11i1.OXO1(arrayList), getMBMapView().getWidth(), getMBMapView().getHeight()));
        getMBaiDuMap().setMapStatus(MapStatusUpdateFactory.zoomTo(e40.XIi00iiXO(arrayList) + 0.5f));
        addLine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBaiDuMap$lambda$2(SportDetailMapFragment sportDetailMapFragment, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            RelativeLayout rootView = sportDetailMapFragment.getRootView();
            if (rootView != null) {
                rootView.requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        RelativeLayout rootView2 = sportDetailMapFragment.getRootView();
        if (rootView2 != null) {
            rootView2.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final void showGoogleMap(ArrayList<CustomLatLng> arrayList) {
        CustomGoogleMapView mGMapView = getMGMapView();
        mGMapView.setVisibility(0);
        mGMapView.onCreate(null);
        mGMapView.getMapAsync(new XIi00iiXO(arrayList));
    }

    private final void showHot(boolean z) {
        LogUtils.m11128d("showHot " + z);
        if (!z) {
            if (this.isInChinaMainland) {
                HeatMap heatMap = this.mBaiduHeatMap;
                if (heatMap != null) {
                    heatMap.removeHeatMap();
                }
                this.mBaiduHeatMap = null;
                return;
            }
            TileOverlay tileOverlay = this.mGoogleHeatMapOverlay;
            if (tileOverlay != null) {
                tileOverlay.remove();
            }
            this.mGoogleHeatMapProvider = null;
            return;
        }
        if (this.isInChinaMainland) {
            try {
                this.mBaiduHeatMap = new HeatMap.Builder().data(this.mBaiduPoints).radius(50).build();
                getMBaiDuMap().addHeatMap(this.mBaiduHeatMap);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.mGoogleHeatMapProvider = new HeatmapTileProvider.Builder().data(this.mGooglePoints).radius(50).build();
        GoogleMap mGoogleMap = getMGoogleMap();
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        HeatmapTileProvider heatmapTileProvider = this.mGoogleHeatMapProvider;
        Intrinsics.XXI(heatmapTileProvider);
        this.mGoogleHeatMapOverlay = mGoogleMap.addTileOverlay(tileOverlayOptions.tileProvider(heatmapTileProvider));
    }

    private final void showLocation() {
        List<Location> location = getMLocationDao().getLocation(getMWorkout().getMStart(), getMWorkout().getMEnd());
        this.isLocationEmpty = location.isEmpty() || location.size() < 2;
        showMapLocation(location);
    }

    private final void showMapContent(ArrayList<CustomLatLng> arrayList, boolean z) {
        this.isShowMap = true;
        LogUtils.m11128d("showMapContent isInChinaMainland=" + z);
        LogUtils.m11128d("showMapContent locationList=" + arrayList);
        if (this.isGradient) {
            calculateModeSpeed();
            getGradientLineColors(arrayList);
        }
        if (!z) {
            for (CustomLatLng customLatLng : arrayList) {
                this.mGooglePoints.add(new com.google.android.gms.maps.model.LatLng(customLatLng.getLatitude(), customLatLng.getLongitude()));
            }
            showGoogleMap(arrayList);
            return;
        }
        for (CustomLatLng customLatLng2 : arrayList) {
            this.mBaiduPoints.add(new LatLng(customLatLng2.getLatitude(), customLatLng2.getLongitude()));
        }
        showBaiDuMap(arrayList);
        if (i72.OXO1.OX0()) {
            addBaiduDottedLine(this.mBaiduDottedPoints);
        }
    }

    private final void showMark(boolean z) {
        LogUtils.m11128d("showMark " + z);
        if (z) {
            if (this.isInChinaMainland) {
                getMarkersData();
                return;
            } else {
                getMarkersData();
                return;
            }
        }
        if (this.isInChinaMainland) {
            Iterator<T> it = this.mBaiduMarkers.iterator();
            while (it.hasNext()) {
                ((Marker) it.next()).remove();
            }
        } else {
            Iterator<T> it2 = this.mGoogleMarkers.iterator();
            while (it2.hasNext()) {
                ((com.google.android.gms.maps.model.Marker) it2.next()).remove();
            }
        }
    }

    private final int speedColorV1(int i, int i2, int i3) {
        int i4 = (i - i2) / 10;
        if (i3 > (i4 * 5) + i2) {
            return ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_startColor);
        }
        return i3 > i2 + (i4 * 2) ? ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_centerColor) : ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_endColor);
    }

    private final int speedColorV2(int i) {
        if (i > this.speedRangeSlow) {
            return ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_startColor);
        }
        return i < this.speedRangeFast ? ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_endColor) : ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_centerColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgBpmValue_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (TextView) sportDetailMapFragment.getMView().findViewById(R.id.tv_avg_bpm_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCaloriesValue_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (TextView) sportDetailMapFragment.getMView().findViewById(R.id.tv_calories_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDateTime_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (TextView) sportDetailMapFragment.getMView().findViewById(R.id.tv_dateTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDistanceUnit_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (TextView) sportDetailMapFragment.getMView().findViewById(R.id.tv_distance_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDistanceValue_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (TextView) sportDetailMapFragment.getMView().findViewById(R.id.tv_distance_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDuration_delegate$lambda$0(SportDetailMapFragment sportDetailMapFragment) {
        return (TextView) sportDetailMapFragment.getMView().findViewById(R.id.tv_duration);
    }

    public final void addBaiduLine(@aa1 ArrayList<LatLng> points) {
        SportDetailMapFragment sportDetailMapFragment;
        Intrinsics.X0O(points, "points");
        if (this.isShowLineMarker) {
            Marker marker = this.mBaiduLineStart;
            if (marker == null) {
                sportDetailMapFragment = this;
                Overlay overlayCreateBaiduIcon$default = createBaiduIcon$default(sportDetailMapFragment, this.mStartIcon, (LatLng) CollectionsKt___CollectionsKt.IIII0iI(points), false, 4, null);
                Intrinsics.X1ii(overlayCreateBaiduIcon$default, "null cannot be cast to non-null type com.baidu.mapapi.map.Marker");
                sportDetailMapFragment.mBaiduLineStart = (Marker) overlayCreateBaiduIcon$default;
            } else {
                sportDetailMapFragment = this;
                if (marker != null) {
                    marker.setPosition((LatLng) CollectionsKt___CollectionsKt.IIII0iI(points));
                }
            }
        } else {
            sportDetailMapFragment = this;
        }
        if (sportDetailMapFragment.mBaiduLine == null) {
            sportDetailMapFragment.mInitialPoints = points;
            PolylineOptions polylineOptionsIsGradient = new PolylineOptions().width(sportDetailMapFragment.mBaiDuMapLineWidth).color(ContextCompat.getColor(requireContext(), sportDetailMapFragment.mMapLineColor)).isGradient(sportDetailMapFragment.isGradient);
            if (sportDetailMapFragment.isGradient) {
                polylineOptionsIsGradient.colorsValues(sportDetailMapFragment.mLineColors);
            }
            PolylineOptions polylineOptionsPoints = polylineOptionsIsGradient.zIndex(8).points(points);
            Intrinsics.O10IXXX0X(polylineOptionsPoints, "points(...)");
            Overlay overlayAddOverlay = getMBaiDuMap().addOverlay(polylineOptionsPoints);
            Intrinsics.X1ii(overlayAddOverlay, "null cannot be cast to non-null type com.baidu.mapapi.map.Polyline");
            sportDetailMapFragment.mBaiduLine = (Polyline) overlayAddOverlay;
        } else {
            if (sportDetailMapFragment.isGradient) {
                int[] iArrO011OOIO0 = CollectionsKt___CollectionsKt.O011OOIO0(sportDetailMapFragment.mColorList);
                Polyline polyline = sportDetailMapFragment.mBaiduLine;
                if (polyline != null) {
                    polyline.setColorList(iArrO011OOIO0);
                }
            }
            Polyline polyline2 = sportDetailMapFragment.mBaiduLine;
            if (polyline2 != null) {
                polyline2.setPoints(points);
            }
        }
        if (sportDetailMapFragment.isShowLineMarker) {
            Marker marker2 = sportDetailMapFragment.mBaiduLineEnd;
            if (marker2 == null) {
                Overlay overlayCreateBaiduIcon = createBaiduIcon(sportDetailMapFragment.mCurrentIcon, (LatLng) CollectionsKt___CollectionsKt.Xi1XO00(points), true);
                Intrinsics.X1ii(overlayCreateBaiduIcon, "null cannot be cast to non-null type com.baidu.mapapi.map.Marker");
                sportDetailMapFragment.mBaiduLineEnd = (Marker) overlayCreateBaiduIcon;
            } else if (marker2 != null) {
                marker2.setPosition((LatLng) CollectionsKt___CollectionsKt.Xi1XO00(points));
            }
        }
    }

    public final void addGoogleLine(@aa1 ArrayList<com.google.android.gms.maps.model.LatLng> points) {
        Intrinsics.X0O(points, "points");
        GoogleMap mGoogleMap = getMGoogleMap();
        com.google.android.gms.maps.model.Marker marker = this.mGoogleLineStart;
        if (marker == null && this.isShowLineMarker) {
            this.mGoogleLineStart = mGoogleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position((com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.IIII0iI(points)).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(this.mStartIcon)));
        } else if (marker != null) {
            marker.setPosition((com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.IIII0iI(points));
        }
        if (this.isGradient && this.mGoogleLineColors.size() == 0 && this.mLineColors.size() > 0) {
            ArrayList<Integer> arrayList = this.mLineColors;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Boolean.valueOf(this.mGoogleLineColors.add(new StyleSpan(((Number) it.next()).intValue()))));
            }
        }
        com.google.android.gms.maps.model.Polyline polyline = this.mGoogleLine;
        if (polyline == null) {
            com.google.android.gms.maps.model.PolylineOptions polylineOptions = new com.google.android.gms.maps.model.PolylineOptions();
            polylineOptions.addAll(points);
            polylineOptions.width(this.mBaiDuMapLineWidth);
            if (this.isGradient) {
                polylineOptions.addAllSpans(this.mGoogleLineColors);
            } else {
                polylineOptions.color(ContextCompat.getColor(requireContext(), this.mMapLineColor));
            }
            Unit unit = Unit.OXO1;
            this.mGoogleLine = mGoogleMap.addPolyline(polylineOptions);
        } else if (polyline != null) {
            polyline.setPoints(points);
        }
        com.google.android.gms.maps.model.Marker marker2 = this.mGoogleLineEnd;
        if (marker2 != null || !this.isShowLineMarker) {
            if (marker2 != null) {
                marker2.setPosition((com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.Xi1XO00(points));
            }
        } else {
            com.google.android.gms.maps.model.MarkerOptions markerOptionsPosition = new com.google.android.gms.maps.model.MarkerOptions().position((com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.Xi1XO00(points));
            if (this.endMarkerAnchorCenter) {
                markerOptionsPosition.anchor(0.5f, 0.5f);
            }
            Unit unit2 = Unit.OXO1;
            this.mGoogleLineEnd = mGoogleMap.addMarker(markerOptionsPosition.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(this.mCurrentIcon)));
        }
    }

    public final void addLine() {
        if (this.isInChinaMainland) {
            addBaiduLine(this.mBaiduPoints);
        } else {
            addGoogleLine(this.mGooglePoints);
        }
        initializedMapFinish();
    }

    public final void downloadGpx() {
        List<Location> location = getMLocationDao().getLocation(getMWorkout().getMStart(), getMWorkout().getMEnd());
        LocationData locationData = LocationData.INSTANCE;
        ArrayList<CustomLatLng> finalLocationList$default = LocationData.getFinalLocationList$default(locationData, location, false, false, 4, null);
        if (finalLocationList$default.size() <= 0) {
            ToastUtils.showLong(R.string.no_data);
            return;
        }
        sz0 sz0Var = sz0.OXO1;
        FileIOUtils.writeFileFromString(uz0.O1O(sz0Var), locationData.getGpxFileString(finalLocationList$default, getMWorkout().getMStart(), this.userProfile.getNickname(), q62.OXO1.i01OOiI(getMWorkout().getMMode())));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", getString(R.string.share_gpx_file));
        intent.putExtra("android.intent.extra.STREAM", sz0Var.XO0O10(uz0.O1O(sz0Var)));
        intent.setType("application/gpx");
        startActivity(Intent.createChooser(intent, getString(R.string.share_gpx_file)));
    }

    public final Button getBtnTrackPlay() {
        return (Button) this.btnTrackPlay$delegate.getValue();
    }

    public final boolean getEndMarkerAnchorCenter() {
        return this.endMarkerAnchorCenter;
    }

    public final TextureMapView getMBMapView() {
        return (TextureMapView) this.mBMapView$delegate.getValue();
    }

    @aa1
    public final BaiduMap getMBaiDuMap() {
        BaiduMap baiduMap = this.mBaiDuMap;
        if (baiduMap != null) {
            return baiduMap;
        }
        Intrinsics.XXO("mBaiDuMap");
        return null;
    }

    public final int getMBaiDuMapLineWidth() {
        return this.mBaiDuMapLineWidth;
    }

    @tb1
    public final Marker getMBaiduLineEnd() {
        return this.mBaiduLineEnd;
    }

    @tb1
    public final Marker getMBaiduLineStart() {
        return this.mBaiduLineStart;
    }

    @aa1
    public final ArrayList<Integer> getMColorList() {
        return this.mColorList;
    }

    public final int getMCurrentIcon() {
        return this.mCurrentIcon;
    }

    public final CustomGoogleMapView getMGMapView() {
        return (CustomGoogleMapView) this.mGMapView$delegate.getValue();
    }

    @aa1
    public final List<StyleSpan> getMGoogleLineColors() {
        return this.mGoogleLineColors;
    }

    @aa1
    public final GoogleMap getMGoogleMap() {
        GoogleMap googleMap = this.mGoogleMap;
        if (googleMap != null) {
            return googleMap;
        }
        Intrinsics.XXO("mGoogleMap");
        return null;
    }

    @tb1
    public final ArrayList<LatLng> getMInitialPoints() {
        return this.mInitialPoints;
    }

    @aa1
    public final ArrayList<Integer> getMLineColors() {
        return this.mLineColors;
    }

    public final int getMMapLineColor() {
        return this.mMapLineColor;
    }

    @aa1
    public final ArrayList<CustomLatLng> getMSmoothLocationList() {
        return this.mSmoothLocationList;
    }

    public final int getMStartIcon() {
        return this.mStartIcon;
    }

    @aa1
    public TrackPlay getMTrackPlay() {
        return this.mTrackPlay;
    }

    @aa1
    public final Workout getMWorkout() {
        Workout workout = this.mWorkout;
        if (workout != null) {
            return workout;
        }
        Intrinsics.XXO("mWorkout");
        return null;
    }

    public final RelativeLayout getRootView() {
        return (RelativeLayout) this.rootView$delegate.getValue();
    }

    public final int getSpeedRangeFast() {
        return this.speedRangeFast;
    }

    public final int getSpeedRangeSlow() {
        return this.speedRangeSlow;
    }

    public final TextView getTvDateTime() {
        return (TextView) this.tvDateTime$delegate.getValue();
    }

    @aa1
    public final AppUser getUserProfile() {
        return this.userProfile;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @SuppressLint({"SetTextI18n"})
    public void initView() {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        setMWorkout((Workout) mArg3);
        getSportDetailActivity();
        getTvDateTime().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(getMWorkout().getMStart())));
        getTvDuration().setText(O0X11OiO.iXiX011(getMWorkout().getMDuration() * 1000));
        getTvAvgBpmValue().setText(String.valueOf(getMWorkout().getMAvgBpm()));
        getTvDistanceValue().setText(String.valueOf(cp5.X1ii(getMWorkout().getMDistance(), this.userProfile.getUnit(), false, 4, null)));
        getTvDistanceUnit().setText(getString(cp5.XX0(this.userProfile.getUnit())));
        getTvCaloriesValue().setText(String.valueOf(getMWorkout().getMCalorie() / 1000));
        showLocation();
        getBtnDownloadGpx().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.sv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11140IO.downloadGpx();
            }
        });
        getBtnMapHot().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.tv4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportDetailMapFragment.initView$lambda$1(this.f11367IO, compoundButton, z);
            }
        });
        getBtnMap3D().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.vv4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportDetailMapFragment.initView$lambda$2(this.f11821IO, compoundButton, z);
            }
        });
        getBtnMapMark().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.wv4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportDetailMapFragment.initView$lambda$3(this.f12046IO, compoundButton, z);
            }
        });
        getMTrackPlay().OII(this.mSmoothLocationList, this.isInChinaMainland ? TrackPlay.SourceType.BAIDU : TrackPlay.SourceType.GOOGLE);
        getBtnTrackPlay().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailMapFragment.initView$lambda$4(this.f12243IO, view);
            }
        });
    }

    public void initializedMapFinish() {
    }

    public final boolean isGradient() {
        return this.isGradient;
    }

    public final boolean isInChina(double d, double d2) {
        return i01I1i1X.OXO1.XO0O10(d, d2);
    }

    public final boolean isInChinaMainland() {
        return this.isInChinaMainland;
    }

    public final boolean isLocationEmpty() {
        return this.isLocationEmpty;
    }

    public final boolean isMapInitialized() {
        if (this.isInChinaMainland) {
            return this.mBaiDuMap != null;
        }
        return this.mGoogleMap != null;
    }

    public final boolean isShowLineMarker() {
        return this.isShowLineMarker;
    }

    public int layoutId() {
        return R.layout.fragment_sport_detail_map;
    }

    public void mapStatusBaiDuCenterPoint(@aa1 ArrayList<CustomLatLng> locationList) {
        Intrinsics.X0O(locationList, "locationList");
        getMBaiDuMap().setMapStatus(iOXO11i1.XIi00iiXO(locationList));
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.isShowMap) {
            if (this.isInChinaMainland) {
                getMBMapView().onDestroy();
            } else {
                getMGMapView().onDestroy();
            }
        }
    }

    public void onLoadMarkView(@aa1 ArrayList<CustomLatLng> list) {
        Intrinsics.X0O(list, "list");
        if (this.isInChinaMainland) {
            addBaiduMarkView(list);
        } else {
            addGoogleMarkView(list);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isShowMap) {
            if (this.isInChinaMainland) {
                getMBMapView().onResume();
            } else {
                getMGMapView().onResume();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.isShowMap) {
            if (this.isInChinaMainland) {
                getMBMapView().onPause();
            } else {
                getMGMapView().onPause();
            }
        }
    }

    public void playTrack() {
        if (getMTrackPlay().O10IXXX0X()) {
            return;
        }
        getBtnMapHot().setChecked(false);
        getBtnMapMark().setChecked(false);
        getMTrackPlay().X0O();
    }

    public final void setEndMarkerAnchorCenter(boolean z) {
        this.endMarkerAnchorCenter = z;
    }

    public final void setGradient(boolean z) {
        this.isGradient = z;
    }

    public final void setLocationEmpty(boolean z) {
        this.isLocationEmpty = z;
    }

    public final void setMBaiDuMap(@aa1 BaiduMap baiduMap) {
        Intrinsics.X0O(baiduMap, "<set-?>");
        this.mBaiDuMap = baiduMap;
    }

    public final void setMBaiDuMapLineWidth(int i) {
        this.mBaiDuMapLineWidth = i;
    }

    public final void setMBaiduLineEnd(@tb1 Marker marker) {
        this.mBaiduLineEnd = marker;
    }

    public final void setMBaiduLineStart(@tb1 Marker marker) {
        this.mBaiduLineStart = marker;
    }

    public final void setMColorList(@aa1 ArrayList<Integer> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.mColorList = arrayList;
    }

    public final void setMCurrentIcon(int i) {
        this.mCurrentIcon = i;
    }

    public final void setMGoogleMap(@aa1 GoogleMap googleMap) {
        Intrinsics.X0O(googleMap, "<set-?>");
        this.mGoogleMap = googleMap;
    }

    public final void setMInitialPoints(@tb1 ArrayList<LatLng> arrayList) {
        this.mInitialPoints = arrayList;
    }

    public final void setMMapLineColor(int i) {
        this.mMapLineColor = i;
    }

    public final void setMSmoothLocationList(@aa1 ArrayList<CustomLatLng> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.mSmoothLocationList = arrayList;
    }

    public final void setMStartIcon(int i) {
        this.mStartIcon = i;
    }

    public void setMTrackPlay(@aa1 TrackPlay trackPlay) {
        Intrinsics.X0O(trackPlay, "<set-?>");
        this.mTrackPlay = trackPlay;
    }

    public final void setMWorkout(@aa1 Workout workout) {
        Intrinsics.X0O(workout, "<set-?>");
        this.mWorkout = workout;
    }

    public final void setShowLineMarker(boolean z) {
        this.isShowLineMarker = z;
    }

    public final void setSpeedRangeFast(int i) {
        this.speedRangeFast = i;
    }

    public final void setSpeedRangeSlow(int i) {
        this.speedRangeSlow = i;
    }

    public void share(@aa1 final Bitmap topBitmap) {
        Intrinsics.X0O(topBitmap, "topBitmap");
        if (this.isInChinaMainland) {
            getMBaiDuMap().snapshot(new BaiduMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.qv4
                @Override // com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    SportDetailMapFragment.share$lambda$0(this.OXO1, topBitmap, bitmap);
                }
            });
        } else if (this.mGoogleMap != null) {
            getMGoogleMap().snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.rv4
                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    SportDetailMapFragment.share$lambda$1(this.OXO1, topBitmap, bitmap);
                }
            });
        } else {
            ToastUtils.showShort("Unable to share without Google services", new Object[0]);
        }
    }

    public void shareMapBitmap(@aa1 Bitmap topBitmap, @aa1 Bitmap mapBitmap) {
        Intrinsics.X0O(topBitmap, "topBitmap");
        Intrinsics.X0O(mapBitmap, "mapBitmap");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getRootView().getWidth(), getRootView().getHeight() + topBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(topBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(mapBitmap, 0.0f, topBitmap.getHeight(), (Paint) null);
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        RelativeLayout rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        canvas.drawBitmap(xIi1i01O.XIi00iiXO(rootView), 0.0f, topBitmap.getHeight(), (Paint) null);
        xIi1i01O.XO0O10(getMActivity(), bitmapCreateBitmap);
    }

    public void showMapLocation(@aa1 List<Location> locationList) {
        Intrinsics.X0O(locationList, "locationList");
        if (this.isLocationEmpty) {
            return;
        }
        boolean zIsInChina = false;
        if (!locationList.isEmpty()) {
            Location location = locationList.get(0);
            zIsInChina = isInChina(location.getMLatitude(), location.getMLongitude());
        }
        onConvertLocation(locationList, zIsInChina);
    }
}
