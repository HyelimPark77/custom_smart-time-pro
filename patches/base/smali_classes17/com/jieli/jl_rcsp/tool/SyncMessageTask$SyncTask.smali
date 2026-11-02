.class public Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/tool/SyncMessageTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SyncTask"
.end annotation


# instance fields
.field public final a:I

.field public final b:Lcom/jieli/jl_rcsp/model/NotificationMsg;

.field public final c:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->a:I

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->b:Lcom/jieli/jl_rcsp/model/NotificationMsg;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    return-void
.end method


# virtual methods
.method public getCallback()Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    return-object v0
.end method

.method public getMessage()Lcom/jieli/jl_rcsp/model/NotificationMsg;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->b:Lcom/jieli/jl_rcsp/model/NotificationMsg;

    return-object v0
.end method

.method public getTaskOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SyncTask{taskOp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->b:Lcom/jieli/jl_rcsp/model/NotificationMsg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
