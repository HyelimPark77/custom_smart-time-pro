package com.sma.smartv3.ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nLoginReminderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginReminderActivity.kt\ncom/sma/smartv3/ui/login/LoginReminderActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,44:1\n19#2:45\n15#2:46\n11#2,2:47\n*S KotlinDebug\n*F\n+ 1 LoginReminderActivity.kt\ncom/sma/smartv3/ui/login/LoginReminderActivity\n*L\n31#1:45\n31#1:46\n32#1:47,2\n*E\n"})
public final class LoginReminderActivity extends BaseActivity {
    public LoginReminderActivity() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.login_reminder);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_login_reminder;
    }

    public final void noLogin(@aa1 View r2) {
        Intrinsics.X0O(r2, "View");
        finish();
    }

    public final void onBottomClick(@aa1 View r33) {
        Intrinsics.X0O(r33, "view");
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        SPUtils r4 = r0.XO0O10();
        String r5 = AppUser.class.getName();
        Gson r6 = new Gson();
        r4.put(r5, r6.toJson((AppUser) r2));
        i72.OXO1.OiXXXi10(getMContext());
        finish();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
