package com.sma.smartv3.p610ui.sport.course;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.sma.smartv3.p610ui.sport.course.MyHaveCourseFragment;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMyHaveCourseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyHaveCourseFragment.kt\ncom/sma/smartv3/ui/sport/course/MyHaveCourseFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1869#2,2:62\n*S KotlinDebug\n*F\n+ 1 MyHaveCourseFragment.kt\ncom/sma/smartv3/ui/sport/course/MyHaveCourseFragment\n*L\n37#1:62,2\n*E\n"})
public class MyHaveCourseFragment extends BaseDSLRecyclerFragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(MyHaveCourseFragment myHaveCourseFragment, final List list, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.clearAllItems();
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        myHaveCourseFragment.getDslViewHolder().postDelay(100L, new Function0() { // from class: com.android.mltcode.paycertificationapi.wz0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return MyHaveCourseFragment.showData$lambda$0$0(list, renderAdapter);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(List list, DslAdapter dslAdapter) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DslAdapterExKt.O10IXXX0X(dslAdapter, R.layout.item_special_course, new Function1() { // from class: com.android.mltcode.paycertificationapi.xz0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MyHaveCourseFragment.showData$lambda$0$0$0$0((DslAdapterItem) obj);
                }
            });
        }
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.yz0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHaveCourseFragment.showData$lambda$0$0$1((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0$0(DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.vz0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MyHaveCourseFragment.showData$lambda$0$0$0$0$0((DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0$0$0(DslViewHolder viewHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$1(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.course_fragment_rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public void showData(@aa1 final List<String> list) {
        Intrinsics.X0O(list, "list");
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.zz0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHaveCourseFragment.showData$lambda$0(this.f12728IO, list, (DslAdapter) obj);
            }
        });
    }
}
