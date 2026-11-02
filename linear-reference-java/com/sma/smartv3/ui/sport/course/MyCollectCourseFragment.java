package com.sma.smartv3.ui.sport.course;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.a01;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMyCollectCourseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyCollectCourseFragment.kt\ncom/sma/smartv3/ui/sport/course/MyCollectCourseFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,30:1\n19#2:31\n15#2:32\n*S KotlinDebug\n*F\n+ 1 MyCollectCourseFragment.kt\ncom/sma/smartv3/ui/sport/course/MyCollectCourseFragment\n*L\n16#1:31\n16#1:32\n*E\n"})
public final class MyCollectCourseFragment extends MyHaveCourseFragment {
    public MyCollectCourseFragment() {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getActivity()));
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r2 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L6;
        r1 = r2;
    L6:
        AppUser r3 = (AppUser) r1;
        showData(CollectionsKt__CollectionsKt.iIiiO(new String[]{"111", "222"}));
    }
}
