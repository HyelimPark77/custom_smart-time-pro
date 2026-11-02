.class public final Lcom/sma/smartv3/biz/voice/OpusManager$decodeFile$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_audio_decode/callback/OnStateCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/OpusManager;->decodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/biz/voice/OpusManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/voice/OpusManager;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/OpusManager$decodeFile$1;->this$0:Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Ljava/lang/String;)V
    .locals 1

    const-string v0, "outFilePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager$decodeFile$1;->this$0:Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->access$getMOnStateCallback$p(Lcom/sma/smartv3/biz/voice/OpusManager;)Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;->onComplete(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager$decodeFile$1;->this$0:Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->access$getMOnStateCallback$p(Lcom/sma/smartv3/biz/voice/OpusManager;)Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/OpusManager$decodeFile$1;->this$0:Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->access$getMOnStateCallback$p(Lcom/sma/smartv3/biz/voice/OpusManager;)Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;->onStart()V

    :cond_0
    return-void
.end method
