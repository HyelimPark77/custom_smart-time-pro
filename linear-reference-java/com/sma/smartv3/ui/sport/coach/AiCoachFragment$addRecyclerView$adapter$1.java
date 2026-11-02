package com.sma.smartv3.ui.sport.coach;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I1IOiXO1i;
import com.android.mltcode.paycertificationapi.XI0XXXiI;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterItem;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAiCoachFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1869#2,2:473\n1563#2:475\n1634#2,3:476\n*S KotlinDebug\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1\n*L\n418#1:473,2\n432#1:475\n432#1:476,3\n*E\n"})
public final class AiCoachFragment$addRecyclerView$adapter$1 extends CommonAdapter<AICoachManage.PlanGroupTitle> {
    final /* synthetic */ AiCoachFragment this$0;

    public AiCoachFragment$addRecyclerView$adapter$1(Ref.ObjectRef<List<AICoachManage.PlanGroupTitle>> r1, AiCoachFragment r2, Context r3) {
        this.this$0 = r2;
        super(r3, R.layout.item_ai_plan_item_group_head, r1.element);
    }

    public static /* synthetic */ Unit OXO1(DslAdapter r0) {
        return convert$lambda$0$0$2(r0);
    }

    public static /* synthetic */ void XIi00iiXO(AiCoachFragment$addRecyclerView$adapter$1 r0, AiCoachFragment r1, int r2, AICoachManage.PlanGroupTitle r3, View r4) {
        convert$lambda$0(r0, r1, r2, r3, r4);
    }

    private static final void convert$lambda$0(AiCoachFragment$addRecyclerView$adapter$1 r6, AiCoachFragment r7, int r8, AICoachManage.PlanGroupTitle r9, View r10) {
        if (r6.mContext == null) goto L26;
        ArrayList r11 = new ArrayList();
        Iterator<T> r12 = r7.getDslAdapter().getDataItems().iterator();
    L6:
        if (r12.hasNext() == false) goto L12;
        DslAdapterItem r0 = (DslAdapterItem) r12.next();
        if (r0.getItemIsGroupHead() == true) goto L6;
        if (Intrinsics.XOO0ii0(r0.getItemGroups(), CollectionsKt__CollectionsKt.Ii1iii0(new String[]{AiCoachFragment.access$getITEM_GROUPS_TAG$p(r7)})) == false) goto L6;
        r11.add(r0);
        goto L6
    L12:
        r7.getDslAdapter().removeItem(r11);
        DslAdapter.updateItemDepend$default(r7.getDslAdapter(), null, 1, null);
        AiCoachFragment.access$setCurPosition$p(r7, r8);
        AiCoachFragment.access$setCurDataPosition$p(r7, r9.getMLessonIndex());
        AiCoachFragment.access$setCurTimeDay$p(r7, r9.getTimeDay());
        r7.setReachedTarget(r9.isCompleted());
        List r13 = AiCoachFragment.access$getMListAdapter$p(r7);
        ArrayList r14 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r13, 10));
        Iterator r15 = r13.iterator();
    L14:
        if (r15.hasNext() == false) goto L16;
        ((CommonAdapter) r15.next()).notifyDataSetChanged();
        r14.add(Unit.OXO1);
        goto L14
    L16:
        AiCoachFragment.access$showPlanFunction(r7);
        DslAdapter.render$default(r7.getDslAdapter(), false, null, new I1IOiXO1i(), 3, null);
        return;
    }

    private static final Unit convert$lambda$0$0$2(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, AICoachManage.PlanGroupTitle r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r10, final AICoachManage.PlanGroupTitle r11, final int r12) {
        Intrinsics.X0O(r10, "viewHolder");
        Intrinsics.X0O(r11, MapController.ITEM_LAYER_TAG);
        TextView r0 = (TextView) r10.getView(R.id.text_time_calendar);
        TextView r1 = (TextView) r10.getView(R.id.text_time);
        r0.setText(r11.getOfWeek());
        r1.setText(r11.getTimeDay());
        View r2 = r10.getView(R.id.plan_item_group_head_title);
        GradientDrawable r3 = new GradientDrawable();
        r3.setCornerRadii(new float[]{60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f});
        if (r11.isHaveLesson() == true) goto L5;
    L7:
        int r4 = this.this$0.getResources().getColor(R.color.coach_assessment_rank_6);
    L8:
        r1.setBackground(null);
        r0.setTextColor(this.this$0.getResources().getColor(R.color.black));
        r1.setTextColor(this.this$0.getResources().getColor(R.color.black));
        if (r12 == AiCoachFragment.access$getCurPosition$p(this.this$0)) goto L11;
    L13:
        r3.setColor(r4);
        r2.setBackground(r3);
        View r13 = r10.itemView;
        final AiCoachFragment r5 = this.this$0;
        r13.setOnClickListener(new XI0XXXiI(this, r5, r12, r11));
        return;
    L11:
        if (Intrinsics.XOO0ii0(r11.getTimeDay(), AiCoachFragment.access$getCurTimeDay$p(this.this$0)) == false) goto L13;
        r4 = this.this$0.getResources().getColor(R.color.colorAccent);
        GradientDrawable r7 = new GradientDrawable();
        r7.setShape(1);
        r7.setColor(this.this$0.getResources().getColor(R.color.light));
        r1.setBackground(r7);
        r0.setTextColor(this.this$0.getResources().getColor(R.color.light));
        r1.setTextColor(this.this$0.getResources().getColor(R.color.colorAccent));
        goto L13
    L5:
        if (AICoachManage.IiI10X.OXO1().X0O().getDailySchedule().get(r11.getMLessonIndex() % 7).intValue() != 1) goto L7;
        r4 = this.this$0.getResources().getColor(R.color.coach_assessment_rank_2);
        goto L8
    }
}
