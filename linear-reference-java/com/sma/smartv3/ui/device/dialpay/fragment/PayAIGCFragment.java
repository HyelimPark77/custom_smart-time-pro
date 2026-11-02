package com.sma.smartv3.ui.device.dialpay.fragment;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.do1;
import com.android.mltcode.paycertificationapi.eo1;
import com.android.mltcode.paycertificationapi.fo1;
import com.android.mltcode.paycertificationapi.go1;
import com.android.mltcode.paycertificationapi.ho1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.jo1;
import com.android.mltcode.paycertificationapi.ko1;
import com.android.mltcode.paycertificationapi.lo1;
import com.android.mltcode.paycertificationapi.mo1;
import com.android.mltcode.paycertificationapi.no1;
import com.android.mltcode.paycertificationapi.po1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qo1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.DeductionConfig;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dial.AIGCFragment;
import com.sma.smartv3.view.AbhSettingsItem;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PayAIGCFragment extends AIGCFragment {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy btnGen$delegate;

    @aa1
    private final Lazy itemModle$delegate;
    private int mCurModle;

    @tb1
    private dj4 mModleSetPopup;
    private int openAIDeductionPoints;

    public PayAIGCFragment() {
        this.TAG = "PayAIGCFragment";
        this.itemModle$delegate = LazyKt__LazyJVMKt.iO(new do1(this));
        this.btnGen$delegate = LazyKt__LazyJVMKt.iO(new go1(this));
        this.mCurModle = AIManager.XXI(AIManager.OXO1, false, 1, null);
    }

    public static /* synthetic */ void I1(PayAIGCFragment r0, View r1) {
        initView$lambda$5(r0, r1);
    }

    public static /* synthetic */ AbhSettingsItem II1Xi0(PayAIGCFragment r0) {
        return itemModle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OII(PayAIGCFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void OX(PayAIGCFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void OiIIX101O(PayAIGCFragment r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ Unit X01IiOiIi(PayAIGCFragment r0, DeductionConfig r1) {
        return getDeductionConfig$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XX0(PayAIGCFragment r0, View r1) {
        initView$lambda$3(r0, r1);
    }

    public static /* synthetic */ Button XiOIii1(PayAIGCFragment r0) {
        return btnGen_delegate$lambda$0(r0);
    }

    private static final Button btnGen_delegate$lambda$0(PayAIGCFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_gen);
    }

    private final void dismissLoadPopup() {
        ThreadUtils.runOnUiThread(new eo1(this));
    }

    private static final void dismissLoadPopup$lambda$0(PayAIGCFragment r0) {
        uq r1 = r0.getMLoadingPopup();
        if (r1 == null) goto L6;
        r1.dismiss();
        return;
    }

    private final Button getBtnGen() {
        return (Button) getValue();
    }

    private final void getDeductionConfig() {
        OrderManager.OXO1.OIX0iXi(new fo1(this));
    }

    private static final Unit getDeductionConfig$lambda$0(PayAIGCFragment r0, DeductionConfig r1) {
        if (r1 == null) goto L5;
        r0.openAIDeductionPoints = r1.getOpenAI_ImgPoints();
        r0.setBtnGenText();
    L5:
        return Unit.OXO1;
    }

    private final AbhSettingsItem getItemModle() {
        return (AbhSettingsItem) getValue();
    }

    public static /* synthetic */ boolean i010I(PayAIGCFragment r0, int r1) {
        return onSetModel$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ boolean iIiiO(PayAIGCFragment r0, View r1, int r2, KeyEvent r3) {
        return initView$lambda$4(r0, r1, r2, r3);
    }

    public static /* synthetic */ void iOOX010X(PayAIGCFragment r0, View r1) {
        initView$lambda$6(r0, r1);
    }

    public static /* synthetic */ void iX(PayAIGCFragment r0) {
        dismissLoadPopup$lambda$0(r0);
    }

    private static final void initView$lambda$0(PayAIGCFragment r0, View r1) {
        Intrinsics.XXI(r1);
        r0.onSetStyle(r1);
    }

    private static final void initView$lambda$1(PayAIGCFragment r0, View r1) {
        Intrinsics.XXI(r1);
        r0.onSetModel(r1);
    }

    private static final void initView$lambda$2(PayAIGCFragment r1, View r2) {
        if (q62.OXO1.XOX() == true) goto L6;
        Intrinsics.XXI(r2);
        r1.onSearch(r2);
        return;
    L6:
        ToastUtils.showLong(R.string.parameter_check_failed);
    }

    private static final void initView$lambda$3(PayAIGCFragment r0, View r1) {
        Intrinsics.XXI(r1);
        r0.onGen(r1);
    }

    private static final boolean initView$lambda$4(PayAIGCFragment r1, View r2, int r3, KeyEvent r4) {
        if (r4.getAction() == 1) goto L5;
    L11:
        return false;
    L5:
        if (r3 != 4) goto L11;
        uq r5 = r1.getMLoadingPopup();
        if (r5 == null) goto L11;
        if (r5.isShowing() != true) goto L11;
        return true;
    }

    private static final void initView$lambda$5(PayAIGCFragment r0, View r1) {
        Intrinsics.XXI(r1);
        r0.onAgain(r1);
    }

    private static final void initView$lambda$6(PayAIGCFragment r0, View r1) {
        r0.onNextStep();
    }

    private static final AbhSettingsItem itemModle_delegate$lambda$0(PayAIGCFragment r1) {
        return (AbhSettingsItem) r1.getMView().findViewById(R.id.item_model);
    }

    private static final boolean onSetModel$lambda$0$0(PayAIGCFragment r2, int r3) {
        r2.mCurModle = r3;
        a01.OXO1.IiI10X().put(b01.iXi, r2.mCurModle);
        AbhSettingsItem r4 = r2.getItemModle();
        String r0 = r2.getResources().getStringArray(R.array.ai_models)[r2.mCurModle];
        Intrinsics.O10IXXX0X(r0, "get(...)");
        r4.setMRightText(r0);
        I01XX0.XIi00iiXO(I01XX0.X00Xi1X, null, 2, null);
        r2.setBtnGenText();
        return true;
    }

    private final void showLoadPopup(String r4) {
        if (getMLoadingPopup() != null) goto L8;
        FragmentActivity r1 = requireActivity();
        Intrinsics.O10IXXX0X(r1, "requireActivity(...)");
        uq r0 = new uq(r1);
        if (r4.length() <= 0) goto L7;
        r0.iOOX010X(r4);
    L7:
        setMLoadingPopup(r0);
    L8:
        uq r5 = getMLoadingPopup();
        if (r5 != null) goto L11;
    L13:
        uq r6 = getMLoadingPopup();
        if (r6 == null) goto L17;
        r6.IIX1OXO();
        return;
    L17:
        return;
    L11:
        if (r5.isShowing() != true) goto L13;
    }

    public static /* synthetic */ void showLoadPopup$default(PayAIGCFragment r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = r0.getString(R.string.working_generate_tip);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
    L5:
        r0.showLoadPopup(r1);
    }

    public final int getOpenAIDeductionPoints() {
        return this.openAIDeductionPoints;
    }

    @Override // com.sma.smartv3.ui.device.dial.AIGCFragment, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.device.dial.AIGCFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        AbhSettingsItem r0 = getItemStyle();
        String r1 = getResources().getStringArray(R.array.aigc_styles)[getMCurStyle()];
        Intrinsics.O10IXXX0X(r1, "get(...)");
        r0.setMRightText(r1);
        getItemStyle().setOnClickListener(new jo1(this));
        AbhSettingsItem r2 = getItemStyle();
        q62 r3 = q62.OXO1;
        int r4 = 8;
        if (r3.O0() == false) goto L5;
        int r5 = 0;
    L6:
        r2.setVisibility(r5);
        AbhSettingsItem r6 = getItemModle();
        if (r3.I0O() == false) goto L9;
        r4 = 0;
    L9:
        r6.setVisibility(r4);
        AbhSettingsItem r7 = getItemModle();
        String r8 = getResources().getStringArray(R.array.ai_models)[this.mCurModle];
        Intrinsics.O10IXXX0X(r8, "get(...)");
        r7.setMRightText(r8);
        getItemModle().setOnClickListener(new ko1(this));
        getBtnSearch().setOnClickListener(new lo1(this));
        getBtnGen().setOnClickListener(new mo1(this));
        getBtnGen().setOnKeyListener(new no1(this));
        getBtnAgain().setOnClickListener(new po1(this));
        getBtnNextStep().setOnClickListener(new qo1(this));
        getDeductionConfig();
        return;
    L5:
        r5 = 8;
        goto L6
    }

    @Override // com.sma.smartv3.ui.device.dial.AIGCFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_aigc_v2;
    }

    public final void onSetModel(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (this.mModleSetPopup != null) goto L5;
        FragmentActivity r1 = requireActivity();
        Intrinsics.O10IXXX0X(r1, "requireActivity(...)");
        int r2 = R.array.ai_models;
        int r3 = 0;
        dj4 r0 = new dj4(r1, r2, r3, 4, null);
        r0.iX(R.string.pay_dail_aigc_modle);
        r0.i010I(new ho1(this));
        this.mModleSetPopup = r0;
    L5:
        dj4 r8 = this.mModleSetPopup;
        if (r8 == null) goto L9;
        r8.II1Xi0(this.mCurModle);
        r8.IIX1OXO();
        return;
    }

    public final void setBtnGenText() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " setBtnGenText openAIDeductionPoints = " + this.openAIDeductionPoints);
        Button r0 = getBtnGen();
        if (this.mCurModle == 0) goto L5;
    L9:
        String r1 = getString(R.string.generate);
        Intrinsics.XXI(r1);
    L10:
        r0.setText(r1);
        return;
    L5:
        if (this.openAIDeductionPoints == 0) goto L9;
        if (q62.OXO1.XOX() == false) goto L9;
        r1 = getString(R.string.generate) + " (-" + this.openAIDeductionPoints + getString(R.string.points) + I000IiI1O.iO.iO;
        goto L10
    }

    public final void setOpenAIDeductionPoints(int r1) {
        this.openAIDeductionPoints = r1;
    }
}
