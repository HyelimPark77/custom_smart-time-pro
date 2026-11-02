.class Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->e()V
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
.field public final synthetic a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$4;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$4;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;I)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 0

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$4;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->d(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$4;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
