.class public interface abstract Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnCallback"
.end annotation


# virtual methods
.method public abstract onEmotion(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
.end method

.method public abstract onSttText(Ljava/lang/String;Z)V
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
.end method

.method public abstract onTtsStart()V
.end method

.method public abstract onTtsStop()V
.end method

.method public abstract onTtsText(Ljava/lang/String;Z)V
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
.end method
