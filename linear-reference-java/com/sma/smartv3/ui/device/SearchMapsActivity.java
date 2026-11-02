package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ay3;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.by3;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sx3;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tx3;
import com.android.mltcode.paycertificationapi.ux3;
import com.android.mltcode.paycertificationapi.vx3;
import com.android.mltcode.paycertificationapi.wx3;
import com.android.mltcode.paycertificationapi.xx3;
import com.android.mltcode.paycertificationapi.yx3;
import com.android.mltcode.paycertificationapi.zx3;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.SearchDistrict;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.XiOIO;
import org.eclipse.paho.android.service.MqttServiceConstants;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nSearchMapsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n55#2,12:187\n84#2,3:199\n1#3:202\n*S KotlinDebug\n*F\n+ 1 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n*L\n81#1:187,12\n81#1:199,3\n*E\n"})
public class SearchMapsActivity extends BaseActivity {
    private boolean isInChinaMainland;

    @aa1
    private final List<SearchDistrict> mList;

    @tb1
    private CommonAdapter<SearchDistrict> mListAdapter;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @tb1
    private PlacesClient placesClient;

    @tb1
    private XiOIO searchJob;

    @aa1
    private final Lazy searchView$delegate;

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n82#2,12:83\n59#3:95\n62#4:96\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ SearchMapsActivity IO;

        public OXO1(SearchMapsActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r9) {
            XiOIO r0 = SearchMapsActivity.access$getSearchJob$p(this.IO);
            if (r0 == null) goto L5;
            XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
        L5:
            SearchMapsActivity r1 = this.IO;
            SearchMapsActivity.access$setSearchJob$p(r1, I100X1.O00(LifecycleOwnerKt.getLifecycleScope(r1), IXOX0Xiii.iO(), null, new SearchMapsActivity$initView$1$1(this.IO, r9, null), 2, null));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public static final class XIi00iiXO extends TypeToken<List<? extends SearchDistrict>> {
        public XIi00iiXO() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.SearchMapsActivity$initView$3, reason: invalid class name */
    public static final class AnonymousClass3 extends CommonAdapter<SearchDistrict> {
        final /* synthetic */ SearchMapsActivity this$0;

        public AnonymousClass3(SearchMapsActivity r2, List<SearchDistrict> r3) {
            this.this$0 = r2;
            super(r2, R.layout.item_search_map_district, r3);
        }

        public static /* synthetic */ void OXO1(SearchDistrict r0, SearchMapsActivity r1, View r2) {
            convert$lambda$0(r0, r1, r2);
        }

        private static final void convert$lambda$0(SearchDistrict r3, SearchMapsActivity r4, View r5) {
            Intent r6 = new Intent();
            r6.putExtra("MAP_POINT_LAT", r3.getLatitude());
            r6.putExtra("MAP_POINT_LON", r3.getLongitude());
            r4.setResult(-1, r6);
            r4.finish();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, SearchDistrict r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r2, final SearchDistrict r3, int r4) {
            Intrinsics.X0O(r2, "holder");
            Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
            r2.setText(R.id.off_line_map_title, r3.getName());
            r2.setText(R.id.off_line_map_dis, r3.getDistrict());
            View r5 = r2.itemView;
            final SearchMapsActivity r6 = this.this$0;
            r5.setOnClickListener(new by3(r3, r6));
        }
    }

    public SearchMapsActivity() {
        this.searchView$delegate = LazyKt__LazyJVMKt.iO(new sx3(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new tx3(this));
        this.mList = new ArrayList();
        this.isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, true);
    }

    public static /* synthetic */ EditText I0iXXO(SearchMapsActivity r0) {
        return searchView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(SearchMapsActivity r0, FindAutocompletePredictionsResponse r1) {
        return requestGooglePoiSearch$lambda$0(r0, r1);
    }

    public static /* synthetic */ void IIX1OXO(SearchMapsActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(SearchMapsActivity r0, AutocompletePrediction r1, FetchPlaceResponse r2) {
        return requestGooglePoiSearch$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ void OIX0iXi(Function1 r0, Object r1) {
        requestGooglePoiSearch$lambda$1(r0, r1);
    }

    public static /* synthetic */ void X0O(Exception r0) {
        requestGooglePoiSearch$lambda$0$2(r0);
    }

    public static /* synthetic */ void X1ii(Function1 r0, Object r1) {
        requestGooglePoiSearch$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ RecyclerView XXI(SearchMapsActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(SearchMapsActivity r0, Exception r1) {
        requestGooglePoiSearch$lambda$2(r0, r1);
    }

    public static final /* synthetic */ XiOIO access$getSearchJob$p(SearchMapsActivity r0) {
        return r0.searchJob;
    }

    public static final /* synthetic */ boolean access$isInChinaMainland$p(SearchMapsActivity r0) {
        return r0.isInChinaMainland;
    }

    public static final /* synthetic */ void access$requestGooglePoiSearch(SearchMapsActivity r0, String r1) {
        r0.requestGooglePoiSearch(r1);
    }

    public static final /* synthetic */ void access$setSearchJob$p(SearchMapsActivity r0, XiOIO r1) {
        r0.searchJob = r1;
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final EditText getSearchView() {
        return (EditText) getValue();
    }

    private static final void initView$lambda$1(SearchMapsActivity r1, View r2) {
        r1.mList.clear();
        CommonAdapter<SearchDistrict> r3 = r1.mListAdapter;
        if (r3 == null) goto L5;
        r3.notifyDataSetChanged();
    L5:
        Editable r4 = r1.getSearchView().getText();
        Intrinsics.XXI(r4);
        if (r4.length() > 0) goto L8;
        return;
    L8:
        if (r1.isInChinaMainland == false) goto L11;
        r1.requestPoiSearch(r4.toString());
        return;
    L11:
        r1.requestGooglePoiSearch(r4.toString());
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(SearchMapsActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv);
    }

    private final void requestGooglePoiSearch(String r7) {
        CustomLocation r0 = UtilsKt.XXIIO1i11();
        FindAutocompletePredictionsRequest r8 = FindAutocompletePredictionsRequest.builder().setQuery(r7).setOrigin(new LatLng(r0.XO0O10(), r0.IiI10X())).build();
        PlacesClient r1 = this.placesClient;
        if (r1 == null) goto L10;
        Task<FindAutocompletePredictionsResponse> r9 = r1.findAutocompletePredictions(r8);
        if (r9 == null) goto L11;
        final Function1 r2 = new ux3(this);
        Task<FindAutocompletePredictionsResponse> r10 = r9.addOnSuccessListener(new vx3(r2));
        if (r10 == null) goto L12;
        r10.addOnFailureListener(new wx3(this));
        return;
    L12:
        return;
    L11:
        return;
    }

    private static final Unit requestGooglePoiSearch$lambda$0(final SearchMapsActivity r3, FindAutocompletePredictionsResponse r4) {
        List<AutocompletePrediction> r5 = r4.getAutocompletePredictions();
        r3.mList.clear();
        Iterator<AutocompletePrediction> r6 = r5.iterator();
    L4:
        if (r6.hasNext() == false) goto L13;
        final AutocompletePrediction r0 = r6.next();
        List r1 = X0iO1XX.I0iXXO(Place.Field.LAT_LNG);
        FetchPlaceRequest r2 = FetchPlaceRequest.builder(r0.getPlaceId(), r1).build();
        PlacesClient r7 = r3.placesClient;
        if (r7 == null) goto L4;
        Task<FetchPlaceResponse> r8 = r7.fetchPlace(r2);
        if (r8 == null) goto L4;
        final Function1 r9 = new yx3(r3, r0);
        Task<FetchPlaceResponse> r10 = r8.addOnSuccessListener(new zx3(r9));
        if (r10 == null) goto L4;
        r10.addOnFailureListener(new ay3());
        goto L4
    L13:
        return Unit.OXO1;
    }

    private static final Unit requestGooglePoiSearch$lambda$0$0(SearchMapsActivity r8, AutocompletePrediction r9, FetchPlaceResponse r10) {
        LatLng r11 = r10.getPlace().getLatLng();
        if (r11 == null) goto L8;
        List<SearchDistrict> r0 = r8.mList;
        String r2 = r9.getPrimaryText(new StyleSpan(0)).toString();
        Intrinsics.O10IXXX0X(r2, "toString(...)");
        String r3 = r9.getFullText(new StyleSpan(0)).toString();
        Intrinsics.O10IXXX0X(r3, "toString(...)");
        r0.add(new SearchDistrict(r2, r3, r11.latitude, r11.longitude));
        CommonAdapter<SearchDistrict> r12 = r8.mListAdapter;
        if (r12 == null) goto L8;
        r12.notifyDataSetChanged();
    L8:
        return Unit.OXO1;
    }

    private static final void requestGooglePoiSearch$lambda$0$1(Function1 r0, Object r1) {
        r0.invoke(r1);
    }

    private static final void requestGooglePoiSearch$lambda$0$2(Exception r2) {
        Intrinsics.X0O(r2, MqttServiceConstants.TRACE_EXCEPTION);
        LogUtils.e(new Object[]{"SearchMapsActivity", "获取地点信息失败: " + r2.getMessage()});
    }

    private static final void requestGooglePoiSearch$lambda$1(Function1 r0, Object r1) {
        r0.invoke(r1);
    }

    private static final void requestGooglePoiSearch$lambda$2(SearchMapsActivity r2, Exception r3) {
        Intrinsics.X0O(r3, MqttServiceConstants.TRACE_EXCEPTION);
        LogUtils.e(new Object[]{"SearchMapsActivity", "exception : " + r3 + " "});
        CommonAdapter<SearchDistrict> r4 = r2.mListAdapter;
        if (r4 == null) goto L6;
        r4.notifyDataSetChanged();
        return;
    }

    private static final EditText searchView_delegate$lambda$0(SearchMapsActivity r1) {
        return (EditText) r1.findViewById(R.id.search_view);
    }

    @aa1
    public final List<SearchDistrict> getMList() {
        return this.mList;
    }

    @tb1
    public final CommonAdapter<SearchDistrict> getMListAdapter() {
        return this.mListAdapter;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        if (this.isInChinaMainland == false) goto L5;
        return;
    L5:
        if (Places.isInitialized() == true) goto L7;
        Places.initialize(getApplicationContext(), getString(R.string.google_map_common_key));
    L7:
        this.placesClient = Places.createClient(this);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        EditText r0 = getSearchView();
        Intrinsics.O10IXXX0X(r0, "<get-searchView>(...)");
        r0.addTextChangedListener(new OXO1(this));
        findViewById(R.id.search_tv).setOnClickListener(new xx3(this));
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        AnonymousClass3 r1 = new AnonymousClass3(this, this.mList);
        getMRecyclerView().setAdapter(r1);
        this.mListAdapter = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_search_map;
    }

    @sf5(tag = I01XX0.OO)
    public final void onSearchGeography(@aa1 String r2) {
        Intrinsics.X0O(r2, "listJson");
        this.mList.clear();
        List r3 = (List) GsonUtils.fromJson(r2, new XIi00iiXO().getType());
        List<SearchDistrict> r0 = this.mList;
        Intrinsics.XXI(r3);
        r0.addAll(r3);
        CommonAdapter<SearchDistrict> r4 = this.mListAdapter;
        if (r4 == null) goto L6;
        r4.notifyDataSetChanged();
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void requestPoiSearch(@aa1 String r2) {
        Intrinsics.X0O(r2, "keyword");
        I01XX0.OXO1(I01XX0.OX110i, r2);
    }

    public final void setMListAdapter(@tb1 CommonAdapter<SearchDistrict> r1) {
        this.mListAdapter = r1;
    }
}
