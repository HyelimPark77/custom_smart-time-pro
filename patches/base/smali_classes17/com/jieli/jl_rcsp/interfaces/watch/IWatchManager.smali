.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;


# virtual methods
.method public abstract destroy()V
.end method

.method public abstract getCallback()Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;
.end method

.method public abstract getRcspOp()Lcom/jieli/jl_rcsp/interfaces/rcsp/IRcspOp;
.end method

.method public abstract getWatchFileByPath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;
.end method

.method public abstract init()V
.end method

.method public abstract isInit()Z
.end method

.method public abstract isSysException()Z
.end method

.method public abstract sendWriteProtectFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method
