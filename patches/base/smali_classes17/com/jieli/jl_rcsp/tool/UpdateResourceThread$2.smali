.class Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->h()V
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
.field public final synthetic a:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$2;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$2;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;Z)Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$2;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;Lcom/jieli/jl_rcsp/model/base/BaseError;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$2;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$2;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;Z)Z

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$2;->a:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$2;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
