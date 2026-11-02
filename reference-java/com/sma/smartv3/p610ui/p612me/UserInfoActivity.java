package com.sma.smartv3.p610ui.p612me;

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
import com.android.mltcode.paycertificationapi.C3006uq;
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
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.j07;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.pv1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.xz3;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
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
import com.sma.smartv3.biz.BGEMManager;
import com.sma.smartv3.model.AccountPoints;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppUserUpdate;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.NetWorkUtils$upload$$inlined$upload$1;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.entity.Weight;
import com.sma.smartv3.p610ui.login.EmailBindActivity;
import com.sma.smartv3.p610ui.login.PhoneBindActivity;
import com.sma.smartv3.p610ui.login.ReceivePhoneBindActivity;
import com.sma.smartv3.p610ui.p612me.UserInfoActivity;
import com.sma.smartv3.pro.R;
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
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nUserInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoActivity.kt\ncom/sma/smartv3/ui/me/UserInfoActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 6 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,572:1\n19#2:573\n15#2:574\n90#2:575\n90#2:576\n90#2:655\n90#2:656\n11#2,2:657\n15#2:659\n19#2:660\n15#2:661\n19#2:662\n15#2:663\n19#2:664\n15#2:665\n87#3,7:577\n94#3,3:585\n70#3,7:588\n97#3:595\n69#3,3:596\n72#3,5:600\n87#3,7:605\n94#3,3:613\n70#3,7:616\n97#3:623\n1#4:584\n1#4:599\n1#4:612\n108#5,7:624\n123#5:654\n116#6,23:631\n*S KotlinDebug\n*F\n+ 1 UserInfoActivity.kt\ncom/sma/smartv3/ui/me/UserInfoActivity\n*L\n83#1:573\n83#1:574\n142#1:575\n144#1:576\n509#1:655\n521#1:656\n545#1:657,2\n547#1:659\n554#1:660\n554#1:661\n561#1:662\n561#1:663\n568#1:664\n568#1:665\n408#1:577,7\n408#1:585,3\n408#1:588,7\n408#1:595\n412#1:596,3\n412#1:600,5\n416#1:605,7\n416#1:613,3\n416#1:616,7\n416#1:623\n408#1:584\n412#1:599\n416#1:612\n441#1:624,7\n441#1:654\n441#1:631,23\n*E\n"})
public class UserInfoActivity extends BaseActivity {
    private boolean isGetFreePoint;

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
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rb6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.rootView_delegate$lambda$0(this.f10786IO);
        }
    });

    @aa1
    private final Lazy ivAvatar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wb6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.ivAvatar_delegate$lambda$0(this.f11921IO);
        }
    });

    @aa1
    private final Lazy tvNickname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.za6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.tvNickname_delegate$lambda$0(this.f12578IO);
        }
    });

    @aa1
    private final Lazy tvGender$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ab6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.tvGender_delegate$lambda$0(this.f5463IO);
        }
    });

    @aa1
    private final Lazy tvBirthday$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bb6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.tvBirthday_delegate$lambda$0(this.f5703IO);
        }
    });

    @aa1
    private final Lazy tvHeight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cb6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.tvHeight_delegate$lambda$0(this.f5943IO);
        }
    });

    @aa1
    private final Lazy tvWeight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.db6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.tvWeight_delegate$lambda$0(this.f6161IO);
        }
    });

    @aa1
    private final Lazy tvEmail$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.eb6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.tvEmail_delegate$lambda$0(this.f6377IO);
        }
    });

    @aa1
    private final Lazy llEmailItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fb6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.llEmailItem_delegate$lambda$0(this.f6608IO);
        }
    });

    @aa1
    private final Lazy tvReceivePhone$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gb6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.tvReceivePhone_delegate$lambda$0(this.f6844IO);
        }
    });

    @aa1
    private final Lazy llReceivePhoneItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sb6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.llReceivePhoneItem_delegate$lambda$0(this.f10998IO);
        }
    });

    @aa1
    private final Lazy tvPhone$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tb6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.tvPhone_delegate$lambda$0(this.f11229IO);
        }
    });

    @aa1
    private final Lazy llPhoneItem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ub6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return UserInfoActivity.llPhoneItem_delegate$lambda$0(this.f11457IO);
        }
    });

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[DateTimeFormat.values().length];
            try {
                iArr[DateTimeFormat.ddMMyyyy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DateTimeFormat.yyyyMMdd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OXO1 = iArr;
        }
    }

    public UserInfoActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mCrop$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vb6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return UserInfoActivity.mCrop_delegate$lambda$0(this.f11691IO);
            }
        });
    }

    private final String birthDataFormat(int i) {
        if (i >= 9) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    private final ImageView getIvAvatar() {
        return (ImageView) this.ivAvatar$delegate.getValue();
    }

    private final LinearLayout getLlEmailItem() {
        return (LinearLayout) this.llEmailItem$delegate.getValue();
    }

    private final LinearLayout getLlPhoneItem() {
        return (LinearLayout) this.llPhoneItem$delegate.getValue();
    }

    private final LinearLayout getLlReceivePhoneItem() {
        return (LinearLayout) this.llReceivePhoneItem$delegate.getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) this.mCrop$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final TextView getTvBirthday() {
        return (TextView) this.tvBirthday$delegate.getValue();
    }

    private final TextView getTvEmail() {
        return (TextView) this.tvEmail$delegate.getValue();
    }

    private final TextView getTvGender() {
        return (TextView) this.tvGender$delegate.getValue();
    }

    private final PFMedium getTvNickname() {
        return (PFMedium) this.tvNickname$delegate.getValue();
    }

    private final TextView getTvPhone() {
        return (TextView) this.tvPhone$delegate.getValue();
    }

    private final TextView getTvReceivePhone() {
        return (TextView) this.tvReceivePhone$delegate.getValue();
    }

    private final TextView getTvWeight() {
        return (TextView) this.tvWeight$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivAvatar_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (ImageView) userInfoActivity.findViewById(R.id.iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llEmailItem_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (LinearLayout) userInfoActivity.findViewById(R.id.ll_email_item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llPhoneItem_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (LinearLayout) userInfoActivity.findViewById(R.id.ll_phone_item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llReceivePhoneItem_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (LinearLayout) userInfoActivity.findViewById(R.id.ll_receive_phone_item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i1Ii1i11X mCrop_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        Activity mContext = userInfoActivity.getMContext();
        xz3 xz3Var = userInfoActivity.mSelectAvatarPopup;
        ImageView ivAvatar = userInfoActivity.getIvAvatar();
        Intrinsics.O10IXXX0X(ivAvatar, "<get-ivAvatar>(...)");
        return OO1010.XIi00iiXO(mContext, xz3Var, ivAvatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean modifyNickName$lambda$0$0(UserInfoActivity userInfoActivity, String text) {
        Intrinsics.X0O(text, "text");
        userInfoActivity.mAppUser.setNickname(text);
        userInfoActivity.getTvNickname().setText(userInfoActivity.mAppUser.getNickname());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleLeftClick$lambda$0$0(UserInfoActivity userInfoActivity) {
        userInfoActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleLeftClick$lambda$0$1(UserInfoActivity userInfoActivity, View view) {
        userInfoActivity.onBottomClick(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return userInfoActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveDone(AppUser appUser) {
        saveUser(appUser);
        finish();
        I01XX0.XIi00iiXO(I01XX0.X0i1O, null, 2, null);
    }

    private final void saveUser(AppUser appUser) {
        I01XX0.OXO1(I01XX0.X11iII1O1, this.mAppUser.getNickname());
        if (uz0.I0IIOi(sz0.OXO1).exists()) {
            I01XX0.XIi00iiXO(I01XX0.f1093iI, null, 2, null);
        }
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser));
        I01XX0.OXO1(I01XX0.iXiX011, Boolean.FALSE);
        i1O0OXO1O.OXO1.OXO1("saveUser Done " + new Gson().fromJson(a01Var.IiI10X().getString(AppUser.class.getName()), (Class<Object>) AppUser.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$0(final UserInfoActivity userInfoActivity) {
        hr1.OXO1.iOOX010X(userInfoActivity.getMContext(), new Function1() { // from class: com.android.mltcode.paycertificationapi.pb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserInfoActivity.selectAvatar$lambda$0$0$0(this.f10333IO, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$0$0(UserInfoActivity userInfoActivity, boolean z) {
        if (z) {
            userInfoActivity.getMCrop().m2012iO();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$1(final UserInfoActivity userInfoActivity) {
        hr1.OXO1.OiIIX101O(userInfoActivity.getMContext(), new Function1() { // from class: com.android.mltcode.paycertificationapi.qb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserInfoActivity.selectAvatar$lambda$0$1$0(this.f10574IO, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$1$0(UserInfoActivity userInfoActivity, boolean z) {
        if (z) {
            userInfoActivity.getMCrop().OIX0iXi();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectBirthday$lambda$0$0(UserInfoActivity userInfoActivity, int i, int i2, int i3) {
        userInfoActivity.mAppUser.setBirthday(i2 + "/" + i3 + "/" + i);
        userInfoActivity.setupBirthday();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectGender$lambda$0$0(UserInfoActivity userInfoActivity, int i) {
        userInfoActivity.mAppUser.setGender(i == 0 ? 1 : 0);
        userInfoActivity.setupGender();
        userInfoActivity.sendBleConnector();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectHeight$lambda$0$0(UserInfoActivity userInfoActivity, float f) {
        userInfoActivity.mAppUser.setHeight(f);
        userInfoActivity.setupHeight();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectWeight$lambda$0$0(UserInfoActivity userInfoActivity, float f) {
        userInfoActivity.mAppUser.setWeight(f);
        userInfoActivity.setupWeight();
        return true;
    }

    private final void setupBirthday() {
        String str;
        if (this.mAppUser.getBirthday().length() == 0) {
            this.mAppUser.setBirthday("01/01/2000");
        }
        Triple<Integer, Integer, Integer> tripleXOO0ii0 = cp5.XOO0ii0(this.mAppUser.getBirthday());
        int iIntValue = tripleXOO0ii0.component1().intValue();
        int iIntValue2 = tripleXOO0ii0.component2().intValue();
        int iIntValue3 = tripleXOO0ii0.component3().intValue();
        TextView tvBirthday = getTvBirthday();
        i72 i72Var = i72.OXO1;
        if (i72Var.IiXIIX1O1()) {
            int i = OXO1.OXO1[i72Var.XiOIO().ordinal()];
            if (i == 1) {
                str = birthDataFormat(iIntValue3) + "/" + birthDataFormat(iIntValue2) + "/" + iIntValue;
            } else if (i != 2) {
                str = birthDataFormat(iIntValue2) + "/" + birthDataFormat(iIntValue3) + "/" + iIntValue;
            } else {
                str = iIntValue + "/" + birthDataFormat(iIntValue2) + "/" + birthDataFormat(iIntValue3);
            }
        } else {
            str = birthDataFormat(iIntValue3) + FileUtils.FILE_EXTENSION_SEPARATOR + birthDataFormat(iIntValue2) + FileUtils.FILE_EXTENSION_SEPARATOR + iIntValue;
        }
        tvBirthday.setText(str);
    }

    private final void setupGender() {
        getTvGender().setText(this.mAppUser.getGender() == 0 ? R.string.female : R.string.male);
    }

    private final void setupWeight() {
        if (this.mAppUser.getUnit() == 0) {
            getTvWeight().setText(getString(R.string.f_kg, Float.valueOf(this.mAppUser.getWeight())));
        } else {
            getTvWeight().setText(getString(R.string.f_lbs, Float.valueOf(Float.parseFloat(cp5.iX1O1(l76.m2527iO(this.mAppUser.getWeight()), true)))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvBirthday_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (TextView) userInfoActivity.findViewById(R.id.tv_birthday);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvEmail_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (TextView) userInfoActivity.findViewById(R.id.tv_email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvGender_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (TextView) userInfoActivity.findViewById(R.id.tv_gender);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvHeight_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (TextView) userInfoActivity.findViewById(R.id.tv_height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvNickname_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (PFMedium) userInfoActivity.findViewById(R.id.tv_nickname);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPhone_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (TextView) userInfoActivity.findViewById(R.id.tv_phone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvReceivePhone_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (TextView) userInfoActivity.findViewById(R.id.tv_receive_phone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeight_delegate$lambda$0(UserInfoActivity userInfoActivity) {
        return (TextView) userInfoActivity.findViewById(R.id.tv_weight);
    }

    @aa1
    public final AppUser getMAppUser() {
        return this.mAppUser;
    }

    public final TextView getTvHeight() {
        return (TextView) this.tvHeight$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.user_info);
        i1Ii1i11X.O10IXXX0X(getMCrop(), this, null, 2, null);
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 sz0Var = sz0.OXO1;
        File fileOIi0 = uz0.OIi0(sz0Var);
        if (fileOIi0.exists()) {
            getIvAvatar().setImageURI(Uri.fromFile(fileOIi0));
        }
        if (this.mAppUser.getAvatarUrl().length() > 0) {
            Glide.with(getIvAvatar().getContext()).load(this.mAppUser.getAvatarUrl()).into(getIvAvatar());
        }
        com.blankj.utilcode.util.FileUtils.delete(uz0.I0IIOi(sz0Var));
        getTvNickname().setText(this.mAppUser.getNickname());
        setupGender();
        setupBirthday();
        setupHeight();
        setupWeight();
        getTvEmail().setText(this.mAppUser.getEmail());
        LinearLayout llEmailItem = getLlEmailItem();
        a01 a01Var = a01.OXO1;
        int i = 8;
        llEmailItem.setVisibility((!a01Var.IiI10X().getBoolean(b01.O001I, true) || this.mAppUser.getIdentity().length() <= 0) ? 8 : 0);
        getTvReceivePhone().setText(this.mAppUser.getReceivePhone());
        getLlReceivePhoneItem().setVisibility((a01Var.IiI10X().getBoolean(b01.O001I, true) && this.mAppUser.getIdentity().length() > 0 && i72.OXO1.XOXOIX0Oi()) ? 0 : 8);
        getTvPhone().setText(this.mAppUser.getPhone());
        LinearLayout llPhoneItem = getLlPhoneItem();
        if (a01Var.IiI10X().getBoolean(b01.O001I, true) && this.mAppUser.getIdentity().length() > 0 && i72.OXO1.I1XII0X()) {
            i = 0;
        }
        llPhoneItem.setVisibility(i);
        if (i72.OXO1.IOX1()) {
            SPUtils sPUtilsIiI10X = a01Var.IiI10X();
            UserMember userMember = (UserMember) new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.O101 + '_' + UserMember.class.getName()), UserMember.class);
            if (userMember != null) {
                OiOX0i.m1037iO(userMember.getGetMemberFlag());
                return;
            }
            return;
        }
        SPUtils sPUtilsIiI10X2 = a01Var.IiI10X();
        AccountPoints accountPoints = (AccountPoints) new Gson().fromJson(sPUtilsIiI10X2.getString(I01XX0.iIi0 + '_' + AccountPoints.class.getName()), AccountPoints.class);
        if (accountPoints != null) {
            accountPoints.getGetPointFlag();
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_user_info;
    }

    public final void modifyNickName(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getTvNickname().setText(this.mAppUser.getNickname());
        if (this.mEditPop == null) {
            iii1ii iii1iiVar = new iii1ii(getMContext(), 0, 2, null);
            iii1iiVar.X01IiOiIi().setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
            iii1iiVar.XXX11i(R.string.nickname);
            iii1iiVar.X11iII1O1(new Function1() { // from class: com.android.mltcode.paycertificationapi.lb6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(UserInfoActivity.modifyNickName$lambda$0$0(this.f9406IO, (String) obj));
                }
            });
            this.mEditPop = iii1iiVar;
        }
        iii1ii iii1iiVar2 = this.mEditPop;
        if (iii1iiVar2 != null) {
            iii1iiVar2.X01IiOiIi().setText(this.mAppUser.getNickname());
            iii1iiVar2.X01IiOiIi().setTextColor(gk4.m1859iO(getMContext(), R.color.line_color));
            PFMedium tvNickname = getTvNickname();
            Intrinsics.O10IXXX0X(tvNickname, "<get-tvNickname>(...)");
            iii1iiVar2.I1XOi1(tvNickname);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IOException {
        xz3 xz3Var;
        super.onActivityResult(i, i2, intent);
        i1Ii1i11X.I0IIOi(getMCrop(), i, i2, intent, 0.0d, 0.0d, 0, 0, 120, null);
        xz3 xz3Var2 = this.mSelectAvatarPopup;
        if (xz3Var2 == null || !xz3Var2.isShowing() || (xz3Var = this.mSelectAvatarPopup) == null) {
            return;
        }
        xz3Var.dismiss();
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mAppUser.getNickname().length() == 0) {
            ToastUtils.showLong(R.string.please_input_nick_name);
            return;
        }
        if (this.mAppUser.getHeight() <= i72.OXO1.iX1O1()) {
            ToastUtils.showLong(R.string.height_set_error);
            return;
        }
        if (this.mAppUser.getWeight() <= 20.0f) {
            ToastUtils.showLong(R.string.weight_set_error);
            return;
        }
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.USER_PROFILE, BleKeyFlag.UPDATE, this.mAppUser.getBleUserProfile(), false, false, 24, null);
        if (!a01.OXO1.IiI10X().getBoolean(b01.O001I, true) || this.mAppUser.getIdentity().length() <= 0) {
            sz0 sz0Var = sz0.OXO1;
            com.blankj.utilcode.util.FileUtils.copy(uz0.I0IIOi(sz0Var), uz0.OIi0(sz0Var));
            saveDone(this.mAppUser);
        } else {
            this.mAppUser.setThirdPlatform(null);
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            File fileI0IIOi = uz0.I0IIOi(sz0.OXO1);
            AppUser appUser = this.mAppUser;
            final O1XIiIO<AppUser> o1XIiIO = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.ui.me.UserInfoActivity.onBottomClick.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(AppUser appUser2) {
                    UserInfoActivity.this.saveDone(appUser2);
                    if (q62.OXO1.X01I1OX1i()) {
                        BGEMManager.m38087IO(BGEMManager.OXO1, null, 1, null);
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                }
            };
            final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(this, getRootView());
            NetWork netWork = NetWork.OXO1;
            String str = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
            final O1XIiIO<Response<AppUser>> o1XIiIO2 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.ui.me.UserInfoActivity$onBottomClick$$inlined$upload$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<AppUser> response) {
                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                    Activity activity = this;
                    O1XIiIO o1XIiIO3 = o1XIiIO;
                    C3006uq c3006uq = c3006uqLoadPopup;
                    LogUtils.m11128d(yn0.I0IIOi + response);
                    if (response == null) {
                        response = new Response<>();
                        response.setCode(-1000);
                    }
                    netWorkUtils2.responseWhenCheck(activity, response, o1XIiIO3);
                    if (c3006uq != null) {
                        c3006uq.dismiss();
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
                }
            };
            ANRequest.MultiPartBuilder multiPartBuilderUpload = AndroidNetworking.upload(str);
            if (fileI0IIOi.exists()) {
                multiPartBuilderUpload.addMultipartFile("avatar", fileI0IIOi);
            }
            multiPartBuilderUpload.addMultipartParameter(appUser).setTag((Object) str).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.ui.me.UserInfoActivity$onBottomClick$$inlined$upload$2
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void onResponse(Response<AppUser> response) {
                    Intrinsics.X0O(response, "response");
                    o1XIiIO2.handleResponse(response);
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    o1XIiIO2.handleError(String.valueOf(aNError));
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        Weight weight = new Weight(0, 0L, null, 0.0f, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0.0d, null, null, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0, 0, 0, -1, 2097151, null);
        weight.setMTime(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null)[0]);
        String strMillis2String = TimeUtils.millis2String(weight.getMTime(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
        weight.setMLocalTime(strMillis2String);
        weight.setMWeight(this.mAppUser.getWeight());
        arrayList.add(weight);
        MyDb.INSTANCE.getMDatabase().weightDao().insert(arrayList);
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
    }

    @sf5(tag = I01XX0.IXOIIIO)
    public final void onEmailUpdate(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onEmailUpdate");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        this.mAppUser = (AppUser) appUser;
        getTvEmail().setText(this.mAppUser.getEmail());
    }

    public final void onGetFreePoints() {
        LogUtils.m11128d("onGetFreePoints");
        if (this.mFreePointPopup == null) {
            this.isGetFreePoint = false;
            OIXX00X oixx00x = new OIXX00X(this, R.layout.pop_center_prompt_free_point);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(getResources().getColor(R.color.order_text_orange));
            Intrinsics.O10IXXX0X(colorStateListValueOf, "valueOf(...)");
            if (i72.OXO1.IOX1()) {
                SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
                String str = (String) new Gson().fromJson(sPUtilsIiI10X.getString(b01.I0IIOI + '_' + String.class.getName()), String.class);
                String str2 = str == null ? "0" : str;
                String string = getString(R.string.ai_privileges_giveaway_tip, Integer.valueOf(Integer.parseInt(str2)));
                Intrinsics.O10IXXX0X(string, "getString(...)");
                oixx00x.XXIIO1i11(R.string.ai_privileges_delivered);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, OXI1i1.XIi00iiXO(getMContext(), 16.0f), colorStateListValueOf, null), StringsKt__StringsKt.OO1101010(string, str2, 0, false, 6, null), StringsKt__StringsKt.OO1101010(string, str2, 0, false, 6, null) + 1, 34);
                oixx00x.iOO1ii1(spannableStringBuilder);
            } else {
                SPUtils sPUtilsIiI10X2 = a01.OXO1.IiI10X();
                String str3 = (String) new Gson().fromJson(sPUtilsIiI10X2.getString(I01XX0.iOX + '_' + String.class.getName()), String.class);
                String str4 = str3 == null ? "0" : str3;
                String string2 = getString(R.string.free_points_arrived_tip, Integer.valueOf(Integer.parseInt(str4)));
                Intrinsics.O10IXXX0X(string2, "getString(...)");
                oixx00x.XXIIO1i11(R.string.free_points_arrived);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2);
                spannableStringBuilder2.setSpan(new TextAppearanceSpan(null, 0, OXI1i1.XIi00iiXO(getMContext(), 16.0f), colorStateListValueOf, null), StringsKt__StringsKt.OO1101010(string2, str4, 0, false, 6, null), StringsKt__StringsKt.OO1101010(string2, str4, 0, false, 6, null) + 1, 34);
                oixx00x.iOO1ii1(spannableStringBuilder2);
            }
            this.mFreePointPopup = oixx00x;
        }
        OIXX00X oixx00x2 = this.mFreePointPopup;
        if (oixx00x2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            oixx00x2.XiOIO(rootView);
        }
    }

    @sf5(tag = I01XX0.IO0II0i)
    public final void onPhoneUpdate(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onPhoneUpdate");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        this.mAppUser = (AppUser) appUser;
        getTvPhone().setText(this.mAppUser.getPhone());
    }

    @sf5(tag = I01XX0.Ii0i)
    public final void onReceivePhoneUpdate(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onReceivePhoneUpdate");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        this.mAppUser = (AppUser) appUser;
        getTvReceivePhone().setText(this.mAppUser.getReceivePhone());
    }

    public final void onTitleLeftClick(@aa1 final View view) {
        Intrinsics.X0O(view, "view");
        if (!com.blankj.utilcode.util.FileUtils.isFileExists(uz0.I0IIOi(sz0.OXO1))) {
            finish();
            return;
        }
        if (this.mSavePopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.whether_to_save_change);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.mb6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(UserInfoActivity.onTitleLeftClick$lambda$0$0(this.f9669IO));
                }
            });
            go0Var.X1IX(R.string.save, new Function0() { // from class: com.android.mltcode.paycertificationapi.nb6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(UserInfoActivity.onTitleLeftClick$lambda$0$1(this.f9905IO, view));
                }
            });
            this.mSavePopup = go0Var;
        }
        go0 go0Var2 = this.mSavePopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public final void selectAvatar(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mSelectAvatarPopup == null) {
            xz3 xz3Var = new xz3(getMContext());
            xz3Var.m3321iX(new Function0() { // from class: com.android.mltcode.paycertificationapi.hb6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return UserInfoActivity.selectAvatar$lambda$0$0(this.f7085IO);
                }
            });
            xz3Var.i010I(new Function0() { // from class: com.android.mltcode.paycertificationapi.ib6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return UserInfoActivity.selectAvatar$lambda$0$1(this.f8471IO);
                }
            });
            this.mSelectAvatarPopup = xz3Var;
        }
        xz3 xz3Var2 = this.mSelectAvatarPopup;
        if (xz3Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            xz3Var2.I1XOi1(rootView);
        }
    }

    public final void selectBirthday(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mBirthdayPopup == null) {
            O1100iXOX o1100iXOX = new O1100iXOX(this);
            o1100iXOX.m806iX(R.string.birthday);
            o1100iXOX.i010I(new Function3() { // from class: com.android.mltcode.paycertificationapi.ya6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return Boolean.valueOf(UserInfoActivity.selectBirthday$lambda$0$0(this.f12343IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
                }
            });
            this.mBirthdayPopup = o1100iXOX;
        }
        O1100iXOX o1100iXOX2 = this.mBirthdayPopup;
        if (o1100iXOX2 != null) {
            Triple<Integer, Integer, Integer> tripleXOO0ii0 = cp5.XOO0ii0(this.mAppUser.getBirthday());
            o1100iXOX2.II1Xi0(tripleXOO0ii0.component1().intValue(), tripleXOO0ii0.component2().intValue(), tripleXOO0ii0.component3().intValue());
            o1100iXOX2.IXXOO(System.currentTimeMillis());
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            o1100iXOX2.I1XOi1(rootView);
        }
    }

    public final void selectGender(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mGenderPopup == null) {
            pv1 pv1Var = new pv1(getMContext(), R.array.genders);
            pv1Var.IXXOO(true);
            pv1Var.m2858iX(R.string.gender);
            pv1Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.ob6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(UserInfoActivity.selectGender$lambda$0$0(this.f10106IO, ((Integer) obj).intValue()));
                }
            });
            this.mGenderPopup = pv1Var;
        }
        pv1 pv1Var2 = this.mGenderPopup;
        if (pv1Var2 != null) {
            pv1Var2.iOO1ii1(this.mAppUser.getGender() != 0 ? 0 : 1);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            pv1Var2.I1XOi1(rootView);
        }
    }

    public final void selectHeight(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mHeightPopup == null) {
            XX00 xx00 = new XX00(getMContext());
            xx00.m1326iX(R.string.height);
            xx00.IXXOO(this.mAppUser.getUnit());
            xx00.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.jb6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(UserInfoActivity.selectHeight$lambda$0$0(this.f8936IO, ((Float) obj).floatValue()));
                }
            });
            this.mHeightPopup = xx00;
        }
        XX00 xx01 = this.mHeightPopup;
        if (xx01 != null) {
            xx01.II1Xi0(this.mAppUser.getHeight() == 0.0f ? 175.0f : this.mAppUser.getHeight());
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            xx01.I1XOi1(rootView);
        }
    }

    public final void selectWeight(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mWeightPopup == null) {
            j07 j07Var = new j07(getMContext());
            j07Var.i010I(R.string.weight);
            j07Var.m2360iX(this.mAppUser.getUnit());
            j07Var.II1Xi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.kb6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(UserInfoActivity.selectWeight$lambda$0$0(this.f9141IO, ((Float) obj).floatValue()));
                }
            });
            this.mWeightPopup = j07Var;
        }
        j07 j07Var2 = this.mWeightPopup;
        if (j07Var2 != null) {
            j07Var2.IXXOO(this.mAppUser.getWeight() == 0.0f ? 65.0f : this.mAppUser.getWeight());
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            j07Var2.I1XOi1(rootView);
        }
    }

    public final void sendBleConnector() {
        BleConnector bleConnector = BleConnector.INSTANCE;
        if (bleConnector.isBound()) {
            if (!i72.OXO1.XXiO0i()) {
                if (q62.OXO1.m2892iI()) {
                    BaseBleConnector.sendObject$default(bleConnector, BleKey.GIRL_CARE, BleKeyFlag.UPDATE, new BleGirlCareSettings(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2047, null), false, false, 24, null);
                }
            } else {
                BleKey bleKey = BleKey.GIRL_CARE;
                BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
                BleGirlCareSettings bleGirlCareSettings = (BleGirlCareSettings) BaseBleCache.getObject$default(BleCache.INSTANCE, bleKey, BleGirlCareSettings.class, null, 4, null);
                if (bleGirlCareSettings == null) {
                    bleGirlCareSettings = new BleGirlCareSettings(0, 0, 10, 0, 2, 3, 0, 0, 0, 5, 28, 451, null);
                }
                BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, bleGirlCareSettings, false, false, 24, null);
            }
        }
    }

    public final void setEmail(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 0);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) EmailBindActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public final void setMAppUser(@aa1 AppUser appUser) {
        Intrinsics.X0O(appUser, "<set-?>");
        this.mAppUser = appUser;
    }

    public final void setPhone(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 0);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) PhoneBindActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public final void setReceivePhone(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) ReceivePhoneBindActivity.class));
    }

    public void setupHeight() {
        i1O0OXO1O.OXO1.OXO1("AppUser:" + this.mAppUser);
        if (this.mAppUser.getUnit() == 0) {
            getTvHeight().setText(getString(R.string.f_cm, Float.valueOf(this.mAppUser.getHeight())));
        } else {
            int[] iArrOXO1 = l76.OXO1(this.mAppUser.getHeight());
            getTvHeight().setText(getString(R.string.d_feet_d_inch, Integer.valueOf(iArrOXO1[0]), Integer.valueOf(iArrOXO1[1])));
        }
    }
}
