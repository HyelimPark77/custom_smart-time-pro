.class Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BtEventCbRunnable"
.end annotation


# instance fields
.field private final mBtEventCb:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;

.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;


# direct methods
.method private constructor <init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            null,
            null
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;->mBtEventCb:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;->mBtEventCb:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->access$200(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    invoke-static {v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->access$200(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbRunnable;->mBtEventCb:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;

    invoke-virtual {v2, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;->onCallback(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
