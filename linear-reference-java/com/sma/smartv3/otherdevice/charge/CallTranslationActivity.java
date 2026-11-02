package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IIIXiOI1i;
import com.android.mltcode.paycertificationapi.IIXO0;
import com.android.mltcode.paycertificationapi.IiiOXXi;
import com.android.mltcode.paycertificationapi.O01i;
import com.android.mltcode.paycertificationapi.OIOX0OIiI;
import com.android.mltcode.paycertificationapi.OO11Oii;
import com.android.mltcode.paycertificationapi.OXOi0;
import com.android.mltcode.paycertificationapi.X01OOIi;
import com.android.mltcode.paycertificationapi.X1i1X10iX;
import com.android.mltcode.paycertificationapi.XOXI0I;
import com.android.mltcode.paycertificationapi.XXi1iXiI;
import com.android.mltcode.paycertificationapi.Xi111;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nCallTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/CallTranslationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n87#2,7:187\n94#2,3:195\n70#2,7:198\n97#2:205\n173#2,7:206\n180#2,3:214\n143#2,7:217\n183#2:224\n173#2,7:225\n180#2,3:233\n143#2,7:236\n183#2:243\n1#3:194\n1#3:213\n1#3:232\n*S KotlinDebug\n*F\n+ 1 CallTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/CallTranslationActivity\n*L\n87#1:187,7\n87#1:195,3\n87#1:198,7\n87#1:205\n111#1:206,7\n111#1:214,3\n111#1:217,7\n111#1:224\n114#1:225,7\n114#1:233,3\n114#1:236,7\n114#1:243\n87#1:194\n111#1:213\n114#1:232\n*E\n"})
public final class CallTranslationActivity extends BaseActivity {
    private final int CODE_LEFT_LANGUAGE;
    private final int CODE_RIGHT_LANGUAGE;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy callMeLanguage$delegate;

    @aa1
    private final Lazy callOtherLanguage$delegate;
    public List<LanguageTranslationData> mLanguageTranslationList;
    public LanguageTranslationData mLeftLanguage;

    @aa1
    private String mMode;
    public LanguageTranslationData mRightLanguage;

    @aa1
    private final Lazy modelVideoCall$delegate;

    @aa1
    private final Lazy modelVoiceCall$delegate;

    public CallTranslationActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new OIOX0OIiI(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new XOXI0I(this));
        this.callMeLanguage$delegate = LazyKt__LazyJVMKt.iO(new OO11Oii(this));
        this.callOtherLanguage$delegate = LazyKt__LazyJVMKt.iO(new O01i(this));
        this.mMode = "video";
        this.modelVideoCall$delegate = LazyKt__LazyJVMKt.iO(new IIIXiOI1i(this));
        this.modelVoiceCall$delegate = LazyKt__LazyJVMKt.iO(new X1i1X10iX(this));
        this.CODE_LEFT_LANGUAGE = 103;
        this.CODE_RIGHT_LANGUAGE = 105;
    }

    public static /* synthetic */ void I0iXXO(CallTranslationActivity r0, View r1) {
        initView$lambda$3(r0, r1);
    }

    public static /* synthetic */ TextView I1XOi1(CallTranslationActivity r0) {
        return callMeLanguage_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(CallTranslationActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(CallTranslationActivity r0, PermissionStatus r1) {
        return permission$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView OIX0iXi(CallTranslationActivity r0) {
        return callOtherLanguage_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OiIIX101O(CallTranslationActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(CallTranslationActivity r0) {
        return modelVoiceCall_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(CallTranslationActivity r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ PFMedium XX0(CallTranslationActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(CallTranslationActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOIO(CallTranslationActivity r0, AITranslationUrl r1) {
        return getCallTranslationUrl$lambda$0(r0, r1);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(CallTranslationActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(CallTranslationActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private static final TextView callMeLanguage_delegate$lambda$0(CallTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.translation_call_me_language);
    }

    private static final TextView callOtherLanguage_delegate$lambda$0(CallTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.translation_call_other_language);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final TextView getCallMeLanguage() {
        return (TextView) getValue();
    }

    private final TextView getCallOtherLanguage() {
        return (TextView) getValue();
    }

    private final void getCallTranslationUrl() {
        if (i72.OXO1.O001I().length() != 0) goto L6;
        ToastUtils.showLong(R.string.login_user_info_error);
        return;
    L6:
        AIManager.OXO1.X0O(getMLeftLanguage().getAsrLanguage(), getMRightLanguage().getAsrLanguage(), this.mMode, new OXOi0(this));
    }

    private static final Unit getCallTranslationUrl$lambda$0(CallTranslationActivity r3, AITranslationUrl r4) {
        if (r4 == null) goto L4;
        String r0 = r4.getCreateUrl();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", r0);
        r1.putInt("mArg1", 2);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r4);
        Intent r5 = new Intent(r3, WebTranslationActivity.class);
        r5.putExtras(r1);
        r3.startActivity(r5);
    L6:
        return Unit.OXO1;
    L4:
        ToastUtils.showLong(R.string.voice_assistant_common_error);
        goto L6
    }

    private final TextView getModelVideoCall() {
        return (TextView) getValue();
    }

    private final TextView getModelVoiceCall() {
        return (TextView) getValue();
    }

    public static /* synthetic */ TextView iIiiO(CallTranslationActivity r0) {
        return modelVideoCall_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(CallTranslationActivity r5, View r6) {
        int r7 = r5.CODE_LEFT_LANGUAGE;
        LanguageTranslationData r0 = r5.getMLeftLanguage();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", null);
        r1.putInt("mArg1", 1);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r0);
        Intent r2 = new Intent(r5, ChooseLanguageActivity.class);
        r2.putExtras(r1);
        r5.startActivityForResult(r2, r7);
    }

    private static final void initView$lambda$1(CallTranslationActivity r5, View r6) {
        int r7 = r5.CODE_RIGHT_LANGUAGE;
        LanguageTranslationData r0 = r5.getMRightLanguage();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", null);
        r1.putInt("mArg1", 1);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r0);
        Intent r2 = new Intent(r5, ChooseLanguageActivity.class);
        r2.putExtras(r1);
        r5.startActivityForResult(r2, r7);
    }

    private static final void initView$lambda$2(CallTranslationActivity r1, View r2) {
        r1.mMode = "video";
        TextView r3 = r1.getModelVideoCall();
        Intrinsics.O10IXXX0X(r3, "<get-modelVideoCall>(...)");
        r1.setDrawableLeft(r3, R.drawable.ic_eq_mode_select_sel);
        TextView r4 = r1.getModelVoiceCall();
        Intrinsics.O10IXXX0X(r4, "<get-modelVoiceCall>(...)");
        r1.setDrawableLeft(r4, R.drawable.ic_eq_mode_select_nor);
    }

    private static final void initView$lambda$3(CallTranslationActivity r1, View r2) {
        r1.mMode = "audio";
        TextView r3 = r1.getModelVoiceCall();
        Intrinsics.O10IXXX0X(r3, "<get-modelVoiceCall>(...)");
        r1.setDrawableLeft(r3, R.drawable.ic_eq_mode_select_sel);
        TextView r4 = r1.getModelVideoCall();
        Intrinsics.O10IXXX0X(r4, "<get-modelVideoCall>(...)");
        r1.setDrawableLeft(r4, R.drawable.ic_eq_mode_select_nor);
    }

    private static final TextView modelVideoCall_delegate$lambda$0(CallTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.translation_call_video_call);
    }

    private static final TextView modelVoiceCall_delegate$lambda$0(CallTranslationActivity r1) {
        return (TextView) r1.findViewById(R.id.translation_call_voice_call);
    }

    private final void permission() {
        PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.MICROPHONE, PermissionConstants.CAMERA});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        String r1 = getString(R.string.microphone_explain_title);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        String r3 = getString(R.string.microphone_explain_content);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        ds1.XIi00iiXO(r0, r1, r3, new IiiOXXi(this));
    }

    private static final Unit permission$lambda$0(CallTranslationActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        if (r2 != PermissionStatus.GRANTED) goto L6;
        r1.getCallTranslationUrl();
    L6:
        return Unit.OXO1;
    }

    private final void setDrawableLeft(TextView r2, int r3) {
        r2.setCompoundDrawablesWithIntrinsicBounds(r3, 0, 0, 0);
    }

    @aa1
    public final List<LanguageTranslationData> getMLanguageTranslationList() {
        List<LanguageTranslationData> r0 = this.mLanguageTranslationList;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mLanguageTranslationList");
        return null;
    }

    @aa1
    public final LanguageTranslationData getMLeftLanguage() {
        LanguageTranslationData r0 = this.mLeftLanguage;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mLeftLanguage");
        return null;
    }

    @aa1
    public final LanguageTranslationData getMRightLanguage() {
        LanguageTranslationData r0 = this.mRightLanguage;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mRightLanguage");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setMLanguageTranslationList(LanguageTranslationKt.getCallTranslationLanguageList());
        setMLeftLanguage(getMLanguageTranslationList().get(0));
        setMRightLanguage(getMLanguageTranslationList().get(1));
        getAbhTitleCenter().setText(getString(R.string.call_translation));
        getCallMeLanguage().setText(getMLeftLanguage().getName());
        getCallOtherLanguage().setText(getMRightLanguage().getName());
        getCallMeLanguage().setOnClickListener(new X01OOIi(this));
        getCallOtherLanguage().setOnClickListener(new Xi111(this));
        getModelVideoCall().setOnClickListener(new IIXO0(this));
        getModelVoiceCall().setOnClickListener(new XXi1iXiI(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_translation_call;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r6, int r7, @tb1 Intent r8) {
        super.onActivityResult(r6, r7, r8);
        if (r7 == (-1)) goto L5;
        return;
    L5:
        if (r6 != this.CODE_LEFT_LANGUAGE) goto L16;
        if (r8 == null) goto L8;
        Serializable r9 = r8.getSerializableExtra("language");
    L9:
        Intrinsics.X1ii(r9, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
        LanguageTranslationData r10 = (LanguageTranslationData) r9;
        if (Intrinsics.XOO0ii0(r10.getName(), getMRightLanguage().getName()) == true) goto L13;
        setMLeftLanguage(r10);
        getCallMeLanguage().setText(getMLeftLanguage().getName());
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        return;
    L13:
        LanguageTranslationData r11 = getMLeftLanguage();
        setMLeftLanguage(getMRightLanguage());
        setMRightLanguage(r11);
        getCallMeLanguage().setText(getMLeftLanguage().getName());
        getCallOtherLanguage().setText(getMRightLanguage().getName());
        return;
    L8:
        r9 = null;
        goto L9
    L16:
        if (r6 != this.CODE_RIGHT_LANGUAGE) goto L27;
        if (r8 == null) goto L19;
        Serializable r12 = r8.getSerializableExtra("language");
    L20:
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
        LanguageTranslationData r13 = (LanguageTranslationData) r12;
        if (Intrinsics.XOO0ii0(getMLeftLanguage().getName(), r13.getName()) == true) goto L24;
        setMRightLanguage(r13);
        getCallOtherLanguage().setText(getMRightLanguage().getName());
        I01XX0.XIi00iiXO(I01XX0.iX01, null, 2, null);
        return;
    L24:
        LanguageTranslationData r14 = getMLeftLanguage();
        setMLeftLanguage(getMRightLanguage());
        setMRightLanguage(r14);
        getCallMeLanguage().setText(getMLeftLanguage().getName());
        getCallOtherLanguage().setText(getMRightLanguage().getName());
        return;
    L19:
        r12 = null;
        goto L20
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.MICROPHONE, PermissionConstants.CAMERA}) == false) goto L6;
        getCallTranslationUrl();
        return;
    L6:
        permission();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    public final void setMLanguageTranslationList(@aa1 List<LanguageTranslationData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLanguageTranslationList = r2;
    }

    public final void setMLeftLanguage(@aa1 LanguageTranslationData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLeftLanguage = r2;
    }

    public final void setMRightLanguage(@aa1 LanguageTranslationData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRightLanguage = r2;
    }
}
