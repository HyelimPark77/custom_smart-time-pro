package com.sma.smartv3.ui.sport.course;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IIX1O10OI;
import com.android.mltcode.paycertificationapi.IIiXOiX;
import com.android.mltcode.paycertificationapi.IOOI011O1;
import com.android.mltcode.paycertificationapi.IOX1i0XO;
import com.android.mltcode.paycertificationapi.Ii0i0i;
import com.android.mltcode.paycertificationapi.O1Xi0I1;
import com.android.mltcode.paycertificationapi.O1iiiO;
import com.android.mltcode.paycertificationapi.OI1X100iX;
import com.android.mltcode.paycertificationapi.OIOOI0X1;
import com.android.mltcode.paycertificationapi.OIX1OII;
import com.android.mltcode.paycertificationapi.OIXXOI;
import com.android.mltcode.paycertificationapi.OO0;
import com.android.mltcode.paycertificationapi.OOIX1OX1i;
import com.android.mltcode.paycertificationapi.OXXI;
import com.android.mltcode.paycertificationapi.X0I00iXi0;
import com.android.mltcode.paycertificationapi.Xi00XOi;
import com.android.mltcode.paycertificationapi.XiIX1OO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i001OX;
import com.android.mltcode.paycertificationapi.i1XIi;
import com.android.mltcode.paycertificationapi.i1XXIX1O;
import com.android.mltcode.paycertificationapi.i1iOii00;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iOX1i0;
import com.android.mltcode.paycertificationapi.iXO0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.CourseList;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.GoalSettingActivity;
import com.sma.smartv3.ui.sport.SportGoalSetActivity;
import com.sma.smartv3.ui.sport.SportOnGoingGpsActivity;
import com.sma.smartv3.ui.sport.SportSettingActivity;
import com.sma.smartv3.ui.status.SportRecordsActivity;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleConnector;
import java.util.ArrayList;
import java.util.Collection;
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
@SourceDebugExtension({"SMAP\nBaseSportV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportV2Fragment.kt\ncom/sma/smartv3/ui/sport/course/BaseSportV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,223:1\n19#2:224\n15#2:225\n19#2:226\n15#2:227\n50#2,3:230\n53#2:236\n55#2,2:238\n1869#3,2:228\n1563#3:233\n1634#3,2:234\n1636#3:237\n1#4:240\n1#4:244\n1#4:253\n1#4:262\n1#4:275\n1#4:290\n1#4:303\n78#5,3:241\n81#5,5:245\n78#5,3:250\n81#5,5:254\n78#5,3:259\n81#5,5:263\n99#5,7:268\n106#5,3:276\n79#5,7:279\n109#5:286\n78#5,3:287\n81#5,5:291\n99#5,7:296\n106#5,3:304\n79#5,7:307\n109#5:314\n*S KotlinDebug\n*F\n+ 1 BaseSportV2Fragment.kt\ncom/sma/smartv3/ui/sport/course/BaseSportV2Fragment\n*L\n80#1:224\n80#1:225\n160#1:226\n160#1:227\n189#1:230,3\n189#1:236\n189#1:238,2\n166#1:228,2\n189#1:233\n189#1:234,2\n189#1:237\n92#1:244\n95#1:253\n98#1:262\n117#1:275\n121#1:290\n181#1:303\n92#1:241,3\n92#1:245,5\n95#1:250,3\n95#1:254,5\n98#1:259,3\n98#1:263,5\n117#1:268,7\n117#1:276,3\n117#1:279,7\n117#1:286\n121#1:287,3\n121#1:291,5\n181#1:296,7\n181#1:304,3\n181#1:307,7\n181#1:314\n*E\n"})
public abstract class BaseSportV2Fragment extends BaseFragment {

    @aa1
    private final Lazy cumulativeRunningLl$delegate;

    @aa1
    private final Lazy distanceNow$delegate;

    @aa1
    private final Lazy distanceUnit$delegate;

    @aa1
    private final Lazy gpsLl$delegate;

    @aa1
    private final Lazy ivBg$delegate;

    @aa1
    private final Lazy ivGpsSignal$delegate;

    @tb1
    private List<CourseList> mCourseList;

    @tb1
    private go0 mLocationServerPopup;

    @aa1
    private final Lazy mRecyclerView$delegate;
    private int mSportMode;

    @aa1
    private final Lazy mWorkoutDao$delegate;

    @aa1
    private final Lazy root_view$delegate;

    @aa1
    private final Lazy sportGoalSet$delegate;

    @aa1
    private final Lazy sportHot$delegate;

    @aa1
    private final Lazy sportRecommendationCourse$delegate;

    @aa1
    private final Lazy sportSet$delegate;

    @aa1
    private final Lazy sportStart$delegate;

    @aa1
    private AppUser userProfile;

    public BaseSportV2Fragment() {
        this.root_view$delegate = LazyKt__LazyJVMKt.iO(new OOIX1OX1i(this));
        this.ivGpsSignal$delegate = LazyKt__LazyJVMKt.iO(new IOX1i0XO(this));
        this.distanceNow$delegate = LazyKt__LazyJVMKt.iO(new OIOOI0X1(this));
        this.distanceUnit$delegate = LazyKt__LazyJVMKt.iO(new i1XIi(this));
        this.gpsLl$delegate = LazyKt__LazyJVMKt.iO(new iXO0(this));
        this.cumulativeRunningLl$delegate = LazyKt__LazyJVMKt.iO(new IOOI011O1(this));
        this.sportSet$delegate = LazyKt__LazyJVMKt.iO(new i1XXIX1O(this));
        this.sportHot$delegate = LazyKt__LazyJVMKt.iO(new IIiXOiX(this));
        this.sportRecommendationCourse$delegate = LazyKt__LazyJVMKt.iO(new XiIX1OO(this));
        this.sportStart$delegate = LazyKt__LazyJVMKt.iO(new OO0(this));
        this.sportGoalSet$delegate = LazyKt__LazyJVMKt.iO(new IIX1O10OI(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new OIXXOI(this));
        this.ivBg$delegate = LazyKt__LazyJVMKt.iO(new Xi00XOi(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.iO(new O1Xi0I1());
    }

    public static /* synthetic */ void I0IIOi(BaseSportV2Fragment r0, View r1) {
        initView$lambda$3(r0, r1);
    }

    public static /* synthetic */ LinearLayout I0iXXO(BaseSportV2Fragment r0) {
        return gpsLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView I1XOi1(BaseSportV2Fragment r0) {
        return sportHot_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(BaseSportV2Fragment r0, View r1) {
        initView$lambda$5(r0, r1);
    }

    public static /* synthetic */ WorkoutDao IO() {
        return mWorkoutDao_delegate$lambda$0();
    }

    public static /* synthetic */ ImageView IiI10X(BaseSportV2Fragment r0) {
        return ivGpsSignal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView O00(BaseSportV2Fragment r0) {
        return ivBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout O10IXXX0X(BaseSportV2Fragment r0) {
        return cumulativeRunningLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OII(BaseSportV2Fragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit OIX0iXi(BaseSportV2Fragment r0, PermissionStatus r1) {
        return startSport$lambda$0(r0, r1);
    }

    public static /* synthetic */ void OIi0(BaseSportV2Fragment r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ RelativeLayout OiIIX101O(BaseSportV2Fragment r0) {
        return root_view_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageButton X0O(BaseSportV2Fragment r0) {
        return sportStart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X1ii(BaseSportV2Fragment r0) {
        return sportSet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XIi00iiXO(BaseSportV2Fragment r0) {
        return sportRecommendationCourse_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XO0O10(BaseSportV2Fragment r0) {
        return distanceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XOO0ii0(BaseSportV2Fragment r0, boolean r1) {
        return onStartSport$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageView XX0(BaseSportV2Fragment r0) {
        return sportGoalSet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XXI(BaseSportV2Fragment r0) {
        return distanceNow_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(BaseSportV2Fragment r0, View r1) {
        initView$lambda$4(r0, r1);
    }

    public static /* synthetic */ void XiOIii1(BaseSportV2Fragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private static final LinearLayout cumulativeRunningLl_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.cumulativeRunningLl);
    }

    private static final DINCondBold distanceNow_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.distanceNow);
    }

    private static final PFMedium distanceUnit_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.nowGoalUnit);
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) getValue();
    }

    private static final LinearLayout gpsLl_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.gpsLl);
    }

    public static /* synthetic */ boolean iIiiO(BaseSportV2Fragment r0) {
        return locationServerRemind$lambda$0$0(r0);
    }

    public static /* synthetic */ RecyclerView iO(BaseSportV2Fragment r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(BaseSportV2Fragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), GoalSettingActivity.class));
    }

    private static final void initView$lambda$1(BaseSportV2Fragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), SportSettingActivity.class));
    }

    private static final void initView$lambda$2(BaseSportV2Fragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), AllCourseActivity.class));
    }

    private static final void initView$lambda$3(BaseSportV2Fragment r3, View r4) {
        BleConnector r5 = BleConnector.INSTANCE;
        LogUtils.i(new Object[]{"startSport2" + r5.isBound()});
        if (q62.OXO1.X0100I() == true) goto L5;
        r3.onStartSport();
        return;
    L5:
        if (BluetoothAdapter.getDefaultAdapter().isEnabled() == true) goto L7;
    L10:
        ToastUtils.showLong(R.string.ble_not_bind);
        return;
    L7:
        if (r5.isBound() == false) goto L10;
        r3.onStartSport();
    }

    private static final void initView$lambda$4(BaseSportV2Fragment r3, View r4) {
        int r5 = r3.mSportMode;
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", r5);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r6 = new Intent(r3.getActivity(), SportGoalSetActivity.class);
        r6.putExtras(r0);
        r3.startActivity(r6);
    }

    private static final void initView$lambda$5(BaseSportV2Fragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), SportRecordsActivity.class));
    }

    private static final ImageView ivBg_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.iv_bg);
    }

    private static final ImageView ivGpsSignal_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.ivGpsSignal);
    }

    private static final boolean locationServerRemind$lambda$0$0(BaseSportV2Fragment r2) {
        r2.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 6);
        return true;
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.sportRecommendationRecycler);
    }

    private static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    private final void onStartSport() {
        if (UtilsKt.X1() == true) goto L7;
        locationServerRemind();
        return;
    L7:
        if (q62.OXO1.XIXO0iiO(this.mSportMode) == false) goto L10;
        hr1.X0i1O(hr1.OXO1, getMActivity(), false, false, new i1iOii00(this), 6, null);
        return;
    L10:
        startSport();
    }

    private static final Unit onStartSport$lambda$0(BaseSportV2Fragment r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.startSport();
    L5:
        return Unit.OXO1;
    }

    private static final RelativeLayout root_view_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.root_view);
    }

    private static final ImageView sportGoalSet_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.sportGoalSet);
    }

    private static final ImageView sportHot_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.sportHot);
    }

    private static final PFMedium sportRecommendationCourse_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.sportRecommendationCourse);
    }

    private static final PFMedium sportSet_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.sportSet);
    }

    private static final ImageButton sportStart_delegate$lambda$0(BaseSportV2Fragment r1) {
        return (ImageButton) r1.getMView().findViewById(R.id.sportStart);
    }

    private static final Unit startSport$lambda$0(BaseSportV2Fragment r3, PermissionStatus r4) {
        Intrinsics.X0O(r4, "it");
        int r5 = r3.mSportMode;
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", r5);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r6 = new Intent(r3.getActivity(), SportOnGoingGpsActivity.class);
        r6.putExtras(r0);
        r3.startActivity(r6);
        return Unit.OXO1;
    }

    public final LinearLayout getCumulativeRunningLl() {
        return (LinearLayout) getValue();
    }

    public final DINCondBold getDistanceNow() {
        return (DINCondBold) getValue();
    }

    public final PFMedium getDistanceUnit() {
        return (PFMedium) getValue();
    }

    public final LinearLayout getGpsLl() {
        return (LinearLayout) getValue();
    }

    public final ImageView getIvBg() {
        return (ImageView) getValue();
    }

    public final ImageView getIvGpsSignal() {
        return (ImageView) getValue();
    }

    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    public final int getMSportMode() {
        return this.mSportMode;
    }

    public final RelativeLayout getRoot_view() {
        return (RelativeLayout) getValue();
    }

    public final ImageView getSportGoalSet() {
        return (ImageView) getValue();
    }

    public final ImageView getSportHot() {
        return (ImageView) getValue();
    }

    public final PFMedium getSportRecommendationCourse() {
        return (PFMedium) getValue();
    }

    public final PFMedium getSportSet() {
        return (PFMedium) getValue();
    }

    public final ImageButton getSportStart() {
        return (ImageButton) getValue();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    public final void initRecyclerView() {
        JsonArray r0 = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.IXiOXO)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r0);     // Catch: Exception -> L8
        Collection r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r2 = r0.iterator();     // Catch: Exception -> L8
    L5:
        if (r2.hasNext() == false) goto L9;
        JsonElement r3 = r2.next();     // Catch: Exception -> L8
        r1.add(new Gson().fromJson(r3, CourseList.class));     // Catch: Exception -> L8
    L9:
        this.mCourseList = CollectionsKt___CollectionsKt.OO0Oi10(r1);
        BaseSportV2Fragment$initRecyclerView$mAdapter$1 r4 = new BaseSportV2Fragment$initRecyclerView$mAdapter$1(this, requireActivity(), this.mCourseList);
        getMRecyclerView().setAdapter(r4);
        return;
    L8:
        r1 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }

    public void initView() {
        getSportSet().setOnClickListener(new O1iiiO(this));
        getSportHot().setOnClickListener(new OIX1OII(this));
        getSportRecommendationCourse().setOnClickListener(new Ii0i0i(this));
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(requireActivity()));
        initRecyclerView();
        getSportStart().setOnClickListener(new OI1X100iX(this));
        getSportGoalSet().setOnClickListener(new iOX1i0(this));
        getCumulativeRunningLl().setOnClickListener(new i001OX(this));
        showDistance(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_gps_sport_v2;
    }

    public final void locationServerRemind() {
        if (this.mLocationServerPopup != null) goto L5;
        go0 r0 = new go0(getMActivity(), 0, 2, null);
        r0.O1O(R.string.location_server_notification);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new OXXI(this));
        this.mLocationServerPopup = r0;
    L5:
        ToastUtils.showLong(R.string.no_location_authorization_key);
        go0 r1 = this.mLocationServerPopup;
        if (r1 == null) goto L9;
        r1.X0O(R.id.root_view);
        return;
    }

    public final void setMSportMode(int r1) {
        this.mSportMode = r1;
    }

    @sf5(tag = I01XX0.O00)
    public final void showDistance(@aa1 Object r33) {
        Intrinsics.X0O(r33, "data");
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        Iterator<T> r4 = getMWorkoutDao().getListByMode(this.mSportMode, !i72.OXO1.XXI0XOIX() ? 1 : 0).iterator();
        int r5 = 0;
    L8:
        if (r4.hasNext() == false) goto L10;
        r5 = r5 + ((Workout) r4.next()).getMDistance();
        goto L8
    L10:
        getDistanceNow().setText(String.valueOf(cp5.X1ii(r5, this.userProfile.getUnit(), false, 4, null)));
        getDistanceUnit().setText(getString(cp5.XX0(this.userProfile.getUnit())));
    }

    @sf5(tag = "test_refresh_page")
    public final void showRecyclerViewData(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initRecyclerView();
    }

    public void startSport() {
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.ACTIVITY_RECOGNITION});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        String r1 = getString(R.string.activity_explain_title);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        String r3 = getString(R.string.activity_explain_content);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        ds1.XIi00iiXO(r0, r1, r3, new X0I00iXi0(this));
    }
}
