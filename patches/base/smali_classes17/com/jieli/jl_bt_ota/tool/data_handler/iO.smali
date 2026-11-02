.class public final synthetic Lcom/jieli/jl_bt_ota/tool/data_handler/iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic I1:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

.field public final synthetic IO:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

.field public final synthetic iX1O1:Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/iO;->IO:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/iO;->I1:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    iput-object p3, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/iO;->iX1O1:Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/iO;->IO:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/iO;->I1:Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/iO;->iX1O1:Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->OXO1(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method
