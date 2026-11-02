package com.sma.smartv3.ui.sport;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.II0i0X;
import com.android.mltcode.paycertificationapi.IiXIX0;
import com.android.mltcode.paycertificationapi.OiiI1I1;
import com.android.mltcode.paycertificationapi.X0IIXI0i;
import com.android.mltcode.paycertificationapi.X0Oi0;
import com.android.mltcode.paycertificationapi.XIi01O;
import com.android.mltcode.paycertificationapi.XiXiO10XX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iiIO0ii1;
import com.android.mltcode.paycertificationapi.iiIiI10I0;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Workout;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class HeartRateZonesActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy mHeartRateNullLayout$delegate;

    @aa1
    private final Lazy mHeartRateZonesLayout$delegate;

    @aa1
    private final Lazy mValue1$delegate;

    @aa1
    private final Lazy mValue2$delegate;

    @aa1
    private final Lazy mValue3$delegate;

    @aa1
    private final Lazy mValue4$delegate;

    @aa1
    private final Lazy mValue5$delegate;

    @aa1
    private final Lazy mWorkoutDao$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.HeartRateZonesActivity$initView$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.sport.HeartRateZonesActivity$initView$1", f = "HeartRateZonesActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nHeartRateZonesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateZonesActivity.kt\ncom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ HeartRateZonesActivity this$0;

        public AnonymousClass1(HeartRateZonesActivity r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass1(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r10) {
            pb.I0iXXO();
            if (this.label != 0) goto L38;
            ResultKt.X1ii(r10);
            Iterator<T> r11 = HeartRateZonesActivity.access$getMWorkoutDao(this.this$0).getList().iterator();
        L5:
            Object r1 = null;
            if (r11.hasNext() == false) goto L28;
            Object r0 = r11.next();
            Workout r4 = (Workout) r0;
            int[] r5 = r4.getMPersonalZone();
            if (r5 == null) goto L10;
            int r6 = r5.length;
        L11:
            if (r6 <= 0) goto L25;
            int[] r7 = r4.getMPersonalZone();
            if (r7 == null) goto L23;
            int r8 = r7.length;
            int r9 = 0;
        L15:
            if (r9 >= r8) goto L23;
            int r12 = r7[r9];
            if (r12 <= 0) goto L19;
            boolean r13 = true;
        L20:
            if (r13 == true) goto L21;
            r9 = r9 + 1;
            goto L15
        L21:
            r1 = Boxing.IiI10X(r12);
            goto L23
        L19:
            r13 = false;
        L23:
            if (r1 == null) goto L25;
            boolean r2 = true;
        L26:
            if (r2 == false) goto L5;
            r1 = r0;
        L25:
            r2 = false;
            goto L26
        L10:
            r6 = 0;
        L28:
            Workout r3 = (Workout) r1;
            if (r3 == null) goto L34;
            int[] r14 = r3.getMPersonalZone();
            Intrinsics.XXI(r14);
            if (r14.length <= 6) goto L33;
            HeartRateZonesActivity.access$getMHeartRateZonesLayout(this.this$0).setVisibility(0);
            HeartRateZonesActivity.access$getMHeartRateNullLayout(this.this$0).setVisibility(8);
            HeartRateZonesActivity.access$getMValue1(this.this$0).setText((r14[5] + 1) + "~" + r14[6]);
            HeartRateZonesActivity.access$getMValue2(this.this$0).setText((r14[4] + 1) + "~" + r14[5]);
            HeartRateZonesActivity.access$getMValue3(this.this$0).setText((r14[3] + 1) + "~" + r14[4]);
            HeartRateZonesActivity.access$getMValue4(this.this$0).setText((r14[2] + 1) + "~" + r14[3]);
            HeartRateZonesActivity.access$getMValue5(this.this$0).setText(r14[1] + "~" + r14[2]);
        L36:
            return Unit.OXO1;
        L33:
            HeartRateZonesActivity.access$getMHeartRateZonesLayout(this.this$0).setVisibility(8);
            HeartRateZonesActivity.access$getMHeartRateNullLayout(this.this$0).setVisibility(0);
            goto L36
        L34:
            HeartRateZonesActivity.access$getMHeartRateZonesLayout(this.this$0).setVisibility(8);
            HeartRateZonesActivity.access$getMHeartRateNullLayout(this.this$0).setVisibility(0);
            goto L36
        L38:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public HeartRateZonesActivity() {
        this.mHeartRateZonesLayout$delegate = LazyKt__LazyJVMKt.iO(new iiIiI10I0(this));
        this.mHeartRateNullLayout$delegate = LazyKt__LazyJVMKt.iO(new iiIO0ii1(this));
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.iO(new OiiI1I1());
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new II0i0X(this));
        this.mValue1$delegate = LazyKt__LazyJVMKt.iO(new X0IIXI0i(this));
        this.mValue2$delegate = LazyKt__LazyJVMKt.iO(new IiXIX0(this));
        this.mValue3$delegate = LazyKt__LazyJVMKt.iO(new XIi01O(this));
        this.mValue4$delegate = LazyKt__LazyJVMKt.iO(new X0Oi0(this));
        this.mValue5$delegate = LazyKt__LazyJVMKt.iO(new XiXiO10XX(this));
    }

    public static /* synthetic */ View I0iXXO(HeartRateZonesActivity r0) {
        return mHeartRateZonesLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(HeartRateZonesActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IIX1OXO(HeartRateZonesActivity r0) {
        return mValue3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O10IXXX0X(HeartRateZonesActivity r0) {
        return mHeartRateNullLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ WorkoutDao OIX0iXi() {
        return mWorkoutDao_delegate$lambda$0();
    }

    public static /* synthetic */ TextView X0O(HeartRateZonesActivity r0) {
        return mValue2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(HeartRateZonesActivity r0) {
        return mValue1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(HeartRateZonesActivity r0) {
        return mValue5_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(HeartRateZonesActivity r0) {
        return mValue4_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(HeartRateZonesActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ View access$getMHeartRateNullLayout(HeartRateZonesActivity r0) {
        return r0.getMHeartRateNullLayout();
    }

    public static final /* synthetic */ View access$getMHeartRateZonesLayout(HeartRateZonesActivity r0) {
        return r0.getMHeartRateZonesLayout();
    }

    public static final /* synthetic */ TextView access$getMValue1(HeartRateZonesActivity r0) {
        return r0.getMValue1();
    }

    public static final /* synthetic */ TextView access$getMValue2(HeartRateZonesActivity r0) {
        return r0.getMValue2();
    }

    public static final /* synthetic */ TextView access$getMValue3(HeartRateZonesActivity r0) {
        return r0.getMValue3();
    }

    public static final /* synthetic */ TextView access$getMValue4(HeartRateZonesActivity r0) {
        return r0.getMValue4();
    }

    public static final /* synthetic */ TextView access$getMValue5(HeartRateZonesActivity r0) {
        return r0.getMValue5();
    }

    public static final /* synthetic */ WorkoutDao access$getMWorkoutDao(HeartRateZonesActivity r0) {
        return r0.getMWorkoutDao();
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final View getMHeartRateNullLayout() {
        return (View) getValue();
    }

    private final View getMHeartRateZonesLayout() {
        return (View) getValue();
    }

    private final TextView getMValue1() {
        return (TextView) getValue();
    }

    private final TextView getMValue2() {
        return (TextView) getValue();
    }

    private final TextView getMValue3() {
        return (TextView) getValue();
    }

    private final TextView getMValue4() {
        return (TextView) getValue();
    }

    private final TextView getMValue5() {
        return (TextView) getValue();
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) getValue();
    }

    private static final View mHeartRateNullLayout_delegate$lambda$0(HeartRateZonesActivity r1) {
        return r1.findViewById(R.id.show_heart_rate_null_ll);
    }

    private static final View mHeartRateZonesLayout_delegate$lambda$0(HeartRateZonesActivity r1) {
        return r1.findViewById(R.id.show_heart_rate_ll);
    }

    private static final TextView mValue1_delegate$lambda$0(HeartRateZonesActivity r1) {
        return (TextView) r1.findViewById(R.id.hr_value_1);
    }

    private static final TextView mValue2_delegate$lambda$0(HeartRateZonesActivity r1) {
        return (TextView) r1.findViewById(R.id.hr_value_2);
    }

    private static final TextView mValue3_delegate$lambda$0(HeartRateZonesActivity r1) {
        return (TextView) r1.findViewById(R.id.hr_value_3);
    }

    private static final TextView mValue4_delegate$lambda$0(HeartRateZonesActivity r1) {
        return (TextView) r1.findViewById(R.id.hr_value_4);
    }

    private static final TextView mValue5_delegate$lambda$0(HeartRateZonesActivity r1) {
        return (TextView) r1.findViewById(R.id.hr_value_5);
    }

    private static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(setTitle());
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(this, null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_heart_rate_zones;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    @aa1
    public final String setTitle() {
        String r0 = getString(R.string.hr_zone);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
