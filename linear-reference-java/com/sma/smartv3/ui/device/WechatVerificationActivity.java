package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ay6;
import com.android.mltcode.paycertificationapi.i0O111;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.xx6;
import com.android.mltcode.paycertificationapi.yx6;
import com.android.mltcode.paycertificationapi.zx6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.wx.WxManager;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.SquareVerificationCodeView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WechatVerificationActivity extends BaseActivity {

    @aa1
    private final Lazy mBtnActive$delegate;

    @aa1
    private final Lazy mSquareVerificationCodeView$delegate;

    public WechatVerificationActivity() {
        this.mBtnActive$delegate = LazyKt__LazyJVMKt.iO(new zx6(this));
        this.mSquareVerificationCodeView$delegate = LazyKt__LazyJVMKt.iO(new ay6(this));
    }

    public static /* synthetic */ Button I0iXXO(WechatVerificationActivity r0) {
        return mBtnActive_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OIX0iXi(WechatVerificationActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit X1ii(WechatVerificationActivity r0, boolean r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ SquareVerificationCodeView XXI(WechatVerificationActivity r0) {
        return mSquareVerificationCodeView_delegate$lambda$0(r0);
    }

    private final Button getMBtnActive() {
        return (Button) getValue();
    }

    private final SquareVerificationCodeView getMSquareVerificationCodeView() {
        return (SquareVerificationCodeView) getValue();
    }

    private static final void initView$lambda$0(final WechatVerificationActivity r2, View r3) {
        String r4 = String.valueOf(r2.getMSquareVerificationCodeView().getText());
        if (r4.length() <= 0) goto L6;
        WxManager.OXO1.iXi(r4, new xx6(r2));
        return;
    }

    private static final Unit initView$lambda$0$0(WechatVerificationActivity r1, boolean r2) {
        if (r2 == false) goto L5;
        ToastUtils.showLong(r1.getString(R.string.success_save), new Object[0]);
        r1.onHandleBackPressed();
    L5:
        return Unit.OXO1;
    }

    private static final Button mBtnActive_delegate$lambda$0(WechatVerificationActivity r1) {
        return (Button) r1.findViewById(R.id.btn_bottom);
    }

    private static final SquareVerificationCodeView mSquareVerificationCodeView_delegate$lambda$0(WechatVerificationActivity r1) {
        return (SquareVerificationCodeView) r1.findViewById(R.id.codeView);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.ai_wx_verification);
        getMBtnActive().setOnClickListener(new yx6(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_wechat_verification;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        i0O111.OXO1.i010I(this);
    }
}
