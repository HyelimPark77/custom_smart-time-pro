.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->deleteWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
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
.field public final synthetic a:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

.field public final synthetic b:Lcom/jieli/jl_filebrowse/bean/FileStruct;

.field public final synthetic c:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

.field public final synthetic d:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;->d:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;->a:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;->b:Lcom/jieli/jl_filebrowse/bean/FileStruct;

    iput-object p4, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;->c:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;->c:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;->d:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;->a:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;->b:Lcom/jieli/jl_filebrowse/bean/FileStruct;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;->c:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    invoke-static {p1, v0, v1, v2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$6;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
