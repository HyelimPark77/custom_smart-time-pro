package com.sma.smartv3.p610ui.sport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import com.android.mltcode.paycertificationapi.C2229at;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OiOiI0IX1;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.hu4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.mc0;
import com.android.mltcode.paycertificationapi.nr0;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
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
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.model.RecordActivityData;
import com.sma.smartv3.model.RecordDetailSpeedData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.p610ui.sport.SportDetailV2ChartFragment;
import com.sma.smartv3.p610ui.sport.course.model.SportDetailViewModel;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailV2ChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1530:1\n1878#2,3:1531\n1878#2,3:1534\n99#3,7:1537\n106#3,3:1545\n79#3,7:1548\n109#3:1555\n99#3,7:1556\n106#3,3:1564\n79#3,7:1567\n109#3:1574\n1#4:1544\n1#4:1563\n*S KotlinDebug\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment\n*L\n631#1:1531,3\n1458#1:1534,3\n300#1:1537,7\n300#1:1545,3\n300#1:1548,7\n300#1:1555\n1022#1:1556,7\n1022#1:1564,3\n1022#1:1567,7\n1022#1:1574\n300#1:1544\n1022#1:1563\n*E\n"})
public final class SportDetailV2ChartFragment extends SportDetailChartFragment {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int ONE_KM = 1000;

    @aa1
    private final List<Integer> colorsList;
    private boolean isInChinaMainland;
    private boolean isWorkImage;

    @tb1
    private SportDetailV2Activity sportDetailV2Activity;

    @aa1
    private final Lazy mTrainingPerformance$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingPerformance_delegate$lambda$0(this.f10916IO);
        }
    });

    @aa1
    private final Lazy mAteLevel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mAteLevel_delegate$lambda$0(this.f11375IO);
        }
    });

    @aa1
    private final Lazy mSportMaxV02$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSportMaxV02_delegate$lambda$0(this.f6757IO);
        }
    });

    @aa1
    private final Lazy mSportMaxV02Level$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.px4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSportMaxV02Level_delegate$lambda$0(this.f10455IO);
        }
    });

    @aa1
    private final Lazy mSportTrainingLoad$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSportTrainingLoad_delegate$lambda$0(this.f10701IO);
        }
    });

    @aa1
    private final Lazy mSportGoalProgressBar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSportGoalProgressBar_delegate$lambda$0(this.f10924IO);
        }
    });

    @aa1
    private final Lazy mSportRecoveryTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSportRecoveryTime_delegate$lambda$0(this.f11153IO);
        }
    });

    @aa1
    private final Lazy mSportRecoveryTimeEstimate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSportRecoveryTimeEstimate_delegate$lambda$0(this.f11383IO);
        }
    });

    @aa1
    private final Lazy mPieChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ux4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mPieChart_delegate$lambda$0(this.f11593IO);
        }
    });

    @aa1
    private final Lazy mSpeedPerKilometer$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSpeedPerKilometer_delegate$lambda$0(this.f11835IO);
        }
    });

    @aa1
    private final Lazy mSpeedRecyclerTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSpeedRecyclerTitle_delegate$lambda$0(this.f6075IO);
        }
    });

    @aa1
    private final Lazy mSpeedRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSpeedRecyclerView_delegate$lambda$0(this.f10032IO);
        }
    });

    @aa1
    private ArrayList<CustomLatLng> locationSmoothAlgorithm = new ArrayList<>();

    @aa1
    private RecordActivityData activityData = new RecordActivityData();

    @aa1
    private final Lazy mSpeedRecyclerUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSpeedRecyclerUnit_delegate$lambda$0(this.f12479IO);
        }
    });

    @aa1
    private final Lazy mPacePanelUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mPacePanelUnit_delegate$lambda$0(this.f7239IO);
        }
    });

    @aa1
    private final Lazy mSpeedPanelUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSpeedPanelUnit_delegate$lambda$0(this.f8795IO);
        }
    });

    @aa1
    private final Lazy mCadenceTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jy4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mCadenceTitle_delegate$lambda$0(this.f9070IO);
        }
    });

    @aa1
    private final Lazy mCadenceTitleUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ky4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mCadenceTitleUnit_delegate$lambda$0(this.f9308IO);
        }
    });

    @aa1
    private final Lazy mCadenceAvgTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ly4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mCadenceAvgTitle_delegate$lambda$0(this.f9565IO);
        }
    });

    @aa1
    private final Lazy mCadenceMaxTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.my4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mCadenceMaxTitle_delegate$lambda$0(this.f9812IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperience$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingExperience_delegate$lambda$0(this.f11145IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingExperienceSelect_delegate$lambda$0(this.f11586IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingExperienceSelect1_delegate$lambda$0(this.f11826IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ww4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingExperienceSelect2_delegate$lambda$0(this.f12051IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingExperienceSelect3_delegate$lambda$0(this.f12250IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect4$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingExperienceSelect4_delegate$lambda$0(this.f12469IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceSelect5$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zw4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingExperienceSelect5_delegate$lambda$0(this.f12706IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceResult$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ax4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingExperienceResult_delegate$lambda$0(this.f5602IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceResultImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingExperienceResultImg_delegate$lambda$0(this.f5843IO);
        }
    });

    @aa1
    private final Lazy mTrainingExperienceResultTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mTrainingExperienceResultTv_delegate$lambda$0(this.f6291IO);
        }
    });

    @aa1
    private final Lazy mDateSourcesTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ex4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mDateSourcesTip_delegate$lambda$0(this.f6511IO);
        }
    });

    @aa1
    private final Lazy mDeviceSources$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mDeviceSources_delegate$lambda$0(this.f6988IO);
        }
    });

    @aa1
    private final Lazy mDeviceImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mDeviceImg_delegate$lambda$0(this.f7232IO);
        }
    });

    @aa1
    private final Lazy mDeviceName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ix4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mDeviceName_delegate$lambda$0(this.f8786IO);
        }
    });

    @aa1
    private final Lazy mDeviceQRCode$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mDeviceQRCode_delegate$lambda$0(this.f9062IO);
        }
    });

    @aa1
    private final Lazy mDeviceQRCodeLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mDeviceQRCodeLayout_delegate$lambda$0(this.f9304IO);
        }
    });

    @aa1
    private final Lazy mSegmentationDetailsLL$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSegmentationDetailsLL_delegate$lambda$0(this.f9560IO);
        }
    });

    @aa1
    private final Lazy mSegmentationRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mx4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mSegmentationRecyclerView_delegate$lambda$0(this.f9805IO);
        }
    });
    private int threshold = 5;
    private int thresholdMax = 11;

    @aa1
    private final Lazy mCadenceUnderstandSituation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ox4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailV2ChartFragment.mCadenceUnderstandSituation_delegate$lambda$0(this.f10243IO);
        }
    });

    @SourceDebugExtension({"SMAP\nSportDetailV2ChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$Companion\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1530:1\n19#2:1531\n15#2:1532\n*S KotlinDebug\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$Companion\n*L\n107#1:1531\n107#1:1532\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final String OXO1() {
            SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
            Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
            if (objFromJson != null) {
                appUser = objFromJson;
            }
            return ((AppUser) appUser).getUnit() == 1 ? UtilsKt.XXO(R.string.less_than_mile) : UtilsKt.XXO(R.string.less_than_kilometer);
        }

        public OXO1() {
        }
    }

    public static final class SportRecordDetailSpeedV2Adapter extends RecyclerView.Adapter<SportRecordDetailSpeedV2ViewHolder> {

        @aa1
        private final Context context;

        @aa1
        private final ArrayList<XIi00iiXO> items;

        public SportRecordDetailSpeedV2Adapter(@aa1 ArrayList<XIi00iiXO> items, @aa1 Context context) {
            Intrinsics.X0O(items, "items");
            Intrinsics.X0O(context, "context");
            this.items = items;
            this.context = context;
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
        @SuppressLint({"SetTextI18n"})
        public void onBindViewHolder(@aa1 SportRecordDetailSpeedV2ViewHolder holder, int i) {
            Intrinsics.X0O(holder, "holder");
            XIi00iiXO xIi00iiXO = this.items.get(i);
            Intrinsics.O10IXXX0X(xIi00iiXO, "get(...)");
            XIi00iiXO xIi00iiXO2 = xIi00iiXO;
            holder.getNumber().setText(xIi00iiXO2.OXO1());
            DINCondBold tvPace = holder.getTvPace();
            int i2 = 8;
            if (xIi00iiXO2.m38630iO() > 0.0f) {
                holder.getPb().m38900iO(xIi00iiXO2.m38630iO(), xIi00iiXO2.XO0O10(), i);
                holder.getNumber().setVisibility(0);
            } else {
                holder.getTvPace().setText(SportDetailV2ChartFragment.Companion.OXO1() + "  " + xIi00iiXO2.XO0O10());
                holder.getNumber().setVisibility(8);
                i2 = 0;
            }
            tvPace.setVisibility(i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @aa1
        public SportRecordDetailSpeedV2ViewHolder onCreateViewHolder(@aa1 ViewGroup parent, int i) {
            Intrinsics.X0O(parent, "parent");
            View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.item_sport_record_detail_pace_content_v2, parent, false);
            Intrinsics.O10IXXX0X(viewInflate, "inflate(...)");
            return new SportRecordDetailSpeedV2ViewHolder(viewInflate);
        }
    }

    public static final class SportRecordDetailSpeedV2ViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final DINCondBold number;

        /* JADX INFO: renamed from: pb */
        @aa1
        private final PaceProgressBarV2 f54769pb;

        @aa1
        private final DINCondBold tvPace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportRecordDetailSpeedV2ViewHolder(@aa1 View view) {
            super(view);
            Intrinsics.X0O(view, "view");
            View viewFindViewById = view.findViewById(R.id.number);
            Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
            this.number = (DINCondBold) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.f51421pb);
            Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
            this.f54769pb = (PaceProgressBarV2) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tvPace);
            Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
            this.tvPace = (DINCondBold) viewFindViewById3;
        }

        @aa1
        public final DINCondBold getNumber() {
            return this.number;
        }

        @aa1
        public final PaceProgressBarV2 getPb() {
            return this.f54769pb;
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
        private final ArrayList<C18962iO> items;

        public SportRecordSegmentationAdapter(@aa1 ArrayList<C18962iO> items, @aa1 Context context) {
            Intrinsics.X0O(items, "items");
            Intrinsics.X0O(context, "context");
            this.items = items;
            this.context = context;
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
        public void onBindViewHolder(@aa1 SportRecordSegmentationViewHolder holder, int i) {
            Intrinsics.X0O(holder, "holder");
            C18962iO c18962iO = this.items.get(i);
            Intrinsics.O10IXXX0X(c18962iO, "get(...)");
            C18962iO c18962iO2 = c18962iO;
            if (c18962iO2.m38631iO().length() <= 0 || c18962iO2.XIi00iiXO().length() <= 0) {
                return;
            }
            holder.getNumber().setText(c18962iO2.XO0O10());
            holder.getDuration().setText(c18962iO2.m38631iO());
            holder.getDistance().setText(c18962iO2.XIi00iiXO());
            holder.getAvgPace().setText(c18962iO2.OXO1());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @aa1
        public SportRecordSegmentationViewHolder onCreateViewHolder(@aa1 ViewGroup parent, int i) {
            Intrinsics.X0O(parent, "parent");
            View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.item_sport_record_segmentation, parent, false);
            Intrinsics.O10IXXX0X(viewInflate, "inflate(...)");
            return new SportRecordSegmentationViewHolder(viewInflate);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportRecordSegmentationViewHolder(@aa1 View view) {
            super(view);
            Intrinsics.X0O(view, "view");
            View viewFindViewById = view.findViewById(R.id.segmentation_item_number);
            Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
            this.number = (DINCondBold) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.segmentation_item_duration);
            Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
            this.duration = (DINCondBold) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.segmentation_item_distance);
            Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
            this.distance = (DINCondBold) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.segmentation_item_avgPace);
            Intrinsics.O10IXXX0X(viewFindViewById4, "findViewById(...)");
            this.avgPace = (DINCondBold) viewFindViewById4;
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

        /* JADX INFO: renamed from: iO */
        public float f54770iO;

        public XIi00iiXO(@aa1 String number, @aa1 String tmpPace, float f, @aa1 String pace) {
            Intrinsics.X0O(number, "number");
            Intrinsics.X0O(tmpPace, "tmpPace");
            Intrinsics.X0O(pace, "pace");
            this.OXO1 = number;
            this.XIi00iiXO = tmpPace;
            this.f54770iO = f;
            this.XO0O10 = pace;
        }

        public final void IiI10X(float f) {
            this.f54770iO = f;
        }

        public final void O00(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.XO0O10 = str;
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

        public final void XOO0ii0(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.XIi00iiXO = str;
        }

        /* JADX INFO: renamed from: iO */
        public final float m38630iO() {
            return this.f54770iO;
        }
    }

    public static final class XO0O10 extends C2829q4 {
        public XO0O10() {
        }

        @Override // com.android.mltcode.paycertificationapi.C2829q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float f) {
            return cp5.Ii1iii0((int) f, SportDetailV2ChartFragment.this.getUserProfile().getUnit());
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.SportDetailV2ChartFragment$iO */
    public static final class C18962iO {

        @aa1
        public final String OXO1;

        @aa1
        public String XIi00iiXO;

        @aa1
        public String XO0O10;

        /* JADX INFO: renamed from: iO */
        @aa1
        public String f54772iO;

        public C18962iO() {
            this(null, null, null, null, 15, null);
        }

        public final void IiI10X(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.f54772iO = str;
        }

        public final void O00(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.XO0O10 = str;
        }

        @aa1
        public final String OXO1() {
            return this.XO0O10;
        }

        @aa1
        public final String XIi00iiXO() {
            return this.f54772iO;
        }

        @aa1
        public final String XO0O10() {
            return this.OXO1;
        }

        public final void XOO0ii0(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.XIi00iiXO = str;
        }

        @aa1
        /* JADX INFO: renamed from: iO */
        public final String m38631iO() {
            return this.XIi00iiXO;
        }

        public C18962iO(@aa1 String number, @aa1 String duration, @aa1 String distance, @aa1 String avgPace) {
            Intrinsics.X0O(number, "number");
            Intrinsics.X0O(duration, "duration");
            Intrinsics.X0O(distance, "distance");
            Intrinsics.X0O(avgPace, "avgPace");
            this.OXO1 = number;
            this.XIi00iiXO = duration;
            this.f54772iO = distance;
            this.XO0O10 = avgPace;
        }

        public /* synthetic */ C18962iO(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    public SportDetailV2ChartFragment() {
        setLeftAxisGridDashedLine(true);
        LogUtils.m11130i("SportDetailV2ChartFragment");
        this.colorsList = CollectionsKt__CollectionsKt.iXiX011(Integer.valueOf(R.color.sport_detail_bg_endColor), Integer.valueOf(R.color.bp_level_color_high), Integer.valueOf(R.color.p_level_color_high), Integer.valueOf(R.color.sport_detail_bg_centerColor), Integer.valueOf(R.color.bp_level_color_standard), Integer.valueOf(R.color.bp_level_color_low));
    }

    private final void addMyPieChart(Long l, int i, ArrayList<MyPieChart.OXO1> arrayList) {
        LogUtils.m11130i("addMyPieChart " + l);
        arrayList.add(new MyPieChart.OXO1(l != null ? l.longValue() : 1L, getResources().getColor(i), 0.0f, 0.0f, 12, null));
    }

    private final void ateList(int i) {
        List<iz3> listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(new iz3(0.0f, 10.0f, "", getMActivity().getResources().getColor(this.colorsList.get(0).intValue())).X1ii(i == 5 ? getString(R.string.very_Poor_key) : ""), new iz3(10.0f, 25.0f, "", getMActivity().getResources().getColor(this.colorsList.get(1).intValue())).X1ii(i == 4 ? getString(R.string.poor_key) : ""), new iz3(25.0f, 50.0f, "", getMActivity().getResources().getColor(this.colorsList.get(2).intValue())).X1ii(i == 3 ? getString(R.string.average_key) : ""), new iz3(50.0f, 75.0f, "", getMActivity().getResources().getColor(this.colorsList.get(3).intValue())).X1ii(i == 2 ? getString(R.string.good_key) : ""), new iz3(75.0f, 95.0f, "", getMActivity().getResources().getColor(this.colorsList.get(4).intValue())).X1ii(i == 1 ? getString(R.string.excellent_key) : ""), new iz3(95.0f, 100.0f, "", getMActivity().getResources().getColor(this.colorsList.get(5).intValue())).X1ii(i == 0 ? getString(R.string.top_key) : ""));
        getMAteLevel().setSegmentSideRule(1);
        getMAteLevel().setShowDescriptionText(true);
        getMAteLevel().setSegments(listIi1iii0);
        getMAteLevel().setDescriptionTextColor(gk4.m1859iO(getMAteLevel().getContext(), R.color.text_color));
        getMAteLevel().setDescriptionTopTextColor(gk4.m1859iO(getMAteLevel().getContext(), this.colorsList.get(5 - i).intValue()));
    }

    private final void configChartV2(LineChart lineChart, int i, int i2, long j) {
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        io1xi1x1i.XIi00iiXO(lineChart);
        int i3 = 0;
        lineChart.setTouchEnabled(false);
        lineChart.getDescription().XOO0ii0(false);
        lineChart.getLegend().XOO0ii0(false);
        lineChart.getAxisLeft().XO0X10iO(false);
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
        long mDuration = ((long) (getMWorkout().getMDuration() * 1000)) / j;
        xAxis.i0X000X0O(0.0f);
        float f = j;
        xAxis.IXOIIIO(f / 2.0f);
        xAxis.iOiXi11II(f);
        ArrayList arrayList = new ArrayList();
        int mDuration2 = getMWorkout().getMDuration() * 1000;
        int i4 = (int) mDuration;
        if (i4 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i4 + FileUtils.FILE_EXTENSION_SEPARATOR);
        }
        int iM39480iO = ProgressionUtilKt.m39480iO(0, mDuration2, i4);
        if (iM39480iO >= 0) {
            while (true) {
                int iXXO = O0X11OiO.XXO(i3);
                arrayList.add(iXXO == 0 ? "0" : String.valueOf(iXXO + 1));
                if (i3 == iM39480iO) {
                    break;
                } else {
                    i3 += i4;
                }
            }
        }
        xAxis.m603Oi(new C2829q4(arrayList));
    }

    private final SegmentedBarView getMAteLevel() {
        return (SegmentedBarView) this.mAteLevel$delegate.getValue();
    }

    private final PFMedium getMCadenceAvgTitle() {
        return (PFMedium) this.mCadenceAvgTitle$delegate.getValue();
    }

    private final PFMedium getMCadenceMaxTitle() {
        return (PFMedium) this.mCadenceMaxTitle$delegate.getValue();
    }

    private final PFMedium getMCadenceTitle() {
        return (PFMedium) this.mCadenceTitle$delegate.getValue();
    }

    private final PFMedium getMCadenceTitleUnit() {
        return (PFMedium) this.mCadenceTitleUnit$delegate.getValue();
    }

    private final ImageView getMCadenceUnderstandSituation() {
        return (ImageView) this.mCadenceUnderstandSituation$delegate.getValue();
    }

    private final View getMDateSourcesTip() {
        return (View) this.mDateSourcesTip$delegate.getValue();
    }

    private final ImageView getMDeviceImg() {
        return (ImageView) this.mDeviceImg$delegate.getValue();
    }

    private final TextView getMDeviceName() {
        return (TextView) this.mDeviceName$delegate.getValue();
    }

    private final ImageView getMDeviceQRCode() {
        return (ImageView) this.mDeviceQRCode$delegate.getValue();
    }

    private final LinearLayout getMDeviceQRCodeLayout() {
        return (LinearLayout) this.mDeviceQRCodeLayout$delegate.getValue();
    }

    private final LinearLayout getMDeviceSources() {
        return (LinearLayout) this.mDeviceSources$delegate.getValue();
    }

    private final TextView getMPacePanelUnit() {
        return (TextView) this.mPacePanelUnit$delegate.getValue();
    }

    private final MyPieChart getMPieChart() {
        return (MyPieChart) this.mPieChart$delegate.getValue();
    }

    private final LinearLayout getMSegmentationDetailsLL() {
        return (LinearLayout) this.mSegmentationDetailsLL$delegate.getValue();
    }

    private final RecyclerView getMSegmentationRecyclerView() {
        return (RecyclerView) this.mSegmentationRecyclerView$delegate.getValue();
    }

    private final TextView getMSpeedPanelUnit() {
        return (TextView) this.mSpeedPanelUnit$delegate.getValue();
    }

    private final LinearLayout getMSpeedPerKilometer() {
        return (LinearLayout) this.mSpeedPerKilometer$delegate.getValue();
    }

    private final TextView getMSpeedRecyclerTitle() {
        return (TextView) this.mSpeedRecyclerTitle$delegate.getValue();
    }

    private final TextView getMSpeedRecyclerUnit() {
        return (TextView) this.mSpeedRecyclerUnit$delegate.getValue();
    }

    private final RecyclerView getMSpeedRecyclerView() {
        return (RecyclerView) this.mSpeedRecyclerView$delegate.getValue();
    }

    private final SportGoalProgressBar getMSportGoalProgressBar() {
        return (SportGoalProgressBar) this.mSportGoalProgressBar$delegate.getValue();
    }

    private final PFMedium getMSportMaxV02() {
        return (PFMedium) this.mSportMaxV02$delegate.getValue();
    }

    private final PFMedium getMSportMaxV02Level() {
        return (PFMedium) this.mSportMaxV02Level$delegate.getValue();
    }

    private final PFMedium getMSportRecoveryTime() {
        return (PFMedium) this.mSportRecoveryTime$delegate.getValue();
    }

    private final PFMedium getMSportRecoveryTimeEstimate() {
        return (PFMedium) this.mSportRecoveryTimeEstimate$delegate.getValue();
    }

    private final PFMedium getMSportTrainingLoad() {
        return (PFMedium) this.mSportTrainingLoad$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperience() {
        return (LinearLayout) this.mTrainingExperience$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceResult() {
        return (LinearLayout) this.mTrainingExperienceResult$delegate.getValue();
    }

    private final ImageView getMTrainingExperienceResultImg() {
        return (ImageView) this.mTrainingExperienceResultImg$delegate.getValue();
    }

    private final TextView getMTrainingExperienceResultTv() {
        return (TextView) this.mTrainingExperienceResultTv$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect() {
        return (LinearLayout) this.mTrainingExperienceSelect$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect1() {
        return (LinearLayout) this.mTrainingExperienceSelect1$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect2() {
        return (LinearLayout) this.mTrainingExperienceSelect2$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect3() {
        return (LinearLayout) this.mTrainingExperienceSelect3$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect4() {
        return (LinearLayout) this.mTrainingExperienceSelect4$delegate.getValue();
    }

    private final LinearLayout getMTrainingExperienceSelect5() {
        return (LinearLayout) this.mTrainingExperienceSelect5$delegate.getValue();
    }

    private final RelativeLayout getMTrainingPerformance() {
        return (RelativeLayout) this.mTrainingPerformance$delegate.getValue();
    }

    private final void getSportDetailActivity() {
        if (getActivity() instanceof SportDetailV2Activity) {
            FragmentActivity activity = getActivity();
            Intrinsics.X1ii(activity, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2Activity");
            this.sportDetailV2Activity = (SportDetailV2Activity) activity;
        }
    }

    private final String getTodayTime(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getMEndTime());
        calendar.add(13, i);
        String str = new SimpleDateFormat("M/dEEEEHH:mm", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    private final Pair<Integer, String> getV02Level(int i) {
        if (95 <= i && i < 101) {
            return new Pair<>(0, getString(R.string.top_key));
        }
        if (75 <= i && i < 95) {
            return new Pair<>(1, getString(R.string.excellent_key));
        }
        if (50 <= i && i < 75) {
            return new Pair<>(2, getString(R.string.good_key));
        }
        if (25 > i || i >= 50) {
            return (10 > i || i >= 25) ? new Pair<>(5, getString(R.string.very_Poor_key)) : new Pair<>(4, getString(R.string.poor_key));
        }
        return new Pair<>(3, getString(R.string.average_key));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        sportDetailV2ChartFragment.getMAteLevel().setValueSegment(Integer.valueOf(5 - sportDetailV2ChartFragment.getV02Level(sportDetailV2ChartFragment.getMWorkout().getMMaxVO2() / 10).getFirst().intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SportDetailV2ChartFragment sportDetailV2ChartFragment, View view) {
        String str = "https://api.iot-solution.net/web/help/gomer_help.html?type=" + (sportDetailV2ChartFragment.getMWorkout().getMMode() == 52 ? 5 : 2);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", str);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(sportDetailV2ChartFragment.getActivity(), (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        sportDetailV2ChartFragment.startActivity(intent);
    }

    private final void locationList() {
        ArrayList<CustomLatLng> arrayList = new ArrayList<>();
        boolean z = false;
        this.isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, false);
        List<Location> location = getMLocationDao().getLocation(getMWorkout().getMStart(), getMWorkout().getMEnd());
        LogUtils.m11130i("locationList " + location);
        if (!location.isEmpty() && location.size() >= 2) {
            Iterator<Location> it = location.iterator();
            do {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
            } while (it.next().getMSource() != 1);
            if (this.isInChinaMainland && z) {
                CoordinateConverter coordinateConverterFrom = new CoordinateConverter().from(CoordinateConverter.CoordType.GPS);
                for (Location location2 : location) {
                    LatLng latLngConvert = coordinateConverterFrom.coord(new LatLng(location2.getMLatitude(), location2.getMLongitude())).convert();
                    arrayList.add(new CustomLatLng(latLngConvert.latitude, latLngConvert.longitude, location2.getMTime(), location2.getMAltitude(), 0, 16, null));
                }
            } else {
                for (Location location3 : location) {
                    arrayList.add(new CustomLatLng(location3.getMLatitude(), location3.getMLongitude(), location3.getMTime(), location3.getMAltitude(), 0, 16, null));
                }
            }
        }
        if (arrayList.isEmpty() || arrayList.size() <= 2) {
            return;
        }
        this.locationSmoothAlgorithm.addAll(locationSmoothAlgorithm(arrayList));
    }

    private final ArrayList<CustomLatLng> locationSmoothAlgorithm(ArrayList<CustomLatLng> arrayList) {
        ArrayList<CustomLatLng> arrayList2 = new ArrayList<>();
        CustomLatLng customLatLng = new CustomLatLng(arrayList.get(0).getLatitude(), arrayList.get(0).getLongitude(), arrayList.get(0).getTime(), arrayList.get(0).getAltitude(), 0, 16, null);
        CustomLatLng customLatLng2 = new CustomLatLng(0.0d, 0.0d, 0L, 0, 0, 16, null);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            CustomLatLng customLatLng3 = arrayList.get(i);
            Intrinsics.O10IXXX0X(customLatLng3, "get(...)");
            CustomLatLng customLatLng4 = customLatLng3;
            if (customLatLng4.getLatitude() == customLatLng2.getLatitude() && customLatLng4.getLongitude() == customLatLng2.getLongitude()) {
                customLatLng4.setLongitude(customLatLng.getLongitude());
                customLatLng4.setLatitude(customLatLng.getLatitude());
            } else {
                float fIIi1 = (mc0.iIi1(DistanceUtil.getDistance(new LatLng(customLatLng.getLatitude(), customLatLng.getLongitude()), new LatLng(customLatLng4.getLatitude(), customLatLng4.getLongitude())) * ((double) 100)) / 100.0f) / (Math.abs(customLatLng4.getTime() - customLatLng.getTime()) / ((long) 1000));
                if (fIIi1 < this.threshold) {
                    customLatLng2.setLatitude(0.0d);
                    customLatLng2.setLongitude(0.0d);
                    customLatLng2.setTime(0L);
                    customLatLng2.setAltitude(0);
                } else if (fIIi1 >= this.thresholdMax) {
                    customLatLng4.setLongitude(customLatLng.getLongitude());
                    customLatLng4.setLatitude(customLatLng.getLatitude());
                } else {
                    customLatLng2.setLatitude(customLatLng4.getLatitude());
                    customLatLng2.setLongitude(customLatLng4.getLongitude());
                    customLatLng2.setTime(customLatLng4.getTime());
                    customLatLng2.setAltitude(customLatLng4.getAltitude());
                    double d = 2;
                    customLatLng4.setLongitude((customLatLng.getLongitude() + customLatLng4.getLongitude()) / d);
                    customLatLng4.setLatitude((customLatLng.getLatitude() + customLatLng4.getLatitude()) / d);
                }
            }
            customLatLng.setLatitude(customLatLng4.getLatitude());
            customLatLng.setLongitude(customLatLng4.getLongitude());
            customLatLng.setTime(customLatLng4.getTime());
            customLatLng.setAltitude(customLatLng4.getAltitude());
            arrayList2.add(new CustomLatLng(customLatLng4.getLatitude(), customLatLng4.getLongitude(), customLatLng4.getTime(), customLatLng4.getAltitude(), 0, 16, null));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SegmentedBarView mAteLevel_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (SegmentedBarView) sportDetailV2ChartFragment.getMView().findViewById(R.id.ateLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCadenceAvgTitle_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (PFMedium) sportDetailV2ChartFragment.getMView().findViewById(R.id.cadence_avg_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCadenceMaxTitle_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (PFMedium) sportDetailV2ChartFragment.getMView().findViewById(R.id.cadence_max_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCadenceTitleUnit_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (PFMedium) sportDetailV2ChartFragment.getMView().findViewById(R.id.cadence_max_title_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mCadenceTitle_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (PFMedium) sportDetailV2ChartFragment.getMView().findViewById(R.id.cadence_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mCadenceUnderstandSituation_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (ImageView) sportDetailV2ChartFragment.getMView().findViewById(R.id.understand_situation_cadence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mDateSourcesTip_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return sportDetailV2ChartFragment.getMView().findViewById(R.id.device_sport_detail_tip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mDeviceImg_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (ImageView) sportDetailV2ChartFragment.getMView().findViewById(R.id.device_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mDeviceName_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (TextView) sportDetailV2ChartFragment.getMView().findViewById(R.id.device_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mDeviceQRCodeLayout_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.device_qr_code_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mDeviceQRCode_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (ImageView) sportDetailV2ChartFragment.getMView().findViewById(R.id.device_qr_code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mDeviceSources_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.device_sources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mPacePanelUnit_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (TextView) sportDetailV2ChartFragment.getMView().findViewById(R.id.pace_panel_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MyPieChart mPieChart_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (MyPieChart) sportDetailV2ChartFragment.getMView().findViewById(R.id.myPieChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mSegmentationDetailsLL_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.segmentation_detail_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mSegmentationRecyclerView_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (RecyclerView) sportDetailV2ChartFragment.getMView().findViewById(R.id.segmentation_detail_rl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mSpeedPanelUnit_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (TextView) sportDetailV2ChartFragment.getMView().findViewById(R.id.speed_panel_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mSpeedPerKilometer_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.speed_per_kilometer_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mSpeedRecyclerTitle_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (TextView) sportDetailV2ChartFragment.getMView().findViewById(R.id.speed_per_kilometer_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mSpeedRecyclerUnit_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (TextView) sportDetailV2ChartFragment.getMView().findViewById(R.id.speed_per_kilometer_ll_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mSpeedRecyclerView_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (RecyclerView) sportDetailV2ChartFragment.getMView().findViewById(R.id.speed_per_kilometer_rl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportGoalProgressBar mSportGoalProgressBar_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (SportGoalProgressBar) sportDetailV2ChartFragment.getMView().findViewById(R.id.sport_goal_progressBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mSportMaxV02Level_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (PFMedium) sportDetailV2ChartFragment.getMView().findViewById(R.id.sport_maxvO2_level);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mSportMaxV02_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (PFMedium) sportDetailV2ChartFragment.getMView().findViewById(R.id.sport_maxvO2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mSportRecoveryTimeEstimate_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (PFMedium) sportDetailV2ChartFragment.getMView().findViewById(R.id.sport_recoveryTime_estimate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mSportRecoveryTime_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (PFMedium) sportDetailV2ChartFragment.getMView().findViewById(R.id.sport_recoveryTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mSportTrainingLoad_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (PFMedium) sportDetailV2ChartFragment.getMView().findViewById(R.id.sport_trainingLoad);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mTrainingExperienceResultImg_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (ImageView) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_experience_img_result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTrainingExperienceResultTv_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (TextView) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_experience_tv_result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceResult_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_experience_layout_result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect1_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_experience_layout_1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect2_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_experience_layout_2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect3_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_experience_layout_3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect4_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_experience_layout_4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect5_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_experience_layout_5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperienceSelect_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_experience_layout_select);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mTrainingExperience_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (LinearLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_experience_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout mTrainingPerformance_delegate$lambda$0(SportDetailV2ChartFragment sportDetailV2ChartFragment) {
        return (RelativeLayout) sportDetailV2ChartFragment.getMView().findViewById(R.id.training_performance_layout);
    }

    private final Pair<Long, LinkedHashMap<Long, nr0>> reviseData(List<Integer> list, int i) {
        long mEndTime = (list == null || !(list.isEmpty() ^ true) || i == 0) ? 60000L : (getMEndTime() - getMStartTime()) / ((long) list.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long mStartTime = getMStartTime();
        long mEndTime2 = getMEndTime();
        if (mEndTime <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + mEndTime + FileUtils.FILE_EXTENSION_SEPARATOR);
        }
        long jXO0O10 = ProgressionUtilKt.XO0O10(mStartTime, mEndTime2, mEndTime);
        if (mStartTime <= jXO0O10) {
            while (true) {
                linkedHashMap.put(Long.valueOf(mStartTime), new nr0(0, 0, null, 4, null));
                if (mStartTime == jXO0O10) {
                    break;
                }
                mStartTime += mEndTime;
            }
        }
        if (list != null) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                int iIntValue = ((Number) obj).intValue();
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    nr0 nr0Var = (nr0) ((Map.Entry) it.next()).getValue();
                    if (nr0Var.IiI10X() == 0) {
                        nr0Var.OIX0iXi(nr0Var.I0IIOi() + iIntValue);
                        nr0Var.OIi0(nr0Var.IiI10X() + 1);
                        break;
                    }
                }
                i2 = i3;
            }
        }
        return new Pair<>(Long.valueOf(mEndTime), linkedHashMap);
    }

    private final void setDeviceSource() {
        int i;
        SportDetailV2ChartFragment sportDetailV2ChartFragment;
        LogUtils.m11128d("setDeviceSource ---> " + getMWorkout().getMMaxPace() + "  " + getMWorkout().getMMinPace() + " " + getMWorkout().getMPrototype() + "  " + getMWorkout().getMFirmwareFlag() + "  " + getMWorkout().getMBleName() + " ");
        LinearLayout mDeviceSources = getMDeviceSources();
        if (getMWorkout().getMBleName().length() == 0 || Intrinsics.XOO0ii0(getMWorkout().getMBleName(), "0")) {
            i = 8;
            sportDetailV2ChartFragment = this;
        } else {
            File fileM3190X1 = uz0.m3190X1(sz0.OXO1, getMWorkout().getMBleName(), getMWorkout().getMFirmwareFlag());
            int iM2893iX = q62.OXO1.m2893iX(new BleDeviceInfo(0, null, getMWorkout().getMBleName(), null, null, null, getMWorkout().getMPrototype(), getMWorkout().getMFirmwareFlag(), 0, 0L, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -197, -1, -1, -1, C2229at.f5560IO, null));
            ImageView mDeviceImg = getMDeviceImg();
            FragmentActivity activity = getActivity();
            mDeviceImg.setImageDrawable(activity != null ? activity.getDrawable(iM2893iX) : null);
            if (com.blankj.utilcode.util.FileUtils.isFileExists(fileM3190X1)) {
                getMDeviceImg().setImageBitmap(ImageUtils.getBitmap(fileM3190X1));
                sportDetailV2ChartFragment = this;
            } else {
                sportDetailV2ChartFragment = this;
                sportDetailV2ChartFragment.isWorkImage = true;
                DeviceInfoChecker.OXO1.X1ii(sportDetailV2ChartFragment.getMWorkout().getMBleName(), sportDetailV2ChartFragment.getMWorkout().getMFirmwareFlag());
            }
            sportDetailV2ChartFragment.getMDeviceName().setText(sportDetailV2ChartFragment.getMWorkout().getMBleName());
            i = 0;
        }
        mDeviceSources.setVisibility(i);
        sportDetailV2ChartFragment.showSourcesTip();
    }

    private final void setTrainingExperience(int i) {
        getMView().findViewById(R.id.training_experience_hint_tv).setVisibility(8);
        getMTrainingExperienceSelect().setVisibility(8);
        getMTrainingExperienceResult().setVisibility(0);
        getMTrainingExperienceResultImg().setImageResource(getTrainingExperienceImage(getMActivity(), i));
        getMTrainingExperienceResultTv().setText(getString(getTrainingExperienceName(getMActivity(), i)));
        getMTrainingExperience().setBackgroundResource(R.drawable.ripple_training_experience_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTrainingPerformance$lambda$3(SportDetailV2ChartFragment sportDetailV2ChartFragment, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/web/help/gomer_help.html?type=1");
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(sportDetailV2ChartFragment.getActivity(), (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        sportDetailV2ChartFragment.startActivity(intent);
    }

    private final void showAltitudeV2(List<Integer> list) {
        Pair<Long, LinkedHashMap<Long, nr0>> pairReviseData = reviseData(list, getMWorkout().getMAltitudePathCount());
        pairReviseData.component1().longValue();
        LinkedHashMap<Long, nr0> linkedHashMapComponent2 = pairReviseData.component2();
        ArrayList arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        Iterator<Map.Entry<Long, nr0>> it = linkedHashMapComponent2.entrySet().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            nr0 value = it.next().getValue();
            if (value.IiI10X() != 0) {
                int iI0IIOi = value.I0IIOi() / value.IiI10X();
                arrayList.add(new Entry(mChartXStartIndex, iI0IIOi));
                if (i2 < iI0IIOi) {
                    i2 = iI0IIOi;
                }
                if (i == 0 || i > iI0IIOi) {
                    i = iI0IIOi;
                }
            }
            mChartXStartIndex += 1.0f;
        }
        LineChart altitudeLineChart = getAltitudeLineChart();
        Intrinsics.O10IXXX0X(altitudeLineChart, "<get-altitudeLineChart>(...)");
        configChartV2(altitudeLineChart, i - 5, i2 + 5, linkedHashMapComponent2.size());
        LineChart altitudeLineChart2 = getAltitudeLineChart();
        Intrinsics.O10IXXX0X(altitudeLineChart2, "<get-altitudeLineChart>(...)");
        updateChartData(altitudeLineChart2, arrayList, R.color.altitude_color, R.drawable.shape_altitude);
        getTvAltitudeUnit().setText(getUserProfile().getUnit() == 0 ? getString(R.string.altitude_unit) : getString(R.string.f54374yd));
        getTvMaxAltitudeValue().setText((getMWorkout().getMMaxAltitude() > 10000 || getMWorkout().getMMaxAltitude() < -10000) ? cp5.iXiX011(i2, getUserProfile().getUnit()) : cp5.iXiX011(getMWorkout().getMMaxAltitude(), getUserProfile().getUnit()));
        getTvMinAltitudeValue().setText((getMWorkout().getMMaxAltitude() > 10000 || getMWorkout().getMMaxAltitude() < -10000) ? cp5.iXiX011(i, getUserProfile().getUnit()) : cp5.iXiX011(getMWorkout().getMMinAltitude(), getUserProfile().getUnit()));
    }

    private final void showHrV2(List<Integer> list) {
        Pair<Long, LinkedHashMap<Long, nr0>> pairReviseData = reviseData(list, getMWorkout().getMHrPathSampleInterval());
        pairReviseData.component1().longValue();
        LinkedHashMap<Long, nr0> linkedHashMapComponent2 = pairReviseData.component2();
        ArrayList arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        Iterator<Map.Entry<Long, nr0>> it = linkedHashMapComponent2.entrySet().iterator();
        while (it.hasNext()) {
            nr0 value = it.next().getValue();
            if (value.IiI10X() != 0) {
                arrayList.add(new Entry(mChartXStartIndex, value.I0IIOi() / value.IiI10X()));
            }
            mChartXStartIndex += 1.0f;
        }
        LineChart hrLineChart = getHrLineChart();
        Intrinsics.O10IXXX0X(hrLineChart, "<get-hrLineChart>(...)");
        configChartV2(hrLineChart, 40, getMWorkout().getMMaxBpm() + 10, linkedHashMapComponent2.size());
        LineChart hrLineChart2 = getHrLineChart();
        Intrinsics.O10IXXX0X(hrLineChart2, "<get-hrLineChart>(...)");
        updateChartData(hrLineChart2, arrayList, R.color.hr_color, R.drawable.shape_hr);
        getTvAvgBmpValue().setText(String.valueOf(getMWorkout().getMMinBpm()));
        getTvMaxBmpValue().setText(String.valueOf(getMWorkout().getMMaxBpm()));
        if (!i72.OXO1.X11()) {
            SportDetailChartFragment.setSportText$default(this, 0L, 0L, 0L, 0L, 0L, 31, null);
            return;
        }
        if (getMWorkout().getMMode() == 7) {
            SportDetailChartFragment.setSportText$default(this, 0L, 0L, 0L, 0L, 0L, 31, null);
        } else if (getTvHeartRateRange() != null) {
            getTvHeartRateRange().setVisibility(8);
            getLlHeartRateRange().setVisibility(8);
        }
    }

    private final void showPaceV2(List<Integer> list) {
        Pair<Long, LinkedHashMap<Long, nr0>> pairReviseData = reviseData(list, getMWorkout().getMPacePathCount());
        pairReviseData.component1().longValue();
        LinkedHashMap<Long, nr0> linkedHashMapComponent2 = pairReviseData.component2();
        ArrayList arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        int i = 0;
        int i2 = 0;
        for (Map.Entry<Long, nr0> entry : linkedHashMapComponent2.entrySet()) {
            entry.getKey().longValue();
            nr0 value = entry.getValue();
            if (value.IiI10X() != 0) {
                int iI0IIOi = (getUserProfile().getUnit() == 1 ? (int) (value.I0IIOi() / 0.6213712f) : value.I0IIOi()) / value.IiI10X();
                if (i2 < iI0IIOi) {
                    i2 = iI0IIOi;
                }
                if (i == 0 || i > iI0IIOi) {
                    i = iI0IIOi;
                }
                arrayList.add(new Entry(mChartXStartIndex, iI0IIOi));
            }
            mChartXStartIndex += 1.0f;
        }
        LineChart paceLineChart = getPaceLineChart();
        Intrinsics.O10IXXX0X(paceLineChart, "<get-paceLineChart>(...)");
        configChartV2(paceLineChart, i, i2 + 10, linkedHashMapComponent2.size());
        LineChart paceLineChart2 = getPaceLineChart();
        Intrinsics.O10IXXX0X(paceLineChart2, "<get-paceLineChart>(...)");
        updateChartData(paceLineChart2, arrayList, R.color.pace_color, R.drawable.shape_pace);
        getPaceLineChart().getAxisLeft().m603Oi(new XO0O10());
        getTvAvgPaceValue().setText(getMWorkout().getMMaxPace() > 0 ? cp5.Ii1iii0(getMWorkout().getMMaxPace(), getUserProfile().getUnit()) : cp5.Ii1iii0(i2, getUserProfile().getUnit()));
        getTvMinPaceValue().setText(getMWorkout().getMMinPace() > 0 ? cp5.Ii1iii0(getMWorkout().getMMinPace(), getUserProfile().getUnit()) : cp5.Ii1iii0(i, getUserProfile().getUnit()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showQCCode$lambda$0(Function1 function1) {
        function1.invoke2(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showQCCode$lambda$1(Function1 function1) {
        function1.invoke2(Boolean.TRUE);
    }

    private final void showSegmentation() {
        RecyclerView mSegmentationRecyclerView = getMSegmentationRecyclerView();
        mSegmentationRecyclerView.setLayoutManager(new LinearLayoutManager(mSegmentationRecyclerView.getContext()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C18962iO(null, null, null, null, 15, null));
        arrayList.add(new C18962iO("1", "0:10", "0.5", "9"));
        arrayList.add(new C18962iO("1", "0:10", "0.5", "9"));
        getMSegmentationDetailsLL().setVisibility(arrayList.size() > 1 ? 0 : 8);
        Context context = mSegmentationRecyclerView.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        mSegmentationRecyclerView.setAdapter(new SportRecordSegmentationAdapter(arrayList, context));
    }

    private final void showSourcesTip() {
        LogUtils.m11128d("mWorkout.mAGpsType ---> " + getMWorkout().getMAGpsType() + " ");
        getMDateSourcesTip().setVisibility((getMWorkout().getMSource() == 1 || getMWorkout().getMAGpsType() == 0) ? 0 : 8);
    }

    private final boolean showSpeedData() {
        RecordDetailSpeedData recordDetailSpeedDataSportRecordWorkoutDetailSpeed;
        SportDetailViewModel mSportViewModel;
        if (getMWorkout().getMSource() == 0) {
            recordDetailSpeedDataSportRecordWorkoutDetailSpeed = SportRecordDataKt.sportRecordActivityDetailSpeed(this.activityData.getMTimeList(), getMWorkout().getMMode(), getUserProfile().getUnit());
        } else {
            locationList();
            recordDetailSpeedDataSportRecordWorkoutDetailSpeed = SportRecordDataKt.sportRecordWorkoutDetailSpeed(this.activityData.getMTimeList(), getMWorkout().getMMode(), getUserProfile().getUnit(), this.locationSmoothAlgorithm);
        }
        ArrayList<Integer> mPaceList = recordDetailSpeedDataSportRecordWorkoutDetailSpeed.getMPaceList();
        int size = mPaceList.size();
        int i = 0;
        int mPace = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Integer num = mPaceList.get(i2);
            Intrinsics.O10IXXX0X(num, "get(...)");
            int iIntValue = num.intValue();
            if (iIntValue > 30000) {
                mPaceList.set(i2, Integer.valueOf(this.activityData.getMPace()));
                iIntValue = this.activityData.getMPace();
            }
            if (i2 == 0) {
                i = iIntValue;
                mPace = i;
            }
            if (i > iIntValue) {
                i = iIntValue;
            }
            if (mPace < iIntValue) {
                mPace = iIntValue;
            }
        }
        boolean z = getMWorkout().getMSource() == 1 && this.activityData.getMPace() > 0 && i == 0 && mPaceList.size() == 0;
        float f = 0.0f;
        if (mPaceList.size() == 0) {
            if (this.activityData.getMDistanceTotal() > 0.0f) {
                mPace = this.activityData.getMPace() * 2;
                int mDistanceTotal = (int) this.activityData.getMDistanceTotal();
                if (mDistanceTotal >= 0) {
                    int mPace2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (mPace2 < this.activityData.getMPace()) {
                            mPace2 = this.activityData.getMPace();
                        }
                        mPaceList.add(Integer.valueOf(this.activityData.getMPace()));
                        if (i3 == mDistanceTotal) {
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                mPaceList.add(Integer.valueOf(this.activityData.getMPace()));
            }
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 1000;
        if (i72.OXO1.I11iXOO()) {
            SportDetailV2Activity sportDetailV2Activity = this.sportDetailV2Activity;
            ArrayList<CustomLatLng> customLatLng = (sportDetailV2Activity == null || (mSportViewModel = sportDetailV2Activity.getMSportViewModel()) == null) ? null : mSportViewModel.getCustomLatLng();
            LogUtils.m11130i("locationList " + (customLatLng != null ? Integer.valueOf(customLatLng.size()) : null) + " ");
            if (customLatLng != null) {
                Iterator it = customLatLng.iterator();
                int i5 = 0;
                CustomLatLng customLatLng2 = null;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt__CollectionsKt.XOX0O0();
                    }
                    CustomLatLng customLatLng3 = (CustomLatLng) next;
                    if (customLatLng2 != null) {
                        int time = (int) ((customLatLng3.getTime() - customLatLng2.getTime()) / ((long) i4));
                        LogUtils.m11130i("locationList " + i5 + " " + time);
                        arrayList.add(new XIi00iiXO(String.valueOf(i5), cp5.Ii1iii0(time, getUserProfile().getUnit()), time / mPace, z ? cp5.Ii1iii0(time, getUserProfile().getUnit()) : cp5.iXiiiO(time)));
                    }
                    customLatLng2 = customLatLng3;
                    i5 = i6;
                    f = f;
                    it = it;
                    i4 = 1000;
                }
            }
        }
        float f2 = f;
        float fX1ii = cp5.X1ii(getMWorkout().getMDistance(), getUserProfile().getUnit(), false, 4, null);
        if (cp5.X1ii(1000, getUserProfile().getUnit(), false, 4, null) - fX1ii > f2 || (fX1ii % 1000.0f != f2 && !arrayList.isEmpty())) {
            arrayList.add(new XIi00iiXO("", cp5.Ii1iii0(getMWorkout().getMPace(), getUserProfile().getUnit()), f2, ""));
        }
        LogUtils.m11130i("tmpPaceList " + arrayList.size() + "  " + getMWorkout().getMDistance());
        getMSpeedRecyclerTitle().setText(getUserProfile().getUnit() == 1 ? getString(R.string.speed_per_mile) : getString(R.string.speed_per_kilometer));
        getMSpeedPanelUnit().setText(getUserProfile().getUnit() == 1 ? getString(R.string.min_unit) : getString(R.string.speed_unit));
        getMSpeedRecyclerUnit().setText(getString(cp5.XX0(getUserProfile().getUnit())));
        getMPacePanelUnit().setText(getString(cp5.XX0(getUserProfile().getUnit())));
        RecyclerView mSpeedRecyclerView = getMSpeedRecyclerView();
        mSpeedRecyclerView.setLayoutManager(new LinearLayoutManager(mSpeedRecyclerView.getContext()));
        Context context = mSpeedRecyclerView.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        mSpeedRecyclerView.setAdapter(new SportRecordDetailSpeedV2Adapter(arrayList, context));
        return !arrayList.isEmpty();
    }

    private final void showSpeedV2(List<Integer> list) {
        Pair<Long, LinkedHashMap<Long, nr0>> pairReviseData = reviseData(list, getMWorkout().getMSpeedPathCount());
        pairReviseData.component1().longValue();
        LinkedHashMap<Long, nr0> linkedHashMapComponent2 = pairReviseData.component2();
        ArrayList arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        Iterator<Map.Entry<Long, nr0>> it = linkedHashMapComponent2.entrySet().iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            nr0 value = it.next().getValue();
            if (value.IiI10X() != 0) {
                int iI0IIOi = ((getUserProfile().getUnit() == 1 ? (int) (value.I0IIOi() / 0.6213712f) : value.I0IIOi()) / 1000) / value.IiI10X();
                arrayList.add(new Entry(mChartXStartIndex, iI0IIOi));
                if (i2 < iI0IIOi) {
                    i2 = iI0IIOi;
                }
                if (i == 0 || i > iI0IIOi) {
                    i = iI0IIOi;
                }
                i3 += iI0IIOi;
            }
            mChartXStartIndex += 1.0f;
        }
        LineChart speedLineChart = getSpeedLineChart();
        Intrinsics.O10IXXX0X(speedLineChart, "<get-speedLineChart>(...)");
        configChartV2(speedLineChart, i != 0 ? i - 1 : 0, i2 + 5, linkedHashMapComponent2.size());
        LineChart speedLineChart2 = getSpeedLineChart();
        Intrinsics.O10IXXX0X(speedLineChart2, "<get-speedLineChart>(...)");
        updateChartData(speedLineChart2, arrayList, R.color.speed_color, R.drawable.shape_speed);
        getTvAvgSpeedValue().setText(String.valueOf(cp5.i11I(i, getUserProfile().getUnit())));
        getTvFastSpeedValue().setText(String.valueOf(cp5.i11I(((double) getMWorkout().getMMaxSpeed()) / ((double) 1000), getUserProfile().getUnit())));
        LogUtils.m11130i(getTAG() + " mMaxSpeed" + getMWorkout().getMMaxSpeed() + " minSpeed" + i + "  maxSpeed" + i2 + " avgSpeed" + i3);
    }

    private final void showSpmV2(List<Integer> list) {
        Pair<Long, LinkedHashMap<Long, nr0>> pairReviseData = reviseData(list, getMWorkout().getMCadencePathCount());
        pairReviseData.component1().longValue();
        LinkedHashMap<Long, nr0> linkedHashMapComponent2 = pairReviseData.component2();
        ArrayList arrayList = new ArrayList();
        float mChartXStartIndex = getMChartXStartIndex();
        Iterator<Map.Entry<Long, nr0>> it = linkedHashMapComponent2.entrySet().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            nr0 value = it.next().getValue();
            if (value.IiI10X() != 0) {
                int iI0IIOi = value.I0IIOi() / value.IiI10X();
                arrayList.add(new Entry(mChartXStartIndex, iI0IIOi));
                if (i2 < iI0IIOi) {
                    i2 = iI0IIOi;
                }
                if (i == 0 || i > iI0IIOi) {
                    i = iI0IIOi;
                }
            }
            mChartXStartIndex += 1.0f;
        }
        LineChart spmLineChart = getSpmLineChart();
        Intrinsics.O10IXXX0X(spmLineChart, "<get-spmLineChart>(...)");
        configChartV2(spmLineChart, i > 10 ? i - 10 : 0, i2 + 10, linkedHashMapComponent2.size());
        LineChart spmLineChart2 = getSpmLineChart();
        Intrinsics.O10IXXX0X(spmLineChart2, "<get-spmLineChart>(...)");
        updateChartData(spmLineChart2, arrayList, R.color.spm_color, R.drawable.shape_spm);
        if (getMWorkout().getMMode() == 52) {
            getTvAvgSpmValue().setText(String.valueOf(getMWorkout().getMCadence()));
            getTvMaxSpmValue().setText(String.valueOf(getMWorkout().getMMaxCadence()));
        } else {
            getTvAvgSpmValue().setText(String.valueOf(getMWorkout().getMSpm()));
            getTvMaxSpmValue().setText(String.valueOf(getMWorkout().getMMaxCadence()));
        }
    }

    private final void trainingExperienceSelect() {
        if (getMWorkout().getMFeel() > 0) {
            setTrainingExperience(getMWorkout().getMFeel());
            return;
        }
        getMTrainingExperienceSelect().setVisibility(0);
        getMTrainingExperienceResult().setVisibility(8);
        getMTrainingExperienceSelect1().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.wx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12060IO.trainingSelectListener(1);
            }
        });
        getMTrainingExperienceSelect2().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12256IO.trainingSelectListener(2);
            }
        });
        getMTrainingExperienceSelect3().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.zx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12716IO.trainingSelectListener(3);
            }
        });
        getMTrainingExperienceSelect4().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ay4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5612IO.trainingSelectListener(4);
            }
        });
        getMTrainingExperienceSelect5().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.by4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5852IO.trainingSelectListener(5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trainingSelectListener(int i) {
        setTrainingExperience(i);
        I01XX0.OXO1(I01XX0.XXiO0i, Integer.valueOf(i));
    }

    @aa1
    public final Bitmap getBitmap() {
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        NestedScrollView rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        Bitmap bitmapM1250iO = xIi1i01O.m1250iO(rootView);
        getMDeviceQRCodeLayout().setVisibility(8);
        getMTrainingExperience().setVisibility(0);
        showSourcesTip();
        return bitmapM1250iO;
    }

    @aa1
    public final List<Integer> getColorsList() {
        return this.colorsList;
    }

    public final int getTrainingExperienceImage(@aa1 Context mContext, int i) {
        Intrinsics.X0O(mContext, "mContext");
        try {
            return mContext.getResources().getIdentifier("icon_training_experience_" + i, "drawable", mContext.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return R.drawable.icon_training_experience_1;
        }
    }

    public final int getTrainingExperienceName(@aa1 Context mContext, int i) {
        Intrinsics.X0O(mContext, "mContext");
        try {
            return mContext.getResources().getIdentifier("training_experience_" + i, TypedValues.Custom.S_STRING, mContext.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return R.string.training_experience_1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    @Override // com.sma.smartv3.p610ui.sport.SportDetailChartFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        int i;
        super.initView();
        getSportDetailActivity();
        int mMode = getMWorkout().getMMode();
        if (mMode != 12 && mMode != 13 && mMode != 19) {
            switch (mMode) {
                case 7:
                case 8:
                case 9:
                    this.threshold = 5;
                    this.thresholdMax = 100;
                    break;
                case 10:
                    this.threshold = 10;
                    this.thresholdMax = 100;
                    break;
            }
        } else {
            this.threshold = 5;
            this.thresholdMax = 100;
        }
        boolean zShowSpeedData = showSpeedData();
        trainingExperienceSelect();
        setDeviceSource();
        int i2 = 8;
        boolean zX0O = true;
        if (getMWorkout().getMType() == 1) {
            RelativeLayout mTrainingPerformance = getMTrainingPerformance();
            if (hu4.OXO1.XX0(getMWorkout().getMMode())) {
                setTrainingPerformance();
                i = 0;
            } else {
                i = 8;
            }
            mTrainingPerformance.setVisibility(i);
            getMAteLevel().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.fy4
                @Override // java.lang.Runnable
                public final void run() {
                    SportDetailV2ChartFragment.initView$lambda$0(this.f6766IO);
                }
            });
        }
        getMCadenceUnderstandSituation().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.gy4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailV2ChartFragment.initView$lambda$1(this.f6993IO, view);
            }
        });
        if (getMWorkout().getMMode() == 52) {
            getMCadenceTitle().setText(getString(R.string.stroke_rate));
            getMCadenceTitleUnit().setText(getString(R.string.times_key) + "/" + getString(R.string.minute));
            getMCadenceAvgTitle().setText(getString(R.string.avg_stroke_rate));
            getMCadenceMaxTitle().setText(getString(R.string.max_stroke_rate));
        }
        i72 i72Var = i72.OXO1;
        if (i72Var.X0O().length() > 0) {
            getMDeviceQRCode().setImageBitmap(new OiOiI0IX1().O00(i72Var.X0O(), 350, ViewCompat.MEASURED_STATE_MASK, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher)));
        }
        getMDeviceQRCodeLayout().setVisibility(8);
        hu4 hu4Var = hu4.OXO1;
        if (hu4Var.OiIIX101O(getMWorkout().getMPlatform())) {
            if (!hu4Var.XIi00iiXO(getMWorkout().getMMode())) {
                zX0O = getMWorkout().getMType() == 1 ? hu4Var.X0O(getMWorkout().getMMode()) : false;
            }
            LinearLayout mSpeedPerKilometer = getMSpeedPerKilometer();
            if (zX0O && zShowSpeedData) {
                i2 = 0;
            }
            mSpeedPerKilometer.setVisibility(i2);
            return;
        }
        q62 q62Var = q62.OXO1;
        if (q62Var.Oi000O010(getMWorkout().getMMode(), !isLocationEmpty()) && q62Var.XIXO0iiO(getMWorkout().getMMode()) && getMWorkout().getMType() != 1 && zShowSpeedData) {
            getMSpeedPerKilometer().setVisibility(0);
        } else {
            getMSpeedPerKilometer().setVisibility(8);
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailChartFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_chart_v2;
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailChartFragment
    public void newDrawChart() {
        super.newDrawChart();
        if (o65.OXO1.O00(getMWorkout()) || q62.OXO1.OiXI1OiX0()) {
            showHrV2(new ArrayList());
            View hrPanel = getHrPanel();
            if (hrPanel != null) {
                hrPanel.setVisibility(8);
            }
        } else {
            showHrV2(getMWorkout().getMHrPathPoints());
        }
        getPressurePanel().setVisibility(8);
        hu4 hu4Var = hu4.OXO1;
        if (hu4Var.iIiiO(getMWorkout().getMMode())) {
            showSpmV2(getMWorkout().getMCadencePathPoints());
        } else {
            getSpmPanel().setVisibility(8);
        }
        if (hu4Var.X0O(getMWorkout().getMMode())) {
            showPaceV2(getMWorkout().getMPacePathPoints());
        } else {
            getPacePanel().setVisibility(8);
        }
        if (hu4Var.I1XOi1(getMWorkout().getMMode())) {
            showSpeedV2(getMWorkout().getMSpeedPathPoints());
        } else {
            getSpeedPanel().setVisibility(8);
        }
        LogUtils.m11130i("GoMore" + hu4Var.XXI(getMWorkout().getMMode()));
        if (q62.OXO1.XI1OX0IO()) {
            getAltitudePanel().setVisibility(8);
        } else if (hu4Var.XXI(getMWorkout().getMMode())) {
            showAltitudeV2(getMWorkout().getMAltitudePathPoints());
        } else {
            getAltitudePanel().setVisibility(8);
        }
    }

    @sf5(tag = I01XX0.XXX11i)
    public final void onPairImageChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        File fileM3190X1 = uz0.m3190X1(sz0.OXO1, getMWorkout().getMBleName(), getMWorkout().getMFirmwareFlag());
        LogUtils.m11128d("onPairImageChange " + com.blankj.utilcode.util.FileUtils.isFileExists(fileM3190X1) + "  " + this.isWorkImage + " ");
        if (com.blankj.utilcode.util.FileUtils.isFileExists(fileM3190X1) && this.isWorkImage) {
            getMDeviceImg().setImageBitmap(ImageUtils.getBitmap(fileM3190X1));
            this.isWorkImage = false;
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailChartFragment
    public void setSportText(long j, long j2, long j3, long j4, long j5) {
        ArrayList<MyPieChart.OXO1> arrayList = new ArrayList<>();
        if (getMWorkout().getMType() != 1) {
            getHrPieChart().setVisibility(8);
            long j6 = 1000;
            getTvSportStrenuous().setText(O0X11OiO.OX110i((int) (j / j6)));
            getTvSportAnaerobic().setText(O0X11OiO.OX110i((int) (j2 / j6)));
            getTvSportAerobic().setText(O0X11OiO.OX110i((int) (j3 / j6)));
            getTvSportFatBurning().setText(O0X11OiO.OX110i((int) (j4 / j6)));
            getTvSportWarmUp().setText(O0X11OiO.OX110i((int) (j5 / j6)));
            addMyPieChart(Long.valueOf(j5), R.color.hr_scope_color_5, arrayList);
            addMyPieChart(Long.valueOf(j4), R.color.hr_scope_color_4, arrayList);
            addMyPieChart(Long.valueOf(j3), R.color.hr_scope_color_3, arrayList);
            addMyPieChart(Long.valueOf(j2), R.color.hr_scope_color_2, arrayList);
            addMyPieChart(Long.valueOf(j), R.color.hr_scope_color_1, arrayList);
        } else if (getMWorkout().getMBpmZoneCount() != null) {
            int[] mBpmZoneCount = getMWorkout().getMBpmZoneCount();
            Intrinsics.XXI(mBpmZoneCount);
            if (mBpmZoneCount.length >= 5) {
                getHrPieChart().setVisibility(8);
                DINCondBold tvSportStrenuous = getTvSportStrenuous();
                int[] mBpmZoneCount2 = getMWorkout().getMBpmZoneCount();
                tvSportStrenuous.setText(mBpmZoneCount2 != null ? O0X11OiO.OX110i(mBpmZoneCount2[4]) : null);
                DINCondBold tvSportAnaerobic = getTvSportAnaerobic();
                int[] mBpmZoneCount3 = getMWorkout().getMBpmZoneCount();
                tvSportAnaerobic.setText(mBpmZoneCount3 != null ? O0X11OiO.OX110i(mBpmZoneCount3[3]) : null);
                DINCondBold tvSportAerobic = getTvSportAerobic();
                int[] mBpmZoneCount4 = getMWorkout().getMBpmZoneCount();
                tvSportAerobic.setText(mBpmZoneCount4 != null ? O0X11OiO.OX110i(mBpmZoneCount4[2]) : null);
                DINCondBold tvSportFatBurning = getTvSportFatBurning();
                int[] mBpmZoneCount5 = getMWorkout().getMBpmZoneCount();
                tvSportFatBurning.setText(mBpmZoneCount5 != null ? O0X11OiO.OX110i(mBpmZoneCount5[1]) : null);
                DINCondBold tvSportWarmUp = getTvSportWarmUp();
                int[] mBpmZoneCount6 = getMWorkout().getMBpmZoneCount();
                tvSportWarmUp.setText(mBpmZoneCount6 != null ? O0X11OiO.OX110i(mBpmZoneCount6[0]) : null);
                int[] mBpmZoneCount7 = getMWorkout().getMBpmZoneCount();
                addMyPieChart(mBpmZoneCount7 != null ? Long.valueOf(mBpmZoneCount7[4]) : null, R.color.hr_scope_color_5, arrayList);
                int[] mBpmZoneCount8 = getMWorkout().getMBpmZoneCount();
                addMyPieChart(mBpmZoneCount8 != null ? Long.valueOf(mBpmZoneCount8[3]) : null, R.color.hr_scope_color_4, arrayList);
                int[] mBpmZoneCount9 = getMWorkout().getMBpmZoneCount();
                addMyPieChart(mBpmZoneCount9 != null ? Long.valueOf(mBpmZoneCount9[2]) : null, R.color.hr_scope_color_3, arrayList);
                int[] mBpmZoneCount10 = getMWorkout().getMBpmZoneCount();
                addMyPieChart(mBpmZoneCount10 != null ? Long.valueOf(mBpmZoneCount10[1]) : null, R.color.hr_scope_color_2, arrayList);
                int[] mBpmZoneCount11 = getMWorkout().getMBpmZoneCount();
                addMyPieChart(mBpmZoneCount11 != null ? Long.valueOf(mBpmZoneCount11[0]) : null, R.color.hr_scope_color_1, arrayList);
            }
        }
        getMPieChart().OXO1(arrayList);
        LogUtils.m11130i("addMyPieChart " + arrayList.size() + " //" + getMWorkout().getMType() + " ");
        int[] mBpmZoneCount12 = getMWorkout().getMBpmZoneCount();
        StringBuilder sb = new StringBuilder();
        sb.append("mBpmZoneCount ");
        sb.append(mBpmZoneCount12);
        sb.append(" ");
        LogUtils.m11130i(sb.toString());
    }

    public final void setTrainingPerformance() {
        trainingPerformanceVisibility(8);
        hu4 hu4Var = hu4.OXO1;
        if (hu4Var.XOO0ii0(getMWorkout().getMMode())) {
            getMSportMaxV02().setVisibility(0);
        } else if (hu4Var.I0IIOi(getMWorkout().getMMode())) {
            getMSportRecoveryTime().setVisibility(0);
            getMSportRecoveryTimeEstimate().setVisibility(0);
        } else {
            trainingPerformanceVisibility(0);
        }
        String string = getString(R.string.vo2max_key);
        String strValueOf = getMWorkout().getMMaxVO2() == 0 ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : String.valueOf(getMWorkout().getMMaxVO2() / 10);
        String str = string + ": " + strValueOf + getString(R.string.vo2_unit);
        PFMedium mSportMaxV02 = getMSportMaxV02();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ViewCompat.MEASURED_STATE_MASK), getString(R.string.vo2max_key).length() + 1, str.length(), 33);
        mSportMaxV02.setText(spannableStringBuilder);
        Pair<Integer, String> v02Level = getV02Level(getMWorkout().getMMaxVO2() / 10);
        String str2 = getString(R.string.vo2max_level) + ": " + ((Object) v02Level.getSecond());
        PFMedium mSportMaxV02Level = getMSportMaxV02Level();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(getMActivity().getResources().getColor(this.colorsList.get(5 - v02Level.getFirst().intValue()).intValue())), getString(R.string.vo2max_level).length() + 1, str2.length(), 33);
        mSportMaxV02Level.setText(spannableStringBuilder2);
        getMSportTrainingLoad().setText(getString(R.string.training_performance_training_load, Integer.valueOf(getMWorkout().getMTrainingLoad())));
        getMSportGoalProgressBar().m38913iO(getMWorkout().getMAerobic(), 6.0f);
        getMSportGoalProgressBar().XO0O10(getMWorkout().getMAnaerobic(), 6.0f);
        ateList(v02Level.getFirst().intValue());
        if ((o65.OXO1.OIX0iXi(getMWorkout().getMEnd()) + ((long) (getMWorkout().getMRecoveryTime() * 1000))) - System.currentTimeMillis() > 0) {
            Pair<Integer, Integer> pairIIXi1iiXI = O0X11OiO.iIXi1iiXI(getMWorkout().getMRecoveryTime() * 1000);
            String str3 = getString(R.string.recovery_time) + ": " + pairIIXi1iiXI.getFirst() + O0X11OiO.iOO1ii1 + pairIIXi1iiXI.getSecond() + "M";
            PFMedium mSportRecoveryTime = getMSportRecoveryTime();
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str3);
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(ViewCompat.MEASURED_STATE_MASK), getString(R.string.recovery_time).length() + 1, str3.length(), 33);
            mSportRecoveryTime.setText(spannableStringBuilder3);
            getMSportRecoveryTimeEstimate().setText(getString(R.string.training_performance_recovery_time_detail, getTodayTime(getMWorkout().getMRecoveryTime())));
        } else {
            getMSportRecoveryTime().setVisibility(8);
            getMSportRecoveryTimeEstimate().setText(getString(R.string.fully_recovered_tip));
        }
        getMView().findViewById(R.id.tv_training_performance_explanation).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ey4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailV2ChartFragment.setTrainingPerformance$lambda$3(this.f6521IO, view);
            }
        });
    }

    public final void showQCCode(@aa1 final Function1<? super Boolean, Unit> post) {
        Intrinsics.X0O(post, "post");
        if (getMWorkout().getMFeel() == 0) {
            getMTrainingExperience().setVisibility(8);
        }
        if (getMWorkout().getMSource() == 1) {
            getMDateSourcesTip().setVisibility(8);
        }
        if (i72.OXO1.X0O().length() > 0) {
            getMDeviceQRCodeLayout().setVisibility(0);
            getMDeviceQRCodeLayout().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.cy4
                @Override // java.lang.Runnable
                public final void run() {
                    SportDetailV2ChartFragment.showQCCode$lambda$0(post);
                }
            });
        } else if (getMWorkout().getMFeel() == 0) {
            getMTrainingExperience().post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.dy4
                @Override // java.lang.Runnable
                public final void run() {
                    SportDetailV2ChartFragment.showQCCode$lambda$1(post);
                }
            });
        } else {
            post.invoke2(Boolean.TRUE);
        }
    }

    public final void trainingPerformanceVisibility(int i) {
        getMAteLevel().setVisibility(i);
        getMSportMaxV02().setVisibility(i);
        getMSportMaxV02Level().setVisibility(i);
        getMSportTrainingLoad().setVisibility(i);
        getMSportGoalProgressBar().setVisibility(i);
        getMSportRecoveryTime().setVisibility(i);
        getMSportRecoveryTimeEstimate().setVisibility(i);
    }
}
