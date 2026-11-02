.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
.end method

.method public abstract onFinish(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/NfcMsg;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onStart()V
.end method
