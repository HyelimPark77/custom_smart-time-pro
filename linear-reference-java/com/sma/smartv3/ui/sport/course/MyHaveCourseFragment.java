package com.sma.smartv3.ui.sport.course;

import android.os.Bundle;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.vz0;
import com.android.mltcode.paycertificationapi.wz0;
import com.android.mltcode.paycertificationapi.xz0;
import com.android.mltcode.paycertificationapi.yz0;
import com.android.mltcode.paycertificationapi.zz0;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMyHaveCourseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyHaveCourseFragment.kt\ncom/sma/smartv3/ui/sport/course/MyHaveCourseFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1869#2,2:62\n*S KotlinDebug\n*F\n+ 1 MyHaveCourseFragment.kt\ncom/sma/smartv3/ui/sport/course/MyHaveCourseFragment\n*L\n37#1:62,2\n*E\n"})
public class MyHaveCourseFragment extends BaseDSLRecyclerFragment {
    public MyHaveCourseFragment() {
    }

    public static /* synthetic */ Unit IiI10X(DslAdapter r0) {
        return showData$lambda$0$0$1(r0);
    }

    public static /* synthetic */ Unit O00(List r0, DslAdapter r1) {
        return showData$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XO0O10(DslAdapterItem r0) {
        return showData$lambda$0$0$0$0(r0);
    }

    public static /* synthetic */ Unit XOO0ii0(DslViewHolder r0, int r1, DslAdapterItem r2, List r3) {
        return showData$lambda$0$0$0$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit iO(MyHaveCourseFragment r0, List r1, DslAdapter r2) {
        return showData$lambda$0(r0, r1, r2);
    }

    private static final Unit showData$lambda$0(MyHaveCourseFragment r2, final List r3, final DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        r4.clearAllItems();
        DslAdapter.setAdapterStatus$default(r4, 2, null, 2, null);
        r2.getDslViewHolder().postDelay(100, new wz0(r3, r4));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(List r8, DslAdapter r9) {
        Iterator r10 = r8.iterator();
    L4:
        if (r10.hasNext() == false) goto L6;
        String r0 = (String) r10.next();
        DslAdapterExKt.O10IXXX0X(r9, R.layout.item_special_course, new xz0());
        goto L4
    L6:
        DslAdapter.render$default(r9, false, null, new yz0(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$0(DslAdapterItem r1) {
        Intrinsics.X0O(r1, "$this$dslItem");
        r1.setItemBindOverride(new vz0());
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$0$0(DslViewHolder r0, int r1, DslAdapterItem r2, List r3) {
        Intrinsics.X0O(r0, "viewHolder");
        Intrinsics.X0O(r2, "<unused var>");
        Intrinsics.X0O(r3, "<unused var>");
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$1(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.course_fragment_rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public void showData(@aa1 final List<String> r2) {
        Intrinsics.X0O(r2, "list");
        renderAdapter(new zz0(this, r2));
    }
}
