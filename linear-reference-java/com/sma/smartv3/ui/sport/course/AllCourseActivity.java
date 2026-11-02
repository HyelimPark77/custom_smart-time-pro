package com.sma.smartv3.ui.sport.course;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I0O0O1XI;
import com.android.mltcode.paycertificationapi.IOXI;
import com.android.mltcode.paycertificationapi.OIi1Oi;
import com.android.mltcode.paycertificationapi.OOiI;
import com.android.mltcode.paycertificationapi.X0I1iiI0I;
import com.android.mltcode.paycertificationapi.Xii0IXI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.fp;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO0i1;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.CourseManager;
import com.sma.smartv3.model.CourSelectByType;
import com.sma.smartv3.model.CourseList;
import com.sma.smartv3.model.CourseType;
import com.sma.smartv3.network.GetCourSelectByType;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n1#2:301\n1#2:305\n69#3,3:302\n72#3,5:306\n50#4,3:311\n53#4:317\n55#4,2:319\n1563#5:314\n1634#5,2:315\n1636#5:318\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity\n*L\n255#1:305\n255#1:302,3\n255#1:306,5\n247#1:311,3\n247#1:317\n247#1:319,2\n247#1:314\n247#1:315,2\n247#1:318\n*E\n"})
public final class AllCourseActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;

    @tb1
    private String courseDiff;

    @tb1
    private String coursePart;

    @tb1
    private String courseSortType;

    @tb1
    private String courseType;

    @tb1
    private CommonAdapter<CourseType> mAdapter;

    @aa1
    private ArrayList<CourSelectByType> mListCoursePartPopData;

    @aa1
    private ArrayList<CourSelectByType> mListCourseSortTypeData;

    @tb1
    private fp mListPop;

    @tb1
    private fp mListPop2;

    @tb1
    private fp mListPop3;

    @aa1
    private ArrayList<CourSelectByType> mListPopData;

    @aa1
    private final Lazy mRecyclerViewCourse$delegate;

    @aa1
    private final Lazy mRecyclerViewType$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.course.AllCourseActivity$addRecyclerTypeAdapter$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n50#2,3:301\n53#2:307\n55#2,2:309\n1563#3:304\n1634#3,2:305\n1636#3:308\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1\n*L\n144#1:301,3\n144#1:307\n144#1:309,2\n144#1:304\n144#1:305,2\n144#1:308\n*E\n"})
    public static final class AnonymousClass1 extends CommonAdapter<CourseType> {
        final /* synthetic */ Ref.IntRef $curPosition;
        final /* synthetic */ AllCourseActivity this$0;

        public AnonymousClass1(List<CourseType> r1, Ref.IntRef r2, AllCourseActivity r3, Activity r4) {
            this.$curPosition = r2;
            this.this$0 = r3;
            super(r4, R.layout.item_all_course_type, r1);
        }

        public static /* synthetic */ void OXO1(Ref.IntRef r0, int r1, AllCourseActivity r2, CourseType r3, AnonymousClass1 r4, View r5) {
            convert$lambda$0(r0, r1, r2, r3, r4, r5);
        }

        private static final void convert$lambda$0(Ref.IntRef r1, int r2, AllCourseActivity r3, CourseType r4, AnonymousClass1 r5, View r6) {
            r1.element = r2;
            r3.setCourseType(r4.getDictValue());
            r3.getOnLineCourseList();
            r5.notifyDataSetChanged();
            RecyclerView r7 = AllCourseActivity.access$getMRecyclerViewCourse(r3);
            Intrinsics.O10IXXX0X(r7, "access$getMRecyclerViewCourse(...)");
            JsonArray r8 = JsonParser.parseString(a01.OXO1.O00().getString(b01.IXiOXO)).getAsJsonArray();     // Catch: Exception -> L8
            Intrinsics.XXI(r8);     // Catch: Exception -> L8
            Collection r9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r8, 10));     // Catch: Exception -> L8
            Iterator<JsonElement> r10 = r8.iterator();     // Catch: Exception -> L8
        L5:
            if (r10.hasNext() == false) goto L9;
            JsonElement r11 = r10.next();     // Catch: Exception -> L8
            r9.add(new Gson().fromJson(r11, CourseList.class));     // Catch: Exception -> L8
        L9:
            r3.addRecyclerCourseAdapter(r7, CollectionsKt___CollectionsKt.OO0Oi10(r9));
            return;
        L8:
            r9 = CollectionsKt__CollectionsKt.iI();
            goto L9
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, CourseType r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r10, final CourseType r11, final int r12) {
            Intrinsics.X0O(r10, "viewHolder");
            Intrinsics.X0O(r11, MapController.ITEM_LAYER_TAG);
            TextView r1 = (TextView) r10.getView(R.id.course_type_tv);
            View r2 = r10.getView(R.id.course_type_view);
            r1.setText(r11.getDictLabel());
            if (this.$curPosition.element != r12) goto L5;
            r1.setTextColor(this.mContext.getResources().getColor(R.color.black));
            r2.setVisibility(0);
            r10.itemView.setBackgroundResource(R.drawable.shape_course_tab_selected_bg);
        L6:
            final Ref.IntRef r4 = this.$curPosition;
            final AllCourseActivity r6 = this.this$0;
            r10.setOnClickListener(R.id.course_type_tv, new iO0i1(r4, r12, r6, r11, this));
            return;
        L5:
            r2.setVisibility(8);
            r1.setTextColor(this.mContext.getResources().getColor(R.color.line_color));
            r10.itemView.setBackground(null);
            goto L6
        }
    }

    public AllCourseActivity() {
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new OIi1Oi(this));
        this.mRecyclerViewType$delegate = LazyKt__LazyJVMKt.iO(new Xii0IXI(this));
        this.mRecyclerViewCourse$delegate = LazyKt__LazyJVMKt.iO(new X0I1iiI0I(this));
        this.mListPopData = new ArrayList();
        this.mListCoursePartPopData = new ArrayList();
        this.mListCourseSortTypeData = new ArrayList();
    }

    public static /* synthetic */ RecyclerView I0iXXO(AllCourseActivity r0) {
        return mRecyclerViewCourse_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView O10IXXX0X(AllCourseActivity r0) {
        return mRecyclerViewType_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OIX0iXi(String r0, AllCourseActivity r1, CourSelectByType[] r2) {
        return getCourSelectByType$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit X0O(AllCourseActivity r0, boolean r1) {
        return getOnLineCourseList$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageView X1ii(AllCourseActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(AllCourseActivity r0, CourseType[] r1) {
        return getCourseType$lambda$0(r0, r1);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(AllCourseActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ fp access$getMListPop$p(AllCourseActivity r0) {
        return r0.mListPop;
    }

    public static final /* synthetic */ RecyclerView access$getMRecyclerViewCourse(AllCourseActivity r0) {
        return r0.getMRecyclerViewCourse();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final void getCourSelectByType(final String r3) {
        CourseManager.OXO1.OIi0(r3, new OOiI(r3, this));
    }

    private static final Unit getCourSelectByType$lambda$0(String r2, AllCourseActivity r3, CourSelectByType[] r4) {
        if (r4 != null) goto L4;
    L16:
        ToastUtils.showLong(R.string.auto_retry_active_tip);
    L18:
        return Unit.OXO1;
    L4:
        if (r4.length != 0) goto L6;
        boolean r0 = true;
    L8:
        if ((!r0) != true) goto L16;
        List r5 = ArraysKt___ArraysKt.OXI0X0(r4);
        if (Intrinsics.XOO0ii0(r2, GetCourSelectByType.COURSE_DIFF) == false) goto L13;
        r3.mListPopData.addAll(r5);
        goto L18
    L13:
        if (Intrinsics.XOO0ii0(r2, GetCourSelectByType.COURSE_PART) == false) goto L15;
        r3.mListCoursePartPopData.addAll(r5);
        goto L18
    L15:
        r3.mListCourseSortTypeData.addAll(r5);
        goto L18
    L6:
        r0 = false;
        goto L8
    }

    private static final Unit getCourseType$lambda$0(AllCourseActivity r17, CourseType[] r18) {
        if (r18 != null) goto L5;
    L11:
        ToastUtils.showLong(R.string.auto_retry_active_tip);
    L13:
        return Unit.OXO1;
    L5:
        if (r18.length != 0) goto L7;
        boolean r2 = true;
    L9:
        if ((!r2) != true) goto L11;
        List<CourseType> r1 = ArraysKt___ArraysKt.OXI0X0(r18);
        CourseType r4 = r1.get(0);
        String r7 = r17.getString(R.string.all_courses);
        Intrinsics.O10IXXX0X(r7, "getString(...)");
        r1.add(0, CourseType.copy$default(r4, null, null, r7, null, null, null, null, null, null, null, 1019, null));
        RecyclerView r3 = r17.getMRecyclerViewType();
        Intrinsics.O10IXXX0X(r3, "<get-mRecyclerViewType>(...)");
        r17.addRecyclerTypeAdapter(r3, r1);
        goto L13
    L7:
        r2 = false;
        goto L9
    }

    private final RecyclerView getMRecyclerViewCourse() {
        return (RecyclerView) getValue();
    }

    private final RecyclerView getMRecyclerViewType() {
        return (RecyclerView) getValue();
    }

    private static final Unit getOnLineCourseList$lambda$0(AllCourseActivity r5, boolean r6) {
        if (r6 == false) goto L12;
        RecyclerView r7 = r5.getMRecyclerViewCourse();
        Intrinsics.O10IXXX0X(r7, "<get-mRecyclerViewCourse>(...)");
        JsonArray r0 = JsonParser.parseString(a01.OXO1.O00().getString(b01.IXiOXO)).getAsJsonArray();     // Catch: Exception -> L9
        Intrinsics.XXI(r0);     // Catch: Exception -> L9
        Collection r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));     // Catch: Exception -> L9
        Iterator<JsonElement> r2 = r0.iterator();     // Catch: Exception -> L9
    L6:
        if (r2.hasNext() == false) goto L10;
        JsonElement r3 = r2.next();     // Catch: Exception -> L9
        r1.add(new Gson().fromJson(r3, CourseList.class));     // Catch: Exception -> L9
    L10:
        r5.addRecyclerCourseAdapter(r7, CollectionsKt___CollectionsKt.OO0Oi10(r1));
    L9:
        r1 = CollectionsKt__CollectionsKt.iI();
    L12:
        return Unit.OXO1;
    }

    private static final RecyclerView mRecyclerViewCourse_delegate$lambda$0(AllCourseActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.all_course_list_course);
    }

    private static final RecyclerView mRecyclerViewType_delegate$lambda$0(AllCourseActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.all_course_list_type);
    }

    public final void addRecyclerCourseAdapter(@aa1 RecyclerView r5, @aa1 List<CourseList> r6) {
        Intrinsics.X0O(r5, "mRecyclerView");
        Intrinsics.X0O(r6, "list");
        r5.setLayoutManager(new LinearLayoutManager(getMContext(), 1, false));
        r5.setAdapter(new AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1(r6, getMContext()));
    }

    public final void addRecyclerTypeAdapter(@aa1 RecyclerView r5, @aa1 List<CourseType> r6) {
        Intrinsics.X0O(r5, "mRecyclerView");
        Intrinsics.X0O(r6, "list");
        r5.setLayoutManager(new LinearLayoutManager(getMContext(), 1, false));
        AnonymousClass1 r2 = new AnonymousClass1(r6, new Ref.IntRef(), this, getMContext());
        r5.setAdapter(r2);
        this.mAdapter = r2;
    }

    @tb1
    public final String getCourseDiff() {
        return this.courseDiff;
    }

    @tb1
    public final String getCoursePart() {
        return this.coursePart;
    }

    @tb1
    public final String getCourseSortType() {
        return this.courseSortType;
    }

    @tb1
    /* JADX INFO: renamed from: getCourseType, reason: collision with other method in class */
    public final String m6763getCourseType() {
        return this.courseType;
    }

    public final void getOnLineCourse(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "dictValue");
        Intrinsics.X0O(r3, "diff");
        Intrinsics.X0O(r4, "heat");
    }

    public final void getOnLineCourseList() {
        CourseManager.OXO1.O10IXXX0X(this.courseType, this.courseDiff, this.coursePart, this.courseSortType, new I0O0O1XI(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        getCourseType();
        getCourSelectByType(GetCourSelectByType.COURSE_DIFF);
        getCourSelectByType(GetCourSelectByType.COURSE_PART);
        getCourSelectByType(GetCourSelectByType.COURSE_SORT_TYPE);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(getString(R.string.all_courses));
        getOnLineCourseList();
        getAbhTitleRight().setVisibility(8);
        getAbhTitleRight().setImageResource(R.drawable.icon_right_search);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_all_course;
    }

    public final void onCurriculum(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mListCourseSortTypeData.isEmpty() == false) goto L6;
        getCourSelectByType(GetCourSelectByType.COURSE_SORT_TYPE);
        return;
    L6:
        showListPoP(r3, this.mListCourseSortTypeData, GetCourSelectByType.COURSE_SORT_TYPE);
    }

    public final void onDifficulty(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mListPopData.isEmpty() == false) goto L6;
        getCourSelectByType(GetCourSelectByType.COURSE_DIFF);
        return;
    L6:
        showListPoP(r3, this.mListPopData, GetCourSelectByType.COURSE_DIFF);
    }

    public final void onExercisePart(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mListCoursePartPopData.isEmpty() == false) goto L6;
        getCourSelectByType(GetCourSelectByType.COURSE_PART);
        return;
    L6:
        showListPoP(r3, this.mListCoursePartPopData, GetCourSelectByType.COURSE_PART);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        CommonAdapter<CourseType> r0 = this.mAdapter;
        if (r0 == null) goto L6;
        r0.notifyDataSetChanged();
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, CourseSearchActivity.class));
    }

    public final void setCourseDiff(@tb1 String r1) {
        this.courseDiff = r1;
    }

    public final void setCoursePart(@tb1 String r1) {
        this.coursePart = r1;
    }

    public final void setCourseSortType(@tb1 String r1) {
        this.courseSortType = r1;
    }

    public final void setCourseType(@tb1 String r1) {
        this.courseType = r1;
    }

    public final void showListPoP(@aa1 View r4, @aa1 List<CourSelectByType> r5, @aa1 String r6) {
        Intrinsics.X0O(r4, "view");
        Intrinsics.X0O(r5, "data");
        Intrinsics.X0O(r6, "type");
        fp r0 = new fp(getMContext());
        r0.I0IIOi(new AllCourseActivity$showListPoP$1$1(r5, r6, this, getMContext()));
        this.mListPop = r0;
        r0.showAsDropDown(r4);
    }

    private final void getCourseType() {
        CourseManager.X1ii(CourseManager.OXO1, null, new IOXI(this), 1, null);
    }
}
