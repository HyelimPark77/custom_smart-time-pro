package com.sma.smartv3.ui.me;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nLanguageSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSettingActivity.kt\ncom/sma/smartv3/ui/me/LanguageSettingActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n87#2,7:37\n94#2,3:45\n70#2,7:48\n97#2:55\n87#2,7:56\n94#2,3:64\n70#2,7:67\n97#2:74\n1#3:44\n1#3:63\n*S KotlinDebug\n*F\n+ 1 LanguageSettingActivity.kt\ncom/sma/smartv3/ui/me/LanguageSettingActivity\n*L\n29#1:37,7\n29#1:45,3\n29#1:48,7\n29#1:55\n33#1:56,7\n33#1:64,3\n33#1:67,7\n33#1:74\n29#1:44\n33#1:63\n*E\n"})
public final class LanguageSettingActivity extends BaseActivity {
    public LanguageSettingActivity() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.watch_language_set);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_language_set;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void repair(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", R.string.language_pack_repair);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, LanguageListActivity.class);
        r0.putExtras(r5);
        startActivity(r0);
    }

    public final void select(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", R.string.language_pack_select);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, LanguageListActivity.class);
        r0.putExtras(r5);
        startActivity(r0);
    }
}
