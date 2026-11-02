.class Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->sendWriteFlag(Landroid/bluetooth/BluetoothDevice;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$2;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$2;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$2;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$2;->a:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 2

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$2;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$2;->a:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$2;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
