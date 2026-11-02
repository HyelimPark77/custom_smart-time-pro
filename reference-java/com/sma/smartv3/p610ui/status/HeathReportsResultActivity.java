package com.sma.smartv3.p610ui.status;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.UriUtils;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.p608db.entity.HealthyReport;
import com.sma.smartv3.p610ui.status.HeathReportsResultActivity;
import com.sma.smartv3.p610ui.status.item.HeathAIAnalyzeItem;
import com.sma.smartv3.p610ui.status.item.HeathReportsBaseItem;
import com.sma.smartv3.p610ui.status.item.HeathReportsTopItem;
import com.sma.smartv3.p610ui.status.item.MainStatusFunctionsItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.HeathReportsUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHeathReportsResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsResultActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,147:1\n1#2:148\n1#2:160\n1563#3:149\n1634#3,3:150\n1563#3:153\n1634#3,3:154\n69#4,3:157\n72#4,5:161\n*S KotlinDebug\n*F\n+ 1 HeathReportsResultActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsResultActivity\n*L\n144#1:160\n107#1:149\n107#1:150,3\n112#1:153\n112#1:154,3\n144#1:157,3\n144#1:161,5\n*E\n"})
public final class HeathReportsResultActivity extends BaseActivity {

    @tb1
    private DslAdapter dslAdapter;

    @tb1
    private HealthyReport mHealthyReport;

    @tb1
    private RecyclerView mRecyclerView;

    @tb1
    private List<TodayData> mTodayDataList;

    @aa1
    private final String TAG = "HeathReportsResultActivity";

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO00IX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsResultActivity.abhTitleCenter_delegate$lambda$0(this.f4650IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiiiXOXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsResultActivity.abhTitleRight_delegate$lambda$0(this.f2346IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIO0I00XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsResultActivity.abhTitleOtherRight_delegate$lambda$0(this.f1607IO);
        }
    });

    @aa1
    private final Lazy mShareLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXOOOi1OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsResultActivity.mShareLayout_delegate$lambda$0(this.f3514IO);
        }
    });

    @aa1
    private final ArrayList<DslAdapterItem> showList = new ArrayList<>();

    @aa1
    private final Lazy mGenerateBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXOIO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsResultActivity.mGenerateBtn_delegate$lambda$0(this.f8363IO);
        }
    });
    private long reportsId = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(HeathReportsResultActivity heathReportsResultActivity) {
        return (TextView) heathReportsResultActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(HeathReportsResultActivity heathReportsResultActivity) {
        return (ImageView) heathReportsResultActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(HeathReportsResultActivity heathReportsResultActivity) {
        return (ImageView) heathReportsResultActivity.findViewById(R.id.abh_title_right);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final TextView getMGenerateBtn() {
        return (TextView) this.mGenerateBtn$delegate.getValue();
    }

    private final View getMShareLayout() {
        return (View) this.mShareLayout$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mGenerateBtn_delegate$lambda$0(HeathReportsResultActivity heathReportsResultActivity) {
        return (TextView) heathReportsResultActivity.findViewById(R.id.tv_generate_report);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mShareLayout_delegate$lambda$0(HeathReportsResultActivity heathReportsResultActivity) {
        return heathReportsResultActivity.findViewById(R.id.share_layout);
    }

    @aa1
    public final ArrayList<DslAdapterItem> getShowList() {
        return this.showList;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        String mArg0 = getMArg0();
        long j = mArg0 != null ? Long.parseLong(mArg0) : -1L;
        this.reportsId = j;
        if (j > -1) {
            HeathReportsUtils heathReportsUtils = HeathReportsUtils.OXO1;
            HealthyReport healthyReportI010I = heathReportsUtils.i010I(j);
            this.mHealthyReport = healthyReportI010I;
            this.mTodayDataList = heathReportsUtils.OX110i(healthyReportI010I);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.health_report));
        LibExKt.XX1Oi(getMGenerateBtn(), true);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_share_hrg);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.ic_waring);
        getAbhTitleOtherRight().setImageTintList(gk4.O00(this, R.color.text_color));
        showCard();
        View viewFindViewById = findViewById(R.id.f51422rv);
        Intrinsics.XXI(viewFindViewById);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize(10);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setItemAnimator(null);
        }
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new GridLayoutManager(getMContext(), 1));
        }
        DslAdapter dslAdapter = new DslAdapter(this.showList);
        RecyclerView recyclerView4 = this.mRecyclerView;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(dslAdapter);
        }
        this.dslAdapter = dslAdapter;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_heath_reports;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getMShareLayout().getWidth(), getMShareLayout().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        View mShareLayout = getMShareLayout();
        Intrinsics.O10IXXX0X(mShareLayout, "<get-mShareLayout>(...)");
        canvas.drawBitmap(xIi1i01O.XIi00iiXO(mShareLayout), 0.0f, 0.0f, (Paint) null);
        sz0 sz0Var = sz0.OXO1;
        ImageUtils.save(bitmapCreateBitmap, uz0.XOX0O0(sz0Var), Bitmap.CompressFormat.JPEG);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "");
        intent.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(uz0.XOX0O0(sz0Var)));
        intent.setType("image/*");
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        Intrinsics.O10IXXX0X(intentCreateChooser, "createChooser(...)");
        intentCreateChooser.addFlags(268435456);
        startActivity(intentCreateChooser);
    }

    public final void onTitleRightOtherClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) HistoryDefinitionActivity.class));
    }

    @aa1
    public final ArrayList<DslAdapterItem> showCard() {
        this.showList.clear();
        HealthyReport healthyReport = this.mHealthyReport;
        this.showList.add(new HeathReportsTopItem(healthyReport != null ? healthyReport.getMTime() : a01.OXO1.OXO1().getLong(b01.XOO0Xi, 0L), true, this.mHealthyReport));
        ArrayList arrayList = new ArrayList();
        List<TodayData> list = this.mTodayDataList;
        if (list != null) {
            List<TodayData> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(Boolean.valueOf(arrayList.add(new HeathReportsBaseItem((TodayData) it.next()))));
            }
        }
        ArrayList<DslAdapterItem> arrayList3 = this.showList;
        MainStatusFunctionsItem mainStatusFunctionsItem = new MainStatusFunctionsItem();
        mainStatusFunctionsItem.setItems(arrayList);
        arrayList3.add(mainStatusFunctionsItem);
        List<TodayData> list3 = this.mTodayDataList;
        if (list3 != null) {
            List<TodayData> list4 = list3;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Boolean.valueOf(this.showList.add(new HeathAIAnalyzeItem((TodayData) it2.next()))));
            }
        }
        return this.showList;
    }
}
