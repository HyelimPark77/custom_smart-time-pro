package com.sma.smartv3.p610ui.sport;

import android.content.Intent;
import android.os.Bundle;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportOnGoingGpsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportOnGoingGpsActivity.kt\ncom/sma/smartv3/ui/sport/SportOnGoingGpsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n87#2,7:23\n94#2,3:31\n70#2,7:34\n97#2:41\n1#3:30\n*S KotlinDebug\n*F\n+ 1 SportOnGoingGpsActivity.kt\ncom/sma/smartv3/ui/sport/SportOnGoingGpsActivity\n*L\n13#1:23,7\n13#1:31,3\n13#1:34,7\n13#1:41\n13#1:30\n*E\n"})
public final class SportOnGoingGpsActivity extends BaseSportOnGoingActivity {
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        if (q62.OXO1.X0OXOI()) {
            int mArg1 = getMArg1();
            Serializable mArg3 = getMArg3();
            Bundle bundle2 = new Bundle();
            bundle2.putString("mArg0", null);
            bundle2.putInt("mArg1", mArg1);
            bundle2.putParcelable("mArg2", null);
            bundle2.putSerializable("mArg3", mArg3);
            Intent intent = new Intent(this, (Class<?>) ShowProgressSportActivity.class);
            intent.putExtras(bundle2);
            startActivity(intent);
            finish();
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
    }
}
