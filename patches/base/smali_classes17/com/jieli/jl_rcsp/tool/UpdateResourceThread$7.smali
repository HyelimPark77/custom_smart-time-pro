.class Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(ILjava/lang/String;Z)V
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
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;->c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    iput p2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;->a:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;->c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 2

    .line 2
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;->a:I

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;->b:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$7;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
