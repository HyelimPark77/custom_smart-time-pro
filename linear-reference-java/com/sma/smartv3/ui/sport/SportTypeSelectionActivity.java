package com.sma.smartv3.ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.k65;
import com.android.mltcode.paycertificationapi.l65;
import com.android.mltcode.paycertificationapi.m65;
import com.android.mltcode.paycertificationapi.n65;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportTypeSelectionActivity extends BaseDSLRecyclerActivity {

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    private static final String SPORT_TYPE_EXTRA = null;

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final LinkedHashMap<String, List<Integer>> allSportData;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final String OXO1() {
            return SportTypeSelectionActivity.access$getSPORT_TYPE_EXTRA$cp();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
        SPORT_TYPE_EXTRA = "SPORT_TYPE_EXTRA";
    }

    public SportTypeSelectionActivity() {
        this.TAG = "SportTypeActivity";
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new l65(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new m65(this));
        this.allSportData = new LinkedHashMap();
    }

    public static /* synthetic */ Unit I0iXXO(SportTypeSelectionActivity r0, int r1) {
        return showAllSportType$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ TextView O10IXXX0X(SportTypeSelectionActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(SportTypeSelectionActivity r0, DslAdapter r1) {
        return showAllSportType$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageView XXI(SportTypeSelectionActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(SportTypeSelectionActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(SportTypeSelectionActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ String access$getSPORT_TYPE_EXTRA$cp() {
        return SPORT_TYPE_EXTRA;
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final void showAllSportType() {
        getDslAdapter().clearItems();
        renderAdapter(new k65(this));
    }

    private static final Unit showAllSportType$lambda$0(final SportTypeSelectionActivity r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        Iterator<Map.Entry<String, List<Integer>>> r0 = r4.allSportData.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L7;
        Map.Entry<String, List<Integer>> r1 = r0.next();
        ((SportListItem) DslAdapterExKt.IIX1OXO(r5, new SportListItem(r1.getKey(), r1.getValue()), null, 2, null)).setSportItemClick(new n65(r4));
        goto L4
    L7:
        return Unit.OXO1;
    }

    private static final Unit showAllSportType$lambda$0$0$0(SportTypeSelectionActivity r2, int r3) {
        Intent r0 = new Intent();
        r0.putExtra(SPORT_TYPE_EXTRA, r3);
        Unit r4 = Unit.OXO1;
        r2.setResult(-1, r0);
        r2.finish();
        return r4;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        initData();
    }

    public final void initData() {
        this.allSportData.clear();
        LinkedHashMap<String, List<Integer>> r0 = this.allSportData;
        r0.put(getString(R.string.sport_type_selection__title_leisure), CollectionsKt__CollectionsKt.iXiX011(new Integer[]{13, 11, 14, 100, 65}));
        r0.put(getString(R.string.sport_type_selection__title_health), CollectionsKt__CollectionsKt.iXiX011(new Integer[]{47, 189, 46, 52, 51, 111, 99, 123, 122, 21}));
        r0.put(getString(R.string.sport_type_selection__title_ball), CollectionsKt__CollectionsKt.iXiX011(new Integer[]{16, 17, 43, 42, 36, 18, 49, 157}));
        r0.put(getString(R.string.sport_type_selection__title_competition), CollectionsKt__CollectionsKt.iXiX011(new Integer[]{25, 45, 184, 119}));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleRight().setVisibility(8);
        getAbhTitleCenter().setText(R.string.sport_type_selection__activity_title);
        showAllSportType();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_type_selection;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }
}
