package com.sma.smartv3.ui.me;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1100iXOX;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIXX00X;
import com.android.mltcode.paycertificationapi.OO1010;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.XX00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ab6;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bb6;
import com.android.mltcode.paycertificationapi.cb6;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.db6;
import com.android.mltcode.paycertificationapi.eb6;
import com.android.mltcode.paycertificationapi.fb6;
import com.android.mltcode.paycertificationapi.gb6;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hb6;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ib6;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.j07;
import com.android.mltcode.paycertificationapi.jb6;
import com.android.mltcode.paycertificationapi.kb6;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.lb6;
import com.android.mltcode.paycertificationapi.mb6;
import com.android.mltcode.paycertificationapi.nb6;
import com.android.mltcode.paycertificationapi.ob6;
import com.android.mltcode.paycertificationapi.pb6;
import com.android.mltcode.paycertificationapi.pv1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qb6;
import com.android.mltcode.paycertificationapi.rb6;
import com.android.mltcode.paycertificationapi.sb6;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tb6;
import com.android.mltcode.paycertificationapi.ub6;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vb6;
import com.android.mltcode.paycertificationapi.wb6;
import com.android.mltcode.paycertificationapi.xz3;
import com.android.mltcode.paycertificationapi.ya6;
import com.android.mltcode.paycertificationapi.za6;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.model.AccountPoints;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppUserUpdate;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.NetWorkUtils$upload$$inlined$upload$1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.login.EmailBindActivity;
import com.sma.smartv3.ui.login.PhoneBindActivity;
import com.sma.smartv3.ui.login.ReceivePhoneBindActivity;
import com.sma.smartv3.util.DateTimeFormat;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleGirlCareSettings;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nUserInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoActivity.kt\ncom/sma/smartv3/ui/me/UserInfoActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 6 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,572:1\n19#2:573\n15#2:574\n90#2:575\n90#2:576\n90#2:655\n90#2:656\n11#2,2:657\n15#2:659\n19#2:660\n15#2:661\n19#2:662\n15#2:663\n19#2:664\n15#2:665\n87#3,7:577\n94#3,3:585\n70#3,7:588\n97#3:595\n69#3,3:596\n72#3,5:600\n87#3,7:605\n94#3,3:613\n70#3,7:616\n97#3:623\n1#4:584\n1#4:599\n1#4:612\n108#5,7:624\n123#5:654\n116#6,23:631\n*S KotlinDebug\n*F\n+ 1 UserInfoActivity.kt\ncom/sma/smartv3/ui/me/UserInfoActivity\n*L\n83#1:573\n83#1:574\n142#1:575\n144#1:576\n509#1:655\n521#1:656\n545#1:657,2\n547#1:659\n554#1:660\n554#1:661\n561#1:662\n561#1:663\n568#1:664\n568#1:665\n408#1:577,7\n408#1:585,3\n408#1:588,7\n408#1:595\n412#1:596,3\n412#1:600,5\n416#1:605,7\n416#1:613,3\n416#1:616,7\n416#1:623\n408#1:584\n412#1:599\n416#1:612\n441#1:624,7\n441#1:654\n441#1:631,23\n*E\n"})
public class UserInfoActivity extends BaseActivity {
    private boolean isGetFreePoint;

    @aa1
    private final Lazy ivAvatar$delegate;

    @aa1
    private final Lazy llEmailItem$delegate;

    @aa1
    private final Lazy llPhoneItem$delegate;

    @aa1
    private final Lazy llReceivePhoneItem$delegate;

    @aa1
    private AppUser mAppUser;

    @tb1
    private O1100iXOX mBirthdayPopup;

    @aa1
    private final Lazy mCrop$delegate;

    @tb1
    private iii1ii mEditPop;

    @tb1
    private OIXX00X mFreePointPopup;

    @tb1
    private pv1 mGenderPopup;

    @tb1
    private XX00 mHeightPopup;

    @tb1
    private go0 mSavePopup;

    @tb1
    private xz3 mSelectAvatarPopup;

    @tb1
    private j07 mWeightPopup;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvBirthday$delegate;

    @aa1
    private final Lazy tvEmail$delegate;

    @aa1
    private final Lazy tvGender$delegate;

    @aa1
    private final Lazy tvHeight$delegate;

    @aa1
    private final Lazy tvNickname$delegate;

    @aa1
    private final Lazy tvPhone$delegate;

    @aa1
    private final Lazy tvReceivePhone$delegate;

    @aa1
    private final Lazy tvWeight$delegate;

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

    public UserInfoActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new rb6(this));
        this.ivAvatar$delegate = LazyKt__LazyJVMKt.iO(new wb6(this));
        this.tvNickname$delegate = LazyKt__LazyJVMKt.iO(new za6(this));
        this.tvGender$delegate = LazyKt__LazyJVMKt.iO(new ab6(this));
        this.tvBirthday$delegate = LazyKt__LazyJVMKt.iO(new bb6(this));
        this.tvHeight$delegate = LazyKt__LazyJVMKt.iO(new cb6(this));
        this.tvWeight$delegate = LazyKt__LazyJVMKt.iO(new db6(this));
        this.tvEmail$delegate = LazyKt__LazyJVMKt.iO(new eb6(this));
        this.llEmailItem$delegate = LazyKt__LazyJVMKt.iO(new fb6(this));
        this.tvReceivePhone$delegate = LazyKt__LazyJVMKt.iO(new gb6(this));
        this.llReceivePhoneItem$delegate = LazyKt__LazyJVMKt.iO(new sb6(this));
        this.tvPhone$delegate = LazyKt__LazyJVMKt.iO(new tb6(this));
        this.llPhoneItem$delegate = LazyKt__LazyJVMKt.iO(new ub6(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
        this.mCrop$delegate = LazyKt__LazyJVMKt.iO(new vb6(this));
    }

    public static /* synthetic */ TextView I0iXXO(UserInfoActivity r0) {
        return tvPhone_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout I1(UserInfoActivity r0) {
        return llReceivePhoneItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1XOi1(UserInfoActivity r0) {
        return onTitleLeftClick$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit II1Xi0(UserInfoActivity r0) {
        return selectAvatar$lambda$0$0(r0);
    }

    public static /* synthetic */ ImageView IIX1OXO(UserInfoActivity r0) {
        return ivAvatar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IXXOO(UserInfoActivity r0) {
        return tvNickname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(UserInfoActivity r0) {
        return tvHeight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O1O(UserInfoActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OII(UserInfoActivity r0, boolean r1) {
        return selectAvatar$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean OIX0iXi(UserInfoActivity r0, String r1) {
        return modifyNickName$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ TextView OX(UserInfoActivity r0) {
        return tvWeight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OiIIX101O(UserInfoActivity r0) {
        return tvEmail_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X01IiOiIi(UserInfoActivity r0, boolean r1) {
        return selectAvatar$lambda$0$1$0(r0, r1);
    }

    public static /* synthetic */ boolean X0O(UserInfoActivity r0, float r1) {
        return selectHeight$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X1ii(UserInfoActivity r0) {
        return selectAvatar$lambda$0$1(r0);
    }

    public static /* synthetic */ boolean XX0(UserInfoActivity r0, int r1) {
        return selectGender$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean XXI(UserInfoActivity r0, int r1, int r2, int r3) {
        return selectBirthday$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ TextView XXIIO1i11(UserInfoActivity r0) {
        return tvReceivePhone_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XiOIO(UserInfoActivity r0, float r1) {
        return selectWeight$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean XiOIii1(UserInfoActivity r0, View r1) {
        return onTitleLeftClick$lambda$0$1(r0, r1);
    }

    public static final /* synthetic */ void access$saveDone(UserInfoActivity r0, AppUser r1) {
        r0.saveDone(r1);
    }

    private final String birthDataFormat(int r3) {
        if (r3 >= 9) goto L7;
        return "0" + r3;
    L7:
        return String.valueOf(r3);
    }

    private final ImageView getIvAvatar() {
        return (ImageView) getValue();
    }

    private final LinearLayout getLlEmailItem() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlPhoneItem() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlReceivePhoneItem() {
        return (LinearLayout) getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final TextView getTvBirthday() {
        return (TextView) getValue();
    }

    private final TextView getTvEmail() {
        return (TextView) getValue();
    }

    private final TextView getTvGender() {
        return (TextView) getValue();
    }

    private final PFMedium getTvNickname() {
        return (PFMedium) getValue();
    }

    private final TextView getTvPhone() {
        return (TextView) getValue();
    }

    private final TextView getTvReceivePhone() {
        return (TextView) getValue();
    }

    private final TextView getTvWeight() {
        return (TextView) getValue();
    }

    public static /* synthetic */ i1Ii1i11X i010I(UserInfoActivity r0) {
        return mCrop_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iIiiO(UserInfoActivity r0) {
        return tvBirthday_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout iOO1ii1(UserInfoActivity r0) {
        return llPhoneItem_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOOX010X(UserInfoActivity r0) {
        return tvGender_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout iX(UserInfoActivity r0) {
        return llEmailItem_delegate$lambda$0(r0);
    }

    private static final ImageView ivAvatar_delegate$lambda$0(UserInfoActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_avatar);
    }

    private static final LinearLayout llEmailItem_delegate$lambda$0(UserInfoActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_email_item);
    }

    private static final LinearLayout llPhoneItem_delegate$lambda$0(UserInfoActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_phone_item);
    }

    private static final LinearLayout llReceivePhoneItem_delegate$lambda$0(UserInfoActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_receive_phone_item);
    }

    private static final i1Ii1i11X mCrop_delegate$lambda$0(UserInfoActivity r3) {
        Activity r0 = r3.getMContext();
        xz3 r1 = r3.mSelectAvatarPopup;
        ImageView r4 = r3.getIvAvatar();
        Intrinsics.O10IXXX0X(r4, "<get-ivAvatar>(...)");
        return OO1010.XIi00iiXO(r0, r1, r4);
    }

    private static final boolean modifyNickName$lambda$0$0(UserInfoActivity r1, String r2) {
        Intrinsics.X0O(r2, "text");
        r1.mAppUser.setNickname(r2);
        r1.getTvNickname().setText(r1.mAppUser.getNickname());
        return true;
    }

    private static final boolean onTitleLeftClick$lambda$0$0(UserInfoActivity r0) {
        r0.finish();
        return true;
    }

    private static final boolean onTitleLeftClick$lambda$0$1(UserInfoActivity r0, View r1) {
        r0.onBottomClick(r1);
        return true;
    }

    private static final View rootView_delegate$lambda$0(UserInfoActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private final void saveDone(AppUser r3) {
        saveUser(r3);
        finish();
        I01XX0.XIi00iiXO(I01XX0.X0i1O, null, 2, null);
    }

    private final void saveUser(AppUser r6) {
        I01XX0.OXO1(I01XX0.X11iII1O1, this.mAppUser.getNickname());
        if (uz0.I0IIOi(sz0.OXO1).exists() == false) goto L5;
        I01XX0.XIi00iiXO(I01XX0.iI, null, 2, null);
    L5:
        a01 r0 = a01.OXO1;
        r0.IiI10X().put(AppUser.class.getName(), new Gson().toJson(r6));
        I01XX0.OXO1(I01XX0.iXiX011, Boolean.FALSE);
        i1O0OXO1O.OXO1.OXO1("saveUser Done " + new Gson().fromJson(r0.IiI10X().getString(AppUser.class.getName()), AppUser.class));
    }

    private static final Unit selectAvatar$lambda$0$0(final UserInfoActivity r3) {
        hr1.OXO1.iOOX010X(r3.getMContext(), new pb6(r3));
        return Unit.OXO1;
    }

    private static final Unit selectAvatar$lambda$0$0$0(UserInfoActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.getMCrop().iO();
    L5:
        return Unit.OXO1;
    }

    private static final Unit selectAvatar$lambda$0$1(final UserInfoActivity r3) {
        hr1.OXO1.OiIIX101O(r3.getMContext(), new qb6(r3));
        return Unit.OXO1;
    }

    private static final Unit selectAvatar$lambda$0$1$0(UserInfoActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        r0.getMCrop().OIX0iXi();
    L5:
        return Unit.OXO1;
    }

    private static final boolean selectBirthday$lambda$0$0(UserInfoActivity r2, int r3, int r4, int r5) {
        r2.mAppUser.setBirthday(r4 + "/" + r5 + "/" + r3);
        r2.setupBirthday();
        return true;
    }

    private static final boolean selectGender$lambda$0$0(UserInfoActivity r2, int r3) {
        AppUser r0 = r2.mAppUser;
        if (r3 != 0) goto L5;
        int r4 = 1;
    L6:
        r0.setGender(r4);
        r2.setupGender();
        r2.sendBleConnector();
        return true;
    L5:
        r4 = 0;
        goto L6
    }

    private static final boolean selectHeight$lambda$0$0(UserInfoActivity r1, float r2) {
        r1.mAppUser.setHeight(r2);
        r1.setupHeight();
        return true;
    }

    private static final boolean selectWeight$lambda$0$0(UserInfoActivity r1, float r2) {
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
        TextView r4 = getTvBirthday();
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
        TextView r0 = getTvGender();
        if (this.mAppUser.getGender() != 0) goto L5;
        int r1 = R.string.female;
    L6:
        r0.setText(r1);
        return;
    L5:
        r1 = R.string.male;
        goto L6
    }

    private final void setupWeight() {
        if (this.mAppUser.getUnit() != 0) goto L6;
        getTvWeight().setText(getString(R.string.f_kg, new Object[]{Float.valueOf(this.mAppUser.getWeight())}));
        return;
    L6:
        getTvWeight().setText(getString(R.string.f_lbs, new Object[]{Float.valueOf(Float.parseFloat(cp5.iX1O1(l76.iO(this.mAppUser.getWeight()), true)))}));
    }

    private static final TextView tvBirthday_delegate$lambda$0(UserInfoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_birthday);
    }

    private static final TextView tvEmail_delegate$lambda$0(UserInfoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_email);
    }

    private static final TextView tvGender_delegate$lambda$0(UserInfoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_gender);
    }

    private static final TextView tvHeight_delegate$lambda$0(UserInfoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_height);
    }

    private static final PFMedium tvNickname_delegate$lambda$0(UserInfoActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_nickname);
    }

    private static final TextView tvPhone_delegate$lambda$0(UserInfoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_phone);
    }

    private static final TextView tvReceivePhone_delegate$lambda$0(UserInfoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_receive_phone);
    }

    private static final TextView tvWeight_delegate$lambda$0(UserInfoActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_weight);
    }

    @aa1
    public final AppUser getMAppUser() {
        return this.mAppUser;
    }

    public final TextView getTvHeight() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.user_info);
        i1Ii1i11X.O10IXXX0X(getMCrop(), this, null, 2, null);
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 r0 = sz0.OXO1;
        File r1 = uz0.OIi0(r0);
        if (r1.exists() == false) goto L6;
        getIvAvatar().setImageURI(Uri.fromFile(r1));
    L6:
        if (this.mAppUser.getAvatarUrl().length() <= 0) goto L8;
        Glide.with(getIvAvatar().getContext()).load(this.mAppUser.getAvatarUrl()).into(getIvAvatar());
    L8:
        com.blankj.utilcode.util.FileUtils.delete(uz0.I0IIOi(r0));
        getTvNickname().setText(this.mAppUser.getNickname());
        setupGender();
        setupBirthday();
        setupHeight();
        setupWeight();
        getTvEmail().setText(this.mAppUser.getEmail());
        LinearLayout r2 = getLlEmailItem();
        a01 r3 = a01.OXO1;
        int r5 = 8;
        if (r3.IiI10X().getBoolean(b01.O001I, true) == true) goto L11;
    L13:
        int r4 = 8;
    L14:
        r2.setVisibility(r4);
        getTvReceivePhone().setText(this.mAppUser.getReceivePhone());
        LinearLayout r6 = getLlReceivePhoneItem();
        if (r3.IiI10X().getBoolean(b01.O001I, true) == true) goto L17;
    L21:
        int r7 = 8;
    L22:
        r6.setVisibility(r7);
        getTvPhone().setText(this.mAppUser.getPhone());
        LinearLayout r8 = getLlPhoneItem();
        if (r3.IiI10X().getBoolean(b01.O001I, true) == true) goto L25;
    L29:
        r8.setVisibility(r5);
        if (i72.OXO1.IOX1() == false) goto L35;
        SPUtils r9 = r3.IiI10X();
        UserMember r10 = (UserMember) new Gson().fromJson(r9.getString(I01XX0.O101 + '_' + UserMember.class.getName()), UserMember.class);
        if (r10 == null) goto L39;
        OiOX0i.iO(r10.getGetMemberFlag());
        return;
    L39:
        return;
    L35:
        SPUtils r11 = r3.IiI10X();
        AccountPoints r12 = (AccountPoints) new Gson().fromJson(r11.getString(I01XX0.iIi0 + '_' + AccountPoints.class.getName()), AccountPoints.class);
        if (r12 == null) goto L40;
        r12.getGetPointFlag();
        return;
    L40:
        return;
    L25:
        if (this.mAppUser.getIdentity().length() <= 0) goto L29;
        if (i72.OXO1.I1XII0X() == false) goto L29;
        r5 = 0;
        goto L29
    L17:
        if (this.mAppUser.getIdentity().length() <= 0) goto L21;
        if (i72.OXO1.XOXOIX0Oi() == false) goto L21;
        r7 = 0;
        goto L22
    L11:
        if (this.mAppUser.getIdentity().length() <= 0) goto L13;
        r4 = 0;
        goto L14
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_user_info;
    }

    public final void modifyNickName(@aa1 View r5) {
        int r0 = 0;
        Intrinsics.X0O(r5, "view");
        getTvNickname().setText(this.mAppUser.getNickname());
        if (this.mEditPop != null) goto L5;
        iii1ii r6 = new iii1ii(getMContext(), r0, 2, null);
        r6.X01IiOiIi().setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        r6.XXX11i(R.string.nickname);
        r6.X11iII1O1(new lb6(this));
        this.mEditPop = r6;
    L5:
        iii1ii r7 = this.mEditPop;
        if (r7 == null) goto L9;
        r7.X01IiOiIi().setText(this.mAppUser.getNickname());
        r7.X01IiOiIi().setTextColor(gk4.iO(getMContext(), R.color.line_color));
        PFMedium r1 = getTvNickname();
        Intrinsics.O10IXXX0X(r1, "<get-tvNickname>(...)");
        r7.I1XOi1(r1);
        return;
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

    public final void onBottomClick(@aa1 View r89) {
        Intrinsics.X0O(r89, "view");
        if (this.mAppUser.getNickname().length() != 0) goto L7;
        ToastUtils.showLong(R.string.please_input_nick_name);
        return;
    L7:
        if (this.mAppUser.getHeight() > i72.OXO1.iX1O1()) goto L11;
        ToastUtils.showLong(R.string.height_set_error);
        return;
    L11:
        if (this.mAppUser.getWeight() > 20.0f) goto L14;
        ToastUtils.showLong(R.string.weight_set_error);
        return;
    L14:
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.USER_PROFILE, BleKeyFlag.UPDATE, this.mAppUser.getBleUserProfile(), false, false, 24, null);
        if (a01.OXO1.IiI10X().getBoolean(b01.O001I, true) == true) goto L17;
    L22:
        sz0 r1 = sz0.OXO1;
        com.blankj.utilcode.util.FileUtils.copy(uz0.I0IIOi(r1), uz0.OIi0(r1));
        saveDone(this.mAppUser);
    L23:
        ArrayList r2 = new ArrayList();
        Weight r5 = new Weight(0, 0, null, 0.0f, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0.0d, null, null, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0, 0, 0, -1, 2097151, null);
        r5.setMTime(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null)[0]);
        String r3 = TimeUtils.millis2String(r5.getMTime(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(r3, "millis2String(...)");
        r5.setMLocalTime(r3);
        r5.setMWeight(this.mAppUser.getWeight());
        r2.add(r5);
        MyDb.INSTANCE.getMDatabase().weightDao().insert(r2);
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
        return;
    L17:
        if (this.mAppUser.getIdentity().length() <= 0) goto L22;
        this.mAppUser.setThirdPlatform(null);
        NetWorkUtils r4 = NetWorkUtils.INSTANCE;
        File r6 = uz0.I0IIOi(sz0.OXO1);
        AppUser r7 = this.mAppUser;
        final O1XIiIO<AppUser> r8 = new AnonymousClass1(this);
        final uq r9 = r4.loadPopup(this, getRootView());
        NetWork r10 = NetWork.OXO1;
        String r11 = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> r12 = new UserInfoActivity$onBottomClick$$inlined$upload$1(this, r8, r9);
        ANRequest.MultiPartBuilder r13 = AndroidNetworking.upload(r11);
        if (r6.exists() == false) goto L21;
        r13.addMultipartFile("avatar", r6);
    L21:
        r13.addMultipartParameter(r7).setTag(r11).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new UserInfoActivity$onBottomClick$$inlined$upload$2(r12));
        goto L23
    }

    @sf5(tag = I01XX0.IXOIIIO)
    public final void onEmailUpdate(@aa1 Object r33) {
        Intrinsics.X0O(r33, "data");
        LogUtils.d(new Object[]{"onEmailUpdate"});
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
        getTvEmail().setText(this.mAppUser.getEmail());
    }

    public final void onGetFreePoints() {
        LogUtils.d(new Object[]{"onGetFreePoints"});
        if (this.mFreePointPopup != null) goto L17;
        this.isGetFreePoint = false;
        OIXX00X r1 = new OIXX00X(this, R.layout.pop_center_prompt_free_point);
        ColorStateList r7 = ColorStateList.valueOf(getResources().getColor(R.color.order_text_orange));
        Intrinsics.O10IXXX0X(r7, "valueOf(...)");
        if (i72.OXO1.IOX1() == false) goto L11;
        SPUtils r2 = a01.OXO1.IiI10X();
        String r3 = (String) new Gson().fromJson(r2.getString(b01.I0IIOI + '_' + String.class.getName()), String.class);
        if (r3 != null) goto L9;
        String r11 = "0";
    L10:
        String r10 = getString(R.string.ai_privileges_giveaway_tip, new Object[]{Integer.valueOf(Integer.parseInt(r11))});
        Intrinsics.O10IXXX0X(r10, "getString(...)");
        r1.XXIIO1i11(R.string.ai_privileges_delivered);
        SpannableStringBuilder r4 = new SpannableStringBuilder(r10);
        r4.setSpan(new TextAppearanceSpan(null, 0, OXI1i1.XIi00iiXO(getMContext(), 16.0f), r7, null), StringsKt__StringsKt.OO1101010(r10, r11, 0, false, 6, null), StringsKt__StringsKt.OO1101010(r10, r11, 0, false, 6, null) + 1, 34);
        r1.iOO1ii1(r4);
    L16:
        this.mFreePointPopup = r1;
        goto L17
    L9:
        r11 = r3;
        goto L10
    L11:
        SPUtils r5 = a01.OXO1.IiI10X();
        String r6 = (String) new Gson().fromJson(r5.getString(I01XX0.iOX + '_' + String.class.getName()), String.class);
        if (r6 != null) goto L14;
        String r12 = "0";
    L15:
        String r13 = getString(R.string.free_points_arrived_tip, new Object[]{Integer.valueOf(Integer.parseInt(r12))});
        Intrinsics.O10IXXX0X(r13, "getString(...)");
        r1.XXIIO1i11(R.string.free_points_arrived);
        SpannableStringBuilder r8 = new SpannableStringBuilder(r13);
        r8.setSpan(new TextAppearanceSpan(null, 0, OXI1i1.XIi00iiXO(getMContext(), 16.0f), r7, null), StringsKt__StringsKt.OO1101010(r13, r12, 0, false, 6, null), StringsKt__StringsKt.OO1101010(r13, r12, 0, false, 6, null) + 1, 34);
        r1.iOO1ii1(r8);
        goto L16
    L14:
        r12 = r6;
    L17:
        OIXX00X r9 = this.mFreePointPopup;
        if (r9 == null) goto L21;
        View r14 = getRootView();
        Intrinsics.O10IXXX0X(r14, "<get-rootView>(...)");
        r9.XiOIO(r14);
        return;
    }

    @sf5(tag = I01XX0.IO0II0i)
    public final void onPhoneUpdate(@aa1 Object r33) {
        Intrinsics.X0O(r33, "data");
        LogUtils.d(new Object[]{"onPhoneUpdate"});
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
        getTvPhone().setText(this.mAppUser.getPhone());
    }

    @sf5(tag = I01XX0.Ii0i)
    public final void onReceivePhoneUpdate(@aa1 Object r33) {
        Intrinsics.X0O(r33, "data");
        LogUtils.d(new Object[]{"onReceivePhoneUpdate"});
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
        getTvReceivePhone().setText(this.mAppUser.getReceivePhone());
    }

    public final void onTitleLeftClick(@aa1 final View r5) {
        Intrinsics.X0O(r5, "view");
        if (com.blankj.utilcode.util.FileUtils.isFileExists(uz0.I0IIOi(sz0.OXO1)) == true) goto L5;
        finish();
        return;
    L5:
        if (this.mSavePopup != null) goto L7;
        int r3 = 0;
        go0 r0 = new go0(this, r3, 2, null);
        r0.O1O(R.string.whether_to_save_change);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new mb6(this));
        r0.X1IX(R.string.save, new nb6(this, r5));
        this.mSavePopup = r0;
    L7:
        go0 r6 = this.mSavePopup;
        if (r6 == null) goto L13;
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r6.I1XOi1(r1);
        return;
    }

    public final void selectAvatar(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mSelectAvatarPopup != null) goto L5;
        xz3 r4 = new xz3(getMContext());
        r4.iX(new hb6(this));
        r4.i010I(new ib6(this));
        this.mSelectAvatarPopup = r4;
    L5:
        xz3 r5 = this.mSelectAvatarPopup;
        if (r5 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
        return;
    }

    public final void selectBirthday(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mBirthdayPopup != null) goto L5;
        O1100iXOX r5 = new O1100iXOX(this);
        r5.iX(R.string.birthday);
        r5.i010I(new ya6(this));
        this.mBirthdayPopup = r5;
    L5:
        O1100iXOX r6 = this.mBirthdayPopup;
        if (r6 == null) goto L9;
        Triple<Integer, Integer, Integer> r0 = cp5.XOO0ii0(this.mAppUser.getBirthday());
        r6.II1Xi0(r0.component1().intValue(), r0.component2().intValue(), r0.component3().intValue());
        r6.IXXOO(System.currentTimeMillis());
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r6.I1XOi1(r1);
        return;
    }

    public final void selectGender(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        int r0 = 1;
        if (this.mGenderPopup != null) goto L5;
        pv1 r5 = new pv1(getMContext(), R.array.genders);
        r5.IXXOO(true);
        r5.iX(R.string.gender);
        r5.i010I(new ob6(this));
        this.mGenderPopup = r5;
    L5:
        pv1 r6 = this.mGenderPopup;
        if (r6 != null) goto L8;
        return;
    L8:
        if (this.mAppUser.getGender() == 0) goto L11;
        r0 = 0;
    L11:
        r6.iOO1ii1(r0);
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r6.I1XOi1(r1);
    }

    public final void selectHeight(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mHeightPopup != null) goto L5;
        XX00 r4 = new XX00(getMContext());
        r4.iX(R.string.height);
        r4.IXXOO(this.mAppUser.getUnit());
        r4.i010I(new jb6(this));
        this.mHeightPopup = r4;
    L5:
        XX00 r5 = this.mHeightPopup;
        if (r5 != null) goto L8;
        return;
    L8:
        if (this.mAppUser.getHeight() != 0.0f) goto L10;
        float r0 = 175.0f;
    L11:
        r5.II1Xi0(r0);
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r5.I1XOi1(r1);
        return;
    L10:
        r0 = this.mAppUser.getHeight();
        goto L11
    }

    public final void selectWeight(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mWeightPopup != null) goto L5;
        j07 r4 = new j07(getMContext());
        r4.i010I(R.string.weight);
        r4.iX(this.mAppUser.getUnit());
        r4.II1Xi0(new kb6(this));
        this.mWeightPopup = r4;
    L5:
        j07 r5 = this.mWeightPopup;
        if (r5 != null) goto L8;
        return;
    L8:
        if (this.mAppUser.getWeight() != 0.0f) goto L10;
        float r0 = 65.0f;
    L11:
        r5.IXXOO(r0);
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r5.I1XOi1(r1);
        return;
    L10:
        r0 = this.mAppUser.getWeight();
        goto L11
    }

    public final void sendBleConnector() {
        BleConnector r0 = BleConnector.INSTANCE;
        if (r0.isBound() == true) goto L5;
        return;
    L5:
        if (i72.OXO1.XXiO0i() == false) goto L12;
        BleKey r1 = BleKey.GIRL_CARE;
        BleKeyFlag r8 = BleKeyFlag.UPDATE;
        BleGirlCareSettings r2 = (BleGirlCareSettings) BaseBleCache.getObject$default(BleCache.INSTANCE, r1, BleGirlCareSettings.class, null, 4, null);
        if (r2 != null) goto L9;
        r2 = new BleGirlCareSettings(0, 0, 10, 0, 2, 3, 0, 0, 0, 5, 28, 451, null);
    L9:
        BaseBleConnector.sendObject$default(r0, r1, r8, r2, false, false, 24, null);
        return;
    L12:
        if (q62.OXO1.iI() == false) goto L16;
        BaseBleConnector.sendObject$default(r0, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, new BleGirlCareSettings(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2047, null), false, false, 24, null);
        return;
    }

    public final void setEmail(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 0);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, EmailBindActivity.class);
        r0.putExtras(r5);
        startActivity(r0);
    }

    public final void setMAppUser(@aa1 AppUser r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAppUser = r2;
    }

    public final void setPhone(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 0);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, PhoneBindActivity.class);
        r0.putExtras(r5);
        startActivity(r0);
    }

    public final void setReceivePhone(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, ReceivePhoneBindActivity.class));
    }

    public void setupHeight() {
        i1O0OXO1O.OXO1.OXO1("AppUser:" + this.mAppUser);
        if (this.mAppUser.getUnit() != 0) goto L6;
        getTvHeight().setText(getString(R.string.f_cm, new Object[]{Float.valueOf(this.mAppUser.getHeight())}));
        return;
    L6:
        int[] r0 = l76.OXO1(this.mAppUser.getHeight());
        getTvHeight().setText(getString(R.string.d_feet_d_inch, new Object[]{Integer.valueOf(r0[0]), Integer.valueOf(r0[1])}));
    }
}
