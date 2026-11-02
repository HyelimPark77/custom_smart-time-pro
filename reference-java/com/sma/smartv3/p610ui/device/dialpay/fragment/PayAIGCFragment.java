package com.sma.smartv3.p610ui.device.dialpay.fragment;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.DeductionConfig;
import com.sma.smartv3.p610ui.device.dial.AIGCFragment;
import com.sma.smartv3.p610ui.device.dialpay.fragment.PayAIGCFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PayAIGCFragment extends AIGCFragment {

    @tb1
    private dj4 mModleSetPopup;
    private int openAIDeductionPoints;

    @aa1
    private final String TAG = "PayAIGCFragment";

    @aa1
    private final Lazy itemModle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.do1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PayAIGCFragment.itemModle_delegate$lambda$0(this.f6232IO);
        }
    });

    @aa1
    private final Lazy btnGen$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.go1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PayAIGCFragment.btnGen_delegate$lambda$0(this.f6929IO);
        }
    });
    private int mCurModle = AIManager.XXI(AIManager.OXO1, false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnGen_delegate$lambda$0(PayAIGCFragment payAIGCFragment) {
        return (Button) payAIGCFragment.getMView().findViewById(R.id.btn_gen);
    }

    private final void dismissLoadPopup() {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.eo1
            @Override // java.lang.Runnable
            public final void run() {
                PayAIGCFragment.dismissLoadPopup$lambda$0(this.f6457IO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissLoadPopup$lambda$0(PayAIGCFragment payAIGCFragment) {
        C3006uq mLoadingPopup = payAIGCFragment.getMLoadingPopup();
        if (mLoadingPopup != null) {
            mLoadingPopup.dismiss();
        }
    }

    private final Button getBtnGen() {
        return (Button) this.btnGen$delegate.getValue();
    }

    private final void getDeductionConfig() {
        OrderManager.OXO1.OIX0iXi(new Function1() { // from class: com.android.mltcode.paycertificationapi.fo1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayAIGCFragment.getDeductionConfig$lambda$0(this.f6691IO, (DeductionConfig) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeductionConfig$lambda$0(PayAIGCFragment payAIGCFragment, DeductionConfig deductionConfig) {
        if (deductionConfig != null) {
            payAIGCFragment.openAIDeductionPoints = deductionConfig.getOpenAI_ImgPoints();
            payAIGCFragment.setBtnGenText();
        }
        return Unit.OXO1;
    }

    private final AbhSettingsItem getItemModle() {
        return (AbhSettingsItem) this.itemModle$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(PayAIGCFragment payAIGCFragment, View view) {
        Intrinsics.XXI(view);
        payAIGCFragment.onSetStyle(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(PayAIGCFragment payAIGCFragment, View view) {
        Intrinsics.XXI(view);
        payAIGCFragment.onSetModel(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(PayAIGCFragment payAIGCFragment, View view) {
        if (q62.OXO1.XOX()) {
            ToastUtils.showLong(R.string.parameter_check_failed);
        } else {
            Intrinsics.XXI(view);
            payAIGCFragment.onSearch(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(PayAIGCFragment payAIGCFragment, View view) {
        Intrinsics.XXI(view);
        payAIGCFragment.onGen(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$4(PayAIGCFragment payAIGCFragment, View view, int i, KeyEvent keyEvent) {
        C3006uq mLoadingPopup;
        return keyEvent.getAction() == 1 && i == 4 && (mLoadingPopup = payAIGCFragment.getMLoadingPopup()) != null && mLoadingPopup.isShowing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(PayAIGCFragment payAIGCFragment, View view) {
        Intrinsics.XXI(view);
        payAIGCFragment.onAgain(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemModle_delegate$lambda$0(PayAIGCFragment payAIGCFragment) {
        return (AbhSettingsItem) payAIGCFragment.getMView().findViewById(R.id.item_model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetModel$lambda$0$0(PayAIGCFragment payAIGCFragment, int i) {
        payAIGCFragment.mCurModle = i;
        a01.OXO1.IiI10X().put(b01.iXi, payAIGCFragment.mCurModle);
        AbhSettingsItem itemModle = payAIGCFragment.getItemModle();
        String str = payAIGCFragment.getResources().getStringArray(R.array.ai_models)[payAIGCFragment.mCurModle];
        Intrinsics.O10IXXX0X(str, "get(...)");
        itemModle.setMRightText(str);
        I01XX0.XIi00iiXO(I01XX0.X00Xi1X, null, 2, null);
        payAIGCFragment.setBtnGenText();
        return true;
    }

    private final void showLoadPopup(String str) {
        C3006uq mLoadingPopup;
        if (getMLoadingPopup() == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
            C3006uq c3006uq = new C3006uq(fragmentActivityRequireActivity);
            if (str.length() > 0) {
                c3006uq.iOOX010X(str);
            }
            setMLoadingPopup(c3006uq);
        }
        C3006uq mLoadingPopup2 = getMLoadingPopup();
        if ((mLoadingPopup2 == null || !mLoadingPopup2.isShowing()) && (mLoadingPopup = getMLoadingPopup()) != null) {
            mLoadingPopup.IIX1OXO();
        }
    }

    public static /* synthetic */ void showLoadPopup$default(PayAIGCFragment payAIGCFragment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payAIGCFragment.getString(R.string.working_generate_tip);
            Intrinsics.O10IXXX0X(str, "getString(...)");
        }
        payAIGCFragment.showLoadPopup(str);
    }

    public final int getOpenAIDeductionPoints() {
        return this.openAIDeductionPoints;
    }

    @Override // com.sma.smartv3.p610ui.device.dial.AIGCFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.device.dial.AIGCFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        AbhSettingsItem itemStyle = getItemStyle();
        String str = getResources().getStringArray(R.array.aigc_styles)[getMCurStyle()];
        Intrinsics.O10IXXX0X(str, "get(...)");
        itemStyle.setMRightText(str);
        getItemStyle().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.jo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayAIGCFragment.initView$lambda$0(this.f9016IO, view);
            }
        });
        AbhSettingsItem itemStyle2 = getItemStyle();
        q62 q62Var = q62.OXO1;
        itemStyle2.setVisibility(q62Var.m2880O0() ? 0 : 8);
        getItemModle().setVisibility(q62Var.I0O() ? 0 : 8);
        AbhSettingsItem itemModle = getItemModle();
        String str2 = getResources().getStringArray(R.array.ai_models)[this.mCurModle];
        Intrinsics.O10IXXX0X(str2, "get(...)");
        itemModle.setMRightText(str2);
        getItemModle().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ko1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayAIGCFragment.initView$lambda$1(this.f9246IO, view);
            }
        });
        getBtnSearch().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.lo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayAIGCFragment.initView$lambda$2(this.f9484IO, view);
            }
        });
        getBtnGen().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.mo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayAIGCFragment.initView$lambda$3(this.f9753IO, view);
            }
        });
        getBtnGen().setOnKeyListener(new View.OnKeyListener() { // from class: com.android.mltcode.paycertificationapi.no1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return PayAIGCFragment.initView$lambda$4(this.f9979IO, view, i, keyEvent);
            }
        });
        getBtnAgain().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.po1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayAIGCFragment.initView$lambda$5(this.f10408IO, view);
            }
        });
        getBtnNextStep().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.qo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10645IO.onNextStep();
            }
        });
        getDeductionConfig();
    }

    @Override // com.sma.smartv3.p610ui.device.dial.AIGCFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_aigc_v2;
    }

    public final void onSetModel(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mModleSetPopup == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
            dj4 dj4Var = new dj4(fragmentActivityRequireActivity, R.array.ai_models, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.pay_dail_aigc_modle);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.ho1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(PayAIGCFragment.onSetModel$lambda$0$0(this.f7167IO, ((Integer) obj).intValue()));
                }
            });
            this.mModleSetPopup = dj4Var;
        }
        dj4 dj4Var2 = this.mModleSetPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(this.mCurModle);
            dj4Var2.IIX1OXO();
        }
    }

    public final void setBtnGenText() {
        String string;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " setBtnGenText openAIDeductionPoints = " + this.openAIDeductionPoints);
        Button btnGen = getBtnGen();
        if (this.mCurModle == 0 && this.openAIDeductionPoints != 0 && q62.OXO1.XOX()) {
            string = getString(R.string.generate) + " (-" + this.openAIDeductionPoints + getString(R.string.points) + I000IiI1O.C2156iO.f1007iO;
        } else {
            string = getString(R.string.generate);
            Intrinsics.XXI(string);
        }
        btnGen.setText(string);
    }

    public final void setOpenAIDeductionPoints(int i) {
        this.openAIDeductionPoints = i;
    }
}
