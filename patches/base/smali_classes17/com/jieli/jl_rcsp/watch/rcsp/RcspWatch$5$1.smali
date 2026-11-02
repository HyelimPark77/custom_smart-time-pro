.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->onSuccess(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinish(J)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->c:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->b(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->c:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->b(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->c:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    :cond_0
    return-void
.end method

.method public onStart(J)V
    .locals 0

    return-void
.end method
