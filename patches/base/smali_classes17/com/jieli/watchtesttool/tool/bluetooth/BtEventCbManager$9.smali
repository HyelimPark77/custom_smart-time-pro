.class Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$9;
.super Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

.field final synthetic val$error:Lcom/jieli/bluetooth_connect/bean/ErrorInfo;


# direct methods
.method public constructor <init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$9;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    iput-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$9;->val$error:Lcom/jieli/bluetooth_connect/bean/ErrorInfo;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$1;)V

    return-void
.end method


# virtual methods
.method public onCallback(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$9;->val$error:Lcom/jieli/bluetooth_connect/bean/ErrorInfo;

    invoke-virtual {p1, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;->onError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    return-void
.end method
