package com.sma.smartv3.p610ui.sport.course;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class MyExerciseCourseFragment extends MyHaveCourseFragment {
    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getActivity()));
        showData(CollectionsKt__CollectionsKt.iIiiO("111", "222", "222", "333"));
    }
}
