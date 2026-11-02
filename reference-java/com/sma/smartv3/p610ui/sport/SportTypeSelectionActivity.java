package com.sma.smartv3.p610ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.sma.smartv3.p610ui.sport.SportTypeSelectionActivity;
import com.sma.smartv3.pro.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportTypeSelectionActivity extends BaseDSLRecyclerActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    private static final String SPORT_TYPE_EXTRA = "SPORT_TYPE_EXTRA";

    @aa1
    private final String TAG = "SportTypeActivity";

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.l65
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportTypeSelectionActivity.abhTitleCenter_delegate$lambda$0(this.f9365IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.m65
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportTypeSelectionActivity.abhTitleRight_delegate$lambda$0(this.f9635IO);
        }
    });

    @aa1
    private final LinkedHashMap<String, List<Integer>> allSportData = new LinkedHashMap<>();

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final String OXO1() {
            return SportTypeSelectionActivity.SPORT_TYPE_EXTRA;
        }

        public OXO1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(SportTypeSelectionActivity sportTypeSelectionActivity) {
        return (TextView) sportTypeSelectionActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(SportTypeSelectionActivity sportTypeSelectionActivity) {
        return (ImageView) sportTypeSelectionActivity.findViewById(R.id.abh_title_right);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final void showAllSportType() {
        getDslAdapter().clearItems();
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.k65
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTypeSelectionActivity.showAllSportType$lambda$0(this.f9117IO, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAllSportType$lambda$0(final SportTypeSelectionActivity sportTypeSelectionActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        for (Map.Entry<String, List<Integer>> entry : sportTypeSelectionActivity.allSportData.entrySet()) {
            ((SportListItem) DslAdapterExKt.IIX1OXO(renderAdapter, new SportListItem(entry.getKey(), entry.getValue()), null, 2, null)).setSportItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.n65
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportTypeSelectionActivity.showAllSportType$lambda$0$0$0(this.f9857IO, ((Integer) obj).intValue());
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAllSportType$lambda$0$0$0(SportTypeSelectionActivity sportTypeSelectionActivity, int i) {
        Intent intent = new Intent();
        intent.putExtra(SPORT_TYPE_EXTRA, i);
        Unit unit = Unit.OXO1;
        sportTypeSelectionActivity.setResult(-1, intent);
        sportTypeSelectionActivity.finish();
        return unit;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        initData();
    }

    public final void initData() {
        this.allSportData.clear();
        LinkedHashMap<String, List<Integer>> linkedHashMap = this.allSportData;
        linkedHashMap.put(getString(R.string.sport_type_selection__title_leisure), CollectionsKt__CollectionsKt.iXiX011(13, 11, 14, 100, 65));
        linkedHashMap.put(getString(R.string.sport_type_selection__title_health), CollectionsKt__CollectionsKt.iXiX011(47, 189, 46, 52, 51, 111, 99, 123, 122, 21));
        linkedHashMap.put(getString(R.string.sport_type_selection__title_ball), CollectionsKt__CollectionsKt.iXiX011(16, 17, 43, 42, 36, 18, 49, 157));
        linkedHashMap.put(getString(R.string.sport_type_selection__title_competition), CollectionsKt__CollectionsKt.iXiX011(25, 45, 184, 119));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleRight().setVisibility(8);
        getAbhTitleCenter().setText(R.string.sport_type_selection__activity_title);
        showAllSportType();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sport_type_selection;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }
}
