.class final Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->collectSendState()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/List<",
        "+",
        "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$1"
    f = "ThirdPartyVoiceAssistantActivity.kt"
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

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;->this$0:Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;

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

    new-instance v0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;->this$0:Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;->invoke(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;->label:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$1;->this$0:Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->access$getMAdapter(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->setData(Ljava/util/List;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->access$getMRecyclerView(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->access$getMAdapter(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->getItemCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
