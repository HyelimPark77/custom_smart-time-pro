package com.sma.smartv3.p610ui.status;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.X01O1XO0i;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
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
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WeightDao;
import com.sma.smartv3.p608db.entity.Weight;
import com.sma.smartv3.p610ui.status.BodyFatScaleActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import com.vtrump.vtble.C19753iO;
import com.vtrump.vtble.VTDevice;
import com.vtrump.vtble.XO0O10;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBodyFatScaleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyFatScaleActivity.kt\ncom/sma/smartv3/ui/status/BodyFatScaleActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,389:1\n19#2:390\n15#2:391\n11#2,2:392\n*S KotlinDebug\n*F\n+ 1 BodyFatScaleActivity.kt\ncom/sma/smartv3/ui/status/BodyFatScaleActivity\n*L\n53#1:390\n53#1:391\n270#1:392,2\n*E\n"})
public final class BodyFatScaleActivity extends BaseActivity implements C19753iO.XIi00iiXO {

    @aa1
    private AppUser appUser;
    private boolean isDone;

    @aa1
    private final XIi00iiXO listener;

    @tb1
    private C19753iO mBleManager;

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
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXX0OXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BodyFatScaleActivity.rootView_delegate$lambda$0(this.f2085IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OII0000
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BodyFatScaleActivity.abhTitleRight_delegate$lambda$0(this.f2942IO);
        }
    });

    @aa1
    private final Lazy tvWeightValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O10i0OOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BodyFatScaleActivity.tvWeightValue_delegate$lambda$0(this.f2644IO);
        }
    });

    @aa1
    private final Lazy llWeightMeasure$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIi0Ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BodyFatScaleActivity.llWeightMeasure_delegate$lambda$0(this.f4605IO);
        }
    });

    @aa1
    private final Lazy llWeightMeasureInfo$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1O01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BodyFatScaleActivity.llWeightMeasureInfo_delegate$lambda$0(this.f1403IO);
        }
    });

    @aa1
    private final Lazy tvMeasureTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.II1IO1i1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BodyFatScaleActivity.tvMeasureTip_delegate$lambda$0(this.f1545IO);
        }
    });

    @aa1
    private final Lazy tvTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX1I1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BodyFatScaleActivity.tvTip_delegate$lambda$0(this.f8277IO);
        }
    });

    @aa1
    private final Lazy btnMeasureWeight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0XXiOi00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BodyFatScaleActivity.btnMeasureWeight_delegate$lambda$0(this.f7458IO);
        }
    });

    @aa1
    private final Lazy tvGreet$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X10X1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BodyFatScaleActivity.tvGreet_delegate$lambda$0(this.f4160IO);
        }
    });

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[PermissionStatus.values().length];
            try {
                iArr[PermissionStatus.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionStatus.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OXO1 = iArr;
        }
    }

    public static final class XIi00iiXO extends XO0O10.O00 {
        public XIi00iiXO() {
        }

        @Override // com.vtrump.vtble.XO0O10.O00
        public void OXO1(String str) {
            super.OXO1(str);
            X01O1XO0i x01O1XO0i = (X01O1XO0i) GsonUtils.fromJson(str, X01O1XO0i.class);
            LogUtils.m11128d("bodyFatScale.code = " + x01O1XO0i.IiI10X());
            if (x01O1XO0i.IiI10X() == 200) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("age", WeightMeasureDataKt.getAgeByBirth(BodyFatScaleActivity.this.appUser.getBirthday()));
                    jSONObject.put("height", Float.valueOf(BodyFatScaleActivity.this.appUser.getHeight()));
                    jSONObject.put("gender", BodyFatScaleActivity.this.appUser.getGender() == 1 ? 0 : 1);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                LogUtils.m11128d(jSONObject);
                XO0O10 xo0o10 = BodyFatScaleActivity.this.mVtDeviceScale;
                if (xo0o10 != null) {
                    xo0o10.XX00i10X(jSONObject);
                    return;
                }
                return;
            }
            if (x01O1XO0i.IiI10X() != 0) {
                BodyFatScaleActivity bodyFatScaleActivity = BodyFatScaleActivity.this;
                Intrinsics.XXI(x01O1XO0i);
                bodyFatScaleActivity.handlerMeasureErrorState(x01O1XO0i);
                return;
            }
            BodyFatScaleActivity.this.mWeight = new Weight(0, 0L, null, 0.0f, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0.0d, null, null, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0, 0, 0, -1, 2097151, null);
            Weight weight = BodyFatScaleActivity.this.mWeight;
            if (weight != null) {
                Intrinsics.XXI(x01O1XO0i);
                weight.setBodyFatScale(x01O1XO0i);
            }
            TextView tvWeightValue = BodyFatScaleActivity.this.getTvWeightValue();
            Weight weight2 = BodyFatScaleActivity.this.mWeight;
            tvWeightValue.setText(String.valueOf(weight2 != null ? Float.valueOf(weight2.getMWeight()) : null));
            BodyFatScaleActivity.this.handlerMeasureDoneState();
            LogUtils.m11128d("Done - > " + x01O1XO0i);
        }
    }

    public BodyFatScaleActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.appUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
        this.listener = new XIi00iiXO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(BodyFatScaleActivity bodyFatScaleActivity) {
        return (ImageView) bodyFatScaleActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnMeasureWeight_delegate$lambda$0(BodyFatScaleActivity bodyFatScaleActivity) {
        return (Button) bodyFatScaleActivity.findViewById(R.id.btn_measure_weight);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final Button getBtnMeasureWeight() {
        return (Button) this.btnMeasureWeight$delegate.getValue();
    }

    private final View getLlWeightMeasure() {
        return (View) this.llWeightMeasure$delegate.getValue();
    }

    private final View getLlWeightMeasureInfo() {
        return (View) this.llWeightMeasureInfo$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final PFMedium getTvGreet() {
        return (PFMedium) this.tvGreet$delegate.getValue();
    }

    private final TextView getTvMeasureTip() {
        return (TextView) this.tvMeasureTip$delegate.getValue();
    }

    private final View getTvTip() {
        return (View) this.tvTip$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvWeightValue() {
        return (TextView) this.tvWeightValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlerMeasureDoneState() {
        this.isDone = true;
        getAbhTitleRight().setVisibility(0);
        getLlWeightMeasure().setVisibility(8);
        getLlWeightMeasureInfo().setVisibility(0);
        getBtnMeasureWeight().setEnabled(true);
        getBtnMeasureWeight().setText(R.string.measure_again_tip);
        getTvMeasureTip().setText(R.string.measure_connected_tip);
        getTvTip().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlerMeasureErrorState(X01O1XO0i x01O1XO0i) {
        LogUtils.m11128d("Error - > " + x01O1XO0i);
        this.isDone = false;
        getAbhTitleRight().setVisibility(8);
        getLlWeightMeasure().setVisibility(0);
        getLlWeightMeasureInfo().setVisibility(8);
        getBtnMeasureWeight().setEnabled(true);
        getBtnMeasureWeight().setText(R.string.measure_again_tip);
        getTvMeasureTip().setText(R.string.measure_connected_tip);
        getTvTip().setVisibility(8);
        if (this.mErrorTipPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.I0iXXO(false);
            go0Var.O1O(R.string.measure_error_tip);
            go0Var.iX1O1(Integer.valueOf(R.string.give_up), new Function0() { // from class: com.android.mltcode.paycertificationapi.i0010I11
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BodyFatScaleActivity.handlerMeasureErrorState$lambda$0$0(this.f7255IO));
                }
            });
            go0Var.X1IX(R.string.measure_again_tip, new Function0() { // from class: com.android.mltcode.paycertificationapi.XIXOXOi
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BodyFatScaleActivity.handlerMeasureErrorState$lambda$0$1(this.f4590IO));
                }
            });
            this.mErrorTipPopup = go0Var;
        }
        go0 go0Var2 = this.mErrorTipPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handlerMeasureErrorState$lambda$0$0(BodyFatScaleActivity bodyFatScaleActivity) {
        bodyFatScaleActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handlerMeasureErrorState$lambda$0$1(BodyFatScaleActivity bodyFatScaleActivity) {
        bodyFatScaleActivity.scan();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BodyFatScaleActivity bodyFatScaleActivity, View view) {
        if (!PermissionUtils.isGranted("android.permission.ACCESS_FINE_LOCATION")) {
            bodyFatScaleActivity.requestLocationPermission();
        } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            bodyFatScaleActivity.scan();
        } else {
            bodyFatScaleActivity.requestEnableBluetooth();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llWeightMeasureInfo_delegate$lambda$0(BodyFatScaleActivity bodyFatScaleActivity) {
        return bodyFatScaleActivity.findViewById(R.id.ll_weight_measure_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View llWeightMeasure_delegate$lambda$0(BodyFatScaleActivity bodyFatScaleActivity) {
        return bodyFatScaleActivity.findViewById(R.id.ll_weight_measure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleLeftClick$lambda$0$0(BodyFatScaleActivity bodyFatScaleActivity) {
        bodyFatScaleActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleLeftClick$lambda$0$1(BodyFatScaleActivity bodyFatScaleActivity) {
        bodyFatScaleActivity.save();
        return true;
    }

    @RequiresApi(29)
    private final void permissionBackgroundLocationRemind() {
        if (this.mPermissionBackgroundPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.background_set_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.IiXX1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BodyFatScaleActivity.permissionBackgroundLocationRemind$lambda$0$0(this.f2300IO));
                }
            });
            this.mPermissionBackgroundPopup = go0Var;
        }
        go0 go0Var2 = this.mPermissionBackgroundPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean permissionBackgroundLocationRemind$lambda$0$0(BodyFatScaleActivity bodyFatScaleActivity) {
        bodyFatScaleActivity.getMContext().requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean permissionRemind$lambda$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    private final void requestEnableBluetooth() {
        X1OOO.IIX1OXO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 1, 0, 4, null);
    }

    private final void requestLocationPermission() {
        if (Build.VERSION.SDK_INT >= 29) {
            permissionBackgroundLocationRemind();
            return;
        }
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.LOCATION);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.i00OXI0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BodyFatScaleActivity.requestLocationPermission$lambda$0(this.f7279IO, (PermissionStatus) obj);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationPermission$lambda$0(BodyFatScaleActivity bodyFatScaleActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        int i = OXO1.OXO1[it.ordinal()];
        if (i == 1) {
            bodyFatScaleActivity.scan();
        } else if (i != 2) {
            bodyFatScaleActivity.permissionRemind();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(BodyFatScaleActivity bodyFatScaleActivity) {
        return bodyFatScaleActivity.findViewById(R.id.root_view);
    }

    private final void save() {
        Weight weight = this.mWeight;
        if (weight != null) {
            this.appUser.setWeight(weight.getMWeight());
            a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(this.appUser));
            this.mWeightDao.insert(CollectionsKt__CollectionsKt.Ii1iii0(weight));
            I01XX0.OXO1(I01XX0.I0iXXO, weight);
            I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
        }
        finish();
    }

    private final void scan() {
        handlerMeasuringState();
        C19753iO c19753iO = this.mBleManager;
        if (c19753iO != null) {
            c19753iO.XX1Oi();
        }
        C19753iO c19753iO2 = this.mBleManager;
        if (c19753iO2 != null) {
            c19753iO2.XOXOIX0Oi(30, CollectionsKt__CollectionsKt.iIiiO(new xd6((byte) 3, (byte) 3, (byte) 6, (byte) 15)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvGreet_delegate$lambda$0(BodyFatScaleActivity bodyFatScaleActivity) {
        return (PFMedium) bodyFatScaleActivity.findViewById(R.id.tv_greet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMeasureTip_delegate$lambda$0(BodyFatScaleActivity bodyFatScaleActivity) {
        return (TextView) bodyFatScaleActivity.findViewById(R.id.tv_measure_tip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View tvTip_delegate$lambda$0(BodyFatScaleActivity bodyFatScaleActivity) {
        return bodyFatScaleActivity.findViewById(R.id.tv_tip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeightValue_delegate$lambda$0(BodyFatScaleActivity bodyFatScaleActivity) {
        return (TextView) bodyFatScaleActivity.findViewById(R.id.tv_weightValue);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        C19753iO c19753iOIOI = C19753iO.iOI();
        this.mBleManager = c19753iOIOI;
        if (c19753iOIOI != null) {
            c19753iOIOI.I0IIOI("7LKL5L3QEU1JFAGZ");
        }
        C19753iO c19753iO = this.mBleManager;
        if (c19753iO != null) {
            c19753iO.IX0iIX(this);
        }
        try {
            C19753iO c19753iO2 = this.mBleManager;
            if (c19753iO2 != null) {
                c19753iO2.m39182OI(this);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        String string;
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measure_weight);
        getAbhTitleRight().setImageResource(R.drawable.ic_confirm);
        PFMedium tvGreet = getTvGreet();
        int hours = new Date().getHours();
        if (6 > hours || hours >= 11) {
            int hours2 = new Date().getHours();
            if (11 > hours2 || hours2 >= 13) {
                int hours3 = new Date().getHours();
                string = (13 > hours3 || hours3 >= 19) ? getString(R.string.greet_good_evening) : getString(R.string.greet_good_afternoon);
            } else {
                string = getString(R.string.greet_good_nooning);
            }
        } else {
            string = getString(R.string.greet_good_morning);
        }
        tvGreet.setText(string);
        getBtnMeasureWeight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IX0IO1X1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BodyFatScaleActivity.initView$lambda$0(this.f1939IO, view);
            }
        });
        handlerNoMeasureState();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_body_fat_scale;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C19753iO c19753iO = this.mBleManager;
        if (c19753iO != null) {
            c19753iO.O101();
        }
    }

    @Override // com.vtrump.vtble.C19753iO.XIi00iiXO
    public void onDeviceAdvDiscovered(@tb1 VTDevice vTDevice) {
        LogUtils.m11128d("onDeviceAdvDiscovered " + vTDevice);
        Intrinsics.X1ii(vTDevice, "null cannot be cast to non-null type com.vtrump.vtble.VTDeviceScale");
        XO0O10 xo0o10 = (XO0O10) vTDevice;
        this.mVtDeviceScale = xo0o10;
        if (xo0o10 != null) {
            xo0o10.XOXiX0(this.listener);
        }
    }

    @Override // com.vtrump.vtble.C19753iO.XIi00iiXO
    public void onDeviceConnected(@tb1 VTDevice vTDevice) {
        LogUtils.m11128d("onDeviceConnected " + vTDevice);
        handlerNoMeasureState();
    }

    @Override // com.vtrump.vtble.C19753iO.XIi00iiXO
    public void onDeviceDisconnected(@tb1 VTDevice vTDevice) {
        LogUtils.m11128d("onDeviceDisconnected " + vTDevice);
        handlerUnconnectState();
    }

    @Override // com.vtrump.vtble.C19753iO.XIi00iiXO
    public void onDeviceDiscovered(@tb1 VTDevice vTDevice, int i) {
        LogUtils.m11128d("onDeviceDiscovered  " + vTDevice + "  -- " + i);
    }

    @Override // com.vtrump.vtble.C19753iO.XIi00iiXO
    public void onDeviceServiceDiscovered(@tb1 VTDevice vTDevice) {
        LogUtils.m11128d("onDeviceServiceDiscovered " + vTDevice);
        Intrinsics.X1ii(vTDevice, "null cannot be cast to non-null type com.vtrump.vtble.VTDeviceScale");
        XO0O10 xo0o10 = (XO0O10) vTDevice;
        this.mVtDeviceScale = xo0o10;
        if (xo0o10 != null) {
            xo0o10.XOXiX0(this.listener);
        }
    }

    @Override // com.vtrump.vtble.C19753iO.XIi00iiXO
    public void onInited() {
        LogUtils.m11128d("onInited");
    }

    @Override // com.vtrump.vtble.C19753iO.XIi00iiXO
    public void onScanStop() {
        LogUtils.m11128d("onScanStop");
    }

    @Override // com.vtrump.vtble.C19753iO.XIi00iiXO
    public void onScanTimeOut() {
        LogUtils.m11128d("onScanTimeOut");
        handlerMeasureTimeoutState();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (!this.isDone) {
            finish();
            return;
        }
        if (this.mSaveTipPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.save_weight_tip);
            go0Var.iX1O1(Integer.valueOf(R.string.give_up), new Function0() { // from class: com.android.mltcode.paycertificationapi.I1IOXIO1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BodyFatScaleActivity.onTitleLeftClick$lambda$0$0(this.f1390IO));
                }
            });
            go0Var.X1IX(R.string.save, new Function0() { // from class: com.android.mltcode.paycertificationapi.OO01O0X
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BodyFatScaleActivity.onTitleLeftClick$lambda$0$1(this.f3123IO));
                }
            });
            this.mSaveTipPopup = go0Var;
        }
        go0 go0Var2 = this.mSaveTipPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        save();
    }

    public final void permissionRemind() {
        if (this.mPermissionPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.permission_set_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.I1XXOIi01
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BodyFatScaleActivity.permissionRemind$lambda$0$0());
                }
            });
            this.mPermissionPopup = go0Var;
        }
        go0 go0Var2 = this.mPermissionPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }
}
