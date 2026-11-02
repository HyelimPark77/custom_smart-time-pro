.class public interface abstract Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread$OnRecvSppDataListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnRecvSppDataListener"
.end annotation


# virtual methods
.method public abstract onRecvSppData(JLandroid/bluetooth/BluetoothDevice;[B)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "threadID",
            "device",
            "data"
        }
    .end annotation
.end method

.method public abstract onThreadStart(J)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "threadID"
        }
    .end annotation
.end method

.method public abstract onThreadStop(JILandroid/bluetooth/BluetoothDevice;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "threadID",
            "reason",
            "device"
        }
    .end annotation
.end method
