.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/data/IDataTransferOp;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addListener(Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;)V
.end method

.method public abstract cancelDataTransfer(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract isDataTransfer()Z
.end method

.method public abstract readLargeData(Lcom/jieli/jl_rcsp/model/data/DataParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V
.end method

.method public abstract removeListener(Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;)V
.end method

.method public abstract sendLargeData(Lcom/jieli/jl_rcsp/model/data/SendParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V
.end method
