.class Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Ljava/util/ArrayList;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$3;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFailed ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "hasEnoughSpace"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$3;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Lcom/jieli/jl_rcsp/model/base/BaseError;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$3;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Long;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$3;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;J)J

    .line 3
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSuccess ---> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$3;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "hasEnoughSpace"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$3;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$3;->onSuccess(Ljava/lang/Long;)V

    return-void
.end method
