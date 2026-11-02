.class abstract Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "BtEventCbImpl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract onCallback(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V
.end method
