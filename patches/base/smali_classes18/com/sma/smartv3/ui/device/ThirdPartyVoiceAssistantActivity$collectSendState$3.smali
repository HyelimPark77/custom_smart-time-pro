.class final Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;
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
        "Lcom/sma/smartv3/model/AiChatAnswerData;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.ThirdPartyVoiceAssistantActivity$collectSendState$3"
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
            "Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->this$0:Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;

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

    new-instance v0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->this$0:Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;-><init>(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lcom/sma/smartv3/model/AiChatAnswerData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/model/AiChatAnswerData;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/sma/smartv3/model/AiChatAnswerData;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->invoke(Lcom/sma/smartv3/model/AiChatAnswerData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/model/AiChatAnswerData;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->label:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->this$0:Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->access$getChatMsg$p(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AiChatAnswerData;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AiChatAnswerData;->getEnded()I

    move-result v6

    sget-object v7, Lcom/sma/smartv3/dto/ChatShowType;->TO:Lcom/sma/smartv3/dto/ChatShowType;

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->copy$default(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;ILjava/lang/Object;)Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->this$0:Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->access$getMAdapter(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->addOrUpdateStream(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->this$0:Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->getViewModel()Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->addChatVoice(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)Lkotlinx/coroutines/XiOIO;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity$collectSendState$3;->this$0:Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;->access$scrollList(Lcom/sma/smartv3/ui/device/ThirdPartyVoiceAssistantActivity;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
