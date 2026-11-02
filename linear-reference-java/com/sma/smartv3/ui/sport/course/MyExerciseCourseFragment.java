package com.sma.smartv3.ui.sport.course;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class MyExerciseCourseFragment extends MyHaveCourseFragment {
    public MyExerciseCourseFragment() {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getActivity()));
        showData(CollectionsKt__CollectionsKt.iIiiO(new String[]{"111", "222", "222", "333"}));
    }
}
