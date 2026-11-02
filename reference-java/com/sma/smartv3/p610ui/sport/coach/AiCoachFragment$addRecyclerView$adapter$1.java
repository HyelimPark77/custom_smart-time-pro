package com.sma.smartv3.p610ui.sport.coach;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterItem;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.p610ui.sport.coach.AiCoachFragment$addRecyclerView$adapter$1;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAiCoachFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1869#2,2:473\n1563#2:475\n1634#2,3:476\n*S KotlinDebug\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1\n*L\n418#1:473,2\n432#1:475\n432#1:476,3\n*E\n"})
public final class AiCoachFragment$addRecyclerView$adapter$1 extends CommonAdapter<AICoachManage.PlanGroupTitle> {
    final /* synthetic */ AiCoachFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiCoachFragment$addRecyclerView$adapter$1(Ref.ObjectRef<List<AICoachManage.PlanGroupTitle>> objectRef, AiCoachFragment aiCoachFragment, Context context) {
        super(context, R.layout.item_ai_plan_item_group_head, objectRef.element);
        this.this$0 = aiCoachFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$0(AiCoachFragment$addRecyclerView$adapter$1 aiCoachFragment$addRecyclerView$adapter$1, AiCoachFragment aiCoachFragment, int i, AICoachManage.PlanGroupTitle planGroupTitle, View view) {
        if (((CommonAdapter) aiCoachFragment$addRecyclerView$adapter$1).mContext != null) {
            ArrayList arrayList = new ArrayList();
            for (DslAdapterItem dslAdapterItem : aiCoachFragment.getDslAdapter().getDataItems()) {
                if (!dslAdapterItem.getItemIsGroupHead() && Intrinsics.XOO0ii0(dslAdapterItem.getItemGroups(), CollectionsKt__CollectionsKt.Ii1iii0(aiCoachFragment.ITEM_GROUPS_TAG))) {
                    arrayList.add(dslAdapterItem);
                }
            }
            aiCoachFragment.getDslAdapter().removeItem(arrayList);
            DslAdapter.updateItemDepend$default(aiCoachFragment.getDslAdapter(), null, 1, null);
            aiCoachFragment.curPosition = i;
            aiCoachFragment.curDataPosition = planGroupTitle.getMLessonIndex();
            aiCoachFragment.curTimeDay = planGroupTitle.getTimeDay();
            aiCoachFragment.setReachedTarget(planGroupTitle.isCompleted());
            List list = aiCoachFragment.mListAdapter;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((CommonAdapter) it.next()).notifyDataSetChanged();
                arrayList2.add(Unit.OXO1);
            }
            aiCoachFragment.showPlanFunction();
            DslAdapter.render$default(aiCoachFragment.getDslAdapter(), false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.I1IOiXO1i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AiCoachFragment$addRecyclerView$adapter$1.convert$lambda$0$0$2((DslAdapter) obj);
                }
            }, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit convert$lambda$0$0$2(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder viewHolder, final AICoachManage.PlanGroupTitle item, final int i) {
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(item, "item");
        TextView textView = (TextView) viewHolder.getView(R.id.text_time_calendar);
        TextView textView2 = (TextView) viewHolder.getView(R.id.text_time);
        textView.setText(item.getOfWeek());
        textView2.setText(item.getTimeDay());
        View view = viewHolder.getView(R.id.plan_item_group_head_title);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f});
        int color = (item.isHaveLesson() && AICoachManage.IiI10X.OXO1().X0O().getDailySchedule().get(item.getMLessonIndex() % 7).intValue() == 1) ? this.this$0.getResources().getColor(R.color.coach_assessment_rank_2) : this.this$0.getResources().getColor(R.color.coach_assessment_rank_6);
        textView2.setBackground(null);
        textView.setTextColor(this.this$0.getResources().getColor(R.color.black));
        textView2.setTextColor(this.this$0.getResources().getColor(R.color.black));
        if (i == this.this$0.curPosition && Intrinsics.XOO0ii0(item.getTimeDay(), this.this$0.curTimeDay)) {
            color = this.this$0.getResources().getColor(R.color.colorAccent);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(this.this$0.getResources().getColor(R.color.light));
            textView2.setBackground(gradientDrawable2);
            textView.setTextColor(this.this$0.getResources().getColor(R.color.light));
            textView2.setTextColor(this.this$0.getResources().getColor(R.color.colorAccent));
        }
        gradientDrawable.setColor(color);
        view.setBackground(gradientDrawable);
        View view2 = viewHolder.itemView;
        final AiCoachFragment aiCoachFragment = this.this$0;
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XI0XXXiI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                AiCoachFragment$addRecyclerView$adapter$1.convert$lambda$0(this.f4453IO, aiCoachFragment, i, item, view3);
            }
        });
    }
}
