package com.sma.smartv3.p610ui.login;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OO1010;
import com.android.mltcode.paycertificationapi.XO1I00i;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dg1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
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
import com.sma.smartv3.p610ui.login.PersonalInformationActivity;
import com.sma.smartv3.p610ui.main.MainActivity;
import com.sma.smartv3.pro.R;
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
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPersonalInformationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalInformationActivity.kt\ncom/sma/smartv3/ui/login/PersonalInformationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n19#2:423\n15#2:424\n27#2,2:456\n11#2,2:467\n108#3,7:425\n123#3:455\n116#4,23:432\n69#5,3:458\n72#5,5:462\n1#6:461\n*S KotlinDebug\n*F\n+ 1 PersonalInformationActivity.kt\ncom/sma/smartv3/ui/login/PersonalInformationActivity\n*L\n72#1:423\n72#1:424\n272#1:456,2\n287#1:467,2\n234#1:425,7\n234#1:455\n234#1:432,23\n276#1:458,3\n276#1:462,5\n276#1:461\n*E\n"})
public final class PersonalInformationActivity extends BaseActivity {

    @aa1
    private AppUser mAppUser;

    @aa1
    private final Lazy mCrop$delegate;

    @tb1
    private xz3 mSelectAvatarPopup;

    @aa1
    private PersonalInfo nowLl;
    private int stepGoalValue;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ut1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.rootView_delegate$lambda$0(this.f11567IO);
        }
    });

    @aa1
    private final Lazy llNameAndGender$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dt1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.llNameAndGender_delegate$lambda$0(this.f6261IO);
        }
    });

    @aa1
    private final Lazy llBirthdayAndUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ft1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.llBirthdayAndUnit_delegate$lambda$0(this.f6727IO);
        }
    });

    @aa1
    private final Lazy llHeightAndWeight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gt1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.llHeightAndWeight_delegate$lambda$0(this.f6953IO);
        }
    });

    @aa1
    private final Lazy llMovingTarget$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ht1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.llMovingTarget_delegate$lambda$0(this.f7196IO);
        }
    });

    @aa1
    private final Lazy ivAvatar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.it1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.ivAvatar_delegate$lambda$0(this.f8751IO);
        }
    });

    @aa1
    private final Lazy edtNickname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jt1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.edtNickname_delegate$lambda$0(this.f9037IO);
        }
    });

    @aa1
    private final Lazy rbMale$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kt1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.rbMale_delegate$lambda$0(this.f9276IO);
        }
    });

    @aa1
    private final Lazy rbFemale$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lt1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.rbFemale_delegate$lambda$0(this.f9514IO);
        }
    });

    @aa1
    private final Lazy rbMetric$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mt1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.rbMetric_delegate$lambda$0(this.f9781IO);
        }
    });

    @aa1
    private final Lazy rbImperial$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ss1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.rbImperial_delegate$lambda$0(this.f11116IO);
        }
    });

    @aa1
    private final Lazy datePicker$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ts1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.datePicker_delegate$lambda$0(this.f11346IO);
        }
    });

    @aa1
    private final Lazy heightPicker$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.us1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.heightPicker_delegate$lambda$0(this.f11560IO);
        }
    });

    @aa1
    private final Lazy weightPicker$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vs1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.weightPicker_delegate$lambda$0(this.f11800IO);
        }
    });

    @aa1
    private final Lazy wv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ws1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.wv_delegate$lambda$0(this.f12024IO);
        }
    });

    @aa1
    private final Lazy distanceGoal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xs1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.distanceGoal_delegate$lambda$0(this.f12226IO);
        }
    });

    @aa1
    private final Lazy caloriesGoal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ys1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.caloriesGoal_delegate$lambda$0(this.f12440IO);
        }
    });

    @aa1
    private final Lazy distanceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zs1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.distanceUnit_delegate$lambda$0(this.f12685IO);
        }
    });

    @aa1
    private final Lazy titleLeft$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.at1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.titleLeft_delegate$lambda$0(this.f5562IO);
        }
    });

    @aa1
    private final Lazy nickNameLine$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bt1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationActivity.nickNameLine_delegate$lambda$0(this.f5810IO);
        }
    });

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[PersonalInfo.values().length];
            try {
                iArr[PersonalInfo.BIRTHDAY_UNIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonalInfo.HEIGHT_WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PersonalInfo.MOVING_TARGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PersonalInfo.NAME_GENDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            OXO1 = iArr;
        }
    }

    public PersonalInformationActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.nowLl = PersonalInfo.NAME_GENDER;
        this.mCrop$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.et1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return PersonalInformationActivity.mCrop_delegate$lambda$0(this.f6481IO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold caloriesGoal_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (DINCondBold) personalInformationActivity.findViewById(R.id.caloriesGoal);
    }

    private final void countGoal(String str) {
        this.stepGoalValue = Integer.parseInt(str);
        getDistanceGoal().setText(cp5.IO0II0i(this.mAppUser.getHeight(), this.stepGoalValue, this.mAppUser.getUnit()));
        getCaloriesGoal().setText(cp5.IXOIIIO(this.mAppUser.getGender(), this.mAppUser.getWeight(), this.stepGoalValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DatePicker datePicker_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (DatePicker) personalInformationActivity.findViewById(R.id.datePicker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold distanceGoal_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (DINCondBold) personalInformationActivity.findViewById(R.id.distanceGoal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium distanceUnit_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (PFMedium) personalInformationActivity.findViewById(R.id.nowGoalUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextInputEditText edtNickname_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (TextInputEditText) personalInformationActivity.findViewById(R.id.edtNickname);
    }

    private final DINCondBold getCaloriesGoal() {
        return (DINCondBold) this.caloriesGoal$delegate.getValue();
    }

    private final DatePicker getDatePicker() {
        return (DatePicker) this.datePicker$delegate.getValue();
    }

    private final DINCondBold getDistanceGoal() {
        return (DINCondBold) this.distanceGoal$delegate.getValue();
    }

    private final PFMedium getDistanceUnit() {
        return (PFMedium) this.distanceUnit$delegate.getValue();
    }

    private final TextInputEditText getEdtNickname() {
        return (TextInputEditText) this.edtNickname$delegate.getValue();
    }

    private final HeightPicker getHeightPicker() {
        return (HeightPicker) this.heightPicker$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageViewRound getIvAvatar() {
        return (ImageViewRound) this.ivAvatar$delegate.getValue();
    }

    private final RelativeLayout getLlBirthdayAndUnit() {
        return (RelativeLayout) this.llBirthdayAndUnit$delegate.getValue();
    }

    private final RelativeLayout getLlHeightAndWeight() {
        return (RelativeLayout) this.llHeightAndWeight$delegate.getValue();
    }

    private final RelativeLayout getLlMovingTarget() {
        return (RelativeLayout) this.llMovingTarget$delegate.getValue();
    }

    private final RelativeLayout getLlNameAndGender() {
        return (RelativeLayout) this.llNameAndGender$delegate.getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) this.mCrop$delegate.getValue();
    }

    private final View getNickNameLine() {
        return (View) this.nickNameLine$delegate.getValue();
    }

    private final RadioButton getRbFemale() {
        return (RadioButton) this.rbFemale$delegate.getValue();
    }

    private final RadioButton getRbImperial() {
        return (RadioButton) this.rbImperial$delegate.getValue();
    }

    private final RadioButton getRbMale() {
        return (RadioButton) this.rbMale$delegate.getValue();
    }

    private final RadioButton getRbMetric() {
        return (RadioButton) this.rbMetric$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final ImageView getTitleLeft() {
        return (ImageView) this.titleLeft$delegate.getValue();
    }

    private final WeightPicker getWeightPicker() {
        return (WeightPicker) this.weightPicker$delegate.getValue();
    }

    private final WheelView getWv() {
        return (WheelView) this.wv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void heightAndWeightClick$lambda$0$0(PersonalInformationActivity personalInformationActivity, int i) {
        personalInformationActivity.countGoal(XO1I00i.OXO1().get(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeightPicker heightPicker_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (HeightPicker) personalInformationActivity.findViewById(R.id.heightPicker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(PersonalInformationActivity personalInformationActivity, View view, boolean z) {
        personalInformationActivity.getNickNameLine().setVisibility(z ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound ivAvatar_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (ImageViewRound) personalInformationActivity.findViewById(R.id.iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout llBirthdayAndUnit_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (RelativeLayout) personalInformationActivity.findViewById(R.id.llBirthdayAndUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout llHeightAndWeight_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (RelativeLayout) personalInformationActivity.findViewById(R.id.llHeightAndWeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout llMovingTarget_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (RelativeLayout) personalInformationActivity.findViewById(R.id.llMovingTarget);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout llNameAndGender_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (RelativeLayout) personalInformationActivity.findViewById(R.id.llNameAndGender);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i1Ii1i11X mCrop_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        Activity mContext = personalInformationActivity.getMContext();
        xz3 xz3Var = personalInformationActivity.mSelectAvatarPopup;
        ImageViewRound ivAvatar = personalInformationActivity.getIvAvatar();
        Intrinsics.O10IXXX0X(ivAvatar, "<get-ivAvatar>(...)");
        return OO1010.XIi00iiXO(mContext, xz3Var, ivAvatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View nickNameLine_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return personalInformationActivity.findViewById(R.id.nickNameLine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RadioButton rbFemale_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (RadioButton) personalInformationActivity.findViewById(R.id.rbFemale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RadioButton rbImperial_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (RadioButton) personalInformationActivity.findViewById(R.id.rbImperial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RadioButton rbMale_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (RadioButton) personalInformationActivity.findViewById(R.id.rbMale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RadioButton rbMetric_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (RadioButton) personalInformationActivity.findViewById(R.id.rbMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return personalInformationActivity.findViewById(R.id.root_view);
    }

    private final void saveUser(AppUser appUser) {
        I01XX0.XIi00iiXO(I01XX0.IiiXiI0I, null, 2, null);
        I01XX0.OXO1(I01XX0.X11iII1O1, this.mAppUser.getNickname());
        if (uz0.I0IIOi(sz0.OXO1).exists()) {
            I01XX0.XIi00iiXO(I01XX0.f1093iI, null, 2, null);
        }
        a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$0(final PersonalInformationActivity personalInformationActivity) {
        hr1.OXO1.iOOX010X(personalInformationActivity.getMContext(), new Function1() { // from class: com.android.mltcode.paycertificationapi.tt1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PersonalInformationActivity.selectAvatar$lambda$0$0$0(this.f11352IO, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$0$0(PersonalInformationActivity personalInformationActivity, boolean z) {
        if (z) {
            personalInformationActivity.getMCrop().m2012iO();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$1(final PersonalInformationActivity personalInformationActivity) {
        hr1.OXO1.OiIIX101O(personalInformationActivity.getMContext(), new Function1() { // from class: com.android.mltcode.paycertificationapi.ot1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PersonalInformationActivity.selectAvatar$lambda$0$1$0(this.f10216IO, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$1$0(PersonalInformationActivity personalInformationActivity, boolean z) {
        if (z) {
            personalInformationActivity.getMCrop().OIX0iXi();
        }
        return Unit.OXO1;
    }

    private final void setBirthday() {
        DatePicker datePicker = getDatePicker();
        datePicker.setVisibleCount(3);
        datePicker.setMListener(new Function3() { // from class: com.android.mltcode.paycertificationapi.qt1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return PersonalInformationActivity.setBirthday$lambda$0$0(this.f10672IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        if (this.mAppUser.getBirthday().length() == 0) {
            this.mAppUser.setBirthday("01/01/2000");
        }
        Triple<Integer, Integer, Integer> tripleXOO0ii0 = cp5.XOO0ii0(this.mAppUser.getBirthday());
        getDatePicker().m38933IO(tripleXOO0ii0.component1().intValue(), tripleXOO0ii0.component2().intValue(), tripleXOO0ii0.component3().intValue());
        getDatePicker().setMaxDate(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setBirthday$lambda$0$0(PersonalInformationActivity personalInformationActivity, int i, int i2, int i3) {
        personalInformationActivity.mAppUser.setBirthday(i2 + "/" + i3 + "/" + i);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDone(AppUser appUser) {
        saveUser(appUser);
        BaseBleCache.putInt$default(BleCache.INSTANCE, BleKey.STEP_GOAL, this.stepGoalValue, null, 4, null);
        a01.OXO1.XO0O10().remove(AppUser.class.getName());
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    private final void setHeight() {
        HeightPicker heightPicker = getHeightPicker();
        heightPicker.setVisibleCount(3);
        heightPicker.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.nt1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PersonalInformationActivity.setHeight$lambda$0$0(this.f10010IO, ((Float) obj).floatValue());
            }
        });
        getHeightPicker().setHeight(this.mAppUser.getHeight());
        getHeightPicker().setUnit(this.mAppUser.getUnit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHeight$lambda$0$0(PersonalInformationActivity personalInformationActivity, float f) {
        personalInformationActivity.mAppUser.setHeight(f);
        return Unit.OXO1;
    }

    private final void setWeight() {
        WeightPicker weightPicker = getWeightPicker();
        weightPicker.setVisibleCount(3);
        weightPicker.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.pt1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PersonalInformationActivity.setWeight$lambda$0$0(this.f10433IO, ((Float) obj).floatValue());
            }
        });
        getWeightPicker().setWeight(this.mAppUser.getWeight());
        getWeightPicker().setUnit(this.mAppUser.getUnit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setWeight$lambda$0$0(PersonalInformationActivity personalInformationActivity, float f) {
        personalInformationActivity.mAppUser.setWeight(f);
        return Unit.OXO1;
    }

    private final void showContent(PersonalInfo personalInfo) {
        int i = OXO1.OXO1[personalInfo.ordinal()];
        if (i == 1) {
            getLlNameAndGender().setVisibility(8);
            getLlBirthdayAndUnit().setVisibility(0);
            getLlHeightAndWeight().setVisibility(8);
            getLlMovingTarget().setVisibility(8);
            getTitleLeft().setVisibility(0);
            this.nowLl = PersonalInfo.BIRTHDAY_UNIT;
            return;
        }
        if (i == 2) {
            getLlNameAndGender().setVisibility(8);
            getLlBirthdayAndUnit().setVisibility(8);
            getLlHeightAndWeight().setVisibility(0);
            getLlMovingTarget().setVisibility(8);
            getTitleLeft().setVisibility(0);
            this.nowLl = PersonalInfo.HEIGHT_WEIGHT;
            return;
        }
        if (i == 3) {
            getLlNameAndGender().setVisibility(8);
            getLlBirthdayAndUnit().setVisibility(8);
            getLlHeightAndWeight().setVisibility(8);
            getLlMovingTarget().setVisibility(0);
            getTitleLeft().setVisibility(0);
            this.nowLl = PersonalInfo.MOVING_TARGET;
            return;
        }
        if (i != 4) {
            finish();
            return;
        }
        getLlNameAndGender().setVisibility(0);
        getLlBirthdayAndUnit().setVisibility(8);
        getLlHeightAndWeight().setVisibility(8);
        getLlMovingTarget().setVisibility(8);
        getTitleLeft().setVisibility(4);
        this.nowLl = PersonalInfo.NAME_GENDER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView titleLeft_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (ImageView) personalInformationActivity.findViewById(R.id.abh_title_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeightPicker weightPicker_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (WeightPicker) personalInformationActivity.findViewById(R.id.weightPicker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WheelView wv_delegate$lambda$0(PersonalInformationActivity personalInformationActivity) {
        return (WheelView) personalInformationActivity.findViewById(R.id.f51425wv);
    }

    public final void birthdayAndUnitClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.mAppUser.setUnit(!getRbMetric().isChecked() ? 1 : 0);
        LogUtils.m11128d(this.mAppUser.toString());
        setHeight();
        setWeight();
        showContent(PersonalInfo.HEIGHT_WEIGHT);
    }

    public final void doneClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mAppUser.getHeight() == 0.0f && this.mAppUser.getWeight() == 0.0f) {
            ToastUtils.showLong(R.string.user_does_not_exist);
            return;
        }
        UploadInfoManager uploadInfoManager = UploadInfoManager.OXO1;
        uploadInfoManager.O00(this.mAppUser);
        if (!a01.OXO1.IiI10X().getBoolean(b01.O001I, true)) {
            sz0 sz0Var = sz0.OXO1;
            FileUtils.copy(uz0.I0IIOi(sz0Var), uz0.OIi0(sz0Var));
            setDone(this.mAppUser);
            try {
                uploadInfoManager.I0iXXO();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.mAppUser.setThirdPlatform(null);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        File fileI0IIOi = uz0.I0IIOi(sz0.OXO1);
        AppUser appUser = this.mAppUser;
        final O1XIiIO<AppUser> o1XIiIO = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.ui.login.PersonalInformationActivity.doneClick.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppUser appUser2) {
                PersonalInformationActivity.this.setDone(appUser2);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.XIi00iiXO("PersonalInformationActivity doneClick  handleError ");
                a01.OXO1.IiI10X().put(b01.XXO, true);
                PersonalInformationActivity personalInformationActivity = PersonalInformationActivity.this;
                personalInformationActivity.setDone(personalInformationActivity.mAppUser);
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(this, getRootView());
        NetWork netWork = NetWork.OXO1;
        String str = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> o1XIiIO2 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.ui.login.PersonalInformationActivity$doneClick$$inlined$upload$1
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
        multiPartBuilderUpload.addMultipartParameter(appUser).setTag((Object) str).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.ui.login.PersonalInformationActivity$doneClick$$inlined$upload$2
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

    public final void heightAndWeightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mAppUser.getHeight() <= i72.OXO1.iX1O1()) {
            ToastUtils.showLong(R.string.height_set_error);
            return;
        }
        if (this.mAppUser.getWeight() <= 20.0f) {
            ToastUtils.showLong(R.string.weight_set_error);
            return;
        }
        getDistanceUnit().setText(cp5.XX0(this.mAppUser.getUnit()));
        WheelView wv = getWv();
        Intrinsics.O10IXXX0X(wv, "<get-wv>(...)");
        XO1I00i.XIi00iiXO(wv, 5);
        countGoal(XO1I00i.OXO1().get(5));
        getWv().setListener(new dg1() { // from class: com.android.mltcode.paycertificationapi.rs1
            @Override // com.android.mltcode.paycertificationapi.dg1
            public final void OXO1(int i) {
                PersonalInformationActivity.heightAndWeightClick$lambda$0$0(this.OXO1, i);
            }
        });
        LogUtils.m11128d(this.mAppUser.toString());
        showContent(PersonalInfo.MOVING_TARGET);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.personal_information);
        findViewById(R.id.abh_title_right).setVisibility(8);
        i1Ii1i11X.O10IXXX0X(getMCrop(), this, null, 2, null);
        showContent(PersonalInfo.NAME_GENDER);
        getRbMale().setChecked(true);
        i72 i72Var = i72.OXO1;
        if (i72Var.iOIIiI1()) {
            getRbMetric().setChecked(true);
            getRbImperial().setChecked(false);
        } else {
            getRbMetric().setChecked(false);
            getRbImperial().setChecked(true);
        }
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), i72Var.IiiXiI0I() ? R.drawable.personal_info_default_avatar : R.drawable.pic_avatar_default));
        if (this.mAppUser.getAvatarUrl().length() > 0) {
            NetWorkUtils.INSTANCE.getImage(this.mAppUser.getAvatarUrl(), uz0.OIi0(sz0.OXO1), new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.login.PersonalInformationActivity.initView.1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    I01XX0.XIi00iiXO(I01XX0.iX1O1, null, 2, null);
                    PersonalInformationActivity.this.getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0.OXO1)));
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                }
            });
        } else {
            sz0 sz0Var = sz0.OXO1;
            if (uz0.OIi0(sz0Var).exists()) {
                getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
            }
        }
        getEdtNickname().setText(this.mAppUser.getNickname());
        getEdtNickname().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.android.mltcode.paycertificationapi.ct1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                PersonalInformationActivity.initView$lambda$0(this.OXO1, view, z);
            }
        });
        if (this.mAppUser.getWeight() == 0.0f) {
            this.mAppUser.setWeight(65.0f);
        }
        if (this.mAppUser.getHeight() == 0.0f) {
            this.mAppUser.setHeight(175.0f);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_personal_info;
    }

    public final void nameAndGenderClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (String.valueOf(getEdtNickname().getText()).length() == 0) {
            ToastUtils.showLong(R.string.please_input_nick_name);
            return;
        }
        this.mAppUser.setNickname(String.valueOf(getEdtNickname().getText()));
        this.mAppUser.setGender(!getRbFemale().isChecked() ? 1 : 0);
        setBirthday();
        LogUtils.m11128d(this.mAppUser.toString());
        showContent(PersonalInfo.BIRTHDAY_UNIT);
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

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        View rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        onTitleLeftClick(rootView);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        int i = OXO1.OXO1[this.nowLl.ordinal()];
        if (i == 1) {
            showContent(PersonalInfo.NAME_GENDER);
        } else if (i == 2) {
            showContent(PersonalInfo.BIRTHDAY_UNIT);
        } else {
            if (i != 3) {
                return;
            }
            showContent(PersonalInfo.HEIGHT_WEIGHT);
        }
    }

    public final void onTitleRightOtherClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    public final void selectAvatar(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mSelectAvatarPopup == null) {
            xz3 xz3Var = new xz3(getMContext());
            xz3Var.m3321iX(new Function0() { // from class: com.android.mltcode.paycertificationapi.rt1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return PersonalInformationActivity.selectAvatar$lambda$0$0(this.f10902IO);
                }
            });
            xz3Var.i010I(new Function0() { // from class: com.android.mltcode.paycertificationapi.st1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return PersonalInformationActivity.selectAvatar$lambda$0$1(this.f11123IO);
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
}
