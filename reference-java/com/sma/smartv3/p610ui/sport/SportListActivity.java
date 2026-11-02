package com.sma.smartv3.p610ui.sport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p610ui.sport.SportListActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportListActivity extends BaseActivity {
    private boolean isEdit;
    public List<Integer> mAllList;
    public List<Integer> mBtnList;
    public List<Integer> mTopList;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportListActivity.abhTitleCenter_delegate$lambda$0(this.f12730IO);
        }
    });

    @aa1
    private final Lazy mHotRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a05
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportListActivity.mHotRecyclerView_delegate$lambda$0(this.f5389IO);
        }
    });

    @aa1
    private final Lazy mAllRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b05
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportListActivity.mAllRecyclerView_delegate$lambda$0(this.f5640IO);
        }
    });

    @aa1
    private final Lazy mChangeDataTypeBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c05
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportListActivity.mChangeDataTypeBtn_delegate$lambda$0(this.f5870IO);
        }
    });
    private final int spanCount = 4;

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(SportListActivity sportListActivity) {
        return (PFMedium) sportListActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportListActivity sportListActivity, View view) {
        RecyclerView.Adapter adapter;
        RecyclerView.Adapter adapter2;
        if (sportListActivity.isEdit) {
            sportListActivity.isEdit = false;
            sportListActivity.getMChangeDataTypeBtn().setText(sportListActivity.getString(R.string.edit));
            a15.XO0O10(sportListActivity.getMTopList());
            I01XX0.XIi00iiXO(a15.XIi00iiXO, null, 2, null);
        } else {
            sportListActivity.getMChangeDataTypeBtn().setText(sportListActivity.getString(R.string.save));
            sportListActivity.isEdit = true;
        }
        RecyclerView mHotRecyclerView = sportListActivity.getMHotRecyclerView();
        if (mHotRecyclerView != null && (adapter2 = mHotRecyclerView.getAdapter()) != null) {
            adapter2.notifyDataSetChanged();
        }
        RecyclerView mAllRecyclerView = sportListActivity.getMAllRecyclerView();
        if (mAllRecyclerView == null || (adapter = mAllRecyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mAllRecyclerView_delegate$lambda$0(SportListActivity sportListActivity) {
        return (RecyclerView) sportListActivity.findViewById(R.id.all_recycler_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mChangeDataTypeBtn_delegate$lambda$0(SportListActivity sportListActivity) {
        return (TextView) sportListActivity.findViewById(R.id.change_data_type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mHotRecyclerView_delegate$lambda$0(SportListActivity sportListActivity) {
        return (RecyclerView) sportListActivity.findViewById(R.id.top_recycler_view);
    }

    private final void setAllList() {
        setBtnListData();
        RecyclerView mAllRecyclerView = getMAllRecyclerView();
        if (mAllRecyclerView != null) {
            mAllRecyclerView.setLayoutManager(new GridLayoutManager(this, this.spanCount));
        }
        RecyclerView mAllRecyclerView2 = getMAllRecyclerView();
        if (mAllRecyclerView2 != null) {
            mAllRecyclerView2.setAdapter(new CommonAdapter<Integer>(getMContext(), getMBtnList()) { // from class: com.sma.smartv3.ui.sport.SportListActivity.setAllList.1
                @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
                public /* bridge */ /* synthetic */ void convert(ViewHolder viewHolder, Integer num, int i) {
                    convert(viewHolder, num.intValue(), i);
                }

                public void convert(ViewHolder itemHolder, int i, int i2) {
                    Intrinsics.X0O(itemHolder, "itemHolder");
                    SportListActivity.this.setViewHolder(itemHolder, i, i2, false);
                }
            });
        }
    }

    private final void setBtnListData() {
        getMBtnList().clear();
        Iterator<Integer> it = getMAllList().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (!getMTopList().contains(Integer.valueOf(iIntValue))) {
                getMBtnList().add(Integer.valueOf(iIntValue));
            }
        }
    }

    private final void setHotListView() {
        setMTopList(CollectionsKt___CollectionsKt.OO0Oi10(a15.XIi00iiXO()));
        RecyclerView mHotRecyclerView = getMHotRecyclerView();
        if (mHotRecyclerView != null) {
            mHotRecyclerView.setLayoutManager(new GridLayoutManager(this, this.spanCount));
        }
        RecyclerView mHotRecyclerView2 = getMHotRecyclerView();
        if (mHotRecyclerView2 != null) {
            mHotRecyclerView2.setAdapter(new CommonAdapter<Integer>(getMContext(), getMTopList()) { // from class: com.sma.smartv3.ui.sport.SportListActivity.setHotListView.1
                @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
                public /* bridge */ /* synthetic */ void convert(ViewHolder viewHolder, Integer num, int i) {
                    convert(viewHolder, num.intValue(), i);
                }

                public void convert(ViewHolder itemHolder, int i, int i2) {
                    Intrinsics.X0O(itemHolder, "itemHolder");
                    SportListActivity.this.setViewHolder(itemHolder, i, i2, true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewHolder(ViewHolder viewHolder, final int i, int i2, final boolean z) {
        Activity mContext = getMContext();
        SportRecordData sportRecordData = new SportRecordData();
        sportRecordData.setMMode(i);
        Unit unit = Unit.OXO1;
        viewHolder.setText(R.id.start_list_tv_name, getString(SportRecordDataKt.getWorkoutName(mContext, sportRecordData)));
        Activity mContext2 = getMContext();
        SportRecordData sportRecordData2 = new SportRecordData();
        sportRecordData2.setMMode(i);
        viewHolder.setImageResource(R.id.start_list_icon_im, SportRecordDataKt.getWorkoutImage(mContext2, sportRecordData2));
        if (a15.m1445iO(i)) {
            viewHolder.getView(R.id.start_list_icon_im).setBackgroundResource(R.drawable.shape_sport_oval_orange_bg);
        } else {
            viewHolder.getView(R.id.start_list_icon_im).setBackgroundResource(R.drawable.shape_sport_oval_green_bg);
        }
        ImageView imageView = (ImageView) viewHolder.getView(R.id.start_list_icon_im_type);
        if (!this.isEdit) {
            imageView.setVisibility(8);
        } else if (z) {
            imageView.setImageResource(R.drawable.sport_delete_mode_icon);
            if (i2 >= 4) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        } else {
            imageView.setImageResource(R.drawable.sport_add_mode_icon);
            if (getMTopList().contains(Integer.valueOf(i))) {
                imageView.setVisibility(8);
            } else if (getMTopList().size() < 8) {
                imageView.setVisibility(0);
            }
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.yz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportListActivity.setViewHolder$lambda$2(this.f12488IO, z, i, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewHolder$lambda$2(SportListActivity sportListActivity, boolean z, int i, View view) {
        RecyclerView.Adapter adapter;
        RecyclerView.Adapter adapter2;
        RecyclerView.Adapter adapter3;
        if (!sportListActivity.isEdit) {
            Intent intent = new Intent(sportListActivity.getMContext(), (Class<?>) AppStartSportActivity.class);
            intent.putExtra("mArg1", i);
            sportListActivity.getMContext().startActivity(intent);
            return;
        }
        if (z) {
            int iIndexOf = sportListActivity.getMTopList().indexOf(Integer.valueOf(i));
            if (iIndexOf != -1 && iIndexOf >= 4) {
                sportListActivity.getMTopList().remove(iIndexOf);
                RecyclerView mHotRecyclerView = sportListActivity.getMHotRecyclerView();
                if (mHotRecyclerView != null && (adapter3 = mHotRecyclerView.getAdapter()) != null) {
                    adapter3.notifyItemRemoved(iIndexOf);
                }
                sportListActivity.setBtnListData();
            }
        } else if (sportListActivity.getMTopList().size() < 8) {
            sportListActivity.getMTopList().add(Integer.valueOf(i));
            RecyclerView mHotRecyclerView2 = sportListActivity.getMHotRecyclerView();
            if (mHotRecyclerView2 != null && (adapter = mHotRecyclerView2.getAdapter()) != null) {
                adapter.notifyItemInserted(sportListActivity.getMTopList().size() - 1);
            }
            sportListActivity.setBtnListData();
        }
        RecyclerView mAllRecyclerView = sportListActivity.getMAllRecyclerView();
        if (mAllRecyclerView == null || (adapter2 = mAllRecyclerView.getAdapter()) == null) {
            return;
        }
        adapter2.notifyDataSetChanged();
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    @aa1
    public final List<Integer> getMAllList() {
        List<Integer> list = this.mAllList;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("mAllList");
        return null;
    }

    public final RecyclerView getMAllRecyclerView() {
        return (RecyclerView) this.mAllRecyclerView$delegate.getValue();
    }

    @aa1
    public final List<Integer> getMBtnList() {
        List<Integer> list = this.mBtnList;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("mBtnList");
        return null;
    }

    public final TextView getMChangeDataTypeBtn() {
        return (TextView) this.mChangeDataTypeBtn$delegate.getValue();
    }

    public final RecyclerView getMHotRecyclerView() {
        return (RecyclerView) this.mHotRecyclerView$delegate.getValue();
    }

    @aa1
    public final List<Integer> getMTopList() {
        List<Integer> list = this.mTopList;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("mTopList");
        return null;
    }

    public final int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.all_sport));
        setMAllList(CollectionsKt___CollectionsKt.OO0Oi10(a15.OXO1()));
        setMBtnList(new ArrayList());
        setHotListView();
        setAllList();
        getMChangeDataTypeBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportListActivity.initView$lambda$0(this.f12274IO, view);
            }
        });
    }

    public final boolean isEdit() {
        return this.isEdit;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sport_list_mode;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void setEdit(boolean z) {
        this.isEdit = z;
    }

    public final void setMAllList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mAllList = list;
    }

    public final void setMBtnList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mBtnList = list;
    }

    public final void setMTopList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mTopList = list;
    }
}
