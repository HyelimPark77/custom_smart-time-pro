package com.sma.smartv3.ui.ai;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cy3;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchOnlineActivity extends BaseActivity {
    public SearchOnlineActivity() {
    }

    public static /* synthetic */ void OIX0iXi(CompoundButton r0, boolean r1) {
        initView$lambda$1$0(r0, r1);
    }

    private static final void initView$lambda$1$0(CompoundButton r1, boolean r2) {
        Intrinsics.X0O(r1, "<unused var>");
        a01.OXO1.XIi00iiXO().put(b01.I0OX, r2);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.chat_settings);
        AppCompatCheckBox r0 = (AppCompatCheckBox) findViewById(R.id.check_search_online);
        r0.setChecked(a01.OXO1.XIi00iiXO().getBoolean(b01.I0OX, false));
        r0.setOnCheckedChangeListener(new cy3());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_search_online;
    }

    public final void onItemClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
