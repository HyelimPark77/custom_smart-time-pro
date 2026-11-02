.class public interface abstract Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOTA;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract changeCommunicationWay(IILcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract enterUpdateMode(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract exitUpdateMode(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract inquiryDeviceCanOTA([BLcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract queryUpdateResult(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract readUpgradeFileFlag(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Lcom/jieli/jl_bt_ota/model/FileOffset;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract rebootDevice(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(TT;)V"
        }
    .end annotation
.end method

.method public abstract sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(TT;",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract stopADVInfo(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method
