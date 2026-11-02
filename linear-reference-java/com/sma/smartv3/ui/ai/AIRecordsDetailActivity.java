package com.sma.smartv3.ui.ai;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i0iIXiI;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.AIRecordsViewData;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIRecordsDetailActivity extends AIRecordsActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;
    public AIRecordsViewData mAIRecordsViewData;

    public AIRecordsDetailActivity() {
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new i0iIXiI(this));
        setShowItemClick(false);
    }

    public static /* synthetic */ ImageView XiOIii1(AIRecordsDetailActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(AIRecordsDetailActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @aa1
    public final AIRecordsViewData getMAIRecordsViewData() {
        AIRecordsViewData r0 = this.mAIRecordsViewData;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mAIRecordsViewData");
        return null;
    }

    @Override // com.sma.smartv3.ui.ai.AIRecordsActivity, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.model.AIRecordsViewData");
        setMAIRecordsViewData((AIRecordsViewData) r3);
    }

    @Override // com.sma.smartv3.ui.ai.AIRecordsActivity
    @aa1
    public List<AIRecordsViewData> initList() {
        setMAdapterData(new ArrayList());
        getMAdapterData().add(getMAIRecordsViewData());
        return getMAdapterData();
    }

    @Override // com.sma.smartv3.ui.ai.AIRecordsActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        if (r0 == null) goto L5;
        r0.setText(R.string.history_record);
    L5:
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_clean_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
    }

    @Override // com.sma.smartv3.ui.ai.AIRecordsActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_ai_records_detail;
    }

    public final void onBottomClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        String r6 = getString(R.string.problem);
        AIRecords r0 = getMAIRecordsViewData().getFirst();
        String r1 = null;
        if (r0 == null) goto L5;
        String r2 = r0.getMContent();
    L6:
        String r3 = r6 + " : " + r2;
        String r4 = getString(R.string.generate_results);
        AIRecords r7 = getMAIRecordsViewData().getLast();
        if (r7 == null) goto L9;
        r1 = r7.getMContent();
    L9:
        share(r3 + "\n\n" + (r4 + " : " + r1));
        return;
    L5:
        r2 = null;
        goto L6
    }

    @Override // com.sma.smartv3.ui.ai.AIRecordsActivity
    public void onTitleRightClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        AIRecords r4 = getMAIRecordsViewData().getFirst();
        Intrinsics.XXI(r4);
        AIRecords r0 = getMAIRecordsViewData().getLast();
        Intrinsics.XXI(r0);
        showDeletePopup(r4, r0, 0);
    }

    @Override // com.sma.smartv3.ui.ai.AIRecordsActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.sma.smartv3.ui.ai.AIRecordsActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return R.id.srf;
    }

    public final void setMAIRecordsViewData(@aa1 AIRecordsViewData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAIRecordsViewData = r2;
    }
}
