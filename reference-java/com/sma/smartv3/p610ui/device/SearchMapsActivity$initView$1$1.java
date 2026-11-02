package com.sma.smartv3.p610ui.device;

import android.text.Editable;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.device.SearchMapsActivity$initView$1$1", m39466f = "SearchMapsActivity.kt", m39467i = {}, m39468l = {84, 85}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class SearchMapsActivity$initView$1$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Editable $newText;
    int label;
    final /* synthetic */ SearchMapsActivity this$0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.SearchMapsActivity$initView$1$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.SearchMapsActivity$initView$1$1$1", m39466f = "SearchMapsActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C187691 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Editable $newText;
        int label;
        final /* synthetic */ SearchMapsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C187691(SearchMapsActivity searchMapsActivity, Editable editable, Continuation<? super C187691> continuation) {
            super(2, continuation);
            this.this$0 = searchMapsActivity;
            this.$newText = editable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C187691(this.this$0, this.$newText, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C187691) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (this.this$0.isInChinaMainland) {
                this.this$0.requestPoiSearch(String.valueOf(this.$newText));
            } else {
                this.this$0.requestGooglePoiSearch(String.valueOf(this.$newText));
            }
            return Unit.OXO1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMapsActivity$initView$1$1(SearchMapsActivity searchMapsActivity, Editable editable, Continuation<? super SearchMapsActivity$initView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = searchMapsActivity;
        this.$newText = editable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchMapsActivity$initView$1$1(this.this$0, this.$newText, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((SearchMapsActivity$initView$1$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (com.android.mltcode.paycertificationapi.I100X1.I0IIOi(r7, r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            this.label = 1;
            if (DelayKt.XIi00iiXO(350L, this) != objI0iXXO) {
            }
            return objI0iXXO;
        }
        if (i == 1) {
            ResultKt.X1ii(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        return Unit.OXO1;
        g10 g10VarO00 = IXOX0Xiii.O00();
        C187691 c187691 = new C187691(this.this$0, this.$newText, null);
        this.label = 2;
    }
}
