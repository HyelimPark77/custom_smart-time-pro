package com.sma.smartv3.p610ui.sport.course.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.CourseManager;
import com.sma.smartv3.model.RecommendSearch;
import com.sma.smartv3.p610ui.sport.course.model.CourseViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseViewModel.kt\ncom/sma/smartv3/ui/sport/course/model/CourseViewModel\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n50#2,3:58\n53#2:64\n55#2,2:66\n1563#3:61\n1634#3,2:62\n1636#3:65\n*S KotlinDebug\n*F\n+ 1 CourseViewModel.kt\ncom/sma/smartv3/ui/sport/course/model/CourseViewModel\n*L\n22#1:58,3\n22#1:64\n22#1:66,2\n22#1:61\n22#1:62,2\n22#1:65\n*E\n"})
public final class CourseViewModel extends ViewModel {

    @aa1
    private final MutableLiveData<ArrayList<RecommendSearch>> courseLiveData = new MutableLiveData<>();

    private final void getRecommendSearchListList() {
        CourseManager.OXO1.I1XOi1("INDEX", new Function1() { // from class: com.android.mltcode.paycertificationapi.OIOO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseViewModel.getRecommendSearchListList$lambda$0(this.f3009IO, (RecommendSearch[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getRecommendSearchListList$lambda$0(CourseViewModel courseViewModel, RecommendSearch[] recommendSearchArr) {
        if (recommendSearchArr != null) {
            courseViewModel.courseLiveData.postValue((ArrayList) ArraysKt___ArraysKt.OXI0X0(recommendSearchArr));
        }
        return Unit.OXO1;
    }

    private final boolean getTime(List<RecommendSearch> list) {
        return System.currentTimeMillis() - list.get(0).getOnCreateTime() > 86400000;
    }

    @aa1
    public final MutableLiveData<ArrayList<RecommendSearch>> getCourseLiveData() {
        return this.courseLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getData() {
        List listM39402iI;
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.O00().getString(b01.XXI0XOIX)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            listM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                listM39402iI.add(new Gson().fromJson(it.next(), RecommendSearch.class));
            }
        } catch (Exception unused) {
            listM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        if (listM39402iI.isEmpty()) {
            getRecommendSearchListList();
        } else if (getTime(listM39402iI)) {
            getRecommendSearchListList();
        } else {
            this.courseLiveData.postValue((ArrayList) listM39402iI);
        }
    }
}
