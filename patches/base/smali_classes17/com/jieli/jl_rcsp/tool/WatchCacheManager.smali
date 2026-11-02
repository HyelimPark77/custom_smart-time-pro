.class public Lcom/jieli/jl_rcsp/tool/WatchCacheManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public getWatchCache(Ljava/lang/String;)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    return-object p1
.end method

.method public getWatchCacheByDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->getWatchCache(Ljava/lang/String;)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    move-result-object p1

    return-object p1
.end method

.method public isNeedCheckReadData(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->getWatchCacheByDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->isNeedCheckReadData()Z

    move-result p1

    return p1
.end method

.method public putWatchCache(Ljava/lang/String;Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public putWatchCacheByDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->putWatchCache(Ljava/lang/String;Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;)V

    return-void
.end method

.method public removeWatchCache(Ljava/lang/String;)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    return-object p1
.end method

.method public removeWatchCacheByDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->removeWatchCache(Ljava/lang/String;)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    move-result-object p1

    return-object p1
.end method
