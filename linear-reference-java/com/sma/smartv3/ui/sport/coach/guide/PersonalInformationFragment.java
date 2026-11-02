package com.sma.smartv3.ui.sport.coach.guide;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1100iXOX;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XX00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.au1;
import com.android.mltcode.paycertificationapi.bu1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cu1;
import com.android.mltcode.paycertificationapi.du1;
import com.android.mltcode.paycertificationapi.eu1;
import com.android.mltcode.paycertificationapi.fu1;
import com.android.mltcode.paycertificationapi.gu1;
import com.android.mltcode.paycertificationapi.hu1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iu1;
import com.android.mltcode.paycertificationapi.j07;
import com.android.mltcode.paycertificationapi.ju1;
import com.android.mltcode.paycertificationapi.ku1;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.lu1;
import com.android.mltcode.paycertificationapi.pv1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vt1;
import com.android.mltcode.paycertificationapi.wt1;
import com.android.mltcode.paycertificationapi.xt1;
import com.android.mltcode.paycertificationapi.yt1;
import com.android.mltcode.paycertificationapi.zt1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.SPUtils;
import com.github.appintro.SlideSelectionListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppUserUpdate;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.NetWorkUtils$upload$$inlined$upload$1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.AICoachManage;
import com.sma.smartv3.util.DateTimeFormat;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import java.lang.reflect.Type;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPersonalInformationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalInformationFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,252:1\n19#2:253\n15#2:254\n99#3,16:255\n123#3:294\n116#4,23:271\n*S KotlinDebug\n*F\n+ 1 PersonalInformationFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalInformationFragment\n*L\n61#1:253\n61#1:254\n224#1:255,16\n224#1:294\n224#1:271,23\n*E\n"})
public final class PersonalInformationFragment extends BaseFragment implements SlideSelectionListener {

    @aa1
    private final AppUser mAppUser;

    @tb1
    private O1100iXOX mBirthdayPopup;

    @aa1
    private final Lazy mBirthdayTv$delegate;
    protected Activity mContext;

    @aa1
    private final Lazy mDateBirthLayout$delegate;

    @aa1
    private final Lazy mGenderLayout$delegate;

    @tb1
    private pv1 mGenderPopup;

    @aa1
    private final Lazy mGenderTv$delegate;

    @aa1
    private final Lazy mHeightLayout$delegate;

    @tb1
    private XX00 mHeightPopup;

    @aa1
    private final Lazy mHeightTv$delegate;

    @aa1
    private final Lazy mWeightLayout$delegate;

    @tb1
    private j07 mWeightPopup;

    @aa1
    private final Lazy mWeightTv$delegate;

    @aa1
    private final Lazy rootView$delegate;

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[DateTimeFormat.values().length];
            r0[DateTimeFormat.ddMMyyyy.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r0[DateTimeFormat.yyyyMMdd.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            OXO1 = r0;
        }
    }

    public PersonalInformationFragment() {
        this.mGenderLayout$delegate = LazyKt__LazyJVMKt.iO(new vt1(this));
        this.mDateBirthLayout$delegate = LazyKt__LazyJVMKt.iO(new du1(this));
        this.mHeightLayout$delegate = LazyKt__LazyJVMKt.iO(new eu1(this));
        this.mWeightLayout$delegate = LazyKt__LazyJVMKt.iO(new fu1(this));
        this.mGenderTv$delegate = LazyKt__LazyJVMKt.iO(new gu1(this));
        this.mBirthdayTv$delegate = LazyKt__LazyJVMKt.iO(new hu1(this));
        this.mHeightTv$delegate = LazyKt__LazyJVMKt.iO(new iu1(this));
        this.mWeightTv$delegate = LazyKt__LazyJVMKt.iO(new ju1(this));
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new ku1(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ boolean I0IIOi(PersonalInformationFragment r0, int r1, int r2, int r3) {
        return selectBirthday$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ TextView I0iXXO(PersonalInformationFragment r0) {
        return mWeightTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout I1XOi1(PersonalInformationFragment r0) {
        return mGenderLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(PersonalInformationFragment r0, View r1) {
        initView$lambda$3(r0, r1);
    }

    public static /* synthetic */ TextView IO(PersonalInformationFragment r0) {
        return mGenderTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IiI10X(PersonalInformationFragment r0, float r1) {
        return selectWeight$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void O00(PersonalInformationFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean O10IXXX0X(PersonalInformationFragment r0, int r1) {
        return selectGender$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean OIX0iXi(PersonalInformationFragment r0, float r1) {
        return selectHeight$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ RelativeLayout OIi0(PersonalInformationFragment r0) {
        return mWeightLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout X0O(PersonalInformationFragment r0) {
        return mHeightLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(PersonalInformationFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(PersonalInformationFragment r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ TextView XO0O10(PersonalInformationFragment r0) {
        return mHeightTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XOO0ii0(PersonalInformationFragment r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout XXI(PersonalInformationFragment r0) {
        return mDateBirthLayout_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ AppUser access$getMAppUser$p(PersonalInformationFragment r0) {
        return r0.mAppUser;
    }

    private final String birthDataFormat(int r3) {
        if (r3 >= 9) goto L7;
        return "0" + r3;
    L7:
        return String.valueOf(r3);
    }

    public static /* synthetic */ TextView iO(PersonalInformationFragment r0) {
        return mBirthdayTv_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(PersonalInformationFragment r0, View r1) {
        r0.selectGender();
    }

    private static final void initView$lambda$1(PersonalInformationFragment r0, View r1) {
        r0.selectBirthday();
    }

    private static final void initView$lambda$2(PersonalInformationFragment r0, View r1) {
        r0.selectHeight();
    }

    private static final void initView$lambda$3(PersonalInformationFragment r0, View r1) {
        r0.selectWeight();
    }

    private static final TextView mBirthdayTv_delegate$lambda$0(PersonalInformationFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.personal_ll_date_birth_tv);
    }

    private static final RelativeLayout mDateBirthLayout_delegate$lambda$0(PersonalInformationFragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.personal_ll_date_birth_layout);
    }

    private static final RelativeLayout mGenderLayout_delegate$lambda$0(PersonalInformationFragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.personal_ll_gender_layout);
    }

    private static final TextView mGenderTv_delegate$lambda$0(PersonalInformationFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.personal_ll_gender_tv);
    }

    private static final RelativeLayout mHeightLayout_delegate$lambda$0(PersonalInformationFragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.personal_ll_height_layout);
    }

    private static final TextView mHeightTv_delegate$lambda$0(PersonalInformationFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.personal_ll_height_tv);
    }

    private static final RelativeLayout mWeightLayout_delegate$lambda$0(PersonalInformationFragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.personal_ll_weight_layout);
    }

    private static final TextView mWeightTv_delegate$lambda$0(PersonalInformationFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.personal_ll_weight_tv);
    }

    private static final View rootView_delegate$lambda$0(PersonalInformationFragment r1) {
        return r1.getMView().findViewById(R.id.root_view);
    }

    private static final boolean selectBirthday$lambda$0$0(PersonalInformationFragment r2, int r3, int r4, int r5) {
        r2.mAppUser.setBirthday(r4 + "/" + r5 + "/" + r3);
        r2.setupBirthday();
        return true;
    }

    private static final boolean selectGender$lambda$0$0(PersonalInformationFragment r3, int r4) {
        AppUser r0 = r3.mAppUser;
        if (r4 != 0) goto L5;
        int r2 = 1;
    L6:
        r0.setGender(r2);
        TextView r5 = r3.getMGenderTv();
        if (r4 != 0) goto L9;
        int r6 = R.string.male;
    L10:
        r5.setText(r6);
        return true;
    L9:
        r6 = R.string.female;
        goto L10
    L5:
        r2 = 0;
        goto L6
    }

    private static final boolean selectHeight$lambda$0$0(PersonalInformationFragment r1, float r2) {
        r1.mAppUser.setHeight(r2);
        r1.setupHeight();
        return true;
    }

    private static final boolean selectWeight$lambda$0$0(PersonalInformationFragment r1, float r2) {
        r1.mAppUser.setWeight(r2);
        r1.setupWeight();
        return true;
    }

    private final void setupBirthday() {
        if (this.mAppUser.getBirthday().length() != 0) goto L5;
        this.mAppUser.setBirthday("01/01/2000");
    L5:
        Triple<Integer, Integer, Integer> r0 = cp5.XOO0ii0(this.mAppUser.getBirthday());
        int r1 = r0.component1().intValue();
        int r2 = r0.component2().intValue();
        int r3 = r0.component3().intValue();
        TextView r4 = getMBirthdayTv();
        i72 r5 = i72.OXO1;
        if (r5.IiXIIX1O1() == false) goto L14;
        int r6 = OXO1.OXO1[r5.XiOIO().ordinal()];
        if (r6 != 1) goto L10;
        String r7 = birthDataFormat(r3) + "/" + birthDataFormat(r2) + "/" + r1;
    L15:
        r4.setText(r7);
        return;
    L10:
        if (r6 == 2) goto L12;
        r7 = birthDataFormat(r2) + "/" + birthDataFormat(r3) + "/" + r1;
        goto L15
    L12:
        r7 = r1 + "/" + birthDataFormat(r2) + "/" + birthDataFormat(r3);
        goto L15
    L14:
        r7 = birthDataFormat(r3) + FileUtils.FILE_EXTENSION_SEPARATOR + birthDataFormat(r2) + FileUtils.FILE_EXTENSION_SEPARATOR + r1;
        goto L15
    }

    private final void setupGender() {
        TextView r0 = getMGenderTv();
        if (this.mAppUser.getGender() != 1) goto L5;
        int r1 = R.string.male;
    L6:
        r0.setText(r1);
        return;
    L5:
        r1 = R.string.female;
        goto L6
    }

    private final void setupHeight() {
        if (this.mAppUser.getUnit() != 0) goto L6;
        getMHeightTv().setText(getString(R.string.f_cm, new Object[]{Float.valueOf(this.mAppUser.getHeight())}));
        return;
    L6:
        int[] r0 = l76.OXO1(this.mAppUser.getHeight());
        getMHeightTv().setText(getString(R.string.d_feet_d_inch, new Object[]{Integer.valueOf(r0[0]), Integer.valueOf(r0[1])}));
    }

    private final void setupWeight() {
        if (this.mAppUser.getUnit() != 0) goto L6;
        getMWeightTv().setText(getString(R.string.f_kg, new Object[]{Float.valueOf(this.mAppUser.getWeight())}));
        return;
    L6:
        getMWeightTv().setText(getString(R.string.f_lbs, new Object[]{Float.valueOf(Float.parseFloat(cp5.iX1O1(l76.iO(this.mAppUser.getWeight()), true)))}));
    }

    public final TextView getMBirthdayTv() {
        return (TextView) getValue();
    }

    @aa1
    public final Activity getMContext() {
        Activity r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    public final RelativeLayout getMDateBirthLayout() {
        return (RelativeLayout) getValue();
    }

    public final RelativeLayout getMGenderLayout() {
        return (RelativeLayout) getValue();
    }

    public final TextView getMGenderTv() {
        return (TextView) getValue();
    }

    public final RelativeLayout getMHeightLayout() {
        return (RelativeLayout) getValue();
    }

    public final TextView getMHeightTv() {
        return (TextView) getValue();
    }

    public final RelativeLayout getMWeightLayout() {
        return (RelativeLayout) getValue();
    }

    public final TextView getMWeightTv() {
        return (TextView) getValue();
    }

    public final View getRootView() {
        return (View) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        FragmentActivity r0 = getActivity();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.app.Activity");
        setMContext(r0);
        setupGender();
        setupBirthday();
        setupHeight();
        setupWeight();
        getMGenderLayout().setOnClickListener(new lu1(this));
        getMDateBirthLayout().setOnClickListener(new wt1(this));
        getMHeightLayout().setOnClickListener(new xt1(this));
        getMWeightLayout().setOnClickListener(new yt1(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.ai_coach_personal_information;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
        this.mAppUser.setThirdPlatform(null);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        File r2 = uz0.I0IIOi(sz0.OXO1);
        AppUser r3 = this.mAppUser;
        final O1XIiIO<AppUser> r4 = new AnonymousClass1(this);
        final FragmentActivity r5 = requireActivity();
        final uq r1 = r0.loadPopup(r5, null);
        NetWork r6 = NetWork.OXO1;
        String r7 = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> r8 = new PersonalInformationFragment$onSlideDeselected$$inlined$upload$default$1(r5, r4, r1);
        ANRequest.MultiPartBuilder r9 = AndroidNetworking.upload(r7);
        if (r2.exists() == false) goto L5;
        r9.addMultipartFile("avatar", r2);
    L5:
        r9.addMultipartParameter(r3).setTag(r7).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new PersonalInformationFragment$onSlideDeselected$$inlined$upload$default$2(r8));
        int r10 = O0X11OiO.OXO1(this.mAppUser.getBirthday());
        AICoachManage.OXO1 r11 = AICoachManage.IiI10X;
        r11.OXO1().X0O().setUserAge(r10);
        AICoachManage.OiIIX101O(r11.OXO1(), r10, this.mAppUser.getGender(), this.mAppUser.getHeight(), this.mAppUser.getWeight(), 0, 0, 0.0f, 0.0f, null, null, 1008, null);
        r11.OXO1().XO0O10();
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
    }

    public final void selectBirthday() {
        if (this.mBirthdayPopup != null) goto L5;
        O1100iXOX r0 = new O1100iXOX(getMContext());
        r0.iX(R.string.birthday);
        r0.i010I(new au1(this));
        this.mBirthdayPopup = r0;
    L5:
        O1100iXOX r1 = this.mBirthdayPopup;
        if (r1 == null) goto L9;
        Triple<Integer, Integer, Integer> r2 = cp5.XOO0ii0(this.mAppUser.getBirthday());
        r1.II1Xi0(r2.component1().intValue(), r2.component2().intValue(), r2.component3().intValue());
        View r3 = getRootView();
        Intrinsics.O10IXXX0X(r3, "<get-rootView>(...)");
        r1.I1XOi1(r3);
        return;
    }

    public final void selectGender() {
        if (this.mGenderPopup != null) goto L5;
        pv1 r0 = new pv1(getMContext(), R.array.genders);
        r0.IXXOO(true);
        r0.iX(R.string.gender);
        r0.i010I(new cu1(this));
        this.mGenderPopup = r0;
    L5:
        pv1 r1 = this.mGenderPopup;
        if (r1 == null) goto L9;
        CharSequence r2 = getMGenderTv().getText();
        Intrinsics.O10IXXX0X(r2, "getText(...)");
        CharSequence r3 = StringsKt__StringsKt.iX1X1(r2);
        String r4 = getString(R.string.male);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        r1.iOO1ii1(1 ^ (Intrinsics.XOO0ii0(r3, StringsKt__StringsKt.iX1X1(r4).toString()) ? 1 : 0));
        View r5 = getRootView();
        Intrinsics.O10IXXX0X(r5, "<get-rootView>(...)");
        r1.I1XOi1(r5);
        return;
    }

    public final void selectHeight() {
        if (this.mHeightPopup != null) goto L5;
        XX00 r0 = new XX00(getMContext());
        r0.iX(R.string.height);
        r0.IXXOO(this.mAppUser.getUnit());
        r0.i010I(new zt1(this));
        this.mHeightPopup = r0;
    L5:
        XX00 r1 = this.mHeightPopup;
        if (r1 != null) goto L8;
        return;
    L8:
        if (this.mAppUser.getHeight() != 0.0f) goto L10;
        float r2 = 175.0f;
    L11:
        r1.II1Xi0(r2);
        View r3 = getRootView();
        Intrinsics.O10IXXX0X(r3, "<get-rootView>(...)");
        r1.I1XOi1(r3);
        return;
    L10:
        r2 = this.mAppUser.getHeight();
        goto L11
    }

    public final void selectWeight() {
        if (this.mWeightPopup != null) goto L5;
        j07 r0 = new j07(getMContext());
        r0.i010I(R.string.weight);
        r0.iX(this.mAppUser.getUnit());
        r0.II1Xi0(new bu1(this));
        this.mWeightPopup = r0;
    L5:
        j07 r1 = this.mWeightPopup;
        if (r1 != null) goto L8;
        return;
    L8:
        if (this.mAppUser.getWeight() != 0.0f) goto L10;
        float r2 = 65.0f;
    L11:
        r1.IXXOO(r2);
        View r3 = getRootView();
        Intrinsics.O10IXXX0X(r3, "<get-rootView>(...)");
        r1.I1XOi1(r3);
        return;
    L10:
        r2 = this.mAppUser.getWeight();
        goto L11
    }

    public final void setMContext(@aa1 Activity r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }
}
