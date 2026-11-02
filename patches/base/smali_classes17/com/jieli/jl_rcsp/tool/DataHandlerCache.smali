.class public Lcom/jieli/jl_rcsp/tool/DataHandlerCache;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile c:Lcom/jieli/jl_rcsp/tool/DataHandlerCache;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
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

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->b:Ljava/util/List;

    return-void
.end method

.method public static getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;
    .locals 2

    sget-object v0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->c:Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    if-nez v0, :cond_1

    const-class v0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->c:Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    if-nez v1, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;-><init>()V

    sput-object v1, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->c:Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->c:Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->a:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;->release()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public addDataHandler(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;)V
    .locals 2

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->a:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->a:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public destroy()V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->a()V

    const/4 v0, 0x0

    sput-object v0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->c:Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    return-void
.end method

.method public getDataHandler(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->a:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;

    return-object p1
.end method

.method public getDeviceList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->b:Ljava/util/List;

    return-object v0
.end method

.method public removeDataHandler(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->a:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;->release()V

    :cond_1
    :goto_0
    return-void
.end method
