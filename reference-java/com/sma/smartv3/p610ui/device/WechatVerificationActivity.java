package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0O111;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.p607wx.WxManager;
import com.sma.smartv3.p610ui.device.WechatVerificationActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.SquareVerificationCodeView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WechatVerificationActivity extends BaseActivity {

    @aa1
    private final Lazy mBtnActive$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zx6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WechatVerificationActivity.mBtnActive_delegate$lambda$0(this.f12717IO);
        }
    });

    @aa1
    private final Lazy mSquareVerificationCodeView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ay6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WechatVerificationActivity.mSquareVerificationCodeView_delegate$lambda$0(this.f5613IO);
        }
    });

    private final Button getMBtnActive() {
        return (Button) this.mBtnActive$delegate.getValue();
    }

    private final SquareVerificationCodeView getMSquareVerificationCodeView() {
        return (SquareVerificationCodeView) this.mSquareVerificationCodeView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(final WechatVerificationActivity wechatVerificationActivity, View view) {
        String strValueOf = String.valueOf(wechatVerificationActivity.getMSquareVerificationCodeView().getText());
        if (strValueOf.length() > 0) {
            WxManager.OXO1.iXi(strValueOf, new Function1() { // from class: com.android.mltcode.paycertificationapi.xx6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WechatVerificationActivity.initView$lambda$0$0(this.f12259IO, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(WechatVerificationActivity wechatVerificationActivity, boolean z) {
        if (z) {
            ToastUtils.showLong(wechatVerificationActivity.getString(R.string.success_save), new Object[0]);
            wechatVerificationActivity.onHandleBackPressed();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mBtnActive_delegate$lambda$0(WechatVerificationActivity wechatVerificationActivity) {
        return (Button) wechatVerificationActivity.findViewById(R.id.btn_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SquareVerificationCodeView mSquareVerificationCodeView_delegate$lambda$0(WechatVerificationActivity wechatVerificationActivity) {
        return (SquareVerificationCodeView) wechatVerificationActivity.findViewById(R.id.codeView);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.ai_wx_verification);
        getMBtnActive().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.yx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WechatVerificationActivity.initView$lambda$0(this.f12480IO, view);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_wechat_verification;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        i0O111.OXO1.i010I(this);
    }
}
