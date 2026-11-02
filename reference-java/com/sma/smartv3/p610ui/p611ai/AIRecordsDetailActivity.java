package com.sma.smartv3.p610ui.p611ai;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.AIRecordsViewData;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.p611ai.AIRecordsDetailActivity;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIRecordsDetailActivity extends AIRecordsActivity {

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0iIXiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIRecordsDetailActivity.abhTitleRight_delegate$lambda$0(this.f7479IO);
        }
    });
    public AIRecordsViewData mAIRecordsViewData;

    public AIRecordsDetailActivity() {
        setShowItemClick(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(AIRecordsDetailActivity aIRecordsDetailActivity) {
        return (ImageView) aIRecordsDetailActivity.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    @aa1
    public final AIRecordsViewData getMAIRecordsViewData() {
        AIRecordsViewData aIRecordsViewData = this.mAIRecordsViewData;
        if (aIRecordsViewData != null) {
            return aIRecordsViewData;
        }
        Intrinsics.XXO("mAIRecordsViewData");
        return null;
    }

    @Override // com.sma.smartv3.p610ui.p611ai.AIRecordsActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.AIRecordsViewData");
        setMAIRecordsViewData((AIRecordsViewData) mArg3);
    }

    @Override // com.sma.smartv3.p610ui.p611ai.AIRecordsActivity
    @aa1
    public List<AIRecordsViewData> initList() {
        setMAdapterData(new ArrayList());
        getMAdapterData().add(getMAIRecordsViewData());
        return getMAdapterData();
    }

    @Override // com.sma.smartv3.p610ui.p611ai.AIRecordsActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        TextView textView = (TextView) findViewById(R.id.abh_title_center);
        if (textView != null) {
            textView.setText(R.string.history_record);
        }
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_clean_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
    }

    @Override // com.sma.smartv3.p610ui.p611ai.AIRecordsActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ai_records_detail;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        String string = getString(R.string.problem);
        AIRecords first = getMAIRecordsViewData().getFirst();
        String str = string + " : " + (first != null ? first.getMContent() : null);
        String string2 = getString(R.string.generate_results);
        AIRecords last = getMAIRecordsViewData().getLast();
        share(str + "\n\n" + (string2 + " : " + (last != null ? last.getMContent() : null)));
    }

    @Override // com.sma.smartv3.p610ui.p611ai.AIRecordsActivity
    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        AIRecords first = getMAIRecordsViewData().getFirst();
        Intrinsics.XXI(first);
        AIRecords last = getMAIRecordsViewData().getLast();
        Intrinsics.XXI(last);
        showDeletePopup(first, last, 0);
    }

    @Override // com.sma.smartv3.p610ui.p611ai.AIRecordsActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.sma.smartv3.p610ui.p611ai.AIRecordsActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return R.id.srf;
    }

    public final void setMAIRecordsViewData(@aa1 AIRecordsViewData aIRecordsViewData) {
        Intrinsics.X0O(aIRecordsViewData, "<set-?>");
        this.mAIRecordsViewData = aIRecordsViewData;
    }
}
