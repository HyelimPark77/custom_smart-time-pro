package com.sma.smartv3.ui.device;

import android.text.Editable;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.g10;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.device.SearchMapsActivity$initView$1$1", f = "SearchMapsActivity.kt", i = {}, l = {84, 85}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class SearchMapsActivity$initView$1$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Editable $newText;
    int label;
    final /* synthetic */ SearchMapsActivity this$0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.SearchMapsActivity$initView$1$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.device.SearchMapsActivity$initView$1$1$1", f = "SearchMapsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Editable $newText;
        int label;
        final /* synthetic */ SearchMapsActivity this$0;

        public AnonymousClass1(SearchMapsActivity r1, Editable r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r1;
            this.$newText = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.this$0, this.$newText, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r2) {
            pb.I0iXXO();
            if (this.label != 0) goto L11;
            ResultKt.X1ii(r2);
            if (SearchMapsActivity.access$isInChinaMainland$p(this.this$0) == false) goto L7;
            this.this$0.requestPoiSearch(String.valueOf(this.$newText));
        L9:
            return Unit.OXO1;
        L7:
            SearchMapsActivity.access$requestGooglePoiSearch(this.this$0, String.valueOf(this.$newText));
            goto L9
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public SearchMapsActivity$initView$1$1(SearchMapsActivity r1, Editable r2, Continuation<? super SearchMapsActivity$initView$1$1> r3) {
        this.this$0 = r1;
        this.$newText = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new SearchMapsActivity$initView$1$1(this.this$0, this.$newText, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((SearchMapsActivity$initView$1$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L8;
        ResultKt.X1ii(r7);
    L17:
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        ResultKt.X1ii(r7);
    L13:
        g10 r8 = IXOX0Xiii.O00();
        AnonymousClass1 r2 = new AnonymousClass1(this.this$0, this.$newText, null);
        this.label = 2;
        if (I100X1.I0IIOi(r8, r2, this) != r0) goto L17;
    L15:
        return r0;
    L10:
        ResultKt.X1ii(r7);
        this.label = 1;
        if (DelayKt.XIi00iiXO(350, this) != r0) goto L13;
        goto L13
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
