package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.IntentUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.p612me.AboutActivity$onUploadLog$2$1$2$1$1;
import com.sma.smartv3.pro.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AboutActivity$onUploadLog$2$1$2$1$1 implements O1XIiIO<String> {
    public final /* synthetic */ File OXO1;
    public final /* synthetic */ AboutActivity XIi00iiXO;
    public final /* synthetic */ FrameLayout XO0O10;

    /* JADX INFO: renamed from: iO */
    public final /* synthetic */ go0 f54650iO;

    public AboutActivity$onUploadLog$2$1$2$1$1(File file, AboutActivity aboutActivity, go0 go0Var, FrameLayout frameLayout) {
        this.OXO1 = file;
        this.XIi00iiXO = aboutActivity;
        this.f54650iO = go0Var;
        this.XO0O10 = frameLayout;
    }

    public static final boolean IiI10X(final AboutActivity aboutActivity, final FrameLayout frameLayout) {
        hr1.OXO1.OiIIX101O(aboutActivity.getMContext(), new Function1() { // from class: com.android.mltcode.paycertificationapi.i10X0X0i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AboutActivity$onUploadLog$2$1$2$1$1.XOO0ii0(frameLayout, aboutActivity, ((Boolean) obj).booleanValue());
            }
        });
        return true;
    }

    public static final void O00(go0 go0Var, final AboutActivity aboutActivity, final FrameLayout frameLayout) {
        go0 go0Var2 = new go0(go0Var.XO0O10(), 0, 2, null);
        go0Var2.O1O(R.string.upload_successful);
        go0Var2.m1865iX(Integer.valueOf(R.string.share_log_tip));
        go0Var2.I0iXXO(false);
        go0.X11iII1O1(go0Var2, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var2.X1IX(R.string.share, new Function0() { // from class: com.android.mltcode.paycertificationapi.i1i
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(AboutActivity$onUploadLog$2$1$2$1$1.IiI10X(aboutActivity, frameLayout));
            }
        });
        go0Var2.IIX1OXO();
    }

    public static final Unit XOO0ii0(FrameLayout frameLayout, AboutActivity aboutActivity, boolean z) {
        File fileSave2Album;
        if (z && (fileSave2Album = ImageUtils.save2Album(ImageUtils.view2Bitmap(frameLayout), Bitmap.CompressFormat.JPEG)) != null) {
            aboutActivity.startActivity(Intent.createChooser(IntentUtils.getShareImageIntent(fileSave2Album), "Share Log"));
        }
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
    public void handleResponse(String str) {
        FileUtils.delete(this.OXO1);
        this.XIi00iiXO.dismissLoadPopup();
        a01.OXO1.IiI10X().put(b01.f5623I0, System.currentTimeMillis());
        final AboutActivity aboutActivity = this.XIi00iiXO;
        final go0 go0Var = this.f54650iO;
        final FrameLayout frameLayout = this.XO0O10;
        aboutActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IIiiIiXiI
            @Override // java.lang.Runnable
            public final void run() {
                AboutActivity$onUploadLog$2$1$2$1$1.O00(go0Var, aboutActivity, frameLayout);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(String error) {
        Intrinsics.X0O(error, "error");
        FileUtils.delete(this.OXO1);
        this.XIi00iiXO.dismissLoadPopup();
        ToastUtils.showLong(this.XIi00iiXO.getString(R.string.upload_failed), new Object[0]);
    }
}
