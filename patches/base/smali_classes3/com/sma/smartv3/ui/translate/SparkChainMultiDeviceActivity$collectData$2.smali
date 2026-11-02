.class final Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;->collectData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$2"
    f = "SparkChainMultiDeviceActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;-><init>(Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->invoke(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v1, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->label:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;->getAdapter()Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->add(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;->access$getRecyclerview(Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;->getAdapter()Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->getItemCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$collectData$2;->this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;->prepareSendAudioText(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
