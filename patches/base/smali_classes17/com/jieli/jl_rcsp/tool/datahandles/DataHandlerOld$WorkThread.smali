.class public Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "WorkThread"
.end annotation


# static fields
.field public static final c:I = 0x1

.field public static final d:I = 0x2


# instance fields
.field public a:Landroid/os/Handler;

.field public final synthetic b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    const/16 p1, 0xa

    invoke-direct {p0, p2, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public getWorkHandler()Landroid/os/Handler;
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget v1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/jieli/jl_rcsp/model/DataInfo;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    move-result-object v1

    if-eqz v1, :cond_3

    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->tryToAddRecvData(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    goto :goto_0

    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/jieli/jl_rcsp/model/DataInfo;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->b:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->tryToAddSendData(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    :cond_3
    :goto_0
    return v0
.end method

.method public onLooperPrepared()V
    .locals 2

    invoke-super {p0}, Landroid/os/HandlerThread;->onLooperPrepared()V

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    return-void
.end method

.method public tryToAddRecvData(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public tryToAddSendData(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->what:I

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->a:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
