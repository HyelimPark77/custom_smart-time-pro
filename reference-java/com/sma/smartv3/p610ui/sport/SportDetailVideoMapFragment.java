package com.sma.smartv3.p610ui.sport;

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
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.InterfaceC2472h0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.nr0;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.ye6;
import com.baidu.mapapi.map.BaiduMap;
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
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p610ui.sport.SportDetailVideoMapFragment;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailVideoMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailVideoMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailVideoMapFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,637:1\n1878#2,3:638\n*S KotlinDebug\n*F\n+ 1 SportDetailVideoMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailVideoMapFragment\n*L\n503#1:638,3\n*E\n"})
public final class SportDetailVideoMapFragment extends SportDetailMapFragment implements InterfaceC2472h0<Bitmap> {
    private long mEndTime;

    @tb1
    private C3006uq mLoadingPopup;
    private int mMaxSize;
    private long mStartTime;
    private int nextIndex;
    private boolean playEndJump;

    @tb1
    private Bitmap rootBitmap;
    private float trackPlayProcess;
    private float videoProcess;
    private boolean videoStart;

    @aa1
    private final String TAG = "SportDetailVideoMapFragment";

    @aa1
    private final Lazy ivAvatar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailVideoMapFragment.ivAvatar_delegate$lambda$0(this.f5857IO);
        }
    });

    @aa1
    private final Lazy tvNickname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailVideoMapFragment.tvNickname_delegate$lambda$0(this.f7245IO);
        }
    });

    @aa1
    private final Lazy tvDetailname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailVideoMapFragment.tvDetailname_delegate$lambda$0(this.f8803IO);
        }
    });

    @aa1
    private final Lazy hrLineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailVideoMapFragment.hrLineChart_delegate$lambda$0(this.f9076IO);
        }
    });

    @aa1
    private final Lazy llHr$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailVideoMapFragment.llHr_delegate$lambda$0(this.f9312IO);
        }
    });

    @aa1
    private final Lazy mHeartRateDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailVideoMapFragment.mHeartRateDao_delegate$lambda$0();
        }
    });

    @aa1
    private final Lazy tvAvgHrValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailVideoMapFragment.tvAvgHrValue_delegate$lambda$0(this.f9819IO);
        }
    });

    @aa1
    private final Lazy btnSaveVideo$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailVideoMapFragment.btnSaveVideo_delegate$lambda$0(this.f10045IO);
        }
    });

    @aa1
    private final List<Bitmap> mList = new ArrayList();

    @aa1
    private File mFile = new File(uz0.m3188OO(sz0.OXO1), "mapVideo" + getMArg1() + IiXI1X1OO.O00 + Utils.getApp().getResources().getConfiguration().locale.getLanguage() + ".mp4");
    private int mFrameRate = 40;

    @aa1
    private TrackPlay mTrackPlay = new TrackPlay(new OXO1());

    public static final class OXO1 implements TrackPlay.OXO1 {
        public OXO1() {
        }

        public static final void I0IIOi(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
            sportDetailVideoMapFragment.generateVideo(1.0f);
            sportDetailVideoMapFragment.setLoadingProcess();
        }

        public static final void XOO0ii0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
            sportDetailVideoMapFragment.generateVideo(1.0f);
            sportDetailVideoMapFragment.setLoadingProcess();
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void OXO1(ArrayList<LatLng> points, float f) {
            Intrinsics.X0O(points, "points");
            if (points.size() > 1) {
                SportDetailVideoMapFragment.this.addGoogleLine(points);
            }
            if (f == 1.0f) {
                SportDetailVideoMapFragment.this.generateVideo(0.99f);
                SportDetailVideoMapFragment.this.getMGoogleMap().moveCamera(CameraUpdateFactory.zoomIn());
                SportDetailVideoMapFragment.this.getMGoogleMap().moveCamera(CameraUpdateFactory.zoomIn());
                Handler handler = new Handler(Looper.getMainLooper());
                final SportDetailVideoMapFragment sportDetailVideoMapFragment = SportDetailVideoMapFragment.this;
                handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.rz4
                    @Override // java.lang.Runnable
                    public final void run() {
                        SportDetailVideoMapFragment.OXO1.I0IIOi(sportDetailVideoMapFragment);
                    }
                }, 200L);
            } else {
                SportDetailVideoMapFragment.this.generateVideo(f);
            }
            SportDetailVideoMapFragment.this.setLoadingProcess();
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void XIi00iiXO() {
            SportDetailVideoMapFragment.this.getMColorList().clear();
            SportDetailVideoMapFragment.this.getMColorList().addAll(SportDetailVideoMapFragment.this.getMLineColors());
            SportDetailVideoMapFragment.this.addLine();
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void XO0O10(ArrayList<com.baidu.mapapi.model.LatLng> points, float f, int i) {
            Intrinsics.X0O(points, "points");
            SportDetailVideoMapFragment.this.getMColorList().add(Integer.valueOf(i));
            if (points.size() > 1) {
                SportDetailVideoMapFragment.this.addBaiduLine(points);
            }
            if (f == 1.0f) {
                SportDetailVideoMapFragment.this.generateVideo(0.99f);
                SportDetailVideoMapFragment.this.getMBaiDuMap().animateMapStatus(MapStatusUpdateFactory.zoomIn(), 1000);
                Handler handler = new Handler(Looper.getMainLooper());
                final SportDetailVideoMapFragment sportDetailVideoMapFragment = SportDetailVideoMapFragment.this;
                handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.qz4
                    @Override // java.lang.Runnable
                    public final void run() {
                        SportDetailVideoMapFragment.OXO1.XOO0ii0(sportDetailVideoMapFragment);
                    }
                }, 200L);
            } else {
                SportDetailVideoMapFragment.this.generateVideo(f);
            }
            SportDetailVideoMapFragment.this.setLoadingProcess();
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        /* JADX INFO: renamed from: iO */
        public void mo38626iO(float f) {
        }

        @Override // com.sma.smartv3.ui.sport.TrackPlay.OXO1
        public void onStart() {
            SportDetailVideoMapFragment.this.getMColorList().clear();
        }
    }

    public SportDetailVideoMapFragment() {
        setMStartIcon(R.drawable.icon_sport_map_start_v2);
        setMCurrentIcon(R.drawable.icon_sport_map_end_v2);
        setEndMarkerAnchorCenter(false);
        setGradient(isInChinaMainland());
        setMMapLineColor(R.color.sport_detail_bg_startColor);
    }

    private final void avatarShow() {
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 sz0Var = sz0.OXO1;
        if (uz0.OIi0(sz0Var).exists()) {
            getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnSaveVideo_delegate$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        return (Button) sportDetailVideoMapFragment.getMView().findViewById(R.id.share_video_save_btn);
    }

    private final void configChart(LineChart lineChart, int i, int i2) {
        long j = 1000;
        long j2 = 60;
        long j3 = ((this.mEndTime - this.mStartTime) / j) / j2;
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        io1xi1x1i.XIi00iiXO(lineChart);
        lineChart.setTouchEnabled(false);
        lineChart.getDescription().XOO0ii0(false);
        lineChart.getLegend().XOO0ii0(false);
        lineChart.getAxisLeft().X00Xi1X(false);
        lineChart.getAxisLeft().XO0X10iO(false);
        lineChart.getAxisLeft().Ii0X0X(false);
        lineChart.getAxisLeft().iOiXi11II(i2);
        lineChart.getAxisLeft().i0X000X0O(i);
        lineChart.getAxisLeft().XX1Oi(gk4.m1859iO(getMActivity(), R.color.line_color));
        lineChart.getAxisLeft().I0IIOi(gk4.m1859iO(getMActivity(), R.color.line_color));
        lineChart.getAxisLeft().iI0I(true);
        lineChart.getAxisRight().X00Xi1X(false);
        lineChart.getAxisRight().XO0X10iO(false);
        lineChart.getAxisRight().Ii0X0X(false);
        XAxis xAxis = lineChart.getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = lineChart.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        xAxis.i0X000X0O(0.0f);
        xAxis.IXOIIIO(1.0f);
        xAxis.X00Xi1X(false);
        xAxis.XO0X10iO(false);
        xAxis.Ii0X0X(false);
        xAxis.iOiXi11II(j3);
        SimpleDateFormat simpleDateFormatIXI = O0X11OiO.IXI(false, 1, null);
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        if (0 <= j3) {
            while (true) {
                String strMillis2String = TimeUtils.millis2String(this.mStartTime + (j4 * j2 * j), simpleDateFormatIXI);
                Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
                arrayList.add(strMillis2String);
                if (j4 == j3) {
                    break;
                } else {
                    j4++;
                }
            }
        }
        xAxis.m603Oi(new C2829q4(arrayList));
    }

    private final void dismissLoadPopup() {
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
        this.mLoadingPopup = null;
    }

    public static /* synthetic */ void generateVideo$default(SportDetailVideoMapFragment sportDetailVideoMapFragment, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        sportDetailVideoMapFragment.generateVideo(f);
    }

    private final Button getBtnSaveVideo() {
        return (Button) this.btnSaveVideo$delegate.getValue();
    }

    private final LineChart getHrLineChart() {
        return (LineChart) this.hrLineChart$delegate.getValue();
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) this.ivAvatar$delegate.getValue();
    }

    private final View getLlHr() {
        return (View) this.llHr$delegate.getValue();
    }

    private final HeartRateDao getMHeartRateDao() {
        return (HeartRateDao) this.mHeartRateDao$delegate.getValue();
    }

    private final TextView getTvAvgHrValue() {
        return (TextView) this.tvAvgHrValue$delegate.getValue();
    }

    private final TextView getTvDetailname() {
        return (TextView) this.tvDetailname$delegate.getValue();
    }

    private final TextView getTvNickname() {
        return (TextView) this.tvNickname$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart hrLineChart_delegate$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        return (LineChart) sportDetailVideoMapFragment.getMView().findViewById(R.id.hrLineChart);
    }

    private final void initCanvasImage(Bitmap bitmap, float f, float f2) {
        int width = (int) (getRootView().getWidth() * f2);
        int height = (int) (getRootView().getHeight() * f2);
        if (width % 2 != 0) {
            width--;
        }
        if (height % 2 != 0) {
            height--;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        if (!bitmap.isRecycled()) {
            Matrix matrix = new Matrix();
            matrix.setScale(f2, f2);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmap, matrix, null);
            if (this.rootBitmap == null) {
                XIi1i01O xIi1i01O = XIi1i01O.OXO1;
                RelativeLayout rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                this.rootBitmap = xIi1i01O.XIi00iiXO(rootView);
            }
            Bitmap bitmap2 = this.rootBitmap;
            Intrinsics.XXI(bitmap2);
            canvas.drawBitmap(bitmap2, matrix, null);
            this.mMaxSize++;
            this.mList.add(bitmapCreateBitmap);
        }
        if (f == 1.0f) {
            ImageUtils.save(bitmapCreateBitmap, uz0.XOX0O0(sz0.OXO1), Bitmap.CompressFormat.JPEG);
        }
    }

    public static /* synthetic */ void initCanvasImage$default(SportDetailVideoMapFragment sportDetailVideoMapFragment, Bitmap bitmap, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f2 = 1.0f;
        }
        sportDetailVideoMapFragment.initCanvasImage(bitmap, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(final SportDetailVideoMapFragment sportDetailVideoMapFragment, View view) {
        if (sportDetailVideoMapFragment.mFile.exists()) {
            sportDetailVideoMapFragment.getBtnSaveVideo().setVisibility(8);
            sportDetailVideoMapFragment.getBtnTrackPlay().setVisibility(8);
            sportDetailVideoMapFragment.getBtnTrackPlay().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.cz4
                @Override // java.lang.Runnable
                public final void run() {
                    SportDetailVideoMapFragment.initView$lambda$0$0(this.f6089IO);
                }
            });
        } else {
            sportDetailVideoMapFragment.getBtnTrackPlay().setVisibility(8);
            sportDetailVideoMapFragment.playEndJump = true;
            try {
                sportDetailVideoMapFragment.playTrack();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        sportDetailVideoMapFragment.mapSnapShot(1.0f);
        Unit unit = Unit.OXO1;
        sportDetailVideoMapFragment.requireActivity().setResult(-1);
        sportDetailVideoMapFragment.requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound ivAvatar_delegate$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        return (ImageViewRound) sportDetailVideoMapFragment.getMView().findViewById(R.id.iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llHr_delegate$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        return sportDetailVideoMapFragment.getMView().findViewById(R.id.ll_hr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeartRateDao mHeartRateDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().heartRateDao();
    }

    private final void mapSnapShot(final float f) {
        try {
            if (isInChinaMainland()) {
                getMBaiDuMap().snapshot(new BaiduMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.oz4
                    @Override // com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback
                    public final void onSnapshotReady(Bitmap bitmap) {
                        SportDetailVideoMapFragment.mapSnapShot$lambda$0(this.OXO1, f, bitmap);
                    }
                });
            } else {
                getMGoogleMap().snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.pz4
                    @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                    public final void onSnapshotReady(Bitmap bitmap) {
                        SportDetailVideoMapFragment.mapSnapShot$lambda$1(this.OXO1, f, bitmap);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mapSnapShot$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment, float f, Bitmap bitmap) {
        Intrinsics.XXI(bitmap);
        sportDetailVideoMapFragment.initCanvasImage(bitmap, f, 0.8f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mapSnapShot$lambda$1(SportDetailVideoMapFragment sportDetailVideoMapFragment, float f, Bitmap bitmap) {
        if (bitmap != null) {
            sportDetailVideoMapFragment.initCanvasImage(bitmap, f, 0.8f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playTrack$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        generateVideo$default(sportDetailVideoMapFragment, 0.0f, 1, null);
        if (sportDetailVideoMapFragment.isInChinaMainland()) {
            sportDetailVideoMapFragment.getMBaiDuMap().animateMapStatus(MapStatusUpdateFactory.zoomOut(), 1000);
        } else {
            sportDetailVideoMapFragment.getMGoogleMap().animateCamera(CameraUpdateFactory.zoomOut(), 500, null);
        }
        super.playTrack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setLoadingProcess$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        float f = (sportDetailVideoMapFragment.trackPlayProcess + sportDetailVideoMapFragment.videoProcess) / 2;
        C3006uq c3006uq = sportDetailVideoMapFragment.mLoadingPopup;
        if (c3006uq != null) {
            if (f >= 1.0f) {
                sportDetailVideoMapFragment.dismissLoadPopup();
                if (sportDetailVideoMapFragment.playEndJump) {
                    sportDetailVideoMapFragment.playEndJump = false;
                    sportDetailVideoMapFragment.requireActivity().setResult(-1);
                    sportDetailVideoMapFragment.requireActivity().finish();
                }
            }
            if (sportDetailVideoMapFragment.isAdded()) {
                c3006uq.iOOX010X(sportDetailVideoMapFragment.getString(R.string.generating) + ((int) (f * 100)) + "%");
            }
        }
    }

    private final void showHr(List<HeartRate> list) {
        o65 o65Var = o65.OXO1;
        this.mStartTime = o65Var.OIX0iXi(getMWorkout().getMStart());
        this.mEndTime = o65Var.OIX0iXi(getMWorkout().getMEnd()) + ((long) 60000);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = this.mStartTime;
        long jXO0O10 = ProgressionUtilKt.XO0O10(j, this.mEndTime, 60000L);
        if (j <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(j), new nr0(0, 0, null, 4, null));
                if (j == jXO0O10) {
                    break;
                } else {
                    j += 60000;
                }
            }
        }
        int i = 0;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            HeartRate heartRate = (HeartRate) obj;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                nr0 nr0Var = (nr0) entry.getValue();
                if (o65.OXO1.OIX0iXi(heartRate.getMTime()) <= jLongValue) {
                    nr0Var.OIX0iXi(nr0Var.I0IIOi() + heartRate.getMBpm());
                    nr0Var.OIi0(nr0Var.IiI10X() + 1);
                    break;
                }
            }
            i2 = i3;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        float f = -1.0f;
        float f2 = 0.0f;
        int i4 = 0;
        while (it.hasNext()) {
            nr0 nr0Var2 = (nr0) ((Map.Entry) it.next()).getValue();
            if (nr0Var2.IiI10X() != 0 && nr0Var2.I0IIOi() != 0) {
                int iI0IIOi = nr0Var2.I0IIOi() / nr0Var2.IiI10X();
                arrayList.add(new Entry(f2, iI0IIOi));
                if (i4 < iI0IIOi) {
                    f += 1.0f;
                    i4 = iI0IIOi;
                }
                i += iI0IIOi;
            }
            f2 += 1.0f;
        }
        if (arrayList.size() != 0) {
            int size = i / arrayList.size();
        }
        if (getMWorkout().getMMaxBpm() > 0 && getMWorkout().getMMaxBpm() > i4 && f > -1.0f) {
            arrayList.get((int) f).I0IIOi(getMWorkout().getMMaxBpm());
        }
        LineChart hrLineChart = getHrLineChart();
        Intrinsics.O10IXXX0X(hrLineChart, "<get-hrLineChart>(...)");
        configChart(hrLineChart, 40, Math.max(i4, getMWorkout().getMMaxBpm()) + 10);
        LineChart hrLineChart2 = getHrLineChart();
        Intrinsics.O10IXXX0X(hrLineChart2, "<get-hrLineChart>(...)");
        updateChartData(hrLineChart2, arrayList, R.color.hr_color, R.drawable.shape_hr);
    }

    private final void showLoadPopup() {
        C3006uq c3006uq;
        if (this.mLoadingPopup == null) {
            this.mLoadingPopup = new C3006uq(getMActivity());
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.iOOX010X(getString(R.string.generating) + "0%");
        }
        if (!isAdded() || (c3006uq = this.mLoadingPopup) == null) {
            return;
        }
        c3006uq.IIX1OXO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgHrValue_delegate$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        return (TextView) sportDetailVideoMapFragment.getMView().findViewById(R.id.tv_hr_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDetailname_delegate$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        return (TextView) sportDetailVideoMapFragment.getMView().findViewById(R.id.tv_detail_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNickname_delegate$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        return (TextView) sportDetailVideoMapFragment.getMView().findViewById(R.id.edt_nickname);
    }

    private final void updateChartData(LineChart lineChart, List<Entry> list, int i, int i2) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.II1(ContextCompat.getColor(getMActivity(), i));
        lineDataSet.I00(ContextCompat.getColor(getMActivity(), i));
        lineDataSet.I1XII0X(2.0f);
        lineDataSet.iXOII(1.0f);
        lineDataSet.IOI0i0I(false);
        lineDataSet.XXI(false);
        lineDataSet.O1iXiI(true);
        lineDataSet.OXXO0O1X(LineDataSet.Mode.CUBIC_BEZIER);
        Drawable drawable = ContextCompat.getDrawable(getMActivity(), i2);
        Intrinsics.X1ii(drawable, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        lineDataSet.I0i1OXiI(drawable);
        C2305co c2305co = new C2305co(lineDataSet);
        c2305co.m1316iI(false);
        lineChart.setData(c2305co);
        lineChart.I0IIOi(1000);
        lineChart.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void videoFinish$lambda$0(SportDetailVideoMapFragment sportDetailVideoMapFragment) {
        sportDetailVideoMapFragment.getBtnTrackPlay().setVisibility(0);
        sportDetailVideoMapFragment.getBtnSaveVideo().setVisibility(0);
    }

    public final void generateVideo(float f) {
        this.trackPlayProcess = f;
        if (f == 1.0f && this.mFile.exists() && !this.videoStart) {
            videoFinish();
        }
        if (!this.mFile.exists()) {
            mapSnapShot(f);
        }
        if (f != 1.0f || this.videoStart || this.mFile.exists() || !isAdded()) {
            return;
        }
        this.videoStart = !this.videoStart;
        this.nextIndex = 0;
        new ye6(this, this.mFile, this.mFrameRate).I1XOi1();
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

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
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

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        this.mFile = new File(uz0.m3188OO(sz0.OXO1), "mapVideo" + getMArg1() + IiXI1X1OO.O00 + Utils.getApp().getResources().getConfiguration().locale.getLanguage() + ".mp4");
        getBtnSaveVideo().setVisibility(8);
        getBtnTrackPlay().setVisibility(0);
        getTvDetailname().setText(getTitle());
        getTvNickname().setText(getUserProfile().getNickname());
        avatarShow();
        getTvAvgHrValue().setText(String.valueOf(getMWorkout().getMAvgBpm()));
        getBtnSaveVideo().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ez4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailVideoMapFragment.initView$lambda$0(this.f6531IO, view);
            }
        });
        List<HeartRate> heartRates = getMHeartRateDao().getHeartRates(getMWorkout().getMStart(), getMWorkout().getMEnd());
        if (!o65.OXO1.O00(getMWorkout())) {
            showHr(heartRates);
            return;
        }
        showHr(new ArrayList());
        View llHr = getLlHr();
        if (llHr != null) {
            llHr.setVisibility(8);
        }
        LineChart hrLineChart = getHrLineChart();
        if (hrLineChart != null) {
            hrLineChart.setVisibility(8);
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void initializedMapFinish() {
        if (isInChinaMainland()) {
            getMBaiDuMap().setMapType(2);
            getMBaiDuMap().getUiSettings().setAllGesturesEnabled(false);
        } else {
            getMGoogleMap().setMapType(2);
            getMGoogleMap().getUiSettings().setAllGesturesEnabled(false);
            getMGoogleMap().moveCamera(CameraUpdateFactory.zoomOut());
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_map_v3;
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.rootBitmap;
        if (bitmap != null) {
            Intrinsics.XXI(bitmap);
            bitmap.recycle();
            this.rootBitmap = null;
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void playTrack() {
        int iOIX0iXi = getMTrackPlay().OIX0iXi();
        if (iOIX0iXi >= 0 && iOIX0iXi < 21) {
            this.mFrameRate = iOIX0iXi / 3;
            getMTrackPlay().XiOIii1(3000 / iOIX0iXi);
        } else if (21 > iOIX0iXi || iOIX0iXi >= 101) {
            this.mFrameRate = iOIX0iXi / 10;
            getMTrackPlay().XiOIii1(10000 / iOIX0iXi);
        } else {
            this.mFrameRate = iOIX0iXi / 5;
            getMTrackPlay().XiOIii1(5000 / iOIX0iXi);
        }
        LogUtils.m11128d(this.TAG + "  playTrack size = " + iOIX0iXi + "  mFrameRate = " + this.mFrameRate);
        getBtnTrackPlay().setVisibility(8);
        getBtnSaveVideo().setVisibility(8);
        this.videoStart = false;
        this.trackPlayProcess = 0.0f;
        this.videoProcess = 0.0f;
        this.mMaxSize = 0;
        this.mList.clear();
        if (!this.mFile.exists()) {
            showLoadPopup();
        }
        generateVideo$default(this, 0.0f, 1, null);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.fz4
            @Override // java.lang.Runnable
            public final void run() {
                SportDetailVideoMapFragment.playTrack$lambda$0(this.f6776IO);
            }
        }, 150L);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2472h0
    public void progress(float f) {
        this.videoProcess = f;
        setLoadingProcess();
        if (f >= 1.0f) {
            videoFinish();
        }
    }

    public final void setLoadingProcess() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.dz4
            @Override // java.lang.Runnable
            public final void run() {
                SportDetailVideoMapFragment.setLoadingProcess$lambda$0(this.f6305IO);
            }
        });
    }

    public final void setMFile(@aa1 File file) {
        Intrinsics.X0O(file, "<set-?>");
        this.mFile = file;
    }

    public final void setMMaxSize(int i) {
        this.mMaxSize = i;
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void setMTrackPlay(@aa1 TrackPlay trackPlay) {
        Intrinsics.X0O(trackPlay, "<set-?>");
        this.mTrackPlay = trackPlay;
    }

    public final void setNextIndex(int i) {
        this.nextIndex = i;
    }

    public final void setPlayEndJump(boolean z) {
        this.playEndJump = z;
    }

    public final void setRootBitmap(@tb1 Bitmap bitmap) {
        this.rootBitmap = bitmap;
    }

    public final void setTrackPlayProcess(float f) {
        this.trackPlayProcess = f;
    }

    public final void setVideoProcess(float f) {
        this.videoProcess = f;
    }

    public final void setVideoStart(boolean z) {
        this.videoStart = z;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2472h0
    public int size() {
        return this.mMaxSize + 5;
    }

    public final void videoFinish() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.gz4
            @Override // java.lang.Runnable
            public final void run() {
                SportDetailVideoMapFragment.videoFinish$lambda$0(this.f7001IO);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2472h0
    @aa1
    public Bitmap next() {
        int i = this.nextIndex + 1;
        this.nextIndex = i;
        if (i < this.mList.size() - 1) {
            return this.mList.get(this.nextIndex);
        }
        List<Bitmap> list = this.mList;
        return list.get(list.size() - 1);
    }
}
