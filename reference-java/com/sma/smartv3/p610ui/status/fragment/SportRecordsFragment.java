package com.sma.smartv3.p610ui.status.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.model.SportRecordItemAdapter;
import com.sma.smartv3.model.SportRecordItemCommonData;
import com.sma.smartv3.model.SportRecordItemData;
import com.sma.smartv3.p610ui.sport.SportDetailActivity;
import com.sma.smartv3.p610ui.sport.SportDetailV2Activity;
import com.sma.smartv3.p610ui.status.SportRecordsDetailActivity;
import com.sma.smartv3.p610ui.status.fragment.SportRecordsFragment;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportRecordsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n19#2:166\n15#2:167\n99#3,7:168\n106#3,3:176\n79#3,7:179\n109#3:186\n99#3,7:187\n106#3,3:195\n79#3,7:198\n109#3:205\n99#3,7:206\n106#3,3:214\n79#3,7:217\n109#3:224\n99#3,7:225\n106#3,3:233\n79#3,7:236\n109#3:243\n99#3,7:244\n106#3,3:252\n79#3,7:255\n109#3:262\n99#3,7:263\n106#3,3:271\n79#3,7:274\n109#3:281\n1#4:175\n1#4:194\n1#4:213\n1#4:232\n1#4:251\n1#4:270\n*S KotlinDebug\n*F\n+ 1 SportRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsFragment\n*L\n24#1:166\n24#1:167\n137#1:168,7\n137#1:176,3\n137#1:179,7\n137#1:186\n139#1:187,7\n139#1:195,3\n139#1:198,7\n139#1:205\n143#1:206,7\n143#1:214,3\n143#1:217,7\n143#1:224\n146#1:225,7\n146#1:233,3\n146#1:236,7\n146#1:243\n148#1:244,7\n148#1:252,3\n148#1:255,7\n148#1:262\n153#1:263,7\n153#1:271,3\n153#1:274,7\n153#1:281\n137#1:175\n139#1:194\n143#1:213\n146#1:232\n148#1:251\n153#1:270\n*E\n"})
public final class SportRecordsFragment extends BaseDSLRecyclerFragment {
    private int page;
    private final int pageNumber = 30;

    @aa1
    private final AppUser userProfile;

    public SportRecordsFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    private final void findData(final DslAdapter dslAdapter, ArrayList<SportRecordData> arrayList) {
        Iterator<SportRecordData> it = arrayList.iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        while (it.hasNext()) {
            SportRecordData next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            final SportRecordData sportRecordData = next;
            final SportRecordItemCommonData sportRecordItemCommonData = SportRecordDataKt.parseSportRecordItemCommonData(getMActivity(), this.userProfile, sportRecordData);
            DslAdapterExKt.O10IXXX0X(dslAdapter, R.layout.status_item_sport_record_detail, new Function1() { // from class: com.android.mltcode.paycertificationapi.k35
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportRecordsFragment.findData$lambda$0(sportRecordData, sportRecordItemCommonData, dslAdapter, this, (DslAdapterItem) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0(final SportRecordData sportRecordData, final SportRecordItemCommonData sportRecordItemCommonData, final DslAdapter dslAdapter, final SportRecordsFragment sportRecordsFragment, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.n35
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportRecordsFragment.findData$lambda$0$0(sportRecordData, sportRecordItemCommonData, dslItem, dslAdapter, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.o35
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordsFragment.findData$lambda$0$1(sportRecordData, sportRecordsFragment, dslItem, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0(final SportRecordData sportRecordData, SportRecordItemCommonData sportRecordItemCommonData, final DslAdapterItem dslAdapterItem, final DslAdapter dslAdapter, final DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        ImageView imageViewImg = itemHolder.img(R.id.sportSourceIv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(sportRecordData.getMSource() == 2 ? R.drawable.icon_phone : R.drawable.icon_watch);
        }
        ImageView imageViewImg2 = itemHolder.img(R.id.sportTypeIv);
        if (imageViewImg2 != null) {
            imageViewImg2.setImageResource(sportRecordItemCommonData.getWorkoutImg());
        }
        ImageView imageViewImg3 = itemHolder.img(R.id.gpsStatusIv);
        if (imageViewImg3 != null) {
            imageViewImg3.setImageResource(sportRecordItemCommonData.getGpsState());
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.sportName);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(sportRecordItemCommonData.getWorkoutModeName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.sportStartTime);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(sportRecordItemCommonData.getSportStartTime());
        }
        itemHolder.click(R.id.bt_delete_sport_record, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.s35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportRecordsFragment.findData$lambda$0$0$0(sportRecordData, dslAdapterItem, itemHolder, dslAdapter, view);
            }
        });
        RecyclerView recyclerViewM3481rv = itemHolder.m3481rv(R.id.f51422rv);
        if (recyclerViewM3481rv != null) {
            recyclerViewM3481rv.setLayoutManager(new GridLayoutManager(recyclerViewM3481rv.getContext(), sportRecordItemCommonData.getSpanCount()));
            List<SportRecordItemData> contentList = sportRecordItemCommonData.getContentList();
            Context context = recyclerViewM3481rv.getContext();
            Intrinsics.O10IXXX0X(context, "getContext(...)");
            recyclerViewM3481rv.setAdapter(new SportRecordItemAdapter(contentList, context));
            recyclerViewM3481rv.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.t35
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SportRecordsFragment.findData$lambda$0$0$1$0(itemHolder, view, motionEvent);
                }
            });
        }
        View view = itemHolder.view(R.id.ll_item_panel);
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.u35
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return SportRecordsFragment.findData$lambda$0$0$2$0(itemHolder, view2, motionEvent);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findData$lambda$0$0$0(SportRecordData sportRecordData, DslAdapterItem dslAdapterItem, DslViewHolder dslViewHolder, DslAdapter dslAdapter, View view) {
        List<DslAdapterItem> dataItems;
        SportRecordDataKt.deleteSportRecord(sportRecordData);
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            swipeMenuHelper.closeSwipeMenu(dslViewHolder);
        }
        DslAdapter itemDslAdapter = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter != null) {
            DslAdapter.removeItem$default(itemDslAdapter, dslAdapterItem, false, 2, null);
        }
        DslAdapter itemDslAdapter2 = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter2 != null && (dataItems = itemDslAdapter2.getDataItems()) != null && dataItems.size() == 0) {
            DslAdapter.setAdapterStatus$default(dslAdapter, 1, null, 2, null);
        }
        DslAdapter itemDslAdapter3 = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter3 != null) {
            DslAdapter.updateItemDepend$default(itemDslAdapter3, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findData$lambda$0$0$1$0(DslViewHolder dslViewHolder, View view, MotionEvent motionEvent) {
        return dslViewHolder.itemView.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findData$lambda$0$0$2$0(DslViewHolder dslViewHolder, View view, MotionEvent motionEvent) {
        return dslViewHolder.itemView.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$1(SportRecordData sportRecordData, SportRecordsFragment sportRecordsFragment, DslAdapterItem dslAdapterItem, View it) {
        Intrinsics.X0O(it, "it");
        int mSource = sportRecordData.getMSource();
        if (mSource == 1) {
            i72 i72Var = i72.OXO1;
            if (i72Var.iIXX0i()) {
                int mWorkoutId = sportRecordData.getMWorkoutId();
                Bundle bundle = new Bundle();
                bundle.putString("mArg0", null);
                bundle.putInt("mArg1", mWorkoutId);
                bundle.putParcelable("mArg2", null);
                bundle.putSerializable("mArg3", null);
                Intent intent = new Intent(sportRecordsFragment.getActivity(), (Class<?>) SportDetailV2Activity.class);
                intent.putExtras(bundle);
                sportRecordsFragment.startActivity(intent);
            } else if (i72Var.XII01OO1I()) {
                int mWorkoutId2 = sportRecordData.getMWorkoutId();
                Bundle bundle2 = new Bundle();
                bundle2.putString("mArg0", null);
                bundle2.putInt("mArg1", mWorkoutId2);
                bundle2.putParcelable("mArg2", null);
                bundle2.putSerializable("mArg3", null);
                Intent intent2 = new Intent(sportRecordsFragment.getActivity(), (Class<?>) SportDetailActivity.class);
                intent2.putExtras(bundle2);
                sportRecordsFragment.startActivity(intent2);
            } else {
                Bundle bundle3 = new Bundle();
                bundle3.putString("mArg0", null);
                bundle3.putParcelable("mArg2", sportRecordData);
                bundle3.putSerializable("mArg3", null);
                Intent intent3 = new Intent(sportRecordsFragment.getActivity(), (Class<?>) SportRecordsDetailActivity.class);
                intent3.putExtras(bundle3);
                sportRecordsFragment.startActivity(intent3);
            }
        } else if (mSource != 2) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("mArg0", null);
            bundle4.putParcelable("mArg2", sportRecordData);
            bundle4.putSerializable("mArg3", null);
            Intent intent4 = new Intent(sportRecordsFragment.getActivity(), (Class<?>) SportRecordsDetailActivity.class);
            intent4.putExtras(bundle4);
            sportRecordsFragment.startActivity(intent4);
        } else if (i72.OXO1.iIXX0i()) {
            int mWorkoutId3 = sportRecordData.getMWorkoutId();
            Bundle bundle5 = new Bundle();
            bundle5.putString("mArg0", null);
            bundle5.putInt("mArg1", mWorkoutId3);
            bundle5.putParcelable("mArg2", null);
            bundle5.putSerializable("mArg3", null);
            Intent intent5 = new Intent(sportRecordsFragment.getActivity(), (Class<?>) SportDetailV2Activity.class);
            intent5.putExtras(bundle5);
            sportRecordsFragment.startActivity(intent5);
        } else {
            int mWorkoutId4 = sportRecordData.getMWorkoutId();
            Bundle bundle6 = new Bundle();
            bundle6.putString("mArg0", null);
            bundle6.putInt("mArg1", mWorkoutId4);
            bundle6.putParcelable("mArg2", null);
            bundle6.putSerializable("mArg3", null);
            Intent intent6 = new Intent(sportRecordsFragment.getActivity(), (Class<?>) SportDetailActivity.class);
            intent6.putExtras(bundle6);
            sportRecordsFragment.startActivity(intent6);
        }
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            SwipeMenuHelper.closeSwipeMenu$default(swipeMenuHelper, null, 1, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0(final SportRecordsFragment sportRecordsFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        renderAdapter.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty));
        sportRecordsFragment.getDslViewHolder().postDelay(1000L, new Function0() { // from class: com.android.mltcode.paycertificationapi.l35
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsFragment.onInitBaseLayoutAfter$lambda$0$0(this.f9345IO);
            }
        });
        renderAdapter.getDslLoadMoreItem().setOnLoadMore(new Function1() { // from class: com.android.mltcode.paycertificationapi.m35
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordsFragment.onInitBaseLayoutAfter$lambda$0$1(this.f9607IO, (DslViewHolder) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0(final SportRecordsFragment sportRecordsFragment) {
        sportRecordsFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.q35
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordsFragment.onInitBaseLayoutAfter$lambda$0$0$0(this.f10506IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0(SportRecordsFragment sportRecordsFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        ArrayList<SportRecordData> sportRecordList = SportRecordDataKt.getSportRecordList(sportRecordsFragment.page, sportRecordsFragment.pageNumber);
        if (sportRecordList.isEmpty()) {
            DslAdapter.setAdapterStatus$default(sportRecordsFragment.getDslAdapter(), 1, null, 2, null);
        } else {
            sportRecordsFragment.findData(renderAdapter, sportRecordList);
            renderAdapter.setLoadMoreEnable(true);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$1(final SportRecordsFragment sportRecordsFragment, DslViewHolder it) {
        Intrinsics.X0O(it, "it");
        it.postDelay(1000L, new Function0() { // from class: com.android.mltcode.paycertificationapi.r35
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsFragment.onInitBaseLayoutAfter$lambda$0$1$0(this.f10744IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$1$0(final SportRecordsFragment sportRecordsFragment) {
        sportRecordsFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.v35
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordsFragment.onInitBaseLayoutAfter$lambda$0$1$0$0(this.f11644IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$1$0$0(SportRecordsFragment sportRecordsFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        int i = sportRecordsFragment.page + 1;
        sportRecordsFragment.page = i;
        int i2 = sportRecordsFragment.pageNumber;
        ArrayList<SportRecordData> sportRecordList = SportRecordDataKt.getSportRecordList((i * i2) - 1, i2);
        if (sportRecordList.isEmpty()) {
            DslAdapter.setLoadMore$default(renderAdapter, 2, null, false, 6, null);
        } else {
            sportRecordsFragment.findData(renderAdapter, sportRecordList);
            DslAdapter.setLoadMore$default(renderAdapter, 0, null, false, 6, null);
        }
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.p35
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordsFragment.onInitBaseLayoutAfter$lambda$0(this.f10288IO, (DslAdapter) obj);
            }
        });
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().m3483v(recyclerViewId()));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }
}
