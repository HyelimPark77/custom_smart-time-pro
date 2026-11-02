package com.sma.smartv3.ui.sport.coach.item;

import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.AICoachManage;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nVitalityPlanItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VitalityPlanItem.kt\ncom/sma/smartv3/ui/sport/coach/item/VitalityPlanItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1878#2,3:39\n*S KotlinDebug\n*F\n+ 1 VitalityPlanItem.kt\ncom/sma/smartv3/ui/sport/coach/item/VitalityPlanItem\n*L\n27#1:39,3\n*E\n"})
public class VitalityPlanItem extends BaseDslItem {
    private TextView daysTv;
    private TextView goalTv;
    private TextView weekTv;

    public VitalityPlanItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r0 = r2.v(R.id.vitality_plan_week_tv);
        Intrinsics.XXI(r0);
        this.weekTv = (TextView) r0;
        View r1 = r2.v(R.id.vitality_plan_days_tv);
        Intrinsics.XXI(r1);
        this.daysTv = (TextView) r1;
        View r3 = r2.v(R.id.vitality_plan_goal_tv);
        Intrinsics.XXI(r3);
        this.goalTv = (TextView) r3;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        TextView r0 = this.weekTv;
        TextView r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("weekTv");
        r0 = null;
    L5:
        AICoachManage.OXO1 r2 = AICoachManage.IiI10X;
        r0.setText(String.valueOf(r2.OXO1().X0O().getWeeklyTargetNumber()));
        Iterator<T> r3 = r2.OXO1().X0O().getDailySchedule().iterator();
        int r4 = 0;
        int r5 = 0;
    L7:
        if (r3.hasNext() == false) goto L17;
        Object r6 = r3.next();
        int r7 = r4 + 1;
        if (r4 >= 0) goto L12;
        CollectionsKt__CollectionsKt.XOX0O0();
    L12:
        if (((Number) r6).intValue() != 1) goto L16;
        if (r4 == (AICoachManage.IiI10X.OXO1().X0O().getDailySchedule().size() - 1)) goto L16;
        r5 = r5 + 1;
    L16:
        r4 = r7;
        goto L7
    L17:
        TextView r8 = this.daysTv;
        if (r8 != null) goto L20;
        Intrinsics.XXO("daysTv");
        r8 = null;
    L20:
        r8.setText(String.valueOf(r5));
        TextView r9 = this.goalTv;
        if (r9 != null) goto L23;
        Intrinsics.XXO("goalTv");
    L24:
        r1.setText(String.valueOf((int) AICoachManage.IiI10X.OXO1().X0O().getPlanTarget()));
        return;
    L23:
        r1 = r9;
        goto L24
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.coach_item_vitality_plan;
    }
}
