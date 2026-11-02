package com.sma.smartv3.ui.sport.course;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I0111iO;
import com.android.mltcode.paycertificationapi.I0i1011iI;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIiXiX;
import com.android.mltcode.paycertificationapi.OOX0OO;
import com.android.mltcode.paycertificationapi.XiI0iO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iX1XX;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.sma.smartv3.model.CourseDetails;
import com.sma.smartv3.model.ProgressMarkers;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseActionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseActionFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseActionFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1869#2,2:76\n*S KotlinDebug\n*F\n+ 1 CourseActionFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseActionFragment\n*L\n46#1:76,2\n*E\n"})
public final class CourseActionFragment extends BaseDSLRecyclerFragment {
    private CourseDetails mCourseDetails;

    public CourseActionFragment() {
    }

    public static /* synthetic */ Unit I0IIOi(CourseActionFragment r0, List r1, DslAdapter r2) {
        return showData$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit IiI10X(DslAdapter r0) {
        return showData$lambda$0$0$1(r0);
    }

    public static /* synthetic */ Unit O00(List r0, DslAdapter r1, CourseActionFragment r2) {
        return showData$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XO0O10(CourseActionFragment r0, ProgressMarkers r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showData$lambda$0$0$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit XOO0ii0(CourseActionFragment r0, ProgressMarkers r1, DslAdapterItem r2) {
        return showData$lambda$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ void iO(CourseActionFragment r0, int r1, View r2) {
        showData$lambda$0$0$0$0$0$0(r0, r1, r2);
    }

    private static final Unit showData$lambda$0(final CourseActionFragment r2, final List r3, final DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        r4.clearAllItems();
        DslAdapter.setAdapterStatus$default(r4, 2, null, 2, null);
        r2.getDslViewHolder().postDelay(100, new I0i1011iI(r3, r4, r2));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(List r8, DslAdapter r9, final CourseActionFragment r10) {
        Iterator r11 = r8.iterator();
    L4:
        if (r11.hasNext() == false) goto L6;
        final ProgressMarkers r0 = (ProgressMarkers) r11.next();
        DslAdapterExKt.O10IXXX0X(r9, R.layout.item_action_course, new XiI0iO(r10, r0));
        goto L4
    L6:
        DslAdapter.render$default(r9, false, null, new iX1XX(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$0(final CourseActionFragment r1, final ProgressMarkers r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemBindOverride(new I0111iO(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0$0$0(final CourseActionFragment r1, ProgressMarkers r2, DslViewHolder r3, final int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "viewHolder");
        Intrinsics.X0O(r5, "<unused var>");
        Intrinsics.X0O(r6, "<unused var>");
        if (r4 != 0) goto L7;
        View r7 = r3.view(R.id.item_special_course_view);
        if (r7 == null) goto L7;
        r7.setVisibility(8);
    L7:
        RequestBuilder<Drawable> r8 = Glide.with(r1.requireActivity()).load(r2.getCoverUrl());
        ImageView r9 = r3.img(R.id.item_special_course_pic);
        Intrinsics.XXI(r9);
        r8.into(r9);
        TextView r10 = (TextView) r3.v(R.id.item_special_course_name);
        if (r10 == null) goto L10;
        r10.setText(r2.getTitle());
    L10:
        TextView r11 = (TextView) r3.v(R.id.item_special_course_intro);
        if (r11 == null) goto L13;
        r11.setText(O0X11OiO.XOO0XOOii(r2.getTime()));
    L13:
        View r12 = r3.v(R.id.item_special_course_layout);
        if (r12 == null) goto L17;
        r12.setOnClickListener(new OIiXiX(r1, r4));
    L17:
        return Unit.OXO1;
    }

    private static final void showData$lambda$0$0$0$0$0$0(CourseActionFragment r2, int r3, View r4) {
        Intent r5 = new Intent(r2.requireActivity(), CourseIntroduceActivity.class);
        r5.putExtra("mArg1", r3);
        CourseDetails r6 = r2.mCourseDetails;
        if (r6 != null) goto L5;
        Intrinsics.XXO("mCourseDetails");
        r6 = null;
    L5:
        r5.putExtra("mArg3", r6);
        r2.requireActivity().startActivity(r5);
    }

    private static final Unit showData$lambda$0$0$1(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.model.CourseDetails");
        this.mCourseDetails = (CourseDetails) r3;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        CourseDetails r0 = this.mCourseDetails;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mCourseDetails");
        r0 = null;
    L5:
        showData(r0.getProgressMarkers());
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

    public final void showData(@aa1 final List<ProgressMarkers> r2) {
        Intrinsics.X0O(r2, "list");
        renderAdapter(new OOX0OO(this, r2));
    }
}
