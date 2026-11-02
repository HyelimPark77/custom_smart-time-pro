package com.sma.smartv3.p610ui.sport;

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
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uf1;
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
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.NavigatorData;
import com.sma.smartv3.model.NavigatorItem;
import com.sma.smartv3.model.NavigatorMoonItem;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.NavigatorActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.DeviceItemDecoration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavigatorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorActivity.kt\ncom/sma/smartv3/ui/sport/NavigatorActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,390:1\n19#2:391\n15#2:392\n1869#3,2:393\n1869#3,2:395\n*S KotlinDebug\n*F\n+ 1 NavigatorActivity.kt\ncom/sma/smartv3/ui/sport/NavigatorActivity\n*L\n58#1:391\n58#1:392\n135#1:393,2\n384#1:395,2\n*E\n"})
public final class NavigatorActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.y41
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NavigatorActivity.abhTitleCenter_delegate$lambda$0(this.f12303IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.z41
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NavigatorActivity.abhTitleRight_delegate$lambda$0(this.f12536IO);
        }
    });

    @aa1
    private List<NavigatorItem> dataList;

    @aa1
    private final AppUser userProfile;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ TextView I0IIOi;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ TextView f54761IO;
        public final /* synthetic */ Ref.IntRef IiI10X;
        public final /* synthetic */ TextView O00;
        public final /* synthetic */ TextView OIi0;
        public final /* synthetic */ String[] OXO1;
        public final /* synthetic */ TextView XIi00iiXO;
        public final /* synthetic */ LineChart XO0O10;
        public final /* synthetic */ Workout XOO0ii0;

        /* JADX INFO: renamed from: iO */
        public final /* synthetic */ NavigatorActivity f54762iO;

        public OXO1(String[] strArr, TextView textView, NavigatorActivity navigatorActivity, LineChart lineChart, TextView textView2, Ref.IntRef intRef, Workout workout, TextView textView3, TextView textView4, TextView textView5) {
            this.OXO1 = strArr;
            this.XIi00iiXO = textView;
            this.f54762iO = navigatorActivity;
            this.XO0O10 = lineChart;
            this.O00 = textView2;
            this.IiI10X = intRef;
            this.XOO0ii0 = workout;
            this.I0IIOi = textView3;
            this.OIi0 = textView4;
            this.f54761IO = textView5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [com.android.mltcode.paycertificationapi.iII0X010, com.github.mikephil.charting.data.Entry] */
        /* JADX WARN: Type inference failed for: r6v2, types: [com.android.mltcode.paycertificationapi.iII0X010, com.github.mikephil.charting.data.Entry] */
        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            String strOX110i;
            String strOX110i2;
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            int iOIX0iXi = (int) e.OIX0iXi();
            String[] strArr = this.OXO1;
            int length = iOIX0iXi > strArr.length ? strArr.length - 1 : (int) e.OIX0iXi();
            TextView textView = this.XIi00iiXO;
            if (textView != null) {
                textView.setText(this.f54762iO.formatMonthDay(this.OXO1[length]));
            }
            float fOIX0iXi = e.OIX0iXi();
            T data = this.XO0O10.getData();
            Intrinsics.X1ii(data, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineData");
            C2305co c2305co = (C2305co) data;
            T tOIX0iXi = c2305co.OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            ?? II0I = ((LineDataSet) tOIX0iXi).iI0I(fOIX0iXi, Float.NaN);
            T tOIX0iXi2 = c2305co.OIX0iXi(1);
            Intrinsics.X1ii(tOIX0iXi2, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            ?? II0I2 = ((LineDataSet) tOIX0iXi2).iI0I(fOIX0iXi, Float.NaN);
            float fAbs = Math.abs(II0I2.O00() - II0I.O00());
            TextView textView2 = this.O00;
            String strOX110i3 = "";
            if (textView2 != null) {
                textView2.setText("");
            }
            int i = this.IiI10X.element;
            if (i == 0) {
                strOX110i3 = O0X11OiO.OX110i((int) II0I.O00());
                strOX110i = O0X11OiO.OX110i((int) II0I2.O00());
                strOX110i2 = O0X11OiO.OX110i((int) fAbs);
            } else if (i != 1) {
                strOX110i = "";
                strOX110i2 = strOX110i;
            } else if (this.XOO0ii0.getMMode() == 10) {
                strOX110i3 = String.valueOf(cp5.XXiIiX10(II0I.O00(), this.f54762iO.userProfile.getUnit()));
                strOX110i = String.valueOf(cp5.XXiIiX10(II0I2.O00(), this.f54762iO.userProfile.getUnit()));
                strOX110i2 = String.valueOf(cp5.XXiIiX10(fAbs, this.f54762iO.userProfile.getUnit()));
            } else {
                strOX110i3 = String.valueOf(cp5.Ii1iii0((int) II0I.O00(), this.f54762iO.userProfile.getUnit()));
                strOX110i = String.valueOf(cp5.Ii1iii0((int) II0I2.O00(), this.f54762iO.userProfile.getUnit()));
                strOX110i2 = String.valueOf(cp5.Ii1iii0((int) fAbs, this.f54762iO.userProfile.getUnit()));
            }
            TextView textView3 = this.I0IIOi;
            if (textView3 != null) {
                textView3.setText(this.f54762iO.getString(R.string.goal) + CertificateUtil.DELIMITER + strOX110i3);
            }
            TextView textView4 = this.OIi0;
            if (textView4 != null) {
                textView4.setText(this.f54762iO.getString(R.string.actual) + CertificateUtil.DELIMITER + strOX110i);
            }
            TextView textView5 = this.f54761IO;
            if (textView5 != null) {
                textView5.setText(this.f54762iO.getString(R.string.disparity) + CertificateUtil.DELIMITER + strOX110i2);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public static final class XIi00iiXO extends C2829q4 {

        /* JADX INFO: renamed from: iO */
        public final /* synthetic */ Ref.IntRef f54763iO;

        public XIi00iiXO(Ref.IntRef intRef) {
            this.f54763iO = intRef;
        }

        @Override // com.android.mltcode.paycertificationapi.C2829q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float f) {
            return this.f54763iO.element == 0 ? O0X11OiO.OX110i((int) f) : String.valueOf(f);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.NavigatorActivity$iO */
    public static final class C18958iO extends C2829q4 {
        public final /* synthetic */ NavigatorActivity XO0O10;

        /* JADX INFO: renamed from: iO */
        public final /* synthetic */ Ref.IntRef f54764iO;

        public C18958iO(Ref.IntRef intRef, NavigatorActivity navigatorActivity) {
            this.f54764iO = intRef;
            this.XO0O10 = navigatorActivity;
        }

        @Override // com.android.mltcode.paycertificationapi.C2829q4, com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float f) {
            return this.f54764iO.element == 0 ? O0X11OiO.OX110i((int) f) : cp5.Ii1iii0((int) f, this.XO0O10.userProfile.getUnit());
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.NavigatorActivity$onRefresh$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.sport.NavigatorActivity$onRefresh$1", m39466f = "NavigatorActivity.kt", m39467i = {}, m39468l = {90}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C189601 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C189601(Continuation<? super C189601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NavigatorActivity.this.new C189601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C189601) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                this.label = 1;
                if (DelayKt.XIi00iiXO(1200L, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            NavigatorActivity.this.showData();
            NavigatorActivity.this.getRefreshLayout().setRefreshing(false);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.NavigatorActivity$showData$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.sport.NavigatorActivity$showData$1", m39466f = "NavigatorActivity.kt", m39467i = {}, m39468l = {110}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290171 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C290171(Continuation<? super C290171> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(final NavigatorActivity navigatorActivity, DslAdapter dslAdapter) {
            dslAdapter.clearAllItems();
            DslAdapter.setAdapterStatus$default(dslAdapter, 2, null, 2, null);
            dslAdapter.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.navigator_empty_layout));
            navigatorActivity.getDslViewHolder().post(new Function0() { // from class: com.sma.smartv3.ui.sport.OXO1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return NavigatorActivity.C290171.invokeSuspend$lambda$0$0(navigatorActivity);
                }
            });
            return Unit.OXO1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0(final NavigatorActivity navigatorActivity) {
            navigatorActivity.renderAdapter(new Function1() { // from class: com.sma.smartv3.ui.sport.iO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NavigatorActivity.C290171.invokeSuspend$lambda$0$0$0(navigatorActivity, (DslAdapter) obj);
                }
            });
            return Unit.OXO1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0$0(NavigatorActivity navigatorActivity, DslAdapter dslAdapter) {
            DslAdapter.setAdapterStatus$default(dslAdapter, 0, null, 2, null);
            if (navigatorActivity.dataList.isEmpty()) {
                DslAdapter.setAdapterStatus$default(navigatorActivity.getDslAdapter(), 1, null, 2, null);
            } else {
                navigatorActivity.findData(dslAdapter, navigatorActivity.dataList);
                dslAdapter.setLoadMoreEnable(false);
            }
            return Unit.OXO1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NavigatorActivity.this.new C290171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290171) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NavigatorActivity navigatorActivity;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                NavigatorActivity navigatorActivity2 = NavigatorActivity.this;
                NavigatorData navigatorData = NavigatorData.INSTANCE;
                this.L$0 = navigatorActivity2;
                this.label = 1;
                Object navigatorData2 = navigatorData.getNavigatorData(this);
                if (navigatorData2 == objI0iXXO) {
                    return objI0iXXO;
                }
                navigatorActivity = navigatorActivity2;
                obj = navigatorData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                navigatorActivity = (NavigatorActivity) this.L$0;
                ResultKt.X1ii(obj);
            }
            navigatorActivity.dataList = CollectionsKt___CollectionsKt.OO0Oi10((Collection) obj);
            final NavigatorActivity navigatorActivity3 = NavigatorActivity.this;
            navigatorActivity3.renderAdapter(new Function1() { // from class: com.sma.smartv3.ui.sport.XIi00iiXO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return NavigatorActivity.C290171.invokeSuspend$lambda$0(navigatorActivity3, (DslAdapter) obj2);
                }
            });
            return Unit.OXO1;
        }
    }

    public NavigatorActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.dataList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(NavigatorActivity navigatorActivity) {
        return (TextView) navigatorActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(NavigatorActivity navigatorActivity) {
        return (ImageView) navigatorActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
    public final void findData(DslAdapter dslAdapter, List<NavigatorItem> list) {
        for (NavigatorItem navigatorItem : list) {
            DslAdapterExKt.O10IXXX0X(dslAdapter, R.layout.item_sport_navigator_record, new Function1() { // from class: com.android.mltcode.paycertificationapi.f51
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NavigatorActivity.findData$lambda$0$0(this.f6575IO, (DslAdapterItem) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0(final NavigatorActivity navigatorActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.a51
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return NavigatorActivity.findData$lambda$0$0$0(this.f5422IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0$0(NavigatorActivity navigatorActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        navigatorActivity.initItemView(itemHolder, i);
        return Unit.OXO1;
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final void initItemView(DslViewHolder dslViewHolder, int i) {
        final TextView textView;
        final Ref.IntRef intRef;
        final LineChart lineChart;
        final TextView textView2;
        TextView textView3;
        final TextView textView4;
        final TextView textView5;
        TextView textView6;
        final NavigatorActivity navigatorActivity;
        final NavigatorItem navigatorItem = this.dataList.get(i);
        Workout mLastWorkout = navigatorItem.getMLastWorkout();
        String strI01OOiI = q62.OXO1.i01OOiI(mLastWorkout.getMMode());
        TextView textViewM3482tv = dslViewHolder.m3482tv(R.id.item_mode_name);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(strI01OOiI);
        }
        TextView textViewM3482tv2 = dslViewHolder.m3482tv(R.id.item_leading_num);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(String.valueOf(navigatorItem.getMLeadingNum()));
        }
        TextView textViewM3482tv3 = dslViewHolder.m3482tv(R.id.item_flat_num);
        if (textViewM3482tv3 != null) {
            textViewM3482tv3.setText(String.valueOf(navigatorItem.getMFlatNum()));
        }
        TextView textViewM3482tv4 = dslViewHolder.m3482tv(R.id.item_backward_num);
        if (textViewM3482tv4 != null) {
            textViewM3482tv4.setText(String.valueOf(navigatorItem.getMBackWard()));
        }
        TextView textViewM3482tv5 = dslViewHolder.m3482tv(R.id.record_sports_title);
        if (textViewM3482tv5 != null) {
            textViewM3482tv5.setText(strI01OOiI);
        }
        ImageView imageViewImg = dslViewHolder.img(R.id.record_sports_icon);
        if (imageViewImg != null) {
            RequestManager requestManagerWith = Glide.with(imageViewImg.getContext());
            Context context = imageViewImg.getContext();
            Intrinsics.O10IXXX0X(context, "getContext(...)");
            SportRecordData sportRecordData = new SportRecordData();
            sportRecordData.setMMode(mLastWorkout.getMMode());
            Unit unit = Unit.OXO1;
            requestManagerWith.load(Integer.valueOf(SportRecordDataKt.getWorkoutImage(context, sportRecordData))).into(imageViewImg);
        }
        View viewM3483v = dslViewHolder.m3483v(R.id.item_list_record_more);
        if (viewM3483v != null) {
            viewM3483v.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.b51
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NavigatorActivity.initItemView$lambda$1(view);
                }
            });
        }
        View viewM3483v2 = dslViewHolder.m3483v(R.id.item_last_record);
        if (viewM3483v2 != null) {
            viewM3483v2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.c51
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NavigatorActivity.initItemView$lambda$2(view);
                }
            });
        }
        TextView textView7 = (TextView) dslViewHolder.m3483v(R.id.item_leading_mon);
        TextView textView8 = (TextView) dslViewHolder.m3483v(R.id.item_flat_mon);
        TextView textView9 = (TextView) dslViewHolder.m3483v(R.id.item_backward_mon);
        TextView textView10 = (TextView) dslViewHolder.m3483v(R.id.item_lin_chart_record_time);
        TextView textView11 = (TextView) dslViewHolder.m3483v(R.id.item_lin_chart_record_type);
        TextView textView12 = (TextView) dslViewHolder.m3483v(R.id.item_lin_chart_record_target);
        final TextView textView13 = (TextView) dslViewHolder.m3483v(R.id.item_lin_chart_record_actual);
        final TextView textView14 = (TextView) dslViewHolder.m3483v(R.id.item_lin_chart_record_difference);
        View viewM3483v3 = dslViewHolder.m3483v(R.id.line_chart);
        Intrinsics.XXI(viewM3483v3);
        LineChart lineChart2 = (LineChart) viewM3483v3;
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        String[] strArrXO0O10 = io1xi1x1i.XO0O10(lineChart2, this);
        final TextView textView15 = (TextView) dslViewHolder.m3483v(R.id.item_time_tv);
        TextView textView16 = (TextView) dslViewHolder.m3483v(R.id.item_speed_tv);
        Ref.IntRef intRef2 = new Ref.IntRef();
        if (textView11 != null) {
            textView11.setText("");
        }
        lineChart2.setOnChartValueSelectedListener(new OXO1(strArrXO0O10, textView10, this, lineChart2, textView11, intRef2, mLastWorkout, textView12, textView13, textView14));
        setMonthSelectedType(textView11, textView12, textView13, textView14);
        int i2 = intRef2.element;
        final TextView textView17 = textView7;
        final TextView textView18 = textView8;
        setSelectedMonthData(i2, navigatorItem, textView15, textView16, textView17, textView18, textView9, lineChart2);
        if (textView15 != null) {
            textView5 = textView16;
            textView = textView9;
            intRef = intRef2;
            lineChart = lineChart2;
            textView6 = textView13;
            textView3 = textView14;
            textView15.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.d51
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NavigatorActivity.initItemView$lambda$3(intRef, this, textView4, textView2, textView13, textView14, navigatorItem, textView15, textView5, textView17, textView18, textView, lineChart, view);
                }
            });
        } else {
            textView = textView9;
            intRef = intRef2;
            lineChart = lineChart2;
            textView3 = textView14;
            textView5 = textView16;
            textView6 = textView13;
        }
        if (textView5 != null) {
            textView2 = textView12;
            textView4 = textView11;
            textView4 = textView11;
            textView2 = textView12;
            textView17 = textView17;
            textView18 = textView18;
            final TextView textView19 = textView6;
            final TextView textView20 = textView3;
            final TextView textView21 = textView17;
            final TextView textView22 = textView18;
            navigatorActivity = this;
            textView5.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.e51
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NavigatorActivity.initItemView$lambda$4(intRef, navigatorActivity, textView4, textView2, textView19, textView20, navigatorItem, textView15, textView5, textView21, textView22, textView, lineChart, view);
                }
            });
        } else {
            textView2 = textView12;
            textView4 = textView11;
            textView4 = textView11;
            textView2 = textView12;
            textView17 = textView17;
            textView18 = textView18;
            navigatorActivity = this;
        }
        if (mLastWorkout.getMMode() == 10) {
            if (textView5 != null) {
                textView5.setText(navigatorActivity.getString(R.string.speed));
            }
            lineChart.getAxisLeft().X1OI(false);
            lineChart.getAxisLeft().m603Oi(new XIi00iiXO(intRef));
        } else {
            if (textView5 != null) {
                textView5.setText(navigatorActivity.getString(R.string.pace));
            }
            lineChart.getAxisLeft().X1OI(intRef.element != 0);
            lineChart.getAxisLeft().m603Oi(new C18958iO(intRef, navigatorActivity));
        }
        io1xi1x1i.O00(lineChart, strArrXO0O10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItemView$lambda$1(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItemView$lambda$2(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItemView$lambda$3(Ref.IntRef intRef, NavigatorActivity navigatorActivity, TextView textView, TextView textView2, TextView textView3, TextView textView4, NavigatorItem navigatorItem, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, LineChart lineChart, View view) {
        intRef.element = 0;
        navigatorActivity.setMonthSelectedType(textView, textView2, textView3, textView4);
        navigatorActivity.setSelectedMonthData(intRef.element, navigatorItem, textView5, textView6, textView7, textView8, textView9, lineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItemView$lambda$4(Ref.IntRef intRef, NavigatorActivity navigatorActivity, TextView textView, TextView textView2, TextView textView3, TextView textView4, NavigatorItem navigatorItem, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, LineChart lineChart, View view) {
        intRef.element = 1;
        navigatorActivity.setMonthSelectedType(textView, textView2, textView3, textView4);
        navigatorActivity.setSelectedMonthData(intRef.element, navigatorItem, textView5, textView6, textView7, textView8, textView9, lineChart);
    }

    private final void setMonthSelectedType(TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        if (textView2 != null) {
            textView2.setText(getString(R.string.goal) + CertificateUtil.DELIMITER + getString(R.string.data_none));
        }
        if (textView3 != null) {
            textView3.setText(getString(R.string.actual) + CertificateUtil.DELIMITER + getString(R.string.data_none));
        }
        if (textView4 != null) {
            textView4.setText(getString(R.string.disparity) + CertificateUtil.DELIMITER + getString(R.string.data_none));
        }
    }

    private final void setSelectedMonthData(int i, NavigatorItem navigatorItem, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LineChart lineChart) {
        NavigatorMoonItem navigatorMoonItem = navigatorItem.getMNavigatorMoonItem().get(i);
        if (textView != null) {
            textView.setBackground(ContextCompat.getDrawable(getMContext(), R.drawable.shape_edit_8_stroke));
        }
        if (textView != null) {
            textView.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(getMContext(), R.color.text_color)));
        }
        if (textView2 != null) {
            textView2.setBackground(ContextCompat.getDrawable(getMContext(), R.drawable.shape_edit_8_stroke));
        }
        if (textView2 != null) {
            textView2.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(getMContext(), R.color.text_color)));
        }
        if (textView3 != null) {
            textView3.setText(String.valueOf(navigatorMoonItem.getMLeadingNum()));
        }
        if (textView4 != null) {
            textView4.setText(String.valueOf(navigatorMoonItem.getMFlatNum()));
        }
        if (textView5 != null) {
            textView5.setText(String.valueOf(navigatorMoonItem.getMBackWard()));
        }
        if (i == 0) {
            if (textView != null) {
                textView.setBackground(ContextCompat.getDrawable(getMContext(), R.drawable.shape_nav_8_stroke_selected));
            }
            if (textView != null) {
                textView.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(getMContext(), R.color.light_blue_tv_color)));
            }
            updateLineChartData(lineChart, navigatorMoonItem);
            return;
        }
        if (i != 1) {
            return;
        }
        if (textView2 != null) {
            textView2.setBackground(ContextCompat.getDrawable(getMContext(), R.drawable.shape_nav_8_stroke_selected));
        }
        if (textView2 != null) {
            textView2.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(getMContext(), R.color.light_blue_tv_color)));
        }
        updateLineChartData(lineChart, navigatorMoonItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showData() {
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C290171(null), 3, null);
    }

    private final void updateLineChartData(LineChart lineChart, NavigatorMoonItem navigatorMoonItem) {
        LineDataSet lineDataSet = new LineDataSet(navigatorMoonItem.getMTarget(), getString(R.string.goal));
        lineDataSet.II1(ContextCompat.getColor(getMContext(), R.color.orange));
        lineDataSet.I00(ContextCompat.getColor(getMContext(), R.color.orange));
        lineDataSet.IIX(ContextCompat.getColor(getMContext(), R.color.orange));
        lineDataSet.I1XII0X(3.0f);
        lineDataSet.iXOII(2.0f);
        lineDataSet.mo693I1(false);
        lineDataSet.OXOO0X0i(true);
        lineDataSet.I1XOi1(4.0f);
        LineDataSet.Mode mode = LineDataSet.Mode.CUBIC_BEZIER;
        lineDataSet.OXXO0O1X(mode);
        LineDataSet lineDataSet2 = new LineDataSet(navigatorMoonItem.getMActual(), getString(R.string.actual));
        lineDataSet2.II1(ContextCompat.getColor(getMContext(), R.color.green));
        lineDataSet2.I00(ContextCompat.getColor(getMContext(), R.color.green));
        lineDataSet2.IIX(ContextCompat.getColor(getMContext(), R.color.green));
        lineDataSet2.I1XII0X(3.0f);
        lineDataSet2.iXOII(2.0f);
        lineDataSet2.mo693I1(false);
        lineDataSet2.OXOO0X0i(true);
        lineDataSet2.I1XOi1(4.0f);
        lineDataSet2.OXXO0O1X(mode);
        lineChart.setData(new C2305co(lineDataSet, lineDataSet2));
        lineChart.getLegend().XOO0ii0(false);
        float fOIX0iXi = 0.0f;
        for (Entry entry : navigatorMoonItem.getMTarget()) {
            if (entry.O00() > 0.0f) {
                fOIX0iXi = entry.OIX0iXi();
            }
        }
        lineChart.II1Xi0(fOIX0iXi, 0);
        lineChart.invalidate();
    }

    @aa1
    public final String formatMonthDay(@aa1 String dateStr) {
        Intrinsics.X0O(dateStr, "dateStr");
        if (dateStr.length() != 5) {
            return dateStr;
        }
        String strSubstring = dateStr.substring(0, 2);
        Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
        String strSubstring2 = dateStr.substring(3, 5);
        Intrinsics.O10IXXX0X(strSubstring2, "substring(...)");
        return strSubstring + getString(R.string.month) + strSubstring2 + getString(R.string.day);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.sports_navigator));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
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
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C189601(null), 3, null);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return R.id.srf;
    }
}
