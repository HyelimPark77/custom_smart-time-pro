.class public final Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$collectSaveFlow$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$collectSaveFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/IXiXI;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$collectSaveFlow$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$collectSaveFlow$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;

    invoke-static {p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;->access$getUseCase$p(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;)Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->OiIIX101O(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)Lkotlinx/coroutines/XiOIO;

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$collectSaveFlow$1$OXO1;->OXO1(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
