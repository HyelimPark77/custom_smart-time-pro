package com.sma.smartv3.ui.sport;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bz4;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.cz4;
import com.android.mltcode.paycertificationapi.dz4;
import com.android.mltcode.paycertificationapi.ez4;
import com.android.mltcode.paycertificationapi.fz4;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gz4;
import com.android.mltcode.paycertificationapi.h0;
import com.android.mltcode.paycertificationapi.hz4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.iz4;
import com.android.mltcode.paycertificationapi.jz4;
import com.android.mltcode.paycertificationapi.kz4;
import com.android.mltcode.paycertificationapi.lz4;
import com.android.mltcode.paycertificationapi.mz4;
import com.android.mltcode.paycertificationapi.nr0;
import com.android.mltcode.paycertificationapi.nz4;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.oz4;
import com.android.mltcode.paycertificationapi.pz4;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qz4;
import com.android.mltcode.paycertificationapi.rz4;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.ye6;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.Utils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailVideoMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailVideoMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailVideoMapFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,637:1\n1878#2,3:638\n*S KotlinDebug\n*F\n+ 1 SportDetailVideoMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailVideoMapFragment\n*L\n503#1:638,3\n*E\n"})
public final class SportDetailVideoMapFragment extends SportDetailMapFragment implements h0<Bitmap> {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy btnSaveVideo$delegate;

    @aa1
    private final Lazy hrLineChart$delegate;

    @aa1
    private final Lazy ivAvatar$delegate;

    @aa1
    private final Lazy llHr$delegate;
    private long mEndTime;

    @aa1
    private File mFile;
    private int mFrameRate;

    @aa1
    private final Lazy mHeartRateDao$delegate;

    @aa1
    private final List<Bitmap> mList;

    @tb1
    private uq mLoadingPopup;
    private int mMaxSize;
    private long mStartTime;

    @aa1
    private TrackPlay mTrackPlay;
    private int nextIndex;
    private boolean playEndJump;

    @tb1
    private Bitmap rootBitmap;
    private float trackPlayProcess;

    @aa1
    private final Lazy tvAvgHrValue$delegate;

    @aa1
    private final Lazy tvDetailname$delegate;

    @aa1
    private final Lazy tvNickname$delegate;
    private float videoProcess;
    private boolean videoStart;

    public static final class OXO1 implements TrackPlay.OXO1 {
        public final /* synthetic */ SportDetailVideoMapFragment OXO1;

        public OXO1(SportDetailVideoMapFragment r1) {
            this.OXO1 = r1;
        }

        public static final void I0IIOi(SportDetailVideoMapFragment r1) {
            r1.generateVideo(1.0f);
            r1.setLoadingProcess();
        }

        public static /* synthetic */ void IiI10X(SportDetailVideoMapFragment r0) {
            XOO0ii0(r0);
        }

        public static /* synthetic */ void O00(SportDetailVideoMapFragment r0) {
            I0IIOi(r0);
        }

        public static final void XOO0ii0(SportDetailVideoMapFragment r1) {
            r1.generateVideo(1.0f);
            r1.setLoadingProcess();
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void OXO1(ArrayList<LatLng> r4, float r5) {
            Intrinsics.X0O(r4, "points");
            if (r4.size() <= 1) goto L6;
            this.OXO1.addGoogleLine(r4);
        L6:
            if (r5 != 1.0f) goto L8;
            this.OXO1.generateVideo(0.99f);
            this.OXO1.getMGoogleMap().moveCamera(CameraUpdateFactory.zoomIn());
            this.OXO1.getMGoogleMap().moveCamera(CameraUpdateFactory.zoomIn());
            Handler r6 = new Handler(Looper.getMainLooper());
            final SportDetailVideoMapFragment r7 = this.OXO1;
            r6.postDelayed(new rz4(r7), 200);
        L9:
            this.OXO1.setLoadingProcess();
            return;
        L8:
            this.OXO1.generateVideo(r5);
            goto L9
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void XIi00iiXO() {
            this.OXO1.getMColorList().clear();
            this.OXO1.getMColorList().addAll(this.OXO1.getMLineColors());
            this.OXO1.addLine();
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void XO0O10(ArrayList<com.baidu.mapapi.model.LatLng> r3, float r4, int r5) {
            Intrinsics.X0O(r3, "points");
            this.OXO1.getMColorList().add(Integer.valueOf(r5));
            if (r3.size() <= 1) goto L6;
            this.OXO1.addBaiduLine(r3);
        L6:
            if (r4 != 1.0f) goto L8;
            this.OXO1.generateVideo(0.99f);
            this.OXO1.getMBaiDuMap().animateMapStatus(MapStatusUpdateFactory.zoomIn(), 1000);
            Handler r6 = new Handler(Looper.getMainLooper());
            final SportDetailVideoMapFragment r7 = this.OXO1;
            r6.postDelayed(new qz4(r7), 200);
        L9:
            this.OXO1.setLoadingProcess();
            return;
        L8:
            this.OXO1.generateVideo(r4);
            goto L9
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void iO(float r1) {
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void onStart() {
            this.OXO1.getMColorList().clear();
        }
    }

    public SportDetailVideoMapFragment() {
        this.TAG = "SportDetailVideoMapFragment";
        this.ivAvatar$delegate = LazyKt__LazyJVMKt.iO(new bz4(this));
        this.tvNickname$delegate = LazyKt__LazyJVMKt.iO(new hz4(this));
        this.tvDetailname$delegate = LazyKt__LazyJVMKt.iO(new iz4(this));
        this.hrLineChart$delegate = LazyKt__LazyJVMKt.iO(new jz4(this));
        this.llHr$delegate = LazyKt__LazyJVMKt.iO(new kz4(this));
        this.mHeartRateDao$delegate = LazyKt__LazyJVMKt.iO(new lz4());
        this.tvAvgHrValue$delegate = LazyKt__LazyJVMKt.iO(new mz4(this));
        this.btnSaveVideo$delegate = LazyKt__LazyJVMKt.iO(new nz4(this));
        this.mList = new ArrayList();
        this.mFile = new File(uz0.OO(sz0.OXO1), "mapVideo" + getMArg1() + IiXI1X1OO.O00 + Utils.getApp().getResources().getConfiguration().locale.getLanguage() + ".mp4");
        this.mFrameRate = 40;
        this.mTrackPlay = new TrackPlay(new OXO1(this));
        setMStartIcon(R.drawable.icon_sport_map_start_v2);
        setMCurrentIcon(R.drawable.icon_sport_map_end_v2);
        setEndMarkerAnchorCenter(false);
        setGradient(isInChinaMainland());
        setMMapLineColor(R.color.sport_detail_bg_startColor);
    }

    public static /* synthetic */ void I1(SportDetailVideoMapFragment r0) {
        playTrack$lambda$0(r0);
    }

    public static /* synthetic */ void II1Xi0(SportDetailVideoMapFragment r0) {
        setLoadingProcess$lambda$0(r0);
    }

    public static /* synthetic */ void IXXOO(SportDetailVideoMapFragment r0, float r1, Bitmap r2) {
        mapSnapShot$lambda$1(r0, r1, r2);
    }

    public static /* synthetic */ View O1O(SportDetailVideoMapFragment r0) {
        return llHr_delegate$lambda$0(r0);
    }

    public static /* synthetic */ HeartRateDao OX() {
        return mHeartRateDao_delegate$lambda$0();
    }

    public static /* synthetic */ TextView X01IiOiIi(SportDetailVideoMapFragment r0) {
        return tvDetailname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X11iII1O1(SportDetailVideoMapFragment r0) {
        videoFinish$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXIIO1i11(SportDetailVideoMapFragment r0) {
        return tvNickname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button XXX11i(SportDetailVideoMapFragment r0) {
        return btnSaveVideo_delegate$lambda$0(r0);
    }

    private final void avatarShow() {
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 r0 = sz0.OXO1;
        if (uz0.OIi0(r0).exists() == false) goto L6;
        getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(r0)));
        return;
    }

    private static final Button btnSaveVideo_delegate$lambda$0(SportDetailVideoMapFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.share_video_save_btn);
    }

    private final void configChart(LineChart r13, int r14, int r15) {
        long r2 = 1000;
        long r4 = 60;
        long r0 = ((this.mEndTime - this.mStartTime) / r2) / r4;
        iO1Xi1X1i r6 = iO1Xi1X1i.OXO1;
        r6.XIi00iiXO(r13);
        r13.setTouchEnabled(false);
        r13.getDescription().XOO0ii0(false);
        r13.getLegend().XOO0ii0(false);
        r13.getAxisLeft().X00Xi1X(false);
        r13.getAxisLeft().XO0X10iO(false);
        r13.getAxisLeft().Ii0X0X(false);
        r13.getAxisLeft().iOiXi11II(r15);
        r13.getAxisLeft().i0X000X0O(r14);
        r13.getAxisLeft().XX1Oi(gk4.iO(getMActivity(), R.color.line_color));
        r13.getAxisLeft().I0IIOi(gk4.iO(getMActivity(), R.color.line_color));
        r13.getAxisLeft().iI0I(true);
        r13.getAxisRight().X00Xi1X(false);
        r13.getAxisRight().XO0X10iO(false);
        r13.getAxisRight().Ii0X0X(false);
        XAxis r16 = r13.getXAxis();
        Intrinsics.XXI(r16);
        Context r17 = r13.getContext();
        Intrinsics.O10IXXX0X(r17, "getContext(...)");
        r6.OIi0(r16, false, r17);
        r16.i0X000X0O(0.0f);
        r16.IXOIIIO(1.0f);
        r16.X00Xi1X(false);
        r16.XO0X10iO(false);
        r16.Ii0X0X(false);
        r16.iOiXi11II(r0);
        SimpleDateFormat r18 = O0X11OiO.IXI(false, 1, null);
        ArrayList r19 = new ArrayList();
        long r7 = 0;
        if (0 > r0) goto L7;
    L4:
        String r8 = TimeUtils.millis2String(this.mStartTime + ((r7 * r4) * r2), r18);
        Intrinsics.O10IXXX0X(r8, "millis2String(...)");
        r19.add(r8);
        if (r7 == r0) goto L7;
        r7 = r7 + 1;
    L7:
        r16.Oi(new q4(r19));
    }

    private final void dismissLoadPopup() {
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        this.mLoadingPopup = null;
    }

    public static /* synthetic */ void generateVideo$default(SportDetailVideoMapFragment r0, float r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0.0f;
    L5:
        r0.generateVideo(r1);
    }

    private final Button getBtnSaveVideo() {
        return (Button) getValue();
    }

    private final LineChart getHrLineChart() {
        return (LineChart) getValue();
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) getValue();
    }

    private final View getLlHr() {
        return (View) getValue();
    }

    private final HeartRateDao getMHeartRateDao() {
        return (HeartRateDao) getValue();
    }

    private final TextView getTvAvgHrValue() {
        return (TextView) getValue();
    }

    private final TextView getTvDetailname() {
        return (TextView) getValue();
    }

    private final TextView getTvNickname() {
        return (TextView) getValue();
    }

    private static final LineChart hrLineChart_delegate$lambda$0(SportDetailVideoMapFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.hrLineChart);
    }

    public static /* synthetic */ TextView i010I(SportDetailVideoMapFragment r0) {
        return tvAvgHrValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iI(SportDetailVideoMapFragment r0) {
        initView$lambda$0$0(r0);
    }

    public static /* synthetic */ void iOO1ii1(SportDetailVideoMapFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void iOOX010X(SportDetailVideoMapFragment r0, float r1, Bitmap r2) {
        mapSnapShot$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ LineChart iX(SportDetailVideoMapFragment r0) {
        return hrLineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound iX1O1(SportDetailVideoMapFragment r0) {
        return ivAvatar_delegate$lambda$0(r0);
    }

    private final void initCanvasImage(Bitmap r6, float r7, float r8) {
        int r0 = (int) (getRootView().getWidth() * r8);
        int r1 = (int) (getRootView().getHeight() * r8);
        if ((r0 % 2) == 0) goto L6;
        r0 = r0 - 1;
    L6:
        if ((r1 % 2) == 0) goto L8;
        r1 = r1 - 1;
    L8:
        Bitmap r2 = Bitmap.createBitmap(r0, r1, Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r2, "createBitmap(...)");
        if (r6.isRecycled() == true) goto L15;
        Matrix r3 = new Matrix();
        r3.setScale(r8, r8);
        Canvas r9 = new Canvas(r2);
        r9.drawBitmap(r6, r3, null);
        if (this.rootBitmap != null) goto L13;
        XIi1i01O r10 = XIi1i01O.OXO1;
        RelativeLayout r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        this.rootBitmap = r10.XIi00iiXO(r4);
    L13:
        Bitmap r11 = this.rootBitmap;
        Intrinsics.XXI(r11);
        r9.drawBitmap(r11, r3, null);
        this.mMaxSize++;
        this.mList.add(r2);
    L15:
        if (r7 != 1.0f) goto L18;
        ImageUtils.save(r2, uz0.XOX0O0(sz0.OXO1), Bitmap.CompressFormat.JPEG);
        return;
    }

    public static /* synthetic */ void initCanvasImage$default(SportDetailVideoMapFragment r0, Bitmap r1, float r2, float r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 1.0f;
    L5:
        r0.initCanvasImage(r1, r2, r3);
    }

    private static final void initView$lambda$0(final SportDetailVideoMapFragment r1, View r2) {
        if (r1.mFile.exists() == true) goto L7;
        r1.getBtnTrackPlay().setVisibility(8);
        r1.playEndJump = true;
        r1.playTrack();     // Catch: Exception -> L9
        return;
    L12:
        return;
    L7:
        r1.getBtnSaveVideo().setVisibility(8);
        r1.getBtnTrackPlay().setVisibility(8);
        r1.getBtnTrackPlay().post(new cz4(r1));
    }

    private static final void initView$lambda$0$0(SportDetailVideoMapFragment r2) {
        r2.mapSnapShot(1.0f);
        Unit r0 = Unit.OXO1;
        r2.requireActivity().setResult(-1);
        r2.requireActivity().finish();
    }

    private static final ImageViewRound ivAvatar_delegate$lambda$0(SportDetailVideoMapFragment r1) {
        return (ImageViewRound) r1.getMView().findViewById(R.id.iv_avatar);
    }

    private static final View llHr_delegate$lambda$0(SportDetailVideoMapFragment r1) {
        return r1.getMView().findViewById(R.id.ll_hr);
    }

    private static final HeartRateDao mHeartRateDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().heartRateDao();
    }

    private final void mapSnapShot(final float r3) {
        if (isInChinaMainland() == false) goto L6;
        getMBaiDuMap().snapshot(new oz4(this, r3));     // Catch: Exception -> L8
        return;
    L6:
        getMGoogleMap().snapshot(new pz4(this, r3));     // Catch: Exception -> L8
        return;
    }

    private static final void mapSnapShot$lambda$0(SportDetailVideoMapFragment r1, float r2, Bitmap r3) {
        Intrinsics.XXI(r3);
        r1.initCanvasImage(r3, r2, 0.8f);
    }

    private static final void mapSnapShot$lambda$1(SportDetailVideoMapFragment r1, float r2, Bitmap r3) {
        if (r3 == null) goto L5;
        r1.initCanvasImage(r3, r2, 0.8f);
        return;
    }

    private static final void playTrack$lambda$0(SportDetailVideoMapFragment r4) {
        generateVideo$default(r4, 0.0f, 1, null);
        if (r4.isInChinaMainland() == false) goto L5;
        r4.getMBaiDuMap().animateMapStatus(MapStatusUpdateFactory.zoomOut(), 1000);
    L6:
        super.playTrack();
        return;
    L5:
        r4.getMGoogleMap().animateCamera(CameraUpdateFactory.zoomOut(), 500, null);
        goto L6
    }

    private static final void setLoadingProcess$lambda$0(SportDetailVideoMapFragment r4) {
        float r0 = (r4.trackPlayProcess + r4.videoProcess) / 2;
        uq r1 = r4.mLoadingPopup;
        if (r1 != null) goto L5;
        return;
    L5:
        if (r0 < 1.0f) goto L10;
        r4.dismissLoadPopup();
        if (r4.playEndJump == false) goto L10;
        r4.playEndJump = false;
        r4.requireActivity().setResult(-1);
        r4.requireActivity().finish();
    L10:
        if (r4.isAdded() == false) goto L14;
        r1.iOOX010X(r4.getString(R.string.generating) + ((int) (r0 * 100)) + "%");
        return;
    }

    private final void showHr(List<HeartRate> r13) {
        o65 r0 = o65.OXO1;
        this.mStartTime = r0.OIX0iXi(getMWorkout().getMStart());
        this.mEndTime = r0.OIX0iXi(getMWorkout().getMEnd()) + ((long) 60000);
        LinkedHashMap r1 = new LinkedHashMap();
        long r2 = this.mStartTime;
        long r3 = ProgressionUtilKt.XO0O10(r2, this.mEndTime, 60000);
        if (r2 > r3) goto L7;
    L4:
        r1.put(Long.valueOf(r2), new nr0(0, 0, null, 4, null));
        if (r2 == r3) goto L7;
        r2 = r2 + 60000;
    L7:
        Iterator<T> r14 = r13.iterator();
        int r4 = 0;
        int r5 = 0;
    L9:
        if (r14.hasNext() == false) goto L20;
        Object r6 = r14.next();
        int r7 = r5 + 1;
        if (r5 >= 0) goto L13;
        CollectionsKt__CollectionsKt.XOX0O0();
    L13:
        HeartRate r8 = (HeartRate) r6;
        Iterator r9 = r1.entrySet().iterator();
    L15:
        if (r9.hasNext() == false) goto L19;
        Map.Entry r10 = (Map.Entry) r9.next();
        long r11 = ((Number) r10.getKey()).longValue();
        nr0 r12 = (nr0) r10.getValue();
        if (o65.OXO1.OIX0iXi(r8.getMTime()) > r11) goto L15;
        r12.OIX0iXi(r12.I0IIOi() + r8.getMBpm());
        r12.OIi0(r12.IiI10X() + 1);
    L19:
        r5 = r7;
        goto L9
    L20:
        ArrayList r15 = new ArrayList();
        Iterator r16 = r1.entrySet().iterator();
        float r17 = -1.0f;
        float r18 = 0.0f;
        int r19 = 0;
    L22:
        if (r16.hasNext() == false) goto L33;
        nr0 r20 = (nr0) ((Map.Entry) r16.next()).getValue();
        if (r20.IiI10X() == 0) goto L31;
        if (r20.I0IIOi() == 0) goto L31;
        int r21 = r20.I0IIOi() / r20.IiI10X();
        r15.add(new Entry(r18, r21));
        if (r19 >= r21) goto L30;
        r17 = r17 + 1.0f;
        r19 = r21;
    L30:
        r4 = r4 + r21;
    L31:
        r18 = r18 + 1.0f;
        goto L22
    L33:
        if (r15.size() == 0) goto L36;
        int r22 = r4 / r15.size();
    L36:
        if (getMWorkout().getMMaxBpm() > 0) goto L38;
    L42:
        LineChart r23 = getHrLineChart();
        Intrinsics.O10IXXX0X(r23, "<get-hrLineChart>(...)");
        configChart(r23, 40, Math.max(r19, getMWorkout().getMMaxBpm()) + 10);
        LineChart r24 = getHrLineChart();
        Intrinsics.O10IXXX0X(r24, "<get-hrLineChart>(...)");
        updateChartData(r24, r15, R.color.hr_color, R.drawable.shape_hr);
        return;
    L38:
        if (getMWorkout().getMMaxBpm() <= r19) goto L42;
        if (r17 <= (-1.0f)) goto L42;
        r15.get((int) r17).I0IIOi(getMWorkout().getMMaxBpm());
        goto L42
    }

    private final void showLoadPopup() {
        if (this.mLoadingPopup != null) goto L5;
        this.mLoadingPopup = new uq(getMActivity());
    L5:
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L9;
        r0.iOOX010X(getString(R.string.generating) + "0%");
    L9:
        if (isAdded() == false) goto L14;
        uq r1 = this.mLoadingPopup;
        if (r1 == null) goto L15;
        r1.IIX1OXO();
        return;
    L15:
        return;
    }

    private static final TextView tvAvgHrValue_delegate$lambda$0(SportDetailVideoMapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_hr_value);
    }

    private static final TextView tvDetailname_delegate$lambda$0(SportDetailVideoMapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_detail_name);
    }

    private static final TextView tvNickname_delegate$lambda$0(SportDetailVideoMapFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.edt_nickname);
    }

    private final void updateChartData(LineChart r3, List<Entry> r4, int r5, int r6) {
        LineDataSet r0 = new LineDataSet(r4, "");
        r0.II1(ContextCompat.getColor(getMActivity(), r5));
        r0.I00(ContextCompat.getColor(getMActivity(), r5));
        r0.I1XII0X(2.0f);
        r0.iXOII(1.0f);
        r0.IOI0i0I(false);
        r0.XXI(false);
        r0.O1iXiI(true);
        r0.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        Drawable r7 = ContextCompat.getDrawable(getMActivity(), r6);
        Intrinsics.X1ii(r7, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        r0.I0i1OXiI(r7);
        co r8 = new co(new IiXO1XOi[]{r0});
        r8.iI(false);
        r3.setData(r8);
        r3.I0IIOi(1000);
        r3.invalidate();
    }

    private static final void videoFinish$lambda$0(SportDetailVideoMapFragment r2) {
        r2.getBtnTrackPlay().setVisibility(0);
        r2.getBtnSaveVideo().setVisibility(0);
    }

    public final void generateVideo(float r3) {
        this.trackPlayProcess = r3;
        if (r3 != 1.0f) goto L10;
        if (this.mFile.exists() == false) goto L10;
        if (this.videoStart == true) goto L10;
        videoFinish();
    L10:
        if (this.mFile.exists() == true) goto L12;
        mapSnapShot(r3);
    L12:
        if (r3 == 1.0f) goto L14;
        return;
    L14:
        if (this.videoStart == false) goto L16;
        return;
    L16:
        if (this.mFile.exists() == false) goto L18;
        return;
    L18:
        if (isAdded() == false) goto L24;
        this.videoStart = !this.videoStart;
        this.nextIndex = 0;
        new ye6(this, this.mFile, this.mFrameRate).I1XOi1();
        return;
    }

    @aa1
    public final File getMFile() {
        return this.mFile;
    }

    @aa1
    public final List<Bitmap> getMList() {
        return this.mList;
    }

    public final int getMMaxSize() {
        return this.mMaxSize;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    @aa1
    public TrackPlay getMTrackPlay() {
        return this.mTrackPlay;
    }

    public final int getNextIndex() {
        return this.nextIndex;
    }

    public final boolean getPlayEndJump() {
        return this.playEndJump;
    }

    @tb1
    public final Bitmap getRootBitmap() {
        return this.rootBitmap;
    }

    @aa1
    public final String getTitle() {
        return q62.OXO1.i01OOiI(getMWorkout().getMMode());
    }

    public final float getTrackPlayProcess() {
        return this.trackPlayProcess;
    }

    public final float getVideoProcess() {
        return this.videoProcess;
    }

    public final boolean getVideoStart() {
        return this.videoStart;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        this.mFile = new File(uz0.OO(sz0.OXO1), "mapVideo" + getMArg1() + IiXI1X1OO.O00 + Utils.getApp().getResources().getConfiguration().locale.getLanguage() + ".mp4");
        getBtnSaveVideo().setVisibility(8);
        getBtnTrackPlay().setVisibility(0);
        getTvDetailname().setText(getTitle());
        getTvNickname().setText(getUserProfile().getNickname());
        avatarShow();
        getTvAvgHrValue().setText(String.valueOf(getMWorkout().getMAvgBpm()));
        getBtnSaveVideo().setOnClickListener(new ez4(this));
        List<HeartRate> r0 = getMHeartRateDao().getHeartRates(getMWorkout().getMStart(), getMWorkout().getMEnd());
        if (o65.OXO1.O00(getMWorkout()) == false) goto L11;
        showHr(new ArrayList());
        View r1 = getLlHr();
        if (r1 == null) goto L7;
        r1.setVisibility(8);
    L7:
        LineChart r2 = getHrLineChart();
        if (r2 == null) goto L13;
        r2.setVisibility(8);
        return;
    L13:
        return;
    L11:
        showHr(r0);
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void initializedMapFinish() {
        if (isInChinaMainland() == false) goto L6;
        getMBaiDuMap().setMapType(2);
        getMBaiDuMap().getUiSettings().setAllGesturesEnabled(false);
        return;
    L6:
        getMGoogleMap().setMapType(2);
        getMGoogleMap().getUiSettings().setAllGesturesEnabled(false);
        getMGoogleMap().moveCamera(CameraUpdateFactory.zoomOut());
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_map_v3;
    }

    @Override // com.android.mltcode.paycertificationapi.h0
    public /* bridge */ /* synthetic */ Bitmap next() {
        return next();
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment, com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Bitmap r0 = this.rootBitmap;
        if (r0 == null) goto L6;
        Intrinsics.XXI(r0);
        r0.recycle();
        this.rootBitmap = null;
        return;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void playTrack() {
        int r0 = getMTrackPlay().OIX0iXi();
        if (r0 < 0) goto L6;
        if (r0 >= 21) goto L6;
        this.mFrameRate = r0 / 3;
        getMTrackPlay().XiOIii1(3000 / r0);
    L11:
        LogUtils.d(new Object[]{this.TAG + "  playTrack size = " + r0 + "  mFrameRate = " + this.mFrameRate});
        getBtnTrackPlay().setVisibility(8);
        getBtnSaveVideo().setVisibility(8);
        this.videoStart = false;
        this.trackPlayProcess = 0.0f;
        this.videoProcess = 0.0f;
        this.mMaxSize = 0;
        this.mList.clear();
        if (this.mFile.exists() == true) goto L14;
        showLoadPopup();
    L14:
        generateVideo$default(this, 0.0f, 1, null);
        new Handler(Looper.getMainLooper()).postDelayed(new fz4(this), 150);
        return;
    L6:
        if (21 <= r0) goto L8;
    L10:
        this.mFrameRate = r0 / 10;
        getMTrackPlay().XiOIii1(10000 / r0);
        goto L11
    L8:
        if (r0 >= 101) goto L10;
        this.mFrameRate = r0 / 5;
        getMTrackPlay().XiOIii1(5000 / r0);
        goto L11
    }

    @Override // com.android.mltcode.paycertificationapi.h0
    public void progress(float r2) {
        this.videoProcess = r2;
        setLoadingProcess();
        if (r2 < 1.0f) goto L6;
        videoFinish();
        return;
    }

    public final void setLoadingProcess() {
        new Handler(Looper.getMainLooper()).post(new dz4(this));
    }

    public final void setMFile(@aa1 File r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFile = r2;
    }

    public final void setMMaxSize(int r1) {
        this.mMaxSize = r1;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void setMTrackPlay(@aa1 TrackPlay r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTrackPlay = r2;
    }

    public final void setNextIndex(int r1) {
        this.nextIndex = r1;
    }

    public final void setPlayEndJump(boolean r1) {
        this.playEndJump = r1;
    }

    public final void setRootBitmap(@tb1 Bitmap r1) {
        this.rootBitmap = r1;
    }

    public final void setTrackPlayProcess(float r1) {
        this.trackPlayProcess = r1;
    }

    public final void setVideoProcess(float r1) {
        this.videoProcess = r1;
    }

    public final void setVideoStart(boolean r1) {
        this.videoStart = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.h0
    public int size() {
        return this.mMaxSize + 5;
    }

    public final void videoFinish() {
        new Handler(Looper.getMainLooper()).post(new gz4(this));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.android.mltcode.paycertificationapi.h0
    @aa1
    public Bitmap next() {
        int r0 = this.nextIndex + 1;
        this.nextIndex = r0;
        if (r0 < (this.mList.size() - 1)) goto L7;
        List<Bitmap> r1 = this.mList;
        return r1.get(r1.size() - 1);
    L7:
        return this.mList.get(this.nextIndex);
    }
}
