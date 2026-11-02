package com.sma.smartv3.ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iXO10O1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomSportCaloriesGoalActivity extends BaseCustomSportGoalActivity {

    @aa1
    private final Lazy calEt$delegate;

    public CustomSportCaloriesGoalActivity() {
        this.calEt$delegate = LazyKt__LazyJVMKt.iO(new iXO10O1(this));
    }

    public static /* synthetic */ EditText I0iXXO(CustomSportCaloriesGoalActivity r0) {
        return calEt_delegate$lambda$0(r0);
    }

    private static final EditText calEt_delegate$lambda$0(CustomSportCaloriesGoalActivity r1) {
        return (EditText) r1.findViewById(R.id.calEt);
    }

    public final EditText getCalEt() {
        return (EditText) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.sport.BaseCustomSportGoalActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.custom_calories);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_custom_sport_calories_goal;
    }

    @Override // com.sma.smartv3.ui.sport.BaseCustomSportGoalActivity
    public void onTitleRightClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        String r5 = getCalEt().getText().toString();
        if (r5.length() <= 0) goto L9;
        int r0 = Integer.parseInt(r5);
        if (r0 != 0) goto L7;
        return;
    L7:
        setResult(-1, new Intent().putExtra(uz0.iXiiiO, new Pair(r5, Integer.valueOf(r0))));
        finish();
        return;
    L9:
        ToastUtils.showLong(getString(R.string.no_content_set_key), new Object[0]);
    }
}
