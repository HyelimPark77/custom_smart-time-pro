package com.sma.smartv3.p610ui.device;

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
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
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
import com.sma.smartv3.p610ui.device.SearchMapsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nSearchMapsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n55#2,12:187\n84#2,3:199\n1#3:202\n*S KotlinDebug\n*F\n+ 1 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n*L\n81#1:187,12\n81#1:199,3\n*E\n"})
public class SearchMapsActivity extends BaseActivity {

    @tb1
    private CommonAdapter<SearchDistrict> mListAdapter;

    @tb1
    private PlacesClient placesClient;

    @tb1
    private XiOIO searchJob;

    @aa1
    private final Lazy searchView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sx3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SearchMapsActivity.searchView_delegate$lambda$0(this.f11152IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tx3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SearchMapsActivity.mRecyclerView_delegate$lambda$0(this.f11382IO);
        }
    });

    @aa1
    private final List<SearchDistrict> mList = new ArrayList();
    private boolean isInChinaMainland = a01.OXO1.OXO1().getBoolean(b01.XiOIO, true);

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n82#2,12:83\n59#3:95\n62#4:96\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            XiOIO xiOIO = SearchMapsActivity.this.searchJob;
            if (xiOIO != null) {
                XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
            }
            SearchMapsActivity searchMapsActivity = SearchMapsActivity.this;
            searchMapsActivity.searchJob = XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(searchMapsActivity), IXOX0Xiii.m712iO(), null, new SearchMapsActivity$initView$1$1(SearchMapsActivity.this, editable, null), 2, null);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class XIi00iiXO extends TypeToken<List<? extends SearchDistrict>> {
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.SearchMapsActivity$initView$3 */
    public static final class C187703 extends CommonAdapter<SearchDistrict> {
        public C187703(List<SearchDistrict> list) {
            super(SearchMapsActivity.this, R.layout.item_search_map_district, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(SearchDistrict searchDistrict, SearchMapsActivity searchMapsActivity, View view) {
            Intent intent = new Intent();
            intent.putExtra("MAP_POINT_LAT", searchDistrict.getLatitude());
            intent.putExtra("MAP_POINT_LON", searchDistrict.getLongitude());
            searchMapsActivity.setResult(-1, intent);
            searchMapsActivity.finish();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, final SearchDistrict item, int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(item, "item");
            holder.setText(R.id.off_line_map_title, item.getName());
            holder.setText(R.id.off_line_map_dis, item.getDistrict());
            View view = holder.itemView;
            final SearchMapsActivity searchMapsActivity = SearchMapsActivity.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.by3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SearchMapsActivity.C187703.convert$lambda$0(item, searchMapsActivity, view2);
                }
            });
        }
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    private final EditText getSearchView() {
        return (EditText) this.searchView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SearchMapsActivity searchMapsActivity, View view) {
        searchMapsActivity.mList.clear();
        CommonAdapter<SearchDistrict> commonAdapter = searchMapsActivity.mListAdapter;
        if (commonAdapter != null) {
            commonAdapter.notifyDataSetChanged();
        }
        Editable text = searchMapsActivity.getSearchView().getText();
        Intrinsics.XXI(text);
        if (text.length() > 0) {
            if (searchMapsActivity.isInChinaMainland) {
                searchMapsActivity.requestPoiSearch(text.toString());
            } else {
                searchMapsActivity.requestGooglePoiSearch(text.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(SearchMapsActivity searchMapsActivity) {
        return (RecyclerView) searchMapsActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestGooglePoiSearch(String str) {
        Task<FindAutocompletePredictionsResponse> taskFindAutocompletePredictions;
        CustomLocation customLocationXXIIO1i11 = UtilsKt.XXIIO1i11();
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequestBuild = FindAutocompletePredictionsRequest.builder().setQuery(str).setOrigin(new LatLng(customLocationXXIIO1i11.XO0O10(), customLocationXXIIO1i11.IiI10X())).build();
        PlacesClient placesClient = this.placesClient;
        if (placesClient == null || (taskFindAutocompletePredictions = placesClient.findAutocompletePredictions(findAutocompletePredictionsRequestBuild)) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: com.android.mltcode.paycertificationapi.ux3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SearchMapsActivity.requestGooglePoiSearch$lambda$0(this.f11592IO, (FindAutocompletePredictionsResponse) obj);
            }
        };
        Task<FindAutocompletePredictionsResponse> taskAddOnSuccessListener = taskFindAutocompletePredictions.addOnSuccessListener(new OnSuccessListener() { // from class: com.android.mltcode.paycertificationapi.vx3
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                function1.invoke2(obj);
            }
        });
        if (taskAddOnSuccessListener != null) {
            taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.android.mltcode.paycertificationapi.wx3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    SearchMapsActivity.requestGooglePoiSearch$lambda$2(this.OXO1, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGooglePoiSearch$lambda$0(final SearchMapsActivity searchMapsActivity, FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
        Task<FetchPlaceResponse> taskFetchPlace;
        List<AutocompletePrediction> autocompletePredictions = findAutocompletePredictionsResponse.getAutocompletePredictions();
        searchMapsActivity.mList.clear();
        for (final AutocompletePrediction autocompletePrediction : autocompletePredictions) {
            FetchPlaceRequest fetchPlaceRequestBuild = FetchPlaceRequest.builder(autocompletePrediction.getPlaceId(), X0iO1XX.I0iXXO(Place.Field.LAT_LNG)).build();
            PlacesClient placesClient = searchMapsActivity.placesClient;
            if (placesClient != null && (taskFetchPlace = placesClient.fetchPlace(fetchPlaceRequestBuild)) != null) {
                final Function1 function1 = new Function1() { // from class: com.android.mltcode.paycertificationapi.yx3
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SearchMapsActivity.requestGooglePoiSearch$lambda$0$0(this.f12478IO, autocompletePrediction, (FetchPlaceResponse) obj);
                    }
                };
                Task<FetchPlaceResponse> taskAddOnSuccessListener = taskFetchPlace.addOnSuccessListener(new OnSuccessListener() { // from class: com.android.mltcode.paycertificationapi.zx3
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        function1.invoke2(obj);
                    }
                });
                if (taskAddOnSuccessListener != null) {
                    taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.android.mltcode.paycertificationapi.ay3
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception exc) {
                            SearchMapsActivity.requestGooglePoiSearch$lambda$0$2(exc);
                        }
                    });
                }
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGooglePoiSearch$lambda$0$0(SearchMapsActivity searchMapsActivity, AutocompletePrediction autocompletePrediction, FetchPlaceResponse fetchPlaceResponse) {
        LatLng latLng = fetchPlaceResponse.getPlace().getLatLng();
        if (latLng != null) {
            List<SearchDistrict> list = searchMapsActivity.mList;
            String string = autocompletePrediction.getPrimaryText(new StyleSpan(0)).toString();
            Intrinsics.O10IXXX0X(string, "toString(...)");
            String string2 = autocompletePrediction.getFullText(new StyleSpan(0)).toString();
            Intrinsics.O10IXXX0X(string2, "toString(...)");
            list.add(new SearchDistrict(string, string2, latLng.latitude, latLng.longitude));
            CommonAdapter<SearchDistrict> commonAdapter = searchMapsActivity.mListAdapter;
            if (commonAdapter != null) {
                commonAdapter.notifyDataSetChanged();
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestGooglePoiSearch$lambda$0$2(Exception exception) {
        Intrinsics.X0O(exception, "exception");
        LogUtils.m11129e("SearchMapsActivity", "获取地点信息失败: " + exception.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestGooglePoiSearch$lambda$2(SearchMapsActivity searchMapsActivity, Exception exception) {
        Intrinsics.X0O(exception, "exception");
        LogUtils.m11129e("SearchMapsActivity", "exception : " + exception + " ");
        CommonAdapter<SearchDistrict> commonAdapter = searchMapsActivity.mListAdapter;
        if (commonAdapter != null) {
            commonAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText searchView_delegate$lambda$0(SearchMapsActivity searchMapsActivity) {
        return (EditText) searchMapsActivity.findViewById(R.id.search_view);
    }

    @aa1
    public final List<SearchDistrict> getMList() {
        return this.mList;
    }

    @tb1
    public final CommonAdapter<SearchDistrict> getMListAdapter() {
        return this.mListAdapter;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        if (this.isInChinaMainland) {
            return;
        }
        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), getString(R.string.google_map_common_key));
        }
        this.placesClient = Places.createClient(this);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        EditText searchView = getSearchView();
        Intrinsics.O10IXXX0X(searchView, "<get-searchView>(...)");
        searchView.addTextChangedListener(new OXO1());
        findViewById(R.id.search_tv).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xx3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchMapsActivity.initView$lambda$1(this.f12255IO, view);
            }
        });
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        C187703 c187703 = new C187703(this.mList);
        getMRecyclerView().setAdapter(c187703);
        this.mListAdapter = c187703;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_search_map;
    }

    @sf5(tag = I01XX0.f1087OO)
    public final void onSearchGeography(@aa1 String listJson) {
        Intrinsics.X0O(listJson, "listJson");
        this.mList.clear();
        List list = (List) GsonUtils.fromJson(listJson, new XIi00iiXO().getType());
        List<SearchDistrict> list2 = this.mList;
        Intrinsics.XXI(list);
        list2.addAll(list);
        CommonAdapter<SearchDistrict> commonAdapter = this.mListAdapter;
        if (commonAdapter != null) {
            commonAdapter.notifyDataSetChanged();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public void requestPoiSearch(@aa1 String keyword) {
        Intrinsics.X0O(keyword, "keyword");
        I01XX0.OXO1(I01XX0.OX110i, keyword);
    }

    public final void setMListAdapter(@tb1 CommonAdapter<SearchDistrict> commonAdapter) {
        this.mListAdapter = commonAdapter;
    }
}
