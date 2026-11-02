.class public final synthetic Lcom/jieli/jl_rcsp/watch/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic I1:I

.field public final synthetic IO:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/OXO1;->IO:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;

    iput p2, p0, Lcom/jieli/jl_rcsp/watch/OXO1;->I1:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/OXO1;->IO:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;

    iget v1, p0, Lcom/jieli/jl_rcsp/watch/OXO1;->I1:I

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->a(I)V

    return-void
.end method
