.class public final Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$startIdleTimer$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->startIdleTimer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->access$checkIdleTimeout(Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;)V

    return-void
.end method
