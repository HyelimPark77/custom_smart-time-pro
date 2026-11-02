package com.sma.smartv3.otherdevice.charge;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.otherdevice.charge.CustomAncActivity;
import com.sma.smartv3.otherdevice.p609jl.view.RulerView;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nCustomAncActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAncActivity.kt\ncom/sma/smartv3/otherdevice/charge/CustomAncActivity\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,273:1\n106#2:274\n78#2,22:275\n106#2:297\n78#2,22:298\n*S KotlinDebug\n*F\n+ 1 CustomAncActivity.kt\ncom/sma/smartv3/otherdevice/charge/CustomAncActivity\n*L\n182#1:274\n182#1:275,22\n183#1:297\n183#1:298,22\n*E\n"})
public final class CustomAncActivity extends BaseChargeActivity {
    private boolean isLeftEdit;
    private boolean isRightEdit;

    @tb1
    private iii1ii mEditPop;

    @aa1
    private final Lazy clLeft$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomAncActivity.clLeft_delegate$lambda$0(this.f4561IO);
        }
    });

    @aa1
    private final Lazy tvLeftTips$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXIIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomAncActivity.tvLeftTips_delegate$lambda$0(this.f2009IO);
        }
    });

    @aa1
    private final Lazy tvLeftValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXOO1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomAncActivity.tvLeftValue_delegate$lambda$0(this.f8369IO);
        }
    });

    @aa1
    private final Lazy rulerLeft$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIOIOXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomAncActivity.rulerLeft_delegate$lambda$0(this.f2999IO);
        }
    });

    @aa1
    private final Lazy clRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Xii1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomAncActivity.clRight_delegate$lambda$0(this.f5363IO);
        }
    });

    @aa1
    private final Lazy tvRightTips$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1O1OiiOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomAncActivity.tvRightTips_delegate$lambda$0(this.f7618IO);
        }
    });

    @aa1
    private final Lazy tvRightValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiiO100
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomAncActivity.tvRightValue_delegate$lambda$0(this.f2326IO);
        }
    });

    @aa1
    private final Lazy rulerRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IO10XO00I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomAncActivity.rulerRight_delegate$lambda$0(this.f1748IO);
        }
    });

    @aa1
    private BleEarphoneAncSettings mEarphoneAncSettings = (BleEarphoneAncSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.EARPHONE_ANC_SET, BleEarphoneAncSettings.class, null, null, 12, null);

    public static final class OXO1 implements RulerView.O00 {
        public OXO1() {
        }

        @Override // com.sma.smartv3.otherdevice.jl.view.RulerView.O00
        public void OXO1(String result) {
            int iRound;
            Intrinsics.X0O(result, "result");
            BleAncMode bleAncMode = CustomAncActivity.this.mEarphoneAncSettings.getMAncModeList().get(CustomAncActivity.this.mEarphoneAncSettings.getMMode());
            if (CustomAncActivity.this.isLeftEdit) {
                CustomAncActivity.this.isLeftEdit = false;
                iRound = Math.round(Float.parseFloat(result));
            } else {
                iRound = Math.round(Float.parseFloat(result) / 100) * 100;
            }
            if (iRound > bleAncMode.getMLeftMax()) {
                iRound = bleAncMode.getMLeftMax();
                ToastUtils.showLong(R.string.maximum_tips);
            }
            CustomAncActivity.this.getTvLeftValue().setText(String.valueOf(iRound));
        }

        @Override // com.sma.smartv3.otherdevice.jl.view.RulerView.O00
        public void XIi00iiXO(String result) {
            int iRound;
            Intrinsics.X0O(result, "result");
            BleAncMode bleAncMode = CustomAncActivity.this.mEarphoneAncSettings.getMAncModeList().get(CustomAncActivity.this.mEarphoneAncSettings.getMMode());
            if (CustomAncActivity.this.isLeftEdit) {
                CustomAncActivity.this.isLeftEdit = false;
                iRound = Math.round(Float.parseFloat(result));
            } else {
                iRound = Math.round(Float.parseFloat(result) / 100) * 100;
            }
            if (iRound > bleAncMode.getMLeftMax()) {
                iRound = bleAncMode.getMLeftMax();
                ToastUtils.showLong(R.string.maximum_tips);
            }
            CustomAncActivity.this.getTvLeftValue().setText(String.valueOf(iRound));
        }
    }

    public static final class XIi00iiXO implements RulerView.O00 {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.otherdevice.jl.view.RulerView.O00
        public void OXO1(String result) {
            int iRound;
            Intrinsics.X0O(result, "result");
            BleAncMode bleAncMode = CustomAncActivity.this.mEarphoneAncSettings.getMAncModeList().get(CustomAncActivity.this.mEarphoneAncSettings.getMMode());
            if (CustomAncActivity.this.isRightEdit) {
                CustomAncActivity.this.isRightEdit = false;
                iRound = Math.round(Float.parseFloat(result));
            } else {
                iRound = Math.round(Float.parseFloat(result) / 100) * 100;
            }
            if (iRound > bleAncMode.getMRightMax()) {
                iRound = bleAncMode.getMRightMax();
                ToastUtils.showLong(R.string.maximum_tips);
            }
            CustomAncActivity.this.getTvRightValue().setText(String.valueOf(iRound));
        }

        @Override // com.sma.smartv3.otherdevice.jl.view.RulerView.O00
        public void XIi00iiXO(String result) {
            int iRound;
            Intrinsics.X0O(result, "result");
            BleAncMode bleAncMode = CustomAncActivity.this.mEarphoneAncSettings.getMAncModeList().get(CustomAncActivity.this.mEarphoneAncSettings.getMMode());
            if (CustomAncActivity.this.isLeftEdit) {
                CustomAncActivity.this.isLeftEdit = false;
                iRound = Math.round(Float.parseFloat(result));
            } else {
                iRound = Math.round(Float.parseFloat(result) / 100) * 100;
            }
            if (iRound > bleAncMode.getMLeftMax()) {
                iRound = bleAncMode.getMLeftMax();
                ToastUtils.showLong(R.string.maximum_tips);
            }
            CustomAncActivity.this.getTvRightValue().setText(String.valueOf(iRound));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View clLeft_delegate$lambda$0(CustomAncActivity customAncActivity) {
        return customAncActivity.findViewById(R.id.cl_modify_voice_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout clRight_delegate$lambda$0(CustomAncActivity customAncActivity) {
        return (LinearLayout) customAncActivity.findViewById(R.id.cl_modify_voice_right);
    }

    private final View getClLeft() {
        return (View) this.clLeft$delegate.getValue();
    }

    private final LinearLayout getClRight() {
        return (LinearLayout) this.clRight$delegate.getValue();
    }

    private final RulerView getRulerLeft() {
        return (RulerView) this.rulerLeft$delegate.getValue();
    }

    private final RulerView getRulerRight() {
        return (RulerView) this.rulerRight$delegate.getValue();
    }

    private final TextView getTvLeftTips() {
        return (TextView) this.tvLeftTips$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvLeftValue() {
        return (TextView) this.tvLeftValue$delegate.getValue();
    }

    private final TextView getTvRightTips() {
        return (TextView) this.tvRightTips$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvRightValue() {
        return (TextView) this.tvRightValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onShowInputValue$lambda$1$0(Ref.IntRef intRef, CustomAncActivity customAncActivity, View view, String text) {
        Intrinsics.X0O(text, "text");
        if (TextUtils.isEmpty(text)) {
            return false;
        }
        float f = Float.parseFloat(text);
        if (f < 0.0f || f > intRef.element) {
            ToastUtils.showLong(customAncActivity.getString(R.string.input_valid_value_tips, 0, Integer.valueOf(intRef.element)), new Object[0]);
        }
        int iRound = Math.round((float) (Math.ceil(f / 200) * ((double) 200)));
        if (view.getId() == R.id.iv_modify_voice_edit_right) {
            customAncActivity.isRightEdit = true;
            customAncActivity.getRulerRight().X0O(iRound);
        } else {
            customAncActivity.isLeftEdit = true;
            customAncActivity.getRulerLeft().X0O(iRound);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RulerView rulerLeft_delegate$lambda$0(CustomAncActivity customAncActivity) {
        return (RulerView) customAncActivity.findViewById(R.id.ruler_modify_voice_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RulerView rulerRight_delegate$lambda$0(CustomAncActivity customAncActivity) {
        return (RulerView) customAncActivity.findViewById(R.id.ruler_modify_voice_right);
    }

    private final void saveConfigure() {
        BleAncMode bleAncMode = this.mEarphoneAncSettings.getMAncModeList().get(this.mEarphoneAncSettings.getMMode());
        String string = getTvLeftValue().getText().toString();
        boolean z = true;
        int length = string.length() - 1;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        while (i <= length) {
            boolean z4 = Intrinsics.iIiiO(string.charAt(!z3 ? i : length), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length--;
                }
            } else if (z4) {
                i++;
            } else {
                z3 = true;
            }
        }
        String string2 = string.subSequence(i, length + 1).toString();
        String string3 = getTvRightValue().getText().toString();
        int length2 = string3.length() - 1;
        int i2 = 0;
        boolean z5 = false;
        while (i2 <= length2) {
            boolean z6 = Intrinsics.iIiiO(string3.charAt(!z5 ? i2 : length2), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                } else {
                    length2--;
                }
            } else if (z6) {
                i2++;
            } else {
                z5 = true;
            }
        }
        String string4 = string3.subSequence(i2, length2 + 1).toString();
        int i3 = TextUtils.isEmpty(string2) ? 0 : Integer.parseInt(string2);
        int i4 = TextUtils.isEmpty(string4) ? 0 : Integer.parseInt(string4);
        if (i3 != bleAncMode.getMLeftCurVal()) {
            bleAncMode.setMLeftCurVal(i3);
            z2 = true;
        }
        if (i4 != bleAncMode.getMRightCurVal()) {
            bleAncMode.setMRightCurVal(i4);
        } else {
            z = z2;
        }
        if (z) {
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.EARPHONE_ANC_SET, BleKeyFlag.UPDATE, this.mEarphoneAncSettings, false, false, 24, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvLeftTips_delegate$lambda$0(CustomAncActivity customAncActivity) {
        return (TextView) customAncActivity.findViewById(R.id.tv_modify_voice_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvLeftValue_delegate$lambda$0(CustomAncActivity customAncActivity) {
        return (TextView) customAncActivity.findViewById(R.id.tv_modify_voice_left_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvRightTips_delegate$lambda$0(CustomAncActivity customAncActivity) {
        return (TextView) customAncActivity.findViewById(R.id.tv_modify_voice_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvRightValue_delegate$lambda$0(CustomAncActivity customAncActivity) {
        return (TextView) customAncActivity.findViewById(R.id.tv_modify_voice_right_value);
    }

    private final void updateVoiceMode() {
        String string;
        String string2;
        BleAncMode bleAncMode = this.mEarphoneAncSettings.getMAncModeList().get(this.mEarphoneAncSettings.getMMode());
        LogUtils.m11128d("updateVoiceMode -> mode = " + this.mEarphoneAncSettings);
        int mMode = this.mEarphoneAncSettings.getMMode();
        if (mMode == 0) {
            ToastUtils.showLong(R.string.invalid_mode);
            finish();
            return;
        }
        if (mMode == 1) {
            Intrinsics.O10IXXX0X(getString(R.string.denoise_value), "getString(...)");
            string = getString(R.string.left_dev_denoise_value);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            string2 = getString(R.string.right_dev_denoise_value);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
        } else if (mMode != 2) {
            ToastUtils.showLong(R.string.unknown_mode);
            finish();
            return;
        } else {
            Intrinsics.O10IXXX0X(getString(R.string.transparent_value), "getString(...)");
            string = getString(R.string.left_ear_gain_value);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            string2 = getString(R.string.right_ear_gain_value);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
        }
        getClLeft().setVisibility(bleAncMode.getMLeftMax() > 0 ? 0 : 8);
        if (bleAncMode.getMLeftMax() > 0) {
            getTvLeftTips().setText(string);
            getTvLeftValue().setText(String.valueOf(bleAncMode.getMLeftCurVal()));
            getRulerLeft().setScaleLimit(400);
            float f = 200;
            double d = 200;
            getRulerLeft().XiOIii1(0, (float) (Math.ceil(bleAncMode.getMLeftMax() / f) * d), (float) (Math.ceil(bleAncMode.getMLeftCurVal() / f) * d));
        }
        getClRight().setVisibility(bleAncMode.getMRightMax() > 0 ? 0 : 8);
        if (bleAncMode.getMRightMax() > 0) {
            getTvRightTips().setText(string2);
            getTvRightValue().setText(String.valueOf(bleAncMode.getMRightCurVal()));
            getRulerRight().setScaleLimit(400);
            float f2 = 200;
            double d2 = 200;
            getRulerRight().XiOIii1(0, (float) (Math.ceil(bleAncMode.getMRightMax() / f2) * d2), (float) (Math.ceil(bleAncMode.getMRightCurVal() / f2) * d2));
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.otherdevice.charge.BaseChargeActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.noise_settings);
        ((TextView) findViewById(R.id.abh_sub_title)).setText(R.string.noise_settings_sub);
        getRulerLeft().setOnChooseResulterListener(new OXO1());
        getRulerRight().setOnChooseResulterListener(new XIi00iiXO());
        updateVoiceMode();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_custom_anc;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        saveConfigure();
    }

    public final void onShowInputValue(@aa1 final View view) {
        String string;
        int i;
        Intrinsics.X0O(view, "view");
        BleAncMode bleAncMode = this.mEarphoneAncSettings.getMAncModeList().get(this.mEarphoneAncSettings.getMMode());
        final Ref.IntRef intRef = new Ref.IntRef();
        if (view.getId() == R.id.iv_modify_voice_edit_right) {
            string = getTvRightValue().getText().toString();
            intRef.element = bleAncMode.getMRightMax();
            i = R.string.right_ear_gain_value;
        } else {
            string = getTvLeftValue().getText().toString();
            intRef.element = bleAncMode.getMLeftMax();
            i = R.string.left_ear_gain_value;
        }
        if (this.mEditPop == null) {
            iii1ii iii1iiVar = new iii1ii(getMContext(), 0, 2, null);
            iii1iiVar.X01IiOiIi().setInputType(2);
            this.mEditPop = iii1iiVar;
        }
        iii1ii iii1iiVar2 = this.mEditPop;
        if (iii1iiVar2 != null) {
            iii1iiVar2.XXX11i(i);
            iii1iiVar2.X11iII1O1(new Function1() { // from class: com.android.mltcode.paycertificationapi.XIX0IiX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(CustomAncActivity.onShowInputValue$lambda$1$0(intRef, this, view, (String) obj));
                }
            });
            iii1iiVar2.X01IiOiIi().setText(string);
            iii1iiVar2.X01IiOiIi().setTextColor(gk4.m1859iO(getMContext(), R.color.line_color));
            iii1iiVar2.IIX1OXO();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
