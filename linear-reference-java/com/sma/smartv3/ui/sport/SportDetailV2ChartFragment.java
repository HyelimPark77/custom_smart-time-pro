package com.sma.smartv3.ui.sport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OiOiI0IX1;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.at;
import com.android.mltcode.paycertificationapi.ax4;
import com.android.mltcode.paycertificationapi.ay4;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bx4;
import com.android.mltcode.paycertificationapi.by4;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cx4;
import com.android.mltcode.paycertificationapi.cy4;
import com.android.mltcode.paycertificationapi.dx4;
import com.android.mltcode.paycertificationapi.dy4;
import com.android.mltcode.paycertificationapi.ex4;
import com.android.mltcode.paycertificationapi.ey4;
import com.android.mltcode.paycertificationapi.fx4;
import com.android.mltcode.paycertificationapi.fy4;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gx4;
import com.android.mltcode.paycertificationapi.gy4;
import com.android.mltcode.paycertificationapi.hu4;
import com.android.mltcode.paycertificationapi.hx4;
import com.android.mltcode.paycertificationapi.hy4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.ix4;
import com.android.mltcode.paycertificationapi.iy4;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.jx4;
import com.android.mltcode.paycertificationapi.jy4;
import com.android.mltcode.paycertificationapi.kx4;
import com.android.mltcode.paycertificationapi.ky4;
import com.android.mltcode.paycertificationapi.lx4;
import com.android.mltcode.paycertificationapi.ly4;
import com.android.mltcode.paycertificationapi.mc0;
import com.android.mltcode.paycertificationapi.mx4;
import com.android.mltcode.paycertificationapi.my4;
import com.android.mltcode.paycertificationapi.nr0;
import com.android.mltcode.paycertificationapi.nx4;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.os0;
import com.android.mltcode.paycertificationapi.ox4;
import com.android.mltcode.paycertificationapi.px4;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qx4;
import com.android.mltcode.paycertificationapi.rw4;
import com.android.mltcode.paycertificationapi.rx4;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sw4;
import com.android.mltcode.paycertificationapi.sx4;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tw4;
import com.android.mltcode.paycertificationapi.tx4;
import com.android.mltcode.paycertificationapi.uw4;
import com.android.mltcode.paycertificationapi.ux4;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vw4;
import com.android.mltcode.paycertificationapi.vx4;
import com.android.mltcode.paycertificationapi.ww4;
import com.android.mltcode.paycertificationapi.wx4;
import com.android.mltcode.paycertificationapi.xw4;
import com.android.mltcode.paycertificationapi.xx4;
import com.android.mltcode.paycertificationapi.yw4;
import com.android.mltcode.paycertificationapi.yx4;
import com.android.mltcode.paycertificationapi.zw4;
import com.android.mltcode.paycertificationapi.zx4;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.CoordinateConverter;
import com.baidu.mapapi.utils.DistanceUtil;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.model.RecordActivityData;
import com.sma.smartv3.model.RecordDetailSpeedData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.ui.sport.course.model.SportDetailViewModel;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.MyPieChart;
import com.sma.smartv3.view.PaceProgressBarV2;
import com.sma.smartv3.view.SportGoalProgressBar;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.entity.BleDeviceInfo;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailV2ChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1530:1\n1878#2,3:1531\n1878#2,3:1534\n99#3,7:1537\n106#3,3:1545\n79#3,7:1548\n109#3:1555\n99#3,7:1556\n106#3,3:1564\n79#3,7:1567\n109#3:1574\n1#4:1544\n1#4:1563\n*S KotlinDebug\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment\n*L\n631#1:1531,3\n1458#1:1534,3\n300#1:1537,7\n300#1:1545,3\n300#1:1548,7\n300#1:1555\n1022#1:1556,7\n1022#1:1564,3\n1022#1:1567,7\n1022#1:1574\n300#1:1544\n1022#1:1563\n*E\n"})
public final class SportDetailV2ChartFragment extends SportDetailChartFragment {

    @aa1
    public static final OXO1 Companion = null;
    public static final int ONE_KM = 1000;

    @aa1
    private RecordActivityData activityData;

    @aa1
    private final List<Integer> colorsList;
    private boolean isInChinaMainland;
    private boolean isWorkImage;

    @aa1
    private ArrayList<CustomLatLng> locationSmoothAlgorithm;

    @aa1
    private final Lazy mAteLevel$delegate;

    @aa1
    private final Lazy mCadenceAvgTitle$delegate;

    @aa1
    private final Lazy mCadenceMaxTitle$delegate;

    @aa1
    private final Lazy mCadenceTitle$delegate;

    @aa1
    private final Lazy mCadenceTitleUnit$delegate;

    @aa1
    private final Lazy mCadenceUnderstandSituation$delegate;

    @aa1
    private final Lazy mDateSourcesTip$delegate;

    @aa1
    private final Lazy mDeviceImg$delegate;

    @aa1
    private final Lazy mDeviceName$delegate;

    @aa1
    private final Lazy mDeviceQRCode$delegate;

    @aa1
    private final Lazy mDeviceQRCodeLayout$delegate;

    @aa1
    private final Lazy mDeviceSources$delegate;

    @aa1
    private final Lazy mPacePanelUnit$delegate;

    @aa1
    private final Lazy mPieChart$delegate;

    @aa1
    private final Lazy mSegmentationDetailsLL$delegate;

    @aa1
    private final Lazy mSegmentationRecyclerView$delegate;

    @aa1
    private final Lazy mSpeedPanelUnit$delegate;

    @aa1
    private final Lazy mSpeedPerKilometer$delegate;

    @aa1
    private final Lazy mSpeedRecyclerTitle$delegate;

    @aa1
    private final Lazy mSpeedRecyclerUnit$delegate;

    @aa1
    private final Lazy mSpeedRecyclerView$delegate;

    @aa1
    private final Lazy mSportGoalProgressBar$delegate;

    @aa1
    private final Lazy mSportMaxV02$delegate;

    @aa1
    private final Lazy mSportMaxV02Level$delegate;

    @aa1
    private final Lazy mSportRecoveryTime$delegate;

    @aa1
    private final Lazy mSportRecoveryTimeEstimate$delegate;

    @aa1
    private final Lazy mSportTrainingLoad$delegate;

    @aa1
    private final Lazy mTrainingExperience$delegate;

    @aa1
    private final Lazy mTrainingExperienceResult$delegate;

    @aa1
    private final Lazy mTrainingExperienceResultImg$delegate;

    @aa1
    private final Lazy mTrainingExperienceResultTv$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect1$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect2$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect3$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect4$delegate;

    @aa1
    private final Lazy mTrainingExperienceSelect5$delegate;

    @aa1
    private final Lazy mTrainingPerformance$delegate;

    @tb1
    private SportDetailV2Activity sportDetailV2Activity;
    private int threshold;
    private int thresholdMax;

    @SourceDebugExtension({"SMAP\nSportDetailV2ChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$Companion\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1530:1\n19#2:1531\n15#2:1532\n*S KotlinDebug\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$Companion\n*L\n107#1:1531\n107#1:1532\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final String OXO1() {
            SPUtils r0 = a01.OXO1.IiI10X();
            Object r1 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object r2 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
            if (r2 == null) goto L7;
            r1 = r2;
        L7:
            if (((AppUser) r1).getUnit() != 1) goto L11;
            return UtilsKt.XXO(R.string.less_than_mile);
        L11:
            return UtilsKt.XXO(R.string.less_than_kilometer);
        }

        public OXO1() {
        }
    }

    public static final class SportRecordDetailSpeedV2Adapter extends RecyclerView.Adapter<SportRecordDetailSpeedV2ViewHolder> {

        @aa1
        private final Context context;

        @aa1
        private final ArrayList<XIi00iiXO> items;

        public SportRecordDetailSpeedV2Adapter(@aa1 ArrayList<XIi00iiXO> r2, @aa1 Context r3) {
            Intrinsics.X0O(r2, "items");
            Intrinsics.X0O(r3, "context");
            this.items = r2;
            this.context = r3;
        }

        @aa1
        public final Context getContext() {
            return this.context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder r1, int r2) {
            onBindViewHolder((SportRecordDetailSpeedV2ViewHolder) r1, r2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r1, int r2) {
            return onCreateViewHolder(r1, r2);
        }

        @SuppressLint({"SetTextI18n"})
        public void onBindViewHolder(@aa1 SportRecordDetailSpeedV2ViewHolder r7, int r8) {
            Intrinsics.X0O(r7, "holder");
            XIi00iiXO r0 = this.items.get(r8);
            Intrinsics.O10IXXX0X(r0, "get(...)");
            XIi00iiXO r1 = r0;
            r7.getNumber().setText(r1.OXO1());
            DINCondBold r2 = r7.getTvPace();
            int r3 = 8;
            if (r1.iO() <= 0.0f) goto L5;
            r7.getPb().iO(r1.iO(), r1.XO0O10(), r8);
            r7.getNumber().setVisibility(0);
        L6:
            r2.setVisibility(r3);
            return;
        L5:
            r7.getTvPace().setText(SportDetailV2ChartFragment.Companion.OXO1() + "  " + r1.XO0O10());
            r7.getNumber().setVisibility(8);
            r3 = 0;
            goto L6
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @aa1
        public SportRecordDetailSpeedV2ViewHolder onCreateViewHolder(@aa1 ViewGroup r4, int r5) {
            Intrinsics.X0O(r4, "parent");
            View r6 = LayoutInflater.from(this.context).inflate(R.layout.item_sport_record_detail_pace_content_v2, r4, false);
            Intrinsics.O10IXXX0X(r6, "inflate(...)");
            return new SportRecordDetailSpeedV2ViewHolder(r6);
        }
    }

    public static final class SportRecordDetailSpeedV2ViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final DINCondBold number;

        @aa1
        private final PaceProgressBarV2 pb;

        @aa1
        private final DINCondBold tvPace;

        public SportRecordDetailSpeedV2ViewHolder(@aa1 View r3) {
            Intrinsics.X0O(r3, "view");
            super(r3);
            View r0 = r3.findViewById(R.id.number);
            Intrinsics.O10IXXX0X(r0, "findViewById(...)");
            this.number = (DINCondBold) r0;
            View r1 = r3.findViewById(R.id.pb);
            Intrinsics.O10IXXX0X(r1, "findViewById(...)");
            this.pb = (PaceProgressBarV2) r1;
            View r4 = r3.findViewById(R.id.tvPace);
            Intrinsics.O10IXXX0X(r4, "findViewById(...)");
            this.tvPace = (DINCondBold) r4;
        }

        @aa1
        public final DINCondBold getNumber() {
            return this.number;
        }

        @aa1
        public final PaceProgressBarV2 getPb() {
            return this.pb;
        }

        @aa1
        public final DINCondBold getTvPace() {
            return this.tvPace;
        }
    }

    public static final class SportRecordSegmentationAdapter extends RecyclerView.Adapter<SportRecordSegmentationViewHolder> {

        @aa1
        private final Context context;

        @aa1
        private final ArrayList<iO> items;

        public SportRecordSegmentationAdapter(@aa1 ArrayList<iO> r2, @aa1 Context r3) {
            Intrinsics.X0O(r2, "items");
            Intrinsics.X0O(r3, "context");
            this.items = r2;
            this.context = r3;
        }

        @aa1
        public final Context getContext() {
            return this.context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder r1, int r2) {
            onBindViewHolder((SportRecordSegmentationViewHolder) r1, r2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r1, int r2) {
            return onCreateViewHolder(r1, r2);
        }

        public void onBindViewHolder(@aa1 SportRecordSegmentationViewHolder r3, int r4) {
            Intrinsics.X0O(r3, "holder");
            iO r5 = this.items.get(r4);
            Intrinsics.O10IXXX0X(r5, "get(...)");
            iO r6 = r5;
            if (r6.iO().length() > 0) goto L5;
            return;
        L5:
            if (r6.XIi00iiXO().length() <= 0) goto L9;
            r3.getNumber().setText(r6.XO0O10());
            r3.getDuration().setText(r6.iO());
            r3.getDistance().setText(r6.XIi00iiXO());
            r3.getAvgPace().setText(r6.OXO1());
            return;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @aa1
        public SportRecordSegmentationViewHolder onCreateViewHolder(@aa1 ViewGroup r4, int r5) {
            Intrinsics.X0O(r4, "parent");
            View r6 = LayoutInflater.from(this.context).inflate(R.layout.item_sport_record_segmentation, r4, false);
            Intrinsics.O10IXXX0X(r6, "inflate(...)");
            return new SportRecordSegmentationViewHolder(r6);
        }
    }

    public static final class SportRecordSegmentationViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final DINCondBold avgPace;

        @aa1
        private final DINCondBold distance;

        @aa1
        private final DINCondBold duration;

        @aa1
        private final DINCondBold number;

        public SportRecordSegmentationViewHolder(@aa1 View r3) {
            Intrinsics.X0O(r3, "view");
            super(r3);
            View r0 = r3.findViewById(R.id.segmentation_item_number);
            Intrinsics.O10IXXX0X(r0, "findViewById(...)");
            this.number = (DINCondBold) r0;
            View r1 = r3.findViewById(R.id.segmentation_item_duration);
            Intrinsics.O10IXXX0X(r1, "findViewById(...)");
            this.duration = (DINCondBold) r1;
            View r2 = r3.findViewById(R.id.segmentation_item_distance);
            Intrinsics.O10IXXX0X(r2, "findViewById(...)");
            this.distance = (DINCondBold) r2;
            View r4 = r3.findViewById(R.id.segmentation_item_avgPace);
            Intrinsics.O10IXXX0X(r4, "findViewById(...)");
            this.avgPace = (DINCondBold) r4;
        }

        @aa1
        public final DINCondBold getAvgPace() {
            return this.avgPace;
        }

        @aa1
        public final DINCondBold getDistance() {
            return this.distance;
        }

        @aa1
        public final DINCondBold getDuration() {
            return this.duration;
        }

        @aa1
        public final DINCondBold getNumber() {
            return this.number;
        }
    }

    public static final class XIi00iiXO {

        @aa1
        public final String OXO1;

        @aa1
        public String XIi00iiXO;

        @aa1
        public String XO0O10;
        public float iO;

        public XIi00iiXO(@aa1 String r2, @aa1 String r3, float r4, @aa1 String r5) {
            Intrinsics.X0O(r2, "number");
            Intrinsics.X0O(r3, "tmpPace");
            Intrinsics.X0O(r5, "pace");
            this.OXO1 = r2;
            this.XIi00iiXO = r3;
            this.iO = r4;
            this.XO0O10 = r5;
        }

        public final void IiI10X(float r1) {
            this.iO = r1;
        }

        public final void O00(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.XO0O10 = r2;
        }

        @aa1
        public final String OXO1() {
            return this.OXO1;
        }

        @aa1
        public final String XIi00iiXO() {
            return this.XO0O10;
        }

        @aa1
        public final String XO0O10() {
            return this.XIi00iiXO;
        }

        public final void XOO0ii0(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.XIi00iiXO = r2;
        }

        public final float iO() {
            return this.iO;
        }
    }

    public static final class XO0O10 extends q4 {
        public final /* synthetic */ SportDetailV2ChartFragment iO;

        public XO0O10(SportDetailV2ChartFragment r1) {
            this.iO = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float r2) {
            return cp5.Ii1iii0((int) r2, this.iO.getUserProfile().getUnit());
        }
    }

    public static final class iO {

        @aa1
        public final String OXO1;

        @aa1
        public String XIi00iiXO;

        @aa1
        public String XO0O10;

        @aa1
        public String iO;

        public iO() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            String r4 = null;
            this(r1, r2, r3, r4, 15, null);
        }

        public final void IiI10X(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.iO = r2;
        }

        public final void O00(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.XO0O10 = r2;
        }

        @aa1
        public final String OXO1() {
            return this.XO0O10;
        }

        @aa1
        public final String XIi00iiXO() {
            return this.iO;
        }

        @aa1
        public final String XO0O10() {
            return this.OXO1;
        }

        public final void XOO0ii0(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.XIi00iiXO = r2;
        }

        @aa1
        public final String iO() {
            return this.XIi00iiXO;
        }

        public iO(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
            Intrinsics.X0O(r2, "number");
            Intrinsics.X0O(r3, "duration");
            Intrinsics.X0O(r4, os0.OII);
            Intrinsics.X0O(r5, "avgPace");
            this.OXO1 = r2;
            this.XIi00iiXO = r3;
            this.iO = r4;
            this.XO0O10 = r5;
        }

        public /* synthetic */ iO(String r2, String r3, String r4, String r5, int r6, DefaultConstructorMarker r7) {
            if ((r6 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r6 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r6 & 4) == 0) goto L12;
            r4 = "";
        L12:
            if ((r6 & 8) == 0) goto L14;
            r5 = "";
        L14:
            this(r2, r3, r4, r5);
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public SportDetailV2ChartFragment() {
        this.mTrainingPerformance$delegate = LazyKt__LazyJVMKt.iO(new rw4(this));
        this.mAteLevel$delegate = LazyKt__LazyJVMKt.iO(new tw4(this));
        this.mSportMaxV02$delegate = LazyKt__LazyJVMKt.iO(new fx4(this));
        this.mSportMaxV02Level$delegate = LazyKt__LazyJVMKt.iO(new px4(this));
        this.mSportTrainingLoad$delegate = LazyKt__LazyJVMKt.iO(new qx4(this));
        this.mSportGoalProgressBar$delegate = LazyKt__LazyJVMKt.iO(new rx4(this));
        this.mSportRecoveryTime$delegate = LazyKt__LazyJVMKt.iO(new sx4(this));
        this.mSportRecoveryTimeEstimate$delegate = LazyKt__LazyJVMKt.iO(new tx4(this));
        this.mPieChart$delegate = LazyKt__LazyJVMKt.iO(new ux4(this));
        this.mSpeedPerKilometer$delegate = LazyKt__LazyJVMKt.iO(new vx4(this));
        this.mSpeedRecyclerTitle$delegate = LazyKt__LazyJVMKt.iO(new cx4(this));
        this.mSpeedRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new nx4(this));
        this.locationSmoothAlgorithm = new ArrayList();
        this.activityData = new RecordActivityData();
        this.mSpeedRecyclerUnit$delegate = LazyKt__LazyJVMKt.iO(new yx4(this));
        this.mPacePanelUnit$delegate = LazyKt__LazyJVMKt.iO(new hy4(this));
        this.mSpeedPanelUnit$delegate = LazyKt__LazyJVMKt.iO(new iy4(this));
        this.mCadenceTitle$delegate = LazyKt__LazyJVMKt.iO(new jy4(this));
        this.mCadenceTitleUnit$delegate = LazyKt__LazyJVMKt.iO(new ky4(this));
        this.mCadenceAvgTitle$delegate = LazyKt__LazyJVMKt.iO(new ly4(this));
        this.mCadenceMaxTitle$delegate = LazyKt__LazyJVMKt.iO(new my4(this));
        this.mTrainingExperience$delegate = LazyKt__LazyJVMKt.iO(new sw4(this));
        this.mTrainingExperienceSelect$delegate = LazyKt__LazyJVMKt.iO(new uw4(this));
        this.mTrainingExperienceSelect1$delegate = LazyKt__LazyJVMKt.iO(new vw4(this));
        this.mTrainingExperienceSelect2$delegate = LazyKt__LazyJVMKt.iO(new ww4(this));
        this.mTrainingExperienceSelect3$delegate = LazyKt__LazyJVMKt.iO(new xw4(this));
        this.mTrainingExperienceSelect4$delegate = LazyKt__LazyJVMKt.iO(new yw4(this));
        this.mTrainingExperienceSelect5$delegate = LazyKt__LazyJVMKt.iO(new zw4(this));
        this.mTrainingExperienceResult$delegate = LazyKt__LazyJVMKt.iO(new ax4(this));
        this.mTrainingExperienceResultImg$delegate = LazyKt__LazyJVMKt.iO(new bx4(this));
        this.mTrainingExperienceResultTv$delegate = LazyKt__LazyJVMKt.iO(new dx4(this));
        this.mDateSourcesTip$delegate = LazyKt__LazyJVMKt.iO(new ex4(this));
        this.mDeviceSources$delegate = LazyKt__LazyJVMKt.iO(new gx4(this));
        this.mDeviceImg$delegate = LazyKt__LazyJVMKt.iO(new hx4(this));
        this.mDeviceName$delegate = LazyKt__LazyJVMKt.iO(new ix4(this));
        this.mDeviceQRCode$delegate = LazyKt__LazyJVMKt.iO(new jx4(this));
        this.mDeviceQRCodeLayout$delegate = LazyKt__LazyJVMKt.iO(new kx4(this));
        this.mSegmentationDetailsLL$delegate = LazyKt__LazyJVMKt.iO(new lx4(this));
        this.mSegmentationRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new mx4(this));
        this.threshold = 5;
        this.thresholdMax = 11;
        this.mCadenceUnderstandSituation$delegate = LazyKt__LazyJVMKt.iO(new ox4(this));
        setLeftAxisGridDashedLine(true);
        LogUtils.i(new Object[]{"SportDetailV2ChartFragment"});
        this.colorsList = CollectionsKt__CollectionsKt.iXiX011(new Integer[]{Integer.valueOf(R.color.sport_detail_bg_endColor), Integer.valueOf(R.color.bp_level_color_high), Integer.valueOf(R.color.p_level_color_high), Integer.valueOf(R.color.sport_detail_bg_centerColor), Integer.valueOf(R.color.bp_level_color_standard), Integer.valueOf(R.color.bp_level_color_low)});
    }

    public static /* synthetic */ PFMedium IO0II0i(SportDetailV2ChartFragment r0) {
        return mCadenceMaxTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout IO0iXO0O(SportDetailV2ChartFragment r0) {
        return mTrainingExperience_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IX0IXOi(SportDetailV2ChartFragment r0) {
        return mPacePanelUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView IX1XiI(SportDetailV2ChartFragment r0) {
        return mTrainingExperienceResultImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IXI(SportDetailV2ChartFragment r0) {
        return mSportTrainingLoad_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView IXOIIIO(SportDetailV2ChartFragment r0) {
        return mCadenceUnderstandSituation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView Ii0X0X(SportDetailV2ChartFragment r0) {
        return mDeviceName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView Ii0i(SportDetailV2ChartFragment r0) {
        return mSpeedRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout Ii1iii0(SportDetailV2ChartFragment r0) {
        return mTrainingExperienceSelect2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout IiiXiI0I(SportDetailV2ChartFragment r0) {
        return mSpeedPerKilometer_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void O001I(SportDetailV2ChartFragment r0, View r1) {
        trainingExperienceSelect$lambda$0(r0, r1);
    }

    public static /* synthetic */ PFMedium O0O(SportDetailV2ChartFragment r0) {
        return mSportRecoveryTimeEstimate_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void O0O0X0iOi(Function1 r0) {
        showQCCode$lambda$1(r0);
    }

    public static /* synthetic */ void OO(Function1 r0) {
        showQCCode$lambda$0(r0);
    }

    public static /* synthetic */ void OX110i(SportDetailV2ChartFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ LinearLayout Oi(SportDetailV2ChartFragment r0) {
        return mDeviceQRCodeLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X00O0(SportDetailV2ChartFragment r0) {
        return mDeviceImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X00XIX1(SportDetailV2ChartFragment r0) {
        return mCadenceTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X00Xi1X(SportDetailV2ChartFragment r0) {
        initView$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0iO(SportDetailV2ChartFragment r0) {
        return mSpeedPanelUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout X1(SportDetailV2ChartFragment r0) {
        return mTrainingExperienceResult_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X100O(SportDetailV2ChartFragment r0, View r1) {
        setTrainingPerformance$lambda$3(r0, r1);
    }

    public static /* synthetic */ LinearLayout X111IO(SportDetailV2ChartFragment r0) {
        return mTrainingExperienceSelect4_delegate$lambda$0(r0);
    }

    public static /* synthetic */ SegmentedBarView X11I(SportDetailV2ChartFragment r0) {
        return mAteLevel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XO0X10iO(SportDetailV2ChartFragment r0) {
        return mSportMaxV02_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XOIX(SportDetailV2ChartFragment r0) {
        return mSportRecoveryTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XOO0XOOii(SportDetailV2ChartFragment r0, View r1) {
        trainingExperienceSelect$lambda$3(r0, r1);
    }

    public static /* synthetic */ LinearLayout XOX0O0(SportDetailV2ChartFragment r0) {
        return mTrainingExperienceSelect5_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XOXiX0(SportDetailV2ChartFragment r0) {
        return mDeviceSources_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XX00i10X(SportDetailV2ChartFragment r0) {
        return mSpeedRecyclerTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XX1Oi(SportDetailV2ChartFragment r0) {
        return mSpeedRecyclerUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXO(SportDetailV2ChartFragment r0, View r1) {
        trainingExperienceSelect$lambda$4(r0, r1);
    }

    public static /* synthetic */ void XXiIiX10(SportDetailV2ChartFragment r0, View r1) {
        trainingExperienceSelect$lambda$1(r0, r1);
    }

    public static /* synthetic */ LinearLayout XXiO0i(SportDetailV2ChartFragment r0) {
        return mTrainingExperienceSelect1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium Xi1i0XOX0(SportDetailV2ChartFragment r0) {
        return mCadenceTitleUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ SportGoalProgressBar Xii11I(SportDetailV2ChartFragment r0) {
        return mSportGoalProgressBar_delegate$lambda$0(r0);
    }

    private final void addMyPieChart(Long r10, int r11, ArrayList<MyPieChart.OXO1> r12) {
        LogUtils.i(new Object[]{"addMyPieChart " + r10});
        if (r10 == null) goto L5;
        long r2 = r10.longValue();
    L6:
        r12.add(new MyPieChart.OXO1(r2, getResources().getColor(r11), 0.0f, 0.0f, 12, null));
        return;
    L5:
        r2 = 1;
        goto L6
    }

    private final void ateList(int r14) {
        String r4 = "";
        iz3 r0 = new iz3(0.0f, 10.0f, "", getMActivity().getResources().getColor(this.colorsList.get(0).intValue()));
        if (r14 != 5) goto L5;
        String r2 = getString(R.string.very_Poor_key);
    L6:
        iz3 r5 = r0.X1ii(r2);
        iz3 r1 = new iz3(10.0f, 25.0f, "", getMActivity().getResources().getColor(this.colorsList.get(1).intValue()));
        if (r14 != 4) goto L9;
        String r3 = getString(R.string.poor_key);
    L10:
        iz3 r6 = r1.X1ii(r3);
        iz3 r7 = new iz3(25.0f, 50.0f, "", getMActivity().getResources().getColor(this.colorsList.get(2).intValue()));
        if (r14 != 3) goto L13;
        String r8 = getString(R.string.average_key);
    L14:
        iz3 r9 = r7.X1ii(r8);
        iz3 r10 = new iz3(50.0f, 75.0f, "", getMActivity().getResources().getColor(this.colorsList.get(3).intValue()));
        if (r14 != 2) goto L17;
        String r11 = getString(R.string.good_key);
    L18:
        iz3 r12 = r10.X1ii(r11);
        iz3 r13 = new iz3(75.0f, 95.0f, "", getMActivity().getResources().getColor(this.colorsList.get(4).intValue()));
        if (r14 != 1) goto L21;
        String r15 = getString(R.string.excellent_key);
    L22:
        iz3 r16 = r13.X1ii(r15);
        iz3 r17 = new iz3(95.0f, 100.0f, "", getMActivity().getResources().getColor(this.colorsList.get(5).intValue()));
        if (r14 != 0) goto L25;
        r4 = getString(R.string.top_key);
    L25:
        List<iz3> r18 = CollectionsKt__CollectionsKt.Ii1iii0(new iz3[]{r5, r6, r9, r12, r16, r17.X1ii(r4)});
        getMAteLevel().setSegmentSideRule(1);
        getMAteLevel().setShowDescriptionText(true);
        getMAteLevel().setSegments(r18);
        getMAteLevel().setDescriptionTextColor(gk4.iO(getMAteLevel().getContext(), R.color.text_color));
        getMAteLevel().setDescriptionTopTextColor(gk4.iO(getMAteLevel().getContext(), this.colorsList.get(5 - r14).intValue()));
        return;
    L21:
        r15 = "";
        goto L22
    L17:
        r11 = "";
        goto L18
    L13:
        r8 = "";
        goto L14
    L9:
        r3 = "";
        goto L10
    L5:
        r2 = "";
        goto L6
    }

    private final void configChartV2(LineChart r5, int r6, int r7, long r8) {
        iO1Xi1X1i r0 = iO1Xi1X1i.OXO1;
        r0.XIi00iiXO(r5);
        int r1 = 0;
        r5.setTouchEnabled(false);
        r5.getDescription().XOO0ii0(false);
        r5.getLegend().XOO0ii0(false);
        r5.getAxisLeft().XO0X10iO(false);
        r5.getAxisLeft().iOiXi11II(r7);
        r5.getAxisLeft().i0X000X0O(r6);
        r5.getAxisLeft().XX1Oi(gk4.iO(getMActivity(), R.color.line_color));
        r5.getAxisLeft().I0IIOi(gk4.iO(getMActivity(), R.color.line_color));
        r5.getAxisLeft().iI0I(true);
        r5.getAxisRight().X00Xi1X(false);
        r5.getAxisRight().XO0X10iO(false);
        r5.getAxisRight().Ii0X0X(false);
        XAxis r9 = r5.getXAxis();
        Intrinsics.XXI(r9);
        Context r10 = r5.getContext();
        Intrinsics.O10IXXX0X(r10, "getContext(...)");
        r0.OIi0(r9, false, r10);
        long r2 = ((long) (getMWorkout().getMDuration() * 1000)) / r8;
        r9.i0X000X0O(0.0f);
        float r11 = r8;
        r9.IXOIIIO(r11 / 2.0f);
        r9.iOiXi11II(r11);
        ArrayList r12 = new ArrayList();
        int r13 = getMWorkout().getMDuration() * 1000;
        int r14 = (int) r2;
        if (r14 <= 0) goto L16;
        int r15 = ProgressionUtilKt.iO(0, r13, r14);
        if (r15 < 0) goto L13;
    L6:
        int r16 = O0X11OiO.XXO(r1);
        if (r16 != 0) goto L9;
        String r17 = "0";
    L10:
        r12.add(r17);
        if (r1 == r15) goto L13;
        r1 = r1 + r14;
        goto L6
    L9:
        r17 = String.valueOf(r16 + 1);
    L13:
        r9.Oi(new q4(r12));
        return;
    L16:
        throw new IllegalArgumentException("Step must be positive, was: " + r14 + FileUtils.FILE_EXTENSION_SEPARATOR);
    }

    private final SegmentedBarView getMAteLevel() {
        return (SegmentedBarView) getValue();
    }

    private final PFMedium getMCadenceAvgTitle() {
        return (PFMedium) getValue();
    }

    private final PFMedium getMCadenceMaxTitle() {
        return (PFMedium) getValue();
    }

    private final PFMedium getMCadenceTitle() {
        return (PFMedium) getValue();
    }

    private final PFMedium getMCadenceTitleUnit() {
        return (PFMedium) getValue();
    }

    private final ImageView getMCadenceUnderstandSituation() {
        return (ImageView) getValue();
    }

    private final View getMDateSourcesTip() {
        return (View) getValue();
    }

    private final ImageView getMDeviceImg() {
        return (ImageView) getValue();
    }

    private final TextView getMDeviceName() {
        return (TextView) getValue();
    }

    private final ImageView getMDeviceQRCode() {
        return (ImageView) getValue();
    }

    private final LinearLayout getMDeviceQRCodeLayout() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMDeviceSources() {
        return (LinearLayout) getValue();
    }

    private final TextView getMPacePanelUnit() {
        return (TextView) getValue();
    }

    private final MyPieChart getMPieChart() {
        return (MyPieChart) getValue();
    }

    private final LinearLayout getMSegmentationDetailsLL() {
        return (LinearLayout) getValue();
    }

    private final RecyclerView getMSegmentationRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final TextView getMSpeedPanelUnit() {
        return (TextView) getValue();
    }

    private final LinearLayout getMSpeedPerKilometer() {
        return (LinearLayout) getValue();
    }

    private final TextView getMSpeedRecyclerTitle() {
        return (TextView) getValue();
    }

    private final TextView getMSpeedRecyclerUnit() {
        return (TextView) getValue();
    }

    private final RecyclerView getMSpeedRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final SportGoalProgressBar getMSportGoalProgressBar() {
        return (SportGoalProgressBar) getValue();
    }

    private final PFMedium getMSportMaxV02() {
        return (PFMedium) getValue();
    }

    private final PFMedium getMSportMaxV02Level() {
        return (PFMedium) getValue();
    }

    private final PFMedium getMSportRecoveryTime() {
        return (PFMedium) getValue();
    }

    private final PFMedium getMSportRecoveryTimeEstimate() {
        return (PFMedium) getValue();
    }

    private final PFMedium getMSportTrainingLoad() {
        return (PFMedium) getValue();
    }

    private final LinearLayout getMTrainingExperience() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceResult() {
        return (LinearLayout) getValue();
    }

    private final ImageView getMTrainingExperienceResultImg() {
        return (ImageView) getValue();
    }

    private final TextView getMTrainingExperienceResultTv() {
        return (TextView) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect1() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect2() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect3() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect4() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect5() {
        return (LinearLayout) getValue();
    }

    private final RelativeLayout getMTrainingPerformance() {
        return (RelativeLayout) getValue();
    }

    private final void getSportDetailActivity() {
        if ((getActivity() instanceof SportDetailV2Activity) == false) goto L6;
        FragmentActivity r0 = getActivity();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2Activity");
        this.sportDetailV2Activity = (SportDetailV2Activity) r0;
        return;
    }

    private final String getTodayTime(int r4) {
        Calendar r0 = Calendar.getInstance();
        r0.setTimeInMillis(getMEndTime());
        r0.add(13, r4);
        String r5 = new SimpleDateFormat("M/dEEEEHH:mm", Locale.getDefault()).format(r0.getTime());
        Intrinsics.O10IXXX0X(r5, "format(...)");
        return r5;
    }

    private final Pair<Integer, String> getV02Level(int r3) {
        if (95 > r3) goto L9;
        if (r3 >= 101) goto L9;
        return new Pair(0, getString(R.string.top_key));
    L9:
        if (75 > r3) goto L14;
        if (r3 >= 95) goto L14;
        return new Pair(1, getString(R.string.excellent_key));
    L14:
        if (50 > r3) goto L19;
        if (r3 >= 75) goto L19;
        return new Pair(2, getString(R.string.good_key));
    L19:
        if (25 > r3) goto L24;
        if (r3 >= 50) goto L24;
        return new Pair(3, getString(R.string.average_key));
    L24:
        if (10 > r3) goto L29;
        if (r3 >= 25) goto L29;
        return new Pair(4, getString(R.string.poor_key));
    L29:
        return new Pair(5, getString(R.string.very_Poor_key));
    }

    public static /* synthetic */ PFMedium i0X000X0O(SportDetailV2ChartFragment r0) {
        return mCadenceAvgTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout i100IXOX(SportDetailV2ChartFragment r0) {
        return mTrainingPerformance_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void i11I(SportDetailV2ChartFragment r0, View r1) {
        trainingExperienceSelect$lambda$2(r0, r1);
    }

    public static /* synthetic */ TextView iIi1(SportDetailV2ChartFragment r0) {
        return mTrainingExperienceResultTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iOI(SportDetailV2ChartFragment r0) {
        return mSportMaxV02Level_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout iOiXi11II(SportDetailV2ChartFragment r0) {
        return mSegmentationDetailsLL_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iXi(SportDetailV2ChartFragment r0) {
        return mDateSourcesTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout iXiX011(SportDetailV2ChartFragment r0) {
        return mTrainingExperienceSelect_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iXiiiO(SportDetailV2ChartFragment r0) {
        return mDeviceQRCode_delegate$lambda$0(r0);
    }

    public static /* synthetic */ MyPieChart iiIOiX(SportDetailV2ChartFragment r0) {
        return mPieChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView iii0(SportDetailV2ChartFragment r0) {
        return mSegmentationRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout iiiO(SportDetailV2ChartFragment r0) {
        return mTrainingExperienceSelect3_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(SportDetailV2ChartFragment r1) {
        Pair<Integer, String> r0 = r1.getV02Level(r1.getMWorkout().getMMaxVO2() / 10);
        r1.getMAteLevel().setValueSegment(Integer.valueOf(5 - r0.getFirst().intValue()));
    }

    private static final void initView$lambda$1(SportDetailV2ChartFragment r3, View r4) {
        if (r3.getMWorkout().getMMode() != 52) goto L5;
        int r5 = 5;
    L6:
        Bundle r0 = new Bundle();
        r0.putString("mArg0", "https://api.iot-solution.net/web/help/gomer_help.html?type=" + r5);
        r0.putInt("mArg1", 2);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r6 = new Intent(r3.getActivity(), WebViewActivity.class);
        r6.putExtras(r0);
        r3.startActivity(r6);
        return;
    L5:
        r5 = 2;
        goto L6
    }

    private final void locationList() {
        ArrayList<CustomLatLng> r1 = new ArrayList();
        boolean r4 = false;
        this.isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
        List<Location> r2 = getMLocationDao().getLocation(getMWorkout().getMStart(), getMWorkout().getMEnd());
        LogUtils.i(new Object[]{"locationList " + r2});
        if (r2.isEmpty() == true) goto L25;
        if (r2.size() < 2) goto L25;
        Iterator<Location> r3 = r2.iterator();
    L8:
        if (r3.hasNext() == false) goto L12;
        if (r3.next().getMSource() != 1) goto L8;
    L14:
        if (this.isInChinaMainland == false) goto L20;
        if (r4 == false) goto L20;
        CoordinateConverter r5 = new CoordinateConverter().from(CoordinateConverter.CoordType.GPS);
        Iterator<Location> r6 = r2.iterator();
    L18:
        if (r6.hasNext() == false) goto L25;
        Location r7 = r6.next();
        LatLng r8 = r5.coord(new LatLng(r7.getMLatitude(), r7.getMLongitude())).convert();
        r1.add(new CustomLatLng(r8.latitude, r8.longitude, r7.getMTime(), r7.getMAltitude(), 0, 16, null));
    L20:
        Iterator<Location> r9 = r2.iterator();
    L22:
        if (r9.hasNext() == false) goto L25;
        Location r10 = r9.next();
        r1.add(new CustomLatLng(r10.getMLatitude(), r10.getMLongitude(), r10.getMTime(), r10.getMAltitude(), 0, 16, null));
        goto L22
    L12:
        r4 = true;
    L25:
        if (r1.isEmpty() == false) goto L27;
        return;
    L27:
        if (r1.size() <= 2) goto L36;
        this.locationSmoothAlgorithm.addAll(locationSmoothAlgorithm(r1));
        return;
    }

    private final ArrayList<CustomLatLng> locationSmoothAlgorithm(ArrayList<CustomLatLng> r28) {
        ArrayList<CustomLatLng> r2 = new ArrayList();
        CustomLatLng r3 = new CustomLatLng(r28.get(0).getLatitude(), r28.get(0).getLongitude(), r28.get(0).getTime(), r28.get(0).getAltitude(), 0, 16, null);
        CustomLatLng r15 = new CustomLatLng(0.0d, 0.0d, 0, 0, 0, 16, null);
        int r4 = r28.size();
        int r5 = 0;
    L3:
        if (r5 >= r4) goto L17;
        CustomLatLng r6 = r28.get(r5);
        Intrinsics.O10IXXX0X(r6, "get(...)");
        CustomLatLng r7 = r6;
        if (r7.getLatitude() == r15.getLatitude()) goto L7;
    L9:
        float r8 = (mc0.iIi1(DistanceUtil.getDistance(new LatLng(r3.getLatitude(), r3.getLongitude()), new LatLng(r7.getLatitude(), r7.getLongitude())) * ((double) 100)) / 100.0f) / (Math.abs(r7.getTime() - r3.getTime()) / ((long) 1000));
        if (r8 >= this.threshold) goto L12;
        r15.setLatitude(0.0d);
        r15.setLongitude(0.0d);
        r15.setTime(0);
        r15.setAltitude(0);
    L16:
        r3.setLatitude(r7.getLatitude());
        r3.setLongitude(r7.getLongitude());
        r3.setTime(r7.getTime());
        r3.setAltitude(r7.getAltitude());
        r2.add(new CustomLatLng(r7.getLatitude(), r7.getLongitude(), r7.getTime(), r7.getAltitude(), 0, 16, null));
        r5 = r5 + 1;
        goto L3
    L12:
        if (r8 < this.thresholdMax) goto L14;
        r7.setLongitude(r3.getLongitude());
        r7.setLatitude(r3.getLatitude());
        goto L16
    L14:
        r15.setLatitude(r7.getLatitude());
        r15.setLongitude(r7.getLongitude());
        r15.setTime(r7.getTime());
        r15.setAltitude(r7.getAltitude());
        double r9 = 2;
        r7.setLongitude((r3.getLongitude() + r7.getLongitude()) / r9);
        r7.setLatitude((r3.getLatitude() + r7.getLatitude()) / r9);
        goto L16
    L7:
        if (r7.getLongitude() != r15.getLongitude()) goto L9;
        r7.setLongitude(r3.getLongitude());
        r7.setLatitude(r3.getLatitude());
        goto L16
    L17:
        return r2;
    }

    private static final SegmentedBarView mAteLevel_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (SegmentedBarView) r1.getMView().findViewById(R.id.ateLevel);
    }

    private static final PFMedium mCadenceAvgTitle_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.cadence_avg_title);
    }

    private static final PFMedium mCadenceMaxTitle_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.cadence_max_title);
    }

    private static final PFMedium mCadenceTitleUnit_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.cadence_max_title_unit);
    }

    private static final PFMedium mCadenceTitle_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.cadence_title);
    }

    private static final ImageView mCadenceUnderstandSituation_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.understand_situation_cadence);
    }

    private static final View mDateSourcesTip_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return r1.getMView().findViewById(R.id.device_sport_detail_tip);
    }

    private static final ImageView mDeviceImg_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.device_img);
    }

    private static final TextView mDeviceName_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.device_name);
    }

    private static final LinearLayout mDeviceQRCodeLayout_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.device_qr_code_ll);
    }

    private static final ImageView mDeviceQRCode_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.device_qr_code);
    }

    private static final LinearLayout mDeviceSources_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.device_sources);
    }

    private static final TextView mPacePanelUnit_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.pace_panel_unit);
    }

    private static final MyPieChart mPieChart_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (MyPieChart) r1.getMView().findViewById(R.id.myPieChart);
    }

    private static final LinearLayout mSegmentationDetailsLL_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.segmentation_detail_ll);
    }

    private static final RecyclerView mSegmentationRecyclerView_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.segmentation_detail_rl);
    }

    private static final TextView mSpeedPanelUnit_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.speed_panel_unit);
    }

    private static final LinearLayout mSpeedPerKilometer_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.speed_per_kilometer_ll);
    }

    private static final TextView mSpeedRecyclerTitle_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.speed_per_kilometer_title);
    }

    private static final TextView mSpeedRecyclerUnit_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.speed_per_kilometer_ll_unit);
    }

    private static final RecyclerView mSpeedRecyclerView_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.speed_per_kilometer_rl);
    }

    private static final SportGoalProgressBar mSportGoalProgressBar_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (SportGoalProgressBar) r1.getMView().findViewById(R.id.sport_goal_progressBar);
    }

    private static final PFMedium mSportMaxV02Level_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.sport_maxvO2_level);
    }

    private static final PFMedium mSportMaxV02_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.sport_maxvO2);
    }

    private static final PFMedium mSportRecoveryTimeEstimate_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.sport_recoveryTime_estimate);
    }

    private static final PFMedium mSportRecoveryTime_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.sport_recoveryTime);
    }

    private static final PFMedium mSportTrainingLoad_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.sport_trainingLoad);
    }

    private static final ImageView mTrainingExperienceResultImg_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.training_experience_img_result);
    }

    private static final TextView mTrainingExperienceResultTv_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.training_experience_tv_result);
    }

    private static final LinearLayout mTrainingExperienceResult_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.training_experience_layout_result);
    }

    private static final LinearLayout mTrainingExperienceSelect1_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.training_experience_layout_1);
    }

    private static final LinearLayout mTrainingExperienceSelect2_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.training_experience_layout_2);
    }

    private static final LinearLayout mTrainingExperienceSelect3_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.training_experience_layout_3);
    }

    private static final LinearLayout mTrainingExperienceSelect4_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.training_experience_layout_4);
    }

    private static final LinearLayout mTrainingExperienceSelect5_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.training_experience_layout_5);
    }

    private static final LinearLayout mTrainingExperienceSelect_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.training_experience_layout_select);
    }

    private static final LinearLayout mTrainingExperience_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.training_experience_layout);
    }

    private static final RelativeLayout mTrainingPerformance_delegate$lambda$0(SportDetailV2ChartFragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.training_performance_layout);
    }

    private final Pair<Long, LinkedHashMap<Long, nr0>> reviseData(List<Integer> r16, int r17) {
        if (r16 != null) goto L5;
    L9:
        long r1 = 60000;
    L8:
        long r7 = r1;
        LinkedHashMap r2 = new LinkedHashMap();
        long r3 = getMStartTime();
        long r5 = getMEndTime();
        if (r7 <= 0) goto L34;
        long r6 = ProgressionUtilKt.XO0O10(r3, r5, r7);
        if (r3 > r6) goto L17;
    L14:
        r2.put(Long.valueOf(r3), new nr0(0, 0, null, 4, null));
        if (r3 == r6) goto L17;
        r3 = r3 + r7;
    L17:
        if (r16 == null) goto L32;
        Iterator<T> r4 = r16.iterator();
        int r8 = 0;
    L20:
        if (r4.hasNext() == false) goto L32;
        Object r9 = r4.next();
        int r10 = r8 + 1;
        if (r8 >= 0) goto L24;
        CollectionsKt__CollectionsKt.XOX0O0();
    L24:
        int r11 = ((Number) r9).intValue();
        Iterator r12 = r2.entrySet().iterator();
    L26:
        if (r12.hasNext() == false) goto L30;
        nr0 r13 = (nr0) ((Map.Entry) r12.next()).getValue();
        if (r13.IiI10X() != 0) goto L26;
        r13.OIX0iXi(r13.I0IIOi() + r11);
        r13.OIi0(r13.IiI10X() + 1);
    L30:
        r8 = r10;
    L32:
        return new Pair(Long.valueOf(r7), r2);
    L34:
        throw new IllegalArgumentException("Step must be positive, was: " + r7 + FileUtils.FILE_EXTENSION_SEPARATOR);
    L5:
        if ((!r16.isEmpty()) != true) goto L9;
        if (r17 == 0) goto L9;
        r1 = (getMEndTime() - getMStartTime()) / ((long) r16.size());
        goto L8
    }

    private final void setDeviceSource() {
        LogUtils.d(new Object[]{"setDeviceSource ---> " + getMWorkout().getMMaxPace() + "  " + getMWorkout().getMMinPace() + " " + getMWorkout().getMPrototype() + "  " + getMWorkout().getMFirmwareFlag() + "  " + getMWorkout().getMBleName() + " "});
        LinearLayout r0 = getMDeviceSources();
        if (getMWorkout().getMBleName().length() != 0) goto L6;
    L7:
        int r1 = 8;
        SportDetailV2ChartFragment r2 = this;
    L17:
        r0.setVisibility(r1);
        r2.showSourcesTip();
        return;
    L6:
        if (Intrinsics.XOO0ii0(getMWorkout().getMBleName(), "0") == true) goto L7;
        File r3 = uz0.X1(sz0.OXO1, getMWorkout().getMBleName(), getMWorkout().getMFirmwareFlag());
        int r4 = q62.OXO1.iX(new BleDeviceInfo(0, null, getMWorkout().getMBleName(), null, null, null, getMWorkout().getMPrototype(), getMWorkout().getMFirmwareFlag(), 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -197, -1, -1, -1, at.IO, null));
        ImageView r5 = getMDeviceImg();
        FragmentActivity r6 = getActivity();
        if (r6 == null) goto L11;
        Drawable r7 = r6.getDrawable(r4);
    L12:
        r5.setImageDrawable(r7);
        if (com.blankj.utilcode.util.FileUtils.isFileExists(r3) == false) goto L15;
        getMDeviceImg().setImageBitmap(ImageUtils.getBitmap(r3));
        r2 = this;
    L16:
        r2.getMDeviceName().setText(r2.getMWorkout().getMBleName());
        r1 = 0;
        goto L17
    L15:
        r2 = this;
        r2.isWorkImage = true;
        DeviceInfoChecker.OXO1.X1ii(r2.getMWorkout().getMBleName(), r2.getMWorkout().getMFirmwareFlag());
        goto L16
    L11:
        r7 = null;
        goto L12
    }

    private final void setTrainingExperience(int r3) {
        getMView().findViewById(R.id.training_experience_hint_tv).setVisibility(8);
        getMTrainingExperienceSelect().setVisibility(8);
        getMTrainingExperienceResult().setVisibility(0);
        getMTrainingExperienceResultImg().setImageResource(getTrainingExperienceImage(getMActivity(), r3));
        getMTrainingExperienceResultTv().setText(getString(getTrainingExperienceName(getMActivity(), r3)));
        getMTrainingExperience().setBackgroundResource(R.drawable.ripple_training_experience_bg);
    }

    private static final void setTrainingPerformance$lambda$3(SportDetailV2ChartFragment r3, View r4) {
        Bundle r5 = new Bundle();
        r5.putString("mArg0", "https://api.iot-solution.net/web/help/gomer_help.html?type=1");
        r5.putInt("mArg1", 2);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), WebViewActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
    }

    private final void showAltitudeV2(List<Integer> r12) {
        Pair<Long, LinkedHashMap<Long, nr0>> r13 = reviseData(r12, getMWorkout().getMAltitudePathCount());
        r13.component1().longValue();
        LinkedHashMap<Long, nr0> r14 = r13.component2();
        ArrayList r0 = new ArrayList();
        float r1 = getMChartXStartIndex();
        Iterator<Map.Entry<Long, nr0>> r2 = r14.entrySet().iterator();
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r2.hasNext() == false) goto L14;
        nr0 r5 = r2.next().getValue();
        if (r5.IiI10X() == 0) goto L13;
        int r6 = r5.I0IIOi() / r5.IiI10X();
        r0.add(new Entry(r1, r6));
        if (r4 >= r6) goto L10;
        r4 = r6;
    L10:
        if (r3 == 0) goto L12;
        if (r3 <= r6) goto L13;
    L12:
        r3 = r6;
    L13:
        r1 = r1 + 1.0f;
        goto L4
    L14:
        LineChart r7 = getAltitudeLineChart();
        Intrinsics.O10IXXX0X(r7, "<get-altitudeLineChart>(...)");
        configChartV2(r7, r3 - 5, r4 + 5, r14.size());
        LineChart r15 = getAltitudeLineChart();
        Intrinsics.O10IXXX0X(r15, "<get-altitudeLineChart>(...)");
        updateChartData(r15, r0, R.color.altitude_color, R.drawable.shape_altitude);
        TextView r16 = getTvAltitudeUnit();
        if (getUserProfile().getUnit() != 0) goto L17;
        String r8 = getString(R.string.altitude_unit);
    L18:
        r16.setText(r8);
        TextView r17 = getTvMaxAltitudeValue();
        if (getMWorkout().getMMaxAltitude() <= 10000) goto L21;
    L24:
        String r9 = cp5.iXiX011(r4, getUserProfile().getUnit());
    L25:
        r17.setText(r9);
        TextView r18 = getTvMinAltitudeValue();
        if (getMWorkout().getMMaxAltitude() <= 10000) goto L28;
    L31:
        String r10 = cp5.iXiX011(r3, getUserProfile().getUnit());
    L32:
        r18.setText(r10);
        return;
    L28:
        if (getMWorkout().getMMaxAltitude() < (-10000)) goto L31;
        r10 = cp5.iXiX011(getMWorkout().getMMinAltitude(), getUserProfile().getUnit());
        goto L32
    L21:
        if (getMWorkout().getMMaxAltitude() < (-10000)) goto L24;
        r9 = cp5.iXiX011(getMWorkout().getMMaxAltitude(), getUserProfile().getUnit());
        goto L25
    L17:
        r8 = getString(R.string.yd);
        goto L18
    }

    private final void showHrV2(List<Integer> r14) {
        Pair<Long, LinkedHashMap<Long, nr0>> r1 = reviseData(r14, getMWorkout().getMHrPathSampleInterval());
        r1.component1().longValue();
        LinkedHashMap<Long, nr0> r2 = r1.component2();
        ArrayList r6 = new ArrayList();
        float r3 = getMChartXStartIndex();
        Iterator<Map.Entry<Long, nr0>> r4 = r2.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L9;
        nr0 r5 = r4.next().getValue();
        if (r5.IiI10X() == 0) goto L8;
        r6.add(new Entry(r3, r5.I0IIOi() / r5.IiI10X()));
    L8:
        r3 = r3 + 1.0f;
        goto L4
    L9:
        LineChart r7 = getHrLineChart();
        Intrinsics.O10IXXX0X(r7, "<get-hrLineChart>(...)");
        configChartV2(r7, 40, getMWorkout().getMMaxBpm() + 10, r2.size());
        LineChart r8 = getHrLineChart();
        Intrinsics.O10IXXX0X(r8, "<get-hrLineChart>(...)");
        updateChartData(r8, r6, R.color.hr_color, R.drawable.shape_hr);
        getTvAvgBmpValue().setText(String.valueOf(getMWorkout().getMMinBpm()));
        getTvMaxBmpValue().setText(String.valueOf(getMWorkout().getMMaxBpm()));
        if (i72.OXO1.X11() == true) goto L12;
        SportDetailChartFragment.setSportText$default(this, 0, 0, 0, 0, 0, 31, null);
        return;
    L12:
        if (getMWorkout().getMMode() != 7) goto L16;
        SportDetailChartFragment.setSportText$default(this, 0, 0, 0, 0, 0, 31, null);
        return;
    L16:
        if (getTvHeartRateRange() == null) goto L24;
        getTvHeartRateRange().setVisibility(8);
        getLlHeartRateRange().setVisibility(8);
        return;
    }

    private final void showPaceV2(List<Integer> r11) {
        Pair<Long, LinkedHashMap<Long, nr0>> r12 = reviseData(r11, getMWorkout().getMPacePathCount());
        r12.component1().longValue();
        LinkedHashMap<Long, nr0> r13 = r12.component2();
        ArrayList r0 = new ArrayList();
        float r1 = getMChartXStartIndex();
        Iterator<Map.Entry<Long, nr0>> r2 = r13.entrySet().iterator();
        int r5 = 0;
        int r9 = 0;
    L4:
        if (r2.hasNext() == false) goto L19;
        Map.Entry<Long, nr0> r3 = r2.next();
        r3.getKey().longValue();
        nr0 r4 = r3.getValue();
        if (r4.IiI10X() == 0) goto L18;
        if (getUserProfile().getUnit() != 1) goto L10;
        int r6 = (int) (r4.I0IIOi() / 0.6213712f);
    L11:
        int r7 = r6 / r4.IiI10X();
        if (r9 >= r7) goto L14;
        r9 = r7;
    L14:
        if (r5 == 0) goto L16;
        if (r5 > r7) goto L16;
    L17:
        r0.add(new Entry(r1, r7));
    L16:
        r5 = r7;
        goto L17
    L10:
        r6 = r4.I0IIOi();
    L18:
        r1 = r1 + 1.0f;
        goto L4
    L19:
        LineChart r8 = getPaceLineChart();
        Intrinsics.O10IXXX0X(r8, "<get-paceLineChart>(...)");
        configChartV2(r8, r5, r9 + 10, r13.size());
        LineChart r14 = getPaceLineChart();
        Intrinsics.O10IXXX0X(r14, "<get-paceLineChart>(...)");
        updateChartData(r14, r0, R.color.pace_color, R.drawable.shape_pace);
        getPaceLineChart().getAxisLeft().Oi(new XO0O10(this));
        TextView r15 = getTvAvgPaceValue();
        if (getMWorkout().getMMaxPace() <= 0) goto L22;
        String r10 = cp5.Ii1iii0(getMWorkout().getMMaxPace(), getUserProfile().getUnit());
    L23:
        r15.setText(r10);
        TextView r16 = getTvMinPaceValue();
        if (getMWorkout().getMMinPace() <= 0) goto L26;
        String r17 = cp5.Ii1iii0(getMWorkout().getMMinPace(), getUserProfile().getUnit());
    L27:
        r16.setText(r17);
        return;
    L26:
        r17 = cp5.Ii1iii0(r5, getUserProfile().getUnit());
        goto L27
    L22:
        r10 = cp5.Ii1iii0(r9, getUserProfile().getUnit());
        goto L23
    }

    private static final void showQCCode$lambda$0(Function1 r1) {
        r1.invoke(Boolean.TRUE);
    }

    private static final void showQCCode$lambda$1(Function1 r1) {
        r1.invoke(Boolean.TRUE);
    }

    private final void showSegmentation() {
        RecyclerView r0 = getMSegmentationRecyclerView();
        r0.setLayoutManager(new LinearLayoutManager(r0.getContext()));
        ArrayList r1 = new ArrayList();
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        r1.add(new iO(r3, r4, r5, r6, 15, null));
        r1.add(new iO("1", "0:10", "0.5", "9"));
        r1.add(new iO("1", "0:10", "0.5", "9"));
        LinearLayout r2 = getMSegmentationDetailsLL();
        if (r1.size() <= 1) goto L5;
        int r7 = 0;
    L6:
        r2.setVisibility(r7);
        Context r8 = r0.getContext();
        Intrinsics.O10IXXX0X(r8, "getContext(...)");
        r0.setAdapter(new SportRecordSegmentationAdapter(r1, r8));
        return;
    L5:
        r7 = 8;
        goto L6
    }

    private final void showSourcesTip() {
        LogUtils.d(new Object[]{"mWorkout.mAGpsType ---> " + getMWorkout().getMAGpsType() + " "});
        View r0 = getMDateSourcesTip();
        if (getMWorkout().getMSource() != 1) goto L5;
    L8:
        int r1 = 0;
    L9:
        r0.setVisibility(r1);
        return;
    L5:
        if (getMWorkout().getMAGpsType() == 0) goto L8;
        r1 = 8;
        goto L9
    }

    private final boolean showSpeedData() {
        if (getMWorkout().getMSource() != 0) goto L5;
        RecordDetailSpeedData r1 = SportRecordDataKt.sportRecordActivityDetailSpeed(this.activityData.getMTimeList(), getMWorkout().getMMode(), getUserProfile().getUnit());
    L6:
        ArrayList<Integer> r2 = r1.getMPaceList();
        int r3 = r2.size();
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
    L7:
        if (r4 >= r3) goto L19;
        Integer r7 = r2.get(r4);
        Intrinsics.O10IXXX0X(r7, "get(...)");
        int r8 = r7.intValue();
        if (r8 <= 30000) goto L11;
        r2.set(r4, Integer.valueOf(this.activityData.getMPace()));
        r8 = this.activityData.getMPace();
    L11:
        if (r4 != 0) goto L13;
        r5 = r8;
        r6 = r5;
    L13:
        if (r5 <= r8) goto L15;
        r5 = r8;
    L15:
        if (r6 >= r8) goto L17;
        r6 = r8;
    L17:
        r4 = r4 + 1;
        goto L7
    L19:
        if (getMWorkout().getMSource() == 1) goto L21;
    L26:
        boolean r9 = false;
    L27:
        float r10 = 0.0f;
        if (r2.size() == 0) goto L30;
    L41:
        ArrayList r11 = new ArrayList();
        int r12 = 1000;
        if (i72.OXO1.I11iXOO() == false) goto L69;
        SportDetailV2Activity r13 = this.sportDetailV2Activity;
        if (r13 == null) goto L48;
        SportDetailViewModel r14 = r13.getMSportViewModel();
        if (r14 == null) goto L48;
        ArrayList<CustomLatLng> r15 = r14.getCustomLatLng();
    L49:
        if (r15 == null) goto L51;
        Integer r16 = Integer.valueOf(r15.size());
    L52:
        LogUtils.i(new Object[]{"locationList " + r16 + " "});
        if (r15 == null) goto L69;
        Iterator r17 = r15.iterator();
        int r18 = 0;
        CustomLatLng r19 = null;
    L56:
        if (r17.hasNext() == false) goto L69;
        Object r110 = r17.next();
        int r111 = r18 + 1;
        if (r18 >= 0) goto L60;
        CollectionsKt__CollectionsKt.XOX0O0();
    L60:
        CustomLatLng r112 = (CustomLatLng) r110;
        if (r19 == null) goto L68;
        int r20 = (int) ((r112.getTime() - r19.getTime()) / ((long) r12));
        LogUtils.i(new Object[]{"locationList " + r18 + " " + r20});
        String r113 = String.valueOf(r18);
        String r114 = cp5.Ii1iii0(r20, getUserProfile().getUnit());
        float r21 = ((float) r20) / ((float) r6);
        if (r9 == false) goto L65;
        String r22 = cp5.Ii1iii0(r20, getUserProfile().getUnit());
    L66:
        r11.add(new XIi00iiXO(r113, r114, r21, r22));
        goto L68
    L65:
        r22 = cp5.iXiiiO(r20);
    L68:
        r19 = r112;
        r18 = r111;
        r10 = r10;
        r17 = r17;
        r12 = 1000;
        goto L56
    L51:
        r16 = null;
    L48:
        r15 = null;
    L69:
        float r115 = r10;
        float r23 = cp5.X1ii(getMWorkout().getMDistance(), getUserProfile().getUnit(), false, 4, null);
        if ((cp5.X1ii(1000, getUserProfile().getUnit(), false, 4, null) - r23) <= r115) goto L72;
    L76:
        r11.add(new XIi00iiXO("", cp5.Ii1iii0(getMWorkout().getMPace(), getUserProfile().getUnit()), r115, ""));
    L77:
        LogUtils.i(new Object[]{"tmpPaceList " + r11.size() + "  " + getMWorkout().getMDistance()});
        TextView r24 = getMSpeedRecyclerTitle();
        if (getUserProfile().getUnit() != 1) goto L80;
        String r25 = getString(R.string.speed_per_mile);
    L81:
        r24.setText(r25);
        TextView r26 = getMSpeedPanelUnit();
        if (getUserProfile().getUnit() != 1) goto L84;
        String r27 = getString(R.string.min_unit);
    L85:
        r26.setText(r27);
        getMSpeedRecyclerUnit().setText(getString(cp5.XX0(getUserProfile().getUnit())));
        getMPacePanelUnit().setText(getString(cp5.XX0(getUserProfile().getUnit())));
        RecyclerView r28 = getMSpeedRecyclerView();
        r28.setLayoutManager(new LinearLayoutManager(r28.getContext()));
        Context r29 = r28.getContext();
        Intrinsics.O10IXXX0X(r29, "getContext(...)");
        r28.setAdapter(new SportRecordDetailSpeedV2Adapter(r11, r29));
        return !r11.isEmpty();
    L84:
        r27 = getString(R.string.speed_unit);
        goto L85
    L80:
        r25 = getString(R.string.speed_per_kilometer);
        goto L81
    L72:
        if ((r23 % 1000.0f) == r115) goto L77;
        if (r11.isEmpty() == true) goto L77;
    L30:
        if (this.activityData.getMDistanceTotal() <= 0.0f) goto L40;
        r6 = this.activityData.getMPace() * 2;
        int r30 = (int) this.activityData.getMDistanceTotal();
        if (r30 < 0) goto L41;
        int r31 = 0;
        int r32 = 0;
    L35:
        if (r31 >= this.activityData.getMPace()) goto L37;
        r31 = this.activityData.getMPace();
    L37:
        r2.add(Integer.valueOf(this.activityData.getMPace()));
        if (r32 == r30) goto L41;
        r32 = r32 + 1;
        goto L35
    L40:
        r2.add(Integer.valueOf(this.activityData.getMPace()));
        goto L41
    L21:
        if (this.activityData.getMPace() <= 0) goto L26;
        if (r5 != 0) goto L26;
        if (r2.size() != 0) goto L26;
        r9 = true;
        goto L27
    L5:
        locationList();
        r1 = SportRecordDataKt.sportRecordWorkoutDetailSpeed(this.activityData.getMTimeList(), getMWorkout().getMMode(), getUserProfile().getUnit(), this.locationSmoothAlgorithm);
        goto L6
    }

    private final void showSpeedV2(List<Integer> r15) {
        Pair<Long, LinkedHashMap<Long, nr0>> r1 = reviseData(r15, getMWorkout().getMSpeedPathCount());
        r1.component1().longValue();
        LinkedHashMap<Long, nr0> r2 = r1.component2();
        ArrayList r6 = new ArrayList();
        float r3 = getMChartXStartIndex();
        Iterator<Map.Entry<Long, nr0>> r4 = r2.entrySet().iterator();
        int r5 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
    L4:
        if (r4.hasNext() == false) goto L19;
        nr0 r10 = r4.next().getValue();
        if (r10.IiI10X() == 0) goto L18;
        if (getUserProfile().getUnit() != 1) goto L10;
        int r11 = (int) (r10.I0IIOi() / 0.6213712f);
    L11:
        int r12 = (r11 / 1000) / r10.IiI10X();
        r6.add(new Entry(r3, r12));
        if (r8 >= r12) goto L14;
        r8 = r12;
    L14:
        if (r7 == 0) goto L16;
        if (r7 > r12) goto L16;
    L17:
        r9 = r9 + r12;
    L16:
        r7 = r12;
        goto L17
    L10:
        r11 = r10.I0IIOi();
    L18:
        r3 = r3 + 1.0f;
        goto L4
    L19:
        LineChart r13 = getSpeedLineChart();
        Intrinsics.O10IXXX0X(r13, "<get-speedLineChart>(...)");
        if (r7 == 0) goto L23;
        r5 = r7 - 1;
    L23:
        configChartV2(r13, r5, r8 + 5, r2.size());
        LineChart r14 = getSpeedLineChart();
        Intrinsics.O10IXXX0X(r14, "<get-speedLineChart>(...)");
        updateChartData(r14, r6, R.color.speed_color, R.drawable.shape_speed);
        getTvAvgSpeedValue().setText(String.valueOf(cp5.i11I(r7, getUserProfile().getUnit())));
        getTvFastSpeedValue().setText(String.valueOf(cp5.i11I(((double) getMWorkout().getMMaxSpeed()) / ((double) 1000), getUserProfile().getUnit())));
        LogUtils.i(new Object[]{getTAG() + " mMaxSpeed" + getMWorkout().getMMaxSpeed() + " minSpeed" + r7 + "  maxSpeed" + r8 + " avgSpeed" + r9});
    }

    private final void showSpmV2(List<Integer> r13) {
        Pair<Long, LinkedHashMap<Long, nr0>> r14 = reviseData(r13, getMWorkout().getMCadencePathCount());
        r14.component1().longValue();
        LinkedHashMap<Long, nr0> r15 = r14.component2();
        ArrayList r0 = new ArrayList();
        float r1 = getMChartXStartIndex();
        Iterator<Map.Entry<Long, nr0>> r2 = r15.entrySet().iterator();
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
    L4:
        if (r2.hasNext() == false) goto L14;
        nr0 r6 = r2.next().getValue();
        if (r6.IiI10X() == 0) goto L13;
        int r7 = r6.I0IIOi() / r6.IiI10X();
        r0.add(new Entry(r1, r7));
        if (r5 >= r7) goto L10;
        r5 = r7;
    L10:
        if (r4 == 0) goto L12;
        if (r4 <= r7) goto L13;
    L12:
        r4 = r7;
    L13:
        r1 = r1 + 1.0f;
        goto L4
    L14:
        LineChart r8 = getSpmLineChart();
        Intrinsics.O10IXXX0X(r8, "<get-spmLineChart>(...)");
        if (r4 <= 10) goto L17;
        r3 = r4 - 10;
    L17:
        configChartV2(r8, r3, r5 + 10, r15.size());
        LineChart r16 = getSpmLineChart();
        Intrinsics.O10IXXX0X(r16, "<get-spmLineChart>(...)");
        updateChartData(r16, r0, R.color.spm_color, R.drawable.shape_spm);
        if (getMWorkout().getMMode() != 52) goto L21;
        getTvAvgSpmValue().setText(String.valueOf(getMWorkout().getMCadence()));
        getTvMaxSpmValue().setText(String.valueOf(getMWorkout().getMMaxCadence()));
        return;
    L21:
        getTvAvgSpmValue().setText(String.valueOf(getMWorkout().getMSpm()));
        getTvMaxSpmValue().setText(String.valueOf(getMWorkout().getMMaxCadence()));
    }

    private final void trainingExperienceSelect() {
        if (getMWorkout().getMFeel() <= 0) goto L6;
        setTrainingExperience(getMWorkout().getMFeel());
        return;
    L6:
        getMTrainingExperienceSelect().setVisibility(0);
        getMTrainingExperienceResult().setVisibility(8);
        getMTrainingExperienceSelect1().setOnClickListener(new wx4(this));
        getMTrainingExperienceSelect2().setOnClickListener(new xx4(this));
        getMTrainingExperienceSelect3().setOnClickListener(new zx4(this));
        getMTrainingExperienceSelect4().setOnClickListener(new ay4(this));
        getMTrainingExperienceSelect5().setOnClickListener(new by4(this));
    }

    private static final void trainingExperienceSelect$lambda$0(SportDetailV2ChartFragment r0, View r1) {
        r0.trainingSelectListener(1);
    }

    private static final void trainingExperienceSelect$lambda$1(SportDetailV2ChartFragment r0, View r1) {
        r0.trainingSelectListener(2);
    }

    private static final void trainingExperienceSelect$lambda$2(SportDetailV2ChartFragment r0, View r1) {
        r0.trainingSelectListener(3);
    }

    private static final void trainingExperienceSelect$lambda$3(SportDetailV2ChartFragment r0, View r1) {
        r0.trainingSelectListener(4);
    }

    private static final void trainingExperienceSelect$lambda$4(SportDetailV2ChartFragment r0, View r1) {
        r0.trainingSelectListener(5);
    }

    private final void trainingSelectListener(int r2) {
        setTrainingExperience(r2);
        I01XX0.OXO1(I01XX0.XXiO0i, Integer.valueOf(r2));
    }

    @aa1
    public final Bitmap getBitmap() {
        XIi1i01O r0 = XIi1i01O.OXO1;
        NestedScrollView r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        Bitmap r2 = r0.iO(r1);
        getMDeviceQRCodeLayout().setVisibility(8);
        getMTrainingExperience().setVisibility(0);
        showSourcesTip();
        return r2;
    }

    @aa1
    public final List<Integer> getColorsList() {
        return this.colorsList;
    }

    public final int getTrainingExperienceImage(@aa1 Context r4, int r5) {
        Intrinsics.X0O(r4, "mContext");
        return r4.getResources().getIdentifier("icon_training_experience_" + r5, "drawable", r4.getPackageName());
    L5:
        e = move-exception;
        e.printStackTrace();
        return R.drawable.icon_training_experience_1;
    }

    public final int getTrainingExperienceName(@aa1 Context r4, int r5) {
        Intrinsics.X0O(r4, "mContext");
        return r4.getResources().getIdentifier("training_experience_" + r5, TypedValues.Custom.S_STRING, r4.getPackageName());
    L5:
        e = move-exception;
        e.printStackTrace();
        return R.string.training_experience_1;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailChartFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getSportDetailActivity();
        int r0 = getMWorkout().getMMode();
        if (r0 != 12) goto L5;
    L11:
        this.threshold = 5;
        this.thresholdMax = 100;
    L12:
        boolean r1 = showSpeedData();
        trainingExperienceSelect();
        setDeviceSource();
        int r2 = 8;
        boolean r4 = true;
        if (getMWorkout().getMType() != 1) goto L19;
        RelativeLayout r3 = getMTrainingPerformance();
        if (hu4.OXO1.XX0(getMWorkout().getMMode()) == false) goto L17;
        setTrainingPerformance();
        int r5 = 0;
    L18:
        r3.setVisibility(r5);
        getMAteLevel().post(new fy4(this));
        goto L19
    L17:
        r5 = 8;
    L19:
        getMCadenceUnderstandSituation().setOnClickListener(new gy4(this));
        if (getMWorkout().getMMode() != 52) goto L22;
        getMCadenceTitle().setText(getString(R.string.stroke_rate));
        getMCadenceTitleUnit().setText(getString(R.string.times_key) + "/" + getString(R.string.minute));
        getMCadenceAvgTitle().setText(getString(R.string.avg_stroke_rate));
        getMCadenceMaxTitle().setText(getString(R.string.max_stroke_rate));
    L22:
        i72 r6 = i72.OXO1;
        if (r6.X0O().length() <= 0) goto L25;
        getMDeviceQRCode().setImageBitmap(new OiOiI0IX1().O00(r6.X0O(), 350, ViewCompat.MEASURED_STATE_MASK, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher)));
    L25:
        getMDeviceQRCodeLayout().setVisibility(8);
        hu4 r7 = hu4.OXO1;
        if (r7.OiIIX101O(getMWorkout().getMPlatform()) == true) goto L28;
        q62 r8 = q62.OXO1;
        if (r8.Oi000O010(getMWorkout().getMMode(), !isLocationEmpty()) == true) goto L43;
    L49:
        getMSpeedPerKilometer().setVisibility(8);
        return;
    L43:
        if (r8.XIXO0iiO(getMWorkout().getMMode()) == false) goto L49;
        if (getMWorkout().getMType() == 1) goto L49;
        if (r1 == false) goto L49;
        getMSpeedPerKilometer().setVisibility(0);
        return;
    L28:
        if (r7.XIi00iiXO(getMWorkout().getMMode()) == false) goto L31;
    L34:
        LinearLayout r9 = getMSpeedPerKilometer();
        if (r4 == false) goto L38;
        if (r1 == false) goto L38;
        r2 = 0;
    L38:
        r9.setVisibility(r2);
        return;
    L31:
        if (getMWorkout().getMType() != 1) goto L33;
        r4 = r7.X0O(getMWorkout().getMMode());
        goto L34
    L33:
        r4 = false;
        goto L34
    L5:
        if (r0 == 13) goto L11;
        if (r0 == 19) goto L11;
        switch(r0) {
            case 7: goto L11;
            case 8: goto L11;
            case 9: goto L11;
            case 10: goto L10;
            default: goto L12;
        };
    L10:
        this.threshold = 10;
        this.thresholdMax = 100;
        goto L12
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailChartFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_chart_v2;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailChartFragment
    public void newDrawChart() {
        super.newDrawChart();
        if (o65.OXO1.O00(getMWorkout()) == false) goto L5;
    L8:
        showHrV2(new ArrayList());
        View r0 = getHrPanel();
        if (r0 == null) goto L11;
        r0.setVisibility(8);
    L11:
        getPressurePanel().setVisibility(8);
        hu4 r1 = hu4.OXO1;
        if (r1.iIiiO(getMWorkout().getMMode()) == false) goto L14;
        showSpmV2(getMWorkout().getMCadencePathPoints());
    L16:
        if (r1.X0O(getMWorkout().getMMode()) == false) goto L18;
        showPaceV2(getMWorkout().getMPacePathPoints());
    L20:
        if (r1.I1XOi1(getMWorkout().getMMode()) == false) goto L22;
        showSpeedV2(getMWorkout().getMSpeedPathPoints());
    L23:
        LogUtils.i(new Object[]{"GoMore" + r1.XXI(getMWorkout().getMMode())});
        if (q62.OXO1.XI1OX0IO() == false) goto L26;
        getAltitudePanel().setVisibility(8);
        return;
    L26:
        if (r1.XXI(getMWorkout().getMMode()) == false) goto L29;
        showAltitudeV2(getMWorkout().getMAltitudePathPoints());
        return;
    L29:
        getAltitudePanel().setVisibility(8);
        return;
    L22:
        getSpeedPanel().setVisibility(8);
        goto L23
    L18:
        getPacePanel().setVisibility(8);
        goto L20
    L14:
        getSpmPanel().setVisibility(8);
        goto L16
    L5:
        if (q62.OXO1.OiXI1OiX0() == true) goto L8;
        showHrV2(getMWorkout().getMHrPathPoints());
        goto L11
    }

    @sf5(tag = I01XX0.XXX11i)
    public final void onPairImageChange(@aa1 Object r5) {
        Intrinsics.X0O(r5, "data");
        File r6 = uz0.X1(sz0.OXO1, getMWorkout().getMBleName(), getMWorkout().getMFirmwareFlag());
        LogUtils.d(new Object[]{"onPairImageChange " + com.blankj.utilcode.util.FileUtils.isFileExists(r6) + "  " + this.isWorkImage + " "});
        if (com.blankj.utilcode.util.FileUtils.isFileExists(r6) == true) goto L5;
        return;
    L5:
        if (this.isWorkImage == false) goto L9;
        getMDeviceImg().setImageBitmap(ImageUtils.getBitmap(r6));
        this.isWorkImage = false;
        return;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailChartFragment
    public void setSportText(long r17, long r19, long r21, long r23, long r25) {
        ArrayList<MyPieChart.OXO1> r1 = new ArrayList();
        if (getMWorkout().getMType() == 1) goto L5;
        getHrPieChart().setVisibility(8);
        long r8 = 1000;
        getTvSportStrenuous().setText(O0X11OiO.OX110i((int) (r17 / r8)));
        getTvSportAnaerobic().setText(O0X11OiO.OX110i((int) (r19 / r8)));
        getTvSportAerobic().setText(O0X11OiO.OX110i((int) (r21 / r8)));
        getTvSportFatBurning().setText(O0X11OiO.OX110i((int) (r23 / r8)));
        getTvSportWarmUp().setText(O0X11OiO.OX110i((int) (r25 / r8)));
        addMyPieChart(Long.valueOf(r25), R.color.hr_scope_color_5, r1);
        addMyPieChart(Long.valueOf(r23), R.color.hr_scope_color_4, r1);
        addMyPieChart(Long.valueOf(r21), R.color.hr_scope_color_3, r1);
        addMyPieChart(Long.valueOf(r19), R.color.hr_scope_color_2, r1);
        addMyPieChart(Long.valueOf(r17), R.color.hr_scope_color_1, r1);
    L49:
        getMPieChart().OXO1(r1);
        LogUtils.i(new Object[]{"addMyPieChart " + r1.size() + " //" + getMWorkout().getMType() + " "});
        int[] r2 = getMWorkout().getMBpmZoneCount();
        StringBuilder r3 = new StringBuilder();
        r3.append("mBpmZoneCount ");
        r3.append(r2);
        r3.append(" ");
        LogUtils.i(new Object[]{r3.toString()});
        return;
    L5:
        if (getMWorkout().getMBpmZoneCount() == null) goto L49;
        int[] r4 = getMWorkout().getMBpmZoneCount();
        Intrinsics.XXI(r4);
        if (r4.length < 5) goto L49;
        getHrPieChart().setVisibility(8);
        DINCondBold r5 = getTvSportStrenuous();
        int[] r9 = getMWorkout().getMBpmZoneCount();
        Long r11 = null;
        if (r9 == null) goto L11;
        String r10 = O0X11OiO.OX110i(r9[4]);
    L12:
        r5.setText(r10);
        DINCondBold r6 = getTvSportAnaerobic();
        int[] r12 = getMWorkout().getMBpmZoneCount();
        if (r12 == null) goto L15;
        String r13 = O0X11OiO.OX110i(r12[3]);
    L16:
        r6.setText(r13);
        DINCondBold r7 = getTvSportAerobic();
        int[] r14 = getMWorkout().getMBpmZoneCount();
        if (r14 == null) goto L19;
        String r15 = O0X11OiO.OX110i(r14[2]);
    L20:
        r7.setText(r15);
        DINCondBold r16 = getTvSportFatBurning();
        int[] r18 = getMWorkout().getMBpmZoneCount();
        if (r18 == null) goto L23;
        String r20 = O0X11OiO.OX110i(r18[1]);
    L24:
        r16.setText(r20);
        DINCondBold r22 = getTvSportWarmUp();
        int[] r24 = getMWorkout().getMBpmZoneCount();
        if (r24 == null) goto L27;
        String r26 = O0X11OiO.OX110i(r24[0]);
    L28:
        r22.setText(r26);
        int[] r27 = getMWorkout().getMBpmZoneCount();
        if (r27 == null) goto L31;
        Long r28 = Long.valueOf(r27[4]);
    L32:
        addMyPieChart(r28, R.color.hr_scope_color_5, r1);
        int[] r29 = getMWorkout().getMBpmZoneCount();
        if (r29 == null) goto L35;
        Long r30 = Long.valueOf(r29[3]);
    L36:
        addMyPieChart(r30, R.color.hr_scope_color_4, r1);
        int[] r31 = getMWorkout().getMBpmZoneCount();
        if (r31 == null) goto L39;
        Long r32 = Long.valueOf(r31[2]);
    L40:
        addMyPieChart(r32, R.color.hr_scope_color_3, r1);
        int[] r33 = getMWorkout().getMBpmZoneCount();
        if (r33 == null) goto L43;
        Long r34 = Long.valueOf(r33[1]);
    L44:
        addMyPieChart(r34, R.color.hr_scope_color_2, r1);
        int[] r35 = getMWorkout().getMBpmZoneCount();
        if (r35 == null) goto L47;
        r11 = Long.valueOf(r35[0]);
    L47:
        addMyPieChart(r11, R.color.hr_scope_color_1, r1);
        goto L49
    L43:
        r34 = null;
        goto L44
    L39:
        r32 = null;
        goto L40
    L35:
        r30 = null;
        goto L36
    L31:
        r28 = null;
        goto L32
    L27:
        r26 = null;
        goto L28
    L23:
        r20 = null;
        goto L24
    L19:
        r15 = null;
        goto L20
    L15:
        r13 = null;
        goto L16
    L11:
        r10 = null;
        goto L12
    }

    public final void setTrainingPerformance() {
        trainingPerformanceVisibility(8);
        hu4 r1 = hu4.OXO1;
        if (r1.XOO0ii0(getMWorkout().getMMode()) == false) goto L6;
        getMSportMaxV02().setVisibility(0);
    L9:
        String r2 = getString(R.string.vo2max_key);
        if (getMWorkout().getMMaxVO2() != 0) goto L12;
        String r3 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L13:
        String r4 = r2 + ": " + r3 + getString(R.string.vo2_unit);
        PFMedium r5 = getMSportMaxV02();
        SpannableStringBuilder r6 = new SpannableStringBuilder(r4);
        r6.setSpan(new ForegroundColorSpan(ViewCompat.MEASURED_STATE_MASK), getString(R.string.vo2max_key).length() + 1, r4.length(), 33);
        r5.setText(r6);
        Pair<Integer, String> r7 = getV02Level(getMWorkout().getMMaxVO2() / 10);
        String r8 = getString(R.string.vo2max_level) + ": " + r7.getSecond();
        PFMedium r9 = getMSportMaxV02Level();
        SpannableStringBuilder r10 = new SpannableStringBuilder(r8);
        r10.setSpan(new ForegroundColorSpan(getMActivity().getResources().getColor(this.colorsList.get(5 - r7.getFirst().intValue()).intValue())), getString(R.string.vo2max_level).length() + 1, r8.length(), 33);
        r9.setText(r10);
        getMSportTrainingLoad().setText(getString(R.string.training_performance_training_load, new Object[]{Integer.valueOf(getMWorkout().getMTrainingLoad())}));
        getMSportGoalProgressBar().iO(getMWorkout().getMAerobic(), 6.0f);
        getMSportGoalProgressBar().XO0O10(getMWorkout().getMAnaerobic(), 6.0f);
        ateList(r7.getFirst().intValue());
        if (((o65.OXO1.OIX0iXi(getMWorkout().getMEnd()) + ((long) (getMWorkout().getMRecoveryTime() * 1000))) - System.currentTimeMillis()) <= 0) goto L16;
        Pair<Integer, Integer> r0 = O0X11OiO.iIXi1iiXI(getMWorkout().getMRecoveryTime() * 1000);
        String r11 = getString(R.string.recovery_time) + ": " + r0.getFirst() + O0X11OiO.iOO1ii1 + r0.getSecond() + "M";
        PFMedium r12 = getMSportRecoveryTime();
        SpannableStringBuilder r13 = new SpannableStringBuilder(r11);
        r13.setSpan(new ForegroundColorSpan(ViewCompat.MEASURED_STATE_MASK), getString(R.string.recovery_time).length() + 1, r11.length(), 33);
        r12.setText(r13);
        getMSportRecoveryTimeEstimate().setText(getString(R.string.training_performance_recovery_time_detail, new Object[]{getTodayTime(getMWorkout().getMRecoveryTime())}));
    L17:
        getMView().findViewById(R.id.tv_training_performance_explanation).setOnClickListener(new ey4(this));
        return;
    L16:
        getMSportRecoveryTime().setVisibility(8);
        getMSportRecoveryTimeEstimate().setText(getString(R.string.fully_recovered_tip));
        goto L17
    L12:
        r3 = String.valueOf(getMWorkout().getMMaxVO2() / 10);
        goto L13
    L6:
        if (r1.I0IIOi(getMWorkout().getMMode()) == false) goto L8;
        getMSportRecoveryTime().setVisibility(0);
        getMSportRecoveryTimeEstimate().setVisibility(0);
        goto L9
    L8:
        trainingPerformanceVisibility(0);
        goto L9
    }

    public final void showQCCode(@aa1 final Function1<? super Boolean, Unit> r4) {
        Intrinsics.X0O(r4, "post");
        if (getMWorkout().getMFeel() != 0) goto L6;
        getMTrainingExperience().setVisibility(8);
    L6:
        if (getMWorkout().getMSource() != 1) goto L9;
        getMDateSourcesTip().setVisibility(8);
    L9:
        if (i72.OXO1.X0O().length() <= 0) goto L13;
        getMDeviceQRCodeLayout().setVisibility(0);
        getMDeviceQRCodeLayout().post(new cy4(r4));
        return;
    L13:
        if (getMWorkout().getMFeel() != 0) goto L16;
        getMTrainingExperience().post(new dy4(r4));
        return;
    L16:
        r4.invoke(Boolean.TRUE);
    }

    public final void trainingPerformanceVisibility(int r2) {
        getMAteLevel().setVisibility(r2);
        getMSportMaxV02().setVisibility(r2);
        getMSportMaxV02Level().setVisibility(r2);
        getMSportTrainingLoad().setVisibility(r2);
        getMSportGoalProgressBar().setVisibility(r2);
        getMSportRecoveryTime().setVisibility(r2);
        getMSportRecoveryTimeEstimate().setVisibility(r2);
    }
}
