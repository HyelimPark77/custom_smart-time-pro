package com.sma.smartv3.ui.me;

import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.android.mltcode.paycertificationapi.IIiiIiXiI;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i10X0X0i;
import com.android.mltcode.paycertificationapi.i1i;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.IntentUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AboutActivity$onUploadLog$2$1$2$1$1 implements O1XIiIO<String> {
    public final /* synthetic */ File OXO1;
    public final /* synthetic */ AboutActivity XIi00iiXO;
    public final /* synthetic */ FrameLayout XO0O10;
    public final /* synthetic */ go0 iO;

    public AboutActivity$onUploadLog$2$1$2$1$1(File r1, AboutActivity r2, go0 r3, FrameLayout r4) {
        this.OXO1 = r1;
        this.XIi00iiXO = r2;
        this.iO = r3;
        this.XO0O10 = r4;
    }

    public static final boolean IiI10X(final AboutActivity r3, final FrameLayout r4) {
        hr1.OXO1.OiIIX101O(AboutActivity.access$getMContext(r3), new i10X0X0i(r4, r3));
        return true;
    }

    public static final void O00(go0 r4, final AboutActivity r5, final FrameLayout r6) {
        go0 r0 = new go0(r4.XO0O10(), 0, 2, null);
        r0.O1O(R.string.upload_successful);
        r0.iX(Integer.valueOf(R.string.share_log_tip));
        r0.I0iXXO(false);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.share, new i1i(r5, r6));
        r0.IIX1OXO();
    }

    public static /* synthetic */ boolean OXO1(AboutActivity r0, FrameLayout r1) {
        return IiI10X(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(go0 r0, AboutActivity r1, FrameLayout r2) {
        O00(r0, r1, r2);
    }

    public static final Unit XOO0ii0(FrameLayout r0, AboutActivity r1, boolean r2) {
        if (r2 == false) goto L7;
        File r3 = ImageUtils.save2Album(ImageUtils.view2Bitmap(r0), Bitmap.CompressFormat.JPEG);
        if (r3 == null) goto L7;
        r1.startActivity(Intent.createChooser(IntentUtils.getShareImageIntent(r3), "Share Log"));
    L7:
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit iO(FrameLayout r0, AboutActivity r1, boolean r2) {
        return XOO0ii0(r0, r1, r2);
    }

    public void XO0O10(String r4) {
        FileUtils.delete(this.OXO1);
        AboutActivity.access$dismissLoadPopup(this.XIi00iiXO);
        a01.OXO1.IiI10X().put(b01.I0, System.currentTimeMillis());
        final AboutActivity r5 = this.XIi00iiXO;
        final go0 r0 = this.iO;
        final FrameLayout r1 = this.XO0O10;
        r5.runOnUiThread(new IIiiIiXiI(r0, r5, r1));
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(String r2) {
        Intrinsics.X0O(r2, "error");
        FileUtils.delete(this.OXO1);
        AboutActivity.access$dismissLoadPopup(this.XIi00iiXO);
        ToastUtils.showLong(this.XIi00iiXO.getString(R.string.upload_failed), new Object[0]);
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public /* bridge */ /* synthetic */ void handleResponse(String r1) {
        XO0O10(r1);
    }
}
