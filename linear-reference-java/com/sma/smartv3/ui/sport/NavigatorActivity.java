package com.sma.smartv3.ui.sport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a51;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b51;
import com.android.mltcode.paycertificationapi.c51;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.d51;
import com.android.mltcode.paycertificationapi.e51;
import com.android.mltcode.paycertificationapi.f51;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uf1;
import com.android.mltcode.paycertificationapi.y41;
import com.android.mltcode.paycertificationapi.z41;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.facebook.internal.security.CertificateUtil;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.NavigatorData;
import com.sma.smartv3.model.NavigatorItem;
import com.sma.smartv3.model.NavigatorMoonItem;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.DeviceItemDecoration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavigatorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorActivity.kt\ncom/sma/smartv3/ui/sport/NavigatorActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,390:1\n19#2:391\n15#2:392\n1869#3,2:393\n1869#3,2:395\n*S KotlinDebug\n*F\n+ 1 NavigatorActivity.kt\ncom/sma/smartv3/ui/sport/NavigatorActivity\n*L\n58#1:391\n58#1:392\n135#1:393,2\n384#1:395,2\n*E\n"})
public final class NavigatorActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private List<NavigatorItem> dataList;

    @aa1
    private final AppUser userProfile;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ TextView I0IIOi;
        public final /* synthetic */ TextView IO;
        public final /* synthetic */ Ref.IntRef IiI10X;
        public final /* synthetic */ TextView O00;
        public final /* synthetic */ TextView OIi0;
        public final /* synthetic */ String[] OXO1;
        public final /* synthetic */ TextView XIi00iiXO;
        public final /* synthetic */ LineChart XO0O10;
        public final /* synthetic */ Workout XOO0ii0;
        public final /* synthetic */ NavigatorActivity iO;

        public OXO1(String[] r1, TextView r2, NavigatorActivity r3, LineChart r4, TextView r5, Ref.IntRef r6, Workout r7, TextView r8, TextView r9, TextView r10) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
            this.iO = r3;
            this.XO0O10 = r4;
            this.O00 = r5;
            this.IiI10X = r6;
            this.XOO0ii0 = r7;
            this.I0IIOi = r8;
            this.OIi0 = r9;
            this.IO = r10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [com.android.mltcode.paycertificationapi.iII0X010, com.github.mikephil.charting.data.Entry] */
        /* JADX WARN: Type inference failed for: r6v2, types: [com.android.mltcode.paycertificationapi.iII0X010, com.github.mikephil.charting.data.Entry] */
        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r6, X110O r7) {
            Intrinsics.X0O(r6, "e");
            Intrinsics.X0O(r7, "h");
            int r8 = (int) r6.OIX0iXi();
            String[] r0 = this.OXO1;
            if (r8 <= r0.length) goto L5;
            int r9 = r0.length - 1;
        L6:
            TextView r1 = this.XIi00iiXO;
            if (r1 == null) goto L9;
            r1.setText(this.iO.formatMonthDay(this.OXO1[r9]));
        L9:
            float r10 = r6.OIX0iXi();
            T r11 = getData();
            Intrinsics.X1ii(r11, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineData");
            co r12 = (co) r11;
            T r2 = r12.OIX0iXi(0);
            Intrinsics.X1ii(r2, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            ?? r3 = ((LineDataSet) r2).iI0I(r10, Float.NaN);
            T r13 = r12.OIX0iXi(1);
            Intrinsics.X1ii(r13, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            ?? r14 = ((LineDataSet) r13).iI0I(r10, Float.NaN);
            float r15 = Math.abs(r14.O00() - r3.O00());
            TextView r4 = this.O00;
            String r5 = "";
            if (r4 == null) goto L12;
            r4.setText("");
        L12:
            int r16 = this.IiI10X.element;
            if (r16 == 0) goto L20;
            if (r16 == 1) goto L17;
            String r17 = "";
            String r18 = r17;
        L21:
            TextView r19 = this.I0IIOi;
            if (r19 == null) goto L24;
            r19.setText(this.iO.getString(R.string.goal) + CertificateUtil.DELIMITER + r5);
        L24:
            TextView r20 = this.OIi0;
            if (r20 == null) goto L27;
            r20.setText(this.iO.getString(R.string.actual) + CertificateUtil.DELIMITER + r17);
        L27:
            TextView r21 = this.IO;
            if (r21 == null) goto L31;
            r21.setText(this.iO.getString(R.string.disparity) + CertificateUtil.DELIMITER + r18);
            return;
        L31:
            return;
        L17:
            if (this.XOO0ii0.getMMode() != 10) goto L19;
            r5 = String.valueOf(cp5.XXiIiX10(r3.O00(), NavigatorActivity.access$getUserProfile$p(this.iO).getUnit()));
            r17 = String.valueOf(cp5.XXiIiX10(r14.O00(), NavigatorActivity.access$getUserProfile$p(this.iO).getUnit()));
            r18 = String.valueOf(cp5.XXiIiX10(r15, NavigatorActivity.access$getUserProfile$p(this.iO).getUnit()));
            goto L21
        L19:
            r5 = String.valueOf(cp5.Ii1iii0((int) r3.O00(), NavigatorActivity.access$getUserProfile$p(this.iO).getUnit()));
            r17 = String.valueOf(cp5.Ii1iii0((int) r14.O00(), NavigatorActivity.access$getUserProfile$p(this.iO).getUnit()));
            r18 = String.valueOf(cp5.Ii1iii0((int) r15, NavigatorActivity.access$getUserProfile$p(this.iO).getUnit()));
            goto L21
        L20:
            r5 = O0X11OiO.OX110i((int) r3.O00());
            r17 = O0X11OiO.OX110i((int) r14.O00());
            r18 = O0X11OiO.OX110i((int) r15);
            goto L21
        L5:
            r9 = (int) r6.OIX0iXi();
            goto L6
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public static final class XIi00iiXO extends q4 {
        public final /* synthetic */ Ref.IntRef iO;

        public XIi00iiXO(Ref.IntRef r1) {
            this.iO = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float r2) {
            if (this.iO.element != 0) goto L7;
            return O0X11OiO.OX110i((int) r2);
        L7:
            return String.valueOf(r2);
        }
    }

    public static final class iO extends q4 {
        public final /* synthetic */ NavigatorActivity XO0O10;
        public final /* synthetic */ Ref.IntRef iO;

        public iO(Ref.IntRef r1, NavigatorActivity r2) {
            this.iO = r1;
            this.XO0O10 = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float r2) {
            if (this.iO.element != 0) goto L7;
            return O0X11OiO.OX110i((int) r2);
        L7:
            return cp5.Ii1iii0((int) r2, NavigatorActivity.access$getUserProfile$p(this.XO0O10).getUnit());
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.NavigatorActivity$onRefresh$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.sport.NavigatorActivity$onRefresh$1", f = "NavigatorActivity.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NavigatorActivity this$0;

        public AnonymousClass1(NavigatorActivity r1, Continuation<? super AnonymousClass1> r2) {
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
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L11:
            NavigatorActivity.access$showData(this.this$0);
            this.this$0.getRefreshLayout().setRefreshing(false);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            this.label = 1;
            if (DelayKt.XIi00iiXO(1200, this) != r0) goto L11;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.NavigatorActivity$showData$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.sport.NavigatorActivity$showData$1", f = "NavigatorActivity.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34841 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ NavigatorActivity this$0;

        public C34841(NavigatorActivity r1, Continuation<? super C34841> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        public static /* synthetic */ Unit I0IIOi(NavigatorActivity r0) {
            return invokeSuspend$lambda$0$0(r0);
        }

        public static /* synthetic */ Unit IiI10X(NavigatorActivity r0, DslAdapter r1) {
            return invokeSuspend$lambda$0(r0, r1);
        }

        public static /* synthetic */ Unit O00(NavigatorActivity r0, DslAdapter r1) {
            return invokeSuspend$lambda$0$0$0(r0, r1);
        }

        private static final Unit invokeSuspend$lambda$0(final NavigatorActivity r2, DslAdapter r3) {
            r3.clearAllItems();
            DslAdapter.setAdapterStatus$default(r3, 2, null, 2, null);
            r3.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.navigator_empty_layout));
            r2.getDslViewHolder().post(new com.sma.smartv3.ui.sport.OXO1(r2));
            return Unit.OXO1;
        }

        private static final Unit invokeSuspend$lambda$0$0(final NavigatorActivity r1) {
            r1.renderAdapter(new com.sma.smartv3.ui.sport.iO(r1));
            return Unit.OXO1;
        }

        private static final Unit invokeSuspend$lambda$0$0$0(NavigatorActivity r4, DslAdapter r5) {
            DslAdapter.setAdapterStatus$default(r5, 0, null, 2, null);
            if (NavigatorActivity.access$getDataList$p(r4).isEmpty() == false) goto L5;
            DslAdapter.setAdapterStatus$default(r4.getDslAdapter(), 1, null, 2, null);
        L7:
            return Unit.OXO1;
        L5:
            NavigatorActivity.access$findData(r4, r5, NavigatorActivity.access$getDataList$p(r4));
            r5.setLoadMoreEnable(false);
            goto L7
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34841(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34841) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            NavigatorActivity r2 = (NavigatorActivity) this.L$0;
            ResultKt.X1ii(r4);
        L12:
            NavigatorActivity.access$setDataList$p(r2, CollectionsKt___CollectionsKt.OO0Oi10((Collection) r4));
            final NavigatorActivity r5 = this.this$0;
            r5.renderAdapter(new com.sma.smartv3.ui.sport.XIi00iiXO(r5));
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            NavigatorActivity r6 = this.this$0;
            NavigatorData r3 = NavigatorData.INSTANCE;
            this.L$0 = r6;
            this.label = 1;
            Object r7 = r3.getNavigatorData(this);
            if (r7 != r0) goto L11;
            return r0;
        L11:
            r2 = r6;
            r4 = r7;
            goto L12
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public NavigatorActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new y41(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new z41(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        this.dataList = new ArrayList();
    }

    public static /* synthetic */ void I0iXXO(Ref.IntRef r0, NavigatorActivity r1, TextView r2, TextView r3, TextView r4, TextView r5, NavigatorItem r6, TextView r7, TextView r8, TextView r9, TextView r10, TextView r11, LineChart r12, View r13) {
        initItemView$lambda$3(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    }

    public static /* synthetic */ Unit I1XOi1(NavigatorActivity r0, DslAdapterItem r1) {
        return findData$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ TextView IIX1OXO(NavigatorActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void O10IXXX0X(View r0) {
        initItemView$lambda$2(r0);
    }

    public static /* synthetic */ ImageView X0O(NavigatorActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(NavigatorActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return findData$lambda$0$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ void XXI(View r0) {
        initItemView$lambda$1(r0);
    }

    public static /* synthetic */ void XiOIO(Ref.IntRef r0, NavigatorActivity r1, TextView r2, TextView r3, TextView r4, TextView r5, NavigatorItem r6, TextView r7, TextView r8, TextView r9, TextView r10, TextView r11, LineChart r12, View r13) {
        initItemView$lambda$4(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(NavigatorActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(NavigatorActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ void access$findData(NavigatorActivity r0, DslAdapter r1, List r2) {
        r0.findData(r1, r2);
    }

    public static final /* synthetic */ List access$getDataList$p(NavigatorActivity r0) {
        return r0.dataList;
    }

    public static final /* synthetic */ AppUser access$getUserProfile$p(NavigatorActivity r0) {
        return r0.userProfile;
    }

    public static final /* synthetic */ void access$setDataList$p(NavigatorActivity r0, List r1) {
        r0.dataList = r1;
    }

    public static final /* synthetic */ void access$showData(NavigatorActivity r0) {
        r0.showData();
    }

    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
    private final void findData(DslAdapter r3, List<NavigatorItem> r4) {
        Iterator<T> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        NavigatorItem r0 = (NavigatorItem) r5.next();
        DslAdapterExKt.O10IXXX0X(r3, R.layout.item_sport_navigator_record, new f51(this));
        goto L4
    }

    private static final Unit findData$lambda$0$0(final NavigatorActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new a51(r1));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0$0(NavigatorActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        r1.initItemView(r2, r3);
        return Unit.OXO1;
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final void initItemView(DslViewHolder r21, int r22) {
        final NavigatorItem r11 = this.dataList.get(r22);
        Workout r7 = r11.getMLastWorkout();
        String r1 = q62.OXO1.i01OOiI(r7.getMMode());
        TextView r3 = r21.tv(R.id.item_mode_name);
        if (r3 == null) goto L5;
        r3.setText(r1);
    L5:
        TextView r4 = r21.tv(R.id.item_leading_num);
        if (r4 == null) goto L8;
        r4.setText(String.valueOf(r11.getMLeadingNum()));
    L8:
        TextView r5 = r21.tv(R.id.item_flat_num);
        if (r5 == null) goto L11;
        r5.setText(String.valueOf(r11.getMFlatNum()));
    L11:
        TextView r6 = r21.tv(R.id.item_backward_num);
        if (r6 == null) goto L14;
        r6.setText(String.valueOf(r11.getMBackWard()));
    L14:
        TextView r8 = r21.tv(R.id.record_sports_title);
        if (r8 == null) goto L17;
        r8.setText(r1);
    L17:
        ImageView r2 = r21.img(R.id.record_sports_icon);
        if (r2 == null) goto L20;
        RequestManager r9 = Glide.with(r2.getContext());
        Context r10 = r2.getContext();
        Intrinsics.O10IXXX0X(r10, "getContext(...)");
        SportRecordData r12 = new SportRecordData();
        r12.setMMode(r7.getMMode());
        Unit r13 = Unit.OXO1;
        r9.load(Integer.valueOf(SportRecordDataKt.getWorkoutImage(r10, r12))).into(r2);
    L20:
        View r14 = r21.v(R.id.item_list_record_more);
        if (r14 == null) goto L23;
        r14.setOnClickListener(new b51());
    L23:
        View r15 = r21.v(R.id.item_last_record);
        if (r15 == null) goto L26;
        r15.setOnClickListener(new c51());
    L26:
        TextView r16 = (TextView) r21.v(R.id.item_leading_mon);
        TextView r17 = (TextView) r21.v(R.id.item_flat_mon);
        TextView r18 = (TextView) r21.v(R.id.item_backward_mon);
        TextView r19 = (TextView) r21.v(R.id.item_lin_chart_record_time);
        TextView r20 = (TextView) r21.v(R.id.item_lin_chart_record_type);
        TextView r23 = (TextView) r21.v(R.id.item_lin_chart_record_target);
        final TextView r24 = (TextView) r21.v(R.id.item_lin_chart_record_actual);
        final TextView r25 = (TextView) r21.v(R.id.item_lin_chart_record_difference);
        View r26 = r21.v(R.id.line_chart);
        Intrinsics.XXI(r26);
        LineChart r27 = (LineChart) r26;
        iO1Xi1X1i r110 = iO1Xi1X1i.OXO1;
        String[] r28 = r110.XO0O10(r27, this);
        final TextView r111 = (TextView) r21.v(R.id.item_time_tv);
        TextView r112 = (TextView) r21.v(R.id.item_speed_tv);
        Ref.IntRef r29 = new Ref.IntRef();
        if (r20 == null) goto L29;
        r20.setText("");
    L29:
        r27.setOnChartValueSelectedListener(new OXO1(r28, r19, this, r27, r20, r29, r7, r23, r24, r25));
        setMonthSelectedType(r20, r23, r24, r25);
        int r30 = r29.element;
        final TextView r31 = r16;
        final TextView r32 = r17;
        setSelectedMonthData(r30, r11, r111, r112, r31, r32, r18, r27);
        if (r111 == null) goto L32;
        final TextView r33 = r20;
        final TextView r34 = r112;
        final TextView r113 = r18;
        final Ref.IntRef r35 = r29;
        final LineChart r114 = r27;
        final TextView r36 = r23;
        View.OnClickListener r0 = new d51(r35, this, r33, r36, r24, r25, r11, r111, r34, r31, r32, r113, r114);
        TextView r37 = r24;
        r31 = r31;
        TextView r115 = r25;
        r32 = r32;
        r111.setOnClickListener(r0);
    L33:
        if (r34 == null) goto L35;
        final TextView r116 = r37;
        final TextView r38 = r115;
        final TextView r117 = r31;
        final TextView r118 = r32;
        final NavigatorActivity r39 = this;
        r34.setOnClickListener(new e51(r35, r39, r33, r36, r116, r38, r11, r111, r34, r117, r118, r113, r114));
    L36:
        boolean r40 = false;
        if (r7.getMMode() != 10) goto L41;
        if (r34 == null) goto L40;
        r34.setText(r39.getString(R.string.speed));
    L40:
        r114.getAxisLeft().X1OI(false);
        r114.getAxisLeft().Oi(new XIi00iiXO(r35));
    L47:
        r110.O00(r114, r28);
        return;
    L41:
        if (r34 == null) goto L43;
        r34.setText(r39.getString(R.string.pace));
    L43:
        YAxis r41 = r114.getAxisLeft();
        if (r35.element == 0) goto L46;
        r40 = true;
    L46:
        r41.X1OI(r40);
        r114.getAxisLeft().Oi(new iO(r35, r39));
        goto L47
    L35:
        r39 = this;
        goto L36
    L32:
        r113 = r18;
        r35 = r29;
        r114 = r27;
        r36 = r23;
        r115 = r25;
        r33 = r20;
        r34 = r112;
        r37 = r24;
        goto L33
    }

    private static final void initItemView$lambda$1(View r0) {
    }

    private static final void initItemView$lambda$2(View r0) {
    }

    private static final void initItemView$lambda$3(Ref.IntRef r0, NavigatorActivity r1, TextView r2, TextView r3, TextView r4, TextView r5, NavigatorItem r6, TextView r7, TextView r8, TextView r9, TextView r10, TextView r11, LineChart r12, View r13) {
        r0.element = 0;
        r1.setMonthSelectedType(r2, r3, r4, r5);
        r1.setSelectedMonthData(r0.element, r6, r7, r8, r9, r10, r11, r12);
    }

    private static final void initItemView$lambda$4(Ref.IntRef r0, NavigatorActivity r1, TextView r2, TextView r3, TextView r4, TextView r5, NavigatorItem r6, TextView r7, TextView r8, TextView r9, TextView r10, TextView r11, LineChart r12, View r13) {
        r0.element = 1;
        r1.setMonthSelectedType(r2, r3, r4, r5);
        r1.setSelectedMonthData(r0.element, r6, r7, r8, r9, r10, r11, r12);
    }

    private final void setMonthSelectedType(TextView r5, TextView r6, TextView r7, TextView r8) {
        if (r6 == null) goto L5;
        r6.setText(getString(R.string.goal) + CertificateUtil.DELIMITER + getString(R.string.data_none));
    L5:
        if (r7 == null) goto L7;
        r7.setText(getString(R.string.actual) + CertificateUtil.DELIMITER + getString(R.string.data_none));
    L7:
        if (r8 == null) goto L10;
        r8.setText(getString(R.string.disparity) + CertificateUtil.DELIMITER + getString(R.string.data_none));
        return;
    }

    private final void setSelectedMonthData(int r4, NavigatorItem r5, TextView r6, TextView r7, TextView r8, TextView r9, TextView r10, LineChart r11) {
        NavigatorMoonItem r12 = r5.getMNavigatorMoonItem().get(r4);
        if (r6 == null) goto L6;
        r6.setBackground(ContextCompat.getDrawable(getMContext(), R.drawable.shape_edit_8_stroke));
    L6:
        if (r6 == null) goto L8;
        r6.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(getMContext(), R.color.text_color)));
    L8:
        if (r7 == null) goto L10;
        r7.setBackground(ContextCompat.getDrawable(getMContext(), R.drawable.shape_edit_8_stroke));
    L10:
        if (r7 == null) goto L12;
        r7.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(getMContext(), R.color.text_color)));
    L12:
        if (r8 == null) goto L14;
        r8.setText(String.valueOf(r12.getMLeadingNum()));
    L14:
        if (r9 == null) goto L16;
        r9.setText(String.valueOf(r12.getMFlatNum()));
    L16:
        if (r10 == null) goto L19;
        r10.setText(String.valueOf(r12.getMBackWard()));
    L19:
        if (r4 != 0) goto L21;
        if (r6 == null) goto L31;
        r6.setBackground(ContextCompat.getDrawable(getMContext(), R.drawable.shape_nav_8_stroke_selected));
    L31:
        if (r6 == null) goto L33;
        r6.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(getMContext(), R.color.light_blue_tv_color)));
    L33:
        updateLineChartData(r11, r12);
        return;
    L21:
        if (r4 == 1) goto L23;
        return;
    L23:
        if (r7 == null) goto L25;
        r7.setBackground(ContextCompat.getDrawable(getMContext(), R.drawable.shape_nav_8_stroke_selected));
    L25:
        if (r7 == null) goto L27;
        r7.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(getMContext(), R.color.light_blue_tv_color)));
    L27:
        updateLineChartData(r11, r12);
    }

    private final void showData() {
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34841(this, null), 3, null);
    }

    private final void updateLineChartData(LineChart r11, NavigatorMoonItem r12) {
        LineDataSet r0 = new LineDataSet(r12.getMTarget(), getString(R.string.goal));
        r0.II1(ContextCompat.getColor(getMContext(), R.color.orange));
        r0.I00(ContextCompat.getColor(getMContext(), R.color.orange));
        r0.IIX(ContextCompat.getColor(getMContext(), R.color.orange));
        r0.I1XII0X(3.0f);
        r0.iXOII(2.0f);
        r0.I1(false);
        r0.OXOO0X0i(true);
        r0.I1XOi1(4.0f);
        LineDataSet.Mode r6 = LineDataSet.Mode.CUBIC_BEZIER;
        r0.OXXO0O1X(r6);
        LineDataSet r7 = new LineDataSet(r12.getMActual(), getString(R.string.actual));
        r7.II1(ContextCompat.getColor(getMContext(), R.color.green));
        r7.I00(ContextCompat.getColor(getMContext(), R.color.green));
        r7.IIX(ContextCompat.getColor(getMContext(), R.color.green));
        r7.I1XII0X(3.0f);
        r7.iXOII(2.0f);
        r7.I1(false);
        r7.OXOO0X0i(true);
        r7.I1XOi1(4.0f);
        r7.OXXO0O1X(r6);
        r11.setData(new co(new IiXO1XOi[]{r0, r7}));
        r11.getLegend().XOO0ii0(false);
        Iterator<T> r13 = r12.getMTarget().iterator();
        float r1 = 0.0f;
    L4:
        if (r13.hasNext() == false) goto L8;
        Entry r2 = (Entry) r13.next();
        if (r2.O00() <= 0.0f) goto L4;
        r1 = r2.OIX0iXi();
        goto L4
    L8:
        r11.II1Xi0(r1, 0);
        r11.invalidate();
    }

    @aa1
    public final String formatMonthDay(@aa1 String r5) {
        Intrinsics.X0O(r5, "dateStr");
        if (r5.length() != 5) goto L6;
        String r0 = r5.substring(0, 2);
        Intrinsics.O10IXXX0X(r0, "substring(...)");
        String r6 = r5.substring(3, 5);
        Intrinsics.O10IXXX0X(r6, "substring(...)");
        return r0 + getString(R.string.month) + r6 + getString(R.string.day);
    L6:
        return r5;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.sports_navigator));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_navigator;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        getRecyclerView().addItemDecoration(new DeviceItemDecoration(SizeUtils.dp2px(16.0f), false, false, 0, false, 30, null));
        showData();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onRefresh() {
        super.onRefresh();
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(this, null), 3, null);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return R.id.srf;
    }
}
