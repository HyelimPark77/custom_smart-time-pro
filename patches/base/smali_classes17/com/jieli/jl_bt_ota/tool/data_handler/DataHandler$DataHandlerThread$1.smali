.class Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$ThreadStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread$1;->a:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinish(J)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread$1;->a:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;)Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread$1;->a:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;)Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread$1;->a:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;)Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;

    :cond_0
    return-void
.end method

.method public onStart(J)V
    .locals 0

    return-void
.end method
