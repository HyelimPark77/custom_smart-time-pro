package com.sma.smartv3.ui.sport;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I100IIO;
import com.android.mltcode.paycertificationapi.IO1X;
import com.android.mltcode.paycertificationapi.IOOIXX;
import com.android.mltcode.paycertificationapi.IXIXX;
import com.android.mltcode.paycertificationapi.IXXI1O1;
import com.android.mltcode.paycertificationapi.IXii01X0;
import com.android.mltcode.paycertificationapi.IiIOX00iI;
import com.android.mltcode.paycertificationapi.O1XXOIiI0;
import com.android.mltcode.paycertificationapi.OI1i1i0O;
import com.android.mltcode.paycertificationapi.OIO0X1;
import com.android.mltcode.paycertificationapi.Oi1II;
import com.android.mltcode.paycertificationapi.OiI0XIi;
import com.android.mltcode.paycertificationapi.XIiOOIXI0;
import com.android.mltcode.paycertificationapi.XO0XO0X0X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i10Xi0i10;
import com.android.mltcode.paycertificationapi.iI0000X;
import com.android.mltcode.paycertificationapi.iO00OI0i;
import com.android.mltcode.paycertificationapi.iOOiI1;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.ThirdPlatform;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.SportRecordsActivity;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleConnector;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBaseSportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportFragment.kt\ncom/sma/smartv3/ui/sport/BaseSportFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n19#2:149\n15#2:150\n19#2:151\n15#2:152\n1869#3,2:153\n78#4,3:155\n81#4,5:159\n99#4,7:164\n106#4,3:172\n79#4,7:175\n109#4:182\n78#4,3:183\n81#4,5:187\n99#4,7:192\n106#4,3:200\n79#4,7:203\n109#4:210\n1#5:158\n1#5:171\n1#5:186\n1#5:199\n*S KotlinDebug\n*F\n+ 1 BaseSportFragment.kt\ncom/sma/smartv3/ui/sport/BaseSportFragment\n*L\n53#1:149\n53#1:150\n124#1:151\n124#1:152\n126#1:153,2\n64#1:155,3\n64#1:159,5\n81#1:164,7\n81#1:172,3\n81#1:175,7\n81#1:182\n85#1:183,3\n85#1:187,5\n145#1:192,7\n145#1:200,3\n145#1:203,7\n145#1:210\n64#1:158\n81#1:171\n85#1:186\n145#1:199\n*E\n"})
public abstract class BaseSportFragment extends BaseFragment {

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
    private go0 mLocationServerPopup;
    private int mSportMode;

    @aa1
    private final Lazy mWorkoutDao$delegate;

    @aa1
    private final Lazy root_view$delegate;

    @aa1
    private final Lazy sportGoalSet$delegate;

    @aa1
    private final Lazy sportSet$delegate;

    @aa1
    private final Lazy sportStart$delegate;

    @aa1
    private AppUser userProfile;

    public BaseSportFragment() {
        this.root_view$delegate = LazyKt__LazyJVMKt.iO(new i10Xi0i10(this));
        this.ivGpsSignal$delegate = LazyKt__LazyJVMKt.iO(new OIO0X1(this));
        this.distanceNow$delegate = LazyKt__LazyJVMKt.iO(new O1XXOIiI0(this));
        this.distanceUnit$delegate = LazyKt__LazyJVMKt.iO(new IXIXX(this));
        this.gpsLl$delegate = LazyKt__LazyJVMKt.iO(new XIiOOIXI0(this));
        this.cumulativeRunningLl$delegate = LazyKt__LazyJVMKt.iO(new OiI0XIi(this));
        this.sportSet$delegate = LazyKt__LazyJVMKt.iO(new IXii01X0(this));
        this.sportStart$delegate = LazyKt__LazyJVMKt.iO(new Oi1II(this));
        this.sportGoalSet$delegate = LazyKt__LazyJVMKt.iO(new I100IIO(this));
        this.ivBg$delegate = LazyKt__LazyJVMKt.iO(new iOOiI1(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        int r3 = 0;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        int r10 = 0;
        int r11 = 0;
        float r12 = 0.0f;
        float r13 = 0.0f;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        String r18 = null;
        String r19 = null;
        float r20 = 0.0f;
        float r21 = 0.0f;
        int r22 = 0;
        int r23 = 0;
        String r24 = null;
        String r25 = null;
        String r26 = null;
        String r27 = null;
        ThirdPlatform r28 = null;
        boolean r29 = false;
        Object r2 = new AppUser(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, 134217727, null);
        Object r30 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r30 == null) goto L6;
        r2 = r30;
    L6:
        this.userProfile = (AppUser) r2;
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.iO(new OI1i1i0O());
    }

    public static /* synthetic */ ImageView I0IIOi(BaseSportFragment r0) {
        return sportSet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void I0iXXO(BaseSportFragment r0, View r1) {
        initView$lambda$3(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(BaseSportFragment r0, PermissionStatus r1) {
        return startSport$lambda$0(r0, r1);
    }

    public static /* synthetic */ WorkoutDao IIX1OXO() {
        return mWorkoutDao_delegate$lambda$0();
    }

    public static /* synthetic */ LinearLayout IO(BaseSportFragment r0) {
        return cumulativeRunningLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IiI10X(BaseSportFragment r0, boolean r1) {
        return onStartSport$lambda$0(r0, r1);
    }

    public static /* synthetic */ RelativeLayout O00(BaseSportFragment r0) {
        return root_view_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void O10IXXX0X(BaseSportFragment r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ void OIX0iXi(BaseSportFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void OIi0(BaseSportFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ ImageView X0O(BaseSportFragment r0) {
        return ivBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout X1ii(BaseSportFragment r0) {
        return gpsLl_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XIi00iiXO(BaseSportFragment r0) {
        return locationServerRemind$lambda$0$0(r0);
    }

    public static /* synthetic */ DINCondBold XO0O10(BaseSportFragment r0) {
        return distanceNow_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XOO0ii0(BaseSportFragment r0) {
        return ivGpsSignal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageButton XXI(BaseSportFragment r0) {
        return sportStart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XiOIO(BaseSportFragment r0) {
        return sportGoalSet_delegate$lambda$0(r0);
    }

    private static final LinearLayout cumulativeRunningLl_delegate$lambda$0(BaseSportFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.cumulativeRunningLl);
    }

    private static final DINCondBold distanceNow_delegate$lambda$0(BaseSportFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.distanceNow);
    }

    private static final PFMedium distanceUnit_delegate$lambda$0(BaseSportFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.nowGoalUnit);
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) getValue();
    }

    private static final LinearLayout gpsLl_delegate$lambda$0(BaseSportFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.gpsLl);
    }

    public static /* synthetic */ PFMedium iO(BaseSportFragment r0) {
        return distanceUnit_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(BaseSportFragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), SportSettingActivity.class));
    }

    private static final void initView$lambda$1(BaseSportFragment r3, View r4) {
        BleConnector r5 = BleConnector.INSTANCE;
        LogUtils.i(new Object[]{"startSport" + r5.isBound()});
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

    private static final void initView$lambda$2(BaseSportFragment r3, View r4) {
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

    private static final void initView$lambda$3(BaseSportFragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), SportRecordsActivity.class));
    }

    private static final ImageView ivBg_delegate$lambda$0(BaseSportFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.iv_bg);
    }

    private static final ImageView ivGpsSignal_delegate$lambda$0(BaseSportFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.ivGpsSignal);
    }

    private static final boolean locationServerRemind$lambda$0$0(BaseSportFragment r2) {
        r2.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 6);
        return true;
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
        hr1.X0i1O(hr1.OXO1, getMActivity(), false, false, new IXXI1O1(this), 6, null);
        return;
    L10:
        startSport();
    }

    private static final Unit onStartSport$lambda$0(BaseSportFragment r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.startSport();
    L5:
        return Unit.OXO1;
    }

    private static final RelativeLayout root_view_delegate$lambda$0(BaseSportFragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.root_view);
    }

    private static final ImageView sportGoalSet_delegate$lambda$0(BaseSportFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.sportGoalSet);
    }

    private static final ImageView sportSet_delegate$lambda$0(BaseSportFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.sportSet);
    }

    private static final ImageButton sportStart_delegate$lambda$0(BaseSportFragment r1) {
        return (ImageButton) r1.getMView().findViewById(R.id.sportStart);
    }

    private final void startSport() {
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.ACTIVITY_RECOGNITION});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        String r1 = getString(R.string.activity_explain_title);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        String r3 = getString(R.string.activity_explain_content);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        ds1.XIi00iiXO(r0, r1, r3, new iI0000X(this));
    }

    private static final Unit startSport$lambda$0(BaseSportFragment r3, PermissionStatus r4) {
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

    public final int getMSportMode() {
        return this.mSportMode;
    }

    public final RelativeLayout getRoot_view() {
        return (RelativeLayout) getValue();
    }

    public final ImageView getSportGoalSet() {
        return (ImageView) getValue();
    }

    public final ImageView getSportSet() {
        return (ImageView) getValue();
    }

    public final ImageButton getSportStart() {
        return (ImageButton) getValue();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    public void initView() {
        getSportSet().setOnClickListener(new iO00OI0i(this));
        getSportStart().setOnClickListener(new IOOIXX(this));
        getSportGoalSet().setOnClickListener(new IO1X(this));
        getCumulativeRunningLl().setOnClickListener(new XO0XO0X0X(this));
        showDistance(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_gps_sport;
    }

    public final void locationServerRemind() {
        if (this.mLocationServerPopup != null) goto L5;
        go0 r0 = new go0(getMActivity(), 0, 2, null);
        r0.O1O(R.string.location_server_notification);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new IiIOX00iI(this));
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
        Iterator<T> r4 = getMWorkoutDao().getListByMode(this.mSportMode, 1).iterator();
        int r5 = 0;
    L8:
        if (r4.hasNext() == false) goto L10;
        r5 = r5 + ((Workout) r4.next()).getMDistance();
        goto L8
    L10:
        float r6 = cp5.X1ii(r5, this.userProfile.getUnit(), false, 4, null);
        DINCondBold r7 = getDistanceNow();
        if (r6 != 0.0f) goto L13;
        String r8 = "0";
    L14:
        r7.setText(r8);
        getDistanceUnit().setText(getString(cp5.XX0(this.userProfile.getUnit())));
        return;
    L13:
        r8 = String.valueOf(r6);
        goto L14
    }
}
