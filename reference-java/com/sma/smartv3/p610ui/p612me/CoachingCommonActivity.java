package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OI001;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nCoachingCommonActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingCommonActivity.kt\ncom/sma/smartv3/ui/me/CoachingCommonActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n87#2,7:50\n94#2,3:58\n70#2,7:61\n97#2:68\n1#3:57\n*S KotlinDebug\n*F\n+ 1 CoachingCommonActivity.kt\ncom/sma/smartv3/ui/me/CoachingCommonActivity\n*L\n44#1:50,7\n44#1:58,3\n44#1:61,7\n44#1:68\n44#1:57\n*E\n"})
public final class CoachingCommonActivity extends BaseActivity {
    private final void toActivity(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", str);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) CoachingCommonSetActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.exercise_course);
    }

    public final void l1Coaching(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        toActivity("L1");
    }

    public final void l2EasyCoaching(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        toActivity(i00OI001.XIi00iiXO);
    }

    public final void l2MafCoaching(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        toActivity(i00OI001.f7277iO);
    }

    public final void l3Coaching(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        toActivity(i00OI001.XO0O10);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activiy_coaching_common_list;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
