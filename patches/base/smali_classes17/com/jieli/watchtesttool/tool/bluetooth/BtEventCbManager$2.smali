.class Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$2;
.super Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onBtDiscoveryStatus(ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

.field final synthetic val$bBle:Z

.field final synthetic val$bStart:Z


# direct methods
.method public constructor <init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$2;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    iput-boolean p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$2;->val$bBle:Z

    iput-boolean p3, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$2;->val$bStart:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$1;)V

    return-void
.end method


# virtual methods
.method public onCallback(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V
    .locals 2

    iget-boolean v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$2;->val$bBle:Z

    iget-boolean v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$2;->val$bStart:Z

    invoke-virtual {p1, v0, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;->onBtDiscoveryStatus(ZZ)V

    return-void
.end method
