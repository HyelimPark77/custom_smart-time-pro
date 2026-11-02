.class public interface abstract Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onFailed(ILjava/lang/String;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "code",
            "message"
        }
    .end annotation
.end method

.method public abstract onSuccess(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "record"
        }
    .end annotation
.end method
