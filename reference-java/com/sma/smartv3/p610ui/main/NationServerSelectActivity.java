package com.sma.smartv3.p610ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C2702ms;
import com.android.mltcode.paycertificationapi.C2743ns;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.d11;
import com.android.mltcode.paycertificationapi.e11;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iiXIXiX;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.p610ui.main.NationServerSelectActivity;
import com.sma.smartv3.p610ui.p612me.DeveloperServerActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNationServerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,581:1\n39#2,3:582\n42#2:588\n44#2,2:590\n39#2,3:593\n42#2:599\n44#2,2:601\n1563#3:585\n1634#3,2:586\n1636#3:589\n1563#3:596\n1634#3,2:597\n1636#3:600\n1869#3,2:603\n1878#3,3:605\n1869#3,2:608\n1869#3,2:625\n774#3:627\n865#3,2:628\n1#4:592\n1#4:633\n55#5,12:610\n84#5,3:622\n69#6,3:630\n72#6,5:634\n*S KotlinDebug\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n*L\n123#1:582,3\n123#1:588\n123#1:590,2\n124#1:593,3\n124#1:599\n124#1:601,2\n123#1:585\n123#1:586,2\n123#1:589\n124#1:596\n124#1:597,2\n124#1:600\n147#1:603,2\n246#1:605,3\n291#1:608,2\n555#1:625,2\n564#1:627\n564#1:628,2\n536#1:633\n388#1:610,12\n388#1:622,3\n536#1:630,3\n536#1:634,5\n*E\n"})
public final class NationServerSelectActivity extends BaseActivity {

    @tb1
    private d11 curSelectedItem;
    private boolean isGetLocationCode;

    @tb1
    private CommonAdapter<d11> mAdapter;

    @tb1
    private C3006uq mLoadingPopup;

    @tb1
    private C2702ms mLocationClient;

    @tb1
    private go0 mLocationServerPopup;

    @tb1
    private go0 mTestServerRemindPop;

    @aa1
    private final String TAG = "NationServerSelectActivity";

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.p11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NationServerSelectActivity.rootView_delegate$lambda$0(this.f10269IO);
        }
    });

    @aa1
    private final Lazy selectServerButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.q11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NationServerSelectActivity.selectServerButton_delegate$lambda$0(this.f10489IO);
        }
    });

    @aa1
    private final Lazy selectServerIsShow$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.r11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NationServerSelectActivity.selectServerIsShow_delegate$lambda$0(this.f10727IO);
        }
    });

    @aa1
    private final Lazy mSelectNation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.s11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NationServerSelectActivity.mSelectNation_delegate$lambda$0(this.f10951IO);
        }
    });

    @aa1
    private final Lazy mChooseNationText$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NationServerSelectActivity.mChooseNationText_delegate$lambda$0(this.f11174IO);
        }
    });

    @aa1
    private final Lazy mNationSearchText$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.u11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NationServerSelectActivity.mNationSearchText_delegate$lambda$0(this.f11404IO);
        }
    });

    @aa1
    private final Lazy mNationSearchIcon$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.v11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NationServerSelectActivity.mNationSearchIcon_delegate$lambda$0(this.f11629IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.w11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NationServerSelectActivity.mRecyclerView_delegate$lambda$0(this.f11858IO);
        }
    });

    @aa1
    private final Lazy mNextStep$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return NationServerSelectActivity.mNextStep_delegate$lambda$0(this.f6790IO);
        }
    });

    @aa1
    private final List<d11> originalNationList = new ArrayList();

    @aa1
    private List<d11> mNationList = new ArrayList();

    @aa1
    private List<iiXIXiX> mContinentsList = new ArrayList();

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n389#2,3:83\n59#3:86\n62#4:87\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            NationServerSelectActivity.this.searchContent(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.main.NationServerSelectActivity$setRecyclerView$1, reason: case insensitive filesystem */
    public static final class C290071 extends CommonAdapter<d11> {
        public C290071(List<d11> list) {
            super(NationServerSelectActivity.this, R.layout.layout_item_nation_text, list);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder viewHolder, final d11 item, int i) {
            View view;
            TextView textView;
            Intrinsics.X0O(item, "item");
            if (viewHolder != null && (textView = (TextView) viewHolder.getView(R.id.item_content)) != null) {
                textView.setText(e11.m1709iO(item.XOO0ii0()));
            }
            View view2 = viewHolder != null ? viewHolder.getView(R.id.check_selected_icon) : null;
            if (view2 != null) {
                view2.setVisibility(item.m1647IO() ? 0 : 4);
            }
            if (viewHolder == null || (view = viewHolder.itemView) == null) {
                return;
            }
            final NationServerSelectActivity nationServerSelectActivity = NationServerSelectActivity.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.y11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    NationServerSelectActivity.access$upDataNationList(nationServerSelectActivity, item);
                }
            });
        }
    }

    public static final /* synthetic */ void access$upDataNationList(NationServerSelectActivity nationServerSelectActivity, d11 d11Var) {
        nationServerSelectActivity.upDataNationList(d11Var);
    }

    private final void changeViewStatus() {
        Iterator<T> it = this.mNationList.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    getMNextStep().setEnabled(z);
                    return;
                }
                d11 d11Var = (d11) it.next();
                if (z || d11Var.m1647IO()) {
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissLoading() {
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
    }

    private final TextView getMChooseNationText() {
        return (TextView) this.mChooseNationText$delegate.getValue();
    }

    private final ImageView getMNationSearchIcon() {
        return (ImageView) this.mNationSearchIcon$delegate.getValue();
    }

    private final EditText getMNationSearchText() {
        return (EditText) this.mNationSearchText$delegate.getValue();
    }

    private final Button getMNextStep() {
        return (Button) this.mNextStep$delegate.getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    private final View getMSelectNation() {
        return (View) this.mSelectNation$delegate.getValue();
    }

    private final void getNetworkNationData() {
        AndroidNetworking.get("https://api-oss.iot-solution.net/var-www/countrys/countries.min.json").setTag((Object) "https://api-oss.iot-solution.net/var-www/countrys/countries.min.json").setPriority(Priority.HIGH).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.ui.main.NationServerSelectActivity.getNetworkNationData.1
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError aNError) {
                i1O0OXO1O.OXO1.OXO1("NationServerSelectActivity error  " + aNError);
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject jSONObject) throws JSONException {
                if (jSONObject == null) {
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("continents") : null;
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("code", "");
                        Intrinsics.O10IXXX0X(strOptString, "optString(...)");
                        String strOptString2 = jSONObject2.optString("i18nKey", "");
                        Intrinsics.O10IXXX0X(strOptString2, "optString(...)");
                        arrayList.add(new iiXIXiX(strOptString, strOptString2));
                    }
                }
                a01.OXO1.XIi00iiXO().put(iiXIXiX.class.getName() + is3.OXO1, new Gson().toJson(CollectionsKt___CollectionsKt.i0I0O111I(arrayList)));
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("countries") : null;
                if (jSONArrayOptJSONArray2 != null) {
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i2);
                        String strOptString3 = jSONObject3.optString("code", "");
                        Intrinsics.O10IXXX0X(strOptString3, "optString(...)");
                        String strOptString4 = jSONObject3.optString("ct", "");
                        Intrinsics.O10IXXX0X(strOptString4, "optString(...)");
                        d11 d11VarXIi00iiXO = e11.XIi00iiXO(strOptString3, strOptString4, false, 4, null);
                        d11 d11Var = NationServerSelectActivity.this.curSelectedItem;
                        if (Intrinsics.XOO0ii0(d11Var != null ? d11Var.XOO0ii0() : null, d11VarXIi00iiXO.XOO0ii0())) {
                            d11VarXIi00iiXO.OIX0iXi(true);
                        }
                        arrayList2.add(d11VarXIi00iiXO);
                    }
                }
                a01.OXO1.XIi00iiXO().put(d11.class.getName() + is3.OXO1, new Gson().toJson(CollectionsKt___CollectionsKt.i0I0O111I(arrayList2)));
                NationServerSelectActivity.this.getMNationList().clear();
                NationServerSelectActivity.this.getMNationList().addAll(arrayList2);
                NationServerSelectActivity.this.originalNationList.clear();
                NationServerSelectActivity.this.originalNationList.addAll(arrayList2);
                NationServerSelectActivity.this.notifyDataSetChanged();
            }
        });
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final View getSelectServerButton() {
        return (View) this.selectServerButton$delegate.getValue();
    }

    private final View getSelectServerIsShow() {
        return (View) this.selectServerIsShow$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotoStartLocation() {
        if (UtilsKt.m38846X1()) {
            hr1.XXIIO1i11(hr1.OXO1, this, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.f11
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NationServerSelectActivity.gotoStartLocation$lambda$0(this.f6555IO, ((Boolean) obj).booleanValue());
                }
            }, 2, null);
        } else {
            locationServerRemind();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoStartLocation$lambda$0(NationServerSelectActivity nationServerSelectActivity, boolean z) {
        if (z) {
            nationServerSelectActivity.startLocationClient();
        } else {
            ToastUtils.showLong("No location permissions", new Object[0]);
        }
        return Unit.OXO1;
    }

    private final void locationServerRemind() {
        if (this.mLocationServerPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.m1865iX(Integer.valueOf(R.string.location_server_notification));
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.m11
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(NationServerSelectActivity.locationServerRemind$lambda$0$0(this.f9595IO));
                }
            });
            this.mLocationServerPopup = go0Var;
        }
        go0 go0Var2 = this.mLocationServerPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean locationServerRemind$lambda$0$0(NationServerSelectActivity nationServerSelectActivity) {
        nationServerSelectActivity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mChooseNationText_delegate$lambda$0(NationServerSelectActivity nationServerSelectActivity) {
        return (TextView) nationServerSelectActivity.findViewById(R.id.choose_nation_search_text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mNationSearchIcon_delegate$lambda$0(NationServerSelectActivity nationServerSelectActivity) {
        return (ImageView) nationServerSelectActivity.findViewById(R.id.nation_search_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText mNationSearchText_delegate$lambda$0(NationServerSelectActivity nationServerSelectActivity) {
        return (EditText) nationServerSelectActivity.findViewById(R.id.nation_search_text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mNextStep_delegate$lambda$0(NationServerSelectActivity nationServerSelectActivity) {
        return (Button) nationServerSelectActivity.findViewById(R.id.btn_nextStep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(NationServerSelectActivity nationServerSelectActivity) {
        return (RecyclerView) nationServerSelectActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mSelectNation_delegate$lambda$0(NationServerSelectActivity nationServerSelectActivity) {
        return nationServerSelectActivity.findViewById(R.id.search_nation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean moreSetting$lambda$0$0(NationServerSelectActivity nationServerSelectActivity) {
        nationServerSelectActivity.startActivity(new Intent(nationServerSelectActivity, (Class<?>) DeveloperServerActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyDataSetChanged() {
        CommonAdapter<d11> commonAdapter = this.mAdapter;
        if (commonAdapter != null) {
            commonAdapter.notifyDataSetChanged();
        }
        changeViewStatus();
    }

    private final void onSetListener() {
        EditText mNationSearchText = getMNationSearchText();
        Intrinsics.O10IXXX0X(mNationSearchText, "<get-mNationSearchText>(...)");
        mNationSearchText.addTextChangedListener(new OXO1());
        getMNationSearchIcon().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.h11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NationServerSelectActivity.onSetListener$lambda$1(this.f7024IO, view);
            }
        });
        getSelectServerButton().setVisibility(8);
        getSelectServerIsShow().setOnLongClickListener(new View.OnLongClickListener() { // from class: com.android.mltcode.paycertificationapi.j11
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return NationServerSelectActivity.onSetListener$lambda$2(this.f8859IO, view);
            }
        });
        getMNextStep().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.k11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NationServerSelectActivity.onSetListener$lambda$3(this.f9086IO, view);
            }
        });
        getMSelectNation().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.l11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9328IO.gotoStartLocation();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSetListener$lambda$1(NationServerSelectActivity nationServerSelectActivity, View view) {
        nationServerSelectActivity.searchContent(nationServerSelectActivity.getMNationSearchText().getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetListener$lambda$2(NationServerSelectActivity nationServerSelectActivity, View view) {
        nationServerSelectActivity.getSelectServerButton().setVisibility(0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSetListener$lambda$3(NationServerSelectActivity nationServerSelectActivity, View view) {
        d11 d11Var = nationServerSelectActivity.curSelectedItem;
        if (d11Var == null) {
            ToastUtils.showLong(nationServerSelectActivity.getString(R.string.data_nation_server_select), new Object[0]);
        } else {
            Intrinsics.XXI(d11Var);
            nationServerSelectActivity.routeByCountry(d11Var.I0IIOi());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(NationServerSelectActivity nationServerSelectActivity) {
        return nationServerSelectActivity.findViewById(R.id.root_view);
    }

    private final void routeByCountry(String str) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " routeByCountry ct = " + str);
        int iHashCode = str.hashCode();
        if (iHashCode != 2092) {
            if (iHashCode != 2095) {
                if (iHashCode != 2155) {
                    if (iHashCode == 2224 && str.equals("EU")) {
                        onEuroAmerica();
                        return;
                    }
                } else if (str.equals("CN")) {
                    onChinaMainland();
                    return;
                }
            } else if (str.equals("AP")) {
                onAsiaPacific();
                return;
            }
        } else if (str.equals("AM")) {
            onSiliconValleyServerLl();
            return;
        }
        onAsiaPacific();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchContent(String str) {
        if (str.length() == 0) {
            this.mNationList.clear();
            for (d11 d11Var : this.originalNationList) {
                d11 d11Var2 = this.curSelectedItem;
                if (oe5.OX0X1O10X(d11Var2 != null ? d11Var2.XOO0ii0() : null, d11Var.XOO0ii0(), true)) {
                    d11Var.OIX0iXi(true);
                }
            }
            this.mNationList.addAll(this.originalNationList);
        } else {
            List<d11> list = this.originalNationList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt__StringsKt.iOiXX(((d11) obj).OIi0(), str, true)) {
                    arrayList.add(obj);
                }
            }
            this.mNationList.clear();
            this.mNationList.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View selectServerButton_delegate$lambda$0(NationServerSelectActivity nationServerSelectActivity) {
        return nationServerSelectActivity.findViewById(R.id.server_select_img_button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View selectServerIsShow_delegate$lambda$0(NationServerSelectActivity nationServerSelectActivity) {
        return nationServerSelectActivity.findViewById(R.id.server_select_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDataNationList(String str) {
        int i = 0;
        int iMin = 0;
        for (Object obj : this.mNationList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            d11 d11Var = (d11) obj;
            d11Var.OIX0iXi(false);
            if (oe5.OX0X1O10X(str, d11Var.XOO0ii0(), true)) {
                d11Var.OIX0iXi(true);
                this.curSelectedItem = d11Var;
                iMin = i;
            }
            i = i2;
        }
        if (this.curSelectedItem != null) {
            TextView mChooseNationText = getMChooseNationText();
            d11 d11Var2 = this.curSelectedItem;
            Intrinsics.XXI(d11Var2);
            mChooseNationText.setText(e11.m1709iO(d11Var2.XOO0ii0()));
        }
        notifyDataSetChanged();
        RecyclerView.LayoutManager layoutManager = getMRecyclerView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int iFindFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0;
        if (iMin < this.originalNationList.size() - 5) {
            if (iFindFirstVisibleItemPosition > iMin) {
                iMin = Math.max(0, iMin - 4);
            } else if (iFindFirstVisibleItemPosition < iMin) {
                iMin = Math.min(this.originalNationList.size() - 1, iMin + 4);
            }
        }
        getMRecyclerView().smoothScrollToPosition(iMin);
    }

    private final void setRecyclerView() {
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        this.mAdapter = new C290071(this.mNationList);
        getMRecyclerView().setAdapter(this.mAdapter);
    }

    private final void showLoading(String str) {
        C3006uq c3006uq = new C3006uq(this);
        if (!TextUtils.isEmpty(str)) {
            c3006uq.iOOX010X(str);
        }
        this.mLoadingPopup = c3006uq;
        c3006uq.I0iXXO(false);
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
    }

    public static /* synthetic */ void showLoading$default(NationServerSelectActivity nationServerSelectActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        nationServerSelectActivity.showLoading(str);
    }

    private final void startLocationClient() {
        showLoading$default(this, null, 1, null);
        if (this.mLocationClient == null) {
            this.mLocationClient = C2743ns.XIi00iiXO(new IO0OI() { // from class: com.sma.smartv3.ui.main.NationServerSelectActivity.startLocationClient.1
                @Override // com.android.mltcode.paycertificationapi.IO0OI
                public void OXO1(CustomLocation location) {
                    Intrinsics.X0O(location, "location");
                    if (NationServerSelectActivity.this.isGetLocationCode()) {
                        return;
                    }
                    NationServerSelectActivity.this.setGetLocationCode(true);
                    NationServerSelectActivity.this.stopLocationClient();
                    i1O0OXO1O.OXO1.OXO1(NationServerSelectActivity.this.TAG + ", onLocationChange " + location);
                    XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(NationServerSelectActivity.this), null, null, new C18860x60996c55(NationServerSelectActivity.this, location, null), 3, null);
                }

                @Override // com.android.mltcode.paycertificationapi.IO0OI
                public void onError(String message) {
                    Intrinsics.X0O(message, "message");
                    i1O0OXO1O.OXO1.OXO1(NationServerSelectActivity.this.TAG + ", Location error: " + message);
                    NationServerSelectActivity.this.setGetLocationCode(false);
                    NationServerSelectActivity.this.dismissLoading();
                }
            }, false, 2, null);
        }
        C2702ms c2702ms = this.mLocationClient;
        if (c2702ms != null) {
            c2702ms.IiI10X(0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLocationClient() {
        C2702ms c2702ms = this.mLocationClient;
        if (c2702ms != null) {
            c2702ms.I0IIOi();
        }
    }

    private final void toStartLogin() {
        a01.OXO1.IiI10X().put(b01.O001I, true);
        i72.OXO1.XOiXXOO(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upDataNationList(d11 d11Var) {
        for (d11 d11Var2 : this.mNationList) {
            d11Var2.OIX0iXi(false);
            if (Intrinsics.XOO0ii0(d11Var.XOO0ii0(), d11Var2.XOO0ii0())) {
                this.curSelectedItem = d11Var;
                d11Var2.OIX0iXi(true);
            }
        }
        notifyDataSetChanged();
    }

    @tb1
    public final CommonAdapter<d11> getMAdapter() {
        return this.mAdapter;
    }

    @aa1
    public final List<iiXIXiX> getMContinentsList() {
        return this.mContinentsList;
    }

    @aa1
    public final List<d11> getMNationList() {
        return this.mNationList;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        Collection collectionM39402iI;
        Collection collectionM39402iI2;
        setBarView();
        getMNextStep().setEnabled(false);
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.XIi00iiXO().getString(iiXIXiX.class.getName() + is3.OXO1)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), iiXIXiX.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        Collection collectionXO0O10 = collectionM39402iI;
        if (collectionXO0O10.isEmpty()) {
            collectionXO0O10 = e11.XO0O10();
        }
        this.mContinentsList = CollectionsKt___CollectionsKt.OO0Oi10(collectionXO0O10);
        try {
            JsonArray asJsonArray2 = JsonParser.parseString(a01.OXO1.XIi00iiXO().getString(d11.class.getName() + is3.OXO1)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray2);
            collectionM39402iI2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray2, 10));
            Iterator<JsonElement> it2 = asJsonArray2.iterator();
            while (it2.hasNext()) {
                collectionM39402iI2.add(new Gson().fromJson(it2.next(), d11.class));
            }
        } catch (Exception unused2) {
            collectionM39402iI2 = CollectionsKt__CollectionsKt.m39402iI();
        }
        Collection collectionO00 = collectionM39402iI2;
        if (collectionO00.isEmpty()) {
            collectionO00 = e11.O00();
        }
        List<d11> listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(collectionO00);
        this.mNationList = listOO0Oi10;
        this.originalNationList.addAll(listOO0Oi10);
        setRecyclerView();
        getNetworkNationData();
        onSetListener();
        if (UtilsKt.m38846X1() && hr1.OXO1.X00Xi1X(this)) {
            gotoStartLocation();
        }
    }

    public final boolean isGetLocationCode() {
        return this.isGetLocationCode;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_nation_server_select;
    }

    public final void moreSetting(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTestServerRemindPop == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.m1865iX(Integer.valueOf(R.string.test_function_remind));
            go0Var.IXXOO(Integer.valueOf(GravityCompat.START));
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.open_test_function, new Function0() { // from class: com.android.mltcode.paycertificationapi.n11
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(NationServerSelectActivity.moreSetting$lambda$0$0(this.f9831IO));
                }
            });
            this.mTestServerRemindPop = go0Var;
        }
        go0 go0Var2 = this.mTestServerRemindPop;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public final void onAsiaPacific() {
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.asia_pacific));
        toStartLogin();
    }

    public final void onChinaMainland() {
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.f6332iO);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.china_mainland));
        toStartLogin();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        dismissLoading();
        super.onDestroy();
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onEmailLoginDone(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        if (isFinishing()) {
            return;
        }
        finish();
    }

    public final void onEuroAmerica() {
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.XIi00iiXO);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.europe_and_america));
        toStartLogin();
    }

    public final void onSiliconValleyServerLl() {
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.X01IiOiIi, e44.O00);
        a01Var.IiI10X().put(b01.II1Xi0, getString(R.string.silicon_valley_of_america_name));
        toStartLogin();
    }

    public final void setBarView() {
        transparentStatusBar();
    }

    public final void setGetLocationCode(boolean z) {
        this.isGetLocationCode = z;
    }

    public final void setMAdapter(@tb1 CommonAdapter<d11> commonAdapter) {
        this.mAdapter = commonAdapter;
    }

    public final void setMContinentsList(@aa1 List<iiXIXiX> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mContinentsList = list;
    }

    public final void setMNationList(@aa1 List<d11> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mNationList = list;
    }
}
