.class public final Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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


# static fields
.field public static final IO:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1$OXO1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1$OXO1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1$OXO1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Lcom/sma/smartv3/util/websocket/ConnectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/websocket/ConnectionState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u670d\u52a1\u7aefWebSocket\u8fde\u63a5\u72b6\u6001\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/sma/smartv3/util/websocket/ConnectionState;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1$OXO1;->OXO1(Lcom/sma/smartv3/util/websocket/ConnectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
