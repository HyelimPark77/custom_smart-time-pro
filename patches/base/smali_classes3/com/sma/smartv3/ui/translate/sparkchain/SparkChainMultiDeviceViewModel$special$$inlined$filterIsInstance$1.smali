.class public final Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$special$$inlined$filterIsInstance$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/ii0iIIX0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/ii0iIIX0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/ii0iIIX0;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$special$$inlined$filterIsInstance$1;->IO:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lcom/android/mltcode/paycertificationapi/IXiXI;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$special$$inlined$filterIsInstance$1;->IO:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    new-instance v1, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$special$$inlined$filterIsInstance$1$2;

    invoke-direct {v1, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$special$$inlined$filterIsInstance$1$2;-><init>(Lcom/android/mltcode/paycertificationapi/IXiXI;)V

    invoke-interface {v0, v1, p2}, Lcom/android/mltcode/paycertificationapi/ii0iIIX0;->collect(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
