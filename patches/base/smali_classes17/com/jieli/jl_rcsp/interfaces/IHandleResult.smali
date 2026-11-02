.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/IHandleResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "C:",
        "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "TC;)TT;"
        }
    .end annotation
.end method

.method public abstract hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "TC;)I"
        }
    .end annotation
.end method
