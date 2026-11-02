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
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ah6;
import com.android.mltcode.paycertificationapi.k5;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseFragment extends Fragment implements k5 {

    @aa1
    public static final OXO1 Companion = null;

    @tb1
    private Function1<? super Boolean, Unit> initViewCallback;
    private boolean isInitView;
    protected Activity mActivity;

    @tb1
    private String mArg0;
    private int mArg1;

    @tb1
    private Parcelable mArg2;

    @tb1
    private Serializable mArg3;
    private final int mTitleId;
    protected View mView;

    @SourceDebugExtension({"SMAP\nBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n99#1,3:121\n1#2:120\n*S KotlinDebug\n*F\n+ 1 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n*L\n115#1:121,3\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ BaseFragment XO0O10(OXO1 r0, String r1, Integer r2, Parcelable r3, Serializable r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = null;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = null;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = null;
        L12:
            if ((r5 & 8) == 0) goto L14;
            r4 = null;
        L14:
            Bundle r7 = new Bundle();
            r7.putString("mArg0", r1);
            if (r2 == null) goto L17;
            r7.putInt("mArg1", r2.intValue());
        L17:
            r7.putParcelable("mArg2", r3);
            r7.putSerializable("mArg3", r4);
            Intrinsics.OX(4, "T");
            BaseFragment r8 = (BaseFragment) BaseFragment.class.newInstance();
            r8.setArguments(r7);
            Intrinsics.OX(1, "T");
            return r8;
        }

        public static /* synthetic */ BaseFragment iO(OXO1 r0, Bundle r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            Intrinsics.OX(4, "T");
            BaseFragment r4 = (BaseFragment) BaseFragment.class.newInstance();
            r4.setArguments(r1);
            Intrinsics.OX(1, "T");
            return r4;
        }

        public final /* synthetic */ <T extends BaseFragment> T OXO1(Bundle r3) {
            Intrinsics.OX(4, "T");
            T r0 = (T) BaseFragment.class.newInstance();
            r0.setArguments(r3);
            Intrinsics.OX(1, "T");
            return r0;
        }

        public final /* synthetic */ <T extends BaseFragment> T XIi00iiXO(String r3, Integer r4, Parcelable r5, Serializable r6) {
            Bundle r0 = new Bundle();
            r0.putString("mArg0", r3);
            if (r4 == null) goto L5;
            r0.putInt("mArg1", r4.intValue());
        L5:
            r0.putParcelable("mArg2", r5);
            r0.putSerializable("mArg3", r6);
            Intrinsics.OX(4, "T");
            T r7 = (T) BaseFragment.class.newInstance();
            r7.setArguments(r0);
            Intrinsics.OX(1, "T");
            return r7;
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public BaseFragment() {
        this.mTitleId = -1;
        this.mArg1 = -1;
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
        Activity r0 = this.mActivity;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mActivity");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @tb1
    public String getMArg0() {
        return this.mArg0;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int getMArg1() {
        return this.mArg1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @tb1
    public Parcelable getMArg2() {
        return this.mArg2;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @tb1
    public Serializable getMArg3() {
        return this.mArg3;
    }

    public int getMTitleId() {
        return this.mTitleId;
    }

    @aa1
    public final View getMView() {
        View r0 = this.mView;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mView");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return false;
    }

    public final boolean isInitView() {
        return this.isInitView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@aa1 Context r2) {
        Intrinsics.X0O(r2, "context");
        super.onAttach(r2);
        FragmentActivity r3 = getActivity();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type android.app.Activity");
        setMActivity(r3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@tb1 Bundle r5) {
        super.onCreate(r5);
        Bundle r0 = getArguments();
        Serializable r1 = null;
        if (r0 == null) goto L5;
        String r2 = r0.getString("mArg0");
    L6:
        setMArg0(r2);
        Bundle r3 = getArguments();
        int r4 = -1;
        if (r3 == null) goto L9;
        r4 = r3.getInt("mArg1", -1);
    L9:
        setMArg1(r4);
        Bundle r6 = getArguments();
        if (r6 == null) goto L12;
        Parcelable r7 = r6.getParcelable("mArg2");
    L13:
        setMArg2(r7);
        Bundle r8 = getArguments();
        if (r8 == null) goto L16;
        r1 = r8.getSerializable("mArg3");
    L16:
        setMArg3(r1);
        if (initEvent() == false) goto L19;
        O11XO1X.XO0O10().X1ii(this);
    L19:
        init(r5);
        return;
    L12:
        r7 = null;
        goto L13
    L5:
        r2 = null;
        goto L6
    }

    @Override // androidx.fragment.app.Fragment
    @tb1
    public View onCreateView(@aa1 LayoutInflater r3, @tb1 ViewGroup r4, @tb1 Bundle r5) {
        Intrinsics.X0O(r3, "inflater");
        if (layoutId() != (-1)) goto L5;
        View r6 = bindView();
    L6:
        setMView(r6);
        if (getMTitleId() == (-1)) goto L11;
        View r7 = getMView().findViewById(getMTitleId());
        if (r7 == null) goto L11;
        ah6.OXO1(r7);
    L11:
        initView();
        this.isInitView = true;
        Function1<? super Boolean, Unit> r8 = this.initViewCallback;
        if (r8 == null) goto L15;
        r8.invoke(Boolean.TRUE);
    L15:
        return getMView();
    L5:
        r6 = r3.inflate(layoutId(), r4, false);
        Intrinsics.XXI(r6);
        goto L6
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (initEvent() == false) goto L5;
        O11XO1X.XO0O10().OiIIX101O(this);
    L5:
        super.onDestroy();
    }

    public final void onInitViewSuccessListener(@aa1 Function1<? super Boolean, Unit> r2) {
        Intrinsics.X0O(r2, "callback");
        this.initViewCallback = r2;
        if (this.isInitView == false) goto L7;
        if (r2 == null) goto L8;
        r2.invoke(Boolean.TRUE);
        return;
    L8:
        return;
    }

    public final void setInitView(boolean r1) {
        this.isInitView = r1;
    }

    public final void setMActivity(@aa1 Activity r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mActivity = r2;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void setMArg0(@tb1 String r1) {
        this.mArg0 = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void setMArg1(int r1) {
        this.mArg1 = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void setMArg2(@tb1 Parcelable r1) {
        this.mArg2 = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void setMArg3(@tb1 Serializable r1) {
        this.mArg3 = r1;
    }

    public final void setMView(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mView = r2;
    }
}
