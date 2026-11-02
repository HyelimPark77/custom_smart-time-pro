package com.sma.smartv3.ui.sport.course.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.android.mltcode.paycertificationapi.OIOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.CourseManager;
import com.sma.smartv3.model.RecommendSearch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseViewModel.kt\ncom/sma/smartv3/ui/sport/course/model/CourseViewModel\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n50#2,3:58\n53#2:64\n55#2,2:66\n1563#3:61\n1634#3,2:62\n1636#3:65\n*S KotlinDebug\n*F\n+ 1 CourseViewModel.kt\ncom/sma/smartv3/ui/sport/course/model/CourseViewModel\n*L\n22#1:58,3\n22#1:64\n22#1:66,2\n22#1:61\n22#1:62,2\n22#1:65\n*E\n"})
public final class CourseViewModel extends ViewModel {

    @aa1
    private final MutableLiveData<ArrayList<RecommendSearch>> courseLiveData;

    public CourseViewModel() {
        this.courseLiveData = new MutableLiveData();
    }

    public static /* synthetic */ Unit OXO1(CourseViewModel r0, RecommendSearch[] r1) {
        return getRecommendSearchListList$lambda$0(r0, r1);
    }

    private final void getRecommendSearchListList() {
        CourseManager.OXO1.I1XOi1("INDEX", new OIOO(this));
    }

    private static final Unit getRecommendSearchListList$lambda$0(CourseViewModel r0, RecommendSearch[] r1) {
        if (r1 == null) goto L5;
        List r2 = ArraysKt___ArraysKt.OXI0X0(r1);
        r0.courseLiveData.postValue((ArrayList) r2);
    L5:
        return Unit.OXO1;
    }

    private final boolean getTime(List<RecommendSearch> r6) {
        long r1 = r6.get(0).getOnCreateTime();
        if ((System.currentTimeMillis() - r1) <= 86400000) goto L6;
        return true;
    L6:
        return false;
    }

    @aa1
    public final MutableLiveData<ArrayList<RecommendSearch>> getCourseLiveData() {
        return this.courseLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getData() {
        JsonArray r0 = JsonParser.parseString(a01.OXO1.O00().getString(b01.XXI0XOIX)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r0);     // Catch: Exception -> L8
        List r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r2 = r0.iterator();     // Catch: Exception -> L8
    L5:
        if (r2.hasNext() == false) goto L10;
        JsonElement r3 = r2.next();     // Catch: Exception -> L8
        r1.add(new Gson().fromJson(r3, RecommendSearch.class));     // Catch: Exception -> L8
    L10:
        if (r1.isEmpty() == false) goto L12;
        getRecommendSearchListList();
        return;
    L12:
        if (getTime(r1) == false) goto L14;
        getRecommendSearchListList();
        return;
    L14:
        postValue((ArrayList) r1);
        return;
    L8:
        r1 = CollectionsKt__CollectionsKt.iI();
        goto L10
    }
}
