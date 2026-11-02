package com.sma.smartv3.p610ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.sport.CustomSportCaloriesGoalActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomSportCaloriesGoalActivity extends BaseCustomSportGoalActivity {

    @aa1
    private final Lazy calEt$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXO10O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CustomSportCaloriesGoalActivity.calEt_delegate$lambda$0(this.f8344IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText calEt_delegate$lambda$0(CustomSportCaloriesGoalActivity customSportCaloriesGoalActivity) {
        return (EditText) customSportCaloriesGoalActivity.findViewById(R.id.calEt);
    }

    public final EditText getCalEt() {
        return (EditText) this.calEt$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseCustomSportGoalActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.custom_calories);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_custom_sport_calories_goal;
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseCustomSportGoalActivity
    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        String string = getCalEt().getText().toString();
        if (string.length() <= 0) {
            ToastUtils.showLong(getString(R.string.no_content_set_key), new Object[0]);
            return;
        }
        int i = Integer.parseInt(string);
        if (i == 0) {
            return;
        }
        setResult(-1, new Intent().putExtra(uz0.iXiiiO, new Pair(string, Integer.valueOf(i))));
        finish();
    }
}
