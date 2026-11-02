package com.sma.smartv3.p610ui.sport.coach.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.sport.coach.CreatePlanActivity;
import com.sma.smartv3.p610ui.sport.coach.item.LackPlanItem;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class LackPlanItem extends BaseDslItem {
    private Button mButton;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(LackPlanItem lackPlanItem, View view) {
        if (!i72.OXO1.iOIi00Ii()) {
            ToastUtils.showLong(R.string.abh_login_tip);
            return;
        }
        Button button = lackPlanItem.mButton;
        Button button2 = null;
        if (button == null) {
            Intrinsics.XXO("mButton");
            button = null;
        }
        Context context = button.getContext();
        Button button3 = lackPlanItem.mButton;
        if (button3 == null) {
            Intrinsics.XXO("mButton");
        } else {
            button2 = button3;
        }
        context.startActivity(new Intent(button2.getContext(), (Class<?>) CreatePlanActivity.class));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.coach_item_create_plan);
        Intrinsics.XXI(viewM3483v);
        this.mButton = (Button) viewM3483v;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        Button button = this.mButton;
        if (button == null) {
            Intrinsics.XXO("mButton");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.yi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LackPlanItem.initView$lambda$0(this.f12377IO, view);
            }
        });
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.coach_item_lack_plan;
    }
}
