.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/FileObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$9;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OnFlayCallback(Z)V
    .locals 0

    return-void
.end method

.method public onFileReadFailed(I)V
    .locals 0

    return-void
.end method

.method public onFileReadStart()V
    .locals 0

    return-void
.end method

.method public onFileReadStop(Z)V
    .locals 0

    return-void
.end method

.method public onFileReceiver(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onSdCardStatusChange(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$9;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->v(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    return-void
.end method
