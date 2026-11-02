package com.bestmafen.androidbase.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.InterfaceC2603k5;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ah6;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseFragment extends Fragment implements InterfaceC2603k5 {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @tb1
    private Function1<? super Boolean, Unit> initViewCallback;
    private boolean isInitView;
    protected Activity mActivity;

    @tb1
    private String mArg0;

    @tb1
    private Parcelable mArg2;

    @tb1
    private Serializable mArg3;
    protected View mView;
    private final int mTitleId = -1;
    private int mArg1 = -1;

    @SourceDebugExtension({"SMAP\nBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n99#1,3:121\n1#2:120\n*S KotlinDebug\n*F\n+ 1 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n*L\n115#1:121,3\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BaseFragment XO0O10(OXO1 oxo1, String str, Integer num, Parcelable parcelable, Serializable serializable, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                parcelable = null;
            }
            if ((i & 8) != 0) {
                serializable = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", str);
            if (num != null) {
                bundle.putInt("mArg1", num.intValue());
            }
            bundle.putParcelable("mArg2", parcelable);
            bundle.putSerializable("mArg3", serializable);
            Intrinsics.m39537OX(4, "T");
            BaseFragment baseFragment = (BaseFragment) BaseFragment.class.newInstance();
            baseFragment.setArguments(bundle);
            Intrinsics.m39537OX(1, "T");
            return baseFragment;
        }

        /* JADX INFO: renamed from: iO */
        public static /* synthetic */ BaseFragment m11116iO(OXO1 oxo1, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            Intrinsics.m39537OX(4, "T");
            BaseFragment baseFragment = (BaseFragment) BaseFragment.class.newInstance();
            baseFragment.setArguments(bundle);
            Intrinsics.m39537OX(1, "T");
            return baseFragment;
        }

        public final /* synthetic */ <T extends BaseFragment> T OXO1(Bundle bundle) {
            Intrinsics.m39537OX(4, "T");
            T t = (T) BaseFragment.class.newInstance();
            t.setArguments(bundle);
            Intrinsics.m39537OX(1, "T");
            return t;
        }

        public final /* synthetic */ <T extends BaseFragment> T XIi00iiXO(String str, Integer num, Parcelable parcelable, Serializable serializable) {
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", str);
            if (num != null) {
                bundle.putInt("mArg1", num.intValue());
            }
            bundle.putParcelable("mArg2", parcelable);
            bundle.putSerializable("mArg3", serializable);
            Intrinsics.m39537OX(4, "T");
            T t = (T) BaseFragment.class.newInstance();
            t.setArguments(bundle);
            Intrinsics.m39537OX(1, "T");
            return t;
        }

        public OXO1() {
        }
    }

    @aa1
    public View bindView() {
        return new View(getContext());
    }

    @aa1
    public final View getCreateView() {
        return getMView();
    }

    @aa1
    public final Activity getMActivity() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return activity;
        }
        Intrinsics.XXO("mActivity");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @tb1
    public String getMArg0() {
        return this.mArg0;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int getMArg1() {
        return this.mArg1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @tb1
    public Parcelable getMArg2() {
        return this.mArg2;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @tb1
    public Serializable getMArg3() {
        return this.mArg3;
    }

    public int getMTitleId() {
        return this.mTitleId;
    }

    @aa1
    public final View getMView() {
        View view = this.mView;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("mView");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return false;
    }

    public final boolean isInitView() {
        return this.isInitView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        Intrinsics.X1ii(activity, "null cannot be cast to non-null type android.app.Activity");
        setMActivity(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@tb1 Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        setMArg0(arguments != null ? arguments.getString("mArg0") : null);
        Bundle arguments2 = getArguments();
        setMArg1(arguments2 != null ? arguments2.getInt("mArg1", -1) : -1);
        Bundle arguments3 = getArguments();
        setMArg2(arguments3 != null ? arguments3.getParcelable("mArg2") : null);
        Bundle arguments4 = getArguments();
        setMArg3(arguments4 != null ? arguments4.getSerializable("mArg3") : null);
        if (initEvent()) {
            O11XO1X.XO0O10().X1ii(this);
        }
        init(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @tb1
    public View onCreateView(@aa1 LayoutInflater inflater, @tb1 ViewGroup viewGroup, @tb1 Bundle bundle) {
        View viewInflate;
        View viewFindViewById;
        Intrinsics.X0O(inflater, "inflater");
        if (layoutId() == -1) {
            viewInflate = bindView();
        } else {
            viewInflate = inflater.inflate(layoutId(), viewGroup, false);
            Intrinsics.XXI(viewInflate);
        }
        setMView(viewInflate);
        if (getMTitleId() != -1 && (viewFindViewById = getMView().findViewById(getMTitleId())) != null) {
            ah6.OXO1(viewFindViewById);
        }
        initView();
        this.isInitView = true;
        Function1<? super Boolean, Unit> function1 = this.initViewCallback;
        if (function1 != null) {
            function1.invoke2(Boolean.TRUE);
        }
        return getMView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (initEvent()) {
            O11XO1X.XO0O10().OiIIX101O(this);
        }
        super.onDestroy();
    }

    public final void onInitViewSuccessListener(@aa1 Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(callback, "callback");
        this.initViewCallback = callback;
        if (!this.isInitView || callback == null) {
            return;
        }
        callback.invoke2(Boolean.TRUE);
    }

    public final void setInitView(boolean z) {
        this.isInitView = z;
    }

    public final void setMActivity(@aa1 Activity activity) {
        Intrinsics.X0O(activity, "<set-?>");
        this.mActivity = activity;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void setMArg0(@tb1 String str) {
        this.mArg0 = str;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void setMArg1(int i) {
        this.mArg1 = i;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void setMArg2(@tb1 Parcelable parcelable) {
        this.mArg2 = parcelable;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void setMArg3(@tb1 Serializable serializable) {
        this.mArg3 = serializable;
    }

    public final void setMView(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.mView = view;
    }
}
