package com.sma.smartv3.p610ui.status;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.p610ui.status.HeathReportsGenerateActivity;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHeathReportsGenerateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsGenerateActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsGenerateActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,197:1\n1#2:198\n1#2:210\n1563#3:199\n1634#3,3:200\n87#4,7:203\n94#4,3:211\n70#4,7:214\n97#4:221\n*S KotlinDebug\n*F\n+ 1 HeathReportsGenerateActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsGenerateActivity\n*L\n135#1:210\n165#1:199\n165#1:200,3\n135#1:203,7\n135#1:211,3\n135#1:214,7\n135#1:221\n*E\n"})
public final class HeathReportsGenerateActivity extends BaseActivity {

    @tb1
    private DslAdapter dslAdapter;

    @tb1
    private List<TodayData> mTodayDataList;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX10Ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsGenerateActivity.abhTitleCenter_delegate$lambda$0(this.f8266IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXiX1IO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsGenerateActivity.abhTitleRight_delegate$lambda$0(this.f5171IO);
        }
    });

    @aa1
    private final Lazy mGenerateBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOXXIIOX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsGenerateActivity.mGenerateBtn_delegate$lambda$0(this.f1879IO);
        }
    });

    @aa1
    private final Lazy mGenerateImgView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsGenerateActivity.mGenerateImgView_delegate$lambda$0(this.f5065IO);
        }
    });

    @aa1
    private final Lazy mGenerateTvView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi0O11II
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsGenerateActivity.mGenerateTvView_delegate$lambda$0(this.f3632IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXXOO0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsGenerateActivity.mRecyclerView_delegate$lambda$0(this.f3553IO);
        }
    });

    @aa1
    private final Lazy mShareLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiIO0OII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsGenerateActivity.mShareLayout_delegate$lambda$0(this.f5261IO);
        }
    });

    @aa1
    private final ArrayList<DslAdapterItem> showList = new ArrayList<>();

    @aa1
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private int forNumber = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(HeathReportsGenerateActivity heathReportsGenerateActivity) {
        return (TextView) heathReportsGenerateActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(HeathReportsGenerateActivity heathReportsGenerateActivity) {
        return (ImageView) heathReportsGenerateActivity.findViewById(R.id.abh_title_right);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final TextView getMGenerateBtn() {
        return (TextView) this.mGenerateBtn$delegate.getValue();
    }

    private final View getMGenerateImgView() {
        return (View) this.mGenerateImgView$delegate.getValue();
    }

    private final View getMGenerateTvView() {
        return (View) this.mGenerateTvView$delegate.getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    private final View getMShareLayout() {
        return (View) this.mShareLayout$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initRecyclerView() {
        getMRecyclerView().setItemViewCacheSize(30);
        getMRecyclerView().setItemAnimator(null);
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(getMContext(), 1, false));
        DslAdapter dslAdapter = new DslAdapter(this.showList);
        getMRecyclerView().setAdapter(dslAdapter);
        this.dslAdapter = dslAdapter;
        Intrinsics.XXI(dslAdapter);
        dslAdapter.notifyDataChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(HeathReportsGenerateActivity heathReportsGenerateActivity, View view) {
        if (heathReportsGenerateActivity.mTodayDataList == null) {
            ToastUtils.showLong(R.string.heath_reports_lack_of_data_tip);
            return;
        }
        heathReportsGenerateActivity.getMGenerateImgView().setVisibility(0);
        heathReportsGenerateActivity.getMGenerateTvView().setVisibility(0);
        heathReportsGenerateActivity.getMRecyclerView().setVisibility(8);
        heathReportsGenerateActivity.getMGenerateBtn().setVisibility(8);
        heathReportsGenerateActivity.forNumber = 1;
        List<TodayData> list = heathReportsGenerateActivity.mTodayDataList;
        Intrinsics.XXI(list);
        if (list.size() > 0) {
            heathReportsGenerateActivity.startAIAnalyze();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1(final HeathReportsGenerateActivity heathReportsGenerateActivity) {
        heathReportsGenerateActivity.showCard(HeathReportsUtils.OXO1.O1O());
        heathReportsGenerateActivity.mHandler.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iiiXOiX0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8692IO.initRecyclerView();
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mGenerateBtn_delegate$lambda$0(HeathReportsGenerateActivity heathReportsGenerateActivity) {
        return (TextView) heathReportsGenerateActivity.findViewById(R.id.tv_generate_report);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mGenerateImgView_delegate$lambda$0(HeathReportsGenerateActivity heathReportsGenerateActivity) {
        return heathReportsGenerateActivity.findViewById(R.id.iv_reports_generation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mGenerateTvView_delegate$lambda$0(HeathReportsGenerateActivity heathReportsGenerateActivity) {
        return heathReportsGenerateActivity.findViewById(R.id.tv_reports_generation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(HeathReportsGenerateActivity heathReportsGenerateActivity) {
        return (RecyclerView) heathReportsGenerateActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mShareLayout_delegate$lambda$0(HeathReportsGenerateActivity heathReportsGenerateActivity) {
        return heathReportsGenerateActivity.findViewById(R.id.share_layout);
    }

    private final ArrayList<DslAdapterItem> showCard(List<TodayData> list) {
        this.mTodayDataList = list;
        this.showList.clear();
        this.showList.add(new HeathReportsTopItem(a01.OXO1.OXO1().getLong(b01.XOO0Xi, 0L), false, null));
        ArrayList arrayList = new ArrayList();
        List<TodayData> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new HeathReportsBaseItem((TodayData) it.next()))));
        }
        ArrayList<DslAdapterItem> arrayList3 = this.showList;
        MainStatusFunctionsItem mainStatusFunctionsItem = new MainStatusFunctionsItem();
        mainStatusFunctionsItem.setItems(arrayList);
        arrayList3.add(mainStatusFunctionsItem);
        return this.showList;
    }

    private final void startAIAnalyze() {
        List<TodayData> list = this.mTodayDataList;
        Intrinsics.XXI(list);
        final TodayData todayData = list.get(this.forNumber - 1);
        HeathReportsUtils heathReportsUtils = HeathReportsUtils.OXO1;
        String strIX1O1 = HeathReportsUtils.iX1O1(heathReportsUtils, todayData.getDataType(), todayData.getTitle(), todayData.getValue(), 0, 8, null);
        if (strIX1O1.length() > 0) {
            HeathReportsUtils.iXi(heathReportsUtils, strIX1O1, 0, new Function1() { // from class: com.android.mltcode.paycertificationapi.IIO0XXI
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HeathReportsGenerateActivity.startAIAnalyze$lambda$0(this.f1609IO, todayData, (AIAnswer) obj);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startAIAnalyze$lambda$0(final HeathReportsGenerateActivity heathReportsGenerateActivity, TodayData todayData, AIAnswer aIAnswer) {
        String text;
        heathReportsGenerateActivity.forNumber++;
        if (aIAnswer != null && (text = aIAnswer.getText()) != null && text.length() > 0) {
            todayData.setMExtraInfo(aIAnswer.getText());
        }
        int i = heathReportsGenerateActivity.forNumber;
        List<TodayData> list = heathReportsGenerateActivity.mTodayDataList;
        Intrinsics.XXI(list);
        if (i >= list.size()) {
            HeathReportsUtils.OXO1.m38812OO(heathReportsGenerateActivity.mTodayDataList, new Function1() { // from class: com.android.mltcode.paycertificationapi.I00X101XX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HeathReportsGenerateActivity.startAIAnalyze$lambda$0$0(this.f1024IO, ((Long) obj).longValue());
                }
            });
        } else {
            heathReportsGenerateActivity.startAIAnalyze();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startAIAnalyze$lambda$0$0(HeathReportsGenerateActivity heathReportsGenerateActivity, long j) {
        if (j > 0) {
            a01.OXO1.OXO1().put(b01.XOO0Xi, System.currentTimeMillis());
            String strValueOf = String.valueOf(j);
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", strValueOf);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(heathReportsGenerateActivity, (Class<?>) HeathReportsResultActivity.class);
            intent.putExtras(bundle);
            heathReportsGenerateActivity.startActivity(intent);
            heathReportsGenerateActivity.finish();
        } else {
            ToastUtils.showLong(heathReportsGenerateActivity.getString(R.string.generate_failed), new Object[0]);
        }
        return Unit.OXO1;
    }

    public final int getForNumber() {
        return this.forNumber;
    }

    @aa1
    public final ArrayList<DslAdapterItem> getShowList() {
        return this.showList;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @SuppressLint({"NotifyDataSetChanged"})
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.health_report));
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_share_hrg);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        initRecyclerView();
        getMGenerateBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O0OOOXXX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeathReportsGenerateActivity.initView$lambda$0(this.f2508IO, view);
            }
        });
        ThreadsKt.m39451iO(false, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.XI0III0O
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return HeathReportsGenerateActivity.initView$lambda$1(this.f4422IO);
            }
        }, 31, null);
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

    public final void setForNumber(int i) {
        this.forNumber = i;
    }
}
