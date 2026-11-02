.class public final synthetic Lcom/jieli/jl_bt_ota/tool/data_handler/O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic I1:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

.field public final synthetic IO:Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/O00;->IO:Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/O00;->I1:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/O00;->IO:Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/O00;->I1:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    invoke-static {v0, v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->iO(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void
.end method
