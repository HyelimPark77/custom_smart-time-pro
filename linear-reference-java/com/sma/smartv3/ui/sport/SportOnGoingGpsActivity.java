package com.sma.smartv3.ui.sport;

import android.content.Intent;
import android.os.Bundle;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportOnGoingGpsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportOnGoingGpsActivity.kt\ncom/sma/smartv3/ui/sport/SportOnGoingGpsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n87#2,7:23\n94#2,3:31\n70#2,7:34\n97#2:41\n1#3:30\n*S KotlinDebug\n*F\n+ 1 SportOnGoingGpsActivity.kt\ncom/sma/smartv3/ui/sport/SportOnGoingGpsActivity\n*L\n13#1:23,7\n13#1:31,3\n13#1:34,7\n13#1:41\n13#1:30\n*E\n"})
public final class SportOnGoingGpsActivity extends BaseSportOnGoingActivity {
    public SportOnGoingGpsActivity() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        if (q62.OXO1.X0OXOI() == false) goto L6;
        int r6 = getMArg1();
        Serializable r0 = getMArg3();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", null);
        r1.putInt("mArg1", r6);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r0);
        Intent r7 = new Intent(this, ShowProgressSportActivity.class);
        r7.putExtras(r1);
        startActivity(r7);
        finish();
        return;
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
    }
}
