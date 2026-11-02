.class Lcom/jieli/bluetooth_connect/impl/BluetoothManager$1;
.super Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothManager;-><init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;


# direct methods
.method public constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onDelete(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "record"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onHistoryRecordChange(ILcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    return-void
.end method

.method public onInsert(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "record"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onHistoryRecordChange(ILcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    return-void
.end method

.method public onModify(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "record"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onHistoryRecordChange(ILcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    return-void
.end method
