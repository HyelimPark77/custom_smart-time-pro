.class public final Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# instance fields
.field private final _chatListResultFlow:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
            ">;>;"
        }
    .end annotation
.end field

.field private final chatListResultFlow:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
            ">;>;"
        }
    .end annotation
.end field

.field private final repository:Lcom/android/mltcode/paycertificationapi/IIiX01100;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIiX01100;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/IIiX01100;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->repository:Lcom/android/mltcode/paycertificationapi/IIiX01100;

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->_chatListResultFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->chatListResultFlow:Lcom/android/mltcode/paycertificationapi/k85;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->queryChatList()Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public static final synthetic access$getRepository$p(Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;)Lcom/android/mltcode/paycertificationapi/IIiX01100;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->repository:Lcom/android/mltcode/paycertificationapi/IIiX01100;

    return-object p0
.end method

.method public static final synthetic access$get_chatListResultFlow$p(Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->_chatListResultFlow:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method


# virtual methods
.method public final addChatVoice(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)Lkotlinx/coroutines/XiOIO;
    .locals 7
    .param p1    # Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel$addChatVoice$1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel$addChatVoice$1;-><init>(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    return-object p1
.end method

.method public final deleteAllChatByFunctionType()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel$deleteAllChatByFunctionType$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel$deleteAllChatByFunctionType$1;-><init>(Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public final getChatListResultFlow()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;->chatListResultFlow:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final queryChatList()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel$queryChatList$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/device/ChatVoiceViewModel$queryChatList$1;-><init>(Lcom/sma/smartv3/ui/device/ChatVoiceViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method
