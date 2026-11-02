package com.sma.smartv3.ui.sport.coach.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.yi;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.CreatePlanActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class LackPlanItem extends BaseDslItem {
    private Button mButton;

    public LackPlanItem() {
    }

    public static /* synthetic */ void O00(LackPlanItem r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private static final void initView$lambda$0(LackPlanItem r3, View r4) {
        if (i72.OXO1.iOIi00Ii() == false) goto L13;
        Button r5 = r3.mButton;
        Button r0 = null;
        if (r5 != null) goto L7;
        Intrinsics.XXO("mButton");
        r5 = null;
    L7:
        Context r6 = r5.getContext();
        Button r7 = r3.mButton;
        if (r7 != null) goto L10;
        Intrinsics.XXO("mButton");
    L11:
        r6.startActivity(new Intent(r0.getContext(), CreatePlanActivity.class));
        return;
    L10:
        r0 = r7;
        goto L11
    L13:
        ToastUtils.showLong(R.string.abh_login_tip);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r3 = r2.v(R.id.coach_item_create_plan);
        Intrinsics.XXI(r3);
        this.mButton = (Button) r3;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        Button r0 = this.mButton;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mButton");
        r0 = null;
    L5:
        r0.setOnClickListener(new yi(this));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.coach_item_lack_plan;
    }
}
