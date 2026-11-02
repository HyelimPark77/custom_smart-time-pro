package com.sma.smartv3.p610ui.sport.coach.item;

import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.p610ui.sport.coach.AICoachManage;
import com.sma.smartv3.pro.R;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nVitalityPlanItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VitalityPlanItem.kt\ncom/sma/smartv3/ui/sport/coach/item/VitalityPlanItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1878#2,3:39\n*S KotlinDebug\n*F\n+ 1 VitalityPlanItem.kt\ncom/sma/smartv3/ui/sport/coach/item/VitalityPlanItem\n*L\n27#1:39,3\n*E\n"})
public class VitalityPlanItem extends BaseDslItem {
    private TextView daysTv;
    private TextView goalTv;
    private TextView weekTv;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.vitality_plan_week_tv);
        Intrinsics.XXI(viewM3483v);
        this.weekTv = (TextView) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.vitality_plan_days_tv);
        Intrinsics.XXI(viewM3483v2);
        this.daysTv = (TextView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.vitality_plan_goal_tv);
        Intrinsics.XXI(viewM3483v3);
        this.goalTv = (TextView) viewM3483v3;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        TextView textView = this.weekTv;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.XXO("weekTv");
            textView = null;
        }
        AICoachManage.OXO1 oxo1 = AICoachManage.IiI10X;
        textView.setText(String.valueOf(oxo1.OXO1().X0O().getWeeklyTargetNumber()));
        int i = 0;
        int i2 = 0;
        for (Object obj : oxo1.OXO1().X0O().getDailySchedule()) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            if (((Number) obj).intValue() == 1 && i != AICoachManage.IiI10X.OXO1().X0O().getDailySchedule().size() - 1) {
                i2++;
            }
            i = i3;
        }
        TextView textView3 = this.daysTv;
        if (textView3 == null) {
            Intrinsics.XXO("daysTv");
            textView3 = null;
        }
        textView3.setText(String.valueOf(i2));
        TextView textView4 = this.goalTv;
        if (textView4 == null) {
            Intrinsics.XXO("goalTv");
        } else {
            textView2 = textView4;
        }
        textView2.setText(String.valueOf((int) AICoachManage.IiI10X.OXO1().X0O().getPlanTarget()));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.coach_item_vitality_plan;
    }
}
