package com.sma.smartv3.p610ui.sport.course;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C2421fp;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
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
import com.sma.smartv3.p610ui.sport.course.AllCourseActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n1#2:301\n1#2:305\n69#3,3:302\n72#3,5:306\n50#4,3:311\n53#4:317\n55#4,2:319\n1563#5:314\n1634#5,2:315\n1636#5:318\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity\n*L\n255#1:305\n255#1:302,3\n255#1:306,5\n247#1:311,3\n247#1:317\n247#1:319,2\n247#1:314\n247#1:315,2\n247#1:318\n*E\n"})
public final class AllCourseActivity extends BaseActivity {

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

    @tb1
    private C2421fp mListPop;

    @tb1
    private C2421fp mListPop2;

    @tb1
    private C2421fp mListPop3;

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIi1Oi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AllCourseActivity.abhTitleRight_delegate$lambda$0(this.f3082IO);
        }
    });

    @aa1
    private final Lazy mRecyclerViewType$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Xii0IXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AllCourseActivity.mRecyclerViewType_delegate$lambda$0(this.f5360IO);
        }
    });

    @aa1
    private final Lazy mRecyclerViewCourse$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0I1iiI0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AllCourseActivity.mRecyclerViewCourse_delegate$lambda$0(this.f3952IO);
        }
    });

    @aa1
    private ArrayList<CourSelectByType> mListPopData = new ArrayList<>();

    @aa1
    private ArrayList<CourSelectByType> mListCoursePartPopData = new ArrayList<>();

    @aa1
    private ArrayList<CourSelectByType> mListCourseSortTypeData = new ArrayList<>();

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.course.AllCourseActivity$addRecyclerTypeAdapter$1 */
    @SourceDebugExtension({"SMAP\nAllCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,300:1\n50#2,3:301\n53#2:307\n55#2,2:309\n1563#3:304\n1634#3,2:305\n1636#3:308\n*S KotlinDebug\n*F\n+ 1 AllCourseActivity.kt\ncom/sma/smartv3/ui/sport/course/AllCourseActivity$addRecyclerTypeAdapter$1\n*L\n144#1:301,3\n144#1:307\n144#1:309,2\n144#1:304\n144#1:305,2\n144#1:308\n*E\n"})
    public static final class C189711 extends CommonAdapter<CourseType> {
        final /* synthetic */ Ref.IntRef $curPosition;
        final /* synthetic */ AllCourseActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189711(List<CourseType> list, Ref.IntRef intRef, AllCourseActivity allCourseActivity, Activity activity) {
            super(activity, R.layout.item_all_course_type, list);
            this.$curPosition = intRef;
            this.this$0 = allCourseActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(Ref.IntRef intRef, int i, AllCourseActivity allCourseActivity, CourseType courseType, C189711 c189711, View view) {
            Collection collectionM39402iI;
            intRef.element = i;
            allCourseActivity.setCourseType(courseType.getDictValue());
            allCourseActivity.getOnLineCourseList();
            c189711.notifyDataSetChanged();
            RecyclerView mRecyclerViewCourse = allCourseActivity.getMRecyclerViewCourse();
            Intrinsics.O10IXXX0X(mRecyclerViewCourse, "access$getMRecyclerViewCourse(...)");
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.O00().getString(b01.IXiOXO)).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    collectionM39402iI.add(new Gson().fromJson(it.next(), CourseList.class));
                }
            } catch (Exception unused) {
                collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            allCourseActivity.addRecyclerCourseAdapter(mRecyclerViewCourse, CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI));
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder viewHolder, final CourseType item, final int i) {
            Intrinsics.X0O(viewHolder, "viewHolder");
            Intrinsics.X0O(item, "item");
            TextView textView = (TextView) viewHolder.getView(R.id.course_type_tv);
            View view = viewHolder.getView(R.id.course_type_view);
            textView.setText(item.getDictLabel());
            if (this.$curPosition.element == i) {
                textView.setTextColor(((CommonAdapter) this).mContext.getResources().getColor(R.color.black));
                view.setVisibility(0);
                viewHolder.itemView.setBackgroundResource(R.drawable.shape_course_tab_selected_bg);
            } else {
                view.setVisibility(8);
                textView.setTextColor(((CommonAdapter) this).mContext.getResources().getColor(R.color.line_color));
                viewHolder.itemView.setBackground(null);
            }
            final Ref.IntRef intRef = this.$curPosition;
            final AllCourseActivity allCourseActivity = this.this$0;
            viewHolder.setOnClickListener(R.id.course_type_tv, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iO0i1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AllCourseActivity.C189711.convert$lambda$0(intRef, i, allCourseActivity, item, this, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(AllCourseActivity allCourseActivity) {
        return (ImageView) allCourseActivity.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final void getCourSelectByType(final String str) {
        CourseManager.OXO1.OIi0(str, new Function1() { // from class: com.android.mltcode.paycertificationapi.OOiI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AllCourseActivity.getCourSelectByType$lambda$0(str, this, (CourSelectByType[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public static final Unit getCourSelectByType$lambda$0(String str, AllCourseActivity allCourseActivity, CourSelectByType[] courSelectByTypeArr) {
        if (courSelectByTypeArr == null) {
            ToastUtils.showLong(R.string.auto_retry_active_tip);
        } else {
            if (!(courSelectByTypeArr.length == 0)) {
                List listOXI0X0 = ArraysKt___ArraysKt.OXI0X0(courSelectByTypeArr);
                if (Intrinsics.XOO0ii0(str, GetCourSelectByType.COURSE_DIFF)) {
                    allCourseActivity.mListPopData.addAll(listOXI0X0);
                } else if (Intrinsics.XOO0ii0(str, GetCourSelectByType.COURSE_PART)) {
                    allCourseActivity.mListCoursePartPopData.addAll(listOXI0X0);
                } else {
                    allCourseActivity.mListCourseSortTypeData.addAll(listOXI0X0);
                }
            } else {
                ToastUtils.showLong(R.string.auto_retry_active_tip);
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    public static final Unit getCourseType$lambda$0(AllCourseActivity allCourseActivity, CourseType[] courseTypeArr) {
        if (courseTypeArr == null) {
            ToastUtils.showLong(R.string.auto_retry_active_tip);
        } else {
            if (!(courseTypeArr.length == 0)) {
                List<CourseType> listOXI0X0 = ArraysKt___ArraysKt.OXI0X0(courseTypeArr);
                CourseType courseType = listOXI0X0.get(0);
                String string = allCourseActivity.getString(R.string.all_courses);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                listOXI0X0.add(0, CourseType.copy$default(courseType, null, null, string, null, null, null, null, null, null, null, 1019, null));
                RecyclerView mRecyclerViewType = allCourseActivity.getMRecyclerViewType();
                Intrinsics.O10IXXX0X(mRecyclerViewType, "<get-mRecyclerViewType>(...)");
                allCourseActivity.addRecyclerTypeAdapter(mRecyclerViewType, listOXI0X0);
            } else {
                ToastUtils.showLong(R.string.auto_retry_active_tip);
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getMRecyclerViewCourse() {
        return (RecyclerView) this.mRecyclerViewCourse$delegate.getValue();
    }

    private final RecyclerView getMRecyclerViewType() {
        return (RecyclerView) this.mRecyclerViewType$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOnLineCourseList$lambda$0(AllCourseActivity allCourseActivity, boolean z) {
        Collection collectionM39402iI;
        if (z) {
            RecyclerView mRecyclerViewCourse = allCourseActivity.getMRecyclerViewCourse();
            Intrinsics.O10IXXX0X(mRecyclerViewCourse, "<get-mRecyclerViewCourse>(...)");
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.O00().getString(b01.IXiOXO)).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    collectionM39402iI.add(new Gson().fromJson(it.next(), CourseList.class));
                }
            } catch (Exception unused) {
                collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            allCourseActivity.addRecyclerCourseAdapter(mRecyclerViewCourse, CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerViewCourse_delegate$lambda$0(AllCourseActivity allCourseActivity) {
        return (RecyclerView) allCourseActivity.findViewById(R.id.all_course_list_course);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerViewType_delegate$lambda$0(AllCourseActivity allCourseActivity) {
        return (RecyclerView) allCourseActivity.findViewById(R.id.all_course_list_type);
    }

    public final void addRecyclerCourseAdapter(@aa1 RecyclerView mRecyclerView, @aa1 List<CourseList> list) {
        Intrinsics.X0O(mRecyclerView, "mRecyclerView");
        Intrinsics.X0O(list, "list");
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getMContext(), 1, false));
        mRecyclerView.setAdapter(new AllCourseActivity$addRecyclerCourseAdapter$mAdapter$1(list, getMContext()));
    }

    public final void addRecyclerTypeAdapter(@aa1 RecyclerView mRecyclerView, @aa1 List<CourseType> list) {
        Intrinsics.X0O(mRecyclerView, "mRecyclerView");
        Intrinsics.X0O(list, "list");
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getMContext(), 1, false));
        C189711 c189711 = new C189711(list, new Ref.IntRef(), this, getMContext());
        mRecyclerView.setAdapter(c189711);
        this.mAdapter = c189711;
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
    /* JADX INFO: renamed from: getCourseType */
    public final String m48122getCourseType() {
        return this.courseType;
    }

    public final void getOnLineCourse(@aa1 String dictValue, @aa1 String diff, @aa1 String heat) {
        Intrinsics.X0O(dictValue, "dictValue");
        Intrinsics.X0O(diff, "diff");
        Intrinsics.X0O(heat, "heat");
    }

    public final void getOnLineCourseList() {
        CourseManager.OXO1.O10IXXX0X(this.courseType, this.courseDiff, this.coursePart, this.courseSortType, new Function1() { // from class: com.android.mltcode.paycertificationapi.I0O0O1XI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AllCourseActivity.getOnLineCourseList$lambda$0(this.f1146IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        getCourseType();
        getCourSelectByType(GetCourSelectByType.COURSE_DIFF);
        getCourSelectByType(GetCourSelectByType.COURSE_PART);
        getCourSelectByType(GetCourSelectByType.COURSE_SORT_TYPE);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(getString(R.string.all_courses));
        getOnLineCourseList();
        getAbhTitleRight().setVisibility(8);
        getAbhTitleRight().setImageResource(R.drawable.icon_right_search);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_all_course;
    }

    public final void onCurriculum(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mListCourseSortTypeData.isEmpty()) {
            getCourSelectByType(GetCourSelectByType.COURSE_SORT_TYPE);
        } else {
            showListPoP(view, this.mListCourseSortTypeData, GetCourSelectByType.COURSE_SORT_TYPE);
        }
    }

    public final void onDifficulty(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mListPopData.isEmpty()) {
            getCourSelectByType(GetCourSelectByType.COURSE_DIFF);
        } else {
            showListPoP(view, this.mListPopData, GetCourSelectByType.COURSE_DIFF);
        }
    }

    public final void onExercisePart(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mListCoursePartPopData.isEmpty()) {
            getCourSelectByType(GetCourSelectByType.COURSE_PART);
        } else {
            showListPoP(view, this.mListCoursePartPopData, GetCourSelectByType.COURSE_PART);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        CommonAdapter<CourseType> commonAdapter = this.mAdapter;
        if (commonAdapter != null) {
            commonAdapter.notifyDataSetChanged();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) CourseSearchActivity.class));
    }

    public final void setCourseDiff(@tb1 String str) {
        this.courseDiff = str;
    }

    public final void setCoursePart(@tb1 String str) {
        this.coursePart = str;
    }

    public final void setCourseSortType(@tb1 String str) {
        this.courseSortType = str;
    }

    public final void setCourseType(@tb1 String str) {
        this.courseType = str;
    }

    public final void showListPoP(@aa1 View view, @aa1 List<CourSelectByType> data, @aa1 String type) {
        Intrinsics.X0O(view, "view");
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(type, "type");
        C2421fp c2421fp = new C2421fp(getMContext());
        c2421fp.I0IIOi(new AllCourseActivity$showListPoP$1$1(data, type, this, getMContext()));
        this.mListPop = c2421fp;
        c2421fp.showAsDropDown(view);
    }

    private final void getCourseType() {
        CourseManager.X1ii(CourseManager.OXO1, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.IOXI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AllCourseActivity.getCourseType$lambda$0(this.f1867IO, (CourseType[]) obj);
            }
        }, 1, null);
    }
}
