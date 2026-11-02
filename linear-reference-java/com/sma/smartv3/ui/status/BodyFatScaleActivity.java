package com.sma.smartv3.ui.status;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I1IOXIO1;
import com.android.mltcode.paycertificationapi.I1O01;
import com.android.mltcode.paycertificationapi.I1XXOIi01;
import com.android.mltcode.paycertificationapi.II1IO1i1X;
import com.android.mltcode.paycertificationapi.IX0IO1X1i;
import com.android.mltcode.paycertificationapi.IXX0OXX;
import com.android.mltcode.paycertificationapi.IiXX1;
import com.android.mltcode.paycertificationapi.O10i0OOi;
import com.android.mltcode.paycertificationapi.OII0000;
import com.android.mltcode.paycertificationapi.OO01O0X;
import com.android.mltcode.paycertificationapi.X01O1XO0i;
import com.android.mltcode.paycertificationapi.X10X1I;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XIXOXOi;
import com.android.mltcode.paycertificationapi.XIi0Ii;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i0010I11;
import com.android.mltcode.paycertificationapi.i00OXI0;
import com.android.mltcode.paycertificationapi.i0XXiOi00;
import com.android.mltcode.paycertificationapi.iX1I1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.xd6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WeightDao;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import com.vtrump.vtble.VTDevice;
import com.vtrump.vtble.XO0O10;
import com.vtrump.vtble.iO;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBodyFatScaleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyFatScaleActivity.kt\ncom/sma/smartv3/ui/status/BodyFatScaleActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,389:1\n19#2:390\n15#2:391\n11#2,2:392\n*S KotlinDebug\n*F\n+ 1 BodyFatScaleActivity.kt\ncom/sma/smartv3/ui/status/BodyFatScaleActivity\n*L\n53#1:390\n53#1:391\n270#1:392,2\n*E\n"})
public final class BodyFatScaleActivity extends BaseActivity implements iO.XIi00iiXO {

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private AppUser appUser;

    @aa1
    private final Lazy btnMeasureWeight$delegate;
    private boolean isDone;

    @aa1
    private final XIi00iiXO listener;

    @aa1
    private final Lazy llWeightMeasure$delegate;

    @aa1
    private final Lazy llWeightMeasureInfo$delegate;

    @tb1
    private iO mBleManager;

    @tb1
    private go0 mErrorTipPopup;

    @tb1
    private go0 mPermissionBackgroundPopup;

    @tb1
    private go0 mPermissionPopup;

    @tb1
    private go0 mSaveTipPopup;

    @tb1
    private XO0O10 mVtDeviceScale;

    @tb1
    private Weight mWeight;

    @aa1
    private final WeightDao mWeightDao;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvGreet$delegate;

    @aa1
    private final Lazy tvMeasureTip$delegate;

    @aa1
    private final Lazy tvTip$delegate;

    @aa1
    private final Lazy tvWeightValue$delegate;

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[PermissionStatus.values().length];
            r0[PermissionStatus.GRANTED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r0[PermissionStatus.DENIED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            OXO1 = r0;
        }
    }

    public static final class XIi00iiXO extends XO0O10.O00 {
        public final /* synthetic */ BodyFatScaleActivity OXO1;

        public XIi00iiXO(BodyFatScaleActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.vtrump.vtble.XO0O10.O00
        public void OXO1(String r87) {
            super.OXO1(r87);
            X01O1XO0i r0 = (X01O1XO0i) GsonUtils.fromJson(r87, X01O1XO0i.class);
            LogUtils.d(new Object[]{"bodyFatScale.code = " + r0.IiI10X()});
            if (r0.IiI10X() != 200) goto L17;
            JSONObject r2 = new JSONObject();
            r2.put("age", WeightMeasureDataKt.getAgeByBirth(BodyFatScaleActivity.access$getAppUser$p(this.OXO1).getBirthday()));     // Catch: JSONException -> L10
            r2.put("height", Float.valueOf(BodyFatScaleActivity.access$getAppUser$p(this.OXO1).getHeight()));     // Catch: JSONException -> L10
            int r4 = 1;
            if (BodyFatScaleActivity.access$getAppUser$p(this.OXO1).getGender() != 1) goto L8;
            r4 = 0;
        L8:
            r2.put("gender", r4);     // Catch: JSONException -> L10
        L12:
            LogUtils.d(new Object[]{r2});
            XO0O10 r1 = BodyFatScaleActivity.access$getMVtDeviceScale$p(this.OXO1);
            if (r1 == null) goto L31;
            r1.XX00i10X(r2);
            return;
        L31:
            return;
        L10:
            e = move-exception;
            e.printStackTrace();
            goto L12
        L17:
            if (r0.IiI10X() != 0) goto L27;
            BodyFatScaleActivity.access$setMWeight$p(this.OXO1, new Weight(0, 0, null, 0.0f, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0.0d, null, null, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0, 0, 0, -1, 2097151, null));
            Weight r3 = BodyFatScaleActivity.access$getMWeight$p(this.OXO1);
            if (r3 == null) goto L21;
            Intrinsics.XXI(r0);
            r3.setBodyFatScale(r0);
        L21:
            TextView r5 = BodyFatScaleActivity.access$getTvWeightValue(this.OXO1);
            Weight r6 = BodyFatScaleActivity.access$getMWeight$p(this.OXO1);
            if (r6 == null) goto L24;
            Float r7 = Float.valueOf(r6.getMWeight());
        L25:
            r5.setText(String.valueOf(r7));
            BodyFatScaleActivity.access$handlerMeasureDoneState(this.OXO1);
            LogUtils.d(new Object[]{"Done - > " + r0});
            return;
        L24:
            r7 = null;
            goto L25
        L27:
            BodyFatScaleActivity r8 = this.OXO1;
            Intrinsics.XXI(r0);
            BodyFatScaleActivity.access$handlerMeasureErrorState(r8, r0);
        }
    }

    public BodyFatScaleActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new IXX0OXX(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new OII0000(this));
        this.tvWeightValue$delegate = LazyKt__LazyJVMKt.iO(new O10i0OOi(this));
        this.llWeightMeasure$delegate = LazyKt__LazyJVMKt.iO(new XIi0Ii(this));
        this.llWeightMeasureInfo$delegate = LazyKt__LazyJVMKt.iO(new I1O01(this));
        this.tvMeasureTip$delegate = LazyKt__LazyJVMKt.iO(new II1IO1i1X(this));
        this.tvTip$delegate = LazyKt__LazyJVMKt.iO(new iX1I1(this));
        this.btnMeasureWeight$delegate = LazyKt__LazyJVMKt.iO(new i0XXiOi00(this));
        this.tvGreet$delegate = LazyKt__LazyJVMKt.iO(new X10X1I(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.appUser = (AppUser) r2;
        this.mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
        this.listener = new XIi00iiXO(this);
    }

    public static /* synthetic */ TextView I0iXXO(BodyFatScaleActivity r0) {
        return tvWeightValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1(BodyFatScaleActivity r0) {
        return permissionBackgroundLocationRemind$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(BodyFatScaleActivity r0, PermissionStatus r1) {
        return requestLocationPermission$lambda$0(r0, r1);
    }

    public static /* synthetic */ View IIX1OXO(BodyFatScaleActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(BodyFatScaleActivity r0) {
        return tvMeasureTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OII(BodyFatScaleActivity r0) {
        return tvGreet_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OIX0iXi(BodyFatScaleActivity r0) {
        return llWeightMeasure_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OX(BodyFatScaleActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OiIIX101O(BodyFatScaleActivity r0) {
        return llWeightMeasureInfo_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button X0O(BodyFatScaleActivity r0) {
        return btnMeasureWeight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X1ii(BodyFatScaleActivity r0) {
        return tvTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XX0(BodyFatScaleActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean XXI(BodyFatScaleActivity r0) {
        return handlerMeasureErrorState$lambda$0$1(r0);
    }

    public static /* synthetic */ boolean XiOIO(BodyFatScaleActivity r0) {
        return onTitleLeftClick$lambda$0$1(r0);
    }

    public static /* synthetic */ boolean XiOIii1() {
        return permissionRemind$lambda$0$0();
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(BodyFatScaleActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ AppUser access$getAppUser$p(BodyFatScaleActivity r0) {
        return r0.appUser;
    }

    public static final /* synthetic */ XO0O10 access$getMVtDeviceScale$p(BodyFatScaleActivity r0) {
        return r0.mVtDeviceScale;
    }

    public static final /* synthetic */ Weight access$getMWeight$p(BodyFatScaleActivity r0) {
        return r0.mWeight;
    }

    public static final /* synthetic */ TextView access$getTvWeightValue(BodyFatScaleActivity r0) {
        return r0.getTvWeightValue();
    }

    public static final /* synthetic */ void access$handlerMeasureDoneState(BodyFatScaleActivity r0) {
        r0.handlerMeasureDoneState();
    }

    public static final /* synthetic */ void access$handlerMeasureErrorState(BodyFatScaleActivity r0, X01O1XO0i r1) {
        r0.handlerMeasureErrorState(r1);
    }

    public static final /* synthetic */ void access$setMWeight$p(BodyFatScaleActivity r0, Weight r1) {
        r0.mWeight = r1;
    }

    private static final Button btnMeasureWeight_delegate$lambda$0(BodyFatScaleActivity r1) {
        return (Button) r1.findViewById(R.id.btn_measure_weight);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final Button getBtnMeasureWeight() {
        return (Button) getValue();
    }

    private final View getLlWeightMeasure() {
        return (View) getValue();
    }

    private final View getLlWeightMeasureInfo() {
        return (View) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final PFMedium getTvGreet() {
        return (PFMedium) getValue();
    }

    private final TextView getTvMeasureTip() {
        return (TextView) getValue();
    }

    private final View getTvTip() {
        return (View) getValue();
    }

    private final TextView getTvWeightValue() {
        return (TextView) getValue();
    }

    private final void handlerMeasureDoneState() {
        this.isDone = true;
        getAbhTitleRight().setVisibility(0);
        getLlWeightMeasure().setVisibility(8);
        getLlWeightMeasureInfo().setVisibility(0);
        getBtnMeasureWeight().setEnabled(true);
        getBtnMeasureWeight().setText(R.string.measure_again_tip);
        getTvMeasureTip().setText(R.string.measure_connected_tip);
        getTvTip().setVisibility(0);
    }

    private final void handlerMeasureErrorState(X01O1XO0i r5) {
        LogUtils.d(new Object[]{"Error - > " + r5});
        int r6 = 0;
        this.isDone = false;
        getAbhTitleRight().setVisibility(8);
        getLlWeightMeasure().setVisibility(0);
        getLlWeightMeasureInfo().setVisibility(8);
        getBtnMeasureWeight().setEnabled(true);
        getBtnMeasureWeight().setText(R.string.measure_again_tip);
        getTvMeasureTip().setText(R.string.measure_connected_tip);
        getTvTip().setVisibility(8);
        if (this.mErrorTipPopup != null) goto L5;
        go0 r0 = new go0(this, r6, 2, null);
        r0.I0iXXO(false);
        r0.O1O(R.string.measure_error_tip);
        r0.iX1O1(Integer.valueOf(R.string.give_up), new i0010I11(this));
        r0.X1IX(R.string.measure_again_tip, new XIXOXOi(this));
        this.mErrorTipPopup = r0;
    L5:
        go0 r7 = this.mErrorTipPopup;
        if (r7 == null) goto L9;
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r7.I1XOi1(r1);
        return;
    }

    private static final boolean handlerMeasureErrorState$lambda$0$0(BodyFatScaleActivity r0) {
        r0.finish();
        return true;
    }

    private static final boolean handlerMeasureErrorState$lambda$0$1(BodyFatScaleActivity r0) {
        r0.scan();
        return true;
    }

    private final void handlerMeasureTimeoutState() {
        this.isDone = false;
        getAbhTitleRight().setVisibility(8);
        getLlWeightMeasure().setVisibility(0);
        getLlWeightMeasureInfo().setVisibility(8);
        getBtnMeasureWeight().setEnabled(true);
        getBtnMeasureWeight().setText(R.string.measure_again_tip);
        getTvMeasureTip().setText(R.string.measure_connected_timeout_tip);
        getTvTip().setVisibility(8);
    }

    private final void handlerMeasuringState() {
        this.isDone = false;
        getAbhTitleRight().setVisibility(8);
        getLlWeightMeasure().setVisibility(0);
        getLlWeightMeasureInfo().setVisibility(8);
        getBtnMeasureWeight().setEnabled(false);
        getBtnMeasureWeight().setText(R.string.measure_measuring_tip);
        getTvMeasureTip().setText(R.string.measure_connected_tip);
        getTvTip().setVisibility(0);
    }

    private final void handlerNoMeasureState() {
        this.isDone = false;
        getAbhTitleRight().setVisibility(8);
        getLlWeightMeasure().setVisibility(0);
        getLlWeightMeasureInfo().setVisibility(8);
        getBtnMeasureWeight().setEnabled(true);
        getBtnMeasureWeight().setText(R.string.btn_weigh);
        getTvMeasureTip().setText(R.string.measure_connected_tip);
        getTvTip().setVisibility(0);
    }

    private final void handlerUnconnectState() {
        this.isDone = false;
        getAbhTitleRight().setVisibility(8);
        getLlWeightMeasure().setVisibility(0);
        getLlWeightMeasureInfo().setVisibility(8);
        getBtnMeasureWeight().setEnabled(true);
        getBtnMeasureWeight().setText(R.string.measure_again_tip);
        getTvMeasureTip().setText(R.string.measure_unconnected_tip);
        getTvTip().setVisibility(8);
    }

    public static /* synthetic */ boolean iIiiO(BodyFatScaleActivity r0) {
        return onTitleLeftClick$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean iOOX010X(BodyFatScaleActivity r0) {
        return handlerMeasureErrorState$lambda$0$0(r0);
    }

    private static final void initView$lambda$0(BodyFatScaleActivity r0, View r1) {
        if (PermissionUtils.isGranted(new String[]{"android.permission.ACCESS_FINE_LOCATION"}) == true) goto L7;
        r0.requestLocationPermission();
        return;
    L7:
        if (BluetoothAdapter.getDefaultAdapter().isEnabled() == true) goto L10;
        r0.requestEnableBluetooth();
        return;
    L10:
        r0.scan();
    }

    private static final View llWeightMeasureInfo_delegate$lambda$0(BodyFatScaleActivity r1) {
        return r1.findViewById(R.id.ll_weight_measure_info);
    }

    private static final View llWeightMeasure_delegate$lambda$0(BodyFatScaleActivity r1) {
        return r1.findViewById(R.id.ll_weight_measure);
    }

    private static final boolean onTitleLeftClick$lambda$0$0(BodyFatScaleActivity r0) {
        r0.finish();
        return true;
    }

    private static final boolean onTitleLeftClick$lambda$0$1(BodyFatScaleActivity r0) {
        r0.save();
        return true;
    }

    @RequiresApi(29)
    private final void permissionBackgroundLocationRemind() {
        if (this.mPermissionBackgroundPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.background_set_remind);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new IiXX1(this));
        this.mPermissionBackgroundPopup = r0;
    L5:
        go0 r1 = this.mPermissionBackgroundPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    private static final boolean permissionBackgroundLocationRemind$lambda$0$0(BodyFatScaleActivity r2) {
        r2.getMContext().requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 3);
        return true;
    }

    private static final boolean permissionRemind$lambda$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    private final void requestEnableBluetooth() {
        X1OOO.IIX1OXO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 1, 0, 4, null);
    }

    private final void requestLocationPermission() {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        permissionBackgroundLocationRemind();
        return;
    L6:
        PermissionUtils r1 = PermissionUtils.permission(new String[]{PermissionConstants.LOCATION});
        Intrinsics.O10IXXX0X(r1, "permission(...)");
        ds1.iO(r1, null, null, new i00OXI0(this), 3, null);
    }

    private static final Unit requestLocationPermission$lambda$0(BodyFatScaleActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        int r3 = OXO1.OXO1[r2.ordinal()];
        if (r3 != 1) goto L5;
        r1.scan();
    L9:
        return Unit.OXO1;
    L5:
        if (r3 == 2) goto L9;
        r1.permissionRemind();
        goto L9
    }

    private static final View rootView_delegate$lambda$0(BodyFatScaleActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private final void save() {
        Weight r0 = this.mWeight;
        if (r0 == null) goto L5;
        this.appUser.setWeight(r0.getMWeight());
        SPUtils r1 = a01.OXO1.IiI10X();
        AppUser r2 = this.appUser;
        r1.put(AppUser.class.getName(), new Gson().toJson(r2));
        this.mWeightDao.insert(CollectionsKt__CollectionsKt.Ii1iii0(new Weight[]{r0}));
        I01XX0.OXO1(I01XX0.I0iXXO, r0);
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
    L5:
        finish();
    }

    private final void scan() {
        handlerMeasuringState();
        iO r0 = this.mBleManager;
        if (r0 == null) goto L5;
        r0.XX1Oi();
    L5:
        iO r1 = this.mBleManager;
        if (r1 == null) goto L9;
        r1.XOXOIX0Oi(30, CollectionsKt__CollectionsKt.iIiiO(new xd6[]{new xd6((byte) 3, (byte) 3, (byte) 6, (byte) 15)}));
        return;
    }

    private static final PFMedium tvGreet_delegate$lambda$0(BodyFatScaleActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_greet);
    }

    private static final TextView tvMeasureTip_delegate$lambda$0(BodyFatScaleActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_measure_tip);
    }

    private static final View tvTip_delegate$lambda$0(BodyFatScaleActivity r1) {
        return r1.findViewById(R.id.tv_tip);
    }

    private static final TextView tvWeightValue_delegate$lambda$0(BodyFatScaleActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_weightValue);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        iO r3 = iO.iOI();
        this.mBleManager = r3;
        if (r3 == null) goto L5;
        r3.I0IIOI("7LKL5L3QEU1JFAGZ");
    L5:
        iO r4 = this.mBleManager;
        if (r4 == null) goto L13;
        r4.IX0iIX(this);
    L13:
        iO r5 = this.mBleManager;     // Catch: Exception -> L12
        if (r5 == null) goto L15;
        r5.OI(this);     // Catch: Exception -> L12
        return;
    L15:
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measure_weight);
        getAbhTitleRight().setImageResource(R.drawable.ic_confirm);
        PFMedium r0 = getTvGreet();
        int r1 = new Date().getHours();
        if (6 > r1) goto L6;
        if (r1 >= 11) goto L6;
        String r2 = getString(R.string.greet_good_morning);
    L16:
        r0.setText(r2);
        getBtnMeasureWeight().setOnClickListener(new IX0IO1X1i(this));
        handlerNoMeasureState();
        return;
    L6:
        int r3 = new Date().getHours();
        if (11 > r3) goto L10;
        if (r3 >= 13) goto L10;
        r2 = getString(R.string.greet_good_nooning);
    L10:
        int r4 = new Date().getHours();
        if (13 <= r4) goto L13;
    L15:
        r2 = getString(R.string.greet_good_evening);
        goto L16
    L13:
        if (r4 >= 19) goto L15;
        r2 = getString(R.string.greet_good_afternoon);
        goto L16
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_body_fat_scale;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        iO r0 = this.mBleManager;
        if (r0 == null) goto L6;
        r0.O101();
        return;
    }

    @Override // com.vtrump.vtble.iO.XIi00iiXO
    public void onDeviceAdvDiscovered(@tb1 VTDevice r3) {
        LogUtils.d(new Object[]{"onDeviceAdvDiscovered " + r3});
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.vtrump.vtble.VTDeviceScale");
        XO0O10 r4 = (XO0O10) r3;
        this.mVtDeviceScale = r4;
        if (r4 == null) goto L6;
        r4.XOXiX0(this.listener);
        return;
    }

    @Override // com.vtrump.vtble.iO.XIi00iiXO
    public void onDeviceConnected(@tb1 VTDevice r3) {
        LogUtils.d(new Object[]{"onDeviceConnected " + r3});
        handlerNoMeasureState();
    }

    @Override // com.vtrump.vtble.iO.XIi00iiXO
    public void onDeviceDisconnected(@tb1 VTDevice r3) {
        LogUtils.d(new Object[]{"onDeviceDisconnected " + r3});
        handlerUnconnectState();
    }

    @Override // com.vtrump.vtble.iO.XIi00iiXO
    public void onDeviceDiscovered(@tb1 VTDevice r3, int r4) {
        LogUtils.d(new Object[]{"onDeviceDiscovered  " + r3 + "  -- " + r4});
    }

    @Override // com.vtrump.vtble.iO.XIi00iiXO
    public void onDeviceServiceDiscovered(@tb1 VTDevice r3) {
        LogUtils.d(new Object[]{"onDeviceServiceDiscovered " + r3});
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.vtrump.vtble.VTDeviceScale");
        XO0O10 r4 = (XO0O10) r3;
        this.mVtDeviceScale = r4;
        if (r4 == null) goto L6;
        r4.XOXiX0(this.listener);
        return;
    }

    @Override // com.vtrump.vtble.iO.XIi00iiXO
    public void onInited() {
        LogUtils.d(new Object[]{"onInited"});
    }

    @Override // com.vtrump.vtble.iO.XIi00iiXO
    public void onScanStop() {
        LogUtils.d(new Object[]{"onScanStop"});
    }

    @Override // com.vtrump.vtble.iO.XIi00iiXO
    public void onScanTimeOut() {
        LogUtils.d(new Object[]{"onScanTimeOut"});
        handlerMeasureTimeoutState();
    }

    public final void onTitleLeftClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.isDone == true) goto L5;
        finish();
        return;
    L5:
        if (this.mSaveTipPopup != null) goto L7;
        int r2 = 0;
        go0 r5 = new go0(this, r2, 2, null);
        r5.O1O(R.string.save_weight_tip);
        r5.iX1O1(Integer.valueOf(R.string.give_up), new I1IOXIO1(this));
        r5.X1IX(R.string.save, new OO01O0X(this));
        this.mSaveTipPopup = r5;
    L7:
        go0 r6 = this.mSaveTipPopup;
        if (r6 == null) goto L13;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    public void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        save();
    }

    public final void permissionRemind() {
        if (this.mPermissionPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.permission_set_remind);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new I1XXOIi01());
        this.mPermissionPopup = r0;
    L5:
        go0 r1 = this.mPermissionPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }
}
