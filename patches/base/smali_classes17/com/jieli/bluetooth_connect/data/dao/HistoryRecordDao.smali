.class public interface abstract Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract addHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .annotation build Landroidx/room/Insert;
        entity = Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "historyRecord"
        }
    .end annotation
.end method

.method public abstract getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM HistoryRecord WHERE address LIKE :devAddress OR mapped_address LIKE :devAddress OR update_address LIKE :devAddress ORDER BY online_time DESC LIMIT 1"
    .end annotation

    .annotation build Landroidx/room/Transaction;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "devAddress"
        }
    .end annotation
.end method

.method public abstract getHistoryRecordList()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM HistoryRecord ORDER BY online_time DESC"
    .end annotation

    .annotation build Landroidx/room/Transaction;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;"
        }
    .end annotation
.end method

.method public abstract removeHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .annotation build Landroidx/room/Delete;
        entity = Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "historyRecord"
        }
    .end annotation
.end method

.method public abstract removeHistoryRecords(Ljava/util/List;)V
    .annotation build Landroidx/room/Delete;
        entity = Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "list"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .annotation build Landroidx/room/Transaction;
    .end annotation

    .annotation build Landroidx/room/Update;
        entity = Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "record"
        }
    .end annotation
.end method

.method public abstract updateHistoryRecords(Ljava/util/List;)V
    .annotation build Landroidx/room/Update;
        entity = Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "records"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;)V"
        }
    .end annotation
.end method
