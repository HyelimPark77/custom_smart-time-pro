.class public interface abstract Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
        "+",
        "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
        "+",
        "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
        ">;>",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract onCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract onErrCode(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
.end method
