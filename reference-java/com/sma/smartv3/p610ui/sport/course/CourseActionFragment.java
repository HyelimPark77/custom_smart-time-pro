package com.sma.smartv3.p610ui.sport.course;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
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
import com.sma.smartv3.p610ui.sport.course.CourseActionFragment;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseActionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseActionFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseActionFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1869#2,2:76\n*S KotlinDebug\n*F\n+ 1 CourseActionFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseActionFragment\n*L\n46#1:76,2\n*E\n"})
public final class CourseActionFragment extends BaseDSLRecyclerFragment {
    private CourseDetails mCourseDetails;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(final CourseActionFragment courseActionFragment, final List list, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.clearAllItems();
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        courseActionFragment.getDslViewHolder().postDelay(100L, new Function0() { // from class: com.android.mltcode.paycertificationapi.I0i1011iI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return CourseActionFragment.showData$lambda$0$0(list, renderAdapter, courseActionFragment);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(List list, DslAdapter dslAdapter, final CourseActionFragment courseActionFragment) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ProgressMarkers progressMarkers = (ProgressMarkers) it.next();
            DslAdapterExKt.O10IXXX0X(dslAdapter, R.layout.item_action_course, new Function1() { // from class: com.android.mltcode.paycertificationapi.XiI0iO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseActionFragment.showData$lambda$0$0$0$0(this.f5248IO, progressMarkers, (DslAdapterItem) obj);
                }
            });
        }
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.iX1XX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseActionFragment.showData$lambda$0$0$1((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0$0(final CourseActionFragment courseActionFragment, final ProgressMarkers progressMarkers, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.I0111iO
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return CourseActionFragment.showData$lambda$0$0$0$0$0(this.f1048IO, progressMarkers, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0$0$0(final CourseActionFragment courseActionFragment, ProgressMarkers progressMarkers, DslViewHolder viewHolder, final int i, DslAdapterItem dslAdapterItem, List list) {
        View view;
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        if (i == 0 && (view = viewHolder.view(R.id.item_special_course_view)) != null) {
            view.setVisibility(8);
        }
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(courseActionFragment.requireActivity()).load(progressMarkers.getCoverUrl());
        ImageView imageViewImg = viewHolder.img(R.id.item_special_course_pic);
        Intrinsics.XXI(imageViewImg);
        requestBuilderLoad.into(imageViewImg);
        TextView textView = (TextView) viewHolder.m3483v(R.id.item_special_course_name);
        if (textView != null) {
            textView.setText(progressMarkers.getTitle());
        }
        TextView textView2 = (TextView) viewHolder.m3483v(R.id.item_special_course_intro);
        if (textView2 != null) {
            textView2.setText(O0X11OiO.XOO0XOOii(progressMarkers.getTime()));
        }
        View viewM3483v = viewHolder.m3483v(R.id.item_special_course_layout);
        if (viewM3483v != null) {
            viewM3483v.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OIiXiX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CourseActionFragment.showData$lambda$0$0$0$0$0$0(this.f3100IO, i, view2);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showData$lambda$0$0$0$0$0$0(CourseActionFragment courseActionFragment, int i, View view) {
        Intent intent = new Intent(courseActionFragment.requireActivity(), (Class<?>) CourseIntroduceActivity.class);
        intent.putExtra("mArg1", i);
        CourseDetails courseDetails = courseActionFragment.mCourseDetails;
        if (courseDetails == null) {
            Intrinsics.XXO("mCourseDetails");
            courseDetails = null;
        }
        intent.putExtra("mArg3", courseDetails);
        courseActionFragment.requireActivity().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$1(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.CourseDetails");
        this.mCourseDetails = (CourseDetails) mArg3;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        CourseDetails courseDetails = this.mCourseDetails;
        if (courseDetails == null) {
            Intrinsics.XXO("mCourseDetails");
            courseDetails = null;
        }
        showData(courseDetails.getProgressMarkers());
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

    public final void showData(@aa1 final List<ProgressMarkers> list) {
        Intrinsics.X0O(list, "list");
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.OOX0OO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseActionFragment.showData$lambda$0(this.f3304IO, list, (DslAdapter) obj);
            }
        });
    }
}
