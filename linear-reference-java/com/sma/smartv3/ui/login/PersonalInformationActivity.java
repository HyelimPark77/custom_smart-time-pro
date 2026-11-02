package com.sma.smartv3.ui.login;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OO1010;
import com.android.mltcode.paycertificationapi.XO1I00i;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.at1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bt1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ct1;
import com.android.mltcode.paycertificationapi.dt1;
import com.android.mltcode.paycertificationapi.et1;
import com.android.mltcode.paycertificationapi.ft1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gt1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.ht1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.it1;
import com.android.mltcode.paycertificationapi.jt1;
import com.android.mltcode.paycertificationapi.kt1;
import com.android.mltcode.paycertificationapi.lt1;
import com.android.mltcode.paycertificationapi.mt1;
import com.android.mltcode.paycertificationapi.nt1;
import com.android.mltcode.paycertificationapi.ot1;
import com.android.mltcode.paycertificationapi.pt1;
import com.android.mltcode.paycertificationapi.qt1;
import com.android.mltcode.paycertificationapi.rs1;
import com.android.mltcode.paycertificationapi.rt1;
import com.android.mltcode.paycertificationapi.ss1;
import com.android.mltcode.paycertificationapi.st1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ts1;
import com.android.mltcode.paycertificationapi.tt1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.us1;
import com.android.mltcode.paycertificationapi.ut1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vs1;
import com.android.mltcode.paycertificationapi.ws1;
import com.android.mltcode.paycertificationapi.xs1;
import com.android.mltcode.paycertificationapi.xz3;
import com.android.mltcode.paycertificationapi.ys1;
import com.android.mltcode.paycertificationapi.zs1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.UploadInfoManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppUserUpdate;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.NetWorkUtils$upload$$inlined$upload$1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.main.MainActivity;
import com.sma.smartv3.view.ImageViewRound;
import com.sma.smartv3.view.WheelView.WheelView;
import com.sma.smartv3.view.picker.DatePicker;
import com.sma.smartv3.view.picker.HeightPicker;
import com.sma.smartv3.view.picker.WeightPicker;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import java.io.File;
import java.lang.reflect.Type;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPersonalInformationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalInformationActivity.kt\ncom/sma/smartv3/ui/login/PersonalInformationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n19#2:423\n15#2:424\n27#2,2:456\n11#2,2:467\n108#3,7:425\n123#3:455\n116#4,23:432\n69#5,3:458\n72#5,5:462\n1#6:461\n*S KotlinDebug\n*F\n+ 1 PersonalInformationActivity.kt\ncom/sma/smartv3/ui/login/PersonalInformationActivity\n*L\n72#1:423\n72#1:424\n272#1:456,2\n287#1:467,2\n234#1:425,7\n234#1:455\n234#1:432,23\n276#1:458,3\n276#1:462,5\n276#1:461\n*E\n"})
public final class PersonalInformationActivity extends BaseActivity {

    @aa1
    private final Lazy caloriesGoal$delegate;

    @aa1
    private final Lazy datePicker$delegate;

    @aa1
    private final Lazy distanceGoal$delegate;

    @aa1
    private final Lazy distanceUnit$delegate;

    @aa1
    private final Lazy edtNickname$delegate;

    @aa1
    private final Lazy heightPicker$delegate;

    @aa1
    private final Lazy ivAvatar$delegate;

    @aa1
    private final Lazy llBirthdayAndUnit$delegate;

    @aa1
    private final Lazy llHeightAndWeight$delegate;

    @aa1
    private final Lazy llMovingTarget$delegate;

    @aa1
    private final Lazy llNameAndGender$delegate;

    @aa1
    private AppUser mAppUser;

    @aa1
    private final Lazy mCrop$delegate;

    @tb1
    private xz3 mSelectAvatarPopup;

    @aa1
    private final Lazy nickNameLine$delegate;

    @aa1
    private PersonalInfo nowLl;

    @aa1
    private final Lazy rbFemale$delegate;

    @aa1
    private final Lazy rbImperial$delegate;

    @aa1
    private final Lazy rbMale$delegate;

    @aa1
    private final Lazy rbMetric$delegate;

    @aa1
    private final Lazy rootView$delegate;
    private int stepGoalValue;

    @aa1
    private final Lazy titleLeft$delegate;

    @aa1
    private final Lazy weightPicker$delegate;

    @aa1
    private final Lazy wv$delegate;

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[PersonalInfo.values().length];
            r0[PersonalInfo.BIRTHDAY_UNIT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L13:
            r0[PersonalInfo.HEIGHT_WEIGHT.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L19:
            r0[PersonalInfo.MOVING_TARGET.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L15:
            r0[PersonalInfo.NAME_GENDER.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L7:
            OXO1 = r0;
        }
    }

    public PersonalInformationActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new ut1(this));
        this.llNameAndGender$delegate = LazyKt__LazyJVMKt.iO(new dt1(this));
        this.llBirthdayAndUnit$delegate = LazyKt__LazyJVMKt.iO(new ft1(this));
        this.llHeightAndWeight$delegate = LazyKt__LazyJVMKt.iO(new gt1(this));
        this.llMovingTarget$delegate = LazyKt__LazyJVMKt.iO(new ht1(this));
        this.ivAvatar$delegate = LazyKt__LazyJVMKt.iO(new it1(this));
        this.edtNickname$delegate = LazyKt__LazyJVMKt.iO(new jt1(this));
        this.rbMale$delegate = LazyKt__LazyJVMKt.iO(new kt1(this));
        this.rbFemale$delegate = LazyKt__LazyJVMKt.iO(new lt1(this));
        this.rbMetric$delegate = LazyKt__LazyJVMKt.iO(new mt1(this));
        this.rbImperial$delegate = LazyKt__LazyJVMKt.iO(new ss1(this));
        this.datePicker$delegate = LazyKt__LazyJVMKt.iO(new ts1(this));
        this.heightPicker$delegate = LazyKt__LazyJVMKt.iO(new us1(this));
        this.weightPicker$delegate = LazyKt__LazyJVMKt.iO(new vs1(this));
        this.wv$delegate = LazyKt__LazyJVMKt.iO(new ws1(this));
        this.distanceGoal$delegate = LazyKt__LazyJVMKt.iO(new xs1(this));
        this.caloriesGoal$delegate = LazyKt__LazyJVMKt.iO(new ys1(this));
        this.distanceUnit$delegate = LazyKt__LazyJVMKt.iO(new zs1(this));
        this.titleLeft$delegate = LazyKt__LazyJVMKt.iO(new at1(this));
        this.nickNameLine$delegate = LazyKt__LazyJVMKt.iO(new bt1(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
        this.nowLl = PersonalInfo.NAME_GENDER;
        this.mCrop$delegate = LazyKt__LazyJVMKt.iO(new et1(this));
    }

    public static /* synthetic */ Unit I0iXXO(PersonalInformationActivity r0, boolean r1) {
        return selectAvatar$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ WeightPicker I1(PersonalInformationActivity r0) {
        return weightPicker_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(PersonalInformationActivity r0) {
        return selectAvatar$lambda$0$0(r0);
    }

    public static /* synthetic */ TextInputEditText II1Xi0(PersonalInformationActivity r0) {
        return edtNickname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RadioButton IIX1OXO(PersonalInformationActivity r0) {
        return rbImperial_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout IXXOO(PersonalInformationActivity r0) {
        return llBirthdayAndUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout O10IXXX0X(PersonalInformationActivity r0) {
        return llHeightAndWeight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout O1O(PersonalInformationActivity r0) {
        return llNameAndGender_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OII(PersonalInformationActivity r0, View r1, boolean r2) {
        initView$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit OIX0iXi(PersonalInformationActivity r0, float r1) {
        return setHeight$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ DINCondBold OX(PersonalInformationActivity r0) {
        return distanceGoal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageViewRound OiIIX101O(PersonalInformationActivity r0) {
        return ivAvatar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout X01IiOiIi(PersonalInformationActivity r0) {
        return llMovingTarget_delegate$lambda$0(r0);
    }

    public static /* synthetic */ i1Ii1i11X X0O(PersonalInformationActivity r0) {
        return mCrop_delegate$lambda$0(r0);
    }

    public static /* synthetic */ WheelView X11iII1O1(PersonalInformationActivity r0) {
        return wv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1IX(PersonalInformationActivity r0, float r1) {
        return setWeight$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ RadioButton X1ii(PersonalInformationActivity r0) {
        return rbMale_delegate$lambda$0(r0);
    }

    public static /* synthetic */ HeightPicker XX0(PersonalInformationActivity r0) {
        return heightPicker_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DatePicker XXI(PersonalInformationActivity r0) {
        return datePicker_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XXIIO1i11(PersonalInformationActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RadioButton XXX11i(PersonalInformationActivity r0) {
        return rbMetric_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(PersonalInformationActivity r0, boolean r1) {
        return selectAvatar$lambda$0$1$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOIii1(PersonalInformationActivity r0) {
        return selectAvatar$lambda$0$1(r0);
    }

    public static final /* synthetic */ ImageViewRound access$getIvAvatar(PersonalInformationActivity r0) {
        return r0.getIvAvatar();
    }

    public static final /* synthetic */ AppUser access$getMAppUser$p(PersonalInformationActivity r0) {
        return r0.mAppUser;
    }

    public static final /* synthetic */ void access$setDone(PersonalInformationActivity r0, AppUser r1) {
        r0.setDone(r1);
    }

    private static final DINCondBold caloriesGoal_delegate$lambda$0(PersonalInformationActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.caloriesGoal);
    }

    private final void countGoal(String r4) {
        this.stepGoalValue = Integer.parseInt(r4);
        getDistanceGoal().setText(cp5.IO0II0i(this.mAppUser.getHeight(), this.stepGoalValue, this.mAppUser.getUnit()));
        getCaloriesGoal().setText(cp5.IXOIIIO(this.mAppUser.getGender(), this.mAppUser.getWeight(), this.stepGoalValue));
    }

    private static final DatePicker datePicker_delegate$lambda$0(PersonalInformationActivity r1) {
        return (DatePicker) r1.findViewById(R.id.datePicker);
    }

    private static final DINCondBold distanceGoal_delegate$lambda$0(PersonalInformationActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.distanceGoal);
    }

    private static final PFMedium distanceUnit_delegate$lambda$0(PersonalInformationActivity r1) {
        return (PFMedium) r1.findViewById(R.id.nowGoalUnit);
    }

    private static final TextInputEditText edtNickname_delegate$lambda$0(PersonalInformationActivity r1) {
        return (TextInputEditText) r1.findViewById(R.id.edtNickname);
    }

    private final DINCondBold getCaloriesGoal() {
        return (DINCondBold) getValue();
    }

    private final DatePicker getDatePicker() {
        return (DatePicker) getValue();
    }

    private final DINCondBold getDistanceGoal() {
        return (DINCondBold) getValue();
    }

    private final PFMedium getDistanceUnit() {
        return (PFMedium) getValue();
    }

    private final TextInputEditText getEdtNickname() {
        return (TextInputEditText) getValue();
    }

    private final HeightPicker getHeightPicker() {
        return (HeightPicker) getValue();
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) getValue();
    }

    private final RelativeLayout getLlBirthdayAndUnit() {
        return (RelativeLayout) getValue();
    }

    private final RelativeLayout getLlHeightAndWeight() {
        return (RelativeLayout) getValue();
    }

    private final RelativeLayout getLlMovingTarget() {
        return (RelativeLayout) getValue();
    }

    private final RelativeLayout getLlNameAndGender() {
        return (RelativeLayout) getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) getValue();
    }

    private final View getNickNameLine() {
        return (View) getValue();
    }

    private final RadioButton getRbFemale() {
        return (RadioButton) getValue();
    }

    private final RadioButton getRbImperial() {
        return (RadioButton) getValue();
    }

    private final RadioButton getRbMale() {
        return (RadioButton) getValue();
    }

    private final RadioButton getRbMetric() {
        return (RadioButton) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final ImageView getTitleLeft() {
        return (ImageView) getValue();
    }

    private final WeightPicker getWeightPicker() {
        return (WeightPicker) getValue();
    }

    private final WheelView getWv() {
        return (WheelView) getValue();
    }

    private static final void heightAndWeightClick$lambda$0$0(PersonalInformationActivity r1, int r2) {
        r1.countGoal(XO1I00i.OXO1().get(r2));
    }

    private static final HeightPicker heightPicker_delegate$lambda$0(PersonalInformationActivity r1) {
        return (HeightPicker) r1.findViewById(R.id.heightPicker);
    }

    public static /* synthetic */ Unit i010I(PersonalInformationActivity r0, int r1, int r2, int r3) {
        return setBirthday$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ void iI(PersonalInformationActivity r0, int r1) {
        heightAndWeightClick$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ ImageView iIiiO(PersonalInformationActivity r0) {
        return titleLeft_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iOO1ii1(PersonalInformationActivity r0) {
        return nickNameLine_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold iOOX010X(PersonalInformationActivity r0) {
        return caloriesGoal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RadioButton iX(PersonalInformationActivity r0) {
        return rbFemale_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iX1O1(PersonalInformationActivity r0) {
        return distanceUnit_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(PersonalInformationActivity r0, View r1, boolean r2) {
        View r3 = r0.getNickNameLine();
        if (r2 == false) goto L5;
        int r4 = 8;
    L6:
        r3.setVisibility(r4);
        return;
    L5:
        r4 = 0;
        goto L6
    }

    private static final ImageViewRound ivAvatar_delegate$lambda$0(PersonalInformationActivity r1) {
        return (ImageViewRound) r1.findViewById(R.id.iv_avatar);
    }

    private static final RelativeLayout llBirthdayAndUnit_delegate$lambda$0(PersonalInformationActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.llBirthdayAndUnit);
    }

    private static final RelativeLayout llHeightAndWeight_delegate$lambda$0(PersonalInformationActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.llHeightAndWeight);
    }

    private static final RelativeLayout llMovingTarget_delegate$lambda$0(PersonalInformationActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.llMovingTarget);
    }

    private static final RelativeLayout llNameAndGender_delegate$lambda$0(PersonalInformationActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.llNameAndGender);
    }

    private static final i1Ii1i11X mCrop_delegate$lambda$0(PersonalInformationActivity r3) {
        Activity r0 = r3.getMContext();
        xz3 r1 = r3.mSelectAvatarPopup;
        ImageViewRound r4 = r3.getIvAvatar();
        Intrinsics.O10IXXX0X(r4, "<get-ivAvatar>(...)");
        return OO1010.XIi00iiXO(r0, r1, r4);
    }

    private static final View nickNameLine_delegate$lambda$0(PersonalInformationActivity r1) {
        return r1.findViewById(R.id.nickNameLine);
    }

    private static final RadioButton rbFemale_delegate$lambda$0(PersonalInformationActivity r1) {
        return (RadioButton) r1.findViewById(R.id.rbFemale);
    }

    private static final RadioButton rbImperial_delegate$lambda$0(PersonalInformationActivity r1) {
        return (RadioButton) r1.findViewById(R.id.rbImperial);
    }

    private static final RadioButton rbMale_delegate$lambda$0(PersonalInformationActivity r1) {
        return (RadioButton) r1.findViewById(R.id.rbMale);
    }

    private static final RadioButton rbMetric_delegate$lambda$0(PersonalInformationActivity r1) {
        return (RadioButton) r1.findViewById(R.id.rbMetric);
    }

    private static final View rootView_delegate$lambda$0(PersonalInformationActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private final void saveUser(AppUser r5) {
        I01XX0.XIi00iiXO(I01XX0.IiiXiI0I, null, 2, null);
        I01XX0.OXO1(I01XX0.X11iII1O1, this.mAppUser.getNickname());
        if (uz0.I0IIOi(sz0.OXO1).exists() == false) goto L5;
        I01XX0.XIi00iiXO(I01XX0.iI, null, 2, null);
    L5:
        a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(r5));
    }

    private static final Unit selectAvatar$lambda$0$0(final PersonalInformationActivity r3) {
        hr1.OXO1.iOOX010X(r3.getMContext(), new tt1(r3));
        return Unit.OXO1;
    }

    private static final Unit selectAvatar$lambda$0$0$0(PersonalInformationActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.getMCrop().iO();
    L5:
        return Unit.OXO1;
    }

    private static final Unit selectAvatar$lambda$0$1(final PersonalInformationActivity r3) {
        hr1.OXO1.OiIIX101O(r3.getMContext(), new ot1(r3));
        return Unit.OXO1;
    }

    private static final Unit selectAvatar$lambda$0$1$0(PersonalInformationActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.getMCrop().OIX0iXi();
    L5:
        return Unit.OXO1;
    }

    private final void setBirthday() {
        DatePicker r0 = getDatePicker();
        r0.setVisibleCount(3);
        r0.setMListener(new qt1(this));
        if (this.mAppUser.getBirthday().length() != 0) goto L5;
        this.mAppUser.setBirthday("01/01/2000");
    L5:
        Triple<Integer, Integer, Integer> r1 = cp5.XOO0ii0(this.mAppUser.getBirthday());
        int r2 = r1.component1().intValue();
        int r3 = r1.component2().intValue();
        int r4 = r1.component3().intValue();
        getDatePicker().IO(r2, r3, r4);
        getDatePicker().setMaxDate(System.currentTimeMillis());
    }

    private static final Unit setBirthday$lambda$0$0(PersonalInformationActivity r1, int r2, int r3, int r4) {
        r1.mAppUser.setBirthday(r3 + "/" + r4 + "/" + r2);
        return Unit.OXO1;
    }

    private final void setDone(AppUser r7) {
        saveUser(r7);
        BaseBleCache.putInt$default(BleCache.INSTANCE, BleKey.STEP_GOAL, this.stepGoalValue, null, 4, null);
        a01.OXO1.XO0O10().remove(AppUser.class.getName());
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    private final void setHeight() {
        HeightPicker r0 = getHeightPicker();
        r0.setVisibleCount(3);
        r0.setMListener(new nt1(this));
        getHeightPicker().setHeight(this.mAppUser.getHeight());
        getHeightPicker().setUnit(this.mAppUser.getUnit());
    }

    private static final Unit setHeight$lambda$0$0(PersonalInformationActivity r0, float r1) {
        r0.mAppUser.setHeight(r1);
        return Unit.OXO1;
    }

    private final void setWeight() {
        WeightPicker r0 = getWeightPicker();
        r0.setVisibleCount(3);
        r0.setMListener(new pt1(this));
        getWeightPicker().setWeight(this.mAppUser.getWeight());
        getWeightPicker().setUnit(this.mAppUser.getUnit());
    }

    private static final Unit setWeight$lambda$0$0(PersonalInformationActivity r0, float r1) {
        r0.mAppUser.setWeight(r1);
        return Unit.OXO1;
    }

    private final void showContent(PersonalInfo r4) {
        int r5 = OXO1.OXO1[r4.ordinal()];
        if (r5 != 1) goto L5;
        getLlNameAndGender().setVisibility(8);
        getLlBirthdayAndUnit().setVisibility(0);
        getLlHeightAndWeight().setVisibility(8);
        getLlMovingTarget().setVisibility(8);
        getTitleLeft().setVisibility(0);
        this.nowLl = PersonalInfo.BIRTHDAY_UNIT;
        return;
    L5:
        if (r5 != 2) goto L7;
        getLlNameAndGender().setVisibility(8);
        getLlBirthdayAndUnit().setVisibility(8);
        getLlHeightAndWeight().setVisibility(0);
        getLlMovingTarget().setVisibility(8);
        getTitleLeft().setVisibility(0);
        this.nowLl = PersonalInfo.HEIGHT_WEIGHT;
        return;
    L7:
        if (r5 != 3) goto L9;
        getLlNameAndGender().setVisibility(8);
        getLlBirthdayAndUnit().setVisibility(8);
        getLlHeightAndWeight().setVisibility(8);
        getLlMovingTarget().setVisibility(0);
        getTitleLeft().setVisibility(0);
        this.nowLl = PersonalInfo.MOVING_TARGET;
        return;
    L9:
        if (r5 == 4) goto L12;
        finish();
        return;
    L12:
        getLlNameAndGender().setVisibility(0);
        getLlBirthdayAndUnit().setVisibility(8);
        getLlHeightAndWeight().setVisibility(8);
        getLlMovingTarget().setVisibility(8);
        getTitleLeft().setVisibility(4);
        this.nowLl = PersonalInfo.NAME_GENDER;
    }

    private static final ImageView titleLeft_delegate$lambda$0(PersonalInformationActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_left);
    }

    private static final WeightPicker weightPicker_delegate$lambda$0(PersonalInformationActivity r1) {
        return (WeightPicker) r1.findViewById(R.id.weightPicker);
    }

    private static final WheelView wv_delegate$lambda$0(PersonalInformationActivity r1) {
        return (WheelView) r1.findViewById(R.id.wv);
    }

    public final void birthdayAndUnitClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        this.mAppUser.setUnit(!getRbMetric().isChecked() ? 1 : 0);
        LogUtils.d(new Object[]{this.mAppUser.toString()});
        setHeight();
        setWeight();
        showContent(PersonalInfo.HEIGHT_WEIGHT);
    }

    public final void doneClick(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (this.mAppUser.getHeight() == 0.0f) goto L5;
    L8:
        UploadInfoManager r8 = UploadInfoManager.OXO1;
        r8.O00(this.mAppUser);
        if (a01.OXO1.IiI10X().getBoolean(b01.O001I, true) == false) goto L15;
        this.mAppUser.setThirdPlatform(null);
        NetWorkUtils r9 = NetWorkUtils.INSTANCE;
        File r1 = uz0.I0IIOi(sz0.OXO1);
        AppUser r2 = this.mAppUser;
        final O1XIiIO<AppUser> r3 = new AnonymousClass1(this);
        final uq r10 = r9.loadPopup(this, getRootView());
        NetWork r4 = NetWork.OXO1;
        String r5 = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> r6 = new PersonalInformationActivity$doneClick$$inlined$upload$1(this, r3, r10);
        ANRequest.MultiPartBuilder r11 = AndroidNetworking.upload(r5);
        if (r1.exists() == false) goto L13;
        r11.addMultipartFile("avatar", r1);
    L13:
        r11.addMultipartParameter(r2).setTag(r5).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new PersonalInformationActivity$doneClick$$inlined$upload$2(r6));
        return;
    L15:
        sz0 r0 = sz0.OXO1;
        FileUtils.copy(uz0.I0IIOi(r0), uz0.OIi0(r0));
        setDone(this.mAppUser);
        r8.I0iXXO();     // Catch: Exception -> L18
        return;
    L18:
        e = move-exception;
        e.printStackTrace();
        return;
    L5:
        if (this.mAppUser.getWeight() != 0.0f) goto L8;
        ToastUtils.showLong(R.string.user_does_not_exist);
    }

    public final void heightAndWeightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (this.mAppUser.getHeight() > i72.OXO1.iX1O1()) goto L7;
        ToastUtils.showLong(R.string.height_set_error);
        return;
    L7:
        if (this.mAppUser.getWeight() > 20.0f) goto L10;
        ToastUtils.showLong(R.string.weight_set_error);
        return;
    L10:
        getDistanceUnit().setText(cp5.XX0(this.mAppUser.getUnit()));
        WheelView r3 = getWv();
        Intrinsics.O10IXXX0X(r3, "<get-wv>(...)");
        XO1I00i.XIi00iiXO(r3, 5);
        countGoal(XO1I00i.OXO1().get(5));
        getWv().setListener(new rs1(this));
        LogUtils.d(new Object[]{this.mAppUser.toString()});
        showContent(PersonalInfo.MOVING_TARGET);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.personal_information);
        findViewById(R.id.abh_title_right).setVisibility(8);
        i1Ii1i11X.O10IXXX0X(getMCrop(), this, null, 2, null);
        showContent(PersonalInfo.NAME_GENDER);
        getRbMale().setChecked(true);
        i72 r0 = i72.OXO1;
        if (r0.iOIIiI1() == false) goto L5;
        getRbMetric().setChecked(true);
        getRbImperial().setChecked(false);
    L7:
        if (r0.IiiXiI0I() == false) goto L9;
        int r1 = R.drawable.personal_info_default_avatar;
    L10:
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), r1));
        if (this.mAppUser.getAvatarUrl().length() <= 0) goto L13;
        NetWorkUtils.INSTANCE.getImage(this.mAppUser.getAvatarUrl(), uz0.OIi0(sz0.OXO1), new C34691(this));
    L16:
        getEdtNickname().setText(this.mAppUser.getNickname());
        getEdtNickname().setOnFocusChangeListener(new ct1(this));
        if (this.mAppUser.getWeight() != 0.0f) goto L20;
        this.mAppUser.setWeight(65.0f);
    L20:
        if (this.mAppUser.getHeight() != 0.0f) goto L23;
        this.mAppUser.setHeight(175.0f);
        return;
    L23:
        return;
    L13:
        sz0 r2 = sz0.OXO1;
        if (uz0.OIi0(r2).exists() == false) goto L16;
        getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(r2)));
        goto L16
    L9:
        r1 = R.drawable.pic_avatar_default;
        goto L10
    L5:
        getRbMetric().setChecked(false);
        getRbImperial().setChecked(true);
        goto L7
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_personal_info;
    }

    public final void nameAndGenderClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (String.valueOf(getEdtNickname().getText()).length() != 0) goto L6;
        ToastUtils.showLong(R.string.please_input_nick_name);
        return;
    L6:
        this.mAppUser.setNickname(String.valueOf(getEdtNickname().getText()));
        this.mAppUser.setGender(!getRbFemale().isChecked() ? 1 : 0);
        setBirthday();
        LogUtils.d(new Object[]{this.mAppUser.toString()});
        showContent(PersonalInfo.BIRTHDAY_UNIT);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r13, int r14, @tb1 Intent r15) {
        super.onActivityResult(r13, r14, r15);
        i1Ii1i11X.I0IIOi(getMCrop(), r13, r14, r15, 0.0d, 0.0d, 0, 0, 120, null);
        xz3 r16 = this.mSelectAvatarPopup;
        if (r16 != null) goto L5;
        return;
    L5:
        if (r16.isShowing() != true) goto L11;
        xz3 r17 = this.mSelectAvatarPopup;
        if (r17 == null) goto L12;
        r17.dismiss();
        return;
    L12:
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        onTitleLeftClick(r0);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        PersonalInfo r3 = this.nowLl;
        int r4 = OXO1.OXO1[r3.ordinal()];
        if (r4 != 1) goto L5;
        showContent(PersonalInfo.NAME_GENDER);
        return;
    L5:
        if (r4 != 2) goto L7;
        showContent(PersonalInfo.BIRTHDAY_UNIT);
        return;
    L7:
        if (r4 == 3) goto L9;
        return;
    L9:
        showContent(PersonalInfo.HEIGHT_WEIGHT);
    }

    public final void onTitleRightOtherClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    public final void selectAvatar(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mSelectAvatarPopup != null) goto L5;
        xz3 r4 = new xz3(getMContext());
        r4.iX(new rt1(this));
        r4.i010I(new st1(this));
        this.mSelectAvatarPopup = r4;
    L5:
        xz3 r5 = this.mSelectAvatarPopup;
        if (r5 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
        return;
    }
}
