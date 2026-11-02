package com.sma.smartv3.p610ui.login;

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
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.login_reminder);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_login_reminder;
    }

    public final void noLogin(@aa1 View View) {
        Intrinsics.X0O(View, "View");
        finish();
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        a01Var.XO0O10().put(AppUser.class.getName(), new Gson().toJson((AppUser) appUser));
        i72.OXO1.OiXXXi10(getMContext());
        finish();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
