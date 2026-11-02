package com.sma.smartv3.p610ui.main;

import android.location.Address;
import android.location.Geocoder;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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

/* JADX INFO: renamed from: com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1 */
/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1", m39466f = "NationServerSelectActivity.kt", m39467i = {0}, m39468l = {341}, m39469m = "invokeSuspend", m39470n = {"$this$withContext"}, m39472s = {"L$0"}, m39473v = 1)
public final class C18861x180decc9 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super String>, Object> {
    final /* synthetic */ CustomLocation $location;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NationServerSelectActivity this$0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1$1", m39466f = "NationServerSelectActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super String>, Object> {
        final /* synthetic */ CustomLocation $location;
        int label;
        final /* synthetic */ NationServerSelectActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NationServerSelectActivity nationServerSelectActivity, CustomLocation customLocation, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = nationServerSelectActivity;
            this.$location = customLocation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$location, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Address address;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            try {
                List<Address> fromLocation = new Geocoder(this.this$0.getMContext()).getFromLocation(this.$location.XO0O10(), this.$location.IiI10X(), 1);
                if (fromLocation == null || (address = (Address) CollectionsKt___CollectionsKt.iXi1iI0(fromLocation)) == null) {
                    return null;
                }
                return address.getCountryCode();
            } catch (Exception e) {
                i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + ", Geocoder exception: " + e.getMessage() + ", fallback to locale");
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18861x180decc9(NationServerSelectActivity nationServerSelectActivity, CustomLocation customLocation, Continuation<? super C18861x180decc9> continuation) {
        super(2, continuation);
        this.this$0 = nationServerSelectActivity;
        this.$location = customLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C18861x180decc9 c18861x180decc9 = new C18861x180decc9(this.this$0, this.$location, continuation);
        c18861x180decc9.L$0 = obj;
        return c18861x180decc9;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super String> continuation) {
        return ((C18861x180decc9) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i00OIXiO i00oixio = (i00OIXiO) this.L$0;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$location, null);
            this.L$0 = i00oixio;
            this.label = 1;
            obj = TimeoutKt.O00(8000L, anonymousClass1, this);
            if (obj == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        NationServerSelectActivity nationServerSelectActivity = this.this$0;
        i1O0OXO1O.OXO1.OXO1(nationServerSelectActivity.TAG + ", Geocoder timeout or failed, fallback to locale");
        return nationServerSelectActivity.getResources().getConfiguration().locale.getCountry();
    }
}
