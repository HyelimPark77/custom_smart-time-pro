package com.sma.smartv3.ui.main;

import android.location.Address;
import android.location.Geocoder;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.location.CustomLocation;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1", f = "NationServerSelectActivity.kt", i = {0}, l = {341}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"}, v = 1)
public final class NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super String>, Object> {
    final /* synthetic */ CustomLocation $location;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NationServerSelectActivity this$0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1", f = "NationServerSelectActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super String>, Object> {
        final /* synthetic */ CustomLocation $location;
        int label;
        final /* synthetic */ NationServerSelectActivity this$0;

        public AnonymousClass1(NationServerSelectActivity r1, CustomLocation r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r1;
            this.$location = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.this$0, this.$location, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super String> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r7) {
            pb.I0iXXO();
            if (this.label != 0) goto L17;
            ResultKt.X1ii(r7);
            List<Address> r0 = new Geocoder(NationServerSelectActivity.access$getMContext(this.this$0)).getFromLocation(this.$location.XO0O10(), this.$location.IiI10X(), 1);     // Catch: Exception -> L11
            if (r0 == null) goto L13;
            Address r1 = (Address) CollectionsKt___CollectionsKt.iXi1iI0(r0);     // Catch: Exception -> L11
            if (r1 == null) goto L13;
            return r1.getCountryCode();
        L13:
            return null;
        L11:
            e = move-exception;
            i1O0OXO1O.OXO1.OXO1(NationServerSelectActivity.access$getTAG$p(this.this$0) + ", Geocoder exception: " + e.getMessage() + ", fallback to locale");
            return null;
        L17:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super String> r2) {
            return invoke2(r1, r2);
        }
    }

    public NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1(NationServerSelectActivity r1, CustomLocation r2, Continuation<? super NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1> r3) {
        this.this$0 = r1;
        this.$location = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1 r0 = new NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1(this.this$0, this.$location, r5);
        r0.L$0 = r4;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super String> r2) {
        return ((NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        i00OIXiO r0 = (i00OIXiO) this.L$0;
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L8;
        if (r2 != 1) goto L7;
        ResultKt.X1ii(r7);
    L11:
        String r8 = (String) r7;
        if (r8 != null) goto L15;
        NationServerSelectActivity r9 = this.this$0;
        i1O0OXO1O.OXO1.OXO1(NationServerSelectActivity.access$getTAG$p(r9) + ", Geocoder timeout or failed, fallback to locale");
        return r9.getResources().getConfiguration().locale.getCountry();
    L15:
        return r8;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r7);
        AnonymousClass1 r10 = new AnonymousClass1(this.this$0, this.$location, null);
        this.L$0 = r0;
        this.label = 1;
        r7 = TimeoutKt.O00(8000, r10, this);
        if (r7 != r1) goto L11;
        return r1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super String> r2) {
        return invoke2(r1, r2);
    }
}
