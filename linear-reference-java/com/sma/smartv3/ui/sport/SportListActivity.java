package com.sma.smartv3.ui.sport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a05;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b05;
import com.android.mltcode.paycertificationapi.c05;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.xz4;
import com.android.mltcode.paycertificationapi.yz4;
import com.android.mltcode.paycertificationapi.zz4;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportListActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;
    private boolean isEdit;
    public List<Integer> mAllList;

    @aa1
    private final Lazy mAllRecyclerView$delegate;
    public List<Integer> mBtnList;

    @aa1
    private final Lazy mChangeDataTypeBtn$delegate;

    @aa1
    private final Lazy mHotRecyclerView$delegate;
    public List<Integer> mTopList;
    private final int spanCount;

    public SportListActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new zz4(this));
        this.mHotRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new a05(this));
        this.mAllRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new b05(this));
        this.mChangeDataTypeBtn$delegate = LazyKt__LazyJVMKt.iO(new c05(this));
        this.spanCount = 4;
    }

    public static /* synthetic */ void I0iXXO(SportListActivity r0, boolean r1, int r2, View r3) {
        setViewHolder$lambda$2(r0, r1, r2, r3);
    }

    public static /* synthetic */ void O10IXXX0X(SportListActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView OIX0iXi(SportListActivity r0) {
        return mChangeDataTypeBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView X0O(SportListActivity r0) {
        return mHotRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView X1ii(SportListActivity r0) {
        return mAllRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XXI(SportListActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(SportListActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ void access$setViewHolder(SportListActivity r0, ViewHolder r1, int r2, int r3, boolean r4) {
        r0.setViewHolder(r1, r2, r3, r4);
    }

    private static final void initView$lambda$0(SportListActivity r2, View r3) {
        if (r2.isEdit == false) goto L5;
        r2.isEdit = false;
        r2.getMChangeDataTypeBtn().setText(r2.getString(R.string.edit));
        a15.XO0O10(r2.getMTopList());
        I01XX0.XIi00iiXO(a15.XIi00iiXO, null, 2, null);
    L6:
        RecyclerView r4 = r2.getMHotRecyclerView();
        if (r4 == null) goto L11;
        RecyclerView.Adapter r5 = r4.getAdapter();
        if (r5 == null) goto L11;
        r5.notifyDataSetChanged();
    L11:
        RecyclerView r6 = r2.getMAllRecyclerView();
        if (r6 == null) goto L17;
        RecyclerView.Adapter r7 = r6.getAdapter();
        if (r7 == null) goto L18;
        r7.notifyDataSetChanged();
        return;
    L18:
        return;
    L17:
        return;
    L5:
        r2.getMChangeDataTypeBtn().setText(r2.getString(R.string.save));
        r2.isEdit = true;
        goto L6
    }

    private static final RecyclerView mAllRecyclerView_delegate$lambda$0(SportListActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.all_recycler_view);
    }

    private static final TextView mChangeDataTypeBtn_delegate$lambda$0(SportListActivity r1) {
        return (TextView) r1.findViewById(R.id.change_data_type);
    }

    private static final RecyclerView mHotRecyclerView_delegate$lambda$0(SportListActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.top_recycler_view);
    }

    private final void setAllList() {
        setBtnListData();
        RecyclerView r0 = getMAllRecyclerView();
        if (r0 == null) goto L5;
        r0.setLayoutManager(new GridLayoutManager(this, this.spanCount));
    L5:
        RecyclerView r1 = getMAllRecyclerView();
        if (r1 == null) goto L9;
        final Activity r2 = getMContext();
        final List<Integer> r3 = getMBtnList();
        r1.setAdapter(new AnonymousClass1(this, r2, r3));
        return;
    }

    private final void setBtnListData() {
        getMBtnList().clear();
        Iterator<Integer> r0 = getMAllList().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        int r1 = r0.next().intValue();
        if (getMTopList().contains(Integer.valueOf(r1)) == true) goto L4;
        getMBtnList().add(Integer.valueOf(r1));
        goto L4
    }

    private final void setHotListView() {
        setMTopList(CollectionsKt___CollectionsKt.OO0Oi10(a15.XIi00iiXO()));
        RecyclerView r0 = getMHotRecyclerView();
        if (r0 == null) goto L5;
        r0.setLayoutManager(new GridLayoutManager(this, this.spanCount));
    L5:
        RecyclerView r1 = getMHotRecyclerView();
        if (r1 == null) goto L9;
        final Activity r2 = getMContext();
        final List<Integer> r3 = getMTopList();
        r1.setAdapter(new C34851(this, r2, r3));
        return;
    }

    private final void setViewHolder(ViewHolder r5, final int r6, int r7, final boolean r8) {
        Activity r0 = getMContext();
        SportRecordData r1 = new SportRecordData();
        r1.setMMode(r6);
        Unit r2 = Unit.OXO1;
        r5.setText(R.id.start_list_tv_name, getString(SportRecordDataKt.getWorkoutName(r0, r1)));
        Activity r3 = getMContext();
        SportRecordData r4 = new SportRecordData();
        r4.setMMode(r6);
        r5.setImageResource(R.id.start_list_icon_im, SportRecordDataKt.getWorkoutImage(r3, r4));
        if (a15.iO(r6) == false) goto L5;
        r5.getView(R.id.start_list_icon_im).setBackgroundResource(R.drawable.shape_sport_oval_orange_bg);
    L6:
        ImageView r9 = (ImageView) r5.getView(R.id.start_list_icon_im_type);
        if (this.isEdit == true) goto L9;
        r9.setVisibility(8);
    L21:
        r5.itemView.setOnClickListener(new yz4(this, r8, r6));
        return;
    L9:
        if (r8 == false) goto L14;
        r9.setImageResource(R.drawable.sport_delete_mode_icon);
        if (r7 < 4) goto L13;
        r9.setVisibility(0);
        goto L21
    L13:
        r9.setVisibility(8);
        goto L21
    L14:
        r9.setImageResource(R.drawable.sport_add_mode_icon);
        if (getMTopList().contains(Integer.valueOf(r6)) == false) goto L18;
        r9.setVisibility(8);
        goto L21
    L18:
        if (getMTopList().size() >= 8) goto L21;
        r9.setVisibility(0);
        goto L21
    L5:
        r5.getView(R.id.start_list_icon_im).setBackgroundResource(R.drawable.shape_sport_oval_green_bg);
        goto L6
    }

    private static final void setViewHolder$lambda$2(SportListActivity r1, boolean r2, int r3, View r4) {
        if (r1.isEdit == false) goto L29;
        if (r2 == false) goto L16;
        int r5 = r1.getMTopList().indexOf(Integer.valueOf(r3));
        if (r5 != (-1)) goto L8;
    L23:
        RecyclerView r6 = r1.getMAllRecyclerView();
        if (r6 == null) goto L31;
        RecyclerView.Adapter r7 = r6.getAdapter();
        if (r7 == null) goto L32;
        r7.notifyDataSetChanged();
        return;
    L32:
        return;
    L31:
        return;
    L8:
        if (r5 < 4) goto L23;
        r1.getMTopList().remove(r5);
        RecyclerView r8 = r1.getMHotRecyclerView();
        if (r8 == null) goto L14;
        RecyclerView.Adapter r9 = r8.getAdapter();
        if (r9 == null) goto L14;
        r9.notifyItemRemoved(r5);
    L14:
        r1.setBtnListData();
        goto L23
    L16:
        if (r1.getMTopList().size() >= 8) goto L23;
        r1.getMTopList().add(Integer.valueOf(r3));
        RecyclerView r10 = r1.getMHotRecyclerView();
        if (r10 == null) goto L22;
        RecyclerView.Adapter r11 = r10.getAdapter();
        if (r11 == null) goto L22;
        r11.notifyItemInserted(r1.getMTopList().size() - 1);
    L22:
        r1.setBtnListData();
        goto L23
    L29:
        Intent r12 = new Intent(r1.getMContext(), AppStartSportActivity.class);
        r12.putExtra("mArg1", r3);
        r1.getMContext().startActivity(r12);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    @aa1
    public final List<Integer> getMAllList() {
        List<Integer> r0 = this.mAllList;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mAllList");
        return null;
    }

    public final RecyclerView getMAllRecyclerView() {
        return (RecyclerView) getValue();
    }

    @aa1
    public final List<Integer> getMBtnList() {
        List<Integer> r0 = this.mBtnList;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mBtnList");
        return null;
    }

    public final TextView getMChangeDataTypeBtn() {
        return (TextView) getValue();
    }

    public final RecyclerView getMHotRecyclerView() {
        return (RecyclerView) getValue();
    }

    @aa1
    public final List<Integer> getMTopList() {
        List<Integer> r0 = this.mTopList;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mTopList");
        return null;
    }

    public final int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.all_sport));
        setMAllList(CollectionsKt___CollectionsKt.OO0Oi10(a15.OXO1()));
        setMBtnList(new ArrayList());
        setHotListView();
        setAllList();
        getMChangeDataTypeBtn().setOnClickListener(new xz4(this));
    }

    public final boolean isEdit() {
        return this.isEdit;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_list_mode;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void setEdit(boolean r1) {
        this.isEdit = r1;
    }

    public final void setMAllList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAllList = r2;
    }

    public final void setMBtnList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBtnList = r2;
    }

    public final void setMTopList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTopList = r2;
    }
}
