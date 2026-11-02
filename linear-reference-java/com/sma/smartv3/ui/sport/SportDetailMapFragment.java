package com.sma.smartv3.ui.sport;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import com.android.mltcode.paycertificationapi.aw4;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bw4;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cw4;
import com.android.mltcode.paycertificationapi.dw4;
import com.android.mltcode.paycertificationapi.e40;
import com.android.mltcode.paycertificationapi.ew4;
import com.android.mltcode.paycertificationapi.fw4;
import com.android.mltcode.paycertificationapi.i01I1i1X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iOXO11i1;
import com.android.mltcode.paycertificationapi.jv4;
import com.android.mltcode.paycertificationapi.kv4;
import com.android.mltcode.paycertificationapi.lv4;
import com.android.mltcode.paycertificationapi.mc0;
import com.android.mltcode.paycertificationapi.mv4;
import com.android.mltcode.paycertificationapi.nv4;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.ov4;
import com.android.mltcode.paycertificationapi.pv4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qv4;
import com.android.mltcode.paycertificationapi.rv4;
import com.android.mltcode.paycertificationapi.sv4;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tv4;
import com.android.mltcode.paycertificationapi.uv4;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vv4;
import com.android.mltcode.paycertificationapi.wv4;
import com.android.mltcode.paycertificationapi.xv4;
import com.android.mltcode.paycertificationapi.yv4;
import com.android.mltcode.paycertificationapi.zo5;
import com.android.mltcode.paycertificationapi.zv4;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.model.LocationData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.course.model.SportDetailViewModel;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailMapFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1039:1\n19#2:1040\n15#2:1041\n1878#3,3:1042\n1878#3,3:1045\n1869#3,2:1048\n1869#3,2:1050\n1869#3,2:1052\n1563#3:1054\n1634#3,3:1055\n1869#3,2:1058\n1869#3,2:1060\n1869#3,2:1062\n*S KotlinDebug\n*F\n+ 1 SportDetailMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailMapFragment\n*L\n107#1:1040\n107#1:1041\n196#1:1042,3\n219#1:1045,3\n369#1:1048,2\n372#1:1050,2\n477#1:1052,2\n676#1:1054\n676#1:1055,3\n775#1:1058,2\n821#1:1060,2\n834#1:1062,2\n*E\n"})
public class SportDetailMapFragment extends BaseFragment {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy btnDownloadGpx$delegate;

    @aa1
    private final Lazy btnMap3D$delegate;

    @aa1
    private final Lazy btnMapHot$delegate;

    @aa1
    private final Lazy btnMapMark$delegate;

    @aa1
    private final Lazy btnTrackPlay$delegate;
    private boolean endMarkerAnchorCenter;
    private boolean isGradient;
    private final boolean isInChinaMainland;
    private boolean isLocationEmpty;
    private boolean isShowLineMarker;
    private boolean isShowMap;

    @aa1
    private final Lazy mBMapView$delegate;
    protected BaiduMap mBaiDuMap;
    private int mBaiDuMapLineWidth;

    @tb1
    private Polyline mBaiduDottedLine;

    @aa1
    private final ArrayList<LatLng> mBaiduDottedPoints;

    @tb1
    private HeatMap mBaiduHeatMap;

    @tb1
    private Polyline mBaiduLine;

    @tb1
    private Marker mBaiduLineEnd;

    @tb1
    private Marker mBaiduLineStart;

    @aa1
    private ArrayList<Marker> mBaiduMarkers;

    @aa1
    private final ArrayList<LatLng> mBaiduPoints;

    @aa1
    private ArrayList<Integer> mColorList;
    private int mCurrentIcon;

    @aa1
    private ArrayList<CustomLatLng> mFinalOriginalLocationList;

    @aa1
    private final Lazy mGMapView$delegate;

    @tb1
    private TileOverlay mGoogleHeatMapOverlay;

    @tb1
    private HeatmapTileProvider mGoogleHeatMapProvider;

    @tb1
    private com.google.android.gms.maps.model.Polyline mGoogleLine;

    @aa1
    private final List<StyleSpan> mGoogleLineColors;

    @tb1
    private com.google.android.gms.maps.model.Marker mGoogleLineEnd;

    @tb1
    private com.google.android.gms.maps.model.Marker mGoogleLineStart;
    protected GoogleMap mGoogleMap;

    @aa1
    private ArrayList<com.google.android.gms.maps.model.Marker> mGoogleMarkers;

    @aa1
    private final ArrayList<com.google.android.gms.maps.model.LatLng> mGooglePoints;

    @tb1
    private ArrayList<LatLng> mInitialPoints;

    @aa1
    private final ArrayList<Integer> mLineColors;

    @aa1
    private final Lazy mLocationDao$delegate;
    private int mMapLineColor;

    @aa1
    private ArrayList<CustomLatLng> mSmoothLocationList;
    private int mStartIcon;

    @aa1
    private TrackPlay mTrackPlay;
    public Workout mWorkout;

    @aa1
    private final Lazy rootView$delegate;
    private int speedRangeFast;
    private int speedRangeSlow;

    @tb1
    private SportDetailV2Activity sportDetailV2Activity;

    @aa1
    private final Lazy tvAvgBpmValue$delegate;

    @aa1
    private final Lazy tvCaloriesValue$delegate;

    @aa1
    private final Lazy tvDateTime$delegate;

    @aa1
    private final Lazy tvDistanceUnit$delegate;

    @aa1
    private final Lazy tvDistanceValue$delegate;

    @aa1
    private final Lazy tvDuration$delegate;

    @aa1
    private final AppUser userProfile;

    public static final class OXO1 implements TrackPlay.OXO1 {
        public final /* synthetic */ SportDetailMapFragment OXO1;

        public OXO1(SportDetailMapFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void OXO1(ArrayList<com.google.android.gms.maps.model.LatLng> r2, float r3) {
            Intrinsics.X0O(r2, "points");
            if (r2.size() <= 1) goto L6;
            this.OXO1.addGoogleLine(r2);
            return;
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void XIi00iiXO() {
            SportDetailMapFragment.access$getBtnMapHot(this.OXO1).setEnabled(true);
            SportDetailMapFragment.access$getBtnMapMark(this.OXO1).setEnabled(true);
            this.OXO1.getMColorList().clear();
            this.OXO1.getMColorList().addAll(this.OXO1.getMLineColors());
            this.OXO1.addLine();
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void XO0O10(ArrayList<LatLng> r1, float r2, int r3) {
            Intrinsics.X0O(r1, "points");
            this.OXO1.getMColorList().add(Integer.valueOf(r3));
            if (r1.size() <= 1) goto L6;
            this.OXO1.addBaiduLine(r1);
            return;
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void iO(float r1) {
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void onStart() {
            SportDetailMapFragment.access$getBtnMapHot(this.OXO1).setEnabled(false);
            SportDetailMapFragment.access$getBtnMapMark(this.OXO1).setEnabled(false);
            this.OXO1.getMColorList().clear();
        }
    }

    public static final class XIi00iiXO implements OnMapReadyCallback {
        public final /* synthetic */ SportDetailMapFragment OXO1;
        public final /* synthetic */ ArrayList<CustomLatLng> XIi00iiXO;

        public XIi00iiXO(SportDetailMapFragment r1, ArrayList<CustomLatLng> r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public void onMapReady(GoogleMap r3) {
            Intrinsics.X0O(r3, "googleMap");
            MapsInitializer.initialize(SportDetailMapFragment.access$getMActivity(this.OXO1));
            this.OXO1.setMGoogleMap(r3);
            ArrayList<CustomLatLng> r0 = this.XIi00iiXO;
            r3.moveCamera(CameraUpdateFactory.newLatLngZoom(X0IO1OOi.XIi00iiXO(r0), e40.XIi00iiXO(r0)));
            this.OXO1.addLine();
        }
    }

    public SportDetailMapFragment() {
        this.TAG = "SportDetailMapFragment";
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new uv4(this));
        this.tvDateTime$delegate = LazyKt__LazyJVMKt.iO(new dw4(this));
        this.tvDuration$delegate = LazyKt__LazyJVMKt.iO(new ew4(this));
        this.tvAvgBpmValue$delegate = LazyKt__LazyJVMKt.iO(new fw4(this));
        this.tvDistanceValue$delegate = LazyKt__LazyJVMKt.iO(new kv4(this));
        this.tvDistanceUnit$delegate = LazyKt__LazyJVMKt.iO(new lv4(this));
        this.tvCaloriesValue$delegate = LazyKt__LazyJVMKt.iO(new mv4(this));
        this.btnMapHot$delegate = LazyKt__LazyJVMKt.iO(new nv4(this));
        this.btnMap3D$delegate = LazyKt__LazyJVMKt.iO(new ov4(this));
        this.btnMapMark$delegate = LazyKt__LazyJVMKt.iO(new pv4(this));
        this.btnDownloadGpx$delegate = LazyKt__LazyJVMKt.iO(new yv4(this));
        this.btnTrackPlay$delegate = LazyKt__LazyJVMKt.iO(new zv4(this));
        this.mGMapView$delegate = LazyKt__LazyJVMKt.iO(new aw4(this));
        this.mGoogleMarkers = new ArrayList();
        this.mGooglePoints = new ArrayList();
        this.mBMapView$delegate = LazyKt__LazyJVMKt.iO(new bw4(this));
        this.mBaiduMarkers = new ArrayList();
        this.mBaiduPoints = new ArrayList();
        this.endMarkerAnchorCenter = true;
        this.mLineColors = new ArrayList();
        this.mGoogleLineColors = new ArrayList();
        this.mBaiDuMapLineWidth = SizeUtils.dp2px(3.5f);
        this.mBaiduDottedPoints = new ArrayList();
        a01 r2 = a01.OXO1;
        SPUtils r3 = r2.IiI10X();
        Object r4 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r5 = new Gson().fromJson(r3.getString(AppUser.class.getName()), AppUser.class);
        if (r5 == null) goto L6;
        r4 = r5;
    L6:
        this.userProfile = (AppUser) r4;
        this.mLocationDao$delegate = LazyKt__LazyJVMKt.iO(new cw4());
        this.isInChinaMainland = r2.OXO1().getBoolean(b01.XiOIO, false);
        this.mSmoothLocationList = new ArrayList();
        this.mFinalOriginalLocationList = new ArrayList();
        this.mStartIcon = R.drawable.icon_sport_map_start;
        this.mCurrentIcon = R.drawable.icon_sport_map_end;
        this.isShowLineMarker = true;
        this.mMapLineColor = R.color.map_track_color;
        this.mColorList = new ArrayList();
        this.mTrackPlay = new TrackPlay(new OXO1(this));
        this.isLocationEmpty = true;
    }

    public static /* synthetic */ TextView I0IIOi(SportDetailMapFragment r0) {
        return tvAvgBpmValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox I0iXXO(SportDetailMapFragment r0) {
        return btnMapHot_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void I1XOi1(SportDetailMapFragment r0, Bitmap r1, Bitmap r2) {
        share$lambda$1(r0, r1, r2);
    }

    public static /* synthetic */ RelativeLayout IIX1OXO(SportDetailMapFragment r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IO(SportDetailMapFragment r0) {
        return tvDateTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextureMapView IiI10X(SportDetailMapFragment r0) {
        return mBMapView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LocationDao O00() {
        return mLocationDao_delegate$lambda$0();
    }

    public static /* synthetic */ void O10IXXX0X(SportDetailMapFragment r0, Bitmap r1, Bitmap r2) {
        share$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ void OII(SportDetailMapFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void OIX0iXi(SportDetailMapFragment r0, View r1) {
        initView$lambda$4(r0, r1);
    }

    public static /* synthetic */ TextView OIi0(SportDetailMapFragment r0) {
        return tvCaloriesValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OiIIX101O(SportDetailMapFragment r0, CompoundButton r1, boolean r2) {
        initView$lambda$2(r0, r1, r2);
    }

    public static /* synthetic */ TextView X0O(SportDetailMapFragment r0) {
        return tvDistanceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox X1ii(SportDetailMapFragment r0) {
        return btnDownloadGpx_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button XIi00iiXO(SportDetailMapFragment r0) {
        return btnTrackPlay_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XO0O10(SportDetailMapFragment r0, CompoundButton r1, boolean r2) {
        initView$lambda$3(r0, r1, r2);
    }

    public static /* synthetic */ TextView XOO0ii0(SportDetailMapFragment r0) {
        return tvDuration_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CustomGoogleMapView XX0(SportDetailMapFragment r0) {
        return mGMapView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox XXI(SportDetailMapFragment r0) {
        return btnMapMark_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(SportDetailMapFragment r0, MotionEvent r1) {
        showBaiDuMap$lambda$2(r0, r1);
    }

    public static /* synthetic */ void XiOIii1(SportDetailMapFragment r0, CompoundButton r1, boolean r2) {
        initView$lambda$1(r0, r1, r2);
    }

    public static final /* synthetic */ CheckBox access$getBtnMapHot(SportDetailMapFragment r0) {
        return r0.getBtnMapHot();
    }

    public static final /* synthetic */ CheckBox access$getBtnMapMark(SportDetailMapFragment r0) {
        return r0.getBtnMapMark();
    }

    public static final /* synthetic */ Activity access$getMActivity(SportDetailMapFragment r0) {
        return r0.getMActivity();
    }

    private final void addBaiduDottedLine(ArrayList<LatLng> r4) {
        PolylineOptions r5 = new PolylineOptions().width(this.mBaiDuMapLineWidth).color(ContextCompat.getColor(requireContext(), this.mMapLineColor)).dottedLine(true).dottedLineType(PolylineDottedLineType.DOTTED_LINE_CIRCLE).zIndex(2).points(r4);
        Intrinsics.O10IXXX0X(r5, "points(...)");
        Overlay r6 = getMBaiDuMap().addOverlay(r5);
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type com.baidu.mapapi.map.Polyline");
        this.mBaiduDottedLine = (Polyline) r6;
    }

    private final void addBaiduMarkView(ArrayList<CustomLatLng> r10) {
        this.mBaiduMarkers.clear();
        Context r1 = requireContext();
        Intrinsics.O10IXXX0X(r1, "requireContext(...)");
        zo5 r0 = new zo5(r1, R.layout.map_markers_text);
        Iterator<T> r11 = r10.iterator();
        int r2 = 0;
    L4:
        if (r11.hasNext() == false) goto L9;
        Object r3 = r11.next();
        int r4 = r2 + 1;
        if (r2 >= 0) goto L8;
        CollectionsKt__CollectionsKt.XOX0O0();
    L8:
        CustomLatLng r5 = (CustomLatLng) r3;
        MarkerOptions r6 = new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(r0.XIi00iiXO(String.valueOf(r4)))).zIndex(9).position(new LatLng(r5.getLatitude(), r5.getLongitude()));
        Overlay r7 = getMBaiDuMap().addOverlay(r6);
        Intrinsics.X1ii(r7, "null cannot be cast to non-null type com.baidu.mapapi.map.Marker");
        ArrayList<Marker> r8 = this.mBaiduMarkers;
        r8.add((Marker) r7);
        r2 = r4;
        goto L4
    }

    private final void addGoogleMarkView(ArrayList<CustomLatLng> r10) {
        this.mGoogleMarkers.clear();
        Context r1 = requireContext();
        Intrinsics.O10IXXX0X(r1, "requireContext(...)");
        zo5 r0 = new zo5(r1, R.layout.map_markers_text);
        Iterator<T> r11 = r10.iterator();
        int r2 = 0;
    L4:
        if (r11.hasNext() == false) goto L9;
        Object r3 = r11.next();
        int r4 = r2 + 1;
        if (r2 >= 0) goto L8;
        CollectionsKt__CollectionsKt.XOX0O0();
    L8:
        CustomLatLng r5 = (CustomLatLng) r3;
        com.google.android.gms.maps.model.MarkerOptions r6 = new com.google.android.gms.maps.model.MarkerOptions().icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(r0.XIi00iiXO(String.valueOf(r4)))).zIndex(9.0f).position(new com.google.android.gms.maps.model.LatLng(r5.getLatitude(), r5.getLongitude()));
        Intrinsics.O10IXXX0X(r6, "position(...)");
        com.google.android.gms.maps.model.Marker r7 = getMGoogleMap().addMarker(r6);
        Intrinsics.XXI(r7);
        this.mGoogleMarkers.add(r7);
        r2 = r4;
        goto L4
    }

    private static final CheckBox btnDownloadGpx_delegate$lambda$0(SportDetailMapFragment r1) {
        return (CheckBox) r1.getMView().findViewById(R.id.downloadGpxIb);
    }

    private static final CheckBox btnMap3D_delegate$lambda$0(SportDetailMapFragment r1) {
        return (CheckBox) r1.getMView().findViewById(R.id.btn_map_3d);
    }

    private static final CheckBox btnMapHot_delegate$lambda$0(SportDetailMapFragment r1) {
        return (CheckBox) r1.getMView().findViewById(R.id.btn_map_hot);
    }

    private static final CheckBox btnMapMark_delegate$lambda$0(SportDetailMapFragment r1) {
        return (CheckBox) r1.getMView().findViewById(R.id.btn_map_mark);
    }

    private static final Button btnTrackPlay_delegate$lambda$0(SportDetailMapFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_track_play);
    }

    private final void calculateModeSpeed() {
        LogUtils.d(new Object[]{"calculateModeSpeed  mode = " + getMWorkout().getMMode()});
        int r0 = getMWorkout().getMMode();
        if (r0 != 12) goto L5;
        o65 r1 = o65.OXO1;
        this.speedRangeSlow = r1.XIi00iiXO(3600, 4000);
        this.speedRangeFast = r1.XIi00iiXO(3600, 7000);
        return;
    L5:
        if (r0 != 13) goto L7;
        o65 r2 = o65.OXO1;
        this.speedRangeSlow = r2.XIi00iiXO(3600, 3000);
        this.speedRangeFast = r2.XIi00iiXO(3600, 5000);
        return;
    L7:
        if (r0 != 19) goto L9;
        o65 r3 = o65.OXO1;
        this.speedRangeSlow = r3.XIi00iiXO(3600, 10000);
        this.speedRangeFast = r3.XIi00iiXO(3600, ErrorCode.MSP_ERROR_ISV_NO_USER);
        return;
    L9:
        if (r0 == 50) goto L18;
        switch(r0) {
            case 7: goto L16;
            case 8: goto L16;
            case 9: goto L14;
            case 10: goto L12;
            default: goto L11;
        };
    L11:
        return;
    L12:
        o65 r4 = o65.OXO1;
        this.speedRangeSlow = r4.XIi00iiXO(3600, 15000);
        this.speedRangeFast = r4.XIi00iiXO(3600, ErrorCode.ERROR_AIMIC_BASE);
        return;
    L14:
        o65 r5 = o65.OXO1;
        this.speedRangeSlow = r5.XIi00iiXO(3600, 3000);
        this.speedRangeFast = r5.XIi00iiXO(3600, 6000);
        return;
    L16:
        o65 r6 = o65.OXO1;
        this.speedRangeSlow = r6.XIi00iiXO(3600, 8000);
        this.speedRangeFast = r6.XIi00iiXO(3600, 10000);
        return;
    L18:
        o65 r7 = o65.OXO1;
        this.speedRangeSlow = r7.XIi00iiXO(3600, 3000);
        this.speedRangeFast = r7.XIi00iiXO(3600, 6000);
    }

    private final void calculateSpeedColor(int r2, int r3, int r4, CustomLatLng r5, ArrayList<CustomLatLng> r6) {
        if (this.speedRangeSlow == 0) goto L5;
    L7:
        int r7 = speedColorV2(r4);
    L8:
        r6.add(r5);
        Iterator<CustomLatLng> r8 = r6.iterator();
        Intrinsics.O10IXXX0X(r8, "iterator(...)");
    L10:
        if (r8.hasNext() == false) goto L12;
        CustomLatLng r9 = r8.next();
        Intrinsics.O10IXXX0X(r9, "next(...)");
        this.mLineColors.add(Integer.valueOf(r7));
        r9.setColor(r7);
        goto L10
    L12:
        r6.clear();
        return;
    L5:
        if (this.speedRangeFast != 0) goto L7;
        r7 = speedColorV1(r2, r3, r4);
        goto L8
    }

    private final Overlay createBaiduIcon(int r3, LatLng r4, boolean r5) {
        BaiduMap r0 = getMBaiDuMap();
        MarkerOptions r6 = new MarkerOptions().position(r4).icon(BitmapDescriptorFactory.fromResource(r3)).draggable(false).flat(true).zIndex(9);
        if (r5 == true) goto L5;
    L7:
        Overlay r7 = r0.addOverlay(r6);
        Intrinsics.O10IXXX0X(r7, "addOverlay(...)");
        return r7;
    L5:
        if (this.endMarkerAnchorCenter == false) goto L7;
        r6.anchor(0.5f, 0.5f);
        goto L7
    }

    public static /* synthetic */ Overlay createBaiduIcon$default(SportDetailMapFragment r0, int r1, LatLng r2, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = false;
    L7:
        return r0.createBaiduIcon(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBaiduIcon");
    }

    private final CheckBox getBtnDownloadGpx() {
        return (CheckBox) getValue();
    }

    private final CheckBox getBtnMap3D() {
        return (CheckBox) getValue();
    }

    private final CheckBox getBtnMapHot() {
        return (CheckBox) getValue();
    }

    private final CheckBox getBtnMapMark() {
        return (CheckBox) getValue();
    }

    private final void getGradientLineColors(ArrayList<CustomLatLng> r23) {
        SportDetailMapFragment r0 = this;
        int r1 = 0;
        CustomLatLng r7 = new CustomLatLng(r23.get(0).getLatitude(), r23.get(0).getLongitude(), r23.get(0).getTime(), r23.get(0).getAltitude(), 0, 16, null);
        long r2 = r7.getTime();
        if (r0.getMWorkout().getMDistance() <= 1000) goto L6;
        int r4 = 300;
    L5:
        int r9 = r4;
        ArrayList<CustomLatLng> r5 = new ArrayList();
        int r10 = r23.size();
        int r12 = 0;
        long r3 = r2;
        float r13 = 0.0f;
        int r6 = 0;
    L8:
        if (r12 >= r10) goto L32;
        CustomLatLng r14 = r23.get(r12);
        Intrinsics.O10IXXX0X(r14, "get(...)");
        CustomLatLng r15 = r14;
        if (r15.getLatitude() == r7.getLatitude()) goto L12;
    L14:
        int r17 = r12;
        long r20 = r3;
        r13 = r13 + (mc0.iIi1(DistanceUtil.getDistance(new LatLng(r7.getLatitude(), r7.getLongitude()), new LatLng(r15.getLatitude(), r15.getLongitude())) * ((double) 100)) / 100.0f);
        int r8 = r9;
        if (r13 >= r8) goto L20;
        int r11 = r17;
        if (r11 == (r23.size() - 1)) goto L21;
        r5.add(r15);
        ArrayList<CustomLatLng> r18 = r5;
        CustomLatLng r16 = r15;
    L30:
        r7.setLatitude(r16.getLatitude());
        r7.setLongitude(r16.getLongitude());
        r7.setTime(r16.getTime());
        r7.setAltitude(r16.getAltitude());
        r3 = r20;
    L31:
        r12 = r11 + 1;
        r9 = r8;
        r5 = r18;
    L21:
        long r19 = Math.abs(r15.getTime() - r20) / ((long) 1000);
        int r110 = o65.OXO1.XIi00iiXO((int) r19, (int) r13);
        int r111 = r0.speedRangeFast;
        int r112 = r0.speedRangeSlow;
        StringBuilder r21 = new StringBuilder();
        ArrayList<CustomLatLng> r113 = r5;
        r21.append("getGradientLineColors distance = ");
        r21.append(r13);
        r21.append("  intervalTime = ");
        r21.append(r19);
        r21.append("  secondSpeed = ");
        r21.append(r110);
        r21.append("  speedRangeFast = ");
        r21.append(r111);
        r21.append("  , speedRangeSlow = ");
        r21.append(r112);
        LogUtils.d(new Object[]{r21.toString()});
        if (r110 < r6) goto L24;
        if (r6 == 0) goto L24;
    L25:
        if (r110 <= r1) goto L28;
        r1 = r110;
        int r22 = r1;
    L27:
        r0 = this;
        r16 = r15;
        r0.calculateSpeedColor(r1, r6, r22, r16, r113);
        r18 = r113;
        r20 = r16.getTime();
        r13 = 0.0f;
        goto L30
    L28:
        r22 = r110;
    L24:
        r6 = r110;
        goto L25
    L20:
        r11 = r17;
        goto L21
    L12:
        if (r15.getLongitude() != r7.getLongitude()) goto L14;
        r5.add(r15);
        r18 = r5;
        r8 = r9;
        r11 = r12;
        goto L31
    L32:
        ArrayList<CustomLatLng> r114 = r5;
        if (r0.isGradient == true) goto L35;
        return;
    L35:
        if (r0.mLineColors.size() == 0) goto L37;
        return;
    L37:
        if (r114.size() <= 0) goto L48;
        Iterator<T> r24 = r114.iterator();
    L40:
        if (r24.hasNext() == false) goto L49;
        CustomLatLng r25 = (CustomLatLng) r24.next();
        r0.mLineColors.add(Integer.valueOf(ContextCompat.getColor(r0.requireContext(), R.color.sport_detail_bg_startColor)));
        goto L40
    L49:
        return;
    L48:
        return;
    L6:
        r4 = 20;
        goto L5
    }

    private final void getIntiLocationList() {
        SportDetailV2Activity r0 = this.sportDetailV2Activity;
        if (r0 == null) goto L8;
        SportDetailViewModel r1 = r0.getMSportViewModel();
        if (r1 == null) goto L9;
        r1.getIntiLocationList(this.mSmoothLocationList, this.userProfile.getUnit());
        return;
    L9:
        return;
    }

    private final LocationDao getMLocationDao() {
        return (LocationDao) getValue();
    }

    private final void getMarkersData() {
        SportDetailV2Activity r0 = this.sportDetailV2Activity;
        if (r0 == null) goto L8;
        SportDetailViewModel r1 = r0.getMSportViewModel();
        if (r1 == null) goto L9;
        r1.getMarkList(this.mSmoothLocationList, this.userProfile.getUnit());
        return;
    L9:
        return;
    }

    private final void getSportDetailActivity() {
        if ((getActivity() instanceof SportDetailV2Activity) == false) goto L6;
        FragmentActivity r0 = getActivity();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2Activity");
        this.sportDetailV2Activity = (SportDetailV2Activity) r0;
        return;
    }

    private final TextView getTvAvgBpmValue() {
        return (TextView) getValue();
    }

    private final TextView getTvCaloriesValue() {
        return (TextView) getValue();
    }

    private final TextView getTvDistanceUnit() {
        return (TextView) getValue();
    }

    private final TextView getTvDistanceValue() {
        return (TextView) getValue();
    }

    private final TextView getTvDuration() {
        return (TextView) getValue();
    }

    public static /* synthetic */ TextView iIiiO(SportDetailMapFragment r0) {
        return tvDistanceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CheckBox iO(SportDetailMapFragment r0) {
        return btnMap3D_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(SportDetailMapFragment r0, View r1) {
        r0.downloadGpx();
    }

    private static final void initView$lambda$1(SportDetailMapFragment r1, CompoundButton r2, boolean r3) {
        Intrinsics.X0O(r2, "buttonView");
        r1.showHot(r3);
        if (r3 == false) goto L6;
        r1.removeLine();
        return;
    L6:
        r1.addLine();
    }

    private static final void initView$lambda$2(SportDetailMapFragment r1, CompoundButton r2, boolean r3) {
        Intrinsics.X0O(r2, "buttonView");
        r1.show3d(r3);
    }

    private static final void initView$lambda$3(SportDetailMapFragment r1, CompoundButton r2, boolean r3) {
        Intrinsics.X0O(r2, "buttonView");
        r1.showMark(r3);
    }

    private static final void initView$lambda$4(SportDetailMapFragment r1, View r2) {
        if (r1.isMapInitialized() == true) goto L6;
        i1O0OXO1O.OXO1.OXO1(r1.TAG + " isMapInitialized false");
        return;
    L6:
        r1.playTrack();
    }

    private static final TextureMapView mBMapView_delegate$lambda$0(SportDetailMapFragment r1) {
        return (TextureMapView) r1.getMView().findViewById(R.id.bMapView);
    }

    private static final CustomGoogleMapView mGMapView_delegate$lambda$0(SportDetailMapFragment r1) {
        return (CustomGoogleMapView) r1.getMView().findViewById(R.id.gMapView);
    }

    private static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    private final void onConvertLocation(List<Location> r7, boolean r8) {
        this.mFinalOriginalLocationList = LocationData.INSTANCE.getFinalLocationList(r7, this.isInChinaMainland, r8);
        if (i72.OXO1.OX0() == false) goto L8;
        Iterator<T> r9 = this.mFinalOriginalLocationList.iterator();
    L6:
        if (r9.hasNext() == false) goto L8;
        CustomLatLng r10 = (CustomLatLng) r9.next();
        this.mBaiduDottedPoints.add(new LatLng(r10.getLatitude(), r10.getLongitude()));
    L8:
        this.mSmoothLocationList.addAll(LocationData.INSTANCE.getSmoothLocationListAlgorithm(this.mFinalOriginalLocationList, getMWorkout().getMMode()));
        getIntiLocationList();
        showMapContent(this.mSmoothLocationList, this.isInChinaMainland);
    }

    public static /* synthetic */ void onConvertLocation$default(SportDetailMapFragment r0, List r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        r0.onConvertLocation(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onConvertLocation");
    }

    private final void removeLine() {
        if (this.isInChinaMainland == false) goto L15;
        Marker r0 = this.mBaiduLineStart;
        if (r0 == null) goto L7;
        r0.remove();
    L7:
        this.mBaiduLineStart = null;
        Polyline r1 = this.mBaiduLine;
        if (r1 == null) goto L10;
        r1.remove();
    L10:
        this.mBaiduLine = null;
        Marker r2 = this.mBaiduLineEnd;
        if (r2 == null) goto L13;
        r2.remove();
    L13:
        this.mBaiduLineEnd = null;
        return;
    L15:
        com.google.android.gms.maps.model.Marker r3 = this.mGoogleLineStart;
        if (r3 == null) goto L18;
        r3.remove();
    L18:
        this.mGoogleLineStart = null;
        com.google.android.gms.maps.model.Polyline r4 = this.mGoogleLine;
        if (r4 == null) goto L21;
        r4.remove();
    L21:
        this.mGoogleLine = null;
        com.google.android.gms.maps.model.Marker r5 = this.mGoogleLineEnd;
        if (r5 == null) goto L24;
        r5.remove();
    L24:
        this.mGoogleLineEnd = null;
    }

    private static final RelativeLayout rootView_delegate$lambda$0(SportDetailMapFragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.root_view);
    }

    private static final void share$lambda$0(SportDetailMapFragment r0, Bitmap r1, Bitmap r2) {
        if (r2 == null) goto L5;
        r0.shareMapBitmap(r1, r2);
        return;
    }

    private static final void share$lambda$1(SportDetailMapFragment r0, Bitmap r1, Bitmap r2) {
        if (r2 == null) goto L5;
        r0.shareMapBitmap(r1, r2);
        return;
    }

    private final void show3d(boolean r3) {
        LogUtils.d(new Object[]{"show3d " + r3});
        if (this.mGoogleMap == null) goto L5;
    L8:
        if (r3 == false) goto L16;
        if (this.isInChinaMainland == false) goto L13;
        getMBaiDuMap().setMapType(2);
        return;
    L13:
        getMGoogleMap().setMapType(2);
        return;
    L16:
        if (this.isInChinaMainland == false) goto L19;
        getMBaiDuMap().setMapType(1);
        return;
    L19:
        getMGoogleMap().setMapType(1);
        return;
    L5:
        if (this.isInChinaMainland == true) goto L8;
        ToastUtils.showShort("This feature cannot be used if Google services are not supported.", new Object[0]);
    }

    private final void showBaiDuMap(ArrayList<CustomLatLng> r5) {
        getMBMapView().setVisibility(0);
        TextureMapView r0 = getMBMapView();
        r0.showZoomControls(false);
        r0.showScaleControl(false);
        BaiduMap r1 = getMBMapView().getMap();
        r1.setCompassEnable(false);
        Intrinsics.O10IXXX0X(r1, "apply(...)");
        setMBaiDuMap(r1);
        getMBaiDuMap().setOnMapTouchListener(new jv4(this));
        mapStatusBaiDuCenterPoint(r5);
        getMBaiDuMap().setMapStatus(MapStatusUpdateFactory.newLatLngBounds(iOXO11i1.OXO1(r5), getMBMapView().getWidth(), getMBMapView().getHeight()));
        getMBaiDuMap().setMapStatus(MapStatusUpdateFactory.zoomTo(e40.XIi00iiXO(r5) + 0.5f));
        addLine();
    }

    private static final void showBaiDuMap$lambda$2(SportDetailMapFragment r1, MotionEvent r2) {
        if (r2.getAction() != 1) goto L8;
        RelativeLayout r3 = r1.getRootView();
        if (r3 == null) goto L12;
        r3.requestDisallowInterceptTouchEvent(false);
        return;
    L12:
        return;
    L8:
        RelativeLayout r4 = r1.getRootView();
        if (r4 == null) goto L13;
        r4.requestDisallowInterceptTouchEvent(true);
        return;
    }

    private final void showGoogleMap(ArrayList<CustomLatLng> r3) {
        CustomGoogleMapView r0 = getMGMapView();
        r0.setVisibility(0);
        r0.onCreate(null);
        r0.getMapAsync(new XIi00iiXO(this, r3));
    }

    private final void showHot(boolean r3) {
        LogUtils.d(new Object[]{"showHot " + r3});
        if (r3 == false) goto L14;
        if (this.isInChinaMainland == true) goto L25;
        this.mGoogleHeatMapProvider = new HeatmapTileProvider.Builder().data(this.mGooglePoints).radius(50).build();
        GoogleMap r4 = getMGoogleMap();
        TileOverlayOptions r0 = new TileOverlayOptions();
        HeatmapTileProvider r1 = this.mGoogleHeatMapProvider;
        Intrinsics.XXI(r1);
        this.mGoogleHeatMapOverlay = r4.addTileOverlay(r0.tileProvider(r1));
        return;
    L25:
        this.mBaiduHeatMap = new HeatMap.Builder().data(this.mBaiduPoints).radius(50).build();     // Catch: Exception -> L8
        getMBaiDuMap().addHeatMap(this.mBaiduHeatMap);     // Catch: Exception -> L8
        return;
    L8:
        e = move-exception;
        e.printStackTrace();
        return;
    L14:
        if (this.isInChinaMainland == false) goto L20;
        HeatMap r5 = this.mBaiduHeatMap;
        if (r5 == null) goto L18;
        r5.removeHeatMap();
    L18:
        this.mBaiduHeatMap = null;
        return;
    L20:
        TileOverlay r6 = this.mGoogleHeatMapOverlay;
        if (r6 == null) goto L23;
        r6.remove();
    L23:
        this.mGoogleHeatMapProvider = null;
    }

    private final void showLocation() {
        List<Location> r0 = getMLocationDao().getLocation(getMWorkout().getMStart(), getMWorkout().getMEnd());
        if (r0.isEmpty() == false) goto L5;
    L8:
        boolean r1 = true;
    L9:
        this.isLocationEmpty = r1;
        showMapLocation(r0);
        return;
    L5:
        if (r0.size() < 2) goto L8;
        r1 = false;
        goto L9
    }

    private final void showMapContent(ArrayList<CustomLatLng> r8, boolean r9) {
        this.isShowMap = true;
        LogUtils.d(new Object[]{"showMapContent isInChinaMainland=" + r9});
        LogUtils.d(new Object[]{"showMapContent locationList=" + r8});
        if (this.isGradient == false) goto L5;
        calculateModeSpeed();
        getGradientLineColors(r8);
    L5:
        if (r9 == false) goto L14;
        Iterator<T> r10 = r8.iterator();
    L8:
        if (r10.hasNext() == false) goto L10;
        CustomLatLng r0 = (CustomLatLng) r10.next();
        this.mBaiduPoints.add(new LatLng(r0.getLatitude(), r0.getLongitude()));
        goto L8
    L10:
        showBaiDuMap(r8);
        if (i72.OXO1.OX0() == false) goto L22;
        addBaiduDottedLine(this.mBaiduDottedPoints);
        return;
    L22:
        return;
    L14:
        Iterator<T> r11 = r8.iterator();
    L16:
        if (r11.hasNext() == false) goto L18;
        CustomLatLng r1 = (CustomLatLng) r11.next();
        this.mGooglePoints.add(new com.google.android.gms.maps.model.LatLng(r1.getLatitude(), r1.getLongitude()));
        goto L16
    L18:
        showGoogleMap(r8);
    }

    private final void showMark(boolean r3) {
        LogUtils.d(new Object[]{"showMark " + r3});
        if (r3 == false) goto L11;
        if (this.isInChinaMainland == false) goto L8;
        getMarkersData();
        return;
    L8:
        getMarkersData();
        return;
    L11:
        if (this.isInChinaMainland == false) goto L16;
        Iterator<T> r4 = this.mBaiduMarkers.iterator();
    L14:
        if (r4.hasNext() == false) goto L20;
        ((Marker) r4.next()).remove();
        goto L14
    L20:
        return;
    L16:
        Iterator<T> r5 = this.mGoogleMarkers.iterator();
    L18:
        if (r5.hasNext() == false) goto L23;
        ((com.google.android.gms.maps.model.Marker) r5.next()).remove();
        goto L18
    }

    private final int speedColorV1(int r2, int r3, int r4) {
        int r5 = (r2 - r3) / 10;
        if (r4 <= ((r5 * 5) + r3)) goto L7;
        return ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_startColor);
    L7:
        if (r4 <= (r3 + (r5 * 2))) goto L11;
        return ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_centerColor);
    L11:
        return ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_endColor);
    }

    private final int speedColorV2(int r2) {
        if (r2 <= this.speedRangeSlow) goto L7;
        return ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_startColor);
    L7:
        if (r2 >= this.speedRangeFast) goto L11;
        return ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_endColor);
    L11:
        return ContextCompat.getColor(requireContext(), R.color.sport_detail_bg_centerColor);
    }

    private static final TextView tvAvgBpmValue_delegate$lambda$0(SportDetailMapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_avg_bpm_value);
    }

    private static final TextView tvCaloriesValue_delegate$lambda$0(SportDetailMapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_calories_value);
    }

    private static final TextView tvDateTime_delegate$lambda$0(SportDetailMapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_dateTime);
    }

    private static final TextView tvDistanceUnit_delegate$lambda$0(SportDetailMapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_distance_unit);
    }

    private static final TextView tvDistanceValue_delegate$lambda$0(SportDetailMapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_distance_value);
    }

    private static final TextView tvDuration_delegate$lambda$0(SportDetailMapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_duration);
    }

    public final void addBaiduLine(@aa1 ArrayList<LatLng> r9) {
        Intrinsics.X0O(r9, "points");
        if (this.isShowLineMarker == false) goto L10;
        Marker r0 = this.mBaiduLineStart;
        if (r0 != null) goto L7;
        SportDetailMapFragment r2 = this;
        Overlay r1 = createBaiduIcon$default(r2, this.mStartIcon, (LatLng) CollectionsKt___CollectionsKt.IIII0iI(r9), false, 4, null);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.baidu.mapapi.map.Marker");
        r2.mBaiduLineStart = (Marker) r1;
    L12:
        if (r2.mBaiduLine != null) goto L18;
        r2.mInitialPoints = r9;
        PolylineOptions r3 = new PolylineOptions().width(r2.mBaiDuMapLineWidth).color(ContextCompat.getColor(requireContext(), r2.mMapLineColor)).isGradient(r2.isGradient);
        if (r2.isGradient == false) goto L16;
        r3.colorsValues(r2.mLineColors);
    L16:
        PolylineOptions r4 = r3.zIndex(8).points(r9);
        Intrinsics.O10IXXX0X(r4, "points(...)");
        Overlay r5 = getMBaiDuMap().addOverlay(r4);
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.baidu.mapapi.map.Polyline");
        r2.mBaiduLine = (Polyline) r5;
    L26:
        if (r2.isShowLineMarker == false) goto L34;
        Marker r6 = r2.mBaiduLineEnd;
        if (r6 != null) goto L31;
        Overlay r10 = createBaiduIcon(r2.mCurrentIcon, (LatLng) CollectionsKt___CollectionsKt.Xi1XO00(r9), true);
        Intrinsics.X1ii(r10, "null cannot be cast to non-null type com.baidu.mapapi.map.Marker");
        r2.mBaiduLineEnd = (Marker) r10;
        return;
    L31:
        if (r6 == null) goto L35;
        r6.setPosition((LatLng) CollectionsKt___CollectionsKt.Xi1XO00(r9));
        return;
    L35:
        return;
    L34:
        return;
    L18:
        if (r2.isGradient == false) goto L22;
        int[] r7 = CollectionsKt___CollectionsKt.O011OOIO0(r2.mColorList);
        Polyline r8 = r2.mBaiduLine;
        if (r8 == null) goto L22;
        r8.setColorList(r7);
    L22:
        Polyline r11 = r2.mBaiduLine;
        if (r11 == null) goto L26;
        r11.setPoints(r9);
        goto L26
    L7:
        r2 = this;
        if (r0 == null) goto L12;
        r0.setPosition((LatLng) CollectionsKt___CollectionsKt.IIII0iI(r9));
        goto L12
    L10:
        r2 = this;
        goto L12
    }

    public final void addGoogleLine(@aa1 ArrayList<com.google.android.gms.maps.model.LatLng> r7) {
        Intrinsics.X0O(r7, "points");
        GoogleMap r0 = getMGoogleMap();
        com.google.android.gms.maps.model.Marker r1 = this.mGoogleLineStart;
        if (r1 == null) goto L5;
    L7:
        if (r1 == null) goto L10;
        r1.setPosition((com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.IIII0iI(r7));
    L10:
        if (this.isGradient == true) goto L12;
    L19:
        com.google.android.gms.maps.model.Polyline r2 = this.mGoogleLine;
        if (r2 != null) goto L26;
        com.google.android.gms.maps.model.PolylineOptions r3 = new com.google.android.gms.maps.model.PolylineOptions();
        r3.addAll(r7);
        r3.width(this.mBaiDuMapLineWidth);
        if (this.isGradient == false) goto L24;
        r3.addAllSpans(this.mGoogleLineColors);
    L25:
        Unit r4 = Unit.OXO1;
        this.mGoogleLine = r0.addPolyline(r3);
    L28:
        com.google.android.gms.maps.model.Marker r5 = this.mGoogleLineEnd;
        if (r5 == null) goto L31;
    L37:
        if (r5 == null) goto L41;
        r5.setPosition((com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.Xi1XO00(r7));
        return;
    L41:
        return;
    L31:
        if (this.isShowLineMarker == false) goto L37;
        com.google.android.gms.maps.model.MarkerOptions r8 = new com.google.android.gms.maps.model.MarkerOptions().position((com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.Xi1XO00(r7));
        if (this.endMarkerAnchorCenter == false) goto L35;
        r8.anchor(0.5f, 0.5f);
    L35:
        Unit r6 = Unit.OXO1;
        this.mGoogleLineEnd = r0.addMarker(r8.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(this.mCurrentIcon)));
        return;
    L24:
        r3.color(ContextCompat.getColor(requireContext(), this.mMapLineColor));
        goto L25
    L26:
        if (r2 == null) goto L28;
        r2.setPoints(r7);
        goto L28
    L12:
        if (this.mGoogleLineColors.size() != 0) goto L19;
        if (this.mLineColors.size() <= 0) goto L19;
        ArrayList<Integer> r9 = this.mLineColors;
        ArrayList r10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r9, 10));
        Iterator<T> r11 = r9.iterator();
    L17:
        if (r11.hasNext() == false) goto L19;
        r10.add(Boolean.valueOf(this.mGoogleLineColors.add(new StyleSpan(((Number) r11.next()).intValue()))));
        goto L17
    L5:
        if (this.isShowLineMarker == false) goto L7;
        this.mGoogleLineStart = r0.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position((com.google.android.gms.maps.model.LatLng) CollectionsKt___CollectionsKt.IIII0iI(r7)).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(this.mStartIcon)));
        goto L10
    }

    public final void addLine() {
        if (this.isInChinaMainland == false) goto L5;
        addBaiduLine(this.mBaiduPoints);
    L6:
        initializedMapFinish();
        return;
    L5:
        addGoogleLine(this.mGooglePoints);
        goto L6
    }

    public final void downloadGpx() {
        List<Location> r6 = getMLocationDao().getLocation(getMWorkout().getMStart(), getMWorkout().getMEnd());
        LocationData r0 = LocationData.INSTANCE;
        ArrayList<CustomLatLng> r1 = LocationData.getFinalLocationList$default(r0, r6, false, false, 4, null);
        if (r1.size() <= 0) goto L6;
        sz0 r7 = sz0.OXO1;
        FileIOUtils.writeFileFromString(uz0.O1O(r7), r0.getGpxFileString(r1, getMWorkout().getMStart(), this.userProfile.getNickname(), q62.OXO1.i01OOiI(getMWorkout().getMMode())));
        Intent r2 = new Intent("android.intent.action.SEND");
        r2.putExtra("android.intent.extra.TEXT", getString(R.string.share_gpx_file));
        r2.putExtra("android.intent.extra.STREAM", r7.XO0O10(uz0.O1O(r7)));
        r2.setType("application/gpx");
        startActivity(Intent.createChooser(r2, getString(R.string.share_gpx_file)));
        return;
    L6:
        ToastUtils.showLong(R.string.no_data);
    }

    public final Button getBtnTrackPlay() {
        return (Button) getValue();
    }

    public final boolean getEndMarkerAnchorCenter() {
        return this.endMarkerAnchorCenter;
    }

    public final TextureMapView getMBMapView() {
        return (TextureMapView) getValue();
    }

    @aa1
    public final BaiduMap getMBaiDuMap() {
        BaiduMap r0 = this.mBaiDuMap;
        if (r0 == null) goto L5;
        return r0;
    L5:
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
        return (CustomGoogleMapView) getValue();
    }

    @aa1
    public final List<StyleSpan> getMGoogleLineColors() {
        return this.mGoogleLineColors;
    }

    @aa1
    public final GoogleMap getMGoogleMap() {
        GoogleMap r0 = this.mGoogleMap;
        if (r0 == null) goto L5;
        return r0;
    L5:
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
        Workout r0 = this.mWorkout;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mWorkout");
        return null;
    }

    public final RelativeLayout getRootView() {
        return (RelativeLayout) getValue();
    }

    public final int getSpeedRangeFast() {
        return this.speedRangeFast;
    }

    public final int getSpeedRangeSlow() {
        return this.speedRangeSlow;
    }

    public final TextView getTvDateTime() {
        return (TextView) getValue();
    }

    @aa1
    public final AppUser getUserProfile() {
        return this.userProfile;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @SuppressLint({"SetTextI18n"})
    public void initView() {
        Serializable r0 = getMArg3();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        setMWorkout((Workout) r0);
        getSportDetailActivity();
        getTvDateTime().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(new Date(getMWorkout().getMStart())));
        getTvDuration().setText(O0X11OiO.iXiX011(getMWorkout().getMDuration() * 1000));
        getTvAvgBpmValue().setText(String.valueOf(getMWorkout().getMAvgBpm()));
        getTvDistanceValue().setText(String.valueOf(cp5.X1ii(getMWorkout().getMDistance(), this.userProfile.getUnit(), false, 4, null)));
        getTvDistanceUnit().setText(getString(cp5.XX0(this.userProfile.getUnit())));
        getTvCaloriesValue().setText(String.valueOf(getMWorkout().getMCalorie() / 1000));
        showLocation();
        getBtnDownloadGpx().setOnClickListener(new sv4(this));
        getBtnMapHot().setOnCheckedChangeListener(new tv4(this));
        getBtnMap3D().setOnCheckedChangeListener(new vv4(this));
        getBtnMapMark().setOnCheckedChangeListener(new wv4(this));
        TrackPlay r1 = getMTrackPlay();
        ArrayList<CustomLatLng> r2 = this.mSmoothLocationList;
        if (this.isInChinaMainland == false) goto L5;
        TrackPlay.SourceType r3 = TrackPlay.SourceType.BAIDU;
    L6:
        r1.OII(r2, r3);
        getBtnTrackPlay().setOnClickListener(new xv4(this));
        return;
    L5:
        r3 = TrackPlay.SourceType.GOOGLE;
        goto L6
    }

    public void initializedMapFinish() {
    }

    public final boolean isGradient() {
        return this.isGradient;
    }

    public final boolean isInChina(double r2, double r4) {
        return i01I1i1X.OXO1.XO0O10(r2, r4);
    }

    public final boolean isInChinaMainland() {
        return this.isInChinaMainland;
    }

    public final boolean isLocationEmpty() {
        return this.isLocationEmpty;
    }

    public final boolean isMapInitialized() {
        if (this.isInChinaMainland == false) goto L9;
        if (this.mBaiDuMap == null) goto L7;
        return true;
    L7:
        return false;
    L9:
        if (this.mGoogleMap == null) goto L11;
        return true;
    L11:
        return false;
    }

    public final boolean isShowLineMarker() {
        return this.isShowLineMarker;
    }

    public int layoutId() {
        return R.layout.fragment_sport_detail_map;
    }

    public void mapStatusBaiDuCenterPoint(@aa1 ArrayList<CustomLatLng> r2) {
        Intrinsics.X0O(r2, "locationList");
        getMBaiDuMap().setMapStatus(iOXO11i1.XIi00iiXO(r2));
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.isShowMap == true) goto L5;
        return;
    L5:
        if (this.isInChinaMainland == false) goto L8;
        getMBMapView().onDestroy();
        return;
    L8:
        getMGMapView().onDestroy();
    }

    public void onLoadMarkView(@aa1 ArrayList<CustomLatLng> r2) {
        Intrinsics.X0O(r2, "list");
        if (this.isInChinaMainland == false) goto L6;
        addBaiduMarkView(r2);
        return;
    L6:
        addGoogleMarkView(r2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isShowMap == true) goto L5;
        return;
    L5:
        if (this.isInChinaMainland == false) goto L8;
        getMBMapView().onResume();
        return;
    L8:
        getMGMapView().onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.isShowMap == true) goto L5;
        return;
    L5:
        if (this.isInChinaMainland == false) goto L8;
        getMBMapView().onPause();
        return;
    L8:
        getMGMapView().onPause();
    }

    public void playTrack() {
        if (getMTrackPlay().O10IXXX0X() == true) goto L6;
        getBtnMapHot().setChecked(false);
        getBtnMapMark().setChecked(false);
        getMTrackPlay().X0O();
        return;
    }

    public final void setEndMarkerAnchorCenter(boolean r1) {
        this.endMarkerAnchorCenter = r1;
    }

    public final void setGradient(boolean r1) {
        this.isGradient = r1;
    }

    public final void setLocationEmpty(boolean r1) {
        this.isLocationEmpty = r1;
    }

    public final void setMBaiDuMap(@aa1 BaiduMap r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBaiDuMap = r2;
    }

    public final void setMBaiDuMapLineWidth(int r1) {
        this.mBaiDuMapLineWidth = r1;
    }

    public final void setMBaiduLineEnd(@tb1 Marker r1) {
        this.mBaiduLineEnd = r1;
    }

    public final void setMBaiduLineStart(@tb1 Marker r1) {
        this.mBaiduLineStart = r1;
    }

    public final void setMColorList(@aa1 ArrayList<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mColorList = r2;
    }

    public final void setMCurrentIcon(int r1) {
        this.mCurrentIcon = r1;
    }

    public final void setMGoogleMap(@aa1 GoogleMap r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mGoogleMap = r2;
    }

    public final void setMInitialPoints(@tb1 ArrayList<LatLng> r1) {
        this.mInitialPoints = r1;
    }

    public final void setMMapLineColor(int r1) {
        this.mMapLineColor = r1;
    }

    public final void setMSmoothLocationList(@aa1 ArrayList<CustomLatLng> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSmoothLocationList = r2;
    }

    public final void setMStartIcon(int r1) {
        this.mStartIcon = r1;
    }

    public void setMTrackPlay(@aa1 TrackPlay r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTrackPlay = r2;
    }

    public final void setMWorkout(@aa1 Workout r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWorkout = r2;
    }

    public final void setShowLineMarker(boolean r1) {
        this.isShowLineMarker = r1;
    }

    public final void setSpeedRangeFast(int r1) {
        this.speedRangeFast = r1;
    }

    public final void setSpeedRangeSlow(int r1) {
        this.speedRangeSlow = r1;
    }

    public void share(@aa1 final Bitmap r3) {
        Intrinsics.X0O(r3, "topBitmap");
        if (this.isInChinaMainland == false) goto L7;
        getMBaiDuMap().snapshot(new qv4(this, r3));
        return;
    L7:
        if (this.mGoogleMap == null) goto L10;
        getMGoogleMap().snapshot(new rv4(this, r3));
        return;
    L10:
        ToastUtils.showShort("Unable to share without Google services", new Object[0]);
    }

    public void shareMapBitmap(@aa1 Bitmap r7, @aa1 Bitmap r8) {
        Intrinsics.X0O(r7, "topBitmap");
        Intrinsics.X0O(r8, "mapBitmap");
        Bitmap r0 = Bitmap.createBitmap(getRootView().getWidth(), getRootView().getHeight() + r7.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r0, "createBitmap(...)");
        Canvas r1 = new Canvas(r0);
        r1.drawBitmap(r7, 0.0f, 0.0f, null);
        r1.drawBitmap(r8, 0.0f, r7.getHeight(), null);
        XIi1i01O r9 = XIi1i01O.OXO1;
        RelativeLayout r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r1.drawBitmap(r9.XIi00iiXO(r4), 0.0f, r7.getHeight(), null);
        r9.XO0O10(getMActivity(), r0);
    }

    public void showMapLocation(@aa1 List<Location> r6) {
        Intrinsics.X0O(r6, "locationList");
        if (this.isLocationEmpty == false) goto L5;
        return;
    L5:
        boolean r1 = false;
        if (r6.isEmpty() == true) goto L8;
        Location r0 = r6.get(0);
        r1 = isInChina(r0.getMLatitude(), r0.getMLongitude());
    L8:
        onConvertLocation(r6, r1);
    }
}
