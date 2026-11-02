package com.sma.smartv3.otherdevice.charge;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.IO10XO00I;
import com.android.mltcode.paycertificationapi.IXIIX;
import com.android.mltcode.paycertificationapi.IiiO100;
import com.android.mltcode.paycertificationapi.OIOIOXO;
import com.android.mltcode.paycertificationapi.XIOX;
import com.android.mltcode.paycertificationapi.XIX0IiX;
import com.android.mltcode.paycertificationapi.Xii1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O1OiiOX;
import com.android.mltcode.paycertificationapi.iXOO1i;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.otherdevice.jl.view.RulerView;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAncMode;
import com.szabh.smable3.entity.BleEarphoneAncSettings;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nCustomAncActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAncActivity.kt\ncom/sma/smartv3/otherdevice/charge/CustomAncActivity\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,273:1\n106#2:274\n78#2,22:275\n106#2:297\n78#2,22:298\n*S KotlinDebug\n*F\n+ 1 CustomAncActivity.kt\ncom/sma/smartv3/otherdevice/charge/CustomAncActivity\n*L\n182#1:274\n182#1:275,22\n183#1:297\n183#1:298,22\n*E\n"})
public final class CustomAncActivity extends BaseChargeActivity {

    @aa1
    private final Lazy clLeft$delegate;

    @aa1
    private final Lazy clRight$delegate;
    private boolean isLeftEdit;
    private boolean isRightEdit;

    @aa1
    private BleEarphoneAncSettings mEarphoneAncSettings;

    @tb1
    private iii1ii mEditPop;

    @aa1
    private final Lazy rulerLeft$delegate;

    @aa1
    private final Lazy rulerRight$delegate;

    @aa1
    private final Lazy tvLeftTips$delegate;

    @aa1
    private final Lazy tvLeftValue$delegate;

    @aa1
    private final Lazy tvRightTips$delegate;

    @aa1
    private final Lazy tvRightValue$delegate;

    public static final class OXO1 implements RulerView.O00 {
        public final /* synthetic */ CustomAncActivity OXO1;

        public OXO1(CustomAncActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.otherdevice.jl.view.RulerView.O00
        public void OXO1(String r4) {
            Intrinsics.X0O(r4, "result");
            BleAncMode r0 = CustomAncActivity.access$getMEarphoneAncSettings$p(this.OXO1).getMAncModeList().get(CustomAncActivity.access$getMEarphoneAncSettings$p(this.OXO1).getMMode());
            if (CustomAncActivity.access$isLeftEdit$p(this.OXO1) == false) goto L5;
            CustomAncActivity.access$setLeftEdit$p(this.OXO1, false);
            int r5 = Math.round(Float.parseFloat(r4));
        L7:
            if (r5 <= r0.getMLeftMax()) goto L9;
            r5 = r0.getMLeftMax();
            ToastUtils.showLong(R.string.maximum_tips);
        L9:
            CustomAncActivity.access$getTvLeftValue(this.OXO1).setText(String.valueOf(r5));
            return;
        L5:
            r5 = Math.round(Float.parseFloat(r4) / 100) * 100;
            goto L7
        }

        @Override // com.sma.smartv3.otherdevice.jl.view.RulerView.O00
        public void XIi00iiXO(String r4) {
            Intrinsics.X0O(r4, "result");
            BleAncMode r0 = CustomAncActivity.access$getMEarphoneAncSettings$p(this.OXO1).getMAncModeList().get(CustomAncActivity.access$getMEarphoneAncSettings$p(this.OXO1).getMMode());
            if (CustomAncActivity.access$isLeftEdit$p(this.OXO1) == false) goto L5;
            CustomAncActivity.access$setLeftEdit$p(this.OXO1, false);
            int r5 = Math.round(Float.parseFloat(r4));
        L7:
            if (r5 <= r0.getMLeftMax()) goto L9;
            r5 = r0.getMLeftMax();
            ToastUtils.showLong(R.string.maximum_tips);
        L9:
            CustomAncActivity.access$getTvLeftValue(this.OXO1).setText(String.valueOf(r5));
            return;
        L5:
            r5 = Math.round(Float.parseFloat(r4) / 100) * 100;
            goto L7
        }
    }

    public static final class XIi00iiXO implements RulerView.O00 {
        public final /* synthetic */ CustomAncActivity OXO1;

        public XIi00iiXO(CustomAncActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.otherdevice.jl.view.RulerView.O00
        public void OXO1(String r4) {
            Intrinsics.X0O(r4, "result");
            BleAncMode r0 = CustomAncActivity.access$getMEarphoneAncSettings$p(this.OXO1).getMAncModeList().get(CustomAncActivity.access$getMEarphoneAncSettings$p(this.OXO1).getMMode());
            if (CustomAncActivity.access$isRightEdit$p(this.OXO1) == false) goto L5;
            CustomAncActivity.access$setRightEdit$p(this.OXO1, false);
            int r5 = Math.round(Float.parseFloat(r4));
        L7:
            if (r5 <= r0.getMRightMax()) goto L9;
            r5 = r0.getMRightMax();
            ToastUtils.showLong(R.string.maximum_tips);
        L9:
            CustomAncActivity.access$getTvRightValue(this.OXO1).setText(String.valueOf(r5));
            return;
        L5:
            r5 = Math.round(Float.parseFloat(r4) / 100) * 100;
            goto L7
        }

        @Override // com.sma.smartv3.otherdevice.jl.view.RulerView.O00
        public void XIi00iiXO(String r4) {
            Intrinsics.X0O(r4, "result");
            BleAncMode r0 = CustomAncActivity.access$getMEarphoneAncSettings$p(this.OXO1).getMAncModeList().get(CustomAncActivity.access$getMEarphoneAncSettings$p(this.OXO1).getMMode());
            if (CustomAncActivity.access$isLeftEdit$p(this.OXO1) == false) goto L5;
            CustomAncActivity.access$setLeftEdit$p(this.OXO1, false);
            int r5 = Math.round(Float.parseFloat(r4));
        L7:
            if (r5 <= r0.getMLeftMax()) goto L9;
            r5 = r0.getMLeftMax();
            ToastUtils.showLong(R.string.maximum_tips);
        L9:
            CustomAncActivity.access$getTvRightValue(this.OXO1).setText(String.valueOf(r5));
            return;
        L5:
            r5 = Math.round(Float.parseFloat(r4) / 100) * 100;
            goto L7
        }
    }

    public CustomAncActivity() {
        this.clLeft$delegate = LazyKt__LazyJVMKt.iO(new XIOX(this));
        this.tvLeftTips$delegate = LazyKt__LazyJVMKt.iO(new IXIIX(this));
        this.tvLeftValue$delegate = LazyKt__LazyJVMKt.iO(new iXOO1i(this));
        this.rulerLeft$delegate = LazyKt__LazyJVMKt.iO(new OIOIOXO(this));
        this.clRight$delegate = LazyKt__LazyJVMKt.iO(new Xii1(this));
        this.tvRightTips$delegate = LazyKt__LazyJVMKt.iO(new i1O1OiiOX(this));
        this.tvRightValue$delegate = LazyKt__LazyJVMKt.iO(new IiiO100(this));
        this.rulerRight$delegate = LazyKt__LazyJVMKt.iO(new IO10XO00I(this));
        this.mEarphoneAncSettings = (BleEarphoneAncSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.EARPHONE_ANC_SET, BleEarphoneAncSettings.class, null, null, 12, null);
    }

    public static /* synthetic */ TextView I0iXXO(CustomAncActivity r0) {
        return tvRightTips_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RulerView I1XOi1(CustomAncActivity r0) {
        return rulerLeft_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout IIX1OXO(CustomAncActivity r0) {
        return clRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X(Ref.IntRef r0, CustomAncActivity r1, View r2, String r3) {
        return onShowInputValue$lambda$1$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ TextView OIX0iXi(CustomAncActivity r0) {
        return tvLeftTips_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(CustomAncActivity r0) {
        return tvLeftValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(CustomAncActivity r0) {
        return tvRightValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RulerView XXI(CustomAncActivity r0) {
        return rulerRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIO(CustomAncActivity r0) {
        return clLeft_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ BleEarphoneAncSettings access$getMEarphoneAncSettings$p(CustomAncActivity r0) {
        return r0.mEarphoneAncSettings;
    }

    public static final /* synthetic */ TextView access$getTvLeftValue(CustomAncActivity r0) {
        return r0.getTvLeftValue();
    }

    public static final /* synthetic */ TextView access$getTvRightValue(CustomAncActivity r0) {
        return r0.getTvRightValue();
    }

    public static final /* synthetic */ boolean access$isLeftEdit$p(CustomAncActivity r0) {
        return r0.isLeftEdit;
    }

    public static final /* synthetic */ boolean access$isRightEdit$p(CustomAncActivity r0) {
        return r0.isRightEdit;
    }

    public static final /* synthetic */ void access$setLeftEdit$p(CustomAncActivity r0, boolean r1) {
        r0.isLeftEdit = r1;
    }

    public static final /* synthetic */ void access$setRightEdit$p(CustomAncActivity r0, boolean r1) {
        r0.isRightEdit = r1;
    }

    private static final View clLeft_delegate$lambda$0(CustomAncActivity r1) {
        return r1.findViewById(R.id.cl_modify_voice_left);
    }

    private static final LinearLayout clRight_delegate$lambda$0(CustomAncActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.cl_modify_voice_right);
    }

    private final View getClLeft() {
        return (View) getValue();
    }

    private final LinearLayout getClRight() {
        return (LinearLayout) getValue();
    }

    private final RulerView getRulerLeft() {
        return (RulerView) getValue();
    }

    private final RulerView getRulerRight() {
        return (RulerView) getValue();
    }

    private final TextView getTvLeftTips() {
        return (TextView) getValue();
    }

    private final TextView getTvLeftValue() {
        return (TextView) getValue();
    }

    private final TextView getTvRightTips() {
        return (TextView) getValue();
    }

    private final TextView getTvRightValue() {
        return (TextView) getValue();
    }

    private static final boolean onShowInputValue$lambda$1$0(Ref.IntRef r4, CustomAncActivity r5, View r6, String r7) {
        Intrinsics.X0O(r7, "text");
        if (TextUtils.isEmpty(r7) == false) goto L5;
        return false;
    L5:
        float r8 = Float.parseFloat(r7);
        if (r8 >= 0.0f) goto L8;
    L9:
        ToastUtils.showLong(r5.getString(R.string.input_valid_value_tips, new Object[]{0, Integer.valueOf(r4.element)}), new Object[0]);
    L10:
        int r9 = Math.round((float) (Math.ceil(r8 / 200) * ((double) 200)));
        if (r6.getId() != R.id.iv_modify_voice_edit_right) goto L13;
        r5.isRightEdit = true;
        r5.getRulerRight().X0O(r9);
    L14:
        return true;
    L13:
        r5.isLeftEdit = true;
        r5.getRulerLeft().X0O(r9);
        goto L14
    L8:
        if (r8 <= r4.element) goto L10;
        goto L9
    }

    private static final RulerView rulerLeft_delegate$lambda$0(CustomAncActivity r1) {
        return (RulerView) r1.findViewById(R.id.ruler_modify_voice_left);
    }

    private static final RulerView rulerRight_delegate$lambda$0(CustomAncActivity r1) {
        return (RulerView) r1.findViewById(R.id.ruler_modify_voice_right);
    }

    private final void saveConfigure() {
        BleAncMode r0 = this.mEarphoneAncSettings.getMAncModeList().get(this.mEarphoneAncSettings.getMMode());
        String r1 = getTvLeftValue().getText().toString();
        boolean r3 = true;
        int r2 = r1.length() - 1;
        boolean r4 = false;
        int r5 = 0;
        boolean r6 = false;
    L4:
        if (r5 > r2) goto L19;
        if (r6 == true) goto L7;
        int r8 = r5;
    L9:
        if (Intrinsics.iIiiO(r1.charAt(r8), 32) > 0) goto L11;
        boolean r9 = true;
    L12:
        if (r6 == false) goto L13;
        if (r9 == false) goto L19;
        r2 = r2 - 1;
        goto L4
    L13:
        if (r9 == false) goto L14;
        r5 = r5 + 1;
        goto L4
    L14:
        r6 = true;
        goto L4
    L11:
        r9 = false;
        goto L12
    L7:
        r8 = r2;
    L19:
        String r7 = r1.subSequence(r5, r2 + 1).toString();
        String r10 = getTvRightValue().getText().toString();
        int r11 = r10.length() - 1;
        int r12 = 0;
        boolean r13 = false;
    L20:
        if (r12 > r11) goto L35;
        if (r13 == true) goto L23;
        int r14 = r12;
    L25:
        if (Intrinsics.iIiiO(r10.charAt(r14), 32) > 0) goto L27;
        boolean r15 = true;
    L28:
        if (r13 == false) goto L29;
        if (r15 == false) goto L35;
        r11 = r11 - 1;
        goto L20
    L29:
        if (r15 == false) goto L30;
        r12 = r12 + 1;
        goto L20
    L30:
        r13 = true;
        goto L20
    L27:
        r15 = false;
        goto L28
    L23:
        r14 = r11;
    L35:
        String r16 = r10.subSequence(r12, r11 + 1).toString();
        if (TextUtils.isEmpty(r7) == false) goto L38;
        int r17 = 0;
    L40:
        if (TextUtils.isEmpty(r16) == false) goto L42;
        int r18 = 0;
    L44:
        if (r17 == r0.getMLeftCurVal()) goto L47;
        r0.setMLeftCurVal(r17);
        r4 = true;
    L47:
        if (r18 == r0.getMRightCurVal()) goto L49;
        r0.setMRightCurVal(r18);
    L50:
        if (r3 == false) goto L73;
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.EARPHONE_ANC_SET, BleKeyFlag.UPDATE, this.mEarphoneAncSettings, false, false, 24, null);
        return;
    L73:
        return;
    L49:
        r3 = r4;
        goto L50
    L42:
        r18 = Integer.parseInt(r16);
        goto L44
    L38:
        r17 = Integer.parseInt(r7);
        goto L40
    }

    private static final TextView tvLeftTips_delegate$lambda$0(CustomAncActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_modify_voice_left);
    }

    private static final TextView tvLeftValue_delegate$lambda$0(CustomAncActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_modify_voice_left_value);
    }

    private static final TextView tvRightTips_delegate$lambda$0(CustomAncActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_modify_voice_right);
    }

    private static final TextView tvRightValue_delegate$lambda$0(CustomAncActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_modify_voice_right_value);
    }

    private final void updateVoiceMode() {
        BleAncMode r0 = this.mEarphoneAncSettings.getMAncModeList().get(this.mEarphoneAncSettings.getMMode());
        LogUtils.d(new Object[]{"updateVoiceMode -> mode = " + this.mEarphoneAncSettings});
        int r1 = this.mEarphoneAncSettings.getMMode();
        if (r1 != 0) goto L5;
        ToastUtils.showLong(R.string.invalid_mode);
        finish();
        return;
    L5:
        if (r1 != 1) goto L7;
        Intrinsics.O10IXXX0X(getString(R.string.denoise_value), "getString(...)");
        String r2 = getString(R.string.left_dev_denoise_value);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        String r3 = getString(R.string.right_dev_denoise_value);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
    L12:
        View r4 = getClLeft();
        int r5 = 8;
        if (r0.getMLeftMax() <= 0) goto L15;
        int r6 = 0;
    L16:
        r4.setVisibility(r6);
        if (r0.getMLeftMax() <= 0) goto L19;
        getTvLeftTips().setText(r2);
        getTvLeftValue().setText(String.valueOf(r0.getMLeftCurVal()));
        getRulerLeft().setScaleLimit(400);
        float r7 = 200;
        double r10 = 200;
        getRulerLeft().XiOIii1(0, (float) (Math.ceil(r0.getMLeftMax() / r7) * r10), (float) (Math.ceil(r0.getMLeftCurVal() / r7) * r10));
    L19:
        LinearLayout r8 = getClRight();
        if (r0.getMRightMax() <= 0) goto L22;
        r5 = 0;
    L22:
        r8.setVisibility(r5);
        if (r0.getMRightMax() <= 0) goto L28;
        getTvRightTips().setText(r3);
        getTvRightValue().setText(String.valueOf(r0.getMRightCurVal()));
        getRulerRight().setScaleLimit(400);
        float r9 = 200;
        double r11 = 200;
        getRulerRight().XiOIii1(0, (float) (Math.ceil(r0.getMRightMax() / r9) * r11), (float) (Math.ceil(r0.getMRightCurVal() / r9) * r11));
        return;
    L28:
        return;
    L15:
        r6 = 8;
        goto L16
    L7:
        if (r1 == 2) goto L10;
        ToastUtils.showLong(R.string.unknown_mode);
        finish();
        return;
    L10:
        Intrinsics.O10IXXX0X(getString(R.string.transparent_value), "getString(...)");
        r2 = getString(R.string.left_ear_gain_value);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r3 = getString(R.string.right_ear_gain_value);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        goto L12
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseChargeActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.noise_settings);
        ((TextView) findViewById(R.id.abh_sub_title)).setText(R.string.noise_settings_sub);
        getRulerLeft().setOnChooseResulterListener(new OXO1(this));
        getRulerRight().setOnChooseResulterListener(new XIi00iiXO(this));
        updateVoiceMode();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_custom_anc;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        saveConfigure();
    }

    public final void onShowInputValue(@aa1 final View r9) {
        Intrinsics.X0O(r9, "view");
        BleAncMode r0 = this.mEarphoneAncSettings.getMAncModeList().get(this.mEarphoneAncSettings.getMMode());
        final Ref.IntRef r1 = new Ref.IntRef();
        if (r9.getId() != R.id.iv_modify_voice_edit_right) goto L5;
        String r2 = getTvRightValue().getText().toString();
        r1.element = r0.getMRightMax();
        int r3 = R.string.right_ear_gain_value;
    L7:
        if (this.mEditPop != null) goto L9;
        int r7 = 2;
        iii1ii r4 = new iii1ii(getMContext(), 0, r7, null);
        r4.X01IiOiIi().setInputType(2);
        this.mEditPop = r4;
    L9:
        iii1ii r5 = this.mEditPop;
        if (r5 == null) goto L13;
        r5.XXX11i(r3);
        r5.X11iII1O1(new XIX0IiX(r1, this, r9));
        r5.X01IiOiIi().setText(r2);
        r5.X01IiOiIi().setTextColor(gk4.iO(getMContext(), R.color.line_color));
        r5.IIX1OXO();
        return;
    L13:
        return;
    L5:
        r2 = getTvLeftValue().getText().toString();
        r1.element = r0.getMLeftMax();
        r3 = R.string.left_ear_gain_value;
        goto L7
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
