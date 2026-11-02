package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHardWareAlipayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardWareAlipayActivity.kt\ncom/sma/smartv3/ui/device/HardWareAlipayActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n87#2,7:78\n94#2,3:86\n70#2,7:89\n97#2:96\n87#2,7:97\n94#2,3:105\n70#2,7:108\n97#2:115\n87#2,7:116\n94#2,3:124\n70#2,7:127\n97#2:134\n87#2,7:135\n94#2,3:143\n70#2,7:146\n97#2:153\n87#2,7:154\n94#2,3:162\n70#2,7:165\n97#2:172\n1#3:85\n1#3:104\n1#3:123\n1#3:142\n1#3:161\n*S KotlinDebug\n*F\n+ 1 HardWareAlipayActivity.kt\ncom/sma/smartv3/ui/device/HardWareAlipayActivity\n*L\n57#1:78,7\n57#1:86,3\n57#1:89,7\n57#1:96\n59#1:97,7\n59#1:105,3\n59#1:108,7\n59#1:115\n64#1:116,7\n64#1:124,3\n64#1:127,7\n64#1:134\n69#1:135,7\n69#1:143,3\n69#1:146,7\n69#1:153\n71#1:154,7\n71#1:162,3\n71#1:165,7\n71#1:172\n57#1:85\n59#1:104\n64#1:123\n69#1:142\n71#1:161\n*E\n"})
public final class HardWareAlipayActivity extends BaseActivity {
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(getString(R.string.tutorial_help_title));
        if (i72.OXO1.XOOXII()) {
            ImageView imageView = (ImageView) findViewById(R.id.abh_title_right);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.icon_hard_ware_alipay_right);
            imageView.setImageTintList(gk4.O00(this, R.color.text_color));
        }
        findViewById(R.id.hard_ware_alipay_ride_code).setVisibility(q62.OXO1.O0i011() ? 0 : 8);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_hard_ware_alipay;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        i72.OXO1.i1i(this);
    }

    public final void onUnbindAlipay(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (q62.OXO1.O0i011()) {
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", "https://api-c.iot-solution.net/bindAliPayQrCode/unbind/index.html");
            bundle.putInt("mArg1", 2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", "https://api-c.iot-solution.net/bindAliPayQrCode/unbind/index.html");
        bundle2.putInt("mArg1", 2);
        bundle2.putParcelable("mArg2", null);
        bundle2.putSerializable("mArg3", null);
        Intent intent2 = new Intent(this, (Class<?>) WebViewActivity.class);
        intent2.putExtras(bundle2);
        startActivity(intent2);
    }

    public final void onUseRideCodeTutorial(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api-c.iot-solution.net/bindAliPayQrCode/bindRideCode/index.html ");
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public final void onUseTutorial(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (q62.OXO1.O0i011()) {
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", "https://api-c.iot-solution.net/bindAliPayQrCode/bind/index.html ");
            bundle.putInt("mArg1", 2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", "https://api-c.iot-solution.net/bindAliPayQrCode/bind/index.html");
        bundle2.putInt("mArg1", 2);
        bundle2.putParcelable("mArg2", null);
        bundle2.putSerializable("mArg3", null);
        Intent intent2 = new Intent(this, (Class<?>) WebViewActivity.class);
        intent2.putExtras(bundle2);
        startActivity(intent2);
    }
}
