package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.model.AITranslationUrl;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.otherdevice.charge.CallTranslationActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nCallTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/CallTranslationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n87#2,7:187\n94#2,3:195\n70#2,7:198\n97#2:205\n173#2,7:206\n180#2,3:214\n143#2,7:217\n183#2:224\n173#2,7:225\n180#2,3:233\n143#2,7:236\n183#2:243\n1#3:194\n1#3:213\n1#3:232\n*S KotlinDebug\n*F\n+ 1 CallTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/CallTranslationActivity\n*L\n87#1:187,7\n87#1:195,3\n87#1:198,7\n87#1:205\n111#1:206,7\n111#1:214,3\n111#1:217,7\n111#1:224\n114#1:225,7\n114#1:233,3\n114#1:236,7\n114#1:243\n87#1:194\n111#1:213\n114#1:232\n*E\n"})
public final class CallTranslationActivity extends BaseActivity {
    public List<LanguageTranslationData> mLanguageTranslationList;
    public LanguageTranslationData mLeftLanguage;
    public LanguageTranslationData mRightLanguage;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIOX0OIiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CallTranslationActivity.abhTitleCenter_delegate$lambda$0(this.f3019IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOXI0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CallTranslationActivity.abhTitleRight_delegate$lambda$0(this.f4857IO);
        }
    });

    @aa1
    private final Lazy callMeLanguage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO11Oii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CallTranslationActivity.callMeLanguage_delegate$lambda$0(this.f3175IO);
        }
    });

    @aa1
    private final Lazy callOtherLanguage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O01i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CallTranslationActivity.callOtherLanguage_delegate$lambda$0(this.f2418IO);
        }
    });

    @aa1
    private String mMode = "video";

    @aa1
    private final Lazy modelVideoCall$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIIXiOI1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CallTranslationActivity.modelVideoCall_delegate$lambda$0(this.f1592IO);
        }
    });

    @aa1
    private final Lazy modelVoiceCall$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1i1X10iX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CallTranslationActivity.modelVoiceCall_delegate$lambda$0(this.f4384IO);
        }
    });
    private final int CODE_LEFT_LANGUAGE = 103;
    private final int CODE_RIGHT_LANGUAGE = 105;

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(CallTranslationActivity callTranslationActivity) {
        return (PFMedium) callTranslationActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(CallTranslationActivity callTranslationActivity) {
        return (ImageView) callTranslationActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView callMeLanguage_delegate$lambda$0(CallTranslationActivity callTranslationActivity) {
        return (TextView) callTranslationActivity.findViewById(R.id.translation_call_me_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView callOtherLanguage_delegate$lambda$0(CallTranslationActivity callTranslationActivity) {
        return (TextView) callTranslationActivity.findViewById(R.id.translation_call_other_language);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final TextView getCallMeLanguage() {
        return (TextView) this.callMeLanguage$delegate.getValue();
    }

    private final TextView getCallOtherLanguage() {
        return (TextView) this.callOtherLanguage$delegate.getValue();
    }

    private final void getCallTranslationUrl() {
        if (i72.OXO1.O001I().length() == 0) {
            ToastUtils.showLong(R.string.login_user_info_error);
        } else {
            AIManager.OXO1.X0O(getMLeftLanguage().getAsrLanguage(), getMRightLanguage().getAsrLanguage(), this.mMode, new Function1() { // from class: com.android.mltcode.paycertificationapi.OXOi0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CallTranslationActivity.getCallTranslationUrl$lambda$0(this.f3521IO, (AITranslationUrl) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCallTranslationUrl$lambda$0(CallTranslationActivity callTranslationActivity, AITranslationUrl aITranslationUrl) {
        if (aITranslationUrl != null) {
            String createUrl = aITranslationUrl.getCreateUrl();
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", createUrl);
            bundle.putInt("mArg1", 2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", aITranslationUrl);
            Intent intent = new Intent(callTranslationActivity, (Class<?>) WebTranslationActivity.class);
            intent.putExtras(bundle);
            callTranslationActivity.startActivity(intent);
        } else {
            ToastUtils.showLong(R.string.voice_assistant_common_error);
        }
        return Unit.OXO1;
    }

    private final TextView getModelVideoCall() {
        return (TextView) this.modelVideoCall$delegate.getValue();
    }

    private final TextView getModelVoiceCall() {
        return (TextView) this.modelVoiceCall$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(CallTranslationActivity callTranslationActivity, View view) {
        int i = callTranslationActivity.CODE_LEFT_LANGUAGE;
        LanguageTranslationData mLeftLanguage = callTranslationActivity.getMLeftLanguage();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", mLeftLanguage);
        Intent intent = new Intent(callTranslationActivity, (Class<?>) ChooseLanguageActivity.class);
        intent.putExtras(bundle);
        callTranslationActivity.startActivityForResult(intent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(CallTranslationActivity callTranslationActivity, View view) {
        int i = callTranslationActivity.CODE_RIGHT_LANGUAGE;
        LanguageTranslationData mRightLanguage = callTranslationActivity.getMRightLanguage();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", mRightLanguage);
        Intent intent = new Intent(callTranslationActivity, (Class<?>) ChooseLanguageActivity.class);
        intent.putExtras(bundle);
        callTranslationActivity.startActivityForResult(intent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(CallTranslationActivity callTranslationActivity, View view) {
        callTranslationActivity.mMode = "video";
        TextView modelVideoCall = callTranslationActivity.getModelVideoCall();
        Intrinsics.O10IXXX0X(modelVideoCall, "<get-modelVideoCall>(...)");
        callTranslationActivity.setDrawableLeft(modelVideoCall, R.drawable.ic_eq_mode_select_sel);
        TextView modelVoiceCall = callTranslationActivity.getModelVoiceCall();
        Intrinsics.O10IXXX0X(modelVoiceCall, "<get-modelVoiceCall>(...)");
        callTranslationActivity.setDrawableLeft(modelVoiceCall, R.drawable.ic_eq_mode_select_nor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(CallTranslationActivity callTranslationActivity, View view) {
        callTranslationActivity.mMode = "audio";
        TextView modelVoiceCall = callTranslationActivity.getModelVoiceCall();
        Intrinsics.O10IXXX0X(modelVoiceCall, "<get-modelVoiceCall>(...)");
        callTranslationActivity.setDrawableLeft(modelVoiceCall, R.drawable.ic_eq_mode_select_sel);
        TextView modelVideoCall = callTranslationActivity.getModelVideoCall();
        Intrinsics.O10IXXX0X(modelVideoCall, "<get-modelVideoCall>(...)");
        callTranslationActivity.setDrawableLeft(modelVideoCall, R.drawable.ic_eq_mode_select_nor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView modelVideoCall_delegate$lambda$0(CallTranslationActivity callTranslationActivity) {
        return (TextView) callTranslationActivity.findViewById(R.id.translation_call_video_call);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView modelVoiceCall_delegate$lambda$0(CallTranslationActivity callTranslationActivity) {
        return (TextView) callTranslationActivity.findViewById(R.id.translation_call_voice_call);
    }

    private final void permission() {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.MICROPHONE, PermissionConstants.CAMERA);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        String string = getString(R.string.microphone_explain_title);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        String string2 = getString(R.string.microphone_explain_content);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        ds1.XIi00iiXO(permissionUtilsPermission, string, string2, new Function1() { // from class: com.android.mltcode.paycertificationapi.IiiOXXi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CallTranslationActivity.permission$lambda$0(this.f2331IO, (PermissionStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit permission$lambda$0(CallTranslationActivity callTranslationActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            callTranslationActivity.getCallTranslationUrl();
        }
        return Unit.OXO1;
    }

    private final void setDrawableLeft(TextView textView, int i) {
        textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }

    @aa1
    public final List<LanguageTranslationData> getMLanguageTranslationList() {
        List<LanguageTranslationData> list = this.mLanguageTranslationList;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("mLanguageTranslationList");
        return null;
    }

    @aa1
    public final LanguageTranslationData getMLeftLanguage() {
        LanguageTranslationData languageTranslationData = this.mLeftLanguage;
        if (languageTranslationData != null) {
            return languageTranslationData;
        }
        Intrinsics.XXO("mLeftLanguage");
        return null;
    }

    @aa1
    public final LanguageTranslationData getMRightLanguage() {
        LanguageTranslationData languageTranslationData = this.mRightLanguage;
        if (languageTranslationData != null) {
            return languageTranslationData;
        }
        Intrinsics.XXO("mRightLanguage");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setMLanguageTranslationList(LanguageTranslationKt.getCallTranslationLanguageList());
        setMLeftLanguage(getMLanguageTranslationList().get(0));
        setMRightLanguage(getMLanguageTranslationList().get(1));
        getAbhTitleCenter().setText(getString(R.string.call_translation));
        getCallMeLanguage().setText(getMLeftLanguage().getName());
        getCallOtherLanguage().setText(getMRightLanguage().getName());
        getCallMeLanguage().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X01OOIi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CallTranslationActivity.initView$lambda$0(this.f3928IO, view);
            }
        });
        getCallOtherLanguage().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Xi111
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CallTranslationActivity.initView$lambda$1(this.f5219IO, view);
            }
        });
        getModelVideoCall().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IIXO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CallTranslationActivity.initView$lambda$2(this.f1651IO, view);
            }
        });
        getModelVoiceCall().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XXi1iXiI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CallTranslationActivity.initView$lambda$3(this.f5155IO, view);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_translation_call;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == this.CODE_LEFT_LANGUAGE) {
                Serializable serializableExtra = intent != null ? intent.getSerializableExtra("language") : null;
                Intrinsics.X1ii(serializableExtra, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
                LanguageTranslationData languageTranslationData = (LanguageTranslationData) serializableExtra;
                if (!Intrinsics.XOO0ii0(languageTranslationData.getName(), getMRightLanguage().getName())) {
                    setMLeftLanguage(languageTranslationData);
                    getCallMeLanguage().setText(getMLeftLanguage().getName());
                    I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
                    return;
                } else {
                    LanguageTranslationData mLeftLanguage = getMLeftLanguage();
                    setMLeftLanguage(getMRightLanguage());
                    setMRightLanguage(mLeftLanguage);
                    getCallMeLanguage().setText(getMLeftLanguage().getName());
                    getCallOtherLanguage().setText(getMRightLanguage().getName());
                    return;
                }
            }
            if (i == this.CODE_RIGHT_LANGUAGE) {
                Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("language") : null;
                Intrinsics.X1ii(serializableExtra2, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
                LanguageTranslationData languageTranslationData2 = (LanguageTranslationData) serializableExtra2;
                if (!Intrinsics.XOO0ii0(getMLeftLanguage().getName(), languageTranslationData2.getName())) {
                    setMRightLanguage(languageTranslationData2);
                    getCallOtherLanguage().setText(getMRightLanguage().getName());
                    I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
                } else {
                    LanguageTranslationData mLeftLanguage2 = getMLeftLanguage();
                    setMLeftLanguage(getMRightLanguage());
                    setMRightLanguage(mLeftLanguage2);
                    getCallMeLanguage().setText(getMLeftLanguage().getName());
                    getCallOtherLanguage().setText(getMRightLanguage().getName());
                }
            }
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (PermissionUtils.isGranted(PermissionConstants.MICROPHONE, PermissionConstants.CAMERA)) {
            getCallTranslationUrl();
        } else {
            permission();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    public final void setMLanguageTranslationList(@aa1 List<LanguageTranslationData> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mLanguageTranslationList = list;
    }

    public final void setMLeftLanguage(@aa1 LanguageTranslationData languageTranslationData) {
        Intrinsics.X0O(languageTranslationData, "<set-?>");
        this.mLeftLanguage = languageTranslationData;
    }

    public final void setMRightLanguage(@aa1 LanguageTranslationData languageTranslationData) {
        Intrinsics.X0O(languageTranslationData, "<set-?>");
        this.mRightLanguage = languageTranslationData;
    }
}
