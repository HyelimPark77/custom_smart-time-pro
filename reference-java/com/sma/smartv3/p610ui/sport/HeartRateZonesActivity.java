package com.sma.smartv3.p610ui.sport;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.HeartRateZonesActivity;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class HeartRateZonesActivity extends BaseActivity {

    @aa1
    private final Lazy mHeartRateZonesLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiIiI10I0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateZonesActivity.mHeartRateZonesLayout_delegate$lambda$0(this.f8592IO);
        }
    });

    @aa1
    private final Lazy mHeartRateNullLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiIO0ii1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateZonesActivity.mHeartRateNullLayout_delegate$lambda$0(this.f8581IO);
        }
    });

    @aa1
    private final Lazy mWorkoutDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiiI1I1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateZonesActivity.mWorkoutDao_delegate$lambda$0();
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.II0i0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateZonesActivity.abhTitleCenter_delegate$lambda$0(this.f1532IO);
        }
    });

    @aa1
    private final Lazy mValue1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0IIXI0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateZonesActivity.mValue1_delegate$lambda$0(this.f3959IO);
        }
    });

    @aa1
    private final Lazy mValue2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiXIX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateZonesActivity.mValue2_delegate$lambda$0(this.f2293IO);
        }
    });

    @aa1
    private final Lazy mValue3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIi01O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateZonesActivity.mValue3_delegate$lambda$0(this.f4603IO);
        }
    });

    @aa1
    private final Lazy mValue4$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0Oi0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateZonesActivity.mValue4_delegate$lambda$0(this.f4009IO);
        }
    });

    @aa1
    private final Lazy mValue5$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiXiO10XX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeartRateZonesActivity.mValue5_delegate$lambda$0(this.f5353IO);
        }
    });

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.HeartRateZonesActivity$initView$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.sport.HeartRateZonesActivity$initView$1", m39466f = "HeartRateZonesActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nHeartRateZonesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateZonesActivity.kt\ncom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
    public static final class C189571 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C189571(Continuation<? super C189571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HeartRateZonesActivity.this.new C189571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C189571) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0054  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objIiI10X;
            boolean z;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            Iterator<T> it = HeartRateZonesActivity.this.getMWorkoutDao().getList().iterator();
            while (true) {
                objIiI10X = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Workout workout = (Workout) next;
                int[] mPersonalZone = workout.getMPersonalZone();
                if ((mPersonalZone != null ? mPersonalZone.length : 0) <= 0) {
                    z = false;
                } else {
                    int[] mPersonalZone2 = workout.getMPersonalZone();
                    if (mPersonalZone2 != null) {
                        int length = mPersonalZone2.length;
                        for (int i = 0; i < length; i++) {
                            int i2 = mPersonalZone2[i];
                            if (i2 > 0) {
                                objIiI10X = Boxing.IiI10X(i2);
                                break;
                            }
                        }
                    }
                    if (objIiI10X != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    objIiI10X = next;
                    break;
                }
            }
            Workout workout2 = (Workout) objIiI10X;
            if (workout2 != null) {
                int[] mPersonalZone3 = workout2.getMPersonalZone();
                Intrinsics.XXI(mPersonalZone3);
                if (mPersonalZone3.length > 6) {
                    HeartRateZonesActivity.this.getMHeartRateZonesLayout().setVisibility(0);
                    HeartRateZonesActivity.this.getMHeartRateNullLayout().setVisibility(8);
                    HeartRateZonesActivity.this.getMValue1().setText((mPersonalZone3[5] + 1) + "~" + mPersonalZone3[6]);
                    HeartRateZonesActivity.this.getMValue2().setText((mPersonalZone3[4] + 1) + "~" + mPersonalZone3[5]);
                    HeartRateZonesActivity.this.getMValue3().setText((mPersonalZone3[3] + 1) + "~" + mPersonalZone3[4]);
                    HeartRateZonesActivity.this.getMValue4().setText((mPersonalZone3[2] + 1) + "~" + mPersonalZone3[3]);
                    HeartRateZonesActivity.this.getMValue5().setText(mPersonalZone3[1] + "~" + mPersonalZone3[2]);
                } else {
                    HeartRateZonesActivity.this.getMHeartRateZonesLayout().setVisibility(8);
                    HeartRateZonesActivity.this.getMHeartRateNullLayout().setVisibility(0);
                }
            } else {
                HeartRateZonesActivity.this.getMHeartRateZonesLayout().setVisibility(8);
                HeartRateZonesActivity.this.getMHeartRateNullLayout().setVisibility(0);
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(HeartRateZonesActivity heartRateZonesActivity) {
        return (TextView) heartRateZonesActivity.findViewById(R.id.abh_title_center);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getMHeartRateNullLayout() {
        return (View) this.mHeartRateNullLayout$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getMHeartRateZonesLayout() {
        return (View) this.mHeartRateZonesLayout$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getMValue1() {
        return (TextView) this.mValue1$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getMValue2() {
        return (TextView) this.mValue2$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getMValue3() {
        return (TextView) this.mValue3$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getMValue4() {
        return (TextView) this.mValue4$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getMValue5() {
        return (TextView) this.mValue5$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) this.mWorkoutDao$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mHeartRateNullLayout_delegate$lambda$0(HeartRateZonesActivity heartRateZonesActivity) {
        return heartRateZonesActivity.findViewById(R.id.show_heart_rate_null_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mHeartRateZonesLayout_delegate$lambda$0(HeartRateZonesActivity heartRateZonesActivity) {
        return heartRateZonesActivity.findViewById(R.id.show_heart_rate_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mValue1_delegate$lambda$0(HeartRateZonesActivity heartRateZonesActivity) {
        return (TextView) heartRateZonesActivity.findViewById(R.id.hr_value_1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mValue2_delegate$lambda$0(HeartRateZonesActivity heartRateZonesActivity) {
        return (TextView) heartRateZonesActivity.findViewById(R.id.hr_value_2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mValue3_delegate$lambda$0(HeartRateZonesActivity heartRateZonesActivity) {
        return (TextView) heartRateZonesActivity.findViewById(R.id.hr_value_3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mValue4_delegate$lambda$0(HeartRateZonesActivity heartRateZonesActivity) {
        return (TextView) heartRateZonesActivity.findViewById(R.id.hr_value_4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mValue5_delegate$lambda$0(HeartRateZonesActivity heartRateZonesActivity) {
        return (TextView) heartRateZonesActivity.findViewById(R.id.hr_value_5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setText(setTitle());
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C189571(null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_heart_rate_zones;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    @aa1
    public final String setTitle() {
        String string = getString(R.string.hr_zone);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
