package com.sma.smartv3.p610ui.sport.coach.guide;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1100iXOX;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XX00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.j07;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.pv1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.LogUtils;
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
import com.sma.smartv3.p610ui.sport.coach.AICoachManage;
import com.sma.smartv3.p610ui.sport.coach.guide.PersonalInformationFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.DateTimeFormat;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
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
    protected Activity mContext;

    @tb1
    private pv1 mGenderPopup;

    @tb1
    private XX00 mHeightPopup;

    @tb1
    private j07 mWeightPopup;

    @aa1
    private final Lazy mGenderLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vt1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationFragment.mGenderLayout_delegate$lambda$0(this.f11807IO);
        }
    });

    @aa1
    private final Lazy mDateBirthLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.du1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationFragment.mDateBirthLayout_delegate$lambda$0(this.f6269IO);
        }
    });

    @aa1
    private final Lazy mHeightLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.eu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationFragment.mHeightLayout_delegate$lambda$0(this.f6487IO);
        }
    });

    @aa1
    private final Lazy mWeightLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationFragment.mWeightLayout_delegate$lambda$0(this.f6733IO);
        }
    });

    @aa1
    private final Lazy mGenderTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationFragment.mGenderTv_delegate$lambda$0(this.f6960IO);
        }
    });

    @aa1
    private final Lazy mBirthdayTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationFragment.mBirthdayTv_delegate$lambda$0(this.f7205IO);
        }
    });

    @aa1
    private final Lazy mHeightTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iu1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationFragment.mHeightTv_delegate$lambda$0(this.f8758IO);
        }
    });

    @aa1
    private final Lazy mWeightTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ju1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationFragment.mWeightTv_delegate$lambda$0(this.f9040IO);
        }
    });

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ku1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalInformationFragment.rootView_delegate$lambda$0(this.f9281IO);
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

    public PersonalInformationFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    private final String birthDataFormat(int i) {
        if (i >= 9) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mBirthdayTv_delegate$lambda$0(PersonalInformationFragment personalInformationFragment) {
        return (TextView) personalInformationFragment.getMView().findViewById(R.id.personal_ll_date_birth_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout mDateBirthLayout_delegate$lambda$0(PersonalInformationFragment personalInformationFragment) {
        return (RelativeLayout) personalInformationFragment.getMView().findViewById(R.id.personal_ll_date_birth_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout mGenderLayout_delegate$lambda$0(PersonalInformationFragment personalInformationFragment) {
        return (RelativeLayout) personalInformationFragment.getMView().findViewById(R.id.personal_ll_gender_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mGenderTv_delegate$lambda$0(PersonalInformationFragment personalInformationFragment) {
        return (TextView) personalInformationFragment.getMView().findViewById(R.id.personal_ll_gender_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout mHeightLayout_delegate$lambda$0(PersonalInformationFragment personalInformationFragment) {
        return (RelativeLayout) personalInformationFragment.getMView().findViewById(R.id.personal_ll_height_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mHeightTv_delegate$lambda$0(PersonalInformationFragment personalInformationFragment) {
        return (TextView) personalInformationFragment.getMView().findViewById(R.id.personal_ll_height_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout mWeightLayout_delegate$lambda$0(PersonalInformationFragment personalInformationFragment) {
        return (RelativeLayout) personalInformationFragment.getMView().findViewById(R.id.personal_ll_weight_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mWeightTv_delegate$lambda$0(PersonalInformationFragment personalInformationFragment) {
        return (TextView) personalInformationFragment.getMView().findViewById(R.id.personal_ll_weight_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(PersonalInformationFragment personalInformationFragment) {
        return personalInformationFragment.getMView().findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectBirthday$lambda$0$0(PersonalInformationFragment personalInformationFragment, int i, int i2, int i3) {
        personalInformationFragment.mAppUser.setBirthday(i2 + "/" + i3 + "/" + i);
        personalInformationFragment.setupBirthday();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectGender$lambda$0$0(PersonalInformationFragment personalInformationFragment, int i) {
        personalInformationFragment.mAppUser.setGender(i == 0 ? 1 : 0);
        personalInformationFragment.getMGenderTv().setText(i == 0 ? R.string.male : R.string.female);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectHeight$lambda$0$0(PersonalInformationFragment personalInformationFragment, float f) {
        personalInformationFragment.mAppUser.setHeight(f);
        personalInformationFragment.setupHeight();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean selectWeight$lambda$0$0(PersonalInformationFragment personalInformationFragment, float f) {
        personalInformationFragment.mAppUser.setWeight(f);
        personalInformationFragment.setupWeight();
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
        TextView mBirthdayTv = getMBirthdayTv();
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
        mBirthdayTv.setText(str);
    }

    private final void setupGender() {
        getMGenderTv().setText(this.mAppUser.getGender() == 1 ? R.string.male : R.string.female);
    }

    private final void setupHeight() {
        if (this.mAppUser.getUnit() == 0) {
            getMHeightTv().setText(getString(R.string.f_cm, Float.valueOf(this.mAppUser.getHeight())));
        } else {
            int[] iArrOXO1 = l76.OXO1(this.mAppUser.getHeight());
            getMHeightTv().setText(getString(R.string.d_feet_d_inch, Integer.valueOf(iArrOXO1[0]), Integer.valueOf(iArrOXO1[1])));
        }
    }

    private final void setupWeight() {
        if (this.mAppUser.getUnit() == 0) {
            getMWeightTv().setText(getString(R.string.f_kg, Float.valueOf(this.mAppUser.getWeight())));
        } else {
            getMWeightTv().setText(getString(R.string.f_lbs, Float.valueOf(Float.parseFloat(cp5.iX1O1(l76.m2527iO(this.mAppUser.getWeight()), true)))));
        }
    }

    public final TextView getMBirthdayTv() {
        return (TextView) this.mBirthdayTv$delegate.getValue();
    }

    @aa1
    public final Activity getMContext() {
        Activity activity = this.mContext;
        if (activity != null) {
            return activity;
        }
        Intrinsics.XXO("mContext");
        return null;
    }

    public final RelativeLayout getMDateBirthLayout() {
        return (RelativeLayout) this.mDateBirthLayout$delegate.getValue();
    }

    public final RelativeLayout getMGenderLayout() {
        return (RelativeLayout) this.mGenderLayout$delegate.getValue();
    }

    public final TextView getMGenderTv() {
        return (TextView) this.mGenderTv$delegate.getValue();
    }

    public final RelativeLayout getMHeightLayout() {
        return (RelativeLayout) this.mHeightLayout$delegate.getValue();
    }

    public final TextView getMHeightTv() {
        return (TextView) this.mHeightTv$delegate.getValue();
    }

    public final RelativeLayout getMWeightLayout() {
        return (RelativeLayout) this.mWeightLayout$delegate.getValue();
    }

    public final TextView getMWeightTv() {
        return (TextView) this.mWeightTv$delegate.getValue();
    }

    public final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        FragmentActivity activity = getActivity();
        Intrinsics.X1ii(activity, "null cannot be cast to non-null type android.app.Activity");
        setMContext(activity);
        setupGender();
        setupBirthday();
        setupHeight();
        setupWeight();
        getMGenderLayout().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.lu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9519IO.selectGender();
            }
        });
        getMDateBirthLayout().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.wt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12030IO.selectBirthday();
            }
        });
        getMHeightLayout().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12230IO.selectHeight();
            }
        });
        getMWeightLayout().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.yt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12448IO.selectWeight();
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.ai_coach_personal_information;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
        this.mAppUser.setThirdPlatform(null);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        File fileI0IIOi = uz0.I0IIOi(sz0.OXO1);
        AppUser appUser = this.mAppUser;
        final O1XIiIO<AppUser> o1XIiIO = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.ui.sport.coach.guide.PersonalInformationFragment.onSlideDeselected.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppUser appUser2) {
                a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(PersonalInformationFragment.this.mAppUser));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.XIi00iiXO("PersonalInformationActivity doneClick  handleError ");
                a01 a01Var = a01.OXO1;
                a01Var.IiI10X().put(b01.XXO, true);
                a01Var.IiI10X().put(AppUser.class.getName(), new Gson().toJson(PersonalInformationFragment.this.mAppUser));
            }
        };
        final FragmentActivity fragmentActivityRequireActivity = requireActivity();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(fragmentActivityRequireActivity, null);
        NetWork netWork = NetWork.OXO1;
        String str = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> o1XIiIO2 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.ui.sport.coach.guide.PersonalInformationFragment$onSlideDeselected$$inlined$upload$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AppUser> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity = fragmentActivityRequireActivity;
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
        multiPartBuilderUpload.addMultipartParameter(appUser).setTag((Object) str).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.ui.sport.coach.guide.PersonalInformationFragment$onSlideDeselected$$inlined$upload$default$2
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
        int iOXO1 = O0X11OiO.OXO1(this.mAppUser.getBirthday());
        AICoachManage.OXO1 oxo1 = AICoachManage.IiI10X;
        oxo1.OXO1().X0O().setUserAge(iOXO1);
        AICoachManage.OiIIX101O(oxo1.OXO1(), iOXO1, this.mAppUser.getGender(), this.mAppUser.getHeight(), this.mAppUser.getWeight(), 0, 0, 0.0f, 0.0f, null, null, 1008, null);
        oxo1.OXO1().XO0O10();
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
    }

    public final void selectBirthday() {
        if (this.mBirthdayPopup == null) {
            O1100iXOX o1100iXOX = new O1100iXOX(getMContext());
            o1100iXOX.m806iX(R.string.birthday);
            o1100iXOX.i010I(new Function3() { // from class: com.android.mltcode.paycertificationapi.au1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return Boolean.valueOf(PersonalInformationFragment.selectBirthday$lambda$0$0(this.f5569IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
                }
            });
            this.mBirthdayPopup = o1100iXOX;
        }
        O1100iXOX o1100iXOX2 = this.mBirthdayPopup;
        if (o1100iXOX2 != null) {
            Triple<Integer, Integer, Integer> tripleXOO0ii0 = cp5.XOO0ii0(this.mAppUser.getBirthday());
            o1100iXOX2.II1Xi0(tripleXOO0ii0.component1().intValue(), tripleXOO0ii0.component2().intValue(), tripleXOO0ii0.component3().intValue());
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            o1100iXOX2.I1XOi1(rootView);
        }
    }

    public final void selectGender() {
        if (this.mGenderPopup == null) {
            pv1 pv1Var = new pv1(getMContext(), R.array.genders);
            pv1Var.IXXOO(true);
            pv1Var.m2858iX(R.string.gender);
            pv1Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.cu1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(PersonalInformationFragment.selectGender$lambda$0$0(this.f6050IO, ((Integer) obj).intValue()));
                }
            });
            this.mGenderPopup = pv1Var;
        }
        pv1 pv1Var2 = this.mGenderPopup;
        if (pv1Var2 != null) {
            CharSequence text = getMGenderTv().getText();
            Intrinsics.O10IXXX0X(text, "getText(...)");
            CharSequence charSequenceIX1X1 = StringsKt__StringsKt.iX1X1(text);
            String string = getString(R.string.male);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            pv1Var2.iOO1ii1(1 ^ (Intrinsics.XOO0ii0(charSequenceIX1X1, StringsKt__StringsKt.iX1X1(string).toString()) ? 1 : 0));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            pv1Var2.I1XOi1(rootView);
        }
    }

    public final void selectHeight() {
        if (this.mHeightPopup == null) {
            XX00 xx00 = new XX00(getMContext());
            xx00.m1326iX(R.string.height);
            xx00.IXXOO(this.mAppUser.getUnit());
            xx00.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.zt1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(PersonalInformationFragment.selectHeight$lambda$0$0(this.f12688IO, ((Float) obj).floatValue()));
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

    public final void selectWeight() {
        if (this.mWeightPopup == null) {
            j07 j07Var = new j07(getMContext());
            j07Var.i010I(R.string.weight);
            j07Var.m2360iX(this.mAppUser.getUnit());
            j07Var.II1Xi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.bu1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(PersonalInformationFragment.selectWeight$lambda$0$0(this.f5816IO, ((Float) obj).floatValue()));
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

    public final void setMContext(@aa1 Activity activity) {
        Intrinsics.X0O(activity, "<set-?>");
        this.mContext = activity;
    }
}
