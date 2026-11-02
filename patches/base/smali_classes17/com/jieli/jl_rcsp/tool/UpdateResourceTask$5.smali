.class Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$5;
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
        "Ljava/util/ArrayList<",
        "Lcom/jieli/jl_fatfs/model/FatFile;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$5;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$5;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$5;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;I)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$5;->onSuccess(Ljava/util/ArrayList;)V

    return-void
.end method

.method public onSuccess(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$5;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$5;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Ljava/lang/String;)V

    return-void
.end method
