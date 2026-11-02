.class public interface abstract Lcom/jieli/jl_filebrowse/interfaces/FileObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract OnFlayCallback(Z)V
.end method

.method public abstract onFileReadFailed(I)V
.end method

.method public abstract onFileReadStart()V
.end method

.method public abstract onFileReadStop(Z)V
.end method

.method public abstract onFileReceiver(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onSdCardStatusChange(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)V"
        }
    .end annotation
.end method
