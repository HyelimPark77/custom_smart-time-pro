.class public interface abstract Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addRecvData(Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;)V
.end method

.method public abstract addSendData(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract release()V
.end method
