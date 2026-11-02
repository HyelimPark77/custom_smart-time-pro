package com.sma.smartv3.p610ui.p611ai;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.p611ai.SearchOnlineActivity;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchOnlineActivity extends BaseActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1$0(CompoundButton compoundButton, boolean z) {
        Intrinsics.X0O(compoundButton, "<unused var>");
        a01.OXO1.XIi00iiXO().put(b01.I0OX, z);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.chat_settings);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.check_search_online);
        appCompatCheckBox.setChecked(a01.OXO1.XIi00iiXO().getBoolean(b01.I0OX, false));
        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.android.mltcode.paycertificationapi.cy3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SearchOnlineActivity.initView$lambda$1$0(compoundButton, z);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_search_online;
    }

    public final void onItemClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
